package gg.synical.commonresources.registeries;

import gg.synical.commonresources.CommonResources;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CommonResources.MODID);

    public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = BLOCKS.register("deepslate_silver_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = BLOCKS.register("raw_silver_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = BLOCKS.register("deepslate_tin_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)));
    public static final RegistryObject<Block> RAW_TIN_BLOCK = BLOCKS.register("raw_tin_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LEAD_ORE = BLOCKS.register("lead_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = BLOCKS.register("deepslate_lead_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)));
    public static final RegistryObject<Block> RAW_LEAD_BLOCK = BLOCKS.register("raw_lead_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NICKEL_ORE = BLOCKS.register("nickel_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> DEEPSLATE_NICKEL_ORE = BLOCKS.register("deepslate_nickel_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)));
    public static final RegistryObject<Block> RAW_NICKEL_BLOCK = BLOCKS.register("raw_nickel_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NICKEL_BLOCK = BLOCKS.register("nickel_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BRONZE_BLOCK = BLOCKS.register("bronze_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> INVAR_BLOCK = BLOCKS.register("invar_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));

}
