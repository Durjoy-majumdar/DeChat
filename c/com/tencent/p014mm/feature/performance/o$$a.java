package com.tencent.p014mm.feature.performance;

import com.tencent.p014mm.sdk.platformtools.Log;
import hm3.C32955c;
import hm3.C32958d;
import o40.C61926c;

/* renamed from: com.tencent.mm.feature.performance.o$$a */
public final /* synthetic */ class o$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C32955c f79379d;

    public /* synthetic */ o$$a(C32955c cVar) {
        this.f79379d = cVar;
    }

    public final void run() {
        C32955c cVar = this.f79379d;
        cVar.getClass();
        Log.m105924i("MicroMsg.MatrixMemoryHookResultHelper", "test case");
        if (cVar.mo58888e(false)) {
            C61926c.m72668M(C32958d.f89552d);
        }
    }
}
