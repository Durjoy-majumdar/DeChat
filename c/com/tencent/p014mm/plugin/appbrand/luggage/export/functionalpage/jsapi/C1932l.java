package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.l */
public final class C1932l implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ C82381f f11803d;

    /* renamed from: e */
    public final /* synthetic */ int f11804e;

    /* renamed from: f */
    public final /* synthetic */ C1933m f11805f;

    /* renamed from: g */
    public final /* synthetic */ MMActivity f11806g;

    public C1932l(C82381f fVar, int i, C1933m mVar, MMActivity mMActivity) {
        this.f11803d = fVar;
        this.f11804e = i;
        this.f11805f = mVar;
        this.f11806g = mMActivity;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        C82381f fVar = this.f11803d;
        if (fVar != null) {
            fVar.mo109647a(this.f11804e, this.f11805f.mo115109j("ok"));
        }
        this.f11806g.finish();
    }
}
