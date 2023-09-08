package com.tencent.p014mm.plugin.location.p069ui.impl;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.b1$$b */
public final /* synthetic */ class b1$$b implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C94163b1 f271997d;

    public /* synthetic */ b1$$b(C94163b1 b1Var) {
        this.f271997d = b1Var;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C94163b1 b1Var = this.f271997d;
        e0Var.mo107151k(10, b1Var.f271948d.getString(C0966R.string.nf7), C0966R.raw.location_copy, false);
        if (b1Var.f271950f != 10 && !Util.isNullOrNil(b1Var.f271951g.f271933h)) {
            String str = b1Var.f271951g.f271938p;
            if (str == null || !str.startsWith("UgcPoiEx_")) {
                e0Var.mo107151k(11, b1Var.f271948d.getString(C0966R.string.nf8), C0966R.raw.location_correct, b1Var.f271983F);
            }
        }
    }
}
