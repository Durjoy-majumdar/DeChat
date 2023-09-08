package com.tencent.p014mm.plugin.vlog.p117ui.plugin.timeedit;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timeedit.a */
public final class C5692a implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C77407n f21676d;

    /* renamed from: e */
    public final /* synthetic */ Context f21677e;

    /* renamed from: f */
    public final /* synthetic */ String f21678f;

    public C5692a(C77407n nVar, Context context, String str) {
        this.f21676d = nVar;
        this.f21677e = context;
        this.f21678f = str;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        this.f21676d.mo107567l((View) null);
        e0Var.clear();
        e0Var.mo107140d(0, this.f21677e.getResources().getColor(C0966R.color.f2966ao), this.f21678f);
    }
}
