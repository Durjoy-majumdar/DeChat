package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import android.content.DialogInterface;
import fy3.C32227p;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.y */
public final class C1871y implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32227p<Boolean, Long, C13598b0> f11706d;

    /* renamed from: e */
    public final /* synthetic */ Long f11707e;

    public C1871y(C32227p<? super Boolean, ? super Long, C13598b0> pVar, Long l) {
        this.f11706d = pVar;
        this.f11707e = l;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f11706d.invoke(Boolean.FALSE, this.f11707e);
    }
}
