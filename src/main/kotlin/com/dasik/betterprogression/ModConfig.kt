package com.dasik.betterprogression

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import net.fabricmc.loader.api.FabricLoader
import java.nio.file.Files
import java.nio.file.Path

object ModConfig {
    private val gson: Gson = GsonBuilder().setPrettyPrinting().create()
    private val configPath: Path = FabricLoader.getInstance().configDir.resolve("lazy-gold-progression.json")

    var config: ConfigData = ConfigData()
        private set

    fun load() {
        if (Files.exists(configPath)) {
            try {
                val json = Files.readString(configPath)
                config = gson.fromJson(json, ConfigData::class.java)
            } catch (e: Exception) {
                println("Failed to load config, using defaults: ${e.message}")
                config = ConfigData()
                save()
            }
        } else {
            config = ConfigData()
            save()
        }
    }

    fun save() {
        try {
            Files.writeString(configPath, gson.toJson(config))
        } catch (e: Exception) {
            println("Failed to save config: ${e.message}")
        }
    }

    data class ConfigData(
        // Tool Durability
        val woodToolDurability: Int = 100,
        val stoneToolDurability: Int = 200,
        val copperToolDurability: Int = 250,
        val ironToolDurability: Int = 500,
        val goldToolDurability: Int = 1500,
        val diamondToolDurability: Int = 2000,
        val netheriteToolDurability: Int = 3000,

        // Mining Speed
        val woodMiningSpeed: Float = 2.0f,
        val stoneMiningSpeed: Float = 4.0f,
        val copperMiningSpeed: Float = 5.0f,
        val ironMiningSpeed: Float = 6.0f,
        val goldMiningSpeed: Float = 8.0f,
        val diamondMiningSpeed: Float = 12.0f,
        val netheriteMiningSpeed: Float = 14.0f,

        // Tool Enchantability
        val woodToolEnchantability: Int = 15,
        val stoneToolEnchantability: Int = 5,
        val copperToolEnchantability: Int = 13,
        val ironToolEnchantability: Int = 14,
        val goldToolEnchantability: Int = 22,
        val diamondToolEnchantability: Int = 25,
        val netheriteToolEnchantability: Int = 30,

        // Sword Damage
        val woodSwordDamage: Float = 4f,
        val stoneSwordDamage: Float = 5f,
        val copperSwordDamage: Float = 6f,
        val ironSwordDamage: Float = 6f,
        val goldSwordDamage: Float = 7f,
        val diamondSwordDamage: Float = 8f,
        val netheriteSwordDamage: Float = 9f,

        // Pickaxe Damage
        val woodPickaxeDamage: Float = 2f,
        val stonePickaxeDamage: Float = 3f,
        val copperPickaxeDamage: Float = 3f,
        val ironPickaxeDamage: Float = 4f,
        val goldPickaxeDamage: Float = 5f,
        val diamondPickaxeDamage: Float = 6f,
        val netheritePickaxeDamage: Float = 7f,

        // Gold Armor Protection
        val goldHelmetProtection: Int = 2,
        val goldChestplateProtection: Int = 7,
        val goldLeggingsProtection: Int = 5,
        val goldBootsProtection: Int = 2,
        
        // Gold Armor Toughness
        val goldArmorToughness: Float = 1f,

        // Armor Enchantability
        val diamondArmorEnchantability: Int = 20,
        val netheriteArmorEnchantability: Int = 30
    )
}
