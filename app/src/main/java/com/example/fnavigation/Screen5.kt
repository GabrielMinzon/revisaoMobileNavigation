package com.example.fnavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun Screen5(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar { Text(text = "Tela 5") }
        }
    ) {
        // Screen content
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()

        ) {
            Text(text = "Lidamos com muitos erros na aplicação, visto que, a linguagem se atualiza constantemente.")
            Button(onClick = {navController.navigate(Destination.ScreenFirst.route)}) {
                Text(text = "Inicio")
            }
            Button(onClick = {navController.navigateUp()}) {
                Text(text = "Voltar a tela 4")
            }
        }
    }
}