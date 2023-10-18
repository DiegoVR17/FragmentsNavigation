package com.example.ejemplofragments.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.ejemplofragments.R
import com.example.ejemplofragments.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {

    private lateinit var detailBinding: FragmentDetailBinding
    private val args: DetailFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        detailBinding = FragmentDetailBinding.inflate(inflater, container, false)
        val root: View = detailBinding.root

        val superheroe = args.superheroe

        with(detailBinding){
            imageViewName.setImageResource(superheroe.image)
            textViewName.text= superheroe.name
            textViewAlias.text= superheroe.alias
            textViewPowers.text = superheroe.powers
        }

        return root
    }

}