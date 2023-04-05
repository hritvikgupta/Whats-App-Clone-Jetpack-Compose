package com.example.whats_app_clone_jetpackcompose.ui.view

import android.widget.Space
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.example.whats_app_clone_jetpackcompose.Data.Chat
import com.example.whats_app_clone_jetpackcompose.R
import com.example.whats_app_clone_jetpackcompose.ui.theme.Shapes
import com.example.whats_app_clone_jetpackcompose.ui.theme.Teal200
//import com.example.whats_app_clone_jetpackcompose.ui.theme.camera
//import com.example.whats_app_clone_jetpackcompose.ui.theme.note
import com.example.whats_app_clone_jetpackcompose.ui.theme.seenColor

@Composable
fun StatusView() {
    createUserStatus()
    Spacer(modifier = Modifier.height(10.dp))
    createFriendsStoryView()

}

@Composable
fun createFriendsStoryView(modifier: Modifier = Modifier) {
    Box(modifier = Modifier
        .fillMaxWidth()
    ){
        Row(Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
            Text(text = "I am user")
        }

    }
}
@Composable
fun createUserStatus(
    modifier: Modifier = Modifier
    ) {
    val userStatusImage = "https://randomuser.me/api/portraits/men/12.jpg"
    val seenColor = Teal200
    val unseenColor = Color.LightGray
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 5.dp, vertical = 16.dp)
        .background(color = Color.Transparent)) {
        Row(Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
            Image(
                painter = rememberImagePainter(data = userStatusImage),
                contentDescription = null,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(64.dp)
                    .border(5.dp, seenColor, CircleShape),
                contentScale = ContentScale.Crop
            )

            Column(Modifier.padding(horizontal = 8.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(modifier = Modifier.weight(2f), horizontalArrangement = Arrangement.Start) {
                        Text("My Status", modifier = Modifier.weight(2f))
                    }
//                    Spacer(modifier = Modifier.weight(2f))
//                    Text(text = "time added")
                    Row(modifier.weight(1f), horizontalArrangement = Arrangement.End) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_camera),
                            contentDescription = null,
                            modifier = Modifier
                                .clip(CircleShape)
                                .size(18.dp)
                                .weight(1f),
                        )
//                    Spacer(modifier = Modifier.weight(1f))
                        Image(
                            painter = painterResource(id = R.drawable.ic_notes),
                            contentDescription = null,
                            modifier = Modifier
                                .clip(CircleShape)
                                .size(18.dp)
                                .weight(1f)
                        )
                    }

                }
                Text(
                    "Add to my Status",
                    fontSize = 15.sp,
                    color = Color.Gray
                )
                Spacer(modifier = Modifier.height(16.dp))


            }
        }

    }
}