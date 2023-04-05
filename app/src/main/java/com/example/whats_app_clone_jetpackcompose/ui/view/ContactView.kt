package com.example.whats_app_clone_jetpackcompose.ui.view


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.whats_app_clone_jetpackcompose.Data.Call
import com.example.whats_app_clone_jetpackcompose.Data.DummyData

@Composable
fun ContactView() {
    val dummyData = DummyData.listCall
    LazyColumn{
        items(dummyData.size){index ->
        CallItem(dummyData[index])
        }
    }

}

@Composable
fun CallItem(call: Call) {
    Row(Modifier.padding(horizontal = 16.dp, vertical =8.dp)) {
        Box(modifier = Modifier.weight(1f)){
           Image(painter = rememberImagePainter(data = call.imageUrl),
               contentDescription =null,
           modifier = Modifier
               .padding()
               .clip(CircleShape)
               .size(64.dp),
           contentScale = ContentScale.Crop)
        }
        Column() {
            
        }

    }
    
}