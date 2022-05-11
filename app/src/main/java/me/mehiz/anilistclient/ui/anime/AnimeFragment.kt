package me.mehiz.anilistclient.ui.anime

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import me.mehiz.anilistclient.databinding.FragmentAnimeBinding

class AnimeFragment : Fragment() {

    private var _binding: FragmentAnimeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val animeViewModel =
            ViewModelProvider(this).get(AnimeViewModel::class.java)

        _binding = FragmentAnimeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textAnime
        animeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}