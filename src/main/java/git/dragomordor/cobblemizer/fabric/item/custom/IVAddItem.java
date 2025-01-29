package git.dragomordor.cobblemizer.fabric.item.custom;

import com.cobblemon.mod.common.api.pokemon.stats.Stat;
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokemon.IVs;
import com.cobblemon.mod.common.pokemon.Pokemon;
import git.dragomordor.cobblemizer.fabric.config.CobblemizerConfig;
import git.dragomordor.cobblemizer.fabric.misc.TierRarityClass;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;

public class IVAddItem extends PokemonUseItem {
    private final String tier;
    private final Stat statToBoost;

    public IVAddItem(String tier, Stat statToBoost) {
        super(new Item.Settings().maxCount(1));
        this.tier = tier;
        this.statToBoost = statToBoost;
    }

    @Override
    public ActionResult processInteraction(ItemStack itemStack, PlayerEntity player, PokemonEntity target, Pokemon pokemon) {
        CobblemizerConfig config = CobblemizerConfig.Builder.load();
        int maxIV = IVs.MAX_VALUE; // Maximum IV value
        IVs IVs = pokemon.getIvs(); // Current IV values
        // Get the increaseAmount from the config based on the provided tier
        int increaseAmount = getIncreaseAmountForTier(config, tier);
        int IVcurrentAmount = IVs.get(this.statToBoost);
        // Modify the Pokémon's IV by the obtained increaseAmount
        int newIVAmount = Math.min(IVcurrentAmount + increaseAmount, maxIV);
        int actualIncrease = newIVAmount - IVcurrentAmount;

        if (actualIncrease <= 0) { // If IV is already at max, return fail
            player.sendMessage(Text.of((statToBoost.getDisplayName().getString() + " IV is already at maximum")));
            return ActionResult.FAIL;
        }

        // if IV not max, increase by tier amount
        IVs.set(statToBoost, IVcurrentAmount+actualIncrease);
        player.sendMessage(Text.of("Increased Pokémon's " + statToBoost.getDisplayName().getString() + " IV by " + actualIncrease));
        if (newIVAmount == maxIV) { // if new IV amount is maxed, indicate to player
            player.sendMessage(Text.of("Pokémon's " + statToBoost.getDisplayName().getString() + " IV is now at maximum"));
        }
        itemStack.decrement(1); // remove item after use
        return ActionResult.SUCCESS;
    }
    // Method to get the increaseAmount from the config based on the provided tier
    private int getIncreaseAmountForTier(CobblemizerConfig config, String tierName) {
        for (TierRarityClass tier : config.IVTiers) {
            if (tier.name.equalsIgnoreCase(tierName)) {
                return tier.increaseAmount;
            }
        }
        return 0; // Default value if tierName not found in config
    }
}
