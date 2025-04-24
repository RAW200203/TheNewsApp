package com.example.thenewsflash.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.example.thenewsflash.db.Converters
import java.io.Serializable

@Entity(tableName = "articles")
@TypeConverters(Converters::class)
data class Article(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    val author: String?,
    val content: String?,
    val description: String?,
    val publishedAt: String?,
    val source: Source,
    val title: String?,
    val url: String,
    val urlToImage: String?
): Serializable
