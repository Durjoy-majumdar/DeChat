package com.tencent.p014mm.plugin.account.p024ui;

import android.text.Editable;
import android.text.TextWatcher;
import tc2.C118418g;

/* renamed from: com.tencent.mm.plugin.account.ui.MobileInputUI$$d */
public class MobileInputUI$$d implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ boolean[] f344713d;

    /* renamed from: e */
    public final /* synthetic */ MobileInputUI f344714e;

    public MobileInputUI$$d(MobileInputUI mobileInputUI, boolean[] zArr) {
        this.f344714e = mobileInputUI;
        this.f344713d = zArr;
    }

    public void afterTextChanged(Editable editable) {
        this.f344714e.f344701r.setEnabled(true);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C118418g gVar = C118418g.INSTANCE;
        boolean[] zArr = this.f344713d;
        if (zArr[0]) {
            zArr[0] = false;
            MobileInputUI mobileInputUI = this.f344714e;
            int i4 = MobileInputUI.f344669V;
            if (mobileInputUI.mo174703L7()) {
                gVar.mo175830qv("ie_reg_eu");
            }
            if (this.f344714e.mo174702K7()) {
                gVar.mo175830qv("ie_login");
            }
        }
        MobileInputUI mobileInputUI2 = this.f344714e;
        int i5 = MobileInputUI.f344669V;
        if (mobileInputUI2.mo174703L7()) {
            gVar.mo175802VZ("ie_reg_eu");
        }
        if (this.f344714e.mo174702K7()) {
            gVar.mo175802VZ("ie_login");
        }
    }
}
