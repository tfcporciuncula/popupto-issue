package com.github.tfcporciuncula.popupto

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val navController = supportFragmentManager.findFragmentById(R.id.mainNavHost)!!.findNavController()
    val navGraph = navController.navInflater.inflate(R.navigation.nav_graph)
    navGraph.startDestination = if (true) R.id.fragmentA else R.id.fragmentB
    navController.graph = navGraph
  }
}
