package com.tencent.p014mm.plugin.appbrand.report.quality;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84197h;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Random;

/* renamed from: com.tencent.mm.plugin.appbrand.report.quality.b$$b */
public class b$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ QualitySessionRuntime f245916d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandSysConfigWC f245917e;

    public b$$b(QualitySessionRuntime qualitySessionRuntime, AppBrandSysConfigWC appBrandSysConfigWC) {
        this.f245916d = qualitySessionRuntime;
        this.f245917e = appBrandSysConfigWC;
    }

    public void run() {
        if (!this.f245916d.f245854o.mo113064k0()) {
            QualitySessionRuntime qualitySessionRuntime = this.f245916d;
            if (!qualitySessionRuntime.f245865z) {
                C84197h hVar = qualitySessionRuntime.f245864y;
                AppBrandSysConfigWC appBrandSysConfigWC = this.f245917e;
                hVar.getClass();
                Log.m105924i("MicroMsg.AppBrandRuntimeEventReporter", "AppBrandRuntimeEventReporter.mayStartDependOnClientSampleRate");
                int i = qualitySessionRuntime.f245854o.mo113210l1().f234818T;
                double d = appBrandSysConfigWC.f234876S0.f239284G;
                double nextDouble = new Random(((long) i) ^ System.nanoTime()).nextDouble();
                boolean z = DebuggerShell.f239772d;
                boolean z2 = nextDouble <= d || z;
                Log.m105925i("MicroMsg.AppBrandRuntimeEventReporter", "shouldEnableReport() returned: [%b], localRandom = [%f] serverPercent = [%f] monkeyMode[%b]", Boolean.valueOf(z2), Double.valueOf(nextDouble), Double.valueOf(d), Boolean.valueOf(z));
                if (z2) {
                    synchronized (hVar) {
                        hVar.mo116902b(qualitySessionRuntime, appBrandSysConfigWC.f234876S0.f239285H, C84197h.C84199b.Full, false);
                    }
                }
            }
        }
    }
}
