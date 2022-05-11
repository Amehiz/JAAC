package me.mehiz.anilistclient.ui.anime

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AnimeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is the Anime tab"
    }
    val text: LiveData<String> = _text
}