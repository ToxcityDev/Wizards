package me.toxcity.wizards.utils;
import static org.bukkit.ChatColor.*;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;


public class ChatUtils {
	
	public static void broadcast(String msg) {
		for (Player player : Bukkit.getOnlinePlayers())
			player.sendMessage(prefix() + RED + msg);
	}
		
		private static String prefix() {
			return GRAY + "[" + LIGHT_PURPLE + "Wizards" + GRAY + "] " ;
			
		}
		
	}


