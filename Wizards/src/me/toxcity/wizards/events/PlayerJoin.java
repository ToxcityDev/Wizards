package me.toxcity.wizards.events;



import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

import me.toxcity.wizards.Main;
import me.toxcity.wizards.handlers.Game;
import me.toxcity.wizards.managers.PlayerManager;
import me.toxcity.wizards.threads.StartCountdown;
import me.toxcity.wizards.utils.LocationsUtils;

public class PlayerJoin extends MainListener {

	public PlayerJoin(Main pl) {
		super(pl);
		
	}

    private Main main;
    public void Join(Main main) {
        this.main = main;
    }
@EventHandler
public void onPlayerJoin(PlayerJoinEvent event) {
	Game.setCanStart(Bukkit.getOnlinePlayers().size() >= 2);
	LocationsUtils.teleporttoSpawn((event.getPlayer()));

    }
}





