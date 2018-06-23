package com.alevat.spaceinvaders.game;

public class CombatInputListener extends GameStateInputListenerAdapter {

    private final CombatState combatState;

    CombatInputListener(CombatState combatState) {
        this.combatState = combatState;
    }

    @Override
    public void leftPressed() {
        combatState.getPlayerCannon().setDirection(HorizontalDirection.LEFT);
    }

    @Override
    public void leftReleased() {
        combatState.getPlayerCannon().setDirection(HorizontalDirection.STILL);
    }

    @Override
    public void rightPressed() {
        combatState.getPlayerCannon().setDirection(HorizontalDirection.RIGHT);
    }

    @Override
    public void rightReleased() {
        combatState.getPlayerCannon().setDirection(HorizontalDirection.STILL);
    }

    @Override
    GameState getGameState() {
        return combatState;
    }
}
