package com.kevin.message.protocol.exception;

/**
 * @author: liangxuekai
 * @description: JSON序列化出错
 * @updateRemark: 修改内容(每次大改都要写修改内容)
 * @date: 2019-07-29 17:53
 */
public class JSONSerializeException extends RemoteException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6585159057755382478L;

	public JSONSerializeException() {
		super(ExceptionType.JSON_SERIALIZE_EXCEPTION);
	}

	public JSONSerializeException(String message) {
		super(ExceptionType.JSON_SERIALIZE_EXCEPTION.getCode() , message);
	}

}
