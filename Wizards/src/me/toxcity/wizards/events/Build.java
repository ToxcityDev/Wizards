package me.toxcity.wizards.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import me.toxcity.wizards.GameStates;
import me.toxcity.wizards.Main;
import me.toxcity.wizards.managers.ChatManager;

public class Build implements Listener {

    private Main main;
    public Build(Main main) {
        this.main = main;
    }

    @EventHandler
    public void onBreak(BlockBreakEvent event) {
        Player p = event.getPlayer();
        if (GameStates.isState(GameStates.LOBBY)  || GameStates.isState(GameStates.INGAME)) {
            event.setCancelled(true);
         
        }
    }

    @EventHandler
    public void onPlace(BlockPlaceEvent event) {
        Player p = event.getPlayer();
        if (GameStates.isState(GameStates.LOBBY)  || GameStates.isState(GameStates.INGAME)) {
            event.setCancelled(true);
           
        }
    }
}