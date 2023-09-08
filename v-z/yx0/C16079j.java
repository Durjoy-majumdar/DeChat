package yx0;

import com.tencent.p014mm.sdk.platformtools.Log;
import tc2.C118418g;
import te3.C51018qv3;
import te3.lx4;

/* renamed from: yx0.j */
public final class C16079j {
    /* renamed from: a */
    public static final C51018qv3 m14971a() {
        lx4 lx4 = new lx4();
        long currentTimeMillis = System.currentTimeMillis();
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(C118418g.INSTANCE.mo175821hd());
        lx4.f354117f = qv32;
        Log.m105927v("MicroMsg.TransferUtil", "generateClientCheckData cost %s ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        C51018qv3 qv33 = new C51018qv3();
        qv33.mo73350k(lx4.toByteArray());
        return qv33;
    }
}
