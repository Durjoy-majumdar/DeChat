package com.tencent.p014mm.plugin.appbrand.report.quality;

import android.os.Handler;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.performance.C84001g;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.appbrand.report.quality.b$$a */
public final /* synthetic */ class b$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f245915d;

    public /* synthetic */ b$$a(AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f245915d = appBrandRuntimeWC;
    }

    public final void run() {
        QualitySessionRuntime c;
        AppBrandRuntimeWC appBrandRuntimeWC = this.f245915d;
        Log.m105925i("MicroMsg.AppBrandQualitySystem", "[QualitySystem] closeSession appId = [%s] runtime.hashCode = [%d]", appBrandRuntimeWC.f238147j, Integer.valueOf(appBrandRuntimeWC.hashCode()));
        String str = appBrandRuntimeWC.f238147j;
        if (!TextUtils.isEmpty(str) && (c = C84185b.m103770c(str, false)) != null && c.f245854o == appBrandRuntimeWC) {
            C84197h hVar = c.f245864y;
            synchronized (hVar) {
                Log.m105924i("MicroMsg.AppBrandRuntimeEventReporter", "dl: destroyed");
                hVar.f245937c = null;
                Handler handler = hVar.f245935a;
                if (handler != null) {
                    handler.removeCallbacks(hVar.f245936b);
                    hVar.f245935a = null;
                }
                C84001g gVar = hVar.f245938d;
                if (gVar != null) {
                    gVar.mo116645b();
                    hVar.f245938d = null;
                }
            }
            HashMap<String, QualitySessionRuntime> hashMap = C84185b.f245913b;
            synchronized (hashMap) {
                hashMap.put(str, (Object) null);
            }
        }
    }
}
