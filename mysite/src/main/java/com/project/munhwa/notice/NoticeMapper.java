package com.project.munhwa.notice;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoticeMapper {

	// 공지사항 등록
	void insertNotice(Notice notice);
}
