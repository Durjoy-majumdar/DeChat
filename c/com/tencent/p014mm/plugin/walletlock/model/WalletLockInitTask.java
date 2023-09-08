package com.tencent.p014mm.plugin.walletlock.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import g73.C8244b;
import lc3.C10485b;

/* renamed from: com.tencent.mm.plugin.walletlock.model.WalletLockInitTask */
public class WalletLockInitTask {

    /* renamed from: a */
    public static volatile boolean f21964a;

    /* renamed from: a */
    public static int m5554a() {
        String str;
        if (!f21964a && C86709a0.m107522a()) {
            try {
                str = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("PatternLockTimeInterval");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WalletLockInitTask", e, "", new Object[0]);
                str = null;
            }
            if (!Util.isNullOrNil(str)) {
                int i = Util.getInt(str, 0);
                if (i >= 0) {
                    Log.m105918d("MicroMsg.WalletLockInitTask", String.format("Dynamic config for PatternLockInterval override default config, newval=%d", new Object[]{Integer.valueOf(i)}));
                    C8244b.f27172a = i;
                } else {
                    Log.m105918d("MicroMsg.WalletLockInitTask", "PatternLockInterval keeps default value.");
                    C8244b.f27172a = 300;
                }
            } else {
                Log.m105918d("MicroMsg.WalletLockInitTask", "PatternLockInterval keeps default value.");
                C8244b.f27172a = 300;
            }
            f21964a = true;
        }
        return C8244b.f27172a;
    }
}
