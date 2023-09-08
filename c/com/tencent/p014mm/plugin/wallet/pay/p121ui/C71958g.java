package com.tencent.p014mm.plugin.wallet.pay.p121ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

/* renamed from: com.tencent.mm.plugin.wallet.pay.ui.g */
public class C71958g extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ Orders.DeductShowInfo f208726g;

    /* renamed from: h */
    public final /* synthetic */ WalletPayDeductUI f208727h;

    public C71958g(WalletPayDeductUI walletPayDeductUI, Orders.DeductShowInfo deductShowInfo) {
        this.f208727h = walletPayDeductUI;
        this.f208726g = deductShowInfo;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105925i("MicroMsg.WalletPayDeductUI", "click link_type: %s", Integer.valueOf(this.f208726g.f209628f));
        Orders.DeductShowInfo deductShowInfo = this.f208726g;
        int i = deductShowInfo.f209628f;
        if (i == 1) {
            if (!Util.isNullOrNil(deductShowInfo.f209631i)) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", this.f208726g.f209631i);
                intent.putExtra("showShare", false);
                C75228t.m90217J(this.f208727h.getContext(), intent);
            }
        } else if (i == 2) {
            StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
            StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
            Orders.DeductShowInfo deductShowInfo2 = this.f208726g;
            aVar.f9526a = deductShowInfo2.f209629g;
            aVar.f9527b = Util.nullAs(deductShowInfo2.f209630h, "");
            StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
            aVar2.f9529d = 1097;
            aVar2.f9528c = 0;
            startAppBrandUIFromOuterEvent.publish();
        }
    }
}
