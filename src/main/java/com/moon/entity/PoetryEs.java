package com.moon.entity;

import java.io.Serializable;

import javax.persistence.Id;

import org.springframework.data.elasticsearch.annotations.Document;

//es要求他管理的实体类,需要加上@Document,
//indexName叫做索引名(关系库:数据库名),
//type叫数据类型(关系库table名)
//poetry叫索引名(关系库:属性名)
@Document(indexName = "knowledge", type = "poetry")
public class PoetryEs implements Serializable {

	@Id
	private Integer id;

	private String title;

	private String author;

	private String kind;

	private String intro;

	private String content;

	private static final long serialVersionUID = 1L;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
