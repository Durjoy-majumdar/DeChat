package com.tencent.p014mm.plugin.exdevice.p042ui;

import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.b1 */
public class C41321b1 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceRankInfoUI f111296d;

    public C41321b1(ExdeviceRankInfoUI exdeviceRankInfoUI) {
        this.f111296d = exdeviceRankInfoUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        ExdeviceRankInfoUI exdeviceRankInfoUI = this.f111296d;
        if (exdeviceRankInfoUI.f111229L) {
            e0Var.mo107142f(1, exdeviceRankInfoUI.getString(C0966R.string.cet));
        } else {
            e0Var.mo107142f(0, exdeviceRankInfoUI.getString(C0966R.string.cez));
        }
    }
}
