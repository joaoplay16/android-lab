package com.playlab.androidlab.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.playlab.androidlab.model.User

class SharedViewModel : ViewModel(){
    private var _person = MutableLiveData<User>()

    val person = _person

    fun setPersonName(firstName: String, lastName: String){
        _person.value = User(firstName, lastName)
    }
}