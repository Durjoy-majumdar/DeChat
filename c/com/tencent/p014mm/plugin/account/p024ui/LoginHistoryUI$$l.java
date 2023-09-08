package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import nc0.C76850a;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginHistoryUI$$l */
public class LoginHistoryUI$$l implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LoginHistoryUI f344544d;

    public LoginHistoryUI$$l(LoginHistoryUI loginHistoryUI) {
        this.f344544d = loginHistoryUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        int i2;
        LoginHistoryUI loginHistoryUI = this.f344544d;
        int i3 = loginHistoryUI.f344512Q;
        if (i3 == 0) {
            i2 = !C76850a.m92642n() ? 7 : 6;
        } else {
            int i4 = ((i3 & 2) == 0 && (i3 & 4) == 0) ? 0 : 2;
            if ((i3 & 4) != 0) {
                i4 |= 4;
            }
            i2 = (i3 & 1) != 0 ? i4 | 1 : i4;
        }
        C68507q.m80767b(loginHistoryUI, i2 | 8);
    }
}
