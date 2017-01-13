package com.thepooe.petto;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

/**
 * Created by ThePooE on 1/12/2017.
 */
class CommandPettoTest {

    PlayerJoinEvent mockEvent = mock(PlayerJoinEvent.class);

    @Test
    public void testOnPlayerJoin() {
        /*
         * Set up our fake PlayerJoinEvent
         */

        // we have to use PowerMockito.mock because .getPlayer() is a final method
        PlayerJoinEvent mockEvent = mock(PlayerJoinEvent.class);

        /*
         * Set up our first Player
         */

        // we are not calling any final methods on this class so can just use Mockitos normal mock
        Player mockPlayerPandarr = mock(Player.class);

        // effectively set the player name to "Pandarr"
        when(mockPlayerPandarr.getName()).thenReturn("Pandarr");

        // when our onPlayerJoin calls .getPlayer(), we want to return this mockPlayer
        when(mockEvent.getPlayer()).thenReturn(mockPlayerPandarr);

        // create our listener
        PettoListener myPlayerListener = new PettoListener();
        // send in our mock event
        myPlayerListener.onPlayerJoin(mockEvent);

        // verify that our mockPlayer had sendMessage called
        //   we don't care what the string was
        verify(mockPlayerPandarr).sendMessage(anyString());

        /*
         * Set up our second Player
         */

        // we are not calling any final methods on this class so can just use Mockitos normal mock
        Player mockPlayerCodenameB = mock(Player.class);

        // effectively set the player name to "CodenameB"
        when(mockPlayerCodenameB.getName()).thenReturn("CodenameB");

        // when our onPlayerJoin calls .getPlayer(), we want to return this mockPlayer
        when(mockEvent.getPlayer()).thenReturn(mockPlayerCodenameB);

        // send in our mock event
        myPlayerListener.onPlayerJoin(mockEvent);

        // verify we did not send this player a message
        verify(mockPlayerCodenameB, never()).sendMessage(anyString());
    }

}