package com.ym.project.books.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ym.project.books.dao.BookDAO;
import com.ym.project.books.model.Book;
import com.ym.project.books.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	/**
	 * 注入dao
	 */
	@Autowired
	private BookDAO bookDAO;
	
	/**
	 * 数据库标识
	 */
	private boolean oracleFlag;
	
	/**
	 * 日志
	 */
	private Logger log = Logger.getLogger(BookServiceImpl.class);
	
	public boolean isOracleFlag() {
		return oracleFlag;
	}

	@Value("#{propertiesReader['DATABASE.SELETOR.ORACLE.TEST']}")
	public void setOracleFlag(boolean oracleFlag) {
		this.oracleFlag = oracleFlag;
	}

	public void insertBookList(List<Book> bookList) throws Exception {
		log.info("BookServiceImpl insertBookList start...");
		this.bookDAO.insertBookList(oracleFlag,bookList);
		log.info("BookServiceImpl insertBookList end...");
	}

}
