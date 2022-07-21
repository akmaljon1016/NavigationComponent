package com.dars.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.dars.navigationcomponent.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {
    lateinit var binding: FragmentProfileBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNext.setOnClickListener {
//         findNavController().navigate(R.id.action_destination_person_to_imageFragment)
   val action=ProfileFragmentDirections.actionDestinationPersonToImageFragment(binding.edText.text.toString())
            findNavController().navigate(action)
        }
    }
}