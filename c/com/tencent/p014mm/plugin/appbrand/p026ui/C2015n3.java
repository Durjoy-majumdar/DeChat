package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.DialogInterface;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.n3 */
public final class C2015n3 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f11962d;

    public C2015n3(C32224a<C13598b0> aVar) {
        this.f11962d = aVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f11962d.invoke();
    }
}
