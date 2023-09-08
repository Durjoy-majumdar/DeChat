package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import di3.C86312j;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.g2 */
public class C84531g2 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ AppBrandProfileUI f246684d;

    public C84531g2(AppBrandProfileUI appBrandProfileUI) {
        this.f246684d = appBrandProfileUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.clear();
        e0Var.mo107125a(3, ((C68585h1) C86312j.m106911c(C68585h1.class)).mo94243l8(this.f246684d.f246448d, 0) ? C0966R.string.f7911w0 : C0966R.string.f7907vw);
        e0Var.mo107125a(5, C0966R.string.f7830sx);
        e0Var.mo107125a(2, C0966R.string.f7618lm);
        e0Var.mo107125a(4, C0966R.string.f7820sm);
    }
}
