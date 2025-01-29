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

public class FriendshipAddItem extends PokemonUseItem{
    private final String tier;

    public FriendshipAddItem(String tier) {
        super(new Item.Settings().maxCount(1));
        this.tier = tier;
    }

    @Override
    public ActionResult processInteraction(ItemStack itemStack, PlayerEntity player, PokemonEntity target, Pokemon pokemon) {
        CobblemizerConfig config = CobblemizerConfig.Builder.load();
        int maxFriendship = 255; // Maximum friendship value
        int currentFriendship = pokemon.getFriendship(); // Current friendship value
        // Get the increaseAmount from the config based on the provided tier
        int increaseAmount = getIncreaseAmountForTier(config, tier);
        // Modify the Pokémon's friendship by the obtained increaseAmount
        int newFriendship = Math.min(currentFriendship + increaseAmount, maxFriendship);
        int actualIncrease = newFriendship - currentFriendship;
        boolean increasedFriendship = pokemon.incrementFriendship(actualIncrease, false);

        if (!increasedFriendship || actualIncrease==0) { // fail if friendship is at max already
            // If friendship is already at max, return fail
            player.sendMessage(Text.of("Pokémon's friendship is already at max"));
            return ActionResult.FAIL;
        }

        player.sendMessage(Text.of("Increased Pokémon's friendship by " + actualIncrease));
        if (newFriendship == maxFriendship) {
            player.sendMessage(Text.of("Pokémon's friendship is now at max"));
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
