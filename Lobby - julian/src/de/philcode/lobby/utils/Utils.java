package de.philcode.lobby.utils;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;

import de.philcode.lobby.main.Lobby;

public class Utils {

	public static final String PREFIX = "§8[§6Lobby§8] ";
	public static final String NO_PERMS = "§cDazu hast du keine Rechte";
	
	public static boolean checkIfPlayer(CommandSender sender) {
		if(sender instanceof Player) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static boolean checkPlayerPermssion(Player p, String Perms, boolean second, String secondPerms, String noPerms) {
		if(second == true) {
			if(p.hasPermission(Perms) || p.hasPermission(secondPerms)) {
				return true;
			} else {
				p.sendMessage(noPerms);
				return false;
			}
		} else {
			if(p.hasPermission(Perms)) {
				return true;
			} else {
				p.sendMessage(noPerms);
				return false;
			}
		}
	}
	
	  public static void ConnectToBungee(String serverName, Player p) {
		    ByteArrayDataOutput out = ByteStreams.newDataOutput();
		    out.writeUTF("Connect");
		    out.writeUTF(serverName);
		    Player playerr = Bukkit.getPlayerExact(p.getName());
		    playerr.sendPluginMessage(Lobby.instance, "BungeeCord", out.toByteArray());
		  }
	
}
