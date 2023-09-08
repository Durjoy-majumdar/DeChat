package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.storage.f1 */
public class C44656f1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C19607d1 f121064d;

    public C44656f1(C19607d1 d1Var) {
        this.f121064d = d1Var;
    }

    public void run() {
        C19607d1 d1Var = this.f121064d;
        d1Var.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        int count = d1Var.getCount();
        if (count > 2000) {
            d1Var.f55477d.execSQL("BizTimeLineSingleMsgInfo", String.format("DELETE FROM %s WHERE %s IN ( SELECT %s FROM %s ORDER BY %s LIMIT %d )", new Object[]{"BizTimeLineSingleMsgInfo", "msgSvrId", "msgSvrId", "BizTimeLineSingleMsgInfo", "createTime", 100}));
            Log.m105925i("MicroMsg.BizTimeLineSingleMsgStorage", "deleteTooOldData delete cost: %d, count: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(count));
        } else {
            Log.m105925i("MicroMsg.BizTimeLineSingleMsgStorage", "deleteTooOldData count: %d", Integer.valueOf(count));
        }
        this.f121064d.f55480g = false;
    }
}
