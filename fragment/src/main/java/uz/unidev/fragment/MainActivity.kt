package uz.unidev.fragment

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import uz.unidev.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
//
//    override fun onStart() {
//        super.onStart()
//        Log.d("omir_cikli", "onStart")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.d("omir_cikli", "onResume")
//    }
//
//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//        Log.d("omir_cikli", "onSaveInstanceState")
//    }
//
//    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
//        super.onRestoreInstanceState(savedInstanceState)
//        Log.d("omir_cikli", "onRestoreInstanceState")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Log.d("omir_cikli", "onPause")
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//        Log.d("omir_cikli", "onRestart")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Log.d("omir_cikli", "onStop")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.d("omir_cikli", "onDestroy")
//    }
}