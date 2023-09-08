package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32228q;
import java.util.HashMap;
import java.util.Map;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l$$e */
public class l$$e implements C32228q<String, String, Map<String, ? extends Object>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C95136l f82068d;

    public l$$e(C95136l lVar) {
        this.f82068d = lVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$19");
        String str = (String) obj;
        String str2 = (String) obj2;
        Map map = (Map) obj3;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$19");
        if (map != null) {
            C95136l.m121016K(this.f82068d, str, str2, new HashMap(map));
        }
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$19");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$19");
        return b0Var;
    }
}
