package com.tencent.p014mm.plugin.wallet_core.p125ui.view;

import com.tencent.p014mm.plugin.wallet_core.p125ui.view.WalletScratchShakeView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.e */
public class C72466e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WalletScratchShakeView.C72449b f210812d;

    public C72466e(WalletScratchShakeView.C72449b bVar) {
        this.f210812d = bVar;
    }

    public void run() {
        this.f210812d.animate().alpha(0.0f).setDuration(100);
        WalletScratchShakeView.C72448a aVar = WalletScratchShakeView.this.f210743g;
        if (aVar != null) {
            Log.m105924i("MicroMsg.WalletSuccPageAwardWidget", "onFinishScratchOrShake");
            int i = ((C72467f) aVar).f210813a.f210778p.f226714n;
        }
    }
}
