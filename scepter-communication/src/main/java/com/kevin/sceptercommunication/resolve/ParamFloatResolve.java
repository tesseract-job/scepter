package com.kevin.sceptercommunication.resolve;


import com.kevin.sceptercommunication.core.context.BeatContext;

/**
 * @author liangxuekai
 */
public class ParamFloatResolve implements IResolve<Float> {

	@Override
	public Class<Float> getResolveClass() {
		return Float.class;
	}

	@Override
	public Float resolve(BeatContext context, String paramName) {
		return Float.valueOf(Float.parseFloat(context.getUrlParams().get(paramName)));
	}

}
