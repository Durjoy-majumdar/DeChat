package com.tencent.p014mm.plugin.profile.p088ui;

import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.profile.ui.e */
public class C4984e implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ AddDescriptionUI f20268d;

    public C4984e(AddDescriptionUI addDescriptionUI) {
        this.f20268d = addDescriptionUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107142f(1, this.f20268d.getString(C0966R.string.nfz));
        e0Var.mo107142f(2, this.f20268d.getString(C0966R.string.nfn));
    }
}
