package com.tencent.p014mm.plugin.walletlock.model;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.walletlock.model.i */
public class C106560i {

    /* renamed from: a */
    public static long f318384a = -1;

    /* renamed from: a */
    public static void m143895a(boolean z) {
        Log.m105925i("MicroMsg.WalletLockReportManager", "alvinluo idkey fingerprint open result: %b", Boolean.valueOf(z));
        C115669n.INSTANCE.idkeyStat(713, z ? 0 : 1, 1, false);
    }

    /* renamed from: b */
    public static void m143896b(int i, int i2, long j) {
        int i3 = 6;
        if (i2 == 6) {
            i3 = 5;
        } else if (i2 != 1004) {
            i3 = (i2 == 1023 && i == 3) ? 4 : -1;
        }
        if (i3 != -1) {
            Log.m105925i("MicroMsg.WalletLockReportManager", "alvinluo wallet lock idkey report id: %d, key: %d, value: %d", 713, Integer.valueOf(i3), Long.valueOf(j));
            C115669n.INSTANCE.idkeyStat(713, (long) i3, j, false);
        }
    }

    /* renamed from: c */
    public static void m143897c(int i, int i2, int i3) {
        long j = f318384a;
        if (j == -1) {
            Log.m105920e("MicroMsg.WalletLockReportManager", "alvinluo wallet lock report sessionId is -1, not create session, ignore");
        } else if (i != -1) {
            Log.m105925i("MicroMsg.WalletLockReportManager", "alvinluo reportVerifyWalletLock session: %d, protectScene: %d, walletLockType: %d, result: %d", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            C115669n.INSTANCE.mo160131h(14839, Long.valueOf(f318384a), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }
}
