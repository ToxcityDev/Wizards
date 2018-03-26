package me.toxcity.wizards;

public enum GameStates {
	LOBBY(true),
	COUNTDOWN(true),
	INGAME(false),
	END(false);
	
	private boolean canJoin;
	
	private static GameStates currentState;
 GameStates(boolean canJoin) {
	this.canJoin = canJoin;
		
	}
public boolean canJoin() {
	return canJoin;
}
public static void setState(GameStates state) {
	GameStates.currentState = state;
}
public static boolean isState(GameStates state) {
	return GameStates.currentState == state;
}
public static GameStates getState() {
	return currentState;
}
}
