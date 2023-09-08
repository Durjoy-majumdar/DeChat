package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.finder.view.n7 */
public final class C4125n7 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ View f18300d;

    public C4125n7(View view) {
        this.f18300d = view;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        if (e0Var.mo107176v()) {
            e0Var.mo107140d(162, this.f18300d.getContext().getResources().getColor(C0966R.color.f2966ao), this.f18300d.getContext().getResources().getString(C0966R.string.eld));
        }
    }
}
