package cl.mobdev.ejemplocomposelayoutbasico

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import cl.mobdev.ejemplocomposelayoutbasico.ui.LoginScreen
import cl.mobdev.ejemplocomposelayoutbasico.ui.theme.EjemploComposeLayoutBasicoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var isLoading by remember { mutableStateOf(false)}
            EjemploComposeLayoutBasicoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    LoginScreen(isLoading){
                        isLoading = true
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EjemploComposeLayoutBasicoTheme {
        LoginScreen(true){
            //TODO
        }
    }
}