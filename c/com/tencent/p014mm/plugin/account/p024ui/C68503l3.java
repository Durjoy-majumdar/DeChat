package com.tencent.p014mm.plugin.account.p024ui;

import java.util.List;
import nj3.C11182m0;
import nj3.C76874e0;
import nj3.C76875f0;

/* renamed from: com.tencent.mm.plugin.account.ui.l3 */
public class C68503l3 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ List f196775d;

    public C68503l3(WelcomeActivity welcomeActivity, List list) {
        this.f196775d = list;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        if (e0Var.mo107176v()) {
            for (C76875f0 t : this.f196775d) {
                e0Var.mo107174t(t);
            }
        }
    }
}
