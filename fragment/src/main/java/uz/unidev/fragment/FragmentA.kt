package uz.unidev.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.unidev.fragment.databinding.FragmentABinding

/**
 *  Created by Nurlibay Koshkinbaev on 12/08/2022 16:44
 */

class FragmentA : Fragment(R.layout.fragment_a) {

    private lateinit var binding: FragmentABinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("FragmentA: omir_cikli", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("FragmentA: omir_cikli", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("FragmentA: omir_cikli", "onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentABinding.bind(view)
        binding.btnNext.setOnClickListener {
            findNavController().navigate(FragmentADirections.actionFragmentAToFragmentB())
        }
        Log.d("FragmentA: omir_cikli", "onViewCreated")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("FragmentA: omir_cikli", "onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("FragmentA: omir_cikli", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("FragmentA: omir_cikli", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("FragmentA: omir_cikli", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("FragmentA: omir_cikli", "onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("FragmentA: omir_cikli", "onSaveInstanceState")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("FragmentA: omir_cikli", "onViewStateRestored")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("FragmentA: omir_cikli", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("FragmentA: omir_cikli", "onDestroy")

    }

    override fun onDetach() {
        super.onDetach()
        Log.d("FragmentA: omir_cikli", "onDetach")
    }
}