package git.dragomordor.cobblemizer.fabric.item.custom;

import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokemon.Nature;
import com.cobblemon.mod.common.pokemon.Pokemon;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;

import java.util.HashMap;
import java.util.Map;

public class NatureChangerItem extends  PokemonUseItem{
    private final Nature nature;

    public NatureChangerItem(Nature nature) {
        super(new Item.Settings().maxCount(1));
        this.nature = nature;
    }

    @Override
    public ActionResult processInteraction(ItemStack itemStack, PlayerEntity player, PokemonEntity target, Pokemon pokemon) {

        // temporary solution to get names as Natures does not seem to have good getName or getDisplay name for java
        Map<String, String> natureDisplayNames = new HashMap<>();
        natureDisplayNames.put("cobblemon.nature.hardy", "Hardy");
        natureDisplayNames.put("cobblemon.nature.lonely", "Lonely");
        natureDisplayNames.put("cobblemon.nature.adamant", "Adamant");
        natureDisplayNames.put("cobblemon.nature.naughty", "Naughty");
        natureDisplayNames.put("cobblemon.nature.brave", "Brave");
        natureDisplayNames.put("cobblemon.nature.bold", "Bold");
        natureDisplayNames.put("cobblemon.nature.docile", "Docile");
        natureDisplayNames.put("cobblemon.nature.impish", "Impish");
        natureDisplayNames.put("cobblemon.nature.lax", "Lax");
        natureDisplayNames.put("cobblemon.nature.relaxed", "Relaxed");
        natureDisplayNames.put("cobblemon.nature.modest", "Modest");
        natureDisplayNames.put("cobblemon.nature.mild", "Mild");
        natureDisplayNames.put("cobblemon.nature.bashful", "Bashful");
        natureDisplayNames.put("cobblemon.nature.rash", "Rash");
        natureDisplayNames.put("cobblemon.nature.quiet", "Quiet");
        natureDisplayNames.put("cobblemon.nature.calm", "Calm");
        natureDisplayNames.put("cobblemon.nature.gentle", "Gentle");
        natureDisplayNames.put("cobblemon.nature.careful", "Careful");
        natureDisplayNames.put("cobblemon.nature.quirky", "Quirky");
        natureDisplayNames.put("cobblemon.nature.sassy", "Sassy");
        natureDisplayNames.put("cobblemon.nature.timid", "Timid");
        natureDisplayNames.put("cobblemon.nature.hasty", "Hasty");
        natureDisplayNames.put("cobblemon.nature.jolly", "Jolly");
        natureDisplayNames.put("cobblemon.nature.naive", "Naive");
        natureDisplayNames.put("cobblemon.nature.serious", "Serious");

        Nature currentNature = pokemon.getNature(); // get current pokemon nature

       // same nature is failed
       if (currentNature == nature) {
           player.sendMessage(Text.of("Pokémon is already " + natureDisplayNames.get(nature.getDisplayName())));
           return ActionResult.FAIL;
       }

       // change nature
        pokemon.setNature(nature);
        player.sendMessage(Text.of("Pokémon is now "+ natureDisplayNames.get(nature.getDisplayName())));
        itemStack.decrement(1); // remove item after use
        return ActionResult.SUCCESS;
    }
}
