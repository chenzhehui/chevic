package org.chevic.base.test;

import org.chevic.core.utils.MD5Encrypter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;


@RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring/applicationContext.xml")
public class MyTest {
	Logger log = LoggerFactory.getLogger(MyTest.class) ;
	
	@Test
    public void test() throws Exception{
		
		log.info("ÊÇ"+MD5Encrypter.md5Digest("chenzhehui")) ;

		
	}
}
