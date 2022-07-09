package com.project.munhwa.notice;

import java.util.Date;

public class Notice {

	private int artcl_Seq;
	private String title;
	private String writer;
	private Date reg_date;
	private Date edit_date;
	private String hit;
	private String img_Origin_Nm;
	private String img_File_Nm;
	private String img_Path;
	
	public int getArtcl_seq() {
		return artcl_Seq;
	}
	public void setArtcl_seq(int artcl_Seq) {
		this.artcl_Seq = artcl_Seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public Date getEdit_date() {
		return edit_date;
	}
	public void setEdit_date(Date edit_date) {
		this.edit_date = edit_date;
	}
	public String getHit() {
		return hit;
	}
	public void setHit(String hit) {
		this.hit = hit;
	}
	public String getImg_Origin_Nm() {
		return img_Origin_Nm;
	}
	public void setImg_Origin_Nm(String img_Origin_Nm) {
		this.img_Origin_Nm = img_Origin_Nm;
	}
	public String getImg_File_Nm() {
		return img_File_Nm;
	}
	public void setImg_File_Nm(String img_File_Nm) {
		this.img_File_Nm = img_File_Nm;
	}
	public String getImg_Path() {
		return img_Path;
	}
	public void setImg_Path(String img_Path) {
		this.img_Path = img_Path;
	}
	
	@Override
	public String toString() {
		return "Notice [artcl_Seq=" + artcl_Seq + ", title=" + title + ", writer=" + writer + ", reg_date=" + reg_date
				+ ", edit_date=" + edit_date + ", hit=" + hit + ", img_Origin_Nm=" + img_Origin_Nm + ", img_File_Nm="
				+ img_File_Nm + ", img_Path=" + img_Path + "]";
	}
	
	
}
