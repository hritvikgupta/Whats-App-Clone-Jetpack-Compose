package com.example.whats_app_clone_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whats_app_clone_jetpackcompose.composable.AppTabs
import com.example.whats_app_clone_jetpackcompose.composable.AppTopBar
import com.example.whats_app_clone_jetpackcompose.ui.theme.WhatsAppCloneJetpackComposeTheme
import com.example.whats_app_clone_jetpackcompose.ui.view.ChatView
import com.example.whats_app_clone_jetpackcompose.ui.view.ContactView
import com.example.whats_app_clone_jetpackcompose.ui.view.StatusView

enum class HomeTab{
    CHATS, STATUS, CONTACTS
}
class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatsAppCloneJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HomeView()
                }
            }
        }
    }

    @Composable
    fun HomeView() {
        var showMenu by remember { mutableStateOf(false)}
       Scaffold( 
           topBar = {
               TopAppBar(
                   title = { Text("WhatsApp") },
                   elevation = 0.dp,
                    actions = {
                            DropdownMenu(expanded = showMenu ,
                                onDismissRequest = { showMenu =false}) {
                                DropdownMenuItem(onClick = {}) {
                                    Text("WhatsAppWeb")
                                    
                                }
                                DropdownMenuItem(onClick = {}) {
                                    Text("Settings")

                                }
                                
                            }
                            IconButton(onClick = { }) {
                                Icon(imageVector = Icons.Default.Search, contentDescription = null )
                            }
                            IconButton(onClick = {showMenu = showMenu!=true}) {
                            Icon(imageVector = Icons.Default.MoreVert, contentDescription = null )

                        }
                   }
               )
           },
           modifier = Modifier.fillMaxSize()
       ) {
           Column(Modifier.fillMaxSize()) {
               var tabSelected by remember { mutableStateOf(HomeTab.CHATS)}
               HomeTopBar(
                   tabSelected,
                   onTabSelected = {tabSelected = it}
               )
               when(tabSelected){
                   HomeTab.CHATS ->ChatView()
                   HomeTab.STATUS -> StatusView()
                   HomeTab.CONTACTS -> ContactView()
               }
           }
       }
    }
}

@Composable
fun HomeTopBar(
    tabSelected:HomeTab,
    onTabSelected:(HomeTab)->Unit
) {
    AppTopBar {topBarModifier->
        AppTabs(
            modifier = topBarModifier,
            titles = HomeTab.values().map{it.name},
            tabSelected = tabSelected,
            onTabSelected = {newTab->
                onTabSelected(HomeTab.values()[newTab.ordinal])
                
            }
        )
    }

}