package com.tencent.kinda.framework.module.pay;

import com.tencent.kinda.framework.module.impl.TenpayCgiImpl;
import com.tencent.kinda.modularize.KindaModule;

public class KindaPayServiceModule extends KindaModule {
    public void configModule() {
        registerNativeModule("TenpayCgi", TenpayCgiImpl.class);
    }

    public void onAppCreate() {
    }
}
