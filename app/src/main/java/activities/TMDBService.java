package activities;

import models.MovieEntity;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import service.response.GetMovieImagesResponse;
import service.response.SearchMovieResponse;

public interface TMDBService {

    @GET("search/movie")
    Call<SearchMovieResponse> searchMovie(@Query("query") String query, @Query("api_key") String api_key);

    @GET("search/multi")
    Call<Object> searchMulti(@Query("api_key") String api_key, @Query("query") String query);

    @GET("movie/{id}")
    Call<MovieEntity> getMovie(@Path("id") int id, @Query("api_key") String api_key);

    @GET("movie/popular")
    Call<MovieEntity> getPopularMovie(@Query("query") String query, @Query("api_key") String api_key);

    @GET("/movie/{id}/images")
    Call<GetMovieImagesResponse> getImage(@Path("id") int id, @Query("api_key") String api_key);

}