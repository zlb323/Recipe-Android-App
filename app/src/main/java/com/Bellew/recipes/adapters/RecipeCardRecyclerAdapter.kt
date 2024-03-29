package com.Bellew.recipes.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.Bellew.recipes.R
import com.Bellew.recipes.activities.RecipeCardHolder
import com.Bellew.recipes.models.Recipe

/*
    The RecipeCard RecyclerAdapter creates recipeCardHolders and assigns them with an onclick listener provided from
    the Recipes Fragment
 */
class RecipeCardRecyclerAdapter(val onClickListener: (Recipe) -> Unit) : RecyclerView.Adapter<RecipeCardHolder>(){
    var currentResults: ArrayList<Recipe> = ArrayList<Recipe>()

    override fun getItemCount(): Int {
        return currentResults.size
    }

    override fun onBindViewHolder(holder: RecipeCardHolder, position: Int) {
        var page = currentResults[position]
        holder.bind(page, onClickListener)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeCardHolder {
        var cardItem = LayoutInflater.from(parent.context).inflate(R.layout.recipe_card_item, parent, false)
        return RecipeCardHolder(cardItem)
    }
}