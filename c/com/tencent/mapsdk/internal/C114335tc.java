package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.vector.VectorMap;

/* renamed from: com.tencent.mapsdk.internal.tc */
public final class C114335tc implements C113722fg {

    /* renamed from: a */
    private final C114322sx f342638a;

    public C114335tc(C114322sx sxVar) {
        this.f342638a = sxVar;
    }

    /* renamed from: b */
    public final void mo171191b(int i) {
        C114322sx sxVar = this.f342638a;
        if (sxVar != null && i == C113744fy.f340316c) {
            int r = ((VectorMap) sxVar.f339878e_).mo173490r();
            sxVar.f342560ac = true;
            sxVar.f342561ad = true;
            if (r <= sxVar.f342559ab) {
                sxVar.f342561ad = false;
            } else if (r >= sxVar.f342558aa) {
                sxVar.f342560ac = false;
            }
            if (!sxVar.f342590q.isEmpty()) {
                C113739fu fuVar = new C113739fu();
                fuVar.f340295f = 0;
                fuVar.f340296g = sxVar.f342560ac;
                fuVar.f340297h = sxVar.f342561ad;
                for (C113717fb a : sxVar.f342590q) {
                    a.mo171693a(fuVar);
                }
            }
            C114322sx sxVar2 = this.f342638a;
            if (!sxVar2.f342590q.isEmpty()) {
                C113739fu fuVar2 = new C113739fu();
                fuVar2.f340295f = 0;
                fuVar2.f340296g = sxVar2.f342560ac;
                fuVar2.f340297h = sxVar2.f342561ad;
                for (C113717fb a2 : sxVar2.f342590q) {
                    a2.mo171693a(fuVar2);
                }
            }
        }
    }
}
