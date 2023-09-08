package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.l */
public final class C29502l {

    /* renamed from: a */
    public final String f80375a;

    /* renamed from: b */
    public boolean f80376b;

    /* renamed from: c */
    public boolean f80377c;

    public C29502l(String str) {
        C87412m.m108594g(str, "scope");
        this.f80375a = str;
    }

    /* renamed from: a */
    public final void mo56742a(boolean z, int i) {
        C115669n.INSTANCE.mo160131h(24877, this.f80375a, Integer.valueOf(this.f80376b ? 1 : 0), Integer.valueOf(z ? 1 : 0), Integer.valueOf(this.f80377c ? 1 : 0), Integer.valueOf(i));
        Log.m105924i("MicroMsg.AuthorizeReport", "scope=" + this.f80375a + ", userUserAgreementVisible=" + this.f80376b + ", userUserAgreementChecked=" + z + ",  hadTriggerUserUserAgreementAlert=" + this.f80377c + ", action=" + i);
    }
}
