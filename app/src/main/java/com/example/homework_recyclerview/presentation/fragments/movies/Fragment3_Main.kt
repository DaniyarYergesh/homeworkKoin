package com.example.homework_recyclerview.presentation.fragments.movies

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.convertor.R
import com.google.android.material.textfield.TextInputEditText

class Fragment3_Main : Fragment(R.layout.fragment_fragment3__main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val izdeu = view.findViewById<TextInputEditText>(R.id.izdey)
        izdeu.setHint("\uD83D\uDD0D Izdey")

        val forsajMovie = view.findViewById<ImageView>(R.id.imageView)
        forsajMovie.setOnClickListener{
            parentFragmentManager
                .beginTransaction()
                .add(
                    R.id.nav_host_fragment_activity_main,
                    FragmentMovieDetails(), "Fragment"
                ).addToBackStack(null).commit()
        }
    }


}