package com.tencent.p014mm.plugin.appbrand.performance;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.performance.i */
public class C84004i implements ComponentCallbacks2 {

    /* renamed from: com.tencent.mm.plugin.appbrand.performance.i$a */
    public class C84005a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f245255d;

        public C84005a(C84004i iVar, int i) {
            this.f245255d = i;
        }

        public void run() {
            int i = this.f245255d;
            int i2 = i != 5 ? i != 10 ? i != 15 ? i != 40 ? i != 60 ? i != 80 ? 99 : 2 : 3 : 4 : 6 : 7 : 8;
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175911u(1312, i2);
            nVar.mo175911u(1312, 1);
            Log.m105927v("MicroMsg.MemoryNegativeFeedbackReporter", "report onTrimMemory level:%d", Integer.valueOf(this.f245255d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.performance.i$b */
    public class C84006b implements Runnable {
        public C84006b(C84004i iVar) {
        }

        public void run() {
            C115669n.INSTANCE.mo175911u(1312, 0);
            Log.m105926v("MicroMsg.MemoryNegativeFeedbackReporter", "report onLowMemory");
        }
    }

    public C84004i(C84007j jVar) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        ((C119157j) C119157j.f356862d).mo183876g(new C84006b(this), "MemoryNegativeFeedbackReporter");
    }

    public void onTrimMemory(int i) {
        ((C119157j) C119157j.f356862d).mo183876g(new C84005a(this, i), "MemoryNegativeFeedbackReporter");
    }
}
