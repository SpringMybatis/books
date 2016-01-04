package com.ym.project.books.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ym.project.books.model.Book;

/**
 * @author zhongjun Book-Service接口
 * 
 */
public interface BookService {

	/**
	 * book数据插入数据库
	 * 
	 * @param bookList
	 * @throws DataAccessException
	 */
	public void insertBookList(List<Book> bookList) throws Exception;

}
