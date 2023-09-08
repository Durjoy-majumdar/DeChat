package zu0;

import com.tencent.p014mm.sdk.platformtools.Log;
import yu0.C23367h;

public final /* synthetic */ class k$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C23590t f67647d;

    /* renamed from: e */
    public final /* synthetic */ C23367h f67648e;

    public /* synthetic */ k$$b(C23590t tVar, C23367h hVar) {
        this.f67647d = tVar;
        this.f67648e = hVar;
    }

    public final void run() {
        C23590t tVar = this.f67647d;
        C23367h hVar = this.f67648e;
        if (tVar.f67686b == null) {
            tVar.f67686b = new C23589s(tVar.f67685a, hVar);
        }
        tVar.f67687c = 0;
        long j = C23584k.f67611q.f67601b.get();
        Log.m105919d("MicroMsg.BackupPackAndSend.TagQueueSucker", "setTagEnd sessionName:%s, startTime:%d,endTime:%d, taskIndex:%d", hVar.f67132a, Long.valueOf(hVar.f67133b), Long.valueOf(hVar.f67134c), Long.valueOf(j));
        tVar.f67688d.addAndGet(1);
        tVar.f67686b.mo37061b(new t$$a(tVar, j));
        tVar.f67686b = null;
    }
}
