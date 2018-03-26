package me.toxcity.wizards.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.PlayerDeathEvent;

import me.toxcity.wizards.Main;
import me.toxcity.wizards.handlers.Team;


public class PlayerDeath extends MainListener {

	public PlayerDeath(Main pl) {
		super(pl);
		// TODO Auto-generated constructor stub
	}
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent event) {
		Player player = event.getEntity();
		Team.getTeam(player).remove(player);
		
		player.kickPlayer(ChatColor.RED + "You Died! And have been kicked. Thanks for playing beta.");
	}

}
