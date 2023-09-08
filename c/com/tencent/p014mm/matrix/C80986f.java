package com.tencent.p014mm.matrix;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import kj2.C117407d;
import lu3.C109426i;
import p1013nf.C88933a;
import p1035sf.C90183c;

/* renamed from: com.tencent.mm.matrix.f */
public class C80986f implements C109426i {

    /* renamed from: d */
    public final /* synthetic */ C80981c f237870d;

    public C80986f(C80981c cVar) {
        this.f237870d = cVar;
    }

    public String getKey() {
        return "MatrixDelegate-startDenseMsgTracerWatchdog";
    }

    public boolean isLogging() {
        return false;
    }

    public void run() {
        try {
            C88933a aVar = C88933a.f256476q;
            aVar.getClass();
            long j = aVar.f256481g;
            Queue<C88933a.C88937d> queue = aVar.f256479e;
            String str = "";
            if (j > 4000) {
                this.f237870d.mo112799e(queue);
                this.f237870d.getClass();
                Iterator it = ((ConcurrentLinkedQueue) queue).iterator();
                C88933a.C88937d dVar = null;
                long j2 = 0;
                while (it.hasNext()) {
                    C88933a.C88937d dVar2 = (C88933a.C88937d) it.next();
                    long j3 = dVar2.f256496b;
                    if (j3 > j2) {
                        j2 = j3;
                        dVar = dVar2;
                    }
                }
                String dVar3 = dVar == null ? str : dVar.toString();
                if (dVar != null) {
                    str = this.f237870d.mo112803i(dVar);
                }
                long j4 = dVar == null ? 0 : dVar.f256496b;
                Log.m105925i("MatrixDelegate", "happens Dense Message Lag, duration exceeds, count=%d, duration=%d, keyMessage = %s", 0L, Long.valueOf(j), dVar3);
                C117407d.INSTANCE.mo160131h(24354, AppMethodBeat.getVisibleScene(), C90183c.m112854b(), 0, MMApplicationContext.getProcessName(), BuildInfo.REV, Long.valueOf(j), 0L, dVar3, Long.valueOf(j4), str);
            }
        } catch (Throwable th) {
            C88933a.f256476q.mo123311a();
            throw th;
        }
        C88933a.f256476q.mo123311a();
    }
}
