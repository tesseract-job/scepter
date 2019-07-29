package com.kevin.sceptercommunication.resolve;


import com.kevin.sceptercommunication.core.context.BeatContext;

/**
 * @author liangxuekai
 */
public class ParamBooleanResolve implements IResolve<Boolean> {

	@Override
	public Class<Boolean> getResolveClass() {
		return Boolean.class;
	}

	@Override
	public Boolean resolve(BeatContext context, String paramName) {
		return Boolean.valueOf(Boolean.parseBoolean(context.getUrlParams().get(paramName)));
	}

}
