package com.dasik.betterprogression

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents
import net.minecraft.core.component.DataComponentMap
import net.minecraft.core.component.DataComponents
import net.minecraft.world.item.Items
import net.minecraft.world.item.component.ItemAttributeModifiers
import org.slf4j.LoggerFactory

object BetterVanillaProgression : ModInitializer {
    const val MOD_ID = "lazy-gold-progression"
    private val logger = LoggerFactory.getLogger(MOD_ID)

    override fun onInitialize() {
        logger.info("Better Vanilla Progression loading...")
        ModConfig.load()
        registerItemModifications()
        logger.info("Better Vanilla Progression loaded!")
    }
    
    private fun registerItemModifications() {
        DefaultItemComponentEvents.MODIFY.register { context ->
            val config = ModConfig.config
            
            // Modify Gold Tool Durability
            context.modify(Items.GOLDEN_SWORD) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.goldToolDurability)
            }
            context.modify(Items.GOLDEN_PICKAXE) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.goldToolDurability)
            }
            context.modify(Items.GOLDEN_AXE) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.goldToolDurability)
            }
            context.modify(Items.GOLDEN_SHOVEL) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.goldToolDurability)
            }
            context.modify(Items.GOLDEN_HOE) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.goldToolDurability)
            }
            
            // Modify Diamond Tool Durability
            context.modify(Items.DIAMOND_SWORD) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.diamondToolDurability)
            }
            context.modify(Items.DIAMOND_PICKAXE) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.diamondToolDurability)
            }
            context.modify(Items.DIAMOND_AXE) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.diamondToolDurability)
            }
            context.modify(Items.DIAMOND_SHOVEL) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.diamondToolDurability)
            }
            context.modify(Items.DIAMOND_HOE) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.diamondToolDurability)
            }
            
            // Modify Netherite Tool Durability
            context.modify(Items.NETHERITE_SWORD) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.netheriteToolDurability)
            }
            context.modify(Items.NETHERITE_PICKAXE) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.netheriteToolDurability)
            }
            context.modify(Items.NETHERITE_AXE) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.netheriteToolDurability)
            }
            context.modify(Items.NETHERITE_SHOVEL) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.netheriteToolDurability)
            }
            context.modify(Items.NETHERITE_HOE) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.netheriteToolDurability)
            }
            
            // Modify other tool durabilities
            context.modify(Items.WOODEN_SWORD) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.woodToolDurability)
            }
            context.modify(Items.WOODEN_PICKAXE) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.woodToolDurability)
            }
            context.modify(Items.WOODEN_AXE) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.woodToolDurability)
            }
            context.modify(Items.WOODEN_SHOVEL) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.woodToolDurability)
            }
            context.modify(Items.WOODEN_HOE) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.woodToolDurability)
            }
            
            context.modify(Items.STONE_SWORD) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.stoneToolDurability)
            }
            context.modify(Items.STONE_PICKAXE) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.stoneToolDurability)
            }
            context.modify(Items.STONE_AXE) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.stoneToolDurability)
            }
            context.modify(Items.STONE_SHOVEL) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.stoneToolDurability)
            }
            context.modify(Items.STONE_HOE) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.stoneToolDurability)
            }
            
            context.modify(Items.IRON_SWORD) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.ironToolDurability)
            }
            context.modify(Items.IRON_PICKAXE) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.ironToolDurability)
            }
            context.modify(Items.IRON_AXE) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.ironToolDurability)
            }
            context.modify(Items.IRON_SHOVEL) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.ironToolDurability)
            }
            context.modify(Items.IRON_HOE) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, config.ironToolDurability)
            }
            
            // Gold Armor Durability
            context.modify(Items.GOLDEN_HELMET) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, 300)
            }
            context.modify(Items.GOLDEN_CHESTPLATE) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, 300)
            }
            context.modify(Items.GOLDEN_LEGGINGS) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, 300)
            }
            context.modify(Items.GOLDEN_BOOTS) { builder ->
                builder.set(DataComponents.MAX_DAMAGE, 300)
            }
        }
        
        logger.info("Registered item component modifications")
    }
}
