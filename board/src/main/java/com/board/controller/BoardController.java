package com.board.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.domain.BoardVO;
import com.board.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	@Inject
	private BoardService service;
			
	// 게시물 목록
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void getList(Model model) throws Exception {
		List list = null;
		list = service.list();
		model.addAttribute("list", list);
	}

	//게시물 작성 페이지
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public void postWrite(Model model) throws Exception {
		model.addAttribute("write");
	}
	
	//작성된 게시물 저장
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String postWrite(BoardVO vo) throws Exception {
		service.write(vo);
		return "redirect:/board/list";
	}
	
	// 게시물 조회
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public void getView(@RequestParam("bd_no") int bd_no, Model model) throws Exception {
		BoardVO vo = service.view(bd_no);
		model.addAttribute("view", vo);
	}
	
	// 게시물 수정
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void getModify(@RequestParam("bd_no") int bd_no, Model model) throws Exception {
		BoardVO vo = service.view(bd_no);
		model.addAttribute("view", vo);
	}
	
	// 게시물 수정 시
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String getModify(BoardVO vo) throws Exception {
		service.modify(vo);
		return "redirect:/board/view?bd_no=" + vo.getBd_no();
	}
	
	// 게시물 삭제
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String getDelete(@RequestParam("bd_no") int bd_no, Model model) throws Exception {
		service.delete(bd_no);
		
		return "redirect:/board/list";
	}
}





