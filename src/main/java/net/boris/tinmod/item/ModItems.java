package net.boris.tinmod.item;

import net.boris.tinmod.TinMod;
import net.boris.tinmod.base.ModArmorMaterial;
import net.boris.tinmod.block.ModBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class ModItems<sup> {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, TinMod.MOD_ID);


    public static final RegistryObject<Item> TIN = ITEMS.register("tin",
            () -> new Item(props()));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(props()));
    public static final RegistryObject<Item> TIN_ROD = ITEMS.register("tin_rod",
            () -> new Item(props()));
    public static final RegistryObject<Item> ADAMITE = ITEMS.register("adamite",
            () -> new Item(props()));

    public static final RegistryObject<SwordItem> TIN_SWORD = ITEMS.register("tin_sword",
            () -> new SwordItem(ToolTiers.TIN, 5,0.2f, props()));
    public static final RegistryObject<PickaxeItem> TIN_PICKAXE = ITEMS.register("tin_pickaxe",
            () -> new PickaxeItem(ToolTiers.TIN, 3,0.2f, props()));
    public static final RegistryObject<AxeItem> TIN_AXE = ITEMS.register("tin_axe",
            () -> new AxeItem(ToolTiers.TIN, 7,0.2f, props()));
    public static final RegistryObject<ShovelItem> TIN_SHOVEL = ITEMS.register("tin_shovel",
            () -> new ShovelItem(ToolTiers.TIN, 2,0.2f, props()));
    public static final RegistryObject<HoeItem> TIN_HOE = ITEMS.register("tin_hoe",
            () -> new HoeItem(ToolTiers.TIN, 1,0.2f, props()));

    public static final RegistryObject<ArmorItem> TIN_HELMET = ITEMS.register("tin_helmet",
            () -> new ArmorItem(ArmorTiers.TIN, EquipmentSlot.HEAD, props()));
    public static final RegistryObject<ArmorItem> TIN_CHESTPLATE = ITEMS.register("tin_chestplate",
            () -> new ArmorItem(ArmorTiers.TIN, EquipmentSlot.CHEST, props()));
    public static final RegistryObject<ArmorItem> TIN_BOOTS = ITEMS.register("tin_boots",
            () -> new ArmorItem(ArmorTiers.TIN, EquipmentSlot.FEET, props()));
    public static final RegistryObject<ArmorItem> TIN_LEGGINGS = ITEMS.register("tin_leggings",
            () -> new ArmorItem(ArmorTiers.TIN, EquipmentSlot.LEGS, props()));

    private static Item.@NotNull Properties props() {
        return new Item.Properties().tab(ModCreativeModeTab.TIN_TAB);
    }

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);



        }

    public static class ToolTiers {
        public static final Tier TIN = new ForgeTier(
                0,
                500,
                0.5f,
                1,
                22,
                ModBlocks.Tags.NEEDS_TIN_TOOL,
                () -> Ingredient.of(ModItems.TIN.get()));
    }

    public static class ArmorTiers {
        public static final ArmorMaterial TIN = new ModArmorMaterial(
            "tin",
            750,
            new int[] { 2, 7, 6, 3 },
            30,
            SoundEvents.ARMOR_EQUIP_CHAIN,
            1.5f,
            0f,
            () -> Ingredient.of(ModItems.TIN.get())

        );
    }


}

