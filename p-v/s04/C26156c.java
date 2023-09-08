package s04;

import a04.C23605b;
import gy3.C87412m;
import n04.C25144j1;
import n04.C25154l1;
import n04.C25158m1;
import n04.C25164o1;
import n04.C25202z1;

/* renamed from: s04.c */
public final class C26156c extends C25154l1 {
    /* renamed from: g */
    public C25158m1 mo52290g(C25144j1 j1Var) {
        C87412m.m108594g(j1Var, "key");
        C23605b bVar = j1Var instanceof C23605b ? (C23605b) j1Var : null;
        if (bVar == null) {
            return null;
        }
        return bVar.getProjection().mo52296b() ? new C25164o1(C25202z1.OUT_VARIANCE, bVar.getProjection().getType()) : bVar.getProjection();
    }
}
