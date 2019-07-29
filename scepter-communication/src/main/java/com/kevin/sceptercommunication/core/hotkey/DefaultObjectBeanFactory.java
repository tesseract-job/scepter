package com.kevin.sceptercommunication.core.hotkey;

/**
 * @author: liangxuekai
 * @description: 默认对象工厂
 * @updateRemark: 修改内容(每次大改都要写修改内容)
 * @date: 2019-07-29 18:58
 */
public class DefaultObjectBeanFactory implements IObjectBeanFactory {

    @Override
    public Object createBean(Class<?> clazz) throws Exception {
        return clazz.newInstance();
    }

}
