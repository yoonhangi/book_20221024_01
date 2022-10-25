package com.icia.book.repository;

import com.icia.book.dto.BookDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {
    @Autowired
    private SqlSessionTemplate sql;

    public int save(BookDTO bookDTO) {
        return sql.insert("Book.save", bookDTO);
    }

    public BookDTO findBook() {
        return sql.selectOne("Book.findBook");
    }

    public List<BookDTO> findAll() {
        return sql.selectList("Book.findAll");
    }

    public BookDTO findById(Long bookId) {
        return sql.selectOne("Book.findById", bookId);
    }
}
