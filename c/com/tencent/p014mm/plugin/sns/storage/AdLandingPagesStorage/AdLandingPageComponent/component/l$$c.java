package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l$$c */
public class l$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f82065d;

    /* renamed from: e */
    public final /* synthetic */ String f82066e;

    /* renamed from: f */
    public final /* synthetic */ C95136l f82067f;

    public l$$c(C95136l lVar, boolean z, String str) {
        this.f82067f = lVar;
        this.f82065d = z;
        this.f82066e = str;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$11");
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("ret", Integer.valueOf(this.f82065d ? 1 : 2));
            C95136l.m121016K(this.f82067f, this.f82066e, this.f82065d ? "ok" : "fail", hashMap);
        } catch (Throwable th) {
            Log.m105920e("AdLandingNewH5Comp", "callbackQRResultToJS exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$11");
    }
}
