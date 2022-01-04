package com.example.tiketta

import android.content.ClipData
import android.net.wifi.p2p.nsd.WifiP2pUpnpServiceInfo.newInstance
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.tiketta.HargaTiketFragment.Companion.newInstance
import com.example.tiketta.databinding.ActivityMenuBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.lang.reflect.Array.newInstance
import javax.xml.datatype.DatatypeFactory.newInstance

class MenuActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            buttomNavView.setOnItemSelectedListener {
                when(it.itemId){
                    R.id.homeFragment->{
                        this@MenuActivity.findNavController(R.id.content).navigate(R.id.homeFragment)
                        true
                    }
                    R.id.jadwalFragment->{
                        this@MenuActivity.findNavController(R.id.content).navigate(R.id.jadwalFragment)
                        true
                    }
                    R.id.profilFragment->{
                        this@MenuActivity.findNavController(R.id.content).navigate(R.id.profilFragment)
                        true
                    }

                    R.id.hargaTiketFragment->{
                        this@MenuActivity.findNavController(R.id.content).navigate(R.id.hargaTiketFragment)
                        true
                    }
                    else -> {
                        findNavController(R.id.homeFragment)
                        true
                    }
                }
            }
        }
    }
////isi content
//        val fragment = HomeFragment.newInstance()
//    //Deteksi menu item yang di klik
//    private val menuItemSelected = BottomNavigationView.OnNavigationItemSelectedListener { item ->
//        when (item.itemId) {
//            R.id.itemHome -> {
//                val fragment = HomeFragment.newInstance("test1", "test2")
//                AddFragment(fragment)
//                return@OnNavigationItemSelectedListener true
//            }
//
//            R.id.itemJadwal -> {
//                val fragment = JadwalFragment.newInstance
//                AddFragment(fragment)
//                return@OnNavigationItemSelectedListener true
//            }
//
////            R.id.itemProfil -> {
////                val fragment = ProfilFragment.newInstance("test1", "test2")
////                addFragment(fragment)
////                return@OnNavigationItemSelectedListener true
////            }
//        }
//        false
//    }
//
//
//    //Memanggil fragment ke frame_layout di activity_menu
//    private fun AddFragment(fragment: Fragment){
//        supportFragmentManager
//            .beginTransaction()
//            .setCustomAnimations(R.anim.design_bottom_sheet_slide_in, R.anim.design_bottom_sheet_slide_out)
//            .replace(R.id.content, fragment, fragment.javaClass.getSimpleName())
//            .commit()
//    }
}