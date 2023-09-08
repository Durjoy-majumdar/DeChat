package o81;

import com.tencent.p014mm.autogen.events.SessionEdgeScriptChangeEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import o81.C117715c;
import u24.C90599h;
import v81.C118667b;
import w81.C90900a;

/* renamed from: o81.i */
public class C117723i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SessionEdgeScriptChangeEvent f352054d;

    /* renamed from: e */
    public final /* synthetic */ C117715c f352055e;

    public C117723i(C117715c cVar, SessionEdgeScriptChangeEvent sessionEdgeScriptChangeEvent) {
        this.f352055e = cVar;
        this.f352054d = sessionEdgeScriptChangeEvent;
    }

    public void run() {
        SessionEdgeScriptChangeEvent.C114690a aVar;
        C117725n nVar;
        SessionEdgeScriptChangeEvent sessionEdgeScriptChangeEvent = this.f352054d;
        if (sessionEdgeScriptChangeEvent != null && (aVar = sessionEdgeScriptChangeEvent.f343600d) != null) {
            long j = aVar.f343601a;
            if (j != 0) {
                String valueOf = String.valueOf(j);
                Log.m105924i("EdgeComputingConfigService", "[EdgeComputingConfigService] mSessionPageConfigChangeEvent configID : " + valueOf + ", isDel : " + this.f352054d.f343600d.f343603c);
                if (this.f352054d.f343600d.f343603c.booleanValue()) {
                    C90900a.m114029b(valueOf, 2, 0);
                } else {
                    C90900a.m114029b(valueOf, 1, 0);
                }
                synchronized (this.f352055e.f352040d) {
                    if (this.f352054d.f343600d.f343603c.booleanValue()) {
                        if (((HashMap) this.f352055e.f352040d).containsKey(valueOf)) {
                            C118667b bVar = (C118667b) ((HashMap) this.f352055e.f352040d).remove(valueOf);
                            if (!(bVar == null || (nVar = this.f352055e.f352045i) == null)) {
                                ((C117715c.C117716a) nVar).mo182424a(bVar);
                            }
                        } else {
                            return;
                        }
                    } else if (!C90599h.m113511d(this.f352054d.f343600d.f343602b)) {
                        C118667b bVar2 = (C118667b) ((HashMap) this.f352055e.f352040d).get(valueOf);
                        if (bVar2 == null || !C90599h.m113509b(bVar2.f355092m, this.f352054d.f343600d.f343602b)) {
                            C118667b f = this.f352055e.f352044h.mo182415f(valueOf, this.f352054d.f343600d.f343602b);
                            if (f != null) {
                                ((HashMap) this.f352055e.f352040d).put(f.f355080a, f);
                                C117725n nVar2 = this.f352055e.f352045i;
                                if (nVar2 != null) {
                                    ((C117715c.C117716a) nVar2).mo182426c(f);
                                }
                            } else {
                                return;
                            }
                        } else {
                            ((C117715c.C117716a) this.f352055e.f352045i).mo182425b(bVar2);
                            return;
                        }
                    } else {
                        return;
                    }
                    this.f352055e.zx0();
                    C117715c.vx0(this.f352055e);
                }
            }
        }
    }
}
