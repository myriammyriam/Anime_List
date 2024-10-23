package com.example.animeslist

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.animeslist.data.Anime
import com.example.animeslist.data.DataProvider

@Composable
fun Homepage(){
    val list = remember { DataProvider.Listanimes }
    LazyColumn(contentPadding = PaddingValues(horizontal = 20.dp, vertical = 50.dp)) {
        items(list){
            AnimeList(anime = it)
        }
    }
}