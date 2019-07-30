package com.kevin.communication.resolve;


import com.kevin.communication.core.context.BeatContext;

/**
 * @author liangxuekai
 */
public class BeatContextResolve implements IResolve<BeatContext> {

	@Override
	public Class<BeatContext> getResolveClass() {
		return BeatContext.class;
	}

	@Override
	public BeatContext resolve(BeatContext context , String paramName) {
		return context;
	}

}
