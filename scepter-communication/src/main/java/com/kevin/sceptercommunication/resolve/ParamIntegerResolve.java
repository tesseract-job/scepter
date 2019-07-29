package com.kevin.sceptercommunication.resolve;


import com.kevin.sceptercommunication.core.context.BeatContext;

/**
 * @author liangxuekai
 */
public class ParamIntegerResolve implements IResolve<Integer> {

	@Override
	public Class<Integer> getResolveClass() {
		return Integer.class;
	}

	@Override
	public Integer resolve(BeatContext context, String paramName) {
		return Integer.valueOf(Integer.parseInt(context.getUrlParams().get(paramName)));
	}

}
