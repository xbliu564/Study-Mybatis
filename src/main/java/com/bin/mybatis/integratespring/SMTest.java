package com.bin.mybatis.integratespring;

import com.bin.mybatis.integratespring.bean.User;
import com.bin.mybatis.integratespring.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)// 使用Spring的测试框架.
@ContextConfiguration("/com/bin/mybatis/integratespring/beans.xml")// 加载spring的配置文件beans.xml
public class SMTest {
	
	@Autowired
	private UserMapper userMapper ;
//	@Autowired
//	private TransactionTemplate transactionTemplate ;
	
	@Test
	public void testAdd(){
		User user = new User(-1,"tom",new Date(),12343) ;
		userMapper.save(user);
	}
}
