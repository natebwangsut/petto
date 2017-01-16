package com.thepooe.petto;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

/**
 * Created by @ThePooE on 1/10/2017.
 */
public class Petto extends JavaPlugin {

    private FileConfiguration config = this.getConfig();

    @Override
    public void onEnable() {
        // Default Configurations
        config.addDefault("hi", true);
        config.options().copyDefaults(true);
        saveConfig();

        getServer().getPluginManager().registerEvents(new PettoListener(), this);

        this.getCommand("petto").setExecutor(new PettoCommand());
    }

    @Override
    public void onDisable() {
        // Do nothing

    }

    private void createConfig() {
        try {
            if (!getDataFolder().exists()) {
                getDataFolder().mkdirs();
            }
            File file = new File(getDataFolder(), "config.yml");
            if (!file.exists()) {
                getLogger().info("Config.yml not found, creating!");
                saveDefaultConfig();
            } else {
                getLogger().info("Config.yml found, loading!");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}
