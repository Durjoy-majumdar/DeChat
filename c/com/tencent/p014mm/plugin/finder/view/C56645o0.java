package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.finder.view.o0 */
public final class C56645o0 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C77407n f162372d;

    /* renamed from: e */
    public final /* synthetic */ RoundedCornerFrameLayout f162373e;

    public C56645o0(C77407n nVar, RoundedCornerFrameLayout roundedCornerFrameLayout) {
        this.f162372d = nVar;
        this.f162373e = roundedCornerFrameLayout;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.clear();
        this.f162372d.mo107567l((View) null);
        this.f162372d.mo107567l(this.f162373e);
    }
}
