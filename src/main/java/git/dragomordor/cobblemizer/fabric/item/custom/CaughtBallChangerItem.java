package git.dragomordor.cobblemizer.fabric.item.custom;

import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokeball.PokeBall;
import com.cobblemon.mod.common.pokemon.Pokemon;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;

public class CaughtBallChangerItem extends PokemonUseItem {
    private final PokeBall selectedBall;

    public CaughtBallChangerItem(PokeBall selectedBall) {
        super(new Item.Settings().maxCount(1));
        this.selectedBall = selectedBall;
    }

    @Override
    public ActionResult processInteraction(ItemStack itemStack, PlayerEntity player, PokemonEntity target, Pokemon pokemon) {
        PokeBall currentball = pokemon.getCaughtBall();

        // if the current ball is the same as the changed one, stop the change
        if (currentball == selectedBall) {
            player.sendMessage(Text.of("The Pokémon has the same caught ball"));
            return ActionResult.FAIL;
        }
        // change caught ball
        pokemon.setCaughtBall(selectedBall);
        player.sendMessage(Text.of("The Pokémon's caught ball has been changed to " + selectedBall.item().getName().getString()));
        itemStack.decrement(1); // remove item after use
        return ActionResult.SUCCESS;
    }
}