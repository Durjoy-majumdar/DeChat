package o81;

import com.tencent.p014mm.autogen.events.NewEdgeScriptDeleteEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import o81.C117715c;
import v81.C118667b;
import w81.C90900a;

/* renamed from: o81.f */
public class C117720f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NewEdgeScriptDeleteEvent f352048d;

    /* renamed from: e */
    public final /* synthetic */ C117715c f352049e;

    public C117720f(C117715c cVar, NewEdgeScriptDeleteEvent newEdgeScriptDeleteEvent) {
        this.f352049e = cVar;
        this.f352048d = newEdgeScriptDeleteEvent;
    }

    public void run() {
        NewEdgeScriptDeleteEvent.C114681a aVar;
        C117725n nVar;
        NewEdgeScriptDeleteEvent newEdgeScriptDeleteEvent = this.f352048d;
        if (newEdgeScriptDeleteEvent != null && (aVar = newEdgeScriptDeleteEvent.f343578d) != null) {
            long j = aVar.f343579a;
            if (j > 0) {
                String valueOf = String.valueOf(j);
                Log.m105924i("EdgeComputingConfigService", "[EdgeComputingConfigService] mNewEdgeScriptDeleteEvent configID : " + valueOf);
                C90900a.m114029b(valueOf, 2, 0);
                synchronized (this.f352049e.f352040d) {
                    if (((HashMap) this.f352049e.f352040d).containsKey(valueOf)) {
                        C118667b bVar = (C118667b) ((HashMap) this.f352049e.f352040d).remove(valueOf);
                        if (!(bVar == null || (nVar = this.f352049e.f352045i) == null)) {
                            ((C117715c.C117716a) nVar).mo182424a(bVar);
                        }
                        this.f352049e.zx0();
                        C117715c.vx0(this.f352049e);
                    }
                }
            }
        }
    }
}
