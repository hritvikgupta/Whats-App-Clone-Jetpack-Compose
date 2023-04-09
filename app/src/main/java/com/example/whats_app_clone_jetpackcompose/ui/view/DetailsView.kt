package com.example.whats_app_clone_jetpackcompose.ui.view

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.example.whats_app_clone_jetpackcompose.Data.Chat
import com.example.whats_app_clone_jetpackcompose.Data.DummyData
import com.example.whats_app_clone_jetpackcompose.Data.Message
import com.example.whats_app_clone_jetpackcompose.DetailsActivity

@Composable
fun DetailStartActivity(onHome:()-> Unit) {
    val mContext = LocalContext.current
    val intent = Intent(mContext, DetailsActivity::class.java)
    intent.putExtra("extra_chatid", 0)
    mContext.startActivity(intent)
   }