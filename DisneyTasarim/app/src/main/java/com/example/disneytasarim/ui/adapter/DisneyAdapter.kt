package com.example.disneytasarim.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.disneytasarim.data.entity.Filmler
import com.example.disneytasarim.databinding.CardTasarimBinding

class DisneyAdapter(var mContext: Context, var DisneyListesi:List<Filmler>)
    : RecyclerView.Adapter<DisneyAdapter.CardTasarimTutucu>(){

        inner class CardTasarimTutucu(var tasarim:CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardTasarimTutucu(binding)
    }



    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {

        val film = DisneyListesi.get(position)
        val t = holder.tasarim

        t.imageViewBelgesel.setImageResource(mContext.resources.getIdentifier(film.resim,"drawable",mContext.packageName))
    }


    override fun getItemCount(): Int {
        return DisneyListesi.size
    }
}