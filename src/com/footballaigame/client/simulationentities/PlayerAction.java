package com.footballaigame.client.simulationentities;

import com.footballaigame.client.customdatatypes.Vector;

/**
 * Represents football player's action that is send to the server.
 */
public class PlayerAction {
    
    /**
     * The desired movement vector of the player.
     */
    public Vector movement;
    
    /**
     * The desired kick vector vector of the player.
     */
    public Vector kick;
    
    /**
     * Initializes a new instance of the {@link PlayerAction} class.
     */
    public PlayerAction() {
        movement = new Vector();
        kick = new Vector();
    }
}
