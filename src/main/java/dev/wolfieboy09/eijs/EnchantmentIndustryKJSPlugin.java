package dev.wolfieboy09.eijs;

import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.recipe.schema.RegisterRecipeSchemasEvent;
import dev.latvian.mods.kubejs.script.ScriptType;
import dev.latvian.mods.kubejs.util.ClassFilter;
import dev.wolfieboy09.eijs.recipes.DisenchantingSchema;
import plus.dragons.createenchantmentindustry.EnchantmentIndustry;

import java.util.HashMap;
import java.util.Map;


public class EnchantmentIndustryKJSPlugin extends KubeJSPlugin {
    @Override
    public void registerRecipeSchemas(RegisterRecipeSchemasEvent event) {
        event.namespace(EnchantmentIndustry.ID)
                .register("disenchanting", DisenchantingSchema.SCHEMA);
    }


}
