package com.shirofeza.rottenpatty;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RottenPatty.MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RottenPatty.MODID);

    // Rotten Patty
    public static final RegistryObject<Item> ROTTEN_PATTY = ITEMS.register("rotten_patty",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(5)
                    .saturationMod(0.3f)
                    .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 400, 0), 0.7f)
                    .build())));

    // Cooked Patty
    public static final RegistryObject<Item> COOKED_PATTY = ITEMS.register("cooked_patty",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(7)
                    .saturationMod(0.6f)
                    .build())));

    // Cooked Patty Block
    public static final RegistryObject<Block> COOKED_PATTY_BLOCK = BLOCKS.register("cooked_patty_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .sound(SoundType.WOOD)
                    .strength(0.5f)));

    // BlockItem (edible when held in hand)
    public static final RegistryObject<Item> COOKED_PATTY_BLOCK_ITEM = ITEMS.register("cooked_patty_block",
            () -> new BlockItem(COOKED_PATTY_BLOCK.get(), new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(10)
                            .saturationMod(0.6f)
                            .build())
                    .stacksTo(64)));

    // Golden Patty Block
    public static final RegistryObject<Block> GOLDEN_PATTY_BLOCK = BLOCKS.register("golden_patty_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .sound(SoundType.WOOD)
                    .strength(0.5f)));

    public static final RegistryObject<Item> GOLDEN_PATTY_BLOCK_ITEM = ITEMS.register("golden_patty_block",
            () -> new BlockItem(GOLDEN_PATTY_BLOCK.get(), new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(12)
                            .saturationMod(0.8f)
                            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 0), 1.0f)
                            .build())
                    .stacksTo(64)));
}
