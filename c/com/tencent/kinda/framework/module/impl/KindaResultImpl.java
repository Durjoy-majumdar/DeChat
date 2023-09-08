package com.tencent.kinda.framework.module.impl;

import com.tencent.kinda.gen.IKindaResult;
import com.tencent.p014mm.autogen.events.WalletPayResultEvent;

public class KindaResultImpl implements IKindaResult {
    public void apppayEnd(int i, String str) {
        WalletPayResultEvent walletPayResultEvent = new WalletPayResultEvent();
        if (i == 0) {
            walletPayResultEvent.f194085d.f194088c = -1;
        } else {
            walletPayResultEvent.f194085d.f194088c = 0;
        }
        walletPayResultEvent.f194085d.f194089d = str;
        walletPayResultEvent.publish();
    }
}
