package com.ishift.tweum;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@WebAppConfiguration
public class MyBatisTest {
	
	private final Logger logger =
			LoggerFactory.getLogger(MyBatisTest.class);
	
	@Autowired
    private SqlSession session;
    
    /*@Test
    public void testFactory() {
        System.out.println(session);
    }*/
    @Test
    public void testSession() {
    	logger.info("sqlSession : " + session);
    }
}
