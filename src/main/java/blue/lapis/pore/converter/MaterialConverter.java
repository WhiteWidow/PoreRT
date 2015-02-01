/*
 * Pore
 * Copyright (c) 2014-2015, Lapis <https://github.com/LapisBlue>
 *
 * The MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package blue.lapis.pore.converter;

import com.google.common.base.Converter;
import org.bukkit.Material;
import org.spongepowered.api.block.BlockType;
import org.spongepowered.api.block.BlockTypes;
import org.spongepowered.api.item.ItemType;
import org.spongepowered.api.item.ItemTypes;

public final class MaterialConverter {

    public static final Converter<Material, BlockType> BLOCK_TYPE_CONVERTER =
            TypeConverter.<Material, BlockType>mapBuilder()
                    .add(Material.AIR, BlockTypes.AIR)
                    .add(Material.STONE, BlockTypes.STONE)
                    .add(Material.GRASS, BlockTypes.GRASS)
                    .add(Material.DIRT, BlockTypes.DIRT)
                    .add(Material.COBBLESTONE, BlockTypes.COBBLESTONE)
                    .add(Material.WOOD, BlockTypes.PLANKS)
                    .add(Material.SAPLING, BlockTypes.SAPLING)
                    .add(Material.BEDROCK, BlockTypes.BEDROCK)
                    .add(Material.WATER, BlockTypes.FLOWING_WATER)
                    .add(Material.STATIONARY_WATER, BlockTypes.WATER)
                    .add(Material.LAVA, BlockTypes.FLOWING_LAVA)
                    .add(Material.STATIONARY_LAVA, BlockTypes.LAVA)
                    .add(Material.SAND, BlockTypes.SAND)
                    .add(Material.GRAVEL, BlockTypes.GRAVEL)
                    .add(Material.GOLD_ORE, BlockTypes.GOLD_ORE)
                    .add(Material.IRON_ORE, BlockTypes.IRON_ORE)
                    .add(Material.COAL_ORE, BlockTypes.COAL_ORE)
                    .add(Material.LOG, BlockTypes.LOG)
                    .add(Material.LOG_2, BlockTypes.LOG2)
                    .add(Material.LEAVES, BlockTypes.LEAVES)
                    .add(Material.LEAVES_2, BlockTypes.LEAVES2)
                    .add(Material.SPONGE, BlockTypes.SPONGE)
                    .add(Material.GLASS, BlockTypes.GLASS)
                    .add(Material.LAPIS_ORE, BlockTypes.LAPIS_ORE)
                    .add(Material.LAPIS_BLOCK, BlockTypes.LAPIS_BLOCK)
                    .add(Material.DISPENSER, BlockTypes.DISPENSER)
                    .add(Material.SANDSTONE, BlockTypes.SANDSTONE)
                    .add(Material.NOTE_BLOCK, BlockTypes.NOTEBLOCK)
                    .add(Material.BED, BlockTypes.BED)
                    .add(Material.POWERED_RAIL, BlockTypes.GOLDEN_RAIL)
                    .add(Material.DETECTOR_RAIL, BlockTypes.DETECTOR_RAIL)
                    .add(Material.PISTON_STICKY_BASE, BlockTypes.STICKY_PISTON)
                    .add(Material.WEB, BlockTypes.WEB)
                    .add(Material.LONG_GRASS, BlockTypes.TALLGRASS)
                    .add(Material.DEAD_BUSH, BlockTypes.DEADBUSH)
                    .add(Material.PISTON_BASE, BlockTypes.PISTON)
                    .add(Material.PISTON_MOVING_PIECE, BlockTypes.PISTON_HEAD)
                    .add(Material.WOOL, BlockTypes.WOOL)
                    .add(Material.PISTON_EXTENSION, BlockTypes.PISTON_EXTENSION)
                    .add(Material.YELLOW_FLOWER, BlockTypes.YELLOW_FLOWER)
                    .add(Material.RED_ROSE, BlockTypes.RED_FLOWER)
                    .add(Material.BROWN_MUSHROOM, BlockTypes.BROWN_MUSHROOM)
                    .add(Material.RED_MUSHROOM, BlockTypes.RED_MUSHROOM)
                    .add(Material.GOLD_BLOCK, BlockTypes.GOLD_BLOCK)
                    .add(Material.IRON_BLOCK, BlockTypes.IRON_BLOCK)
                    .add(Material.DOUBLE_STEP, BlockTypes.DOUBLE_STONE_SLAB)
                    .add(Material.STEP, BlockTypes.STONE_SLAB)
                    .add(Material.BRICK, BlockTypes.BRICK_BLOCK)
                    .add(Material.TNT, BlockTypes.TNT)
                    .add(Material.BOOKSHELF, BlockTypes.BOOKSHELF)
                    .add(Material.MOSSY_COBBLESTONE, BlockTypes.MOSSY_COBBLESTONE)
                    .add(Material.OBSIDIAN, BlockTypes.OBSIDIAN)
                    .add(Material.TORCH, BlockTypes.TORCH)
                    .add(Material.FIRE, BlockTypes.FIRE)
                    .add(Material.MOB_SPAWNER, BlockTypes.MOB_SPAWNER)
                    .add(Material.WOOD_STAIRS, BlockTypes.OAK_STAIRS)
                    .add(Material.CHEST, BlockTypes.CHEST)
                    .add(Material.REDSTONE_WIRE, BlockTypes.REDSTONE_WIRE)
                    .add(Material.DIAMOND_ORE, BlockTypes.DIAMOND_ORE)
                    .add(Material.DIAMOND_BLOCK, BlockTypes.DIAMOND_BLOCK)
                    .add(Material.WORKBENCH, BlockTypes.CRAFTING_TABLE)
                    .add(Material.CROPS, BlockTypes.WHEAT)
                    .add(Material.SOIL, BlockTypes.FARMLAND)
                    .add(Material.FURNACE, BlockTypes.FURNACE)
                    .add(Material.BURNING_FURNACE, BlockTypes.LIT_FURNACE)
                    .add(Material.SIGN_POST, BlockTypes.STANDING_SIGN)
                    .add(Material.WOODEN_DOOR, BlockTypes.WOODEN_DOOR)
                    .add(Material.SPRUCE_DOOR, BlockTypes.SPRUCE_DOOR)
                    .add(Material.BIRCH_DOOR, BlockTypes.BIRCH_DOOR)
                    .add(Material.JUNGLE_DOOR, BlockTypes.JUNGLE_DOOR)
                    .add(Material.ACACIA_DOOR, BlockTypes.ACACIA_DOOR)
                    .add(Material.DARK_OAK_DOOR, BlockTypes.DARK_OAK_DOOR)
                    .add(Material.LADDER, BlockTypes.LADDER)
                    .add(Material.RAILS, BlockTypes.RAIL)
                    .add(Material.COBBLESTONE_STAIRS, BlockTypes.STONE_STAIRS)
                    .add(Material.WALL_SIGN, BlockTypes.WALL_SIGN)
                    .add(Material.LEVER, BlockTypes.LEVER)
                    .add(Material.STONE_PLATE, BlockTypes.STONE_PRESSURE_PLATE)
                    .add(Material.IRON_DOOR_BLOCK, BlockTypes.IRON_DOOR)
                    .add(Material.WOOD_PLATE, BlockTypes.WOODEN_PRESSURE_PLATE)
                    .add(Material.REDSTONE_ORE, BlockTypes.REDSTONE_ORE)
                    .add(Material.GLOWING_REDSTONE_ORE, BlockTypes.LIT_REDSTONE_ORE)
                    .add(Material.REDSTONE_TORCH_OFF, BlockTypes.UNLIT_REDSTONE_TORCH)
                    .add(Material.REDSTONE_TORCH_ON, BlockTypes.REDSTONE_TORCH)
                    .add(Material.STONE_BUTTON, BlockTypes.STONE_BUTTON)
                    .add(Material.SNOW, BlockTypes.SNOW_LAYER)
                    .add(Material.ICE, BlockTypes.ICE)
                    .add(Material.SNOW_BLOCK, BlockTypes.SNOW)
                    .add(Material.CACTUS, BlockTypes.CACTUS)
                    .add(Material.CLAY, BlockTypes.CLAY)
                    .add(Material.SUGAR_CANE_BLOCK, BlockTypes.REEDS)
                    .add(Material.JUKEBOX, BlockTypes.JUKEBOX)
                    .add(Material.FENCE, BlockTypes.FENCE)
                    .add(Material.SPRUCE_FENCE, BlockTypes.SPRUCE_FENCE)
                    .add(Material.BIRCH_FENCE, BlockTypes.BIRCH_FENCE)
                    .add(Material.JUNGLE_FENCE, BlockTypes.JUNGLE_FENCE)
                    .add(Material.DARK_OAK_FENCE, BlockTypes.DARK_OAK_FENCE)
                    .add(Material.ACACIA_FENCE, BlockTypes.ACACIA_FENCE)
                    .add(Material.PUMPKIN, BlockTypes.PUMPKIN)
                    .add(Material.NETHERRACK, BlockTypes.NETHERRACK)
                    .add(Material.SOUL_SAND, BlockTypes.SOUL_SAND)
                    .add(Material.GLOWSTONE, BlockTypes.GLOWSTONE)
                    .add(Material.PORTAL, BlockTypes.PORTAL)
                    .add(Material.JACK_O_LANTERN, BlockTypes.LIT_PUMPKIN)
                    .add(Material.CAKE_BLOCK, BlockTypes.CAKE)
                    .add(Material.DIODE_BLOCK_OFF, BlockTypes.UNPOWERED_REPEATER)
                    .add(Material.DIODE_BLOCK_ON, BlockTypes.POWERED_REPEATER)
                    .add(Material.TRAP_DOOR, BlockTypes.TRAPDOOR)
                    .add(Material.MONSTER_EGGS, BlockTypes.MONSTER_EGG)
                    .add(Material.SMOOTH_BRICK, BlockTypes.STONEBRICK)
                    .add(Material.HUGE_MUSHROOM_1, BlockTypes.BROWN_MUSHROOM_BLOCK)
                    .add(Material.HUGE_MUSHROOM_2, BlockTypes.RED_MUSHROOM_BLOCK)
                    .add(Material.IRON_FENCE, BlockTypes.IRON_BARS)
                    .add(Material.THIN_GLASS, BlockTypes.GLASS_PANE)
                    .add(Material.MELON_BLOCK, BlockTypes.MELON_BLOCK)
                    .add(Material.PUMPKIN_STEM, BlockTypes.PUMPKIN_STEM)
                    .add(Material.MELON_STEM, BlockTypes.MELON_STEM)
                    .add(Material.VINE, BlockTypes.VINE)
                    .add(Material.FENCE_GATE, BlockTypes.FENCE_GATE)
                    .add(Material.SPRUCE_FENCE_GATE, BlockTypes.SPRUCE_FENCE_GATE)
                    .add(Material.BIRCH_FENCE_GATE, BlockTypes.BIRCH_FENCE_GATE)
                    .add(Material.JUNGLE_FENCE_GATE, BlockTypes.JUNGLE_FENCE_GATE)
                    .add(Material.DARK_OAK_FENCE_GATE, BlockTypes.DARK_OAK_FENCE_GATE)
                    .add(Material.ACACIA_FENCE_GATE, BlockTypes.ACACIA_FENCE_GATE)
                    .add(Material.BRICK_STAIRS, BlockTypes.BRICK_STAIRS)
                    .add(Material.SMOOTH_STAIRS, BlockTypes.STONE_BRICK_STAIRS)
                    .add(Material.MYCEL, BlockTypes.MYCELIUM)
                    .add(Material.WATER_LILY, BlockTypes.WATERLILY)
                    .add(Material.NETHER_BRICK, BlockTypes.NETHER_BRICK)
                    .add(Material.NETHER_FENCE, BlockTypes.NETHER_BRICK_FENCE)
                    .add(Material.NETHER_BRICK_STAIRS, BlockTypes.NETHER_BRICK_STAIRS)
                    .add(Material.NETHER_STALK, BlockTypes.NETHER_WART)
                    .add(Material.ENCHANTMENT_TABLE, BlockTypes.ENCHANTING_TABLE)
                    .add(Material.BREWING_STAND, BlockTypes.BREWING_STAND)
                    .add(Material.CAULDRON, BlockTypes.CAULDRON)
                    .add(Material.ENDER_PORTAL, BlockTypes.END_PORTAL)
                    .add(Material.ENDER_PORTAL_FRAME, BlockTypes.END_PORTAL_FRAME)
                    .add(Material.ENDER_STONE, BlockTypes.END_STONE)
                    .add(Material.DRAGON_EGG, BlockTypes.DRAGON_EGG)
                    .add(Material.REDSTONE_LAMP_OFF, BlockTypes.REDSTONE_LAMP)
                    .add(Material.REDSTONE_LAMP_ON, BlockTypes.LIT_REDSTONE_LAMP)
                    .add(Material.WOOD_DOUBLE_STEP, BlockTypes.DOUBLE_WOODEN_SLAB)
                    .add(Material.WOOD_STEP, BlockTypes.WOODEN_SLAB)
                    .add(Material.COCOA, BlockTypes.COCOA)
                    .add(Material.SANDSTONE_STAIRS, BlockTypes.SANDSTONE_STAIRS)
                    .add(Material.EMERALD_ORE, BlockTypes.EMERALD_ORE)
                    .add(Material.ENDER_CHEST, BlockTypes.ENDER_CHEST)
                    .add(Material.TRIPWIRE_HOOK, BlockTypes.TRIPWIRE_HOOK)
                    .add(Material.TRIPWIRE, BlockTypes.TRIPWIRE)
                    .add(Material.EMERALD_BLOCK, BlockTypes.EMERALD_BLOCK)
                    .add(Material.SPRUCE_WOOD_STAIRS, BlockTypes.SPRUCE_STAIRS)
                    .add(Material.BIRCH_WOOD_STAIRS, BlockTypes.BIRCH_STAIRS)
                    .add(Material.JUNGLE_WOOD_STAIRS, BlockTypes.JUNGLE_STAIRS)
                    .add(Material.COMMAND, BlockTypes.COMMAND_BLOCK)
                    .add(Material.BEACON, BlockTypes.BEACON)
                    .add(Material.COBBLE_WALL, BlockTypes.COBBLESTONE_WALL)
                    .add(Material.FLOWER_POT, BlockTypes.FLOWER_POT)
                    .add(Material.CARROT, BlockTypes.CARROTS)
                    .add(Material.POTATO, BlockTypes.POTATOES)
                    .add(Material.WOOD_BUTTON, BlockTypes.WOODEN_BUTTON)
                    .add(Material.SKULL, BlockTypes.SKULL)
                    .add(Material.ANVIL, BlockTypes.ANVIL)
                    .add(Material.TRAPPED_CHEST, BlockTypes.TRAPPED_CHEST)
                    .add(Material.GOLD_PLATE, BlockTypes.LIGHT_WEIGHTED_PRESSURE_PLATE)
                    .add(Material.IRON_PLATE, BlockTypes.HEAVY_WEIGHTED_PRESSURE_PLATE)
                    .add(Material.REDSTONE_COMPARATOR_OFF, BlockTypes.UNPOWERED_COMPARATOR)
                    .add(Material.REDSTONE_COMPARATOR_ON, BlockTypes.POWERED_COMPARATOR)
                    .add(Material.DAYLIGHT_DETECTOR, BlockTypes.DAYLIGHT_DETECTOR)
                    .add(Material.DAYLIGHT_DETECTOR_INVERTED, BlockTypes.DAYLIGHT_DETECTOR_INVERTED)
                    .add(Material.REDSTONE_BLOCK, BlockTypes.REDSTONE_BLOCK)
                    .add(Material.QUARTZ_ORE, BlockTypes.QUARTZ_ORE)
                    .add(Material.HOPPER, BlockTypes.HOPPER)
                    .add(Material.QUARTZ_BLOCK, BlockTypes.QUARTZ_BLOCK)
                    .add(Material.QUARTZ_STAIRS, BlockTypes.QUARTZ_STAIRS)
                    .add(Material.ACTIVATOR_RAIL, BlockTypes.ACTIVATOR_RAIL)
                    .add(Material.DROPPER, BlockTypes.DROPPER)
                    .add(Material.STAINED_CLAY, BlockTypes.STAINED_HARDENED_CLAY)
                    .add(Material.BARRIER, BlockTypes.BARRIER)
                    .add(Material.IRON_TRAPDOOR, BlockTypes.IRON_TRAPDOOR)
                    .add(Material.HAY_BLOCK, BlockTypes.HAY_BLOCK)
                    .add(Material.CARPET, BlockTypes.CARPET)
                    .add(Material.HARD_CLAY, BlockTypes.HARDENED_CLAY)
                    .add(Material.COAL_BLOCK, BlockTypes.COAL_BLOCK)
                    .add(Material.PACKED_ICE, BlockTypes.PACKED_ICE)
                    .add(Material.ACACIA_STAIRS, BlockTypes.ACACIA_STAIRS)
                    .add(Material.DARK_OAK_STAIRS, BlockTypes.DARK_OAK_STAIRS)
                    .add(Material.SLIME_BLOCK, BlockTypes.SLIME)
                    .add(Material.DOUBLE_PLANT, BlockTypes.DOUBLE_PLANT)
                    .add(Material.STAINED_GLASS, BlockTypes.STAINED_GLASS)
                    .add(Material.STAINED_GLASS_PANE, BlockTypes.STAINED_GLASS_PANE)
                    .add(Material.PRISMARINE, BlockTypes.PRISMARINE)
                    .add(Material.SEA_LANTERN, BlockTypes.SEA_LANTERN)
                    .add(Material.STANDING_BANNER, BlockTypes.STANDING_BANNER)
                    .add(Material.WALL_BANNER, BlockTypes.WALL_BANNER)
                    .add(Material.RED_SANDSTONE, BlockTypes.RED_SANDSTONE)
                    .add(Material.RED_SANDSTONE_STAIRS, BlockTypes.RED_SANDSTONE_STAIRS)
                    .add(Material.DOUBLE_STONE_SLAB2, BlockTypes.DOUBLE_STONE_SLAB2)
                    .add(Material.STONE_SLAB2, BlockTypes.STONE_SLAB2)
                    .build();

    public static BlockType asBlock(Material material) {
        return BLOCK_TYPE_CONVERTER.convert(material);
    }

    public static Material of(BlockType type) {
        return BLOCK_TYPE_CONVERTER.reverse().convert(type);
    }

    public static final Converter<Material, ItemType> ITEM_TYPE_CONVERTER =
            TypeConverter.<Material, ItemType>mapBuilder()
                    .add(Material.STONE, ItemTypes.STONE)
                    .add(Material.GRASS, ItemTypes.GRASS)
                    .add(Material.DIRT, ItemTypes.DIRT)
                    .add(Material.COBBLESTONE, ItemTypes.COBBLESTONE)
                    .add(Material.WOOD, ItemTypes.PLANKS)
                    .add(Material.SAPLING, ItemTypes.SAPLING)
                    .add(Material.BEDROCK, ItemTypes.BEDROCK)
                    .add(Material.SAND, ItemTypes.SAND)
                    .add(Material.GRAVEL, ItemTypes.GRAVEL)
                    .add(Material.GOLD_ORE, ItemTypes.GOLD_ORE)
                    .add(Material.IRON_ORE, ItemTypes.IRON_ORE)
                    .add(Material.COAL_ORE, ItemTypes.COAL_ORE)
                    .add(Material.LOG, ItemTypes.LOG)
                    .add(Material.LOG_2, ItemTypes.LOG2)
                    .add(Material.LEAVES, ItemTypes.LEAVES)
                    .add(Material.LEAVES_2, ItemTypes.LEAVES2)
                    .add(Material.SPONGE, ItemTypes.SPONGE)
                    .add(Material.GLASS, ItemTypes.GLASS)
                    .add(Material.LAPIS_ORE, ItemTypes.LAPIS_ORE)
                    .add(Material.LAPIS_BLOCK, ItemTypes.LAPIS_BLOCK)
                    .add(Material.DISPENSER, ItemTypes.DISPENSER)
                    .add(Material.SANDSTONE, ItemTypes.SANDSTONE)
                    .add(Material.NOTE_BLOCK, ItemTypes.NOTEBLOCK)
                    .add(Material.POWERED_RAIL, ItemTypes.GOLDEN_RAIL)
                    .add(Material.DETECTOR_RAIL, ItemTypes.DETECTOR_RAIL)
                    .add(Material.PISTON_STICKY_BASE, ItemTypes.STICKY_PISTON)
                    .add(Material.WEB, ItemTypes.WEB)
                    .add(Material.LONG_GRASS, ItemTypes.TALLGRASS)
                    .add(Material.DEAD_BUSH, ItemTypes.DEADBUSH)
                    .add(Material.PISTON_BASE, ItemTypes.PISTON)
                    .add(Material.WOOL, ItemTypes.WOOL)
                    .add(Material.YELLOW_FLOWER, ItemTypes.YELLOW_FLOWER)
                    .add(Material.RED_ROSE, ItemTypes.RED_FLOWER)
                    .add(Material.BROWN_MUSHROOM, ItemTypes.BROWN_MUSHROOM)
                    .add(Material.RED_MUSHROOM, ItemTypes.RED_MUSHROOM)
                    .add(Material.GOLD_BLOCK, ItemTypes.GOLD_BLOCK)
                    .add(Material.IRON_BLOCK, ItemTypes.IRON_BLOCK)
                    .add(Material.STEP, ItemTypes.STONE_SLAB)
                    .add(Material.BRICK, ItemTypes.BRICK_BLOCK)
                    .add(Material.TNT, ItemTypes.TNT)
                    .add(Material.BOOKSHELF, ItemTypes.BOOKSHELF)
                    .add(Material.MOSSY_COBBLESTONE, ItemTypes.MOSSY_COBBLESTONE)
                    .add(Material.OBSIDIAN, ItemTypes.OBSIDIAN)
                    .add(Material.TORCH, ItemTypes.TORCH)
                    .add(Material.MOB_SPAWNER, ItemTypes.MOB_SPAWNER)
                    .add(Material.WOOD_STAIRS, ItemTypes.OAK_STAIRS)
                    .add(Material.CHEST, ItemTypes.CHEST)
                    .add(Material.DIAMOND_ORE, ItemTypes.DIAMOND_ORE)
                    .add(Material.DIAMOND_BLOCK, ItemTypes.DIAMOND_BLOCK)
                    .add(Material.WORKBENCH, ItemTypes.CRAFTING_TABLE)
                    .add(Material.SOIL, ItemTypes.FARMLAND)
                    .add(Material.FURNACE, ItemTypes.FURNACE)
                    .add(Material.BURNING_FURNACE, ItemTypes.LIT_FURNACE)
                    .add(Material.LADDER, ItemTypes.LADDER)
                    .add(Material.RAILS, ItemTypes.RAIL)
                    .add(Material.COBBLESTONE_STAIRS, ItemTypes.STONE_STAIRS)
                    .add(Material.LEVER, ItemTypes.LEVER)
                    .add(Material.STONE_PLATE, ItemTypes.STONE_PRESSURE_PLATE)
                    .add(Material.WOOD_PLATE, ItemTypes.WOODEN_PRESSURE_PLATE)
                    .add(Material.REDSTONE_ORE, ItemTypes.REDSTONE_ORE)
                    .add(Material.REDSTONE_TORCH_ON, ItemTypes.REDSTONE_TORCH)
                    .add(Material.STONE_BUTTON, ItemTypes.STONE_BUTTON)
                    .add(Material.SNOW, ItemTypes.SNOW_LAYER)
                    .add(Material.ICE, ItemTypes.ICE)
                    .add(Material.SNOW_BLOCK, ItemTypes.SNOW)
                    .add(Material.CACTUS, ItemTypes.CACTUS)
                    .add(Material.CLAY, ItemTypes.CLAY)
                    .add(Material.JUKEBOX, ItemTypes.JUKEBOX)
                    .add(Material.FENCE, ItemTypes.FENCE)
                    .add(Material.SPRUCE_FENCE, ItemTypes.SPRUCE_FENCE)
                    .add(Material.BIRCH_FENCE, ItemTypes.BIRCH_FENCE)
                    .add(Material.JUNGLE_FENCE, ItemTypes.JUNGLE_FENCE)
                    .add(Material.DARK_OAK_FENCE, ItemTypes.DARK_OAK_FENCE)
                    .add(Material.ACACIA_FENCE, ItemTypes.ACACIA_FENCE)
                    .add(Material.PUMPKIN, ItemTypes.PUMPKIN)
                    .add(Material.NETHERRACK, ItemTypes.NETHERRACK)
                    .add(Material.SOUL_SAND, ItemTypes.SOUL_SAND)
                    .add(Material.GLOWSTONE, ItemTypes.GLOWSTONE)
                    .add(Material.JACK_O_LANTERN, ItemTypes.LIT_PUMPKIN)
                    .add(Material.TRAP_DOOR, ItemTypes.TRAPDOOR)
                    .add(Material.MONSTER_EGGS, ItemTypes.MONSTER_EGG)
                    .add(Material.SMOOTH_BRICK, ItemTypes.STONEBRICK)
                    .add(Material.HUGE_MUSHROOM_1, ItemTypes.BROWN_MUSHROOM_BLOCK)
                    .add(Material.HUGE_MUSHROOM_2, ItemTypes.RED_MUSHROOM_BLOCK)
                    .add(Material.IRON_FENCE, ItemTypes.IRON_BARS)
                    .add(Material.THIN_GLASS, ItemTypes.GLASS_PANE)
                    .add(Material.MELON_BLOCK, ItemTypes.MELON_BLOCK)
                    .add(Material.VINE, ItemTypes.VINE)
                    .add(Material.FENCE_GATE, ItemTypes.FENCE_GATE)
                    .add(Material.SPRUCE_FENCE_GATE, ItemTypes.SPRUCE_FENCE_GATE)
                    .add(Material.BIRCH_FENCE_GATE, ItemTypes.BIRCH_FENCE_GATE)
                    .add(Material.JUNGLE_FENCE_GATE, ItemTypes.JUNGLE_FENCE_GATE)
                    .add(Material.DARK_OAK_FENCE_GATE, ItemTypes.DARK_OAK_FENCE_GATE)
                    .add(Material.ACACIA_FENCE_GATE, ItemTypes.ACACIA_FENCE_GATE)
                    .add(Material.BRICK_STAIRS, ItemTypes.BRICK_STAIRS)
                    .add(Material.SMOOTH_STAIRS, ItemTypes.STONE_BRICK_STAIRS)
                    .add(Material.MYCEL, ItemTypes.MYCELIUM)
                    .add(Material.WATER_LILY, ItemTypes.WATERLILY)
                    .add(Material.NETHER_BRICK, ItemTypes.NETHER_BRICK)
                    .add(Material.NETHER_FENCE, ItemTypes.NETHER_BRICK_FENCE)
                    .add(Material.NETHER_BRICK_STAIRS, ItemTypes.NETHER_BRICK_STAIRS)
                    .add(Material.ENCHANTMENT_TABLE, ItemTypes.ENCHANTING_TABLE)
                    .add(Material.ENDER_PORTAL_FRAME, ItemTypes.END_PORTAL_FRAME)
                    .add(Material.ENDER_STONE, ItemTypes.END_STONE)
                    .add(Material.DRAGON_EGG, ItemTypes.DRAGON_EGG)
                    .add(Material.REDSTONE_LAMP_OFF, ItemTypes.REDSTONE_LAMP)
                    .add(Material.WOOD_STEP, ItemTypes.WOODEN_SLAB)
                    .add(Material.SANDSTONE_STAIRS, ItemTypes.SANDSTONE_STAIRS)
                    .add(Material.EMERALD_ORE, ItemTypes.EMERALD_ORE)
                    .add(Material.ENDER_CHEST, ItemTypes.ENDER_CHEST)
                    .add(Material.TRIPWIRE_HOOK, ItemTypes.TRIPWIRE_HOOK)
                    .add(Material.EMERALD_BLOCK, ItemTypes.EMERALD_BLOCK)
                    .add(Material.SPRUCE_WOOD_STAIRS, ItemTypes.SPRUCE_STAIRS)
                    .add(Material.BIRCH_WOOD_STAIRS, ItemTypes.BIRCH_STAIRS)
                    .add(Material.JUNGLE_WOOD_STAIRS, ItemTypes.JUNGLE_STAIRS)
                    .add(Material.COMMAND, ItemTypes.COMMAND_BLOCK)
                    .add(Material.BEACON, ItemTypes.BEACON)
                    .add(Material.COBBLE_WALL, ItemTypes.COBBLESTONE_WALL)
                    .add(Material.WOOD_BUTTON, ItemTypes.WOODEN_BUTTON)
                    .add(Material.ANVIL, ItemTypes.ANVIL)
                    .add(Material.TRAPPED_CHEST, ItemTypes.TRAPPED_CHEST)
                    .add(Material.GOLD_PLATE, ItemTypes.LIGHT_WEIGHTED_PRESSURE_PLATE)
                    .add(Material.IRON_PLATE, ItemTypes.HEAVY_WEIGHTED_PRESSURE_PLATE)
                    .add(Material.DAYLIGHT_DETECTOR, ItemTypes.DAYLIGHT_DETECTOR)
                    .add(Material.REDSTONE_BLOCK, ItemTypes.REDSTONE_BLOCK)
                    .add(Material.QUARTZ_ORE, ItemTypes.QUARTZ_ORE)
                    .add(Material.HOPPER, ItemTypes.HOPPER)
                    .add(Material.QUARTZ_BLOCK, ItemTypes.QUARTZ_BLOCK)
                    .add(Material.QUARTZ_STAIRS, ItemTypes.QUARTZ_STAIRS)
                    .add(Material.ACTIVATOR_RAIL, ItemTypes.ACTIVATOR_RAIL)
                    .add(Material.DROPPER, ItemTypes.DROPPER)
                    .add(Material.STAINED_CLAY, ItemTypes.STAINED_HARDENED_CLAY)
                    .add(Material.BARRIER, ItemTypes.BARRIER)
                    .add(Material.IRON_TRAPDOOR, ItemTypes.IRON_TRAPDOOR)
                    .add(Material.HAY_BLOCK, ItemTypes.HAY_BLOCK)
                    .add(Material.CARPET, ItemTypes.CARPET)
                    .add(Material.HARD_CLAY, ItemTypes.HARDENED_CLAY)
                    .add(Material.COAL_BLOCK, ItemTypes.COAL_BLOCK)
                    .add(Material.PACKED_ICE, ItemTypes.PACKED_ICE)
                    .add(Material.ACACIA_STAIRS, ItemTypes.ACACIA_STAIRS)
                    .add(Material.DARK_OAK_STAIRS, ItemTypes.DARK_OAK_STAIRS)
                    .add(Material.SLIME_BLOCK, ItemTypes.SLIME)
                    .add(Material.DOUBLE_PLANT, ItemTypes.DOUBLE_PLANT)
                    .add(Material.STAINED_GLASS, ItemTypes.STAINED_GLASS)
                    .add(Material.STAINED_GLASS_PANE, ItemTypes.STAINED_GLASS_PANE)
                    .add(Material.PRISMARINE, ItemTypes.PRISMARINE)
                    .add(Material.SEA_LANTERN, ItemTypes.SEA_LANTERN)
                    .add(Material.RED_SANDSTONE, ItemTypes.RED_SANDSTONE)
                    .add(Material.RED_SANDSTONE_STAIRS, ItemTypes.RED_SANDSTONE_STAIRS)
                    .add(Material.STONE_SLAB2, ItemTypes.STONE_SLAB2)
                    .add(Material.IRON_SPADE, ItemTypes.IRON_SHOVEL)
                    .add(Material.IRON_PICKAXE, ItemTypes.IRON_PICKAXE)
                    .add(Material.IRON_AXE, ItemTypes.IRON_AXE)
                    .add(Material.FLINT_AND_STEEL, ItemTypes.FLINT_AND_STEEL)
                    .add(Material.APPLE, ItemTypes.APPLE)
                    .add(Material.BOW, ItemTypes.BOW)
                    .add(Material.ARROW, ItemTypes.ARROW)
                    .add(Material.COAL, ItemTypes.COAL)
                    .add(Material.DIAMOND, ItemTypes.DIAMOND)
                    .add(Material.IRON_INGOT, ItemTypes.IRON_INGOT)
                    .add(Material.GOLD_INGOT, ItemTypes.GOLD_INGOT)
                    .add(Material.IRON_SWORD, ItemTypes.IRON_SWORD)
                    .add(Material.WOOD_SWORD, ItemTypes.WOODEN_SWORD)
                    .add(Material.WOOD_SPADE, ItemTypes.WOODEN_SHOVEL)
                    .add(Material.WOOD_PICKAXE, ItemTypes.WOODEN_PICKAXE)
                    .add(Material.WOOD_AXE, ItemTypes.WOODEN_AXE)
                    .add(Material.STONE_SWORD, ItemTypes.STONE_SWORD)
                    .add(Material.STONE_SPADE, ItemTypes.STONE_SHOVEL)
                    .add(Material.STONE_PICKAXE, ItemTypes.STONE_PICKAXE)
                    .add(Material.STONE_AXE, ItemTypes.STONE_AXE)
                    .add(Material.DIAMOND_SWORD, ItemTypes.DIAMOND_SWORD)
                    .add(Material.DIAMOND_SPADE, ItemTypes.DIAMOND_SHOVEL)
                    .add(Material.DIAMOND_PICKAXE, ItemTypes.DIAMOND_PICKAXE)
                    .add(Material.DIAMOND_AXE, ItemTypes.DIAMOND_AXE)
                    .add(Material.STICK, ItemTypes.STICK)
                    .add(Material.BOWL, ItemTypes.BOWL)
                    .add(Material.MUSHROOM_SOUP, ItemTypes.MUSHROOM_STEW)
                    .add(Material.GOLD_SWORD, ItemTypes.GOLDEN_SWORD)
                    .add(Material.GOLD_SPADE, ItemTypes.GOLDEN_SHOVEL)
                    .add(Material.GOLD_PICKAXE, ItemTypes.GOLDEN_PICKAXE)
                    .add(Material.GOLD_AXE, ItemTypes.GOLDEN_AXE)
                    .add(Material.STRING, ItemTypes.STRING)
                    .add(Material.FEATHER, ItemTypes.FEATHER)
                    .add(Material.SULPHUR, ItemTypes.GUNPOWDER)
                    .add(Material.WOOD_HOE, ItemTypes.WOODEN_HOE)
                    .add(Material.STONE_HOE, ItemTypes.STONE_HOE)
                    .add(Material.IRON_HOE, ItemTypes.IRON_HOE)
                    .add(Material.DIAMOND_HOE, ItemTypes.DIAMOND_HOE)
                    .add(Material.GOLD_HOE, ItemTypes.GOLDEN_HOE)
                    .add(Material.SEEDS, ItemTypes.WHEAT_SEEDS)
                    .add(Material.WHEAT, ItemTypes.WHEAT)
                    .add(Material.BREAD, ItemTypes.BREAD)
                    .add(Material.LEATHER_HELMET, ItemTypes.LEATHER_HELMET)
                    .add(Material.LEATHER_CHESTPLATE, ItemTypes.LEATHER_CHESTPLATE)
                    .add(Material.LEATHER_LEGGINGS, ItemTypes.LEATHER_LEGGINGS)
                    .add(Material.LEATHER_BOOTS, ItemTypes.LEATHER_BOOTS)
                    .add(Material.CHAINMAIL_HELMET, ItemTypes.CHAINMAIL_HELMET)
                    .add(Material.CHAINMAIL_CHESTPLATE, ItemTypes.CHAINMAIL_CHESTPLATE)
                    .add(Material.CHAINMAIL_LEGGINGS, ItemTypes.CHAINMAIL_LEGGINGS)
                    .add(Material.CHAINMAIL_BOOTS, ItemTypes.CHAINMAIL_BOOTS)
                    .add(Material.IRON_HELMET, ItemTypes.IRON_HELMET)
                    .add(Material.IRON_CHESTPLATE, ItemTypes.IRON_CHESTPLATE)
                    .add(Material.IRON_LEGGINGS, ItemTypes.IRON_LEGGINGS)
                    .add(Material.IRON_BOOTS, ItemTypes.IRON_BOOTS)
                    .add(Material.DIAMOND_HELMET, ItemTypes.DIAMOND_HELMET)
                    .add(Material.DIAMOND_CHESTPLATE, ItemTypes.DIAMOND_CHESTPLATE)
                    .add(Material.DIAMOND_LEGGINGS, ItemTypes.DIAMOND_LEGGINGS)
                    .add(Material.DIAMOND_BOOTS, ItemTypes.DIAMOND_BOOTS)
                    .add(Material.GOLD_HELMET, ItemTypes.GOLDEN_HELMET)
                    .add(Material.GOLD_CHESTPLATE, ItemTypes.GOLDEN_CHESTPLATE)
                    .add(Material.GOLD_LEGGINGS, ItemTypes.GOLDEN_LEGGINGS)
                    .add(Material.GOLD_BOOTS, ItemTypes.GOLDEN_BOOTS)
                    .add(Material.FLINT, ItemTypes.FLINT)
                    .add(Material.PORK, ItemTypes.PORKCHOP)
                    .add(Material.GRILLED_PORK, ItemTypes.COOKED_PORKCHOP)
                    .add(Material.PAINTING, ItemTypes.PAINTING)
                    .add(Material.GOLDEN_APPLE, ItemTypes.GOLDEN_APPLE)
                    .add(Material.SIGN, ItemTypes.SIGN)
                    .add(Material.WOOD_DOOR, ItemTypes.WOODEN_DOOR)
                    .add(Material.BUCKET, ItemTypes.BUCKET)
                    .add(Material.WATER_BUCKET, ItemTypes.WATER_BUCKET)
                    .add(Material.LAVA_BUCKET, ItemTypes.LAVA_BUCKET)
                    .add(Material.MINECART, ItemTypes.MINECART)
                    .add(Material.SADDLE, ItemTypes.SADDLE)
                    .add(Material.IRON_DOOR, ItemTypes.IRON_DOOR)
                    .add(Material.REDSTONE, ItemTypes.REDSTONE)
                    .add(Material.SNOW_BALL, ItemTypes.SNOWBALL)
                    .add(Material.BOAT, ItemTypes.BOAT)
                    .add(Material.LEATHER, ItemTypes.LEATHER)
                    .add(Material.MILK_BUCKET, ItemTypes.MILK_BUCKET)
                    .add(Material.CLAY_BRICK, ItemTypes.BRICK)
                    .add(Material.CLAY_BALL, ItemTypes.CLAY_BALL)
                    .add(Material.SUGAR_CANE, ItemTypes.REEDS)
                    .add(Material.PAPER, ItemTypes.PAPER)
                    .add(Material.BOOK, ItemTypes.BOOK)
                    .add(Material.SLIME_BALL, ItemTypes.SLIME_BALL)
                    .add(Material.STORAGE_MINECART, ItemTypes.CHEST_MINECART)
                    .add(Material.POWERED_MINECART, ItemTypes.FURNACE_MINECART)
                    .add(Material.EGG, ItemTypes.EGG)
                    .add(Material.COMPASS, ItemTypes.COMPASS)
                    .add(Material.FISHING_ROD, ItemTypes.FISHING_ROD)
                    .add(Material.WATCH, ItemTypes.CLOCK)
                    .add(Material.GLOWSTONE_DUST, ItemTypes.GLOWSTONE_DUST)
                    .add(Material.RAW_FISH, ItemTypes.FISH)
                    .add(Material.COOKED_FISH, ItemTypes.COOKED_FISH)
                    .add(Material.INK_SACK, ItemTypes.DYE)
                    .add(Material.BONE, ItemTypes.BONE)
                    .add(Material.SUGAR, ItemTypes.SUGAR)
                    .add(Material.CAKE, ItemTypes.CAKE)
                    .add(Material.BED, ItemTypes.BED)
                    .add(Material.DIODE, ItemTypes.REPEATER)
                    .add(Material.COOKIE, ItemTypes.COOKIE)
                    .add(Material.MAP, ItemTypes.FILLED_MAP)
                    .add(Material.SHEARS, ItemTypes.SHEARS)
                    .add(Material.MELON, ItemTypes.MELON)
                    .add(Material.PUMPKIN_SEEDS, ItemTypes.PUMPKIN_SEEDS)
                    .add(Material.MELON_SEEDS, ItemTypes.MELON_SEEDS)
                    .add(Material.RAW_BEEF, ItemTypes.BEEF)
                    .add(Material.COOKED_BEEF, ItemTypes.COOKED_BEEF)
                    .add(Material.RAW_CHICKEN, ItemTypes.CHICKEN)
                    .add(Material.COOKED_CHICKEN, ItemTypes.COOKED_CHICKEN)
                    .add(Material.ROTTEN_FLESH, ItemTypes.ROTTEN_FLESH)
                    .add(Material.ENDER_PEARL, ItemTypes.ENDER_PEARL)
                    .add(Material.BLAZE_ROD, ItemTypes.BLAZE_ROD)
                    .add(Material.GHAST_TEAR, ItemTypes.GHAST_TEAR)
                    .add(Material.GOLD_NUGGET, ItemTypes.GOLD_NUGGET)
                    .add(Material.NETHER_WARTS, ItemTypes.NETHER_WART)
                    .add(Material.POTION, ItemTypes.POTION)
                    .add(Material.GLASS_BOTTLE, ItemTypes.GLASS_BOTTLE)
                    .add(Material.SPIDER_EYE, ItemTypes.SPIDER_EYE)
                    .add(Material.FERMENTED_SPIDER_EYE, ItemTypes.FERMENTED_SPIDER_EYE)
                    .add(Material.BLAZE_POWDER, ItemTypes.BLAZE_POWDER)
                    .add(Material.MAGMA_CREAM, ItemTypes.MAGMA_CREAM)
                    .add(Material.BREWING_STAND_ITEM, ItemTypes.BREWING_STAND)
                    .add(Material.CAULDRON_ITEM, ItemTypes.CAULDRON)
                    .add(Material.EYE_OF_ENDER, ItemTypes.ENDER_EYE)
                    .add(Material.SPECKLED_MELON, ItemTypes.SPECKLED_MELON)
                    .add(Material.MONSTER_EGG, ItemTypes.SPAWN_EGG)
                    .add(Material.EXP_BOTTLE, ItemTypes.EXPERIENCE_BOTTLE)
                    .add(Material.FIREBALL, ItemTypes.FIRE_CHARGE)
                    .add(Material.BOOK_AND_QUILL, ItemTypes.WRITABLE_BOOK)
                    .add(Material.WRITTEN_BOOK, ItemTypes.WRITTEN_BOOK)
                    .add(Material.EMERALD, ItemTypes.EMERALD)
                    .add(Material.ITEM_FRAME, ItemTypes.ITEM_FRAME)
                    .add(Material.FLOWER_POT_ITEM, ItemTypes.FLOWER_POT)
                    .add(Material.CARROT_ITEM, ItemTypes.CARROT)
                    .add(Material.POTATO_ITEM, ItemTypes.POTATO)
                    .add(Material.BAKED_POTATO, ItemTypes.BAKED_POTATO)
                    .add(Material.POISONOUS_POTATO, ItemTypes.POISONOUS_POTATO)
                    .add(Material.EMPTY_MAP, ItemTypes.MAP)
                    .add(Material.GOLDEN_CARROT, ItemTypes.GOLDEN_CARROT)
                    .add(Material.SKULL_ITEM, ItemTypes.SKULL)
                    .add(Material.CARROT_STICK, ItemTypes.CARROT_ON_A_STICK)
                    .add(Material.NETHER_STAR, ItemTypes.NETHER_STAR)
                    .add(Material.PUMPKIN_PIE, ItemTypes.PUMPKIN_PIE)
                    .add(Material.FIREWORK, ItemTypes.FIREWORKS)
                    .add(Material.FIREWORK_CHARGE, ItemTypes.FIREWORK_CHARGE)
                    .add(Material.ENCHANTED_BOOK, ItemTypes.ENCHANTED_BOOK)
                    .add(Material.REDSTONE_COMPARATOR, ItemTypes.COMPARATOR)
                    .add(Material.NETHER_BRICK_ITEM, ItemTypes.NETHERBRICK)
                    .add(Material.QUARTZ, ItemTypes.QUARTZ)
                    .add(Material.EXPLOSIVE_MINECART, ItemTypes.TNT_MINECART)
                    .add(Material.HOPPER_MINECART, ItemTypes.HOPPER_MINECART)
                    .add(Material.PRISMARINE_SHARD, ItemTypes.PRISMARINE_SHARD)
                    .add(Material.PRISMARINE_CRYSTALS, ItemTypes.PRISMARINE_CRYSTALS)
                    .add(Material.RABBIT, ItemTypes.RABBIT)
                    .add(Material.COOKED_RABBIT, ItemTypes.COOKED_RABBIT)
                    .add(Material.RABBIT_STEW, ItemTypes.RABBIT_STEW)
                    .add(Material.RABBIT_FOOT, ItemTypes.RABBIT_FOOT)
                    .add(Material.RABBIT_HIDE, ItemTypes.RABBIT_HIDE)
                    .add(Material.ARMOR_STAND, ItemTypes.ARMOR_STAND)
                    .add(Material.IRON_BARDING, ItemTypes.IRON_HORSE_ARMOR)
                    .add(Material.GOLD_BARDING, ItemTypes.GOLDEN_HORSE_ARMOR)
                    .add(Material.DIAMOND_BARDING, ItemTypes.DIAMOND_HORSE_ARMOR)
                    .add(Material.LEASH, ItemTypes.LEAD)
                    .add(Material.NAME_TAG, ItemTypes.NAME_TAG)
                    .add(Material.COMMAND_MINECART, ItemTypes.COMMAND_BLOCK_MINECART)
                    .add(Material.MUTTON, ItemTypes.MUTTON)
                    .add(Material.COOKED_MUTTON, ItemTypes.COOKED_MUTTON)
                    .add(Material.BANNER, ItemTypes.BANNER)
                    .add(Material.SPRUCE_DOOR_ITEM, ItemTypes.SPRUCE_DOOR)
                    .add(Material.BIRCH_DOOR_ITEM, ItemTypes.BIRCH_DOOR)
                    .add(Material.JUNGLE_DOOR_ITEM, ItemTypes.JUNGLE_DOOR)
                    .add(Material.ACACIA_DOOR_ITEM, ItemTypes.ACACIA_DOOR)
                    .add(Material.DARK_OAK_DOOR_ITEM, ItemTypes.DARK_OAK_DOOR)
                    .add(Material.GOLD_RECORD, ItemTypes.RECORD_13)
                    .add(Material.GREEN_RECORD, ItemTypes.RECORD_CAT)
                    .add(Material.RECORD_3, ItemTypes.RECORD_BLOCKS)
                    .add(Material.RECORD_4, ItemTypes.RECORD_CHIRP)
                    .add(Material.RECORD_5, ItemTypes.RECORD_FAR)
                    .add(Material.RECORD_6, ItemTypes.RECORD_MALL)
                    .add(Material.RECORD_7, ItemTypes.RECORD_MELLOHI)
                    .add(Material.RECORD_8, ItemTypes.RECORD_STAL)
                    .add(Material.RECORD_9, ItemTypes.RECORD_STRAD)
                    .add(Material.RECORD_10, ItemTypes.RECORD_WARD)
                    .add(Material.RECORD_11, ItemTypes.RECORD_11)
                    .add(Material.RECORD_12, ItemTypes.RECORD_WAIT)
                    .build();

    public static ItemType asItem(Material material) {
        return ITEM_TYPE_CONVERTER.convert(material);
    }

    public static Material of(ItemType type) {
        return ITEM_TYPE_CONVERTER.reverse().convert(type);
    }

}