package me.mehiz.jaac.ui.mangalist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import me.mehiz.jaac.databinding.FragmentMangalistBinding

class MangalistFragment : Fragment() {

    private var _binding: FragmentMangalistBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val mangalistViewModel =
            ViewModelProvider(this).get(MangalistViewModel::class.java)

        _binding = FragmentMangalistBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textMangalist
        mangalistViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}