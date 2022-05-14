package me.mehiz.jaac.ui.discover

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiscoverViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is the Home Page"
    }
    val text: LiveData<String> = _text
}