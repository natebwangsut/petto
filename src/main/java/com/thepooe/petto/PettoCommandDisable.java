package com.thepooe.petto;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by @ThePooE on 1/16/2017.
 */
public class PettoCommandDisable implements CommandExecutor {

    private final Petto petto;

    public PettoCommandDisable(Petto petto) {
        this.petto = petto;
    }

    /**
     * Disable petto plugin via "/petto disable"
     * @param usr accepts any CommandSender
     * @param cmd petto
     * @param label disable
     * @param args accepts any args
     * @return Boolean value if the plugin has been successfully disabled
     */
    @Override
    public boolean onCommand(CommandSender usr, Command cmd, String label, String args[]) {
        if (cmd.getName().equalsIgnoreCase("petto")
                && label.equalsIgnoreCase("dsiable")) {
            if (!petto.isEnabled()) {
                usr.sendMessage("Petto has already been disabled.");
            } else {
                petto.onDisable();
            }
            return true;
        }
        return false;
    }
}
