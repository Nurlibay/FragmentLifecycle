package uz.unidev.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.unidev.fragment.databinding.FragmentBBinding

/**
 *  Created by Nurlibay Koshkinbaev on 12/08/2022 16:44
 */

class FragmentB : Fragment(R.layout.fragment_b) {

    private lateinit var binding: FragmentBBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("FragmentB: omir_cikli", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("FragmentB: omir_cikli", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("FragmentB: omir_cikli", "onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBBinding.bind(view)
        binding.btnNext.setOnClickListener {
            findNavController().navigate(FragmentBDirections.actionFragmentBToFragmentC())
        }
        Log.d("FragmentB: omir_cikli", "onViewCreated")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("FragmentB: omir_cikli", "onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("FragmentB: omir_cikli", "onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d("FragmentB: omir_cikli", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("FragmentB: omir_cikli", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("FragmentB: omir_cikli", "onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("FragmentB: omir_cikli", "onSaveInstanceState")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("FragmentB: omir_cikli", "onViewStateRestored")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("FragmentB: omir_cikli", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("FragmentB: omir_cikli", "onDestroy")

    }

    override fun onDetach() {
        super.onDetach()
        Log.d("FragmentB: omir_cikli", "onDetach")
    }
}