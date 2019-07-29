package com.kevin.sceptercommunication.resolve;


import com.kevin.sceptercommunication.core.context.BeatContext;

/**
 * @author liangxuekai
 */
public class ParamStringResolve implements IResolve<String> {

	@Override
	public Class<String> getResolveClass() {
		return String.class;
	}

	@Override
	public String resolve(BeatContext context , String paramName) {
		return context.getUrlParams().get(paramName);
	}

}
