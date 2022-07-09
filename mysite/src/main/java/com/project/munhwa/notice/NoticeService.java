package com.project.munhwa.notice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeService {

	@Autowired
	private NoticeMapper mapper;
	
	// 공지사항 등록
	public void insertNotice(Notice notice) {
		mapper.insertNotice(notice);
	}
}
