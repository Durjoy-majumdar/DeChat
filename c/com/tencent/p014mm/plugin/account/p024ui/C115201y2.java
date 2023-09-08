package com.tencent.p014mm.plugin.account.p024ui;

import bc0.C67216a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import f40.C86709a0;
import qe3.C101131z;
import te3.b64;

/* renamed from: com.tencent.mm.plugin.account.ui.y2 */
public class C115201y2 implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ RegByMobileSendSmsUI f345245d;

    public C115201y2(RegByMobileSendSmsUI regByMobileSendSmsUI) {
        this.f345245d = regByMobileSendSmsUI;
    }

    public boolean onTimerExpired() {
        RegByMobileSendSmsUI regByMobileSendSmsUI = this.f345245d;
        int i = regByMobileSendSmsUI.f344942s;
        int i2 = 0;
        if (i > 0) {
            regByMobileSendSmsUI.f344940q.setText(regByMobileSendSmsUI.getString(C0966R.string.hxh, new Object[]{Integer.valueOf(i)}));
            RegByMobileSendSmsUI regByMobileSendSmsUI2 = this.f345245d;
            int i3 = regByMobileSendSmsUI2.f344942s - 1;
            regByMobileSendSmsUI2.f344942s = i3;
            if (i3 % 4 == 0) {
                int i4 = regByMobileSendSmsUI2.f344938o + 1;
                regByMobileSendSmsUI2.f344938o = i4;
                if (i4 <= 4) {
                    C67216a aVar = new C67216a(regByMobileSendSmsUI2.f344930d, 15, "", 0, "");
                    ((C101131z) aVar.f193010d.getReqObj()).f296026a.f227376v = 1;
                    aVar.mo91367W(regByMobileSendSmsUI2.f344933g);
                    int i5 = regByMobileSendSmsUI2.f344938o;
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
        regByMobileSendSmsUI.f344940q.setText(C0966R.string.hx8);
        this.f345245d.f344940q.setEnabled(true);
        return false;
    }
}
