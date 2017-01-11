package me.thepooe.petto;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by U6043820 on 1/11/2017.
 */
public class CommandPettoCreate implements CommandExecutor {

    /**
     * Create a pet for the user that uses the command
     * @param usr
     * @param cmd
     * @param label
     * @param args
     * @return
     */
    @Override
    public boolean onCommand(CommandSender usr, Command cmd, String label, String args[]) {
        if (cmd.getName().equalsIgnoreCase("petto")
                && args[0].equalsIgnoreCase("create")) {
            if (usr instanceof Player) {
                Player player = (Player) usr;
            }
            return true;
        }
        return true;
    }
}
