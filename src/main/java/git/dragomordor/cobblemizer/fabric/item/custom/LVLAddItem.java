package git.dragomordor.cobblemizer.fabric.item.custom;

import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokemon.Pokemon;
import git.dragomordor.cobblemizer.fabric.config.CobblemizerConfig;
import git.dragomordor.cobblemizer.fabric.misc.TierRarityClass;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;

public class LVLAddItem extends PokemonUseItem{
    private final String tier;

    public LVLAddItem(String tier) {
        super(new Item.Settings().maxCount(1));
        this.tier = tier;
    }

    @Override
    public ActionResult processInteraction(ItemStack itemStack, PlayerEntity player, PokemonEntity target, Pokemon pokemon) {
        CobblemizerConfig config = CobblemizerConfig.Builder.load();
        int maxLevel = 100; // Maximum level
        int currentLevel = pokemon.getLevel(); // Current level
        // Get the increaseAmount from the config based on the provided tier
        int increaseAmount = getIncreaseAmountForTier(config, tier);
        // Modify the Pokémon's friendship by the obtained increaseAmount
        int newLevel = Math.min(currentLevel + increaseAmount, maxLevel);
        int actualIncrease = newLevel - currentLevel;

        if (actualIncrease <= 0) { // If Level is already at max, return fail
            player.sendMessage(Text.of("Level is already at maximum"));
            return ActionResult.FAIL;
        }

        // if Level not max, increase by tier amount
        pokemon.setLevel(currentLevel+actualIncrease);
        player.sendMessage(Text.of("Increased Pokémon's Level by " + actualIncrease));
        if (newLevel == maxLevel) { // if new Level amount is maxed, indicate to player
            player.sendMessage(Text.of("Pokémon's Level is now at maximum"));
        }
        itemStack.decrement(1); // remove item after use
        return ActionResult.SUCCESS;
    }

    // Method to get the increaseAmount from the config based on the provided tier
    private int getIncreaseAmountForTier(CobblemizerConfig config, String tierName) {
        for (TierRarityClass tier : config.friendshipTiers) {
            if (tier.name.equalsIgnoreCase(tierName)) {
                return tier.increaseAmount;
            }
        }
        return 0; // Default value if tierName not found in config
    }
}
