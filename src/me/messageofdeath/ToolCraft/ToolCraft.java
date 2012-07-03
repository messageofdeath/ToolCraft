package me.messageofdeath.ToolCraft;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class ToolCraft extends JavaPlugin {
	
	public String lprefix;
	
	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = getDescription();
		lprefix = "[" + pdfFile.getName() + "] v" + pdfFile.getVersion() + ": ";
		log("is now enabling...");
		log("loading recipes...");
		loadHoes();
		loadPickAxes();
		loadAxes();
		loadShovels();
		loadSwords();
		log("loaded recipes!");
		log("is now enabled!");
	}
	
	public void log(String log) {
		Bukkit.getLogger().info(lprefix + log);
	}
	
	public void loadHoes() {
		// Wood Hoe
		ShapedRecipe woodhoe = new ShapedRecipe(new ItemStack(Material.WOOD, 1));
		woodhoe.shape(new String[] {"A"});
		woodhoe.setIngredient('A', Material.WOOD_HOE);
		addRecipe(woodhoe);
		
		// Stone Hoe
		ShapedRecipe stonehoe = new ShapedRecipe(new ItemStack(Material.STONE, 1));
		stonehoe.shape(new String[] {"A"});
		stonehoe.setIngredient('A', Material.STONE_HOE);
		addRecipe(woodhoe);
		
		// Iron Hoe
		ShapedRecipe ironhoe = new ShapedRecipe(new ItemStack(Material.IRON_INGOT, 1));
		ironhoe.shape(new String[] {"A"});
		ironhoe.setIngredient('A', Material.IRON_HOE);
		addRecipe(ironhoe);
		
		// Gold Hoe
		ShapedRecipe goldhoe = new ShapedRecipe(new ItemStack(Material.GOLD_INGOT, 1));
		goldhoe.shape(new String[] {"A"});
		goldhoe.setIngredient('A', Material.GOLD_HOE);
		addRecipe(goldhoe);
		
		// Diamond Hoe
		ShapedRecipe diamondhoe = new ShapedRecipe(new ItemStack(Material.DIAMOND, 1));
		diamondhoe.shape(new String[] {"A"});
		diamondhoe.setIngredient('A', Material.DIAMOND_HOE);
		addRecipe(diamondhoe);
	}
	
	public void loadPickAxes() {
		// Wood PickAxe
		ShapedRecipe woodpick = new ShapedRecipe(new ItemStack(Material.WOOD, 2));
		woodpick.shape(new String[] {"A"});
		woodpick.setIngredient('A', Material.WOOD_PICKAXE);
		addRecipe(woodpick);
		
		// Stone PickAxe
		ShapedRecipe stonepick = new ShapedRecipe(new ItemStack(Material.STONE, 2));
		stonepick.shape(new String[] {"A"});
		stonepick.setIngredient('A', Material.STONE_PICKAXE);
		addRecipe(stonepick);
		
		// Iron PickAxe
		ShapedRecipe ironpick = new ShapedRecipe(new ItemStack(Material.IRON_INGOT, 2));
		ironpick.shape(new String[] {"A"});
		ironpick.setIngredient('A', Material.IRON_PICKAXE);
		addRecipe(ironpick);
		
		// Gold PickAxe
		ShapedRecipe goldpick = new ShapedRecipe(new ItemStack(Material.GOLD_INGOT, 2));
		goldpick.shape(new String[] {"A"});
		goldpick.setIngredient('A', Material.GOLD_PICKAXE);
		addRecipe(goldpick);
		
		// Diamond Pickaxe
		ShapedRecipe diamondpick = new ShapedRecipe(new ItemStack(Material.DIAMOND, 2));
		diamondpick.shape(new String[] {"A"});
		diamondpick.setIngredient('A', Material.DIAMOND_PICKAXE);
		addRecipe(diamondpick);
	}
	
	public void loadAxes() {
		// Wood Axe
		ShapedRecipe woodaxe = new ShapedRecipe(new ItemStack(Material.WOOD, 2));
		woodaxe.shape(new String[] {"A"});
		woodaxe.setIngredient('A', Material.WOOD_AXE);
		addRecipe(woodaxe);
		
		// Stone Axe
		ShapedRecipe stoneaxe = new ShapedRecipe(new ItemStack(Material.STONE, 2));
		stoneaxe.shape(new String[] {"A"});
		stoneaxe.setIngredient('A', Material.STONE_AXE);
		addRecipe(stoneaxe);
		
		// Iron Axe
		ShapedRecipe ironaxe = new ShapedRecipe(new ItemStack(Material.IRON_INGOT, 2));
		ironaxe.shape(new String[] {"A"});
		ironaxe.setIngredient('A', Material.IRON_AXE);
		addRecipe(ironaxe);
		
		// Gold Axe
		ShapedRecipe goldaxe = new ShapedRecipe(new ItemStack(Material.GOLD_INGOT, 2));
		goldaxe.shape(new String[] {"A"});
		goldaxe.setIngredient('A', Material.GOLD_AXE);
		addRecipe(goldaxe);
		
		// Diamond Axe
		ShapedRecipe diamondaxe = new ShapedRecipe(new ItemStack(Material.DIAMOND, 2));
		diamondaxe.shape(new String[] {"A"});
		diamondaxe.setIngredient('A', Material.DIAMOND_AXE);
		addRecipe(diamondaxe);
	}
	
	public void loadShovels() {
		// Wood Shovel
		ShapedRecipe woodshovel = new ShapedRecipe(new ItemStack(Material.WOOD, 1));
		woodshovel.shape(new String[] {"A"});
		woodshovel.setIngredient('A', Material.WOOD_SPADE);
		addRecipe(woodshovel);
		
		// Stone Shovel
		ShapedRecipe stoneshovel = new ShapedRecipe(new ItemStack(Material.STONE, 1));
		stoneshovel.shape(new String[] {"A"});
		stoneshovel.setIngredient('A', Material.STONE_SPADE);
		addRecipe(stoneshovel);
		
		// Iron Shovel
		ShapedRecipe ironshovel = new ShapedRecipe(new ItemStack(Material.IRON_INGOT, 1));
		ironshovel.shape(new String[] {"A"});
		ironshovel.setIngredient('A', Material.IRON_SPADE);
		addRecipe(ironshovel);
		
		// Gold Shovel
		ShapedRecipe goldshovel = new ShapedRecipe(new ItemStack(Material.GOLD_INGOT, 1));
		goldshovel.shape(new String[] {"A"});
		goldshovel.setIngredient('A', Material.GOLD_SPADE);
		addRecipe(goldshovel);
		
		// Diamond Shovel
		ShapedRecipe diamondshovel = new ShapedRecipe(new ItemStack(Material.DIAMOND, 1));
		diamondshovel.shape(new String[] {"A"});
		diamondshovel.setIngredient('A', Material.DIAMOND_SPADE);
		addRecipe(diamondshovel);
	}
	
	public void loadSwords() {
		// Wood Sword
		ShapedRecipe woodsword = new ShapedRecipe(new ItemStack(Material.WOOD, 1));
		woodsword.shape(new String[] {"A"});
		woodsword.setIngredient('A', Material.WOOD_SWORD);
		addRecipe(woodsword);
		
		// Stone Sword
		ShapedRecipe stonesword = new ShapedRecipe(new ItemStack(Material.STONE, 1));
		stonesword.shape(new String[] {"A"});
		stonesword.setIngredient('A', Material.STONE_SWORD);
		addRecipe(stonesword);
		
		// Iron Sword
		ShapedRecipe ironsword = new ShapedRecipe(new ItemStack(Material.IRON_INGOT, 1));
		ironsword.shape(new String[] {"A"});
		ironsword.setIngredient('A', Material.IRON_SWORD);
		addRecipe(ironsword);
		
		// Gold Sword
		ShapedRecipe goldsword = new ShapedRecipe(new ItemStack(Material.GOLD_INGOT, 1));
		goldsword.shape(new String[] {"A"});
		goldsword.setIngredient('A', Material.GOLD_SWORD);
		addRecipe(goldsword);
		
		// Diamond Sword
		ShapedRecipe diamondsword = new ShapedRecipe(new ItemStack(Material.DIAMOND, 1));
		diamondsword.shape(new String[] {"A"});
		diamondsword.setIngredient('A', Material.DIAMOND_SWORD);
		addRecipe(diamondsword);
	}
	
	public void addRecipe(ShapedRecipe recipe) {
		Bukkit.getServer().addRecipe(recipe);
	}
}