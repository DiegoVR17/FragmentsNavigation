package com.example.ejemplofragments.ui.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ejemplofragments.R
import com.example.ejemplofragments.databinding.CardViewItemSuperheroesBinding
import com.example.ejemplofragments.model.Superheroe

class SuperheroesRecyclerViewAdapter(
    private val superheroesList:MutableList<Superheroe>,
    private val onItemClicked: (Superheroe) -> Unit
) : RecyclerView.Adapter<SuperheroesRecyclerViewAdapter.SuperheroeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroeViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_view_item_superheroes,parent,false)
        return SuperheroeViewHolder(itemView)
    }

    override fun getItemCount(): Int = superheroesList.size

    override fun onBindViewHolder(holder: SuperheroeViewHolder, position: Int) {
        val superheroe = superheroesList[position]
        holder.bindingSuperheroe(superheroe)
        holder.itemView.setOnClickListener { onItemClicked(superheroe) }

    }

    class SuperheroeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        private val binding = CardViewItemSuperheroesBinding.bind(itemView)

        fun bindingSuperheroe(superheroe: Superheroe){
            with(binding){
                textViewCard.text = superheroe.name
                imageViewCard.setImageResource(superheroe.image)
            }
        }

    }

}