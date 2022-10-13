package david.ferrer.practicabotones

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import david.ferrer.practicabotones.ui.theme.PracticaBotonesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticaBotonesTheme {
                MyButton()
            }
        }
    }
}

@Composable
fun MyButton(){
    val count = remember{mutableStateOf(0)}
   Column(
       horizontalAlignment = Alignment.CenterHorizontally,
       verticalArrangement = Arrangement.Center,
       modifier = Modifier.fillMaxSize()
   ) {
       Text(text = "El valor es: ${count.value}")
       
       Button(
           onClick = {count.value++},
           colors = ButtonDefaults.buttonColors(
               backgroundColor = Color.Black,
               contentColor = Color.Blue,
               disabledBackgroundColor = Color.Cyan,
               disabledContentColor = Color.Magenta

           )
       ) {
           Text(text = "Puñeta")
       }
       
       Spacer(modifier = Modifier.padding(30.dp))
       
       OutlinedButton(onClick = { /*TODO*/ }) {
           Text(text = "Puño")
       }
       Spacer(modifier = Modifier.padding(30.dp))

       TextButton(onClick = { /*TODO*/ }) {
           Text(text = "AAAA")
       }
       Spacer(modifier = Modifier.padding(30.dp))

       Image(
           painter = painterResource(
               id = R.drawable.ic_launcher_background
           ),
           contentDescription = "Ejemplo",
           modifier = Modifier.clip(CircleShape)
               .border(4.dp, Color.Red, CircleShape)
               .clickable { count.value++ }
       )


   }
}

