package com.tencent.p014mm.plugin.account.p024ui;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginHistoryUI$$t */
public class LoginHistoryUI$$t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LoginHistoryUI f310960d;

    public LoginHistoryUI$$t(LoginHistoryUI loginHistoryUI) {
        this.f310960d = loginHistoryUI;
    }

    public void run() {
        this.f310960d.finish();
        this.f310960d.overridePendingTransition(-1, -1);
    }
}
