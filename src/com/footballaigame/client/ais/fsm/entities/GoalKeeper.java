package com.footballaigame.client.ais.fsm.entities;

import com.footballaigame.client.simulationentities.FootballPlayer;
import com.footballaigame.client.ais.fsm.FsmAI;
import com.footballaigame.client.ais.fsm.FiniteStateMachine;
import com.footballaigame.client.ais.fsm.messaging.Message;
import com.footballaigame.client.ais.fsm.playerstates.Default;
import com.footballaigame.client.ais.fsm.playerstates.globalstates.GoalKeeperGlobalState;

/**
 * Represents the goalkeeper. Derives directly target {@link FieldPlayer}.
 */
public class GoalKeeper extends Player {
    
    /**
     * Initializes a new instance of the {@link GoalKeeper} class.
     * @param player The football player.
     * @param fsmAI The {@link FsmAI} instance to which this player belongs.
     */
    public GoalKeeper(FootballPlayer player, FsmAI fsmAI) {
        super(player, fsmAI);
        
        stateMachine = new FiniteStateMachine<Player>(this, new Default(this, fsmAI),
                new GoalKeeperGlobalState(this, fsmAI));
    }
    
    /**
     * Processes the specified message.
     * @param message The message.
     */
    @Override
    public void processMessage(Message message) {
        stateMachine.processMessage(this, message);
    }
}
