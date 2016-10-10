package com.crawler.config;

import java.io.IOException;
import java.util.Properties;

public class Config {
	/**
     * 是否持久化到数据库
     */
	private static boolean dbEnable;	
	/**
     * 手机号或者邮箱
     */
	private static String phoneNumberOrEmail; 
	/**
     * 登录密码
     */
	private static String password; 
	/**
     * db.name
     */
    public static String dbName;
    /**
     * db.username
     */
    public static String dbUsername;
    /**
     * db.host
     */
    public static String dbHost;
    /**
     * db.password
     */
    public static String dbPassword;
    
    //初始化配置 
    static{
    	Properties p = new Properties();
    	try {
            p.load(Config.class.getResourceAsStream("/config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    	phoneNumberOrEmail = p.getProperty("ZHIHU.phoneNumberOrEmail");
    	password = p.getProperty("ZHIHU.password");
    	dbEnable = Boolean.parseBoolean(p.getProperty("db.enable"));
    	if(dbEnable){
    		dbName = p.getProperty("dbName");
    		dbUsername = p.getProperty("dbUsername");
        	dbHost = p.getProperty("dbHost");
        	dbPassword = p.getProperty("dbPassword");
    	}
    }
	
}
