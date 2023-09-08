package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.Log;
import zt3.C119157j;

/* renamed from: com.tencent.mm.storage.q0 */
public class C44663q0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C19625p0 f121092d;

    public C44663q0(C19625p0 p0Var) {
        this.f121092d = p0Var;
    }

    public void run() {
        int NQ = this.f121092d.mo25786NQ();
        if (NQ > 0) {
            C19625p0 p0Var = this.f121092d;
            int i = p0Var.f55552f;
            p0Var.f55552f = i - 1;
            if (i > 0) {
                Log.m105924i("MicroMsg.BizTimeLineInfoStorage", "deleteTable start");
                Log.m105925i("MicroMsg.BizTimeLineInfoStorage", "deleteTable end ret=%b", Boolean.valueOf(this.f121092d.f55550d.execSQL("BizTimeLineInfo", String.format("DELETE FROM %s WHERE %s IN ( SELECT %s FROM %s ORDER BY %s LIMIT %d )", new Object[]{"BizTimeLineInfo", "orderFlag", "orderFlag", "BizTimeLineInfo", "orderFlag", 100}))));
                C19625p0 p0Var2 = this.f121092d;
                p0Var2.getClass();
                ((C119157j) C119157j.f356862d).mo183879j(new C44663q0(p0Var2), 10, "BizTimeLineInfoStorageDeleteThread");
            }
        }
        Log.m105925i("MicroMsg.BizTimeLineInfoStorage", "deleteTable count: %d", Integer.valueOf(NQ));
    }
}
