package com.moon.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moon.entity.Poetry;
import com.moon.entity.PoetryEs;
import com.moon.service.PoetryService;
import com.moon.utils.BaseController;

@Controller
@RequestMapping("/moon/Poetry")
public class PoetryController extends BaseController {
	@Autowired
	private PoetryService poetryService;
	
	@RequestMapping("/selectByEs")
	@ResponseBody
	public List<PoetryEs> selectByCon(String word){
		List<PoetryEs> lists=poetryService.selectByCOn(word); 
		return lists;
	}
	
	
	
	@RequestMapping("/initDara")
	@ResponseBody
	public String initData() {
		List<Poetry> lists =poetryService.selectAll();
		for(Poetry poetry:lists) {
			PoetryEs poetryEs=new PoetryEs();
			BeanUtils.copyProperties(poetry, poetryEs);
			poetryService.save(poetryEs);
			System.out.println(poetryEs.getTitle());
		}
		return "lists";
	}
	
	
}