package com.offcn.dao;

import com.offcn.pojo.Movie;
import org.springframework.stereotype.Repository;

import java.util.Date;
@Repository

public class MovieMapper {

    public Movie getMovie(){
        Movie movie = new Movie(1,"无问西东",38.8d,new Date());
        return movie;
    }
}
