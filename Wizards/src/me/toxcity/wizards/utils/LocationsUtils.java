package me.toxcity.wizards.utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.toxcity.wizards.handlers.Team;

public class LocationsUtils {

	private static Location spawnLocation = new Location(Bukkit.getWorld("hub1234"), 59,164, 105);
public static void teleporttoSpawn(Player player) {
	player.teleport(spawnLocation);	
}
public static void teleportAllToSpawn() {
	for (Player p: Bukkit.getOnlinePlayers()) 
		teleporttoSpawn(p);
}
public static void teleportToGame(Player player, Team team) {
	player.teleport(team.getSpawn());
	
}
}

