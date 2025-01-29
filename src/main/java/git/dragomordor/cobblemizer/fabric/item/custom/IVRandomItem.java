package git.dragomordor.cobblemizer.fabric.item.custom;

import com.cobblemon.mod.common.api.pokemon.stats.Stat;
import com.cobblemon.mod.common.api.pokemon.stats.Stats;
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokemon.IVs;
import com.cobblemon.mod.common.pokemon.Pokemon;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;

import java.util.Random;

public class IVRandomItem extends PokemonUseItem {
    public IVRandomItem() {
        super(new Item.Settings().maxCount(1));
    }

    @Override
    public ActionResult processInteraction(ItemStack itemStack, PlayerEntity player, PokemonEntity target, Pokemon pokemon) {
        IVs ivs = pokemon.getIvs(); // Access the IVs of the Pokémon
        Random random = new Random(); // random number generator

        // randomizes all IV stats
        for (Stat stat : Stats.values()) {
            int randomValue = random.nextInt(IVs.MAX_VALUE+1); // Generate a random value between 0 and MAX_STAT_VALUE (inclusive)
            ivs.set(stat, randomValue); // Set each IV stat to the generated random value
        }

        itemStack.decrement(1); // remove item after use
        player.sendMessage(Text.of("All IVs randomized"));
        return ActionResult.SUCCESS;
    }
}
