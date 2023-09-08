package com.tencent.p014mm.app;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import p1013nf.C88933a;

/* renamed from: com.tencent.mm.app.n0$$a */
public final /* synthetic */ class n0$$a implements Runnable {
    public final void run() {
        C88933a aVar = C88933a.f256476q;
        C88933a.C88937d dVar = new C88933a.C88937d(aVar.f256480f, System.currentTimeMillis() - 0);
        if (((ConcurrentLinkedQueue) aVar.f256478d).size() == 200) {
            ((ConcurrentLinkedQueue) aVar.f256478d).poll();
        }
        ((ConcurrentLinkedQueue) aVar.f256478d).offer(dVar);
        Queue<C88933a.C88937d> queue = aVar.f256478d;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        Iterator it = ((ConcurrentLinkedQueue) queue).iterator();
        while (it.hasNext()) {
            i++;
            sb.append((C88933a.C88937d) it.next());
            sb.append("\n");
            if (i % 10 == 0) {
                Log.m105924i("MicroMsg.MMCrashReporter", "ANR History Message = " + sb.toString());
                sb = new StringBuilder();
            }
        }
        Log.m105924i("MicroMsg.MMCrashReporter", "ANR History Message end = " + sb.toString());
    }
}
