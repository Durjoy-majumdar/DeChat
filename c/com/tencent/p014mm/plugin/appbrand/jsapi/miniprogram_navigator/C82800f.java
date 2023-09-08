package com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.luggage.sdk.launching.C80242c;
import com.tencent.p014mm.sdk.platformtools.Util;
import p284zb.C91635f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.f */
public class C82800f extends C80242c<Bundle> {

    /* renamed from: b */
    public final /* synthetic */ C91635f f242170b;

    /* renamed from: c */
    public final /* synthetic */ int f242171c;

    /* renamed from: d */
    public final /* synthetic */ C82801g f242172d;

    public C82800f(C82801g gVar, C91635f fVar, int i) {
        this.f242172d = gVar;
        this.f242170b = fVar;
        this.f242171c = i;
    }

    /* renamed from: a */
    public void mo111345a(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        if (bundle == null) {
            this.f242170b.mo109647a(this.f242171c, this.f242172d.mo115109j("fail:internal error"));
            return;
        }
        bundle.setClassLoader(C82801g.class.getClassLoader());
        if (bundle.get("KEY_PRECONDITION_RESULT") != null) {
            this.f242170b.mo109647a(this.f242171c, this.f242172d.mo115109j("ok"));
            return;
        }
        String string = bundle.getString("KEY_PRECONDITION_ERR_REASON");
        C91635f fVar = this.f242170b;
        int i = this.f242171c;
        C82801g gVar = this.f242172d;
        fVar.mo109647a(i, gVar.mo115109j("fail " + Util.nullAsNil(string)));
    }
}
