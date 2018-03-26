package me.toxcity.wizards.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import me.toxcity.wizards.Main;
import me.toxcity.wizards.handlers.Game;
import me.toxcity.wizards.handlers.Team;

public class EntityDamageByEntity extends MainListener {

	public EntityDamageByEntity(Main pl) {
		super(pl);
	
	}
	
	@EventHandler
	public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
		if (!(event.getEntity() instanceof Player && event.getDamager() instanceof Player)) {
			event.setCancelled(true);
			return;
		}
		if (!Game.hasStarted()) {
			event.setCancelled(true);
			return;
		}
		Player player = (Player) event.getEntity();
		Player damager = (Player) event.getDamager();
	
				if(Team.getTeam(player) == Team.getTeam(damager))
					event.setCancelled(true);
		}
	}


