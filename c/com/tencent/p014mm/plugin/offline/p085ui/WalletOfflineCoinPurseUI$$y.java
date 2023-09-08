package com.tencent.p014mm.plugin.offline.p085ui;

import com.tencent.p014mm.autogen.events.ConsumedCardByOfflinePayEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$y */
public class WalletOfflineCoinPurseUI$$y implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ WalletOfflineCoinPurseUI f201994d;

    public WalletOfflineCoinPurseUI$$y(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f201994d = walletOfflineCoinPurseUI;
    }

    public boolean onTimerExpired() {
        Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "onTimerExpired, send ConsumedCardByOfflinePay event: %s", Boolean.valueOf(this.f201994d.f201886l1));
        if (this.f201994d.f201886l1) {
            ConsumedCardByOfflinePayEvent consumedCardByOfflinePayEvent = new ConsumedCardByOfflinePayEvent();
            consumedCardByOfflinePayEvent.f193542d.getClass();
            consumedCardByOfflinePayEvent.publish();
        }
        this.f201994d.finish();
        return false;
    }
}
