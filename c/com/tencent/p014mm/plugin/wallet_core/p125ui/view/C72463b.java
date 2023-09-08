package com.tencent.p014mm.plugin.wallet_core.p125ui.view;

import com.tencent.p014mm.plugin.wallet_core.p125ui.view.WalletScratchShakeView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import ud3.C101998d;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.b */
public class C72463b extends C101998d.C101999a {

    /* renamed from: d */
    public final /* synthetic */ WalletScratchShakeView.C72449b f210809d;

    public C72463b(WalletScratchShakeView.C72449b bVar) {
        this.f210809d = bVar;
    }

    public void onRelease() {
    }

    public void onShake(boolean z) {
        long ticksToNow = Util.ticksToNow(this.f210809d.f210765y);
        WalletScratchShakeView.C72449b bVar = this.f210809d;
        if (!bVar.f210766z) {
            if (ticksToNow < 1200) {
                return;
            }
        } else if (ticksToNow < 80) {
            return;
        }
        bVar.f210765y = Util.currentTicks();
        WalletScratchShakeView.C72449b bVar2 = this.f210809d;
        bVar2.f210766z = true;
        if (bVar2.f210744A) {
            Log.m105924i("MicroMsg.WalletScratchShakeView", "onStartShakeOrClick, already finish clear mask");
        } else if (!bVar2.mo99826b()) {
            if (!bVar2.f210764x) {
                bVar2.f210762v += (float) (bVar2.getHeight() / 6);
                bVar2.mo99827c();
            } else {
                bVar2.f210763w += (float) (bVar2.getHeight() / 6);
                bVar2.mo99827c();
            }
            bVar2.f210764x = !bVar2.f210764x;
            if (!bVar2.f210759s) {
                MMHandlerThread.postToMainThreadDelayed(new C72464c(bVar2), 50);
                bVar2.f210759s = true;
            }
            bVar2.mo99826b();
        }
    }
}
