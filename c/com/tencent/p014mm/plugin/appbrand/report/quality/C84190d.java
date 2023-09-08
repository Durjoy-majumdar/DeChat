package com.tencent.p014mm.plugin.appbrand.report.quality;

import com.tencent.p014mm.plugin.appbrand.report.C84108d;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84197h;
import com.tencent.p014mm.sdk.platformtools.Log;
import te3.c65;

/* renamed from: com.tencent.mm.plugin.appbrand.report.quality.d */
public class C84190d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f245927d;

    /* renamed from: e */
    public final /* synthetic */ C84108d f245928e;

    public C84190d(String str, C84108d dVar) {
        this.f245927d = str;
        this.f245928e = dVar;
    }

    public void run() {
        C84108d dVar;
        int i;
        QualitySessionRuntime c = C84185b.m103770c(this.f245927d, true);
        if (c == null || (dVar = this.f245928e) == null) {
            Log.m105924i("MicroMsg.AppBrandQualitySystem", "hy: not need do sample");
            return;
        }
        c65 c65 = dVar.f245571c;
        if (c65 != null && (i = c65.f182417d) != 0) {
            Log.m105925i("MicroMsg.AppBrandQualitySystem", "hy: need do sample, type: %d, sampleInterval: %d", Integer.valueOf(i), Integer.valueOf(this.f245928e.f245571c.f182418e));
            C84197h.C84199b bVar = null;
            int i2 = this.f245928e.f245571c.f182417d;
            if (i2 == 1) {
                bVar = C84197h.C84199b.Light;
            } else if (i2 != 2) {
                Log.m105920e("MicroMsg.AppBrandQualitySystem", "hy: invalid type!!");
            } else {
                bVar = C84197h.C84199b.Full;
            }
            if (bVar != null) {
                c.f245864y.mo116902b(c, this.f245928e.f245571c.f182418e, bVar, true);
            }
        }
    }
}
