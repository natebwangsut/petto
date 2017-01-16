package com.thepooe.petto;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by @ThePooE on 1/10/2017.
 */
public class PettoCommand implements CommandExecutor {

    private final Petto petto;

    public PettoCommand(Petto petto) {
        this.petto = petto;
    }

    @Override
    public boolean onCommand(CommandSender usr, Command cmd, String label, String args[]) {
        if (cmd.getName().equalsIgnoreCase("petto")) {
            usr.sendMessage("Hello, I'm Petto!");
            return true;
        }
        return false;
    }
}
