package com.xxl.mq.client.rpc.util;

import java.util.Properties;

/**
 * 环境基类
 * @author xuxueli 2015-8-28 10:37:43
 */
public class Environment {

	public static final String ZK_BASE_PATH = "/xxl-mq";

	/**
	 * rpc service address on zookeeper, service path : /xxl-mq/rpc/registrykey01/address01
     */
	public static final String ZK_SERVICES_PATH = ZK_BASE_PATH.concat("/rpc");

	/**
	 * consumer name on zookeepr, consumerpath : /xxl-mq/consumer01/address01
     */
	public static final String ZK_CONSUMER_PATH = ZK_BASE_PATH.concat("/consumer");

	/**
	 * zk config file
	 */
//	private static final String ZK_ADDRESS_FILE = "/data/webapps/xxl-conf.properties";
	// -Dxxl-file="E:\tac\xxl-mq\xxl-mq-broker\src\main\resources\xxl-conf.properties"
	private static final String ZK_ADDRESS_FILE = System.getProperty("xxl-file") ;

	/**
	 * zk address
	 */
	public static final String ZK_ADDRESS;		// zk地址：格式	ip1:port,ip2:port,ip3:port
	
	static {
		Properties prop = PropertiesUtil.loadFileProperties("E:\\tac\\xxl-mq\\xxl-mq-broker\\src\\main\\resources\\xxl-conf.properties");
		ZK_ADDRESS = PropertiesUtil.getString(prop, "zkserver");
	}
	
	public static void main(String[] args) {
		System.out.println(ZK_ADDRESS);
	}

}

