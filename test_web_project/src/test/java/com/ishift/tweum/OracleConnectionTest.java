package com.ishift.tweum;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OracleConnectionTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OracleConnectionTest.class);
	
	private static final String DRIVER
    ="oracle.jdbc.driver.OracleDriver";
    //연결문자열 jdbc:oracle:thin:@호스트:포트:sid
    private static final String URL
    ="jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER="scott";//아이디
    private static final String PW="tiger";//
    
    @Test
    public void test() throws ClassNotFoundException {
    	Class.forName(DRIVER);
    	
    	//괄호안에 리소스 자동 삭제 
        try(Connection conn=DriverManager.getConnection(URL, USER, PW)){
            LOGGER.info("오라클에 연결되었습니다");
        }catch(Exception e) {
        	LOGGER.info("오라클에 연결 실패");
            e.printStackTrace();
        }
    }
	
}
