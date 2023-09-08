package com.tencent.p014mm.plugin.account.p024ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C114735a0;
import f40.C86709a0;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginUI$$p */
public class LoginUI$$p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LoginUI f10707d;

    public LoginUI$$p(LoginUI loginUI) {
        this.f10707d = loginUI;
    }

    public void run() {
        LoginUI loginUI = this.f10707d;
        int i = LoginUI.f344598K;
        loginUI.getClass();
        C86709a0.m107524d().mo123455a(252, loginUI);
        C86709a0.m107524d().mo123455a(701, loginUI);
        C115135m0 m0Var = loginUI.f344618p;
        C114735a0 a0Var = new C114735a0(m0Var.f345162b, m0Var.f345163c, loginUI.f344614i, 2);
        C86709a0.m107524d().mo123460f(a0Var);
        loginUI.f344613h = C76879j.m92723Q(loginUI, loginUI.getString(C0966R.string.a3h), loginUI.getString(C0966R.string.gda), true, true, new C1488t0(loginUI, a0Var));
    }
}
