package gg.synical.commonresources.registeries;

import gg.synical.commonresources.CommonResources;
import gg.synical.commonresources.registeries.custom.ItemFuelCR;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static gg.synical.commonresources.registeries.CreativeMobTabRegistry.addItemToTab;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CommonResources.MODID);

    // coal items
    public static final RegistryObject<Item> TINY_COAL = addItemToTab(ITEMS.register("tiny_coal", () -> new ItemFuelCR(new Item.Properties(), 200)));
    public static final RegistryObject<Item> COAL_DUST = addItemToTab(ITEMS.register("coal_dust", () -> new Item(new Item.Properties())));

    //charcoal items
    public static final RegistryObject<Item> TINE_CHARCOAL = addItemToTab(ITEMS.register("tiny_charcoal", () -> new ItemFuelCR(new Item.Properties(), 200)));
    public static final RegistryObject<Item> CHARCOAL_DUST = addItemToTab(ITEMS.register("charcoal_dust", () -> new Item(new Item.Properties())));

    // iron items
    public static final RegistryObject<Item> IRON_ROD = addItemToTab(ITEMS.register("iron_rod", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> IRON_DUST = addItemToTab(ITEMS.register("iron_dust", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> IRON_GEAR = addItemToTab(ITEMS.register("iron_gear", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> IRON_PLATE = addItemToTab(ITEMS.register("iron_plate", () -> new Item(new Item.Properties())));

    // gold items
    public static final RegistryObject<Item> GOLD_ROD = addItemToTab(ITEMS.register("gold_rod", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> GOLD_DUST = addItemToTab(ITEMS.register("gold_dust", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> GOLD_GEAR = addItemToTab(ITEMS.register("gold_gear", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> GOLD_PLATE = addItemToTab(ITEMS.register("gold_plate", () -> new Item(new Item.Properties())));

    // copper items
    public static final RegistryObject<Item> COPPER_ROD = addItemToTab(ITEMS.register("copper_rod", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> COPPER_DUST = addItemToTab(ITEMS.register("copper_dust", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> COPPER_GEAR = addItemToTab(ITEMS.register("copper_gear", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> COPPER_PLATE= addItemToTab(ITEMS.register("copper_plate", () -> new Item(new Item.Properties())));

    // diamond items
    public static final RegistryObject<Item> DIAMOND_ROD = addItemToTab(ITEMS.register("diamond_rod", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> DIAMOND_DUST = addItemToTab(ITEMS.register("diamond_dust", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> DIAMOND_GEAR = addItemToTab(ITEMS.register("diamond_gear", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> DIAMOND_PLATE = addItemToTab(ITEMS.register("diamond_plate", () -> new Item(new Item.Properties())));

    // netherite items
    public static final RegistryObject<Item> NETHERITE_ROD = addItemToTab(ITEMS.register("netherite_rod", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> NETHERITE_DUST = addItemToTab(ITEMS.register("netherite_dust", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> NETHERITE_GEAR = addItemToTab(ITEMS.register("netherite_gear", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> NETHERITE_PLATE = addItemToTab(ITEMS.register("netherite_plate", () -> new Item(new Item.Properties())));

    // lapis items
    public static final RegistryObject<Item> LAPIS_ROD = addItemToTab(ITEMS.register("lapis_rod", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> LAPIS_DUST = addItemToTab(ITEMS.register("lapis_dust", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> LAPIS_GEAR = addItemToTab(ITEMS.register("lapis_gear", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> LAPIS_PLATE = addItemToTab(ITEMS.register("lapis_plate", () -> new Item(new Item.Properties())));

    // quartz items
    public static final RegistryObject<Item> QUARTZ_ROD = addItemToTab(ITEMS.register("quartz_rod", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> QUARTZ_DUST = addItemToTab(ITEMS.register("quartz_dust", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> QUARTZ_GEAR = addItemToTab(ITEMS.register("quartz_gear", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> QUARTZ_PLATE = addItemToTab(ITEMS.register("quartz_plate", () -> new Item(new Item.Properties())));

    // emerald items
    public static final RegistryObject<Item> EMERALD_ROD = addItemToTab(ITEMS.register("emerald_rod", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> EMERALD_DUST = addItemToTab(ITEMS.register("emerald_dust", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> EMERALD_GEAR = addItemToTab(ITEMS.register("emerald_gear", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> EMERALD_PLATE = addItemToTab(ITEMS.register("emerald_plate", () -> new Item(new Item.Properties())));

    // silver items
    public static final RegistryObject<Item> SILVER_ORE = addItemToTab(ITEMS.register("silver_ore", () -> new BlockItem(BlockRegistry.SILVER_ORE.get(), new Item.Properties())));
    public static final RegistryObject<Item> DEEPSLATE_SILVER_ORE = addItemToTab(ITEMS.register("deepslate_silver_ore", () -> new BlockItem(BlockRegistry.DEEPSLATE_SILVER_ORE.get(), new Item.Properties())));
    public static final RegistryObject<Item> RAW_SILVER = addItemToTab(ITEMS.register("raw_silver", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> RAW_SILVER_BLOCK = addItemToTab(ITEMS.register("raw_silver_block", () -> new BlockItem(BlockRegistry.RAW_SILVER_BLOCK.get(), new Item.Properties())));
    public static final RegistryObject<Item> SILVER_NUGGET = addItemToTab(ITEMS.register("silver_nugget", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> SILVER_INGOT = addItemToTab(ITEMS.register("silver_ingot", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> SILVER_BLOCK = addItemToTab(ITEMS.register("silver_block", () -> new BlockItem(BlockRegistry.SILVER_BLOCK.get(), new Item.Properties())));
    public static final RegistryObject<Item> SILVER_ROD = addItemToTab(ITEMS.register("silver_rod", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> SILVER_DUST = addItemToTab(ITEMS.register("silver_dust", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> SILVER_GEAR = addItemToTab(ITEMS.register("silver_gear", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> SILVER_PLATE = addItemToTab(ITEMS.register("silver_plate", () -> new Item(new Item.Properties())));

    // tin items
    public static final RegistryObject<Item> TIN_ORE = addItemToTab(ITEMS.register("tin_ore", () -> new BlockItem(BlockRegistry.TIN_ORE.get(), new Item.Properties())));
    public static final RegistryObject<Item> DEEPSLATE_TIN_ORE = addItemToTab(ITEMS.register("deepslate_tin_ore", () -> new BlockItem(BlockRegistry.DEEPSLATE_TIN_ORE.get() ,new Item.Properties())));
    public static final RegistryObject<Item> RAW_TIN = addItemToTab(ITEMS.register("raw_tin", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> RAW_TIN_BLOCK = addItemToTab(ITEMS.register("raw_tin_block", () -> new BlockItem(BlockRegistry.RAW_TIN_BLOCK.get(), new Item.Properties())));
    public static final RegistryObject<Item> TIN_NUGGET = addItemToTab(ITEMS.register("tin_nugget", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> TIN_INGOT = addItemToTab(ITEMS.register("tin_ingot", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> TIN_BLOCK = addItemToTab(ITEMS.register("tin_block", () -> new BlockItem(BlockRegistry.TIN_BLOCK.get(), new Item.Properties())));
    public static final RegistryObject<Item> TIN_ROD = addItemToTab(ITEMS.register("tin_rod", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> TIN_DUST = addItemToTab(ITEMS.register("tin_dust", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> TIN_GEAR = addItemToTab(ITEMS.register("tin_gear", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> TIN_PLATE = addItemToTab(ITEMS.register("tin_plate", () -> new Item(new Item.Properties())));

    // lead items
    public static final RegistryObject<Item> LEAD_ORE = addItemToTab(ITEMS.register("lead_ore", () -> new BlockItem(BlockRegistry.LEAD_ORE.get(), new Item.Properties())));
    public static final RegistryObject<Item> DEEPSLATE_LEAD_ORE = addItemToTab(ITEMS.register("deepslate_lead_ore", () -> new BlockItem(BlockRegistry.DEEPSLATE_LEAD_ORE.get(), new Item.Properties())));
    public static final RegistryObject<Item> LEAD_SILVER = addItemToTab(ITEMS.register("raw_lead", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> RAW_LEAD_BLOCK = addItemToTab(ITEMS.register("raw_lead_block", () -> new BlockItem(BlockRegistry.RAW_LEAD_BLOCK.get(), new Item.Properties())));
    public static final RegistryObject<Item> LEAD_NUGGET = addItemToTab(ITEMS.register("lead_nugget", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> LEAD_INGOT = addItemToTab(ITEMS.register("lead_ingot", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> LEAD_BLOCK = addItemToTab(ITEMS.register("lead_block", () -> new BlockItem(BlockRegistry.LEAD_BLOCK.get(), new Item.Properties())));
    public static final RegistryObject<Item> LEAD_ROD = addItemToTab(ITEMS.register("lead_rod", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> LEAD_DUST = addItemToTab(ITEMS.register("lead_dust", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> LEAD_GEAR = addItemToTab(ITEMS.register("lead_gear", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> LEAD_PLATE = addItemToTab(ITEMS.register("lead_plate", () -> new Item(new Item.Properties())));

    // nickel items
    public static final RegistryObject<Item> NICKEL_ORE = addItemToTab(ITEMS.register("nickel_ore", () -> new BlockItem(BlockRegistry.NICKEL_ORE.get(), new Item.Properties())));
    public static final RegistryObject<Item> DEEPSLATE_NICKEL_ORE = addItemToTab(ITEMS.register("deepslate_nickel_ore", () -> new BlockItem(BlockRegistry.DEEPSLATE_NICKEL_ORE.get(), new Item.Properties())));
    public static final RegistryObject<Item> RAW_NICKEL = addItemToTab(ITEMS.register("raw_nickel", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> RAW_NICKEL_BLOCK = addItemToTab(ITEMS.register("raw_nickel_block", () -> new BlockItem(BlockRegistry.RAW_NICKEL_BLOCK.get(), new Item.Properties())));
    public static final RegistryObject<Item> NICKEL_NUGGET = addItemToTab(ITEMS.register("nickel_nugget", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> NICKEL_INGOT = addItemToTab(ITEMS.register("nickel_ingot", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> NICKEL_BLOCK = addItemToTab(ITEMS.register("nickel_block", () -> new BlockItem(BlockRegistry.NICKEL_BLOCK.get(), new Item.Properties())));
    public static final RegistryObject<Item> NICKEL_ROD = addItemToTab(ITEMS.register("nickel_rod", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> NICKEL_DUST = addItemToTab(ITEMS.register("nickel_dust", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> NICKEL_GEAR = addItemToTab(ITEMS.register("nickel_gear", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> NICKEL_PLATE = addItemToTab(ITEMS.register("nickel_plate", () -> new Item(new Item.Properties())));

    // bronze items
    public static final RegistryObject<Item> BRONZE_NUGGET = addItemToTab(ITEMS.register("bronze_nugget", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> BRONZE_INGOT = addItemToTab(ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> BRONZE_BLOCK = addItemToTab(ITEMS.register("bronze_block", () -> new BlockItem(BlockRegistry.BRONZE_BLOCK.get(),new Item.Properties())));
    public static final RegistryObject<Item> BRONZE_ROD = addItemToTab(ITEMS.register("bronze_rod", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> BRONZE_DUST = addItemToTab(ITEMS.register("bronze_dust", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> BRONZE_GEAR = addItemToTab(ITEMS.register("bronze_gear", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> BRONZE_PLATE = addItemToTab(ITEMS.register("bronze_plate", () -> new Item(new Item.Properties())));

    // invar items
    public static final RegistryObject<Item> INVAR_NUGGET = addItemToTab(ITEMS.register("invar_nugget", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> INVAR_INGOT = addItemToTab(ITEMS.register("invar_ingot", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> INVAR_BLOCK = addItemToTab(ITEMS.register("invar_block", () -> new BlockItem(BlockRegistry.INVAR_BLOCK.get(), new Item.Properties())));
    public static final RegistryObject<Item> INVAR_ROD = addItemToTab(ITEMS.register("invar_rod", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> INVAR_DUST = addItemToTab(ITEMS.register("invar_dust", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> INVAR_GEAR = addItemToTab(ITEMS.register("invar_gear", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> INVAR_PLATE = addItemToTab(ITEMS.register("invar_plate", () -> new Item(new Item.Properties())));
}
