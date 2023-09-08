package com.tencent.p014mm.plugin.offline.p085ui;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.WalletPayResultEvent;
import com.tencent.p014mm.plugin.offline.C30326g;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import id2.C33287e;

/* renamed from: com.tencent.mm.plugin.offline.ui.OfflineLogicMgr$1 */
class OfflineLogicMgr$1 extends IListener<WalletPayResultEvent> {

    /* renamed from: d */
    public final /* synthetic */ PayInfo f201808d;

    /* renamed from: e */
    public final /* synthetic */ C70034w f201809e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OfflineLogicMgr$1(C70034w wVar, C0125s sVar, PayInfo payInfo) {
        super(sVar);
        this.f201809e = wVar;
        this.f201808d = payInfo;
        this.__eventId = 520089918;
    }

    public boolean callback(IEvent iEvent) {
        WalletPayResultEvent walletPayResultEvent = (WalletPayResultEvent) iEvent;
        if (walletPayResultEvent.f194085d.f194091f) {
            Log.m105922f("MicroMsg.OfflineLogicMgr", "WalletPayResultEvent is from kinda, ScanQRCodePay");
            return false;
        }
        dead();
        int i = walletPayResultEvent.f194085d.f194088c;
        if (i == 0) {
            PayInfo payInfo = this.f201808d;
            C33287e eVar = new C33287e(payInfo.f212592j, payInfo.f212587e, payInfo.f212589g);
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(eVar);
            C30326g.m39030e();
            ((WalletOfflineCoinPurseUI) this.f201809e.f202061b).mo96309d8();
            return false;
        } else if (i != -1) {
            return false;
        } else {
            C30326g.m39030e();
            ((WalletOfflineCoinPurseUI) this.f201809e.f202061b).mo96309d8();
            return false;
        }
    }
}
