package me.mehiz.anilistclient.ui.animelist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AnimelistViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Anime Fragment"
    }
    val text: LiveData<String> = _text
}