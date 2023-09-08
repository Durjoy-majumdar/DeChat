package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.plugin.appbrand.app.C81194z;
import kr0.C88273g1;

/* renamed from: com.tencent.mm.plugin.appbrand.app.v1 */
public class C81188v1 implements Runnable {
    public C81188v1(C81161g2 g2Var) {
    }

    public void run() {
        if (AppForegroundDelegate.INSTANCE.f343454n) {
            C81161g2.Dx0("FirstScreenArrangement", C88273g1.ACCOUNT_INIT);
        }
        C81194z.zx0(C81194z.C81196b.FIRST_SCREEN);
    }
}
