package com.tencent.p014mm.plugin.choosemsgfile.p318ui;

import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.g */
public class C93013g implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ ChooseMsgFileUI f267873d;

    public C93013g(ChooseMsgFileUI chooseMsgFileUI) {
        this.f267873d = chooseMsgFileUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107142f(0, this.f267873d.getString(C0966R.string.bde));
        e0Var.mo107142f(1, this.f267873d.getString(C0966R.string.bdg));
        e0Var.mo107142f(2, this.f267873d.getString(C0966R.string.bdh));
        e0Var.mo107142f(3, this.f267873d.getString(C0966R.string.bdf));
    }
}
