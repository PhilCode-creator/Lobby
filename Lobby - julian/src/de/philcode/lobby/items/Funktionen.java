package de.philcode.lobby.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Funktionen {

	//Legende:
	/* s= Spawn c= CityBuild z= Survival
	 * g = gray glass b = back
	 * a = ambos
	 *
	 * | |c| | |s| | |z| |
	 *-------------------
	 *| | | | | | | | | |
	 *-------------------
	 *| | | | |m| | | | | 
	 *-------------------
	 *
	 *
	 *
	 *cb = Eisen Axt
	 *spawn = netherstar
	 *Survival = DiaHelm
	 *minigames = goldhelm
	 *
	 * */
	
	public static Inventory compass_inv = Bukkit.createInventory(null, 9*3, "§8Wähle dein SpielModus");
	public static Inventory Minigames_inv = Bukkit.createInventory(null, 9*3, "§8Wähle dein Minigame");
	public static Inventory Inventar_inv = Bukkit.createInventory(null, 9*3, "§8Wähle dein Minigame");
	public static Inventory team_inv = Bukkit.createInventory(null, 9*3, "§8Wähle dein SpielModus");
	
	public static void befüllen() {
		ItemStack spawn = new ItemStack(Material.NETHER_STAR);
		ItemMeta spawnm = spawn.getItemMeta();
		spawnm.setDisplayName("§e§lSpawn");
		List<String> spawnl = new ArrayList<String>();
		spawnl.add("§8Online: " + Bukkit.getServer().getOnlinePlayers().size());
		spawnm.setLore(spawnl);
		spawn.setItemMeta(spawnm);
		
		ItemStack CityBuild = new ItemStack(Material.IRON_AXE);
		ItemMeta CityBuildm = CityBuild.getItemMeta();
		CityBuildm.setDisplayName("§f§lCityBuild");
		List<String> CityBuildl = new ArrayList<String>();
		CityBuildl.add("§4COMMING SOON!");
		CityBuildm.setLore(CityBuildl);
		CityBuild.setItemMeta(CityBuildm);
		
		ItemStack Survival = new ItemStack(Material.DIAMOND_HELMET);
		ItemMeta Survivalm = Survival.getItemMeta();
		Survivalm.setDisplayName("§c§lSurvival");
		List<String> Survivall = new ArrayList<String>();
		Survivall.add("§4COMMING SOON!");
		Survivalm.setLore(Survivall);
		Survival.setItemMeta(Survivalm);
		
		ItemStack Minigames = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE);
		ItemMeta Minigamesm = Minigames.getItemMeta();
		Minigamesm.setDisplayName("§4§lMiniGames");
		List<String> Minigamesl = new ArrayList<String>();
		Minigamesl.add("§4COMMING SOON!");
		Minigamesm.setLore(Minigamesl);
		Minigames.setItemMeta(Minigamesm);
		
		ItemStack teamserver = new ItemStack(Material.STONE_SWORD);
		ItemMeta teamMeta = teamserver.getItemMeta();
		teamMeta.setDisplayName("§4TeamServer");
		teamserver.setItemMeta(teamMeta);
		
		compass_inv.setItem(2, CityBuild);
		compass_inv.setItem(4, spawn);
		compass_inv.setItem(6, Survival);
		compass_inv.setItem(22, Minigames);
		
		team_inv.setItem(2, CityBuild);
		team_inv.setItem(4, spawn);
		team_inv.setItem(6, Survival);
		team_inv.setItem(22, Minigames);
		team_inv.setItem(26, teamserver);
		
		/*
		 *|g|g|g|g|g|g|g|g|g|
		 *-------------------
		 *|g|g|g|g|a|g|g|g|g|
		 *-------------------
		 *|b|g|g|g|g|g|g|g|g|
		 *-------------------
		 * 
		 *glass = graue glas scheibe
		 *b = pfeil
		 *a = ambos
		 * 
		 * */
		
		ItemStack glass = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
		ItemMeta glassm = glass.getItemMeta();
		glassm.setDisplayName("§0");
		glass.setItemMeta(glassm);
		
		ItemStack amboss = new ItemStack(Material.ANVIL);
		ItemMeta ambossm = amboss.getItemMeta();
		ambossm.setDisplayName("§cWORK IN PROGRESS");
		amboss.setItemMeta(ambossm);
		
		ItemStack pfeil = new ItemStack(Material.ARROW);
		ItemMeta pfeilm = pfeil.getItemMeta();
		pfeilm.setDisplayName("§bZurück");
		pfeil.setItemMeta(pfeilm);
		
		Minigames_inv.setItem(0, glass);
		Minigames_inv.setItem(1, glass);
		Minigames_inv.setItem(2, glass);
		Minigames_inv.setItem(3, glass);
		Minigames_inv.setItem(4, glass);
		Minigames_inv.setItem(5, glass);
		Minigames_inv.setItem(6, glass);
		Minigames_inv.setItem(7, glass);
		Minigames_inv.setItem(8, glass);
		Minigames_inv.setItem(9, glass);
		Minigames_inv.setItem(10, glass);
		Minigames_inv.setItem(11, glass);
		Minigames_inv.setItem(12, glass);
		Minigames_inv.setItem(13, amboss);
		Minigames_inv.setItem(14, glass);
		Minigames_inv.setItem(15, glass);
		Minigames_inv.setItem(16, glass);
		Minigames_inv.setItem(17, glass);
		Minigames_inv.setItem(18, pfeil);
		Minigames_inv.setItem(19, glass);
		Minigames_inv.setItem(20, glass);
		Minigames_inv.setItem(21, glass);
		Minigames_inv.setItem(22, glass);
		Minigames_inv.setItem(23, glass);
		Minigames_inv.setItem(24, glass);
		Minigames_inv.setItem(25, glass);
		Minigames_inv.setItem(2, glass);
		
		/*
		 * 
		 *   Inventar Chest
		 * 
		 * */
		
		/*ItemStack Hute = new ItemStack(Material.IRON_HELMET);
		ItemMeta Hutem = Hute.getItemMeta();
		Hutem.setDisplayName("§7Hüte");
		Hute.setItemMeta(Hutem);
		
		ItemStack Boots = new ItemStack(Material.GOLDEN_BOOTS);
		ItemMeta Bootsm = Boots.getItemMeta();
		Bootsm.setDisplayName("§7Boots");
		Boots.setItemMeta(Hutem);
		
		ItemStack Tiere = new ItemStack(Material.PIG_SPAWN_EGG);
		ItemMeta Tierem = Tiere.getItemMeta();
		Tierem.setDisplayName("§7Pets");
		Tiere.setItemMeta(Tierem);
		
		ItemStack Mounts = new ItemStack(Material.SADDLE);
		ItemMeta Mountsm = Mounts.getItemMeta();
		Mountsm.setDisplayName("§7Mounts");
		Mounts.setItemMeta(Mountsm);
		*/
	}
	
	public static void giveItems(Player p) {
		ItemStack Navigator = new ItemStack(Material.COMPASS);
		ItemMeta Navigatorm = Navigator.getItemMeta();
		Navigatorm.setDisplayName("§c§lNavigator");
		Navigator.setItemMeta(Navigatorm);
		
		ItemStack PlayerHider = new ItemStack(Material.LIME_DYE);
		ItemMeta PlayerHiderm = Navigator.getItemMeta();
		PlayerHiderm.setDisplayName("§a§lAlle Spieler sichtbar");
		PlayerHider.setItemMeta(PlayerHiderm);
		
		/*ItemStack Inventar = new ItemStack(Material.CHEST);
		ItemMeta Inventarm = Inventar.getItemMeta();
		Inventarm.setDisplayName("§6§lDein Inventar §7(Rechtsklick)");
		Inventar.setItemMeta(Inventarm);
		*/
		p.getInventory().setItem(0, Navigator);
		p.getInventory().setItem(1, PlayerHider);
		
	}
	
}
