package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import rb0.C48009v0;

/* renamed from: com.tencent.mm.storage.x0 */
public class C44672x0 implements Runnable {
    public void run() {
        C19625p0 Jx0 = C48009v0.Jx0();
        Jx0.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        int NQ = Jx0.mo25786NQ();
        if (NQ <= 1100) {
            if (!(Log.getLogLevel() <= 0 && NQ >= 500 && MultiProcessMMKV.getSingleMMKV("brandService").decodeInt("BizTimeLineDeleteOldData", 0) == 1)) {
                Log.m105925i("MicroMsg.BizTimeLineInfoStorage", "deleteTooOldData count: %d", Integer.valueOf(NQ));
                C19636w0.f55628e = false;
            }
        }
        Jx0.f55550d.execSQL("BizTimeLineInfo", String.format("DELETE FROM %s WHERE %s IN ( SELECT %s FROM %s ORDER BY %s LIMIT %d )", new Object[]{"BizTimeLineInfo", "orderFlag", "orderFlag", "BizTimeLineInfo", "orderFlag", 100}));
        Log.m105925i("MicroMsg.BizTimeLineInfoStorage", "deleteTooOldData delete cost: %d, count: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(NQ));
        C19636w0.f55628e = false;
    }
}
