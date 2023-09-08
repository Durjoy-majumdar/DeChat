package com.tencent.p014mm.plugin.appbrand;

import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.appbrand.e$$h */
public class e$$h implements Runnable {
    public e$$h(C81810e eVar) {
    }

    public void run() {
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/AppBrandCommand$7", "run", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
        System.exit(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(obj, "com/tencent/mm/plugin/appbrand/AppBrandCommand$7", "run", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
    }
}
