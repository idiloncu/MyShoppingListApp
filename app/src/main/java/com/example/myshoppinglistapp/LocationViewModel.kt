package com.example.myshoppinglistapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class LocationViewModel:ViewModel() {
    private val _location =mutableStateOf<LocationData?>(null)
    val location: State<LocationData?> = _location

    private val _address =mutableStateOf<LocationData?>(null)
    val address: MutableState<LocationData?> = _address

    fun updateLocation(newLocation:LocationData){
        _location.value=newLocation
    }

    fun fetchAddress(latlng:String){
        try {
            viewModelScope.launch {

            }

        }catch (e:Exception){
            e.printStackTrace()
        }
    }
}
