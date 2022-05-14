package me.mehiz.jaac.ui.mangalist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MangalistViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is The Manga Tab"
    }
    val text: LiveData<String> = _text
}