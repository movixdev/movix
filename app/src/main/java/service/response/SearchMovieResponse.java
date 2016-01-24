package service.response;


import java.util.List;

import models.MovieEntity;

/**
 * Created by Maxence Cheillan on 14/01/2016.
 */

public class SearchMovieResponse extends MovieEntity {
    private List<MovieEntity> results;


    public List<MovieEntity> getResults() {
        return results;
    }

}
