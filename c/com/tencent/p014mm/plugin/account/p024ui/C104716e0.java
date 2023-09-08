package com.tencent.p014mm.plugin.account.p024ui;

import nj3.C11182m0;
import nj3.C76874e0;
import nj3.C76875f0;

/* renamed from: com.tencent.mm.plugin.account.ui.e0 */
public class C104716e0 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ LoginHistoryUI f310966d;

    public C104716e0(LoginHistoryUI loginHistoryUI) {
        this.f310966d = loginHistoryUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        if (e0Var.size() == 0) {
            for (C76875f0 t : this.f310966d.f344515T) {
                e0Var.mo107174t(t);
            }
        }
    }
}
