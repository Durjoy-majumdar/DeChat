package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o0 */
public class C95196o0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f276251d;

    /* renamed from: e */
    public final /* synthetic */ C95144m0.C95148d f276252e;

    public C95196o0(C95144m0.C95148d dVar, String str) {
        this.f276252e = dVar;
        this.f276251d = str;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$2");
        C76879j.m92726T(C95144m0.this.f276579d, this.f276251d);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$2");
    }
}
