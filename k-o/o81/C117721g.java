package o81;

import com.tencent.p014mm.autogen.events.NewEdgeSqlUpdateEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import o81.C117715c;
import v81.C118668c;
import w81.C90900a;

/* renamed from: o81.g */
public class C117721g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NewEdgeSqlUpdateEvent f352050d;

    /* renamed from: e */
    public final /* synthetic */ C117715c f352051e;

    public C117721g(C117715c cVar, NewEdgeSqlUpdateEvent newEdgeSqlUpdateEvent) {
        this.f352051e = cVar;
        this.f352050d = newEdgeSqlUpdateEvent;
    }

    public void run() {
        NewEdgeSqlUpdateEvent.C114684a aVar;
        NewEdgeSqlUpdateEvent newEdgeSqlUpdateEvent = this.f352050d;
        if (newEdgeSqlUpdateEvent != null && (aVar = newEdgeSqlUpdateEvent.f343585d) != null) {
            long j = aVar.f343586a;
            if (j > 0 && aVar.f343587b != null) {
                String valueOf = String.valueOf(j);
                Log.m105924i("EdgeComputingConfigService", "[EdgeComputingConfigService] mNewEdgeSqlUpdateEvent configID : " + valueOf);
                C90900a.m114029b(valueOf, 8, 0);
                synchronized (this.f352051e.f352041e) {
                    C118668c d = this.f352051e.f352044h.mo182413d(valueOf, this.f352050d.f343585d.f343587b);
                    if (d != null) {
                        ((HashMap) this.f352051e.f352041e).put(d.f355094a, d);
                        C117725n nVar = this.f352051e.f352045i;
                        if (nVar != null) {
                            ((C117715c.C117716a) nVar).mo182429f(d);
                        }
                        this.f352051e.Ax0();
                        C117715c cVar = this.f352051e;
                        cVar.f352043g.post(new C117714b(cVar));
                    }
                }
            }
        }
    }
}
