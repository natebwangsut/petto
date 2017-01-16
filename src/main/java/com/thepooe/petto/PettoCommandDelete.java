package com.thepooe.petto;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by U6043820 on 1/13/2017.
 */
public class PettoCommandDelete implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender usr, Command cmd, String label, String args[]) {
        if (cmd.getName().equalsIgnoreCase("petto")
                && args[0].equalsIgnoreCase("delete")) {
            //TODO: Add a delete algorithm
            return true;
        }
        return true;
    }
}
