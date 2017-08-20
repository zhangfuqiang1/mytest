package com.qiangzi.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qiangzi.springboot.dao.NoticeDao;
import com.qiangzi.springboot.pojo.Notice;

@Service
@Transactional
public class NoticeServiceImpl implements NoticeService {

	//注入  
	@Autowired
	private NoticeDao noticeDao;
	
	public List<Notice> findAll() {
		
		return noticeDao.findAll();
	}

}
