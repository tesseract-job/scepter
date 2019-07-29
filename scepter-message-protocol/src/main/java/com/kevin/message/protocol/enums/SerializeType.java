package com.kevin.message.protocol.enums;


import com.kevin.message.protocol.serialize.ISerialize;
import com.kevin.message.protocol.serialize.JSONSerialize;

/**
 * @author: liangxuekai
 * @description: 序列化枚举
 * @updateRemark: 修改内容(每次大改都要写修改内容)
 * @date: 2019-07-29 17:51
 */
public enum SerializeType {

	/**
	 * json
	 */
	JSON(1 , new JSONSerialize()),
	
	/**
	 * java
	 */
	JAVABinary(2 , null),
	
	/**
	 * xml
	 */
	XML(3 , null);

	/**
	 * 序列化编码
	 */
	private final int code;
	
	/**
	 * 序列化对应的对象实体
	 */
	private final ISerialize serialize;
	
	private SerializeType(int code , ISerialize serialize) {
		this.code = code;
		this.serialize = serialize;
	}

	public int getCode() {
		return this.code;
	}

	public ISerialize getSerialize() {
		return serialize;
	}

	public static SerializeType getSerializeType(int code) {
		for (SerializeType type : values()) {
			if (type.code == code) {
				return type;
			}
		}
		return null;
	}

}
