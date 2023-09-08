package com.tencent.p014mm.plugin.wallet_core.p125ui.view;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.WalletAwardShakeAnimView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.g */
public class C72468g implements WalletAwardShakeAnimView.C72444c {

    /* renamed from: a */
    public final /* synthetic */ WalletSuccPageAwardWidget f210814a;

    public C72468g(WalletSuccPageAwardWidget walletSuccPageAwardWidget) {
        this.f210814a = walletSuccPageAwardWidget;
    }

    /* renamed from: a */
    public void mo99875a(boolean z) {
        Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "onStartShakeOrClick, isShake: %s, isClickH5OrTinyApp: %s", Boolean.valueOf(z), Boolean.valueOf(this.f210814a.f210783u));
        if (z) {
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[2];
            objArr[0] = 4;
            objArr[1] = Integer.valueOf(this.f210814a.f210783u ? 2 : 1);
            nVar.mo160131h(15225, objArr);
        } else {
            C115669n nVar2 = C115669n.INSTANCE;
            Object[] objArr2 = new Object[2];
            objArr2[0] = 7;
            objArr2[1] = Integer.valueOf(this.f210814a.f210783u ? 2 : 1);
            nVar2.mo160131h(15225, objArr2);
        }
        WalletSuccPageAwardWidget walletSuccPageAwardWidget = this.f210814a;
        walletSuccPageAwardWidget.f210777o.setShakeHintWording(walletSuccPageAwardWidget.getContext().getString(C0966R.string.l9j));
        WalletSuccPageAwardWidget walletSuccPageAwardWidget2 = this.f210814a;
        walletSuccPageAwardWidget2.f210777o.setShakeHintWordingColor(walletSuccPageAwardWidget2.getResources().getColor(C0966R.color.f3288ma));
        WalletSuccPageAwardWidget.m84796b(this.f210814a, 2, false);
        this.f210814a.f210784v = true;
    }
}
