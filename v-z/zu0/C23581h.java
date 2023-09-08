package zu0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gv0.C20842c;

/* renamed from: zu0.h */
public final class C23581h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C23583j<Object> f67598d;

    public C23581h(C23583j<Object> jVar) {
        this.f67598d = jVar;
    }

    public final void run() {
        C23585o oVar;
        C23586p<T> pVar;
        this.f67598d.f67607h = true;
        while (true) {
            long j = this.f67598d.f67602c.get();
            C23583j<Object> jVar = this.f67598d;
            if (jVar.f67606g) {
                Log.m105925i("MicroMsg.BackupFlowQueue", "backup flow close index:%d, outIndex:%d", Long.valueOf(jVar.f67601b.get()), Long.valueOf(j));
                this.f67598d.f67607h = false;
                Log.m105924i("MicroMsg.BackupFlowQueue", "outTask end");
                return;
            }
            synchronized (jVar.f67602c) {
                oVar = jVar.f67600a.get(Long.valueOf(jVar.f67602c.get()));
                if (oVar != null) {
                    jVar.f67600a.remove(Long.valueOf(jVar.f67602c.get()));
                    jVar.f67602c.addAndGet(1);
                } else {
                    oVar = null;
                }
            }
            if (oVar != null) {
                this.f67598d.f67609j.addAndGet(-oVar.f67656c);
                this.f67598d.f67605f.open();
                this.f67598d.getClass();
                Log.m105925i("MicroMsg.BackupFlowQueue", "outTask flowData hashCode:%d, outIndex:%d, sendSeqCount:%d, cacheSize:%d", Integer.valueOf(oVar.hashCode()), Long.valueOf(j), Integer.valueOf(C20842c.f58876g.size()), Long.valueOf(this.f67598d.f67609j.get()));
                T t = oVar.f67655b;
                if (!(t == null || (pVar = oVar.f67654a) == null)) {
                    pVar.mo32554a(t);
                }
            } else {
                this.f67598d.f67604e.close();
                this.f67598d.f67604e.block(200);
            }
        }
    }
}
