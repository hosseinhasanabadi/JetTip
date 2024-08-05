package com.example.jettip

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jettip.components.InputField
import com.example.jettip.ui.theme.JetTipTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetTipTheme {
                MyApp {

                }

            }
        }
    }
}
@Composable
fun MyApp(content:@Composable () -> Unit){
    Surface(color = MaterialTheme.colorScheme.background) {

    }

}
@Preview
@Composable
fun TopHeader(totalPerPerson:Double = 132.0){
    Surface (modifier = Modifier
        .fillMaxWidth()
        .height(150.dp)
        .padding(8.dp)
        .clip(shape = RoundedCornerShape(corner = CornerSize(2.dp)))
        , color = Color(0xFFE9D7F7)
    ){
        Column(modifier = Modifier
            .padding(12.dp)
            , verticalArrangement = Arrangement.Center
            , horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val total = "%.2f".format(totalPerPerson)
            Text(text = "Total Per Person",
                //h5
                style =MaterialTheme.typography.headlineSmall)
            Text(text = "$$total",
                //H4
                style = MaterialTheme.typography.displayMedium,
                fontWeight = FontWeight.ExtraBold)
        }
    }
}

@Preview
@Composable
fun MainContent(){
    Surface(modifier = Modifier
        .padding(20.dp)
        .fillMaxWidth(), shape = RoundedCornerShape(corner = CornerSize(8.dp))
        , border = BorderStroke(width = 1.dp, color = Color.LightGray)

    ) {
        Column() {
           /* InputField(
                valueState = ,
                labelId = ,
                enabled = ,
                isSingleLine =

                ),
*/

        }

    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetTipTheme {
    }
}