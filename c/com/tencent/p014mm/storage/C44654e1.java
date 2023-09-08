package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.Log;
import zt3.C119157j;

/* renamed from: com.tencent.mm.storage.e1 */
public class C44654e1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C19607d1 f121063d;

    public C44654e1(C19607d1 d1Var) {
        this.f121063d = d1Var;
    }

    public void run() {
        int count = this.f121063d.getCount();
        if (count > 0) {
            C19607d1 d1Var = this.f121063d;
            int i = d1Var.f55479f;
            d1Var.f55479f = i - 1;
            if (i > 0) {
                Log.m105924i("MicroMsg.BizTimeLineSingleMsgStorage", "deleteTable start");
                Log.m105925i("MicroMsg.BizTimeLineSingleMsgStorage", "deleteTable end ret=%b", Boolean.valueOf(this.f121063d.f55477d.execSQL("BizTimeLineSingleMsgInfo", String.format("DELETE FROM %s WHERE %s IN ( SELECT %s FROM %s ORDER BY %s LIMIT %d )", new Object[]{"BizTimeLineSingleMsgInfo", "msgSvrId", "msgSvrId", "BizTimeLineSingleMsgInfo", "createTime", 100}))));
                C19607d1 d1Var2 = this.f121063d;
                d1Var2.getClass();
                ((C119157j) C119157j.f356862d).mo183879j(new C44654e1(d1Var2), 10, "BizTimeLineInfoStorageDeleteThread");
            }
        }
        Log.m105925i("MicroMsg.BizTimeLineSingleMsgStorage", "deleteTable count: %d", Integer.valueOf(count));
    }
}
