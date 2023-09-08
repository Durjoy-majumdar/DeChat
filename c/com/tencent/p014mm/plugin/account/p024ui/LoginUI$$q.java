package com.tencent.p014mm.plugin.account.p024ui;

import android.text.Editable;
import android.text.TextWatcher;
import tc2.C118418g;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginUI$$q */
public class LoginUI$$q implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ LoginUI f344637d;

    public LoginUI$$q(LoginUI loginUI) {
        this.f344637d = loginUI;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C118418g gVar = C118418g.INSTANCE;
        boolean[] zArr = this.f344637d.f344606H;
        if (zArr[0]) {
            zArr[0] = false;
            gVar.mo175830qv("ie_login_id");
        }
        gVar.mo175802VZ("ie_login_id");
    }
}
