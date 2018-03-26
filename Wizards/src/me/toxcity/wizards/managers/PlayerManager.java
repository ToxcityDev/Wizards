package me.toxcity.wizards.managers;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.toxcity.wizards.GameStates;
import me.toxcity.wizards.Main;
import net.md_5.bungee.api.ChatColor;

public class PlayerManager  {
	
	private Main main;
	public PlayerManager(Main main) {
		this.main = main;
	}
public void handler(Player player) {
if (main.getGamestate() == GameStates.LOBBY) {
	 main.alive.remove(player);
	  main.spectating.remove(player);
      main.alive.add(player);
      player.setExp(0);
      player.setTotalExperience(0);
      player.setHealth(20);
      player.setFoodLevel(20);
      player.setGameMode(GameMode.SURVIVAL);
      player.setAllowFlight(false);
}
 if (main.getGamestate() == GameStates.INGAME) {
	 ItemStack wand = new ItemStack(Material.STICK);
	 ItemMeta wandmeta = wand.getItemMeta();
	 wandmeta.setDisplayName(ChatColor.YELLOW + "Magical Wand");
	 ItemStack dagger = new ItemStack(Material.IRON_SWORD);
	 ItemMeta daggermeta = dagger.getItemMeta();
	 daggermeta.setDisplayName(ChatColor.YELLOW + "Dagger");
	 player.getInventory().addItem(wand);
	 player.getInventory().addItem(dagger);
	 
 }
   
	
}
}

