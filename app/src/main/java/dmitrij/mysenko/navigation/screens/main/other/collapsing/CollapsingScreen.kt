package dmitrij.mysenko.navigation.screens.main.other.collapsing

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dmitrij.mysenko.navigation.screens.Screen
import dmitrij.mysenko.navigation.shared.CurrentRoute

@Composable
fun CollapsingScreen(navController: NavController){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        CurrentRoute(navController = navController)

        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                navController.navigate(Screen.CollapsingHalfVisibleRectScreen.route)
            },
            modifier = Modifier.fillMaxWidth(0.8f)
        ) {
            Text(text = "Half visible rect")
        }

        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                navController.navigate(Screen.CollapsingClassicScreen.route)
            },
            modifier = Modifier.fillMaxWidth(0.8f)
        ) {
            Text(text = "Classic")
        }
    }
}