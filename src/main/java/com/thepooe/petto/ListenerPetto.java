package com.thepooe.petto;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * Created by U6043820 on 1/11/2017.
 */
public class ListenerPetto implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage("Welcome, " + event.getPlayer().getName() + "!");
    }

    @EventHandler (priority = EventPriority.LOWEST)
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        event.setCancelled(true);
    }

    @EventHandler (priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onPlayerChat2(AsyncPlayerChatEvent event) {
        System.out.println("This should not be executed");
    }
}
