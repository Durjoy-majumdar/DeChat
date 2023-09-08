package qb0;

import gy3.C87412m;
import ob0.C11385n;

/* renamed from: qb0.f */
public final class C77308f implements C77306a {

    /* renamed from: d */
    public final C11385n f225438d;

    public C77308f(C11385n nVar) {
        C87412m.m108594g(nVar, "onSceneEnd");
        this.f225438d = nVar;
    }

    public int hashCode() {
        return this.f225438d.hashCode();
    }

    public void onChanged(Object obj) {
        C77307c cVar = (C77307c) obj;
        C87412m.m108594g(cVar, "event");
        if (cVar.f225433a == C47798b.OnEnd) {
            this.f225438d.onSceneEnd(cVar.f225434b, cVar.f225435c, cVar.f225436d, cVar.f225437e);
        }
    }
}
