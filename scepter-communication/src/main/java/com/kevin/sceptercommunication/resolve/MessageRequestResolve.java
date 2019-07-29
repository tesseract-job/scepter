package com.kevin.sceptercommunication.resolve;

import com.kevin.message.protocol.message.RequestMessage;
import com.kevin.sceptercommunication.core.context.BeatContext;

/**
 * @author liangxuekai
 */
public class MessageRequestResolve implements IResolve<RequestMessage> {
	
	@Override
	public Class<RequestMessage> getResolveClass() {
		return RequestMessage.class;
	}

	@Override
	public RequestMessage resolve(BeatContext context , String paramName) {
		return context.getRequest();
	}

}
