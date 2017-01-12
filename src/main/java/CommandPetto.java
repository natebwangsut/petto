package main.java;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by @ThePooE on 1/10/2017.
 */
public class CommandPetto implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender usr, Command cmd, String label, String args[]) {
        if (usr instanceof Player) {
            Player player = (Player) usr;
            usr.sendMessage("Hello, I'm Petto!");
        }
        return true;
    }
}
