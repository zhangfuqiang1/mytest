package com.qiangzi.springroot.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qiangzi.springboot.Application;
import com.qiangzi.springboot.pojo.Notice;
import com.qiangzi.springboot.service.NoticeService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class SpringbootTest {
	@Autowired
	private NoticeService noticeService;
	@Test
	public void findAll(){
		List<Notice> findAll = noticeService.findAll();
		System.out.println(findAll);
	}
}
