package com.offcn.service.impl;

import com.offcn.dao.MovieMapper;
import com.offcn.pojo.Movie;
import com.offcn.service.MovieService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieMapper movieMapper;
    @Override
    public Movie getNewMovie() {
        return movieMapper.getMovie();
    }
}
