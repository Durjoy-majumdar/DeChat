package com.tencent.p014mm.plugin.appbrand.launching;

import a14.C53916l;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.launching.C83341j;
import com.tencent.p014mm.plugin.appbrand.launching.C83351k;
import com.tencent.p014mm.plugin.appbrand.launching.C83387n;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import gy3.C87412m;
import kotlin.Result;
import kotlin.ResultKt;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.l */
public final class C83360l implements C83341j.C83342a<AppBrandInitConfigWC>, C83387n.C83388a {

    /* renamed from: a */
    public final /* synthetic */ C53916l<AppBrandInitConfigWC> f243590a;

    public C83360l(C53916l<? super AppBrandInitConfigWC> lVar) {
        this.f243590a = lVar;
    }

    /* renamed from: a */
    public void mo115495a(AppBrandInitConfigLU appBrandInitConfigLU, AppBrandStatObject appBrandStatObject, int i) {
        AppBrandInitConfigWC appBrandInitConfigWC = (AppBrandInitConfigWC) appBrandInitConfigLU;
        if (this.f243590a.mo74597a()) {
            this.f243590a.resumeWith(Result.m168114constructorimpl(appBrandInitConfigWC));
        }
    }

    /* renamed from: b */
    public void mo115634b(String str, String str2) {
        C87412m.m108594g(str2, "migrateTargetAppId");
        if (this.f243590a.mo74597a()) {
            C53916l<AppBrandInitConfigWC> lVar = this.f243590a;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(new C83351k.C83352a(str, str2))));
        }
    }
}
