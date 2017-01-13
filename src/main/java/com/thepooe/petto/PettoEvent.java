package com.thepooe.petto;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Created by U6043820 on 1/11/2017.
 */
public class PettoEvent extends Event implements Cancellable {

    // Back-ends
    private static final HandlerList HANDLERS = new HandlerList();

    private final String playerName;
    private boolean isCancelled;

    public PettoEvent(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public HandlerList getHandlers() {
        return HANDLERS;
    }
    public static HandlerList getHandlersList() {
        return HANDLERS;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.isCancelled = b;
    }
}
