package d23;

import d23.C106976a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import sp3.C110801c;
import sp3.C110807k;
import xp3.C112168e;

/* renamed from: d23.f */
public final class C106980f implements C112168e {

    /* renamed from: a */
    public String f320226a = "";

    /* renamed from: b */
    public final /* synthetic */ C110807k f320227b;

    public C106980f(C110807k kVar) {
        this.f320227b = kVar;
    }

    /* renamed from: a */
    public void mo134637a(long j) {
        C110801c cVar;
        String str;
        boolean z;
        C106976a aVar = C106976a.f320208a;
        C106976a.C106977b bVar = C106976a.f320213f;
        String str2 = null;
        if ((bVar != null ? bVar.f320221a : null) != null) {
            Iterator<C110801c> it = this.f320227b.f331511l.iterator();
            while (true) {
                if (!it.hasNext()) {
                    cVar = null;
                    break;
                }
                cVar = it.next();
                C110801c cVar2 = cVar;
                if (cVar2.f331464b > j || cVar2.f331465c <= j) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C110801c cVar3 = cVar;
            if (!C87412m.m108589b(cVar3 != null ? cVar3.f331482t : null, this.f320226a)) {
                C106976a aVar2 = C106976a.f320208a;
                if (cVar3 != null) {
                    str2 = cVar3.f331482t;
                }
                int c = aVar2.mo157399c(str2);
                if (((ArrayList) C106976a.f320220m).contains(Integer.valueOf(c))) {
                    aVar2.mo157407k(c);
                }
                if (cVar3 == null || (str = cVar3.f331482t) == null) {
                    str = "";
                }
                this.f320226a = str;
            }
        }
    }

    /* renamed from: d */
    public void mo134638d() {
    }
}
