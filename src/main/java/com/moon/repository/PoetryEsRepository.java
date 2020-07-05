package com.moon.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.moon.entity.PoetryEs;


public interface PoetryEsRepository extends ElasticsearchRepository<PoetryEs, Integer> {

	public List<PoetryEs> findByContent(String word);

}
