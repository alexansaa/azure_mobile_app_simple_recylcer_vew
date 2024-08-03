package com.example.deber3.ui.resource

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.deber3.databinding.ItemResourcesBinding
import com.example.deber3.ui.Resource

class ResourcesAdapter (private val resources: List<Resource>):
    RecyclerView.Adapter<ResourcesAdapter.ResourcesViewHolder>() {

    class ResourcesViewHolder(val binding: ItemResourcesBinding):
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ResourcesAdapter.ResourcesViewHolder {
        val binding = ItemResourcesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ResourcesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ResourcesViewHolder, position: Int) {
        val resource = resources[position]
        holder.binding.textViewResourceName.text = resource.name
        holder.binding.textViewResourceId.text = resource.id
    }

    override fun getItemCount() = resources.size
}