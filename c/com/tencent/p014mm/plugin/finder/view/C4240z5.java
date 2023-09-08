package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.finder.view.z5 */
public final class C4240z5 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ Context f18562d;

    public C4240z5(Context context) {
        this.f18562d = context;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        if (e0Var.mo107176v()) {
            e0Var.mo107140d(1000, this.f18562d.getResources().getColor(C0966R.color.f2966ao), this.f18562d.getResources().getString(C0966R.string.bjb));
        }
    }
}
