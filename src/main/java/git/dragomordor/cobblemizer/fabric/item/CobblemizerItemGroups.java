package git.dragomordor.cobblemizer.fabric.item;

import git.dragomordor.cobblemizer.fabric.CobblemizerMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class CobblemizerItemGroups {

    public static final ItemGroup COBBLEMIZER_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.tryParse(CobblemizerMod.MODID + ":all_iv_maxer"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cobblemizer"))
                    .icon(() -> new ItemStack(CobblemizerItems.ALL_IV_MAXER)).entries((displayContext, entries) -> {

                        // CaughtBallChangerItem
                        entries.add(CobblemizerItems.AZURE_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.BEAST_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.CHERISH_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.CITRINE_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.DIVE_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.DREAM_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.DUSK_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.FAST_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.FRIEND_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.GREAT_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.HEAL_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.HEAVY_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.LEVEL_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.LOVE_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.LURE_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.LUXURY_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.MASTER_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.MOON_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.NEST_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.NET_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.PARK_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.POKE_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.PREMIER_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.REPEAT_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.ROSEATE_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.SAFARI_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.SLATE_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.SPORT_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.TIMER_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.ULTRA_BALL_CB_CHANGER);
                        entries.add(CobblemizerItems.VERDANT_BALL_CB_CHANGER);
                        //FriendshipAddItem
                        entries.add(CobblemizerItems.FRIENDSHIP_ADD_COMMON);
                        entries.add(CobblemizerItems.FRIENDSHIP_ADD_UNCOMMON);
                        entries.add(CobblemizerItems.FRIENDSHIP_ADD_RARE);
                        entries.add(CobblemizerItems.FRIENDSHIP_ADD_EPIC);
                        entries.add(CobblemizerItems.FRIENDSHIP_ADD_LEGENDARY);
                        entries.add(CobblemizerItems.FRIENDSHIP_ADD_MAX);
                        // EVRandom
                        entries.add(CobblemizerItems.EV_RANDOM);
                        // EVAddItem
                        entries.add(CobblemizerItems.EV_ADD_SP_DEF_COMMON);
                        entries.add(CobblemizerItems.EV_ADD_SP_DEF_UNCOMMON);
                        entries.add(CobblemizerItems.EV_ADD_SP_DEF_RARE);
                        entries.add(CobblemizerItems.EV_ADD_SP_DEF_EPIC);
                        entries.add(CobblemizerItems.EV_ADD_SP_DEF_LEGENDARY);
                        entries.add(CobblemizerItems.EV_ADD_SP_DEF_MAX);
                        entries.add(CobblemizerItems.EV_ADD_SP_ATK_COMMON);
                        entries.add(CobblemizerItems.EV_ADD_SP_ATK_UNCOMMON);
                        entries.add(CobblemizerItems.EV_ADD_SP_ATK_RARE);
                        entries.add(CobblemizerItems.EV_ADD_SP_ATK_EPIC);
                        entries.add(CobblemizerItems.EV_ADD_SP_ATK_LEGENDARY);
                        entries.add(CobblemizerItems.EV_ADD_SP_ATK_MAX);
                        entries.add(CobblemizerItems.EV_ADD_SPEED_COMMON);
                        entries.add(CobblemizerItems.EV_ADD_SPEED_UNCOMMON);
                        entries.add(CobblemizerItems.EV_ADD_SPEED_RARE);
                        entries.add(CobblemizerItems.EV_ADD_SPEED_EPIC);
                        entries.add(CobblemizerItems.EV_ADD_SPEED_LEGENDARY);
                        entries.add(CobblemizerItems.EV_ADD_SPEED_MAX);
                        entries.add(CobblemizerItems.EV_ADD_ATK_COMMON);
                        entries.add(CobblemizerItems.EV_ADD_ATK_UNCOMMON);
                        entries.add(CobblemizerItems.EV_ADD_ATK_RARE);
                        entries.add(CobblemizerItems.EV_ADD_ATK_EPIC);
                        entries.add(CobblemizerItems.EV_ADD_ATK_LEGENDARY);
                        entries.add(CobblemizerItems.EV_ADD_ATK_MAX);
                        entries.add(CobblemizerItems.EV_ADD_DEF_COMMON);
                        entries.add(CobblemizerItems.EV_ADD_DEF_UNCOMMON);
                        entries.add(CobblemizerItems.EV_ADD_DEF_RARE);
                        entries.add(CobblemizerItems.EV_ADD_DEF_EPIC);
                        entries.add(CobblemizerItems.EV_ADD_DEF_LEGENDARY);
                        entries.add(CobblemizerItems.EV_ADD_DEF_MAX);
                        entries.add(CobblemizerItems.EV_ADD_HP_COMMON);
                        entries.add(CobblemizerItems.EV_ADD_HP_UNCOMMON);
                        entries.add(CobblemizerItems.EV_ADD_HP_RARE);
                        entries.add(CobblemizerItems.EV_ADD_HP_EPIC);
                        entries.add(CobblemizerItems.EV_ADD_HP_LEGENDARY);
                        entries.add(CobblemizerItems.EV_ADD_HP_MAX);
                        // IVMaxer
                        entries.add(CobblemizerItems.ALL_IV_MAXER);
                        // IVRandom
                        entries.add(CobblemizerItems.IV_RANDOM);
                        // IVAddItem
                        entries.add(CobblemizerItems.IV_ADD_SP_DEF_COMMON);
                        entries.add(CobblemizerItems.IV_ADD_SP_DEF_UNCOMMON);
                        entries.add(CobblemizerItems.IV_ADD_SP_DEF_RARE);
                        entries.add(CobblemizerItems.IV_ADD_SP_DEF_EPIC);
                        entries.add(CobblemizerItems.IV_ADD_SP_DEF_LEGENDARY);
                        entries.add(CobblemizerItems.IV_ADD_SP_DEF_MAX);
                        entries.add(CobblemizerItems.IV_ADD_SP_ATK_COMMON);
                        entries.add(CobblemizerItems.IV_ADD_SP_ATK_UNCOMMON);
                        entries.add(CobblemizerItems.IV_ADD_SP_ATK_RARE);
                        entries.add(CobblemizerItems.IV_ADD_SP_ATK_EPIC);
                        entries.add(CobblemizerItems.IV_ADD_SP_ATK_LEGENDARY);
                        entries.add(CobblemizerItems.IV_ADD_SP_ATK_MAX);
                        entries.add(CobblemizerItems.IV_ADD_SPEED_COMMON);
                        entries.add(CobblemizerItems.IV_ADD_SPEED_UNCOMMON);
                        entries.add(CobblemizerItems.IV_ADD_SPEED_RARE);
                        entries.add(CobblemizerItems.IV_ADD_SPEED_EPIC);
                        entries.add(CobblemizerItems.IV_ADD_SPEED_LEGENDARY);
                        entries.add(CobblemizerItems.IV_ADD_SPEED_MAX);
                        entries.add(CobblemizerItems.IV_ADD_ATK_COMMON);
                        entries.add(CobblemizerItems.IV_ADD_ATK_UNCOMMON);
                        entries.add(CobblemizerItems.IV_ADD_ATK_RARE);
                        entries.add(CobblemizerItems.IV_ADD_ATK_EPIC);
                        entries.add(CobblemizerItems.IV_ADD_ATK_LEGENDARY);
                        entries.add(CobblemizerItems.IV_ADD_ATK_MAX);
                        entries.add(CobblemizerItems.IV_ADD_DEF_COMMON);
                        entries.add(CobblemizerItems.IV_ADD_DEF_UNCOMMON);
                        entries.add(CobblemizerItems.IV_ADD_DEF_RARE);
                        entries.add(CobblemizerItems.IV_ADD_DEF_EPIC);
                        entries.add(CobblemizerItems.IV_ADD_DEF_LEGENDARY);
                        entries.add(CobblemizerItems.IV_ADD_DEF_MAX);
                        entries.add(CobblemizerItems.IV_ADD_HP_COMMON);
                        entries.add(CobblemizerItems.IV_ADD_HP_UNCOMMON);
                        entries.add(CobblemizerItems.IV_ADD_HP_RARE);
                        entries.add(CobblemizerItems.IV_ADD_HP_EPIC);
                        entries.add(CobblemizerItems.IV_ADD_HP_LEGENDARY);
                        entries.add(CobblemizerItems.IV_ADD_HP_MAX);
                        // LVLAddItem
                        entries.add(CobblemizerItems.LVL_ADD_COMMON);
                        entries.add(CobblemizerItems.LVL_ADD_UNCOMMON);
                        entries.add(CobblemizerItems.LVL_ADD_RARE);
                        entries.add(CobblemizerItems.LVL_ADD_EPIC);
                        entries.add(CobblemizerItems.LVL_ADD_LEGENDARY);
                        entries.add(CobblemizerItems.LVL_ADD_MAX);
                        // LVLRandom
                        entries.add(CobblemizerItems.LVL_RANDOM);
                        // NatureChangerItems
                        entries.add(CobblemizerItems.NATURE_CHANGER_ADAMANT);
                        entries.add(CobblemizerItems.NATURE_CHANGER_BASHFUL);
                        entries.add(CobblemizerItems.NATURE_CHANGER_BOLD);
                        entries.add(CobblemizerItems.NATURE_CHANGER_BRAVE);
                        entries.add(CobblemizerItems.NATURE_CHANGER_CALM);
                        entries.add(CobblemizerItems.NATURE_CHANGER_CAREFUL);
                        entries.add(CobblemizerItems.NATURE_CHANGER_DOCILE);
                        entries.add(CobblemizerItems.NATURE_CHANGER_GENTLE);
                        entries.add(CobblemizerItems.NATURE_CHANGER_HARDY);
                        entries.add(CobblemizerItems.NATURE_CHANGER_HASTY);
                        entries.add(CobblemizerItems.NATURE_CHANGER_IMPISH);
                        entries.add(CobblemizerItems.NATURE_CHANGER_JOLLY);
                        entries.add(CobblemizerItems.NATURE_CHANGER_LAX);
                        entries.add(CobblemizerItems.NATURE_CHANGER_LONELY);
                        entries.add(CobblemizerItems.NATURE_CHANGER_MILD);
                        entries.add(CobblemizerItems.NATURE_CHANGER_MODEST);
                        entries.add(CobblemizerItems.NATURE_CHANGER_NAIVE);
                        entries.add(CobblemizerItems.NATURE_CHANGER_NAUGHTY);
                        entries.add(CobblemizerItems.NATURE_CHANGER_QUIET);
                        entries.add(CobblemizerItems.NATURE_CHANGER_QUIRKY);
                        entries.add(CobblemizerItems.NATURE_CHANGER_RASH);
                        entries.add(CobblemizerItems.NATURE_CHANGER_RELAXED);
                        entries.add(CobblemizerItems.NATURE_CHANGER_SASSY);
                        entries.add(CobblemizerItems.NATURE_CHANGER_SERIOUS);
                        entries.add(CobblemizerItems.NATURE_CHANGER_TIMID);
                        // GenderSwapItems
                        entries.add(CobblemizerItems.GENDER_SWAPPER);
                        // ShinySwapItems
                        entries.add(CobblemizerItems.SHINY_SWAPPER);
                    }).build());


    public static void registerItemGroups() {
        CobblemizerMod.LOGGER.info("Registering Item Groups for " + CobblemizerMod.MODID);
    }
}
