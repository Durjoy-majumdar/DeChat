package o81;

import com.tencent.p014mm.autogen.events.NewEdgeScriptUpdateEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import o81.C117715c;
import v81.C118667b;
import w81.C90900a;

/* renamed from: o81.e */
public class C117719e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NewEdgeScriptUpdateEvent f352046d;

    /* renamed from: e */
    public final /* synthetic */ C117715c f352047e;

    public C117719e(C117715c cVar, NewEdgeScriptUpdateEvent newEdgeScriptUpdateEvent) {
        this.f352047e = cVar;
        this.f352046d = newEdgeScriptUpdateEvent;
    }

    public void run() {
        NewEdgeScriptUpdateEvent.C114682a aVar;
        NewEdgeScriptUpdateEvent newEdgeScriptUpdateEvent = this.f352046d;
        if (newEdgeScriptUpdateEvent != null && (aVar = newEdgeScriptUpdateEvent.f343580d) != null) {
            long j = aVar.f343581a;
            if (j > 0 && aVar.f343582b != null) {
                String valueOf = String.valueOf(j);
                Log.m105924i("EdgeComputingConfigService", "[EdgeComputingConfigService] mNewEdgeScriptUpdateEvent configID : " + valueOf);
                C90900a.m114029b(valueOf, 1, 0);
                synchronized (this.f352047e.f352040d) {
                    C118667b b = this.f352047e.f352044h.mo182411b(valueOf, this.f352046d.f343580d.f343582b);
                    if (b != null) {
                        ((HashMap) this.f352047e.f352040d).put(b.f355080a, b);
                        C117725n nVar = this.f352047e.f352045i;
                        if (nVar != null) {
                            ((C117715c.C117716a) nVar).mo182426c(b);
                        }
                        this.f352047e.zx0();
                        C117715c.vx0(this.f352047e);
                        C117715c cVar = this.f352047e;
                        cVar.f352043g.post(new C117714b(cVar));
                    }
                }
            }
        }
    }
}
