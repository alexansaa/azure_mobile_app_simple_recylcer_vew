package com.example.deber3.ui.subscription

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.deber3.Subscription
import com.example.deber3.databinding.ItemSubscriptionBinding

class SubscriptionAdapter(private val subscriptions: List<Subscription>) :
    RecyclerView.Adapter<SubscriptionAdapter.SubscriptionViewHolder>() {

    class SubscriptionViewHolder(val binding: ItemSubscriptionBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubscriptionViewHolder {
        val binding = ItemSubscriptionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SubscriptionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SubscriptionViewHolder, position: Int) {
        val subscription = subscriptions[position]
        holder.binding.textViewSubscriptionName.text = subscription.name
        holder.binding.textViewSubscriptionId.text = subscription.id

    }

    override fun getItemCount() = subscriptions.size
}