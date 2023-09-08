package com.tencent.kinda.modularize;

import java.util.ArrayList;
import java.util.List;

public class KindaAppModuleManager {
    private List<KindaModule> moduleList = new ArrayList();

    public void initAllModule() {
        for (KindaModule next : this.moduleList) {
            next.configModule();
            next.initModuleInner();
        }
    }

    public void onAppCreate() {
        for (KindaModule onAppCreate : this.moduleList) {
            onAppCreate.onAppCreate();
        }
    }

    public void registerModule(KindaModule kindaModule) {
        if (kindaModule != null) {
            this.moduleList.add(kindaModule);
        }
    }
}
