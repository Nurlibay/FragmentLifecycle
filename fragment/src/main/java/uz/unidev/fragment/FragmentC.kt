package uz.unidev.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import uz.unidev.fragment.databinding.FragmentCBinding

/**
 *  Created by Nurlibay Koshkinbaev on 12/08/2022 16:44
 */

class FragmentC : Fragment(R.layout.fragment_c) {

    private lateinit var binding: FragmentCBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("FragmentC: omir_cikli", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("FragmentC: omir_cikli", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("FragmentC: omir_cikli", "onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCBinding.bind(view)
        Log.d("FragmentC: omir_cikli", "onViewCreated")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("FragmentC: omir_cikli", "onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("FragmentC: omir_cikli", "onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d("FragmentC: omir_cikli", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("FragmentC: omir_cikli", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("FragmentC: omir_cikli", "onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("FragmentC: omir_cikli", "onSaveInstanceState")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("FragmentC: omir_cikli", "onViewStateRestored")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("FragmentC: omir_cikli", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("FragmentC: omir_cikli", "onDestroy")

    }

    override fun onDetach() {
        super.onDetach()
        Log.d("FragmentC: omir_cikli", "onDetach")
    }
}