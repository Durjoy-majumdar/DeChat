package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.os.Bundle;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C43047e;
import com.tencent.p014mm.sdk.platformtools.Log;
import d93.C45310h;
import e00.C7580y;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f */
public class C43058f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bundle f116554d;

    /* renamed from: e */
    public final /* synthetic */ C45310h f116555e;

    /* renamed from: f */
    public final /* synthetic */ C7580y f116556f;

    public C43058f(C43047e.C43048a aVar, Bundle bundle, C45310h hVar, C7580y yVar) {
        this.f116554d = bundle;
        this.f116555e = hVar;
        this.f116556f = yVar;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$1$2");
        try {
            if (this.f116554d.containsKey("jsapi_preverify_fun_list")) {
                C45310h hVar = this.f116555e;
                if (hVar != null) {
                    hVar.mo70866i(this.f116554d);
                    this.f116556f.mo8700d();
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$1$2");
                }
            }
            boolean z = true;
            Object[] objArr = new Object[1];
            if (this.f116555e == null) {
                z = false;
            }
            objArr[0] = Boolean.valueOf(z);
            Log.m105921e("AdLandingFloatWebView", "has JSAPI_CONTROL_BYTES wvPerm %b", objArr);
            this.f116556f.mo8700d();
        } catch (Throwable unused) {
            Log.m105920e("AdLandingFloatWebView", "In onCallback method, it happens something unwanted!");
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$1$2");
    }
}
