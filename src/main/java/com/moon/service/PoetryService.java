package com.moon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.moon.dao.PoetryMapper;
import com.moon.entity.Poetry;
import com.moon.entity.PoetryEs;
import com.moon.repository.PoetryEsRepository;

@Transactional
@Service
public class PoetryService {
	@Autowired
	private PoetryMapper poetryMapper;
	@Autowired
	private PoetryEsRepository poetryEsRepository;

	public PoetryMapper getPoetryMapper() {
		return poetryMapper;
	}
	public List<Poetry> selectAll(){
		return poetryMapper.selectAll();
	}
	
	public void save(PoetryEs poetryEs) {
		poetryEsRepository.save(poetryEs);
	}
	public List<PoetryEs> selectByCOn(String word) {
		List<PoetryEs> lists =poetryEsRepository.findByContent(word);
		return lists;
	}

}