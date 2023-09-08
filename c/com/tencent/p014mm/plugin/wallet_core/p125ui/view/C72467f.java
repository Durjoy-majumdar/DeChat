package com.tencent.p014mm.plugin.wallet_core.p125ui.view;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.WalletScratchShakeView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.f */
public class C72467f implements WalletScratchShakeView.C72448a {

    /* renamed from: a */
    public final /* synthetic */ WalletSuccPageAwardWidget f210813a;

    public C72467f(WalletSuccPageAwardWidget walletSuccPageAwardWidget) {
        this.f210813a = walletSuccPageAwardWidget;
    }

    /* renamed from: a */
    public void mo99874a(boolean z) {
        Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "onStartScratchOrShake, isScratch: %s", Boolean.valueOf(z));
        int i = 2;
        WalletSuccPageAwardWidget.m84796b(this.f210813a, z ? 1 : 2, false);
        if (z) {
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[2];
            objArr[0] = 5;
            if (!this.f210813a.f210783u) {
                i = 1;
            }
            objArr[1] = Integer.valueOf(i);
            nVar.mo160131h(15225, objArr);
        } else {
            C115669n nVar2 = C115669n.INSTANCE;
            Object[] objArr2 = new Object[2];
            objArr2[0] = 4;
            if (!this.f210813a.f210783u) {
                i = 1;
            }
            objArr2[1] = Integer.valueOf(i);
            nVar2.mo160131h(15225, objArr2);
        }
        this.f210813a.f210784v = true;
    }
}
