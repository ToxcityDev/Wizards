package me.toxcity.wizards;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.toxcity.wizards.commands.Start;
import me.toxcity.wizards.events.AsyncPlayerPreLogic;
import me.toxcity.wizards.events.Build;
import me.toxcity.wizards.events.EntityDamageByEntity;
import me.toxcity.wizards.events.MainListener;
import me.toxcity.wizards.events.PlayerDeath;
import me.toxcity.wizards.events.PlayerJoin;
import me.toxcity.wizards.events.PlayerQuit;
import me.toxcity.wizards.events.Wand;
import me.toxcity.wizards.threads.StartCountdown;


public class Main extends JavaPlugin {
	public static int startCountdownId;
	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		strings.add("one");
	}

	@Override
	public void onEnable() {
		

	registerCommands();
	registerEvents();
	GameStates.setState(GameStates.LOBBY);
	
	
		
	}
	@Override
	public void onDisable() {
		
		
	}

	private void registerCommands() {
	     getCommand("start").setExecutor(new Start(this));
	}
	private void registerEvents() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new Build(this), this);
		pm.registerEvents(new Wand (this), this);
		pm.registerEvents(new PlayerJoin (this), this);
		pm.registerEvents(new PlayerQuit (this), this);
		pm.registerEvents(new PlayerDeath (this), this);
		pm.registerEvents(new MainListener (this), this);
		pm.registerEvents(new EntityDamageByEntity (this), this);
		pm.registerEvents(new AsyncPlayerPreLogic (this), this);
		
		
	}
	@SuppressWarnings("deprecation")
	public void startCountdown() {
		StartCountdown.timeUntilStart=60;
		startCountdownId = getServer()
				.getScheduler()
				.scheduleSyncRepeatingTask(this, new StartCountdown(this), 20l, 20l);
		
	}
	public void stopCountdown() {
		getServer().getScheduler().cancelTask(startCountdownId);
	}
	public void restartCountdown() {
		stopCountdown();
		startCountdown();
	}


	  
	

}

