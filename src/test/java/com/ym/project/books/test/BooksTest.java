package com.ym.project.books.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ym.project.books.junit.base.JunitBase;
import com.ym.project.books.model.Book;
import com.ym.project.books.service.BookService;
import com.ym.project.books.util.XmlUtil;

public class BooksTest extends JunitBase{

	@Autowired
	private BookService bookService;
	
	@Test
	public void insertBooks(){
		List<Book> list = XmlUtil.getBookList();
		try {
			bookService.insertBookList(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
