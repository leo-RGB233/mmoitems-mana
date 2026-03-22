package eu.asangarin.mana.stat;

import org.bukkit.Material;

import net.Indyuce.mmoitems.stat.type.DoubleStat;

public class ManaRegeneration extends DoubleStat {
	public ManaRegeneration() {
		super("MANA_REGENERATION", Material.LAPIS_LAZULI, "Mana Regeneration", new String[]{"Increases mana regen."});
	}
}
