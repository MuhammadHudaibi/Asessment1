package com.d3if3010.teoremaphythagoras.navigation

sealed class Screen (val route: String){
    data object Home: Screen("MainScreen")
    data object About: Screen("AboutScreen")
}