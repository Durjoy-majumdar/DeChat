package o81;

import com.tencent.p014mm.autogen.events.NewEdgeSqlDeleteEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import o81.C117715c;
import v81.C118668c;
import w81.C90900a;

/* renamed from: o81.h */
public class C117722h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NewEdgeSqlDeleteEvent f352052d;

    /* renamed from: e */
    public final /* synthetic */ C117715c f352053e;

    public C117722h(C117715c cVar, NewEdgeSqlDeleteEvent newEdgeSqlDeleteEvent) {
        this.f352053e = cVar;
        this.f352052d = newEdgeSqlDeleteEvent;
    }

    public void run() {
        NewEdgeSqlDeleteEvent.C114683a aVar;
        C117725n nVar;
        NewEdgeSqlDeleteEvent newEdgeSqlDeleteEvent = this.f352052d;
        if (newEdgeSqlDeleteEvent != null && (aVar = newEdgeSqlDeleteEvent.f343583d) != null) {
            long j = aVar.f343584a;
            if (j > 0) {
                String valueOf = String.valueOf(j);
                Log.m105924i("EdgeComputingConfigService", "[EdgeComputingConfigService] mNewEdgeSqlDeleteEvent configID : " + valueOf);
                C90900a.m114029b(valueOf, 9, 0);
                synchronized (this.f352053e.f352041e) {
                    if (((HashMap) this.f352053e.f352041e).containsKey(valueOf)) {
                        C118668c cVar = (C118668c) ((HashMap) this.f352053e.f352041e).remove(valueOf);
                        if (!(cVar == null || (nVar = this.f352053e.f352045i) == null)) {
                            ((C117715c.C117716a) nVar).mo182427d(cVar);
                        }
                        this.f352053e.Ax0();
                    }
                }
            }
        }
    }
}
