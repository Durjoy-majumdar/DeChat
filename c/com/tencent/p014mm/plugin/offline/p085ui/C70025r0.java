package com.tencent.p014mm.plugin.offline.p085ui;

import com.tencent.p014mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1575a4;
import com.tencent.p014mm.plugin.offline.p085ui.WalletOfflineCoinPurseUI;
import v53.C78339d;

/* renamed from: com.tencent.mm.plugin.offline.ui.r0 */
public class C70025r0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JsApiOfflineUserBindQueryResultCallBackEvent f202051d;

    /* renamed from: e */
    public final /* synthetic */ WalletOfflineCoinPurseUI.C699682 f202052e;

    public C70025r0(WalletOfflineCoinPurseUI.C699682 r1, JsApiOfflineUserBindQueryResultCallBackEvent jsApiOfflineUserBindQueryResultCallBackEvent) {
        this.f202052e = r1;
        this.f202051d = jsApiOfflineUserBindQueryResultCallBackEvent;
    }

    public void run() {
        JsApiOfflineUserBindQueryResultCallBackEvent.C67718a aVar = this.f202051d.f193679d;
        WalletOfflineCoinPurseUI.this.doSceneForceProgress(new C78339d(aVar.f193681a, aVar.f193685e, aVar.f193684d, aVar.f193686f, aVar.f193688h, aVar.f193687g, 23, aVar.f193682b, aVar.f193683c, C1575a4.NAME, 1137));
    }
}
