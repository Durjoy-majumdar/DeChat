package com.tencent.p014mm.p136ui.contact;

import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.ui.contact.a2 */
public class C6876a2 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ ModRemarkNameUI f24510d;

    public C6876a2(ModRemarkNameUI modRemarkNameUI) {
        this.f24510d = modRemarkNameUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107142f(1, this.f24510d.getString(C0966R.string.nfz));
        e0Var.mo107142f(2, this.f24510d.getString(C0966R.string.nfn));
    }
}
