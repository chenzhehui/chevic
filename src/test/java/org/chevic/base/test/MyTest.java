package org.chevic.base.test;

import org.chevic.base.common.utils.Decrypter;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.junit.Test;


@RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring/applicationContext.xml")
public class MyTest {
	@Autowired
	private Decrypter decrypter ;
	
	@Test
    public void test() throws Exception{
		decrypter.setKey("hi");
		decrypter.jasyptEncrypt("chenzhehui") ;
	}
}
