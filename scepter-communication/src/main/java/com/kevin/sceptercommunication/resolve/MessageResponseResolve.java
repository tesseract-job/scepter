package com.kevin.sceptercommunication.resolve;

import com.kevin.message.protocol.message.ResponseMessage;
import com.kevin.sceptercommunication.core.context.BeatContext;

/**
 * @author liangxuekai
 */
public class MessageResponseResolve implements IResolve<ResponseMessage> {
	
	@Override
	public Class<ResponseMessage> getResolveClass() {
		return ResponseMessage.class;
	}

	@Override
	public ResponseMessage resolve(BeatContext context , String paramName) {
		return context.getResponse();
	}

}
