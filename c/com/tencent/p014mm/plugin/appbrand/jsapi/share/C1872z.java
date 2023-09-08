package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import android.content.DialogInterface;
import fy3.C32227p;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.z */
public final class C1872z implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32227p<Boolean, Long, C13598b0> f11708d;

    /* renamed from: e */
    public final /* synthetic */ Long f11709e;

    public C1872z(C32227p<? super Boolean, ? super Long, C13598b0> pVar, Long l) {
        this.f11708d = pVar;
        this.f11709e = l;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f11708d.invoke(Boolean.FALSE, this.f11709e);
    }
}
