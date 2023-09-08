package com.tencent.p014mm.plugin.wallet_core.p125ui.view;

import com.tencent.p014mm.plugin.wallet_core.p125ui.view.WalletScratchShakeView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.d */
public class C72465d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WalletScratchShakeView.C72449b f210811d;

    public C72465d(WalletScratchShakeView.C72449b bVar) {
        this.f210811d = bVar;
    }

    public void run() {
        WalletScratchShakeView.C72449b bVar = this.f210811d;
        int width = bVar.getWidth();
        int height = bVar.getHeight();
        bVar.f210747d.getPixels(bVar.f210758r, 0, width, 0, 0, width, height);
        float f = (float) (width * height);
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (int i = 0; ((float) i) < f; i++) {
            if (bVar.f210758r[i] == 0) {
                f3 += 1.0f;
            }
        }
        if (f3 >= 0.0f && f > 0.0f) {
            f2 = f3 / f;
        }
        Log.m105925i("MicroMsg.WalletScratchShakeView", "erasePercent: %s", Float.valueOf(f2));
        Log.m105924i("MicroMsg.WalletScratchShakeView", "");
        if (f2 >= bVar.f210745B) {
            bVar.f210744A = true;
            if (!bVar.f210760t) {
                MMHandlerThread.postToMainThread(new C72466e(bVar));
                bVar.f210760t = true;
            }
        }
    }
}
