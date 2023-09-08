package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82976l0;
import fy3.C32227p;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.p0 */
public final class C1869p0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32227p<Boolean, C82976l0.C29538a, C13598b0> f11704d;

    public C1869p0(C32227p<? super Boolean, ? super C82976l0.C29538a, C13598b0> pVar) {
        this.f11704d = pVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f11704d.invoke(Boolean.FALSE, null);
    }
}
