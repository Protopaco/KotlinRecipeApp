package com.example.kotlinrecipeapp.Listeners;

import com.example.kotlinrecipeapp.Models.RecipeResponse;

public interface RandomRecipeResponseListener {
    void didFetch(RecipeResponse response, String message);
    void didError(String message);
}
