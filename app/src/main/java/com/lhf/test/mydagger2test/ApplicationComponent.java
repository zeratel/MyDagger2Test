package com.lhf.test.mydagger2test;

import dagger.Component;

/**
 * com.lhf.test.mydagger2test
 * Created by zeratel3000
 * on 2016 01 16/1/6 22 57
 * description 连接提供依赖和消费依赖对象的组件
 */
@Component(modules = AndroidModule.class)
public interface ApplicationComponent {
    void inject(MainActivity activity);
}
