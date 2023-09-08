package com.tencent.p014mm.plugin.appbrand;

import android.graphics.Bitmap;
import bp0.C79745a;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84686v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Objects;
import u24.C90599h;

/* renamed from: com.tencent.mm.plugin.appbrand.e4 */
public class C81821e4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f240065d;

    /* renamed from: e */
    public final /* synthetic */ C79745a f240066e;

    /* renamed from: f */
    public final /* synthetic */ AppBrandInitConfigWC f240067f;

    public C81821e4(AppBrandRuntimeWC appBrandRuntimeWC, C79745a aVar, AppBrandInitConfigWC appBrandInitConfigWC) {
        this.f240065d = appBrandRuntimeWC;
        this.f240066e = aVar;
        this.f240067f = appBrandInitConfigWC;
    }

    public void run() {
        Log.m105925i("MicroMsg.AppBrand.RuntimeRestartHelper", "performRestart OnUiThread appId[%s]", this.f240065d.f238147j);
        try {
            Bitmap a = C81692d4.m100243a(this.f240065d);
            AppBrandRuntimeWC appBrandRuntimeWC = this.f240065d;
            ThreadLocal<Boolean> threadLocal = C84686v0.f247051a;
            if (!(appBrandRuntimeWC == null || a == null)) {
                if (!a.isRecycled()) {
                    C84686v0.f247052b.put(appBrandRuntimeWC, a);
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrand.RuntimeRestartHelper", "performRestart  takeSnapshot appId[%s], e[%s]", this.f240065d.f238147j, e);
        }
        Objects.requireNonNull(this.f240066e);
        this.f240067f.f234834c1 = this.f240065d.mo121253n1();
        if (this.f240065d.mo113210l1() == null || C90599h.m113509b(this.f240065d.mo113210l1().f234837q, this.f240067f.f234837q)) {
            this.f240067f.mo111299j();
        }
        this.f240067f.f234833b1 = new AppBrandRuntimeReloadReportBundle(this.f240065d.mo113210l1().f239379j1.f245832d, this.f240066e.f233723d);
        this.f240065d.mo113015J0(this.f240067f, this.f240066e.f233723d);
    }
}
