package com.thepooe.petto;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

/**
 * Created by @ThePooE on 1/10/2017.
 */
public class Petto extends JavaPlugin {

    private File configf, playerf;
    private FileConfiguration config = this.getConfig(), player;

    @Override
    public void onEnable() {
        // CreateFile
        createConfig();
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

    public FileConfiguration getPlayerConfig() {
        return this.player;
    }

    private void createConfig() {

        // Load configurations
        configf = new File(getDataFolder(), "config.yml");
        playerf = new File(getDataFolder(), "player.yml");

        if (!configf.exists()) {
            configf.getParentFile().mkdirs();
            saveResource("config.yml", false);
        }
        if (!playerf.exists()) {
            playerf.getParentFile().mkdirs();
            saveResource("special.yml", false);
        }

        config = new YamlConfiguration();
        player = new YamlConfiguration();
        try {
            config.load(configf);
            player.load(playerf);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }

    }
}
