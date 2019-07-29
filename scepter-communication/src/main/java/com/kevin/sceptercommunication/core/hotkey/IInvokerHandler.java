package com.kevin.sceptercommunication.core.hotkey;

import com.kevin.sceptercommunication.core.context.BeatContext;

/**
 * @author: liangxuekai
 * @description: 接口
 * @updateRemark: 修改内容(每次大改都要写修改内容)
 * @date: 2019-07-29 18:59
 */
public interface IInvokerHandler {

    /**
     * 调用方法
     *
     * @param context - BeatContext
     * @throws Exception
     */
    public void invoke(BeatContext context) throws Exception;

}
