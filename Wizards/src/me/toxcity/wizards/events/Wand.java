package me.toxcity.wizards.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.toxcity.wizards.Main;

public class Wand implements Listener {
	private Main main;
	public Wand(Main main) {
		this.main = main;
	}

	@EventHandler
	public void onInteract(PlayerInteractEvent event) {
		
    Action action = event.getAction();
    Player player = event.getPlayer();

    ItemStack itemInHand = event.getItem();

    boolean containsCorrectName = player.getItemInHand().getItemMeta().getDisplayName().contains(ChatColor.YELLOW + "Magical Wand");
    boolean expBottleInHand = event.getItem().getType().equals(Material.STICK);
 
    if (action.equals(action.RIGHT_CLICK_AIR) || action.equals(action.RIGHT_CLICK_BLOCK)) {

        if (containsCorrectName && expBottleInHand) {            
            event.setCancelled(true);
            
        }
}
	}
}