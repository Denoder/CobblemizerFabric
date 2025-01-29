package git.dragomordor.cobblemizer.fabric.item.custom;

import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokemon.Gender;
import com.cobblemon.mod.common.pokemon.Pokemon;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;

public class GenderSwapItem extends PokemonUseItem {
    public GenderSwapItem() { 
        super(new Item.Settings().maxCount(1));
    }

    @Override
    public ActionResult processInteraction(ItemStack itemStack, PlayerEntity player, PokemonEntity target, Pokemon pokemon) {

        Gender gender = pokemon.getGender();
        // if gender is genderless, it cannot swap
        if (gender == Gender.GENDERLESS) {
            player.sendMessage(Text.of("Cannot change gender of gender unknown Pokémon"));
            return ActionResult.FAIL;
        }

        // swap male -> female and female -> male
        if (gender == Gender.MALE) {
            Gender newGender = Gender.FEMALE;
            pokemon.setGender(newGender);
            String genderName = newGender.name().toLowerCase(); // Get the lowercase gender name
            String formattedGender = Character.toUpperCase(genderName.charAt(0)) + genderName.substring(1); // Convert to title case
            player.sendMessage(Text.of("The Pokémon's gender has been changed to "+formattedGender));
        } else if (gender == Gender.FEMALE) {
            Gender newGender = Gender.MALE;
            pokemon.setGender(newGender);
            String genderName = newGender.name().toLowerCase(); // Get the lowercase gender name
            String formattedGender = Character.toUpperCase(genderName.charAt(0)) + genderName.substring(1); // Convert to title case
            player.sendMessage(Text.of("The Pokémon's gender has been changed to "+formattedGender));
        }

        itemStack.decrement(1); // remove item after use
        return ActionResult.SUCCESS;
    }
}
