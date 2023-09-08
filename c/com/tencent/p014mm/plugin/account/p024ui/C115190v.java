package com.tencent.p014mm.plugin.account.p024ui;

import bc0.C67216a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import f40.C86709a0;
import qe3.C101131z;
import te3.b64;

/* renamed from: com.tencent.mm.plugin.account.ui.v */
public class C115190v implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ LoginByMobileSendSmsUI f345231d;

    public C115190v(LoginByMobileSendSmsUI loginByMobileSendSmsUI) {
        this.f345231d = loginByMobileSendSmsUI;
    }

    public boolean onTimerExpired() {
        LoginByMobileSendSmsUI loginByMobileSendSmsUI = this.f345231d;
        int i = loginByMobileSendSmsUI.f344494z;
        int i2 = 0;
        if (i > 0) {
            loginByMobileSendSmsUI.f344490v.setText(loginByMobileSendSmsUI.getString(C0966R.string.hxh, new Object[]{Integer.valueOf(i)}));
            LoginByMobileSendSmsUI loginByMobileSendSmsUI2 = this.f345231d;
            int i3 = loginByMobileSendSmsUI2.f344494z - 1;
            loginByMobileSendSmsUI2.f344494z = i3;
            if (i3 % 4 == 0) {
                int i4 = loginByMobileSendSmsUI2.f344488t + 1;
                loginByMobileSendSmsUI2.f344488t = i4;
                if (i4 <= 4) {
                    C67216a aVar = new C67216a(loginByMobileSendSmsUI2.f344475d, 17, "", 0, "");
                    ((C101131z) aVar.f193010d.getReqObj()).f296026a.f227376v = 1;
                    int i5 = loginByMobileSendSmsUI2.f344488t;
                    if (i5 == 4) {
                        i2 = 1;
                    }
                    b64 b64 = new b64();
                    b64.f182223d = i5;
                    b64.f182224e = i2;
                    ((C101131z) aVar.f193010d.getReqObj()).f296026a.f227355A = b64;
                    C86709a0.m107524d().mo123460f(aVar);
                }
            }
            return true;
        }
        loginByMobileSendSmsUI.f344490v.setText(C0966R.string.hx8);
        this.f345231d.f344490v.setEnabled(true);
        return false;
    }
}
