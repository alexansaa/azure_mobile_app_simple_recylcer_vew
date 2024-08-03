package com.example.deber3.ui.resource

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.deber3.Subscription

class SubscriptionViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is subscription Fragment"
    }
    val text: LiveData<String> = _text

    private val _subscriptions = MutableLiveData<List<Subscription>>()
    val subscriptions: LiveData<List<Subscription>> get() = _subscriptions

    init {
        // Load your data here
        _subscriptions.value = loadSubscriptions()
    }

    private fun loadSubscriptions(): List<Subscription> {
        // Load or generate your list of subscriptions
        return listOf(
            Subscription("b4f6e6e1-768e-4cf6-8f58-7cb847f4b8ea", "Desarrollo BSAA VS", "Description for Basic Plan", 9.99, true),
            Subscription("f3a2c0d1-5c3e-4c7f-a8c3-1d3dbf5a6f34", "MS Az Sponsorship AppDev 2024", "Description for Premium Plan", 19.99, false),
            Subscription("e7f8d2e2-9b1b-4f76-8d45-1c4b9c2a8e53", "MS Az Sponsorship BitCost 2024", "Description for Pro Plan", 29.99, true),
            Subscription("b4f6e6e1-768e-4cf6-8f58-7cb847f4b8ea", "Desarrollo BSAA VS", "Description for Basic Plan", 9.99, true),
            Subscription("f3a2c0d1-5c3e-4c7f-a8c3-1d3dbf5a6f34", "MS Az Sponsorship AppDev 2024", "Description for Premium Plan", 19.99, false),
            Subscription("e7f8d2e2-9b1b-4f76-8d45-1c4b9c2a8e53", "MS Az Sponsorship BitCost 2024", "Description for Pro Plan", 29.99, true),
            Subscription("b4f6e6e1-768e-4cf6-8f58-7cb847f4b8ea", "Desarrollo BSAA VS", "Description for Basic Plan", 9.99, true),
            Subscription("f3a2c0d1-5c3e-4c7f-a8c3-1d3dbf5a6f34", "MS Az Sponsorship AppDev 2024", "Description for Premium Plan", 19.99, false),
            Subscription("e7f8d2e2-9b1b-4f76-8d45-1c4b9c2a8e53", "MS Az Sponsorship BitCost 2024", "Description for Pro Plan", 29.99, true),
        )
    }
}