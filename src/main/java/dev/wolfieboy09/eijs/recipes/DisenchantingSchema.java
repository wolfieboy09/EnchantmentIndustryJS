package dev.wolfieboy09.eijs.recipes;

import com.google.gson.JsonElement;
import dev.latvian.mods.kubejs.fluid.FluidStackJS;
import dev.latvian.mods.kubejs.fluid.InputFluid;
import dev.latvian.mods.kubejs.fluid.OutputFluid;
import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.item.OutputItem;
import dev.latvian.mods.kubejs.recipe.RecipeJS;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.ItemComponents;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeConstructor;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;

public interface DisenchantingSchema {
    RecipeKey<InputItem[]> INGREDIENTS = ItemComponents.INPUT_ARRAY.key("ingredients");
    RecipeKey<OutputItem[]> RESULTS = ItemComponents.OUTPUT_ARRAY.key("results");
    RecipeKey<Integer> FLUID_AMOUNT = NumberComponent.INT.key("amount");

    class DisenchantingJS extends RecipeJS {

    }

    RecipeConstructor.Factory FACTORY = (recipe, schema, key, from) -> {

    };

    RecipeSchema SCHEMA = new RecipeSchema(DisenchantingJS.class, DisenchantingJS::new, INGREDIENTS, RESULTS, FLUID_AMOUNT)
            .constructor(FACTORY, INGREDIENTS, FLUID_AMOUNT)
            .constructor(FACTORY, INGREDIENTS, RESULTS, FLUID_AMOUNT);
}
