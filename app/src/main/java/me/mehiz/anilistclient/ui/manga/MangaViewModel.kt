package me.mehiz.anilistclient.ui.manga

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MangaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is the Manga tab"
    }
    val text: LiveData<String> = _text
}