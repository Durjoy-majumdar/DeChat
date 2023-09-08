package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.account.ui.o */
public class C68505o implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ int f196777d;

    /* renamed from: e */
    public final /* synthetic */ Context f196778e;

    public C68505o(int i, Context context) {
        this.f196777d = i;
        this.f196778e = context;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        if ((this.f196777d & 1) != 0) {
            e0Var.mo107142f(1, this.f196778e.getString(C0966R.string.hvm));
        }
        if ((this.f196777d & 2) != 0) {
            e0Var.mo107142f(2, this.f196778e.getString(C0966R.string.hvn));
        }
        if ((this.f196777d & 4) != 0) {
            e0Var.mo107142f(4, this.f196778e.getString(C0966R.string.hvl));
        }
        if ((this.f196777d & 8) > 0) {
            e0Var.mo107142f(8, this.f196778e.getString(C0966R.string.lis));
        }
    }
}
