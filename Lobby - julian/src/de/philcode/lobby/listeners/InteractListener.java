package de.philcode.lobby.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import de.philcode.lobby.items.Funktionen;
import de.philcode.lobby.utils.FIleUtils;
import de.philcode.lobby.utils.Utils;

public class InteractListener implements Listener{

	
	public boolean spawnset = FIleUtils.locations.getBoolean("Location.SpawnSet");
	private boolean portalset = FIleUtils.locations.getBoolean("Location.PortalraumSet");

	
	@EventHandler
	public void onInteract(InventoryClickEvent e) {
		if(e.getInventory() != null) {
			Player p = (Player) e.getWhoClicked();
			if(e.getCurrentItem().hasItemMeta()) {
				    if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§lSurvival")) {
					e.setCancelled(true);
					Utils.ConnectToBungee(FIleUtils.server.getString("Server.Survival"), p);
					p.sendMessage("§7Bereite teleportation vor");
				} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lSpawn")) {
					e.setCancelled(true);
					if(spawnset == true) {
						double x = (double) FIleUtils.locations.getDouble("Location.Spawn.X");
						double y = (double) FIleUtils.locations.getDouble("Location.Spawn.Y");
						double z = (double) FIleUtils.locations.getDouble("Location.Spawn.Z");
						float yaw = (float) FIleUtils.locations.getDouble("Location.Spawn.X");
						float pitch = (float) FIleUtils.locations.getDouble("Location.Spawn.X");
						String w = (String) FIleUtils.locations.getString("Location.Spawn.World");
						World world = (World) Bukkit.getWorld(w);
						Location spawn = new Location(world, x, y, z, yaw, pitch);
						p.teleport(spawn);
						p.sendMessage("§aDu bist nun am Spawn");
					}  else  {
						p.sendMessage(Utils.PREFIX + "§cDer Spawn wurde noch nicht gesezt");
						return;
					}
				}else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§f§lCityBuild")) {
					e.setCancelled(true);
					if(portalset == true) {
						double x = (double) FIleUtils.locations.getDouble("Location.Portalraum.X");
						double y = (double) FIleUtils.locations.getDouble("Location.Portalraum.Y");
						double z = (double) FIleUtils.locations.getDouble("Location.Portalraum.Z");
						float yaw = (float) FIleUtils.locations.getDouble("Location.Portalraum.X");
						float pitch = (float) FIleUtils.locations.getDouble("Location.Portalraum.X");
						String w = (String) FIleUtils.locations.getString("Location.Portalraum.World");
						World world = (World) Bukkit.getWorld(w);
						Location spawn = new Location(world, x, y, z, yaw, pitch);
						p.teleport(spawn);
					}  else  {
						p.sendMessage(Utils.PREFIX + "§cDer PortalRaum wurde noch nicht gesezt");
						return;
					}
				} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cWORK IN PROGRESS")) {
					e.setCancelled(true);
					p.closeInventory();
					p.sendMessage("§cWORK IN PROGRESS");
				} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bZurück")) {
					if(p.hasPermission("lobby.teamserver") || p.hasPermission("lobby.*")) {
						p.openInventory(Funktionen.team_inv);
					} else {
						p.openInventory(Funktionen.compass_inv);
					}
					e.setCancelled(true);
				} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§0")) {
					e.setCancelled(true);
				} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§4§lMiniGames")) {
					e.setCancelled(true);
					p.openInventory(Funktionen.Minigames_inv);
				} else {
					return;
				}
			}
		}
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onInteractList(PlayerInteractEvent e) {
		Player p = (Player) e.getPlayer();
			if(e.getItem() != null) {
				if(e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§lNavigator")) {
					e.setCancelled(true);
					if(p.hasPermission("lobby.teamserver") || p.hasPermission("lobby.*")) {
						p.openInventory(Funktionen.team_inv);
					} else {
						p.openInventory(Funktionen.compass_inv);
					}
				} else if(e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§lAlle Spieler sichtbar")) {
					e.setCancelled(true);
					for(Player all : Bukkit.getOnlinePlayers()) {
						p.hidePlayer(all);
					}
					
					ItemStack is = new ItemStack(Material.GRAY_DYE);
					ItemMeta im = is.getItemMeta();
					im.setDisplayName("§7§lKeine Spieler sichtbar");
					is.setItemMeta(im);
					
					p.getInventory().setItem(1, is);
					
				} else if(e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7§lKeine Spieler sichtbar")) {
					e.setCancelled(true);
					for(Player all : Bukkit.getOnlinePlayers()) {
						p.showPlayer(all);
					}
					
					ItemStack is = new ItemStack(Material.LIME_DYE);
					ItemMeta im = is.getItemMeta();
					im.setDisplayName("§a§lAlle Spieler sichtbar");
					is.setItemMeta(im);
					
					p.getInventory().setItem(1, is);
					
				} else {
					return;
				}
			}
		}
	}
	

