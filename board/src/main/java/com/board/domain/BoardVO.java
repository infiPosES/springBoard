package com.board.domain;

import java.util.Date;

public class BoardVO {
	/* 
	CREATE TABLE board.t_board (
		bd_no int not null auto_increment,
		bd_title varchar(50) not null,
		bd_content text not null,
		bd_writer varchar(30) not null,
		bd_regDate timestamp not null default now(),
		bd_viewCnt int default 0,
		primary key(bd_no)
	)
	 */
	private int bd_no;
	private String bd_title;
	private String bd_content;
	private String bd_writer;
	private Date bd_regDate;
	private int bd_viewCnt;

	public int getBd_no() {
		return bd_no;
	}
	public void setBd_no(int bd_no) {
		this.bd_no = bd_no;
	}
	public String getBd_title() {
		return bd_title;
	}
	public void setBd_title(String bd_title) {
		this.bd_title = bd_title;
	}
	public String getBd_content() {
		return bd_content;
	}
	public void setBd_content(String bd_content) {
		this.bd_content = bd_content;
	}
	public String getBd_writer() {
		return bd_writer;
	}
	public void setBd_writer(String bd_writer) {
		this.bd_writer = bd_writer;
	}
	public Date getBd_regDate() {
		return bd_regDate;
	}
	public void setBd_regDate(Date bd_regDate) {
		this.bd_regDate = bd_regDate;
	}
	public int getBd_viewCnt() {
		return bd_viewCnt;
	}
	public void setBd_viewCnt(int bd_viewCnt) {
		this.bd_viewCnt = bd_viewCnt;
	}
	
	
}
