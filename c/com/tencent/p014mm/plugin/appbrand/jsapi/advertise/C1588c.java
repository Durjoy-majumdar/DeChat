package com.tencent.p014mm.plugin.appbrand.jsapi.advertise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C1938p;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import ke3.C88144b;
import kr0.C88267e;
import ol0.C117832q0;
import p225rc.C89916g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.advertise.c */
public final class C1588c extends JsApiOpenAdCanvas<C88267e> {
    /* renamed from: w */
    public void mo1620w(int i) {
        C115669n.INSTANCE.mo175911u(C117832q0.CTRL_INDEX, i);
    }

    /* renamed from: x */
    public void mo1621x(C82381f fVar) {
        AppBrandInitConfigWC M1;
        C88267e eVar = (C88267e) fVar;
        C87412m.m108594g(eVar, "service");
        AppBrandRuntimeWC N0 = eVar.getRuntime();
        if (N0 != null && (M1 = N0.mo113210l1()) != null) {
            String appId = eVar.getAppId();
            C115669n.INSTANCE.mo160131h(15651, Integer.valueOf(M1.f234841u + 1000), Util.nullAsNil(appId));
        }
    }

    /* renamed from: y */
    public void mo1622y(C82381f fVar, Intent intent, int i) {
        C88267e eVar = (C88267e) fVar;
        C87412m.m108594g(eVar, "service");
        C87412m.m108594g(intent, "intent");
        AppBrandRuntimeWC N0 = eVar.getRuntime();
        Activity R = N0 != null ? N0.mo113026R() : null;
        if (R == null) {
            eVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
        } else if (eVar instanceof C1938p) {
            intent.setClassName(R, "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI");
            C89916g.m112446a(R).mo124236j(intent, new C1587b(eVar, i, this));
        } else {
            C88144b.m109791i(R, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, (Bundle) null);
            eVar.mo109647a(i, mo115109j("ok"));
        }
    }
}
