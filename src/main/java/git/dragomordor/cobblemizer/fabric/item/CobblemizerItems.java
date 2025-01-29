package git.dragomordor.cobblemizer.fabric.item;

import com.cobblemon.mod.common.api.pokeball.PokeBalls;
import com.cobblemon.mod.common.api.pokemon.Natures;
import com.cobblemon.mod.common.api.pokemon.stats.Stats;
import git.dragomordor.cobblemizer.fabric.CobblemizerMod;
import git.dragomordor.cobblemizer.fabric.item.custom.*;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CobblemizerItems {
    // register IVMaxerItems
    public static final IVMaxerItem ALL_IV_MAXER = registerIVMaxerItem("all_iv_maxer",new IVMaxerItem());
    // register IVRandomItem
    public static final IVRandomItem IV_RANDOM = registerIVRandomItem("iv_random",new IVRandomItem());
    // register EVRandomItem
    public static final EVRandomItem EV_RANDOM = registerEVRandomItem("ev_random",new EVRandomItem());
    // register LVLRandomItem
    public static final LVLRandomItem LVL_RANDOM = registerLVLRandomItem("level_random",new LVLRandomItem());
    // version 1.1.0 items
    // register GenderSwapItem
    public static final GenderSwapItem GENDER_SWAPPER = registerGenderSwapItem("gender_swapper",new GenderSwapItem());
    //ShinySwapItems
    public static final ShinySwapItem SHINY_SWAPPER = registerShinySwapItem("shiny_swapper",new ShinySwapItem());
    //CaughtBallChangerItem
            // no ancient balls in release version of cobblemon yet
    public static final CaughtBallChangerItem AZURE_BALL_CB_CHANGER = registerCaughtBallChangerItem("azure_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getAZURE_BALL()));
    public static final CaughtBallChangerItem BEAST_BALL_CB_CHANGER = registerCaughtBallChangerItem("beast_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getBEAST_BALL()));
    public static final CaughtBallChangerItem CHERISH_BALL_CB_CHANGER = registerCaughtBallChangerItem("cherish_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getCHERISH_BALL()));
    public static final CaughtBallChangerItem CITRINE_BALL_CB_CHANGER = registerCaughtBallChangerItem("citrine_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getCITRINE_BALL()));
    public static final CaughtBallChangerItem DIVE_BALL_CB_CHANGER = registerCaughtBallChangerItem("dive_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getDIVE_BALL()));
    public static final CaughtBallChangerItem DREAM_BALL_CB_CHANGER = registerCaughtBallChangerItem("dream_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getDREAM_BALL()));
    public static final CaughtBallChangerItem DUSK_BALL_CB_CHANGER = registerCaughtBallChangerItem("dusk_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getDUSK_BALL()));
    public static final CaughtBallChangerItem FAST_BALL_CB_CHANGER = registerCaughtBallChangerItem("fast_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getFAST_BALL()));
    public static final CaughtBallChangerItem FRIEND_BALL_CB_CHANGER = registerCaughtBallChangerItem("friend_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getFRIEND_BALL()));
    public static final CaughtBallChangerItem GREAT_BALL_CB_CHANGER = registerCaughtBallChangerItem("great_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getGREAT_BALL()));
    public static final CaughtBallChangerItem HEAL_BALL_CB_CHANGER = registerCaughtBallChangerItem("heal_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getHEAL_BALL()));
    public static final CaughtBallChangerItem HEAVY_BALL_CB_CHANGER = registerCaughtBallChangerItem("heavy_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getHEAVY_BALL()));
    public static final CaughtBallChangerItem LEVEL_BALL_CB_CHANGER = registerCaughtBallChangerItem("level_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getLEVEL_BALL()));
    public static final CaughtBallChangerItem LOVE_BALL_CB_CHANGER = registerCaughtBallChangerItem("love_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getLOVE_BALL()));
    public static final CaughtBallChangerItem LURE_BALL_CB_CHANGER = registerCaughtBallChangerItem("lure_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getLURE_BALL()));
    public static final CaughtBallChangerItem LUXURY_BALL_CB_CHANGER = registerCaughtBallChangerItem("luxury_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getLUXURY_BALL()));
    public static final CaughtBallChangerItem MASTER_BALL_CB_CHANGER = registerCaughtBallChangerItem("master_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getMASTER_BALL()));
    public static final CaughtBallChangerItem MOON_BALL_CB_CHANGER = registerCaughtBallChangerItem("moon_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getMOON_BALL()));
    public static final CaughtBallChangerItem NEST_BALL_CB_CHANGER = registerCaughtBallChangerItem("nest_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getNEST_BALL()));
    public static final CaughtBallChangerItem NET_BALL_CB_CHANGER = registerCaughtBallChangerItem("net_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getNET_BALL()));
    public static final CaughtBallChangerItem PARK_BALL_CB_CHANGER = registerCaughtBallChangerItem("park_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getPARK_BALL()));
    public static final CaughtBallChangerItem POKE_BALL_CB_CHANGER = registerCaughtBallChangerItem("poke_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getPOKE_BALL()));
    public static final CaughtBallChangerItem PREMIER_BALL_CB_CHANGER = registerCaughtBallChangerItem("premier_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getPREMIER_BALL()));
    public static final CaughtBallChangerItem REPEAT_BALL_CB_CHANGER = registerCaughtBallChangerItem("repeat_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getREPEAT_BALL()));
    public static final CaughtBallChangerItem ROSEATE_BALL_CB_CHANGER = registerCaughtBallChangerItem("roseate_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getROSEATE_BALL()));
    public static final CaughtBallChangerItem SAFARI_BALL_CB_CHANGER = registerCaughtBallChangerItem("safari_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getSAFARI_BALL()));
    public static final CaughtBallChangerItem SLATE_BALL_CB_CHANGER = registerCaughtBallChangerItem("slate_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getSLATE_BALL()));
    public static final CaughtBallChangerItem SPORT_BALL_CB_CHANGER = registerCaughtBallChangerItem("sport_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getSPORT_BALL()));
    public static final CaughtBallChangerItem TIMER_BALL_CB_CHANGER = registerCaughtBallChangerItem("timer_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getTIMER_BALL()));
    public static final CaughtBallChangerItem ULTRA_BALL_CB_CHANGER = registerCaughtBallChangerItem("ultra_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getULTRA_BALL()));
    public static final CaughtBallChangerItem VERDANT_BALL_CB_CHANGER = registerCaughtBallChangerItem("verdant_ball_cb_changer", new CaughtBallChangerItem(PokeBalls.INSTANCE.getVERDANT_BALL()));
    // FriendshipAddItem
    public static final FriendshipAddItem FRIENDSHIP_ADD_COMMON = registerFriendshipAddItem("friendship_add_common", new FriendshipAddItem("COMMON"));
    public static final FriendshipAddItem FRIENDSHIP_ADD_UNCOMMON = registerFriendshipAddItem("friendship_add_uncommon", new FriendshipAddItem("UNCOMMON"));
    public static final FriendshipAddItem FRIENDSHIP_ADD_RARE = registerFriendshipAddItem("friendship_add_rare", new FriendshipAddItem("RARE"));
    public static final FriendshipAddItem FRIENDSHIP_ADD_EPIC = registerFriendshipAddItem("friendship_add_epic", new FriendshipAddItem("EPIC"));
    public static final FriendshipAddItem FRIENDSHIP_ADD_LEGENDARY = registerFriendshipAddItem("friendship_add_legendary", new FriendshipAddItem("LEGENDARY"));
    public static final FriendshipAddItem FRIENDSHIP_ADD_MAX = registerFriendshipAddItem("friendship_add_max", new FriendshipAddItem("MAX"));
    // EVAddItem
    public static final EVAddItem EV_ADD_SP_DEF_COMMON = registerEVAddItem("ev_add_sp_def_common", new EVAddItem("COMMON", Stats.SPECIAL_DEFENCE));
    public static final EVAddItem EV_ADD_SP_DEF_UNCOMMON = registerEVAddItem("ev_add_sp_def_uncommon", new EVAddItem("UNCOMMON", Stats.SPECIAL_DEFENCE));
    public static final EVAddItem EV_ADD_SP_DEF_RARE = registerEVAddItem("ev_add_sp_def_rare", new EVAddItem("RARE", Stats.SPECIAL_DEFENCE));
    public static final EVAddItem EV_ADD_SP_DEF_EPIC = registerEVAddItem("ev_add_sp_def_epic", new EVAddItem("EPIC", Stats.SPECIAL_DEFENCE));
    public static final EVAddItem EV_ADD_SP_DEF_LEGENDARY = registerEVAddItem("ev_add_sp_def_legendary", new EVAddItem("LEGENDARY", Stats.SPECIAL_DEFENCE));
    public static final EVAddItem EV_ADD_SP_DEF_MAX = registerEVAddItem("ev_add_sp_def_max", new EVAddItem("MAX", Stats.SPECIAL_DEFENCE));
    public static final EVAddItem EV_ADD_SP_ATK_COMMON = registerEVAddItem("ev_add_sp_atk_common", new EVAddItem("COMMON", Stats.SPECIAL_ATTACK));
    public static final EVAddItem EV_ADD_SP_ATK_UNCOMMON = registerEVAddItem("ev_add_sp_atk_uncommon", new EVAddItem("UNCOMMON", Stats.SPECIAL_ATTACK));
    public static final EVAddItem EV_ADD_SP_ATK_RARE = registerEVAddItem("ev_add_sp_atk_rare", new EVAddItem("RARE", Stats.SPECIAL_ATTACK));
    public static final EVAddItem EV_ADD_SP_ATK_EPIC = registerEVAddItem("ev_add_sp_atk_epic", new EVAddItem("EPIC", Stats.SPECIAL_ATTACK));
    public static final EVAddItem EV_ADD_SP_ATK_LEGENDARY = registerEVAddItem("ev_add_sp_atk_legendary", new EVAddItem("LEGENDARY", Stats.SPECIAL_ATTACK));
    public static final EVAddItem EV_ADD_SP_ATK_MAX = registerEVAddItem("ev_add_sp_atk_max", new EVAddItem("MAX", Stats.SPECIAL_ATTACK));
    public static final EVAddItem EV_ADD_SPEED_COMMON = registerEVAddItem("ev_add_speed_common", new EVAddItem("COMMON", Stats.SPEED));
    public static final EVAddItem EV_ADD_SPEED_UNCOMMON = registerEVAddItem("ev_add_speed_uncommon", new EVAddItem("UNCOMMON", Stats.SPEED));
    public static final EVAddItem EV_ADD_SPEED_RARE = registerEVAddItem("ev_add_speed_rare", new EVAddItem("RARE", Stats.SPEED));
    public static final EVAddItem EV_ADD_SPEED_EPIC = registerEVAddItem("ev_add_speed_epic", new EVAddItem("EPIC", Stats.SPEED));
    public static final EVAddItem EV_ADD_SPEED_LEGENDARY = registerEVAddItem("ev_add_speed_legendary", new EVAddItem("LEGENDARY", Stats.SPEED));
    public static final EVAddItem EV_ADD_SPEED_MAX = registerEVAddItem("ev_add_speed_max", new EVAddItem("MAX", Stats.SPEED));
    public static final EVAddItem EV_ADD_ATK_COMMON = registerEVAddItem("ev_add_atk_common", new EVAddItem("COMMON", Stats.ATTACK));
    public static final EVAddItem EV_ADD_ATK_UNCOMMON = registerEVAddItem("ev_add_atk_uncommon", new EVAddItem("UNCOMMON", Stats.ATTACK));
    public static final EVAddItem EV_ADD_ATK_RARE = registerEVAddItem("ev_add_atk_rare", new EVAddItem("RARE", Stats.ATTACK));
    public static final EVAddItem EV_ADD_ATK_EPIC = registerEVAddItem("ev_add_atk_epic", new EVAddItem("EPIC", Stats.ATTACK));
    public static final EVAddItem EV_ADD_ATK_LEGENDARY = registerEVAddItem("ev_add_atk_legendary", new EVAddItem("LEGENDARY", Stats.ATTACK));
    public static final EVAddItem EV_ADD_ATK_MAX = registerEVAddItem("ev_add_atk_max", new EVAddItem("MAX", Stats.ATTACK));
    public static final EVAddItem EV_ADD_DEF_COMMON = registerEVAddItem("ev_add_def_common", new EVAddItem("COMMON", Stats.DEFENCE));
    public static final EVAddItem EV_ADD_DEF_UNCOMMON = registerEVAddItem("ev_add_def_uncommon", new EVAddItem("UNCOMMON", Stats.DEFENCE));
    public static final EVAddItem EV_ADD_DEF_RARE = registerEVAddItem("ev_add_def_rare", new EVAddItem("RARE", Stats.DEFENCE));
    public static final EVAddItem EV_ADD_DEF_EPIC = registerEVAddItem("ev_add_def_epic", new EVAddItem("EPIC", Stats.DEFENCE));
    public static final EVAddItem EV_ADD_DEF_LEGENDARY = registerEVAddItem("ev_add_def_legendary", new EVAddItem("LEGENDARY", Stats.DEFENCE));
    public static final EVAddItem EV_ADD_DEF_MAX = registerEVAddItem("ev_add_def_max", new EVAddItem("MAX", Stats.DEFENCE));
    public static final EVAddItem EV_ADD_HP_COMMON = registerEVAddItem("ev_add_hp_common", new EVAddItem("COMMON", Stats.HP));
    public static final EVAddItem EV_ADD_HP_UNCOMMON = registerEVAddItem("ev_add_hp_uncommon", new EVAddItem("UNCOMMON", Stats.HP));
    public static final EVAddItem EV_ADD_HP_RARE = registerEVAddItem("ev_add_hp_rare", new EVAddItem("RARE", Stats.HP));
    public static final EVAddItem EV_ADD_HP_EPIC = registerEVAddItem("ev_add_hp_epic", new EVAddItem("EPIC", Stats.HP));
    public static final EVAddItem EV_ADD_HP_LEGENDARY = registerEVAddItem("ev_add_hp_legendary", new EVAddItem("LEGENDARY", Stats.HP));
    public static final EVAddItem EV_ADD_HP_MAX = registerEVAddItem("ev_add_hp_max", new EVAddItem("MAX", Stats.HP));
    // IVAddItem
    public static final IVAddItem IV_ADD_SP_DEF_COMMON = registerIVAddItem("iv_add_sp_def_common", new IVAddItem("COMMON", Stats.SPECIAL_DEFENCE));
    public static final IVAddItem IV_ADD_SP_DEF_UNCOMMON = registerIVAddItem("iv_add_sp_def_uncommon", new IVAddItem("UNCOMMON", Stats.SPECIAL_DEFENCE));
    public static final IVAddItem IV_ADD_SP_DEF_RARE = registerIVAddItem("iv_add_sp_def_rare", new IVAddItem("RARE", Stats.SPECIAL_DEFENCE));
    public static final IVAddItem IV_ADD_SP_DEF_EPIC = registerIVAddItem("iv_add_sp_def_epic", new IVAddItem("EPIC", Stats.SPECIAL_DEFENCE));
    public static final IVAddItem IV_ADD_SP_DEF_LEGENDARY = registerIVAddItem("iv_add_sp_def_legendary", new IVAddItem("LEGENDARY", Stats.SPECIAL_DEFENCE));
    public static final IVAddItem IV_ADD_SP_DEF_MAX = registerIVAddItem("iv_add_sp_def_max", new IVAddItem("MAX", Stats.SPECIAL_DEFENCE));
    public static final IVAddItem IV_ADD_SP_ATK_COMMON = registerIVAddItem("iv_add_sp_atk_common", new IVAddItem("COMMON", Stats.SPECIAL_ATTACK));
    public static final IVAddItem IV_ADD_SP_ATK_UNCOMMON = registerIVAddItem("iv_add_sp_atk_uncommon", new IVAddItem("UNCOMMON", Stats.SPECIAL_ATTACK));
    public static final IVAddItem IV_ADD_SP_ATK_RARE = registerIVAddItem("iv_add_sp_atk_rare", new IVAddItem("RARE", Stats.SPECIAL_ATTACK));
    public static final IVAddItem IV_ADD_SP_ATK_EPIC = registerIVAddItem("iv_add_sp_atk_epic", new IVAddItem("EPIC", Stats.SPECIAL_ATTACK));
    public static final IVAddItem IV_ADD_SP_ATK_LEGENDARY = registerIVAddItem("iv_add_sp_atk_legendary", new IVAddItem("LEGENDARY", Stats.SPECIAL_ATTACK));
    public static final IVAddItem IV_ADD_SP_ATK_MAX = registerIVAddItem("iv_add_sp_atk_max", new IVAddItem("MAX", Stats.SPECIAL_ATTACK));
    public static final IVAddItem IV_ADD_SPEED_COMMON = registerIVAddItem("iv_add_speed_common", new IVAddItem("COMMON", Stats.SPEED));
    public static final IVAddItem IV_ADD_SPEED_UNCOMMON = registerIVAddItem("iv_add_speed_uncommon", new IVAddItem("UNCOMMON", Stats.SPEED));
    public static final IVAddItem IV_ADD_SPEED_RARE = registerIVAddItem("iv_add_speed_rare", new IVAddItem("RARE", Stats.SPEED));
    public static final IVAddItem IV_ADD_SPEED_EPIC = registerIVAddItem("iv_add_speed_epic", new IVAddItem("EPIC", Stats.SPEED));
    public static final IVAddItem IV_ADD_SPEED_LEGENDARY = registerIVAddItem("iv_add_speed_legendary", new IVAddItem("LEGENDARY", Stats.SPEED));
    public static final IVAddItem IV_ADD_SPEED_MAX = registerIVAddItem("iv_add_speed_max", new IVAddItem("MAX", Stats.SPEED));
    public static final IVAddItem IV_ADD_ATK_COMMON = registerIVAddItem("iv_add_atk_common", new IVAddItem("COMMON", Stats.ATTACK));
    public static final IVAddItem IV_ADD_ATK_UNCOMMON = registerIVAddItem("iv_add_atk_uncommon", new IVAddItem("UNCOMMON", Stats.ATTACK));
    public static final IVAddItem IV_ADD_ATK_RARE = registerIVAddItem("iv_add_atk_rare", new IVAddItem("RARE", Stats.ATTACK));
    public static final IVAddItem IV_ADD_ATK_EPIC = registerIVAddItem("iv_add_atk_epic", new IVAddItem("EPIC", Stats.ATTACK));
    public static final IVAddItem IV_ADD_ATK_LEGENDARY = registerIVAddItem("iv_add_atk_legendary", new IVAddItem("LEGENDARY", Stats.ATTACK));
    public static final IVAddItem IV_ADD_ATK_MAX = registerIVAddItem("iv_add_atk_max", new IVAddItem("MAX", Stats.ATTACK));
    public static final IVAddItem IV_ADD_DEF_COMMON = registerIVAddItem("iv_add_def_common", new IVAddItem("COMMON", Stats.DEFENCE));
    public static final IVAddItem IV_ADD_DEF_UNCOMMON = registerIVAddItem("iv_add_def_uncommon", new IVAddItem("UNCOMMON", Stats.DEFENCE));
    public static final IVAddItem IV_ADD_DEF_RARE = registerIVAddItem("iv_add_def_rare", new IVAddItem("RARE", Stats.DEFENCE));
    public static final IVAddItem IV_ADD_DEF_EPIC = registerIVAddItem("iv_add_def_epic", new IVAddItem("EPIC", Stats.DEFENCE));
    public static final IVAddItem IV_ADD_DEF_LEGENDARY = registerIVAddItem("iv_add_def_legendary", new IVAddItem("LEGENDARY", Stats.DEFENCE));
    public static final IVAddItem IV_ADD_DEF_MAX = registerIVAddItem("iv_add_def_max", new IVAddItem("MAX", Stats.DEFENCE));
    public static final IVAddItem IV_ADD_HP_COMMON = registerIVAddItem("iv_add_hp_common", new IVAddItem("COMMON", Stats.HP));
    public static final IVAddItem IV_ADD_HP_UNCOMMON = registerIVAddItem("iv_add_hp_uncommon", new IVAddItem("UNCOMMON", Stats.HP));
    public static final IVAddItem IV_ADD_HP_RARE = registerIVAddItem("iv_add_hp_rare", new IVAddItem("RARE", Stats.HP));
    public static final IVAddItem IV_ADD_HP_EPIC = registerIVAddItem("iv_add_hp_epic", new IVAddItem("EPIC", Stats.HP));
    public static final IVAddItem IV_ADD_HP_LEGENDARY = registerIVAddItem("iv_add_hp_legendary", new IVAddItem("LEGENDARY", Stats.HP));
    public static final IVAddItem IV_ADD_HP_MAX = registerIVAddItem("iv_add_hp_max", new IVAddItem("MAX", Stats.HP));
    // LVLAddItem
    public static final LVLAddItem LVL_ADD_COMMON = registerLVLAddItem("lvl_add_common", new LVLAddItem("COMMON"));
    public static final LVLAddItem LVL_ADD_UNCOMMON = registerLVLAddItem("lvl_add_uncommon", new LVLAddItem("UNCOMMON"));
    public static final LVLAddItem LVL_ADD_RARE = registerLVLAddItem("lvl_add_rare", new LVLAddItem("RARE"));
    public static final LVLAddItem LVL_ADD_EPIC = registerLVLAddItem("lvl_add_epic", new LVLAddItem("EPIC"));
    public static final LVLAddItem LVL_ADD_LEGENDARY = registerLVLAddItem("lvl_add_legendary", new LVLAddItem("LEGENDARY"));
    public static final LVLAddItem LVL_ADD_MAX = registerLVLAddItem("lvl_add_max", new LVLAddItem("MAX"));
    // NatureChangerItem
    public static final NatureChangerItem NATURE_CHANGER_ADAMANT = registerNatureChangerItem("nature_changer_adamant", new NatureChangerItem(Natures.INSTANCE.getADAMANT()));
    public static final NatureChangerItem NATURE_CHANGER_BASHFUL = registerNatureChangerItem("nature_changer_bashful", new NatureChangerItem(Natures.INSTANCE.getBASHFUL()));
    public static final NatureChangerItem NATURE_CHANGER_BOLD = registerNatureChangerItem("nature_changer_bold", new NatureChangerItem(Natures.INSTANCE.getBOLD()));
    public static final NatureChangerItem NATURE_CHANGER_BRAVE = registerNatureChangerItem("nature_changer_brave", new NatureChangerItem(Natures.INSTANCE.getBRAVE()));
    public static final NatureChangerItem NATURE_CHANGER_CALM = registerNatureChangerItem("nature_changer_calm", new NatureChangerItem(Natures.INSTANCE.getCALM()));
    public static final NatureChangerItem NATURE_CHANGER_CAREFUL = registerNatureChangerItem("nature_changer_careful", new NatureChangerItem(Natures.INSTANCE.getCAREFUL()));
    public static final NatureChangerItem NATURE_CHANGER_DOCILE = registerNatureChangerItem("nature_changer_docile", new NatureChangerItem(Natures.INSTANCE.getDOCILE()));
    public static final NatureChangerItem NATURE_CHANGER_GENTLE = registerNatureChangerItem("nature_changer_gentle", new NatureChangerItem(Natures.INSTANCE.getGENTLE()));
    public static final NatureChangerItem NATURE_CHANGER_HARDY = registerNatureChangerItem("nature_changer_hardy", new NatureChangerItem(Natures.INSTANCE.getHARDY()));
    public static final NatureChangerItem NATURE_CHANGER_HASTY = registerNatureChangerItem("nature_changer_hasty", new NatureChangerItem(Natures.INSTANCE.getHASTY()));
    public static final NatureChangerItem NATURE_CHANGER_IMPISH = registerNatureChangerItem("nature_changer_impish", new NatureChangerItem(Natures.INSTANCE.getIMPISH()));
    public static final NatureChangerItem NATURE_CHANGER_JOLLY = registerNatureChangerItem("nature_changer_jolly", new NatureChangerItem(Natures.INSTANCE.getJOLLY()));
    public static final NatureChangerItem NATURE_CHANGER_LAX = registerNatureChangerItem("nature_changer_lax", new NatureChangerItem(Natures.INSTANCE.getLAX()));
    public static final NatureChangerItem NATURE_CHANGER_LONELY = registerNatureChangerItem("nature_changer_lonely", new NatureChangerItem(Natures.INSTANCE.getLONELY()));
    public static final NatureChangerItem NATURE_CHANGER_MILD = registerNatureChangerItem("nature_changer_mild", new NatureChangerItem(Natures.INSTANCE.getMILD()));
    public static final NatureChangerItem NATURE_CHANGER_MODEST = registerNatureChangerItem("nature_changer_modest", new NatureChangerItem(Natures.INSTANCE.getMODEST()));
    public static final NatureChangerItem NATURE_CHANGER_NAIVE = registerNatureChangerItem("nature_changer_naive", new NatureChangerItem(Natures.INSTANCE.getNAIVE()));
    public static final NatureChangerItem NATURE_CHANGER_NAUGHTY = registerNatureChangerItem("nature_changer_naughty", new NatureChangerItem(Natures.INSTANCE.getNAUGHTY()));
    public static final NatureChangerItem NATURE_CHANGER_QUIET = registerNatureChangerItem("nature_changer_quiet", new NatureChangerItem(Natures.INSTANCE.getQUIET()));
    public static final NatureChangerItem NATURE_CHANGER_QUIRKY = registerNatureChangerItem("nature_changer_quirky", new NatureChangerItem(Natures.INSTANCE.getQUIRKY()));
    public static final NatureChangerItem NATURE_CHANGER_RASH = registerNatureChangerItem("nature_changer_rash", new NatureChangerItem(Natures.INSTANCE.getRASH()));
    public static final NatureChangerItem NATURE_CHANGER_RELAXED = registerNatureChangerItem("nature_changer_relaxed", new NatureChangerItem(Natures.INSTANCE.getRELAXED()));
    public static final NatureChangerItem NATURE_CHANGER_SASSY = registerNatureChangerItem("nature_changer_sassy", new NatureChangerItem(Natures.INSTANCE.getSASSY()));
    public static final NatureChangerItem NATURE_CHANGER_SERIOUS = registerNatureChangerItem("nature_changer_serious", new NatureChangerItem(Natures.INSTANCE.getSERIOUS()));
    public static final NatureChangerItem NATURE_CHANGER_TIMID = registerNatureChangerItem("nature_changer_timid", new NatureChangerItem(Natures.INSTANCE.getTIMID()));

    // Helper methods to simplify item registration
    // Register vanilla minecraft item type
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.tryParse(CobblemizerMod.MODID + ":" + name),item);
    }
    // Register PokemonUse item type
    private static PokemonUseItem registerPokemonUseItem(String name, PokemonUseItem pokemonUseItem) {
        return (PokemonUseItem) Registry.register(Registries.ITEM, Identifier.tryParse(CobblemizerMod.MODID + ":" + name),pokemonUseItem);
    }
    //Register IVMaxer item type
    private static IVMaxerItem registerIVMaxerItem(String name, IVMaxerItem ivMaxerItem) {
        return (IVMaxerItem) Registry.register(Registries.ITEM, Identifier.tryParse(CobblemizerMod.MODID + ":" + name), ivMaxerItem);
    }
    // Register IVRandomizer item type
    private static IVRandomItem registerIVRandomItem(String name, IVRandomItem ivRandomItem) {
        return (IVRandomItem) Registry.register(Registries.ITEM, Identifier.tryParse(CobblemizerMod.MODID + ":" + name),ivRandomItem);
    }
    // Register EVRandom item type
    private static EVRandomItem registerEVRandomItem(String name, EVRandomItem evRandomItem) {
        return (EVRandomItem) Registry.register(Registries.ITEM, Identifier.tryParse(CobblemizerMod.MODID + ":" + name),evRandomItem);
    }
    // Register LVLRandom item type
    private static LVLRandomItem registerLVLRandomItem(String name, LVLRandomItem lvlRandomItem) {
        return (LVLRandomItem) Registry.register(Registries.ITEM, Identifier.tryParse(CobblemizerMod.MODID + ":" + name),lvlRandomItem);
    }
    // version 1.1.0 items
    // Register GenderSwapItem item type
    private static GenderSwapItem registerGenderSwapItem(String name, GenderSwapItem genderSwapItem) {
        return (GenderSwapItem) Registry.register(Registries.ITEM, Identifier.tryParse(CobblemizerMod.MODID + ":" + name),genderSwapItem);
    }
    // Register ShinySwapItem item type
    private static ShinySwapItem registerShinySwapItem(String name, ShinySwapItem shinySwapItem) {
        return (ShinySwapItem) Registry.register(Registries.ITEM, Identifier.tryParse(CobblemizerMod.MODID + ":" + name), shinySwapItem);
    }
    // Register CaightBallChanger item type
    private static CaughtBallChangerItem registerCaughtBallChangerItem(String name, CaughtBallChangerItem caughtBallChangerItem) {
        return (CaughtBallChangerItem) Registry.register(Registries.ITEM, Identifier.tryParse(CobblemizerMod.MODID + ":" + name), caughtBallChangerItem);
    }
    // Register FriendShipAdd item type
    private static FriendshipAddItem registerFriendshipAddItem(String name, FriendshipAddItem friendshipAddItem) {
        return (FriendshipAddItem) Registry.register(Registries.ITEM, Identifier.tryParse(CobblemizerMod.MODID + ":" + name), friendshipAddItem);
    }
    // Register EVAddItem item type
    private static EVAddItem registerEVAddItem(String name, EVAddItem evAddItem) {
        return (EVAddItem) Registry.register(Registries.ITEM, Identifier.tryParse(CobblemizerMod.MODID + ":" + name), evAddItem);
    }
    // Register IVAddItem item type
    private static IVAddItem registerIVAddItem(String name, IVAddItem ivAddItem) {
        return (IVAddItem) Registry.register(Registries.ITEM, Identifier.tryParse(CobblemizerMod.MODID + ":" + name), ivAddItem);
    }
    // Register LVLAddItem item type
    private static LVLAddItem registerLVLAddItem(String name, LVLAddItem lvlAddItem) {
        return (LVLAddItem) Registry.register(Registries.ITEM, Identifier.tryParse(CobblemizerMod.MODID + ":" + name), lvlAddItem);
    }
    // Register NatureChangerItem item type
    private static NatureChangerItem registerNatureChangerItem(String name, NatureChangerItem natureChangerItem) {
        return (NatureChangerItem) Registry.register(Registries.ITEM, Identifier.tryParse(CobblemizerMod.MODID + ":" + name), natureChangerItem);
    }

    // Other Functions
    // register all mod items function
    public static void registerModItems() {
        CobblemizerMod.LOGGER.info("Register Mod Items for " + CobblemizerMod.MODID) ;

        // creative mode tab entries
        CobblemizerItemGroups.registerItemGroups();
    }
}
