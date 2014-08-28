package org.chevic.core.utils;
//package org.chevic.base.common.utils;
//
//import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
///**
// * Jasypt 加密、MD5加密、
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
//			log.info("要解密的信息 decryptStr=[" + decryptStr + "]");
//			this.encrypter = new StandardPBEStringEncryptor();
//			encrypter.setPassword(this.key);
//			String decrypted = this.encrypter.decrypt(decryptStr);
//			log.info("解密后结果:[" + decryptStr + "]");
//			return decrypted;
//		} catch (Exception e) {
//			log.error("解密出错");
//			throw new Exception(e);
//		}
//	}
//	
//	public String encryptOfJasypt(String encryptStr) throws Exception {
//		try {
//			log.info("要加密的信息 decryptStr=[" + encryptStr + "]");
//			this.encrypter = new StandardPBEStringEncryptor();
//			log.info("the key is :"+ this.key) ;
//			encrypter.setPassword(this.key);
//			String encrypted = this.encrypter.encrypt(encryptStr);
//			log.info("加密后结果：["+encrypted+"]");
//			return encrypted;
//		} catch (Exception e) {
//			log.error("加密出错");
//			throw new Exception(e);
//		}
//	}
//}
