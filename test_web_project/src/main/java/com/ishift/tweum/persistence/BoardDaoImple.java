package com.ishift.tweum.persistence;

import java.util.List;

import com.ishift.tweum.model.Board;

public class BoardDaoImple implements BoardDao {
	
	private static final String BOARD_MAPPER =
			"com.ishift.mappers.BoardMapper";
	

	@Override
	public int create(Board board) {
		
		return 0;
	}

	@Override
	public Board read(int bno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Board> read() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(int bno, int increment) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int bno) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Board> searchByKeyword(int type, String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
