package com.kevin.sceptercommunication.resolve;

import com.alibaba.fastjson.JSONArray;
import com.kevin.message.protocol.utility.FastJsonHelper;
import com.kevin.sceptercommunication.core.context.BeatContext;

/**
 * @author liangxuekai
 */
public class JSONArrayResolve implements IResolve<JSONArray> {
	
	private static final JSONArray EMPTY_OBJECT = new JSONArray();

	@Override
	public Class<JSONArray> getResolveClass() {
		return JSONArray.class;
	}

	@Override
	public JSONArray resolve(BeatContext context , String paramName) {
		String d = context.getRequest().getBody();
		if(d == null) {
			return EMPTY_OBJECT;
		}
		
		return FastJsonHelper.toJsonArray(d);
	}

}
