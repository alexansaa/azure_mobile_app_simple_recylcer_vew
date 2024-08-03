package com.example.deber3.ui.resource

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.deber3.databinding.FragmentResourcesBinding

class ResourcesFragment : Fragment() {

    private var _binding: FragmentResourcesBinding? = null
    private val binding get() = _binding!!

    private lateinit var resourceViewModel: ResourcesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentResourcesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        resourceViewModel = ViewModelProvider(this).get(ResourcesViewModel::class.java)

        val recyclerView: RecyclerView = binding.rvResources
        recyclerView.layoutManager = LinearLayoutManager(context)

        resourceViewModel.resources.observe(viewLifecycleOwner) { resources ->
            recyclerView.adapter = ResourcesAdapter(resources)
        }

        val textView: TextView = binding.textResources
        resourceViewModel.text.observe(viewLifecycleOwner){
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}