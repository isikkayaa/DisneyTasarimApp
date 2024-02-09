package com.example.disneytasarim.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.disneytasarim.data.entity.Filmler
import com.example.disneytasarim.data.entity.Ozeller
import com.example.disneytasarim.data.entity.Yeniler
import com.example.disneytasarim.databinding.FragmentAnasayfaBinding
import com.example.disneytasarim.ui.adapter.DisneyAdapter
import com.example.disneytasarim.ui.adapter.SanaOzelAdapter
import com.example.disneytasarim.ui.adapter.YeniEklenenlerAdapter

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater,container,false)

        binding.ilkRv.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        val disneyListesi = ArrayList<Filmler>()
        val f1 = Filmler(1,"belgesel")
        val f2 = Filmler(2,"patient")
        val f3 = Filmler(3,"simpsons")


        disneyListesi.add(f1)
        disneyListesi.add(f2)
        disneyListesi.add(f3)


        val disneyAdapter = DisneyAdapter(requireContext(),disneyListesi)
        binding.ilkRv.adapter = disneyAdapter


        binding.ikinciRv.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        val yenieklenenlerListesi = ArrayList<Yeniler>()

        val z1 = Yeniler(1,"gerogeandarj")
        val z2 = Yeniler(2,"selfsparkshorts")
        val z3 = Yeniler(3,"solaropposities")
        val z4 = Yeniler(4,"whatif")



        yenieklenenlerListesi.add(z1)
        yenieklenenlerListesi.add(z2)
        yenieklenenlerListesi.add(z3)
        yenieklenenlerListesi.add(z4)



        val yenieklenenlerAdapter = YeniEklenenlerAdapter(requireContext(),yenieklenenlerListesi)
        binding.ikinciRv.adapter = yenieklenenlerAdapter




        binding.ucuncuRv.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        val sanaozellerlistesi = ArrayList<Ozeller>()
        val o1 = Ozeller(1,"highfidelity")
        val o2 = Ozeller(2,"daysofsummer")
        val o3 = Ozeller(3,"elemental")
        val o4 = Ozeller(4,"licoricepizza")
        val o5 = Ozeller(5,"royaltenenbaums")
        val o6 = Ozeller(6,"westsidestory")


        sanaozellerlistesi.add(o1)
        sanaozellerlistesi.add(o2)
        sanaozellerlistesi.add(o3)
        sanaozellerlistesi.add(o4)
        sanaozellerlistesi.add(o5)
        sanaozellerlistesi.add(o6)





        val sanaOzelAdapter = SanaOzelAdapter(requireContext(),sanaozellerlistesi)
        binding.ucuncuRv.adapter = sanaOzelAdapter






        return binding.root
    }


}