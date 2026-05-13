package com.shirofeza.rottenpatty;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RottenPatty.MODID);

    public static final RegistryObject<Item> ROTTEN_PATTY = ITEMS.register("rotten_patty",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(5)
                    .saturationMod(0.3f)
                    .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 400, 0), 0.7f)
                    .build())));

    public static final RegistryObject<Item> COOKED_PATTY = ITEMS.register("cooked_patty",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(7)
                    .saturationMod(0.6f)
                    .build())));
}
