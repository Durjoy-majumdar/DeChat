package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletKnowLqtFullScreenVideoUI;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.h */
public final class C57488h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WalletKnowLqtFullScreenVideoUI f164701d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57488h(WalletKnowLqtFullScreenVideoUI walletKnowLqtFullScreenVideoUI) {
        super(0);
        this.f164701d = walletKnowLqtFullScreenVideoUI;
    }

    public Object invoke() {
        WalletKnowLqtFullScreenVideoUI.C57479a aVar = this.f164701d.f164680d;
        if (aVar != null) {
            aVar.getPlayer().mo35687b(false);
        }
        WalletKnowLqtFullScreenVideoUI walletKnowLqtFullScreenVideoUI = this.f164701d;
        WalletKnowLqtFullScreenVideoUI.C57479a aVar2 = walletKnowLqtFullScreenVideoUI.f164680d;
        if (aVar2 != null) {
            aVar2.setOnVideoComplete(new C57485f(walletKnowLqtFullScreenVideoUI));
        }
        WalletKnowLqtFullScreenVideoUI walletKnowLqtFullScreenVideoUI2 = this.f164701d;
        WalletKnowLqtFullScreenVideoUI.C57479a aVar3 = walletKnowLqtFullScreenVideoUI2.f164680d;
        if (aVar3 != null) {
            aVar3.setOnFirstFrameRendered(new C57486g(walletKnowLqtFullScreenVideoUI2));
        }
        return C13598b0.f38549a;
    }
}
