package com.thepooe.petto;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by @ThePooE on 1/10/2017.
 */
public class Petto extends JavaPlugin {

    private boolean enabled = true;
    private FileConfiguration config = this.getConfig();

    @Override
    public void onEnable() {
        // Default Configurations
        config.addDefault("hi", true);
        config.options().copyDefaults(true);
        saveConfig();

        getServer().getPluginManager().registerEvents(new PettoListener(), this);

        this.enabled = true;
        this.getCommand("petto").setExecutor(new CommandPetto());
    }

    @Override
    public void onDisable() {
        this.enabled = false;
    }

    public boolean isPluginEnabled() {
        return this.enabled;
    }
}
