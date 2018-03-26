package me.toxcity.wizards.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;

import me.toxcity.wizards.Main;
import me.toxcity.wizards.handlers.Game;
import net.md_5.bungee.api.ChatColor;

public class AsyncPlayerPreLogic extends MainListener {

	public AsyncPlayerPreLogic(Main pl) {
		super(pl);
		// TODO Auto-generated constructor stub
	}

	@EventHandler
	public void playerPreLogin(AsyncPlayerPreLoginEvent event) {
		if (Game.hasStarted())
			event.disallow(org.bukkit.event.player.AsyncPlayerPreLoginEvent.Result.KICK_OTHER, ChatColor.RED + "Game has Started");
		
	}
}
