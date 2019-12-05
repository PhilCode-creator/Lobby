package de.philcode.lobby.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


import de.philcode.lobby.items.Funktionen;
import de.philcode.lobby.utils.FIleUtils;
import me.lucko.luckperms.LuckPerms;
import me.lucko.luckperms.api.LuckPermsApi;

public class JoinEvent implements Listener {

	private FIleUtils FileUtils;
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		e.setJoinMessage(null);
		Player p = (Player) e.getPlayer();
		Funktionen.giveItems(p);
	}
	
}
