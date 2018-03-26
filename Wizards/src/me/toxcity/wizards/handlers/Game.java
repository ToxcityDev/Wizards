package me.toxcity.wizards.handlers;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.toxcity.wizards.utils.LocationsUtils;

public class Game {
	private static boolean canStart = false;
	private static boolean hasStarted = false;
	public static void start() {
		hasStarted = true;
		new Team("Player1", new Location(Bukkit.getWorld("hub1234") , 68, 65 ,116));
		new Team("Player2", new Location(Bukkit.getWorld("hub1234") , -12, 67,-36));

		
		int i = 0;
		for (Player player : Bukkit.getOnlinePlayers()) {
			if (i > Team.getAllTeams().size())
				i = 0;
			Team.getAllTeams().get(i).add(player);
			LocationsUtils.teleportToGame(player, Team.getAllTeams().get(i));
			i++;
			
		}
		
	}
	public static void stop(Team team) {
		hasStarted = false;
		
	}
	public static boolean canStart() {
		
		return canStart;
	}
	public static boolean hasStarted() {
		return hasStarted;
	}
		public static void setCanStart(boolean b) {
			canStart = b;
		}
	}

