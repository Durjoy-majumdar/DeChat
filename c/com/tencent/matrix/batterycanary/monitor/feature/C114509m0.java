package com.tencent.matrix.batterycanary.monitor.feature;

import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0.C114491a.C114494b;
import java.util.Iterator;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.m0 */
public class C114509m0<ENTRY extends C114490k0.C114491a.C114494b> {
    /* renamed from: a */
    public static <ENTRY extends C114490k0.C114491a.C114494b> C114490k0.C114491a.C114494b.C114502c<ENTRY> m161122a(C114490k0.C114491a.C114494b.C114502c<ENTRY> cVar, C114490k0.C114491a.C114494b.C114502c<ENTRY> cVar2) {
        boolean z;
        C114490k0.C114491a.C114494b.C114502c<ENTRY> b = C114490k0.C114491a.C114494b.C114502c.m161119b();
        for (int i = 0; i < cVar2.f343212a.size(); i++) {
            C114490k0.C114491a.C114494b bVar = (C114490k0.C114491a.C114494b) cVar2.f343212a.get(i);
            if (bVar instanceof C114490k0.C114491a.C114494b.C114497b) {
                if (cVar.f343212a.size() > i) {
                    C114490k0.C114491a.C114494b bVar2 = (C114490k0.C114491a.C114494b) cVar.f343212a.get(i);
                    if (bVar2 instanceof C114490k0.C114491a.C114494b.C114497b) {
                        b.f343212a.add(C114507l0.m161121a((C114490k0.C114491a.C114494b.C114497b) bVar2, (C114490k0.C114491a.C114494b.C114497b) bVar));
                    }
                }
                b.f343212a.add(C114490k0.C114491a.C114494b.C114497b.m161112b(((C114490k0.C114491a.C114494b.C114497b) bVar).f343211a));
            } else if ((bVar instanceof C114490k0.C114491a.C114494b.C114495a) && !cVar.f343212a.contains(bVar)) {
                Iterator<ITEM> it = cVar.f343212a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    C114490k0.C114491a.C114494b bVar3 = (C114490k0.C114491a.C114494b) it.next();
                    if (bVar3 instanceof C114490k0.C114491a.C114494b.C114495a) {
                        C114490k0.C114491a.C114494b.C114495a<?> aVar = (C114490k0.C114491a.C114494b.C114495a) bVar3;
                        C114490k0.C114491a.C114494b.C114495a<?> aVar2 = (C114490k0.C114491a.C114494b.C114495a) bVar;
                        if (aVar2 == aVar || aVar2.equals(aVar)) {
                            aVar2 = C114490k0.C114491a.C114494b.C114495a.f343209b;
                        }
                        if (aVar2 == C114490k0.C114491a.C114494b.C114495a.f343209b) {
                            z = true;
                            break;
                        }
                    }
                }
                if (!z) {
                    b.f343212a.add(bVar);
                }
            }
        }
        return b;
    }
}
