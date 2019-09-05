package com.sundi.movie.dao;

import java.util.List;

import com.sundi.movie.domain.MovieVo;

public interface MovieMapper {

	List getMovieList(MovieVo vo);

}
