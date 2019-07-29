package com.kevin.message.protocol.message;

/**
 * @author: liangxuekai
 * @description: 抽象消息体
 * @updateRemark: 更新日志
 * @date: 2019-07-29 17:57
 */
public abstract class DefaultMessage implements IMessage {
	
	protected String deviceId;
	
	protected long messageTime;
	
	@Override
	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	@Override
	public long getMessageTime() {
		return messageTime;
	}

	public void setMessageTime(long messageTime) {
		this.messageTime = messageTime;
	}

}
