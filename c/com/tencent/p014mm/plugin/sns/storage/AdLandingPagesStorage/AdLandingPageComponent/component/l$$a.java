package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32227p;
import java.util.HashMap;
import java.util.Map;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l$$a */
public final /* synthetic */ class l$$a implements C32227p {

    /* renamed from: d */
    public final /* synthetic */ C95136l f82063d;

    /* renamed from: e */
    public final /* synthetic */ String f82064e;

    public /* synthetic */ l$$a(C95136l lVar, String str) {
        this.f82063d = lVar;
        this.f82064e = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        C95136l lVar = this.f82063d;
        lVar.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$handleJSAPI$0", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        lVar.mo131655Q(this.f82064e, (String) obj, new HashMap((Map) obj2));
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("lambda$handleJSAPI$0", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        return b0Var;
    }
}
