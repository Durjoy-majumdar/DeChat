package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.view.View;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import ul0.C90694b;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.o0 */
public class C72409o0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ Orders.ShowInfo f210650g;

    /* renamed from: h */
    public final /* synthetic */ WalletOrderInfoNewUI f210651h;

    public C72409o0(WalletOrderInfoNewUI walletOrderInfoNewUI, Orders.ShowInfo showInfo) {
        this.f210651h = walletOrderInfoNewUI;
        this.f210650g = showInfo;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Orders.ShowInfo showInfo = this.f210650g;
        Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "onClick jump tinyApp, linkWeApp:%s, linkAddr:%s", showInfo.f209703i, showInfo.f209704j);
        StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
        StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
        Orders.ShowInfo showInfo2 = this.f210650g;
        aVar.f9526a = showInfo2.f209703i;
        aVar.f9527b = Util.nullAs(showInfo2.f209704j, "");
        StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
        aVar2.f9529d = C90694b.CTRL_INDEX;
        WalletOrderInfoNewUI walletOrderInfoNewUI = this.f210651h;
        aVar2.f9530e = walletOrderInfoNewUI.f210129j;
        aVar2.f9528c = 0;
        aVar2.f9531f = walletOrderInfoNewUI;
        startAppBrandUIFromOuterEvent.publish();
    }
}
