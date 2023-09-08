package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import android.content.DialogInterface;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.c0 */
public final class C82955c0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32226l<C82975k0, C13598b0> f242582d;

    public C82955c0(C32226l<? super C82975k0, C13598b0> lVar) {
        this.f242582d = lVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f242582d.invoke(C82975k0.FAIL);
    }
}
