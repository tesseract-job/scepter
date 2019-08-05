package com.kevin.sceptercommunication.test;

import com.kevin.communication.core.NettyBootstrap;
import com.kevin.communication.core.config.SocketServerConfig;
import com.kevin.communication.core.hotkey.DefaultProxyFactory;

public class ServerClient {

	public static void main(String[] args) throws InterruptedException {
		//初始化配置信息
		SocketServerConfig serviceConfig = new SocketServerConfig();
		serviceConfig.setBasePackages("com.kevin.sceptercommunication.server.command");
		serviceConfig.setPort(9527);
		serviceConfig.setProxyFactory(new DefaultProxyFactory());
		
		NettyBootstrap boostrap = new NettyBootstrap(serviceConfig);
		boostrap.start();
	}

}
