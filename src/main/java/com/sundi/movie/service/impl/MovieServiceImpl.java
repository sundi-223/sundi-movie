package com.sundi.movie.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sundi.movie.dao.MovieMapper;
import com.sundi.movie.domain.MovieVo;
import com.sundi.movie.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService{

	@Resource
	private MovieMapper mapper;

	@Override
	public List getMovieList(MovieVo vo) {
		// TODO Auto-generated method stub
		return mapper.getMovieList(vo);
	}
}
