package eu.asangarin.mana.stat;

import org.bukkit.Material;

import net.Indyuce.mmoitems.stat.type.DoubleStat;

public class StaminaRegeneration extends DoubleStat {
	public StaminaRegeneration() {
		super("STAMINA_REGENERATION", Material.LIGHT_BLUE_DYE, "Stamina Regeneration", new String[]{"Increases stamina regen."});
	}
}
