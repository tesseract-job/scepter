package com.kevin.scepter.server.test;

import com.kevin.communication.core.NettyBootstrap;
import com.kevin.communication.core.config.SocketServerConfig;
import com.kevin.communication.core.hotkey.DefaultProxyFactory;
import com.kevin.communication.core.session.Session;
import com.kevin.communication.core.session.SessionManager;

import java.util.Map;

public class ServerTest {

	public static void main(String[] args) throws InterruptedException {
		//初始化配置信息
		SocketServerConfig serviceConfig = new SocketServerConfig();
		serviceConfig.setBasePackages("com.kevin.scepter.server.test.server.command");
		serviceConfig.setPort(9527);
		serviceConfig.setProxyFactory(new DefaultProxyFactory());
		
		NettyBootstrap boostrap = new NettyBootstrap(serviceConfig);
		boostrap.start();
		Map<String, Session> sessionMap = SessionManager.getInstance().getSessionMap();
		sessionMap.entrySet().stream().forEach(stringSessionEntry -> {
			Session session = stringSessionEntry.getValue();
			session.getCtx().channel().writeAndFlush("");
		});
	}

}
