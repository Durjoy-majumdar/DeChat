package com.tencent.p014mm.plugin.account.p024ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginUI$$l */
public class LoginUI$$l implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ LoginUI f344634d;

    public LoginUI$$l(LoginUI loginUI) {
        this.f344634d = loginUI;
    }

    public void afterTextChanged(Editable editable) {
        LoginUI loginUI = this.f344634d;
        if (Util.isNullOrNil(loginUI.f344609d.getText().toString()) || Util.isNullOrNil(loginUI.f344610e.getText().toString())) {
            loginUI.f344622t.setEnabled(false);
        } else {
            loginUI.f344622t.setEnabled(true);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
