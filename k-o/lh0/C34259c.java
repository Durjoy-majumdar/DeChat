package lh0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;

/* renamed from: lh0.c */
public class C34259c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f92358d;

    /* renamed from: e */
    public final /* synthetic */ C34261e f92359e;

    public C34259c(C34261e eVar, List list) {
        this.f92359e = eVar;
        this.f92358d = list;
    }

    public void run() {
        int i;
        C34261e eVar = this.f92359e;
        List<C34258b> list = this.f92358d;
        eVar.getClass();
        long currentTicks = Util.currentTicks();
        if (!Util.isNullOrNil((List) list)) {
            long j = 0;
            try {
                j = eVar.f92355d.beginTransaction(Thread.currentThread().getId());
                i = 0;
                for (C34258b Ow : list) {
                    try {
                        if (eVar.mo59524Ow(Ow)) {
                            i++;
                        }
                    } catch (Exception e) {
                        e = e;
                        try {
                            Log.printErrStackTrace("MicroMsg.AiFinderRedDotInfoStorage", e, "replace error", new Object[0]);
                            eVar.f92355d.endTransaction(j);
                            Log.m105927v("MicroMsg.AiFinderRedDotInfoStorage", "AiFinderRedDotInfoStorage replace [%d], cost[%d]", Integer.valueOf(i), Long.valueOf(Util.ticksToNow(currentTicks)));
                        } catch (Throwable th) {
                            eVar.f92355d.endTransaction(j);
                            throw th;
                        }
                    }
                }
            } catch (Exception e2) {
                e = e2;
                i = 0;
                Log.printErrStackTrace("MicroMsg.AiFinderRedDotInfoStorage", e, "replace error", new Object[0]);
                eVar.f92355d.endTransaction(j);
                Log.m105927v("MicroMsg.AiFinderRedDotInfoStorage", "AiFinderRedDotInfoStorage replace [%d], cost[%d]", Integer.valueOf(i), Long.valueOf(Util.ticksToNow(currentTicks)));
            }
            eVar.f92355d.endTransaction(j);
            Log.m105927v("MicroMsg.AiFinderRedDotInfoStorage", "AiFinderRedDotInfoStorage replace [%d], cost[%d]", Integer.valueOf(i), Long.valueOf(Util.ticksToNow(currentTicks)));
        }
    }
}
