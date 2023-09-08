package com.tencent.p014mm.plugin.wallet.bind.p120ui;

import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.UseCaseCallback;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.wallet.bind.ui.i */
public class C71893i implements UseCaseCallback {
    public C71893i(WalletBankcardManageUI walletBankcardManageUI) {
    }

    public void call(ITransmitKvData iTransmitKvData) {
        Log.m105925i("MicroMsg.WalletBankcardManageUI", "unbindCard: %s", Boolean.valueOf(iTransmitKvData.getBool("unbind_card")));
    }
}
