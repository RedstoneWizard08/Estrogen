package dev.mayaqq.estrogen.registry;

import dev.mayaqq.estrogen.fluids.LiquidEstrogenFluid;
import dev.mayaqq.estrogen.fluids.MoltenSlimeFluid;
import dev.mayaqq.estrogen.fluids.TestosteroneMixtureFluid;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.registry.Registry;

import static dev.mayaqq.estrogen.Estrogen.id;

public class FluidRegistry {
    public static FlowableFluid STILL_MOLTEN_SLIME;
    public static FlowableFluid FLOWING_MOLTEN_SLIME;
    public static Item MOLTEN_SLIME_BUCKET;

    public static FlowableFluid STILL_TESTOSTERONE_MIXTURE;
    public static FlowableFluid FLOWING_TESTOSTERONE_MIXTURE;
    public static Item TESTOSTERONE_MIXTURE_BUCKET;

    public static FlowableFluid STILL_LIQUID_ESTROGEN;
    public static FlowableFluid FLOWING_LIQUID_ESTROGEN;
    public static Item LIQUID_ESTROGEN_BUCKET;

    public static void register() {
        STILL_MOLTEN_SLIME = Registry.register(Registry.FLUID, id("molten_slime"), new MoltenSlimeFluid.Still());
        FLOWING_MOLTEN_SLIME = Registry.register(Registry.FLUID, id("flowing_molten_slime"), new MoltenSlimeFluid.Flowing());
        MOLTEN_SLIME_BUCKET = Registry.register(Registry.ITEM, id("molten_slime_bucket"),
                new BucketItem(STILL_MOLTEN_SLIME, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1).group(ItemRegistry.ESTROGEN_GROUP)));

        STILL_TESTOSTERONE_MIXTURE = Registry.register(Registry.FLUID, id("testosterone_mixture"), new TestosteroneMixtureFluid.Still());
        FLOWING_TESTOSTERONE_MIXTURE = Registry.register(Registry.FLUID, id("flowing_testosterone_mixture"), new TestosteroneMixtureFluid.Flowing());
        TESTOSTERONE_MIXTURE_BUCKET = Registry.register(Registry.ITEM, id("testosterone_mixture_bucket"),
                new BucketItem(STILL_TESTOSTERONE_MIXTURE, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1).group(ItemRegistry.ESTROGEN_GROUP)));

        STILL_LIQUID_ESTROGEN = Registry.register(Registry.FLUID, id("liquid_estrogen"), new LiquidEstrogenFluid.Still());
        FLOWING_LIQUID_ESTROGEN = Registry.register(Registry.FLUID, id("flowing_liquid_estrogen"), new LiquidEstrogenFluid.Flowing());
        LIQUID_ESTROGEN_BUCKET = Registry.register(Registry.ITEM, id("liquid_estrogen_bucket"),
                new BucketItem(STILL_LIQUID_ESTROGEN, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1).group(ItemRegistry.ESTROGEN_GROUP)));
    }
}
