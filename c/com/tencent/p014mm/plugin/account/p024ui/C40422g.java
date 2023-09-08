package com.tencent.p014mm.plugin.account.p024ui;

import java.util.List;
import nj3.C11182m0;
import nj3.C76874e0;
import nj3.C76875f0;

/* renamed from: com.tencent.mm.plugin.account.ui.g */
public class C40422g implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ List f108643d;

    public C40422g(BaseLoginVoiceUI baseLoginVoiceUI, List list) {
        this.f108643d = list;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        if (e0Var.size() == 0) {
            for (C76875f0 t : this.f108643d) {
                e0Var.mo107174t(t);
            }
        }
    }
}
