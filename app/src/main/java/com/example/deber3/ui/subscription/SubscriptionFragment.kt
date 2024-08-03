package com.example.deber3.ui.subscription

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
import com.example.deber3.databinding.FragmentSubscriptionBinding
import com.example.deber3.ui.resource.SubscriptionViewModel

class SubscriptionFragment : Fragment() {

    private var _binding: FragmentSubscriptionBinding? = null
    private val binding get() = _binding!!

    private lateinit var subscriptionViewModel: SubscriptionViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSubscriptionBinding.inflate(inflater, container, false)
        val root: View = binding.root

        subscriptionViewModel = ViewModelProvider(this).get(SubscriptionViewModel::class.java)

        val recyclerView: RecyclerView = binding.rvSubscripciones
        recyclerView.layoutManager = LinearLayoutManager(context)

        subscriptionViewModel.subscriptions.observe(viewLifecycleOwner) { subscriptions ->
            recyclerView.adapter = SubscriptionAdapter(subscriptions)
        }

        val textView: TextView = binding.textSubscriptions

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}