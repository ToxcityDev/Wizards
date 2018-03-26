package me.toxcity.wizards.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.toxcity.wizards.Main;
import me.toxcity.wizards.managers.ChatManager;
import me.toxcity.wizards.threads.StartCountdown;

public class Start implements CommandExecutor {

	   private Main main;
	    public Start(Main main) {
	        this.main = main;
	    }

	    @Override
	    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
	        Player p = (Player) sender;
	        
	         if (cmd.getName().equalsIgnoreCase("start")) {
	            new StartCountdown(main).startCountdown();
	            p.sendMessage(new ChatManager(main).prefix + "You have started the game.");
	            return true;
	        }
	        return true;
	    }
	}