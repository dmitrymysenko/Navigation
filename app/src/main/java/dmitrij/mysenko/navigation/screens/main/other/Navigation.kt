package dmitrij.mysenko.navigation.screens.main.other

import androidx.navigation.*
import androidx.navigation.compose.composable
import dmitrij.mysenko.navigation.navigation.NestedGraph
import dmitrij.mysenko.navigation.screens.Screen
import dmitrij.mysenko.navigation.screens.main.other.collapsing.CollapsingClassicScreen
import dmitrij.mysenko.navigation.screens.main.other.collapsing.CollapsingHalfVisibleRectScreen
import dmitrij.mysenko.navigation.screens.main.other.collapsing.CollapsingScreen
import dmitrij.mysenko.navigation.screens.main.other.draganddrop.DragAndDropScreen
import dmitrij.mysenko.navigation.screens.main.other.draganddrop.simple.SimpleDragAndDropScreen
import dmitrij.mysenko.navigation.screens.main.other.draganddrop.twolists.TwoListsDragAndDropScreen
import dmitrij.mysenko.navigation.screens.main.other.grid.GridLayoutScreen
import dmitrij.mysenko.navigation.screens.main.other.iosactivity.IosActivityScreen

fun NavGraphBuilder.otherGraph(navController: NavController) {
    navigation(
        startDestination = Screen.OtherScreen.route,
        route = NestedGraph.Other.route
    ) {
        composable(route = Screen.OtherScreen.route){
            OtherScreen(navController = navController)
        }
        composable(route = Screen.WallpaperScreen.route){
            WallpaperScreen(navController = navController)
        }
        composable(route = Screen.GridLayoutScreen.route){
            GridLayoutScreen(navController = navController)
        }
        composable(route = Screen.DragAndDropScreen.route){
            DragAndDropScreen(navController = navController)
        }
        composable(route = Screen.SimpleDragAndDropScreen.route){
            SimpleDragAndDropScreen(navController = navController)
        }
        composable(route = Screen.TwoListsDragAndDropScreen.route){
            TwoListsDragAndDropScreen(navController = navController)
        }
        composable(route = Screen.CollapsingScreen.route){
            CollapsingScreen(navController = navController)
        }
        composable(route = Screen.CollapsingHalfVisibleRectScreen.route){
            CollapsingHalfVisibleRectScreen(navController = navController)
        }
        composable(route = Screen.CollapsingClassicScreen.route){
            CollapsingClassicScreen(navController = navController)
        }
        composable(route = Screen.IosActivityScreen.route){
            IosActivityScreen(navController = navController)
        }
    }
}