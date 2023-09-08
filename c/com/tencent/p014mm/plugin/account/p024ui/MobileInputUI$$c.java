package com.tencent.p014mm.plugin.account.p024ui;

import android.view.View;
import tc2.C118418g;

/* renamed from: com.tencent.mm.plugin.account.ui.MobileInputUI$$c */
public class MobileInputUI$$c implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ boolean[] f344711d;

    /* renamed from: e */
    public final /* synthetic */ MobileInputUI f344712e;

    public MobileInputUI$$c(MobileInputUI mobileInputUI, boolean[] zArr) {
        this.f344712e = mobileInputUI;
        this.f344711d = zArr;
    }

    public void onFocusChange(View view, boolean z) {
        C118418g gVar = C118418g.INSTANCE;
        if (z) {
            this.f344711d[0] = true;
            return;
        }
        MobileInputUI mobileInputUI = this.f344712e;
        int i = MobileInputUI.f344669V;
        if (mobileInputUI.mo174703L7()) {
            gVar.mo175826kl("ie_reg_eu");
        }
        if (this.f344712e.mo174702K7()) {
            gVar.mo175826kl("ie_login");
        }
    }
}
