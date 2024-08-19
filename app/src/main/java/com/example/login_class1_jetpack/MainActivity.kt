package com.example.login_class1_jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.login_class1_jetpack.ui.theme.Login_Class1_jetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Login_Class1_jetpackTheme {
                LoginScreen()
            }
        }
    }
}


@Composable
fun LoginScreen(){

    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }


    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = Modifier.weight(1f))
        Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "Logo")
        Text(text = "App")
        Box(modifier = Modifier.height(32.dp))
        TextField(value = email, onValueChange = {
            email = it
        }, modifier = Modifier.fillMaxWidth().padding(horizontal =  16.dp))
        Box(modifier = Modifier.height(16.dp))
        PasswordField(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
            onValue = {
                password= it
            },
            value = password)

        Box(modifier = Modifier.height(32.dp))
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Login")

        }
        Box(modifier = Modifier.weight(1f))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Login_Class1_jetpackTheme {
        LoginScreen()
    }
}