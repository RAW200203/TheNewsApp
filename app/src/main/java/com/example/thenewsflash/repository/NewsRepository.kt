package com.example.thenewsflash.repository

import com.example.thenewsflash.api.RetrofitInstance
import com.example.thenewsflash.db.ArticleDatabase
import com.example.thenewsflash.models.Article
import retrofit2.http.Query

class NewsRepository(val db: ArticleDatabase) {

    suspend fun getHeadlines(countryCode:String, pageNumber: Int) =
        RetrofitInstance.api.getHeadLines(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getFavouriteNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}