package com.ishift.tweum.persistence;

import java.util.List;

import com.ishift.tweum.model.Board;

public interface BoardDao {
	
	//게시글 CRUD 정의
	int create(Board board);
	Board read(int bno);
	List<Board> read();
	int update(int bno, int increment);
	int delete(int bno);
	
	List<Board> searchByKeyword(int type, String keyword);
}
