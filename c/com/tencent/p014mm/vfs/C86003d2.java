package com.tencent.p014mm.vfs;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import kj2.C117407d;

/* renamed from: com.tencent.mm.vfs.d2 */
public class C86003d2 implements Runnable {
    public void run() {
        boolean booleanValue;
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("VFSStrategy");
        long j = mmkv.getLong("VFSSwitchReportTime", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (j <= 0 || currentTimeMillis - j >= 259200000) {
            mmkv.encode("VFSSwitchReportTime", currentTimeMillis);
            C117407d dVar = C117407d.INSTANCE;
            dVar.idkeyStat(1317, 0, 1, true);
            synchronized (C86004e2.class) {
                if (C86004e2.f250478a == null) {
                    C86004e2.f250478a = Boolean.valueOf(MultiProcessMMKV.getMMKV("extmig_status_memo_storage").getBoolean("key_is_olddata_ignored_v2", false));
                }
                booleanValue = C86004e2.f250478a.booleanValue();
            }
            if (booleanValue) {
                dVar.idkeyStat(1317, 1, 1, true);
            }
            C117407d dVar2 = dVar;
            dVar2.idkeyStat(1317, 3, 1, true);
            dVar2.idkeyStat(1317, 5, 1, true);
            dVar2.idkeyStat(1317, 7, 1, true);
            dVar2.idkeyStat(1317, 9, 1, true);
        }
    }
}
