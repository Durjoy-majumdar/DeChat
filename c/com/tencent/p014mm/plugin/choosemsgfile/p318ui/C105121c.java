package com.tencent.p014mm.plugin.choosemsgfile.p318ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.choosemsgfile.p318ui.ChooseMsgFileShowUI;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.c */
public class C105121c implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ ChooseMsgFileShowUI.C105119c f312117d;

    public C105121c(ChooseMsgFileShowUI.C105119c cVar) {
        this.f312117d = cVar;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107142f(0, ChooseMsgFileShowUI.this.getString(C0966R.string.i48));
        e0Var.mo107142f(3, ChooseMsgFileShowUI.this.getString(C0966R.string.cvn));
        e0Var.mo107142f(1, ChooseMsgFileShowUI.this.getString(C0966R.string.bd6));
        e0Var.mo107142f(4, ChooseMsgFileShowUI.this.getString(C0966R.string.cgm));
    }
}
