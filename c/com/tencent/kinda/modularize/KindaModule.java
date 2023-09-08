package com.tencent.kinda.modularize;

import com.tencent.kinda.ConstructProxy;
import java.util.HashMap;

public abstract class KindaModule {
    private HashMap<String, Class> nativeModuleMap = new HashMap<>();
    private HashMap<String, Class> nativeViewMap = new HashMap<>();

    public abstract void configModule();

    public void initModuleInner() {
        for (String next : this.nativeModuleMap.keySet()) {
            ConstructProxy.proxyDefaultConstructor(this.nativeModuleMap.get(next), next);
        }
        for (String next2 : this.nativeViewMap.keySet()) {
            ConstructProxy.proxyDefaultConstructor(this.nativeViewMap.get(next2), next2);
        }
    }

    public abstract void onAppCreate();

    public void registerNativeModule(String str, Class cls) {
        if (str != null && cls != null) {
            this.nativeModuleMap.put(str, cls);
        }
    }

    public void registerView(String str, Class cls) {
        if (str != null && cls != null) {
            this.nativeViewMap.put(str, cls);
        }
    }
}
