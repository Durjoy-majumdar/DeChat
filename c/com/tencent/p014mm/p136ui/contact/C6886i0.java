package com.tencent.p014mm.p136ui.contact;

import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.ui.contact.i0 */
public class C6886i0 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ ContactRemarkInfoModUI f24523d;

    public C6886i0(ContactRemarkInfoModUI contactRemarkInfoModUI) {
        this.f24523d = contactRemarkInfoModUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107142f(1, this.f24523d.getString(C0966R.string.nfz));
        e0Var.mo107142f(2, this.f24523d.getString(C0966R.string.nfn));
    }
}
