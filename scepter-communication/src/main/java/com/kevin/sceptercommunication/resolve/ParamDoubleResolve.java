package com.kevin.sceptercommunication.resolve;


import com.kevin.sceptercommunication.core.context.BeatContext;

/**
 * @author liangxuekai
 */
public class ParamDoubleResolve implements IResolve<Double> {

	@Override
	public Class<Double> getResolveClass() {
		return Double.class;
	}

	@Override
	public Double resolve(BeatContext context, String paramName) {
		return Double.valueOf(Double.parseDouble(context.getUrlParams().get(paramName)));
	}

}
