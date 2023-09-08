package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import di3.C86312j;
import p763ym.C79138l;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f1 */
public class C43059f1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f116557d;

    /* renamed from: e */
    public final /* synthetic */ Intent f116558e;

    /* renamed from: f */
    public final /* synthetic */ String f116559f;

    public C43059f1(C95093g1 g1Var, Context context, Intent intent, String str) {
        this.f116557d = context;
        this.f116558e = intent;
        this.f116559f = str;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageOpenAppBtnComp$1");
        ((C79138l) C86312j.m106911c(C79138l.class)).mo74000Sy(this.f116557d, this.f116558e, this.f116559f);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageOpenAppBtnComp$1");
    }
}
