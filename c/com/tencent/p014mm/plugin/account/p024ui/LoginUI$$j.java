package com.tencent.p014mm.plugin.account.p024ui;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginUI$$j */
public class LoginUI$$j implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ LoginUI f10704d;

    public LoginUI$$j(LoginUI loginUI) {
        this.f10704d = loginUI;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6 && i != 5) {
            return false;
        }
        LoginUI loginUI = this.f10704d;
        int i2 = LoginUI.f344598K;
        loginUI.mo174670J7();
        return true;
    }
}
