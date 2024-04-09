package com.d3if3010.teoremaphythagoras.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.d3if3010.teoremaphythagoras.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(navController: NavHostController){
    Scaffold(
        topBar = {
            TopAppBar (
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = stringResource(R.string.kembali),
                            tint = MaterialTheme.colorScheme.primary
                        )
                    }
                },
                title = {
                    Text(text = stringResource(id = R.string.tentang_aplikasi))
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                )
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
        ) {
            // Add your image here
            Image(
                painter = painterResource(id = R.drawable.rumus),
                contentDescription = "Teorema Pythagoras",
                modifier = Modifier.fillMaxWidth()
            )

            // Add explanatory text about the formula
            Text(
                text = stringResource(R.string.teorema_pythagoras_explanation),
                modifier = Modifier.padding(vertical = 16.dp)
            )

            // Add copyright text
            Text(
                text = stringResource(R.string.copyright),
                modifier = Modifier.padding(vertical = 16.dp)
            )
        }
    }
}



@Preview
@Composable
fun AboutScreenPreview() {
    AboutScreen(rememberNavController())
}