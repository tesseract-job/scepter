package com.kevin.sceptercommunication.resolve;


import com.kevin.sceptercommunication.core.context.BeatContext;

/**
 * @author liangxuekai
 */
public class ParamByteResolve implements IResolve<Byte> {

	@Override
	public Class<Byte> getResolveClass() {
		return Byte.class;
	}

	@Override
	public Byte resolve(BeatContext context, String paramName) {
		return Byte.valueOf(Byte.parseByte(context.getUrlParams().get(paramName)));
	}

}
