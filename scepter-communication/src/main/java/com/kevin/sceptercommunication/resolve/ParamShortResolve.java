package com.kevin.sceptercommunication.resolve;


import com.kevin.sceptercommunication.core.context.BeatContext;

/**
 * @author liangxuekai
 */
public class ParamShortResolve implements IResolve<Short> {

	@Override
	public Class<Short> getResolveClass() {
		return Short.class;
	}

	@Override
	public Short resolve(BeatContext context, String paramName) {
		return Short.valueOf(Short.parseShort(context.getUrlParams().get(paramName)));
	}

}
