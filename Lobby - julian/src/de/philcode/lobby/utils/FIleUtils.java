package de.philcode.lobby.utils;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class FIleUtils {

	public static File folder = new File("plugins/Lobby/");
	public static File file = new File("plugins/Lobby/servers.yml");
	public static File file1 = new File("plugins/Lobby/locations.yml");
	public static File file2 = new File("plugins/Lobby/config.yml");
	public static File file3 = new File("plugins/Lobby/groups.yml");
	public static YamlConfiguration server = YamlConfiguration.loadConfiguration(file);
	public static YamlConfiguration locations = YamlConfiguration.loadConfiguration(file1);
	public static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file2);
	public static YamlConfiguration groups = YamlConfiguration.loadConfiguration(file3);
	public static void setUpFiles() {
		try {
		if(!folder.exists()) {
			folder.mkdir();
		}
		if(!file.exists()) {
			file.createNewFile();
		}
		if(!file1.exists()) {
			file1.createNewFile();
		}
		
		if(!file2.exists()) {
			file2.createNewFile();
		}
		
		if(!file3.exists()) {
			file3.createNewFile();
		}
		groups.addDefault("Chat.Inhaber", "§4§lInhaber §8| §4§l%Player% >> %msg%");
		groups.addDefault("Chat.Leitung", "§c§lLeitung §8| §c§l%Player% >> %msg%");
		groups.addDefault("Chat.SrDev", "§9SrDeveloper §8| §9§l%Player% >> %msg%");
		groups.addDefault("Chat.SrMod", "§cSrModerator §8| §c%Player% >> %msg%");
		groups.addDefault("Chat.SrBuilder", "§eSrBuilder §8| §e%Player% >> %msg%");
		groups.addDefault("Chat.Dev", "§bDeveloper §8| §b%Player% >> %msg%");
		groups.addDefault("Chat.Mod", "§cModerator §8| §c%Player% >> %msg%");
		groups.addDefault("Chat.Suporter", "§2Suporter §8| §2%Player% >> %msg%");
		groups.addDefault("Chat.Builder", "§eBuilder §8| §e%Player% >> %msg%");
		groups.addDefault("Chat.JDev", "§bJDeveloper §8| §b%Player% >> %msg%");
		groups.addDefault("Chat.JMod", "§cJModerator §8| §c%Player% >> %msg%");
		groups.addDefault("Chat.JSup", "§2JSuporter §8| §c%Player% >> %msg%");
		groups.addDefault("Chat.JBuilder", "§eJBuilder §8| §e%Player% >> %msg%");
		groups.addDefault("Chat.Premium", "§6Premium §8| §6%Player% >> %msg%");
		groups.addDefault("Chat.Vip", "§5Vip §8| §5%Player% >> %msg%");
		groups.addDefault("Chat.Ultra", "§3Ultra §8| §3%Player% >> %msg%");
		groups.addDefault("Chat.Spieler", "§7Spieler §8| §7%Player% >> %msg%");
		
		groups.addDefault("Chat.Other.1", "");
		groups.addDefault("Chat.Other.2", "");
		groups.addDefault("Chat.Other.3", "");
		groups.addDefault("Chat.Other.4", "");
		groups.addDefault("Chat.Other.5", "");
		groups.addDefault("Chat.Other.6", "");
		groups.addDefault("Chat.Other.7", "");
		groups.addDefault("Chat.Other.8", "");
		groups.addDefault("Chat.Other.9", "");
		groups.addDefault("Chat.Other.10", "");

		
		groups.addDefault("Inhaber", "Inhaber");
		groups.addDefault("Leitung", "Leitung");
		groups.addDefault("SrDev", "SrDeveloper");
		groups.addDefault("SrMod", "SrModerator");
		groups.addDefault("SrBuild", "SrBuilder");
		groups.addDefault("Dev", "Developer");
		groups.addDefault("Mod", "Moderator");
		groups.addDefault("Suporter", "Suporter");
		groups.addDefault("Builder", "Builder");
		groups.addDefault("JDev", "JDeveloper");
		groups.addDefault("JMod", "JModerator");
		groups.addDefault("JSup", "JSuporter");
		groups.addDefault("JBuild", "JBuilder");
		groups.addDefault("Premium", "Premium");
		groups.addDefault("Vip", "Vip");
		groups.addDefault("Ultra", "Ultra");
		groups.addDefault("Spieler", "default");
		
		
		
		groups.addDefault("Other.1", "");
		groups.addDefault("Other.2", "");
		groups.addDefault("Other.3", "");
		groups.addDefault("Other.4", "");
		groups.addDefault("Other.5", "");
		groups.addDefault("Other.6", "");
		groups.addDefault("Other.7", "");
		groups.addDefault("Other.8", "");
		groups.addDefault("Other.9", "");
		groups.addDefault("Other.10", "");
		
		cfg.addDefault("options.Event", false);
		server.addDefault("Server.Survival", "");
		server.addDefault("Server.Event", "");
		server.options().copyDefaults(true);
		cfg.options().copyDefaults(true);
		groups.options().copyDefaults(true);
		saveFile();
		saveFile();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void saveFile() {
		try {
			groups.save(file3);
			cfg.save(file2);
			server.save(file);
			locations.save(file1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
