package o81;

import com.tencent.p014mm.autogen.events.SessionEdgeSqlChangeEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import o81.C117715c;
import u24.C90599h;
import v81.C118668c;
import w81.C90900a;

/* renamed from: o81.j */
public class C117724j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SessionEdgeSqlChangeEvent f352056d;

    /* renamed from: e */
    public final /* synthetic */ C117715c f352057e;

    public C117724j(C117715c cVar, SessionEdgeSqlChangeEvent sessionEdgeSqlChangeEvent) {
        this.f352057e = cVar;
        this.f352056d = sessionEdgeSqlChangeEvent;
    }

    public void run() {
        SessionEdgeSqlChangeEvent.C114691a aVar;
        C117725n nVar;
        SessionEdgeSqlChangeEvent sessionEdgeSqlChangeEvent = this.f352056d;
        if (sessionEdgeSqlChangeEvent != null && (aVar = sessionEdgeSqlChangeEvent.f343604d) != null) {
            long j = aVar.f343605a;
            if (j != 0) {
                String valueOf = String.valueOf(j);
                Log.m105924i("EdgeComputingConfigService", "[EdgeComputingConfigService] mSessionEdgeSqlChangeEvent configID : " + valueOf + ", isDel : " + this.f352056d.f343604d.f343607c);
                if (this.f352056d.f343604d.f343607c.booleanValue()) {
                    C90900a.m114029b(valueOf, 9, 0);
                } else {
                    C90900a.m114029b(valueOf, 8, 0);
                }
                synchronized (this.f352057e.f352041e) {
                    if (this.f352056d.f343604d.f343607c.booleanValue()) {
                        if (((HashMap) this.f352057e.f352041e).containsKey(valueOf)) {
                            C118668c cVar = (C118668c) ((HashMap) this.f352057e.f352041e).remove(valueOf);
                            if (!(cVar == null || (nVar = this.f352057e.f352045i) == null)) {
                                ((C117715c.C117716a) nVar).mo182427d(cVar);
                            }
                        } else {
                            return;
                        }
                    } else if (!C90599h.m113511d(this.f352056d.f343604d.f343606b)) {
                        C118668c cVar2 = (C118668c) ((HashMap) this.f352057e.f352041e).get(valueOf);
                        if (cVar2 == null || !C90599h.m113509b(cVar2.f355100g, this.f352056d.f343604d.f343606b)) {
                            C118668c g = this.f352057e.f352044h.mo182416g(valueOf, this.f352056d.f343604d.f343606b);
                            if (g != null) {
                                ((HashMap) this.f352057e.f352041e).put(g.f355094a, g);
                                C117725n nVar2 = this.f352057e.f352045i;
                                if (nVar2 != null) {
                                    ((C117715c.C117716a) nVar2).mo182429f(g);
                                }
                            } else {
                                return;
                            }
                        } else {
                            ((C117715c.C117716a) this.f352057e.f352045i).mo182428e(cVar2);
                            return;
                        }
                    } else {
                        return;
                    }
                    this.f352057e.Ax0();
                }
            }
        }
    }
}
