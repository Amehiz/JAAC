package me.mehiz.jaac.ui.animelist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import me.mehiz.jaac.databinding.FragmentAnimelistBinding

class AnimelistFragment : Fragment() {

    private var _binding: FragmentAnimelistBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val animelistViewModel =
            ViewModelProvider(this).get(AnimelistViewModel::class.java)

        _binding = FragmentAnimelistBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textAnimelist
        animelistViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}