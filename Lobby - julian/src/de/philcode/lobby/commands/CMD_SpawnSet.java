package de.philcode.lobby.commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;


import de.philcode.lobby.utils.FIleUtils;
import de.philcode.lobby.utils.Utils;

public class CMD_SpawnSet implements CommandExecutor, TabCompleter{
	

	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] args) {
		if(Utils.checkIfPlayer(sender) == true) {
			Player p = (Player) sender;
			if(Utils.checkPlayerPermssion(p, "lobby.setspawn", true, "lobby.*", Utils.NO_PERMS) == true) {
				if(args.length == 1) {
					if(args[0].equalsIgnoreCase("spawn")) {
						double x = p.getLocation().getX();
						System.out.println(x);
						double y = p.getLocation().getY();
						System.out.println(y);
						double z = p.getLocation().getZ();
						System.out.println(z);
						float yaw = p.getLocation().getYaw();
						System.out.println(yaw);
						float pitch = p.getLocation().getPitch();
						System.out.println(pitch);
						String world = p.getWorld().getName();
						System.out.println(world);
						FIleUtils.locations.set("Location.Spawn.X", x);
						System.out.println("1'1");
						FIleUtils.locations.set("Location.Spawn.Y", y);
						System.out.println("2'1");
						FIleUtils.locations.set("Location.Spawn.Z", z);
						System.out.println("3'1");
						FIleUtils.locations.set("Location.Spawn.Yaw", yaw);
						System.out.println("4'1");
						FIleUtils.locations.set("Location.Spawn.Pitch", pitch);
						System.out.println("5'1");
						FIleUtils.locations.set("Location.Spawn", true);
						System.out.println("6'1");
						FIleUtils.locations.set("Location.Spawn.World", world);
						System.out.println("7'1");
						FIleUtils.locations.set("Location.SpawnSet", true);
						System.out.println("8'1");
						FIleUtils.saveFile();
						p.sendMessage(Utils.PREFIX + "§eDu hast erfolgreich den Spawn gesetzt");
						
						return true;
					} else if(args[0].equalsIgnoreCase("portalraum")) {
						double x = p.getLocation().getX();
						double y = p.getLocation().getY();
						double z = p.getLocation().getZ();
						float yaw = p.getLocation().getYaw();
						float pitch = p.getLocation().getPitch();
						String world = p.getWorld().getName();
						
						FIleUtils.locations.set("Location.Portalraum.X", x);
						FIleUtils.locations.set("Location.Portalraum.Y", y);
						FIleUtils.locations.set("Location.Portalraum.Z", z);
						FIleUtils.locations.set("Location.Portalraum.Yaw", yaw);
						FIleUtils.locations.set("Location.Portalraum.Pitch", pitch);
						FIleUtils.locations.set("Location.Portalraum.World", world);
						FIleUtils.locations.set("Location.PortalraumSet", true);
						FIleUtils.saveFile();
						p.sendMessage(Utils.PREFIX + "§eDu hast erfolgreich den PortalRaum gesetzt");
						return true;
					}
				} else if(args.length == 2) {
					if(args[0].equalsIgnoreCase("Survival")) {
						FIleUtils.server.set("Server.Survival", args[1]);
						p.sendMessage(Utils.PREFIX + "§eDu hast den SurivalServer auf §6§l" + args[1]);
						FIleUtils.saveFile();
					} else if(args[0].equalsIgnoreCase("Event")) {
						FIleUtils.server.set("Server.Event", args[1]);
						p.sendMessage(Utils.PREFIX + "§eDu hast den EventServer auf §6§l" + args[1]);
						FIleUtils.saveFile();
					}
				} else {
					p.sendMessage(Utils.PREFIX + "§cVerwendung: /SpawnSet <Spawn/portalraum>");
					p.sendMessage(Utils.PREFIX + "§cVerwendung: /SpawnSet <Server> <Server Name aus der Bungee config.yml>");
					return true;
				}
			}
		}
		
		return false;
	}

	@Override
	public List<String> onTabComplete(CommandSender sender, Command cmd, String arg2, String[] args) {
		List<String> tab = new ArrayList<String>();
		tab.add("Spawn");
		tab.add("portalraum");
		tab.add("Survival");
		tab.add("Event");
		if(args.length == 1) {
			if(args[0].startsWith("s")) {
				tab.remove("portalraum");
				tab.remove("Event");
				tab.remove("Spawn");
				tab.remove("Survival");
				tab.add("Spawn");
				tab.add("Survival");
			} else if(args[0].startsWith("e")) {
				tab.remove("portalraum");
				tab.remove("Event");
				tab.remove("Spawn");
				tab.remove("Survival");
				tab.add("Event");
			} else if(args[0].startsWith("p")) {
				tab.remove("portalraum");
				tab.remove("Event");
				tab.remove("Spawn");
				tab.remove("Survival");
				tab.add("portalraum");
			} else {
				return null;
			}
		} else {
			return null;
		}
		return tab;
	}
	
}
