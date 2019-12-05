package de.philcode.lobby.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import de.philcode.lobby.utils.FIleUtils;



public class ChatEvent implements Listener {
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		String msg = e.getMessage();
		
		Player p = (Player) e.getPlayer();
		
		if(p.hasPermission("group." + FIleUtils.groups.getString("Inhaber"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.Inhaber").replace("%msg%", msg).replace("%player%", p.getName()));
		} else if(p.hasPermission("group." + FIleUtils.groups.getString("Leitung"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.Leitung").replace("%msg%", msg).replace("%player%", p.getName()));
		} else if(p.hasPermission("group." + FIleUtils.groups.getString("SrDev"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.SrDev").replace("%msg%", msg).replace("%player%", p.getName()));
		} else if(p.hasPermission("group." + FIleUtils.groups.getString("SrMod"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.SrMod").replace("%msg%", msg).replace("%player%", p.getName()));
		} else if(p.hasPermission("group." + FIleUtils.groups.getString("SrBuilder"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.SrBuilder").replace("%msg%", msg).replace("%player%", p.getName()));
		} else if(p.hasPermission("group." + FIleUtils.groups.getString("Dev"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.Dev").replace("%msg%", msg).replace("%player%", p.getName()));
		} else if(p.hasPermission("group." + FIleUtils.groups.getString("Mod"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.Mod").replace("%msg%", msg).replace("%player%", p.getName()));
		} else if(p.hasPermission("group." + FIleUtils.groups.getString("Suporter"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.Suporter").replace("%msg%", msg).replace("%player%", p.getName()));
		} else if(p.hasPermission("group." + FIleUtils.groups.getString("Builder"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.Builder").replace("%msg%", msg).replace("%player%", p.getName()));
		} else if(p.hasPermission("group." + FIleUtils.groups.getString("JDev"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.JDev").replace("%msg%", msg).replace("%player%", p.getName()));
		} else if(p.hasPermission("group." + FIleUtils.groups.getString("JMod"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.JMod").replace("%msg%", msg).replace("%player%", p.getName()));
		} else if(p.hasPermission("group." + FIleUtils.groups.getString("JSup"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.JSup").replace("%msg%", msg).replace("%player%", p.getName()));
		} else if(p.hasPermission("group." + FIleUtils.groups.getString("JBuilder"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.JBuilder").replace("%msg%", msg).replace("%player%", p.getName()));
		} else if(p.hasPermission("group." + FIleUtils.groups.getString("Premium"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.Premium").replace("%msg%", msg).replace("%player%", p.getName()));
		} else if(p.hasPermission("group." + FIleUtils.groups.getString("Vip"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.Vip").replace("%msg%", msg).replace("%player%", p.getName()));
		} else if(p.hasPermission("group." + FIleUtils.groups.getString("Ultra"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.Ultra").replace("%msg%", msg).replace("%player%", p.getName()));
		} else if(p.hasPermission("group." + FIleUtils.groups.getString("Spieler"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.Spieler").replace("%msg%", msg).replace("%player%", p.getName()));
			
		} else if(p.hasPermission("group." + FIleUtils.groups.getString("Other.1"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.Other.1").replace("%msg%", msg).replace("%player%", p.getName()));
		} else if(p.hasPermission("group." + FIleUtils.groups.getString("Other.2"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.Other.2").replace("%msg%", msg).replace("%player%", p.getName()));
		} else if(p.hasPermission("group." + FIleUtils.groups.getString("Other.3"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.Other.3").replace("%msg%", msg).replace("%player%", p.getName()));
		} else if(p.hasPermission("group." + FIleUtils.groups.getString("Other.4"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.Other.4").replace("%msg%", msg).replace("%player%", p.getName()));
		} else if(p.hasPermission("group." + FIleUtils.groups.getString("Other.5"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.Other.5").replace("%msg%", msg).replace("%player%", p.getName()));
		} else if(p.hasPermission("group." + FIleUtils.groups.getString("Other.6"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.Other.6").replace("%msg%", msg).replace("%player%", p.getName()));
		} else if(p.hasPermission("group." + FIleUtils.groups.getString("Other.7"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.Other.7").replace("%ms8%", msg).replace("%player%", p.getName()));
		} else if(p.hasPermission("group." + FIleUtils.groups.getString("Other.8"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.Other.8").replace("%msg%", msg).replace("%player%", p.getName()));
		} else if(p.hasPermission("group." + FIleUtils.groups.getString("Other.9"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.Other.9").replace("%msg%", msg).replace("%player%", p.getName()));
		} else if(p.hasPermission("group." + FIleUtils.groups.getString("Other.10"))) {
			e.setFormat(FIleUtils.groups.getString("Chat.Other.10").replace("%msg%", msg).replace("%player%", p.getName()));
		}
		
		if(p.hasPermission("chat.color") || p.hasPermission("chat.*") || p.hasPermission("lobby.*")) {
			msg.replace("&0", "§0");
			msg.replace("&1", "§1");
			msg.replace("&2", "§2");
			msg.replace("&3", "§3");
			msg.replace("&4", "§4");
			msg.replace("&5", "§5");
			msg.replace("&6", "§6");
			msg.replace("&7", "§7");
			msg.replace("&8", "§8");
			msg.replace("&9", "§9");
			msg.replace("&a", "§a");
			msg.replace("&b", "§b");
			msg.replace("&c", "§c");
			msg.replace("&d", "§d");
			msg.replace("&e", "§e");
			msg.replace("&f", "§f");
		}
		
		if(p.hasPermission("chat.format") || p.hasPermission("chat.*") || p.hasPermission("lobby.*")) {
			msg.replace("&l", "§l");
		}
		
	}
	
}
