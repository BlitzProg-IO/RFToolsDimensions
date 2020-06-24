package mcjty.rftoolsdim.modules.dimlets;

import mcjty.rftoolsdim.modules.dimlets.items.*;
import mcjty.rftoolsdim.setup.Registration;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class DimletSetup {

    public static void register() {
        // Needed to force class loading
    }

    public static final RegistryObject<DimletItem> EMPTY_DIMLET = Registration.ITEMS.register("empty_dimlet", DimletItem::new);

    public static final RegistryObject<DimletItem> EMPTY_TERRAIN_DIMLET = Registration.ITEMS.register("empty_terrain_dimlet", DimletItem::new);
    public static final RegistryObject<DimletItem> EMPTY_FEATURE_DIMLET = Registration.ITEMS.register("empty_feature_dimlet", DimletItem::new);
    public static final RegistryObject<DimletItem> EMPTY_BIOME_MODIFIER_DIMLET = Registration.ITEMS.register("empty_biome_modifier_dimlet", DimletItem::new);
    public static final RegistryObject<DimletItem> EMPTY_MATERIAL_DIMLET = Registration.ITEMS.register("empty_material_dimlet", DimletItem::new);

    public static final RegistryObject<DimletItem> TERRAIN_DIMLET = Registration.ITEMS.register("terrain_dimlet", DimletItem::new);
    public static final RegistryObject<DimletItem> FEATURE_DIMLET = Registration.ITEMS.register("feature_dimlet", DimletItem::new);
    public static final RegistryObject<DimletItem> BIOME_MODIFIER_DIMLET = Registration.ITEMS.register("biome_modifier_dimlet", DimletItem::new);
    public static final RegistryObject<DimletItem> MATERIAL_DIMLET = Registration.ITEMS.register("material_dimlet", DimletItem::new);

    public static final RegistryObject<PartItem> PART_ENERGY_0 = Registration.ITEMS.register("part_energy_0", PartItem::new);
    public static final RegistryObject<PartItem> PART_ENERGY_1 = Registration.ITEMS.register("part_energy_1", PartItem::new);
    public static final RegistryObject<PartItem> PART_ENERGY_2 = Registration.ITEMS.register("part_energy_2", PartItem::new);
    public static final RegistryObject<PartItem> PART_ENERGY_3 = Registration.ITEMS.register("part_energy_3", PartItem::new);
    public static final RegistryObject<PartItem> PART_MEMORY_0 = Registration.ITEMS.register("part_memory_0", PartItem::new);
    public static final RegistryObject<PartItem> PART_MEMORY_1 = Registration.ITEMS.register("part_memory_1", PartItem::new);
    public static final RegistryObject<PartItem> PART_MEMORY_2 = Registration.ITEMS.register("part_memory_2", PartItem::new);
    public static final RegistryObject<PartItem> PART_MEMORY_3 = Registration.ITEMS.register("part_memory_3", PartItem::new);

    public static final RegistryObject<Item> COMMON_ESSENCE = Registration.ITEMS.register("common_essence", () -> new Item(Registration.createStandardProperties()));
    public static final RegistryObject<Item> RARE_ESSENCE = Registration.ITEMS.register("rare_essence", () -> new Item(Registration.createStandardProperties()));
    public static final RegistryObject<Item> LEGENDARY_ESSENCE = Registration.ITEMS.register("legendary_essence", () -> new Item(Registration.createStandardProperties()));
}