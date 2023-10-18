package com.example.ejemplofragments.ui.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ejemplofragments.R
import com.example.ejemplofragments.databinding.FragmentListBinding
import com.example.ejemplofragments.model.Superheroe

class ListFragment : Fragment() {

    private lateinit var listBinding: FragmentListBinding
    private var superheroeList = mutableListOf<Superheroe>()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       listBinding = FragmentListBinding.inflate(inflater,container,false)
        val root: View = listBinding.root

        loadSuperheroes()

        val superheroesRecyclerViewAdapter = SuperheroesRecyclerViewAdapter(superheroeList, onItemClicked = {
            onSuperheroeItemClicked(it)
        })
        listBinding.superheroesReciclerView.apply {

            layoutManager = LinearLayoutManager(this@ListFragment.requireContext())
            adapter = superheroesRecyclerViewAdapter
            setHasFixedSize(false)
        }
        return root
    }

    private fun loadSuperheroes() {
        superheroeList.clear()
        var superheroe = Superheroe(
            id = 0,
            name = resources.getString(R.string.superhero1),
            alias = resources.getString(R.string.superheroalias1),
            image = R.drawable.batman,
            powers = resources.getString(R.string.superheropowers1)
        )

        superheroeList.add(superheroe)
        superheroe = Superheroe(
            id = 1,
            name = resources.getString(R.string.superhero2),
            alias = resources.getString(R.string.superheroalias2),
            image = R.drawable.flash,
            powers = resources.getString(R.string.superheropowers2)
        )

        superheroeList.add(superheroe)
        superheroe = Superheroe(
            id = 2,
            name = resources.getString(R.string.superhero3),
            alias = resources.getString(R.string.superheroalias3),
            image = R.drawable.superman,
            powers = resources.getString(R.string.superheropowers3)
        )

        superheroeList.add(superheroe)
        superheroe = Superheroe(
            id = 3,
            name = resources.getString(R.string.superhero4),
            alias = resources.getString(R.string.superheroalias4),
            image = R.drawable.wonderwoman,
            powers = resources.getString(R.string.superheropowers4)
        )

        superheroeList.add(superheroe)
    }

    private fun onSuperheroeItemClicked(superheroe: Superheroe) {
        when(superheroe.id){

            0 -> findNavController().navigate(ListFragmentDirections.actionListFragmentToDetailFragment(superheroe = superheroe))
            1 -> findNavController().navigate(ListFragmentDirections.actionListFragmentToDetailFragment(superheroe = superheroe))
            2 -> findNavController().navigate(ListFragmentDirections.actionListFragmentToDetailFragment(superheroe = superheroe))
            else -> findNavController().navigate(ListFragmentDirections.actionListFragmentToDetailFragment(superheroe = superheroe))
          /*  0 -> findNavController().navigate(ListFragmentDirections.actionListFragmentToFragment1())
            1 -> findNavController().navigate(ListFragmentDirections.actionListFragmentToFragment2())
            2 -> findNavController().navigate(ListFragmentDirections.actionListFragmentToFragment3())
            else -> findNavController().navigate(ListFragmentDirections.actionListFragmentToFragment4())*/
        }

    }

}