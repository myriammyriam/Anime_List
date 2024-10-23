package com.example.animeslist

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.animeslist.data.Anime

@Composable
fun AnimeList(anime: Anime){
    Card(modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp).fillMaxWidth()
        , shape = RoundedCornerShape(corner = CornerSize(16.dp)) ) {
        Row {
            Image(painter = painterResource(id=anime.imageId),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.padding(8.dp)
                    .size(84.dp)
                    .clip(RoundedCornerShape(corner = CornerSize(16.dp))))
            Column (modifier = Modifier.padding(16.dp)){
                Text(text = anime. title, style = typography.titleLarge)
                Text(text = anime.date, style = typography.bodyMedium)
                Text(text = anime.description, style = typography.bodySmall)
            }

        }
    }

}