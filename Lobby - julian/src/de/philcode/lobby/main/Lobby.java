package de.philcode.lobby.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.philcode.lobby.commands.CMD_Build;
import de.philcode.lobby.commands.CMD_SpawnSet;
import de.philcode.lobby.items.Funktionen;
import de.philcode.lobby.listeners.ChatEvent;
import de.philcode.lobby.listeners.InteractListener;
import de.philcode.lobby.listeners.JoinEvent;
import de.philcode.lobby.utils.FIleUtils;
import de.philcode.lobby.utils.Utils;

public class Lobby extends JavaPlugin {

	
	
	public void onEnable() {
		instance = this;
		Bukkit.getConsoleSender().sendMessage(Utils.PREFIX + "§eDas Plugin wurde aktiviert!");
		System.out.println("Lade Commands");
		registerCommand();
		System.out.println("Done!");
		System.out.println("Lade Listener");
		registerListeners();
		System.out.println("Done!");
		System.out.println("Plugin Benutzbar");
		FIleUtils.setUpFiles();
		Funktionen.befüllen();
		getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
	}

	
	public void onDisable() {
		
	}

	private void registerCommand() {
		getCommand("build").setExecutor(new CMD_Build());
		getCommand("spawnset").setExecutor(new CMD_SpawnSet());
	}
	
	private void registerListeners() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new JoinEvent(), this);
		pm.registerEvents(new ChatEvent(), this);
		pm.registerEvents(new InteractListener(), this);
	}
	
	public static Lobby instance;
	
}
