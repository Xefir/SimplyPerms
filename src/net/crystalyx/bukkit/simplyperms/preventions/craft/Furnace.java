package net.crystalyx.bukkit.simplyperms.preventions.craft;

import net.crystalyx.bukkit.simplyperms.SimplyPlugin;
import net.crystalyx.bukkit.simplyperms.SimplyPrevents;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryType;

public class Furnace extends SimplyPrevents {

	public Furnace(SimplyPlugin plugin) {
		super(plugin);
	}

	@EventHandler(priority = EventPriority.LOWEST)
	public void furnace(InventoryOpenEvent event) {
		if (event.getInventory().getType() == InventoryType.FURNACE) {
			if (event.getPlayer() instanceof Player) {
				prevent(event, (Player) event.getPlayer(), "furnace,craft");
			}
		}
	}

}
