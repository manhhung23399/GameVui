package com.sun.gamevui.data

import com.sun.gamevui.data.remote.ApiService

class GameRemoteDataSource(
    private val apiService: ApiService
) : GameDataSource.Remote {
    override suspend fun getPopularGames(platform: String) =
        apiService.getPopularGames(platform)

    override suspend fun getGameByGenre(genre: String, platform: String) =
        apiService.getGamesByGenre(genre, platform)
}