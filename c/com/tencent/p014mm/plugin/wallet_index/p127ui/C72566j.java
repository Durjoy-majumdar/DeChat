package com.tencent.p014mm.plugin.wallet_index.p127ui;

import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.KHbRefundWayType;
import com.tencent.kinda.gen.UseCaseCallback;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import tc0.C77885p;
import te3.C64353ez2;

/* renamed from: com.tencent.mm.plugin.wallet_index.ui.j */
public class C72566j implements UseCaseCallback {
    public C72566j(WalletOpenViewProxyUI walletOpenViewProxyUI) {
    }

    public void call(ITransmitKvData iTransmitKvData) {
        int i = iTransmitKvData.getInt("refund_way");
        C86709a0.m107528h();
        C85801v1 i2 = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_EXT_PAY_SETTING_LONG_SYNC;
        long longValue = ((Long) i2.mo119685f(aVar, 0L)).longValue();
        if (i == KHbRefundWayType.LQ.ordinal()) {
            longValue = (longValue | 1) & -3;
        } else if (i == KHbRefundWayType.ORIGIN.ordinal()) {
            longValue = (longValue & -2) | 2;
        }
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(longValue));
        C64353ez2 ez22 = new C64353ez2();
        if ((longValue & 1) != 0) {
            ez22.f183059d = 1;
            ez22.f183060e = 2;
        } else if ((longValue & 2) != 0) {
            ez22.f183059d = 2;
            ez22.f183060e = 1;
        }
        Log.m105925i("MicroMsg.WalletOpenViewProxyUI", "UseCaseCallback doSettingsOplog: extStatus: %s, set_bitmask: %s, clear_bitmask:%s", Long.toBinaryString(longValue), Long.toBinaryString(ez22.f183059d), Long.toBinaryString(ez22.f183060e));
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(218, ez22));
    }
}
