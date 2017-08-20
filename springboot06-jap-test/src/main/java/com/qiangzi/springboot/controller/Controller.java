package com.qiangzi.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qiangzi.springboot.pojo.Notice;
import com.qiangzi.springboot.service.NoticeService;

@RestController
public class Controller {

	//注入
	@Autowired
	private NoticeService noticeService;
	@GetMapping("/findAll")
	public  List<Notice> findAll(){
		return noticeService.findAll();
	}
}
