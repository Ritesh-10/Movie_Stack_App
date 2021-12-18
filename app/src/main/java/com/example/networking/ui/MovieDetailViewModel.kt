package com.example.networking.ui
import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.networking.data.Movie
import com.example.networking.data.MovieDetailRepository

class MovieDetailViewModel(id: Long, application: Application): ViewModel(){
    private val repo: MovieDetailRepository =
        MovieDetailRepository(application)

    val movie: LiveData<Movie> =
        repo.getMovie(id)
}