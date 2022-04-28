package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.BoardDAO;
import com.board.domain.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;
	 
	// 게시판 목록
	@Override
	public List list() throws Exception {
		return dao.list();
	}

	//게시물 작성
	@Override
	public void write(BoardVO vo) throws Exception {
		dao.write(vo);
	}

	// 게시물 조회
	@Override
	public BoardVO view(int bd_no) throws Exception {
		return dao.view(bd_no);
	}

	// 게시물 조회
	@Override
	public void modify(BoardVO vo) throws Exception {
		dao.modify(vo);
	}
	
	// 게시물 삭제
	@Override
	public void delete(int bd_no) throws Exception {
		dao.delete(bd_no);
	}
}