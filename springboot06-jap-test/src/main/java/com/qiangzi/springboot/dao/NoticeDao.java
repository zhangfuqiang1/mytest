package com.qiangzi.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qiangzi.springboot.pojo.Notice;
@Repository
public interface NoticeDao extends JpaRepository<Notice ,Long>{

}
