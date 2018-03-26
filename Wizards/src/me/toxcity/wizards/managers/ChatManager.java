package me.toxcity.wizards.managers;

import org.bukkit.ChatColor;

import me.toxcity.wizards.Main;

public class ChatManager {
	
	private Main main;
	
	public ChatManager(Main main) {
		this.main = main;
	}
	public String format(String message) {
		return ChatColor.translateAlternateColorCodes('&', message);
	}
	public String premission = format("&d Toxcity says 'NO PERMS!' ");
	public String prefix = format("&7[&b&lMCRELICS&7] ");
	public String tip = format(prefix + "&d Buy Upgrades as Early as possible.");
}
 