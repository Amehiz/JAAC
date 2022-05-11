package me.mehiz.anilistclient.ui.manga

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import me.mehiz.anilistclient.databinding.FragmentMangaBinding

class MangaFragment : Fragment() {

    private var _binding: FragmentMangaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val mangaViewModel =
            ViewModelProvider(this).get(MangaViewModel::class.java)

        _binding = FragmentMangaBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textManga
        mangaViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}