package com.tencent.p014mm.wallet_core.model;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.wallet_core.model.x0 */
public class C75155x0 {
    /* renamed from: a */
    public static void m90135a(int i, String str, int i2, String str2) {
        Log.m105927v("Micromsg.WalletPayLinkReport", "kvAction scene %s reqKey %s action %s info %s", Integer.valueOf(i), str, Integer.valueOf(i2), str2);
        C115669n.INSTANCE.mo160131h(15001, Integer.valueOf(i), str, Integer.valueOf(i2), str2);
    }

    /* renamed from: b */
    public static void m90136b(int i, String str, int i2) {
        Log.m105927v("Micromsg.WalletPayLinkReport", "kvQrcode scene %s reqKey %s errcode %s", Integer.valueOf(i), str, Integer.valueOf(i2));
        C115669n.INSTANCE.mo160131h(15000, Integer.valueOf(i), str, Integer.valueOf(i2));
    }

    /* renamed from: c */
    public static void m90137c(int i, String str, int i2) {
        Log.m105927v("Micromsg.WalletPayLinkReport", "kvStatStartPay scene %s reqKey %s errcode %s", Integer.valueOf(i), str, Integer.valueOf(i2));
        C115669n.INSTANCE.mo160131h(14997, Integer.valueOf(i), str, Integer.valueOf(i2));
    }
}
