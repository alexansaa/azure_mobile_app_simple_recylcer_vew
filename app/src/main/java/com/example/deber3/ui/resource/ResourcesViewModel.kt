package com.example.deber3.ui.resource

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.deber3.Subscription
import com.example.deber3.ui.Resource

class ResourcesViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is resource Fragment"
    }
    val text: LiveData<String> = _text

    private val _resources = MutableLiveData<List<Resource>>()
    val resources: LiveData<List<Resource>> get() = _resources

    init {
        _resources.value = loadResources()
    }

    private fun loadResources(): List<Resource> {
        return listOf(
            Resource("b4f6e6e1-768e-4cf6-8f58-7cb847f4b8ea", "Desarrollo BSAA VS", "Description for Basic Plan", 9.99, true),
            Resource("f3a2c0d1-5c3e-4c7f-a8c3-1d3dbf5a6f34", "MS Az Sponsorship AppDev 2024", "Description for Premium Plan", 19.99, false),
            Resource("e7f8d2e2-9b1b-4f76-8d45-1c4b9c2a8e53", "MS Az Sponsorship BitCost 2024", "Description for Pro Plan", 29.99, true),
            Resource("b4f6e6e1-768e-4cf6-8f58-7cb847f4b8ea", "Desarrollo BSAA VS", "Description for Basic Plan", 9.99, true),
            Resource("f3a2c0d1-5c3e-4c7f-a8c3-1d3dbf5a6f34", "MS Az Sponsorship AppDev 2024", "Description for Premium Plan", 19.99, false),
            Resource("e7f8d2e2-9b1b-4f76-8d45-1c4b9c2a8e53", "MS Az Sponsorship BitCost 2024", "Description for Pro Plan", 29.99, true),
            Resource("b4f6e6e1-768e-4cf6-8f58-7cb847f4b8ea", "Desarrollo BSAA VS", "Description for Basic Plan", 9.99, true),
            Resource("f3a2c0d1-5c3e-4c7f-a8c3-1d3dbf5a6f34", "MS Az Sponsorship AppDev 2024", "Description for Premium Plan", 19.99, false),
            Resource("e7f8d2e2-9b1b-4f76-8d45-1c4b9c2a8e53", "MS Az Sponsorship BitCost 2024", "Description for Pro Plan", 29.99, true),
        )
    }
}