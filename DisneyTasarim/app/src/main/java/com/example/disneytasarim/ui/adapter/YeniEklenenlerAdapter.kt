package com.example.disneytasarim.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.disneytasarim.data.entity.Filmler
import com.example.disneytasarim.data.entity.Yeniler
import com.example.disneytasarim.databinding.CardYeniTasarimBinding

class YeniEklenenlerAdapter(var mContext:Context,var YeniEklenenlerListesi:List<Yeniler>)
    : RecyclerView.Adapter<YeniEklenenlerAdapter.CardYeniTasarimTutucu>(){

    inner class CardYeniTasarimTutucu(var tasarimyeni: CardYeniTasarimBinding) : RecyclerView.ViewHolder(tasarimyeni.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardYeniTasarimTutucu {
        val binding = CardYeniTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardYeniTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardYeniTasarimTutucu, position: Int) {

        val film1 = YeniEklenenlerListesi.get(position)
        val t1 = holder.tasarimyeni

        t1.imageViewYeni.setImageResource(mContext.resources.getIdentifier(film1.resim,"drawable",mContext.packageName))
    }


    override fun getItemCount(): Int {
        return YeniEklenenlerListesi.size
    }
}

