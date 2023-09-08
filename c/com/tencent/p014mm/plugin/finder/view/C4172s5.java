package com.tencent.p014mm.plugin.finder.view;

import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.finder.view.s5 */
public final class C4172s5 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ FinderWordingLayout f18418d;

    public C4172s5(FinderWordingLayout finderWordingLayout) {
        this.f18418d = finderWordingLayout;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        if (e0Var.mo107176v()) {
            e0Var.mo107140d(1, this.f18418d.getContext().getResources().getColor(C0966R.color.a_3), this.f18418d.getContext().getString(C0966R.string.f7944x1));
        }
    }
}
