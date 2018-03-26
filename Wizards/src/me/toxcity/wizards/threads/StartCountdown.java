package me.toxcity.wizards.threads;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

import me.toxcity.wizards.GameStates;
import me.toxcity.wizards.Main;
import me.toxcity.wizards.handlers.Game;
import me.toxcity.wizards.managers.ChatManager;
import me.toxcity.wizards.utils.ChatUtils;

public class StartCountdown extends BukkitRunnable {
	
	public static int timeUntilStart;
	
	public StartCountdown(Main main) {
		// TODO Auto-generated constructor stub
	}

	public void run() {

		Main plugin;
		
		public StartCountdown(Main pl) {
			plugin = pl;
		}
			
				
			
					if (timeUntilStart == 0) {
						if (!Game.canStart()) {
							plugin.restartCountdown();
							ChatUtils.broadcast("Cant Start");
							return;
						}
						Game.start();
						
					}
					
					if (timeUntilStart % 10 == 0 || timeUntilStart < 10) {
						ChatUtils
						.broadcast(String.valueOf(timeUntilStart) + " sceonds until the game starts!");
					
					}
					timeUntilStart -=1;
				}
				
}
	

