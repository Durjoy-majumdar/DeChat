package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.C81879g;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.n */
public final class C1935n implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ C81879g f11811d;

    /* renamed from: e */
    public final /* synthetic */ int f11812e;

    /* renamed from: f */
    public final /* synthetic */ C1937p f11813f;

    /* renamed from: g */
    public final /* synthetic */ MMActivity f11814g;

    public C1935n(C81879g gVar, int i, C1937p pVar, MMActivity mMActivity) {
        this.f11811d = gVar;
        this.f11812e = i;
        this.f11813f = pVar;
        this.f11814g = mMActivity;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        C81879g gVar = this.f11811d;
        if (gVar != null) {
            gVar.mo109647a(this.f11812e, this.f11813f.mo115109j("ok"));
        }
        this.f11814g.finish();
    }
}
