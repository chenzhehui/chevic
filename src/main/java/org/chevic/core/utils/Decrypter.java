package org.chevic.core.utils;
//package org.chevic.base.common.utils;
//
//import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
///**
// * Jasypt ���ܡ�MD5���ܡ�
// * @author xa
// *
// */
//public class Decrypter {
//	private static final Logger log = LoggerFactory.getLogger(Decrypter.class) ;
//	
//	private StandardPBEStringEncryptor encrypter;
//	private String key ;
//	
//	public void setKey(String key){
//		this.key = key ;
//	}
//	
//	public String decryptOfJasypt(String decryptStr) throws Exception {
//		try {
//			log.info("Ҫ���ܵ���Ϣ decryptStr=[" + decryptStr + "]");
//			this.encrypter = new StandardPBEStringEncryptor();
//			encrypter.setPassword(this.key);
//			String decrypted = this.encrypter.decrypt(decryptStr);
//			log.info("���ܺ���:[" + decryptStr + "]");
//			return decrypted;
//		} catch (Exception e) {
//			log.error("���ܳ���");
//			throw new Exception(e);
//		}
//	}
//	
//	public String encryptOfJasypt(String encryptStr) throws Exception {
//		try {
//			log.info("Ҫ���ܵ���Ϣ decryptStr=[" + encryptStr + "]");
//			this.encrypter = new StandardPBEStringEncryptor();
//			log.info("the key is :"+ this.key) ;
//			encrypter.setPassword(this.key);
//			String encrypted = this.encrypter.encrypt(encryptStr);
//			log.info("���ܺ�����["+encrypted+"]");
//			return encrypted;
//		} catch (Exception e) {
//			log.error("���ܳ���");
//			throw new Exception(e);
//		}
//	}
//}
