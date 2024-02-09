package com.example.disneytasarim.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.disneytasarim.data.entity.Ozeller
import com.example.disneytasarim.databinding.CardOzelTasarimBinding


class SanaOzelAdapter(var mContext: Context, var SanaOzellerListesi:List<Ozeller>)
    : RecyclerView.Adapter<SanaOzelAdapter.CardOzelTasarimTutucu>(){

    inner class CardOzelTasarimTutucu(var tasarimozel: CardOzelTasarimBinding) : RecyclerView.ViewHolder(tasarimozel.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardOzelTasarimTutucu {
        val binding = CardOzelTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardOzelTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardOzelTasarimTutucu, position: Int) {

        val film2 = SanaOzellerListesi.get(position)
        val t2 = holder.tasarimozel

        t2.imageViewOzel.setImageResource(mContext.resources.getIdentifier(film2.resim,"drawable",mContext.packageName))
    }


    override fun getItemCount(): Int {
        return SanaOzellerListesi.size
    }
}

