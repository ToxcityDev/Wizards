package me.toxcity.wizards.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerQuitEvent;

import me.toxcity.wizards.GameStates;
import me.toxcity.wizards.Main;
import me.toxcity.wizards.handlers.Game;
import me.toxcity.wizards.handlers.Team;

public class PlayerQuit extends MainListener{

	public PlayerQuit(Main pl) {
		super(pl);
	} 
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {
		if (GameStates.isState(GameStates.LOBBY))
			Game.setCanStart(Bukkit.getOnlinePlayers().size() -1 >= 8);
		
		Player player = event.getPlayer();
		
		if(Game.hasStarted()) 
			Team.getTeam(player).remove(player);
		
	}

}
