package com.sundi.movie.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sundi.movie.domain.MovieVo;
import com.sundi.movie.service.MovieService;


@Controller
public class MovieController {

	@Resource
	private MovieService service;
	
	@RequestMapping("list")
	public String getMovieList(Model m,MovieVo vo) {
		List list = service.getMovieList(vo);
		m.addAttribute("list", list);
		m.addAttribute("vo", vo);
		return "list";
	}
	
}
