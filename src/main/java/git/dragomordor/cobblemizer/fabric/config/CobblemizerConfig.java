package git.dragomordor.cobblemizer.fabric.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import git.dragomordor.cobblemizer.fabric.CobblemizerMod;
import git.dragomordor.cobblemizer.fabric.config.tierconfigs.EVTierConfig;
import git.dragomordor.cobblemizer.fabric.config.tierconfigs.FriendshipTierConfig;
import git.dragomordor.cobblemizer.fabric.config.tierconfigs.IVTierConfig;
import git.dragomordor.cobblemizer.fabric.config.tierconfigs.LVLTierConfig;
import git.dragomordor.cobblemizer.fabric.misc.TierRarityClass;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class CobblemizerConfig {
    public List<TierRarityClass> friendshipTiers = new ArrayList<>();
    public List<TierRarityClass> EVTiers = new ArrayList<>();
    public List<TierRarityClass> IVTiers = new ArrayList<>();
    public List<TierRarityClass> LVLTiers = new ArrayList<>();

    public static class Builder {
        public static CobblemizerConfig load() {
            Gson gson = new GsonBuilder()
                    .disableHtmlEscaping()
                    .setPrettyPrinting()
                    .create();

            CobblemizerConfig config = new CobblemizerConfig();
            File configFile = new File("config/" + CobblemizerMod.MODID + "/" + CobblemizerMod.MODID + ".json");
            configFile.getParentFile().mkdirs();

            // Load Default Tier Configs to get default tiers and values
            FriendshipTierConfig defaultFriendshipConfig = FriendshipTierConfig.getDefaultConfig(); // FriendshipTierConfig
            EVTierConfig defaultEVConfig = EVTierConfig.getDefaultConfig(); // EVTierConfig
            IVTierConfig defaultIVConfig = IVTierConfig.getDefaultConfig(); // IVTierConfig
            LVLTierConfig defaultLVLConfig = LVLTierConfig.getDefaultConfig(); // LVLTierConfig

            if (configFile.exists()) {
                try {
                    FileReader fileReader = new FileReader(configFile);

                    config = gson.fromJson(fileReader, CobblemizerConfig.class);
                    fileReader.close();

                    // add different tiers if empty
                    // friendshipTiers
                    if (config.friendshipTiers.isEmpty()) {
                        config.friendshipTiers.addAll(defaultFriendshipConfig.getFriendshipTiers());
                        FileWriter fileWriter = new FileWriter(configFile);
                        gson.toJson(config, fileWriter);
                        fileWriter.close();
                    }
                    // EVTiers
                    if (config.EVTiers.isEmpty()) {
                        config.EVTiers.addAll(defaultEVConfig.getEVTiers());
                        FileWriter fileWriter = new FileWriter(configFile);
                        gson.toJson(config, fileWriter);
                        fileWriter.close();
                    }// IVTiers
                    if (config.IVTiers.isEmpty()) {
                        config.IVTiers.addAll(defaultIVConfig.getIVTiers());
                        FileWriter fileWriter = new FileWriter(configFile);
                        gson.toJson(config, fileWriter);
                        fileWriter.close();
                    }// LVLTiers
                    if (config.LVLTiers.isEmpty()) {
                        config.LVLTiers.addAll(defaultLVLConfig.getLVLTiers());
                        FileWriter fileWriter = new FileWriter(configFile);
                        gson.toJson(config, fileWriter);
                        fileWriter.close();
                    }


                } catch (Exception e) {
                    System.out.println("Error reading config file");
                }
            } else {
                // If the file does not exist, create it with the default values
                try {
                    // Defaults of all tiers
                    config.friendshipTiers.addAll(defaultFriendshipConfig.getFriendshipTiers()); // Friendship defaults
                    config.EVTiers.addAll(defaultEVConfig.getEVTiers()); // EV defaults
                    config.IVTiers.addAll(defaultIVConfig.getIVTiers()); // IV defaults
                    config.LVLTiers.addAll(defaultLVLConfig.getLVLTiers()); // LVL defaults

                    FileWriter fileWriter = new FileWriter(configFile);
                    gson.toJson(config, fileWriter);
                    fileWriter.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            return config;
        }
    }
}
