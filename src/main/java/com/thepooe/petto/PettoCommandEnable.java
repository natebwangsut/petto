package com.thepooe.petto;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by @ThePooE on 1/16/2017.
 */
public class PettoCommandEnable implements CommandExecutor {

    private final Petto petto;

    public PettoCommandEnable(Petto petto) {
        this.petto = petto;
    }

    /**
     * Enable petto plugin via "/petto enable"
     * @param usr accepts any CommandSender
     * @param cmd petto
     * @param label disable
     * @param args accepts any args
     * @return Boolean value if the plugin has been successfully enabled
     */
    @Override
    public boolean onCommand(CommandSender usr, Command cmd, String label, String args[]) {
        if (cmd.getName().equalsIgnoreCase("petto")
                && label.equalsIgnoreCase("enable")) {
            if (petto.isEnabled()) {
                usr.sendMessage("Petto has already been enabled.");
            } else {
                petto.onEnable();
            }
            return true;
        }
        return false;
    }
}
