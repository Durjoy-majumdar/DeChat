package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.q */
public final class C83584q implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ C82554k f244143d;

    /* renamed from: e */
    public final /* synthetic */ int f244144e;

    /* renamed from: f */
    public final /* synthetic */ C83585r f244145f;

    /* renamed from: g */
    public final /* synthetic */ MMActivity f244146g;

    public C83584q(C82554k kVar, int i, C83585r rVar, MMActivity mMActivity) {
        this.f244143d = kVar;
        this.f244144e = i;
        this.f244145f = rVar;
        this.f244146g = mMActivity;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        this.f244143d.mo109647a(this.f244144e, this.f244145f.mo115109j("ok"));
        this.f244146g.finish();
    }
}
