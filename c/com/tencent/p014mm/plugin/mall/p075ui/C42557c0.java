package com.tencent.p014mm.plugin.mall.p075ui;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import te3.C50456mv3;
import te3.sg4;

/* renamed from: com.tencent.mm.plugin.mall.ui.c0 */
public class C42557c0 implements C43423i0.C43428e {
    public C42557c0(MallWalletUI mallWalletUI) {
    }

    /* renamed from: a */
    public void mo66651a(C50456mv3 mv32, Object... objArr) {
        int i;
        String str;
        sg4 sg4;
        int i2 = mv32.f138230d;
        if (i2 == 1) {
            str = mv32.f138231e;
            i = 1;
        } else if (i2 == 2 && (sg4 = mv32.f138232f) != null) {
            str = sg4.f141503d;
            i = 2;
        } else if (i2 == 4 || i2 == 5) {
            str = mv32.f138231e;
            i = 3;
        } else {
            str = "";
            i = 0;
        }
        C115669n.INSTANCE.mo160131h(16502, 2, str, Integer.valueOf(i));
    }

    /* renamed from: b */
    public boolean mo66652b(C50456mv3 mv32, Object... objArr) {
        return false;
    }
}
