package nz3;

import fz3.C24498c;
import gy3.C8480h;
import gy3.C87412m;
import iz3.C24651h;
import n04.C25143j0;
import n04.C25176s0;
import n04.C25187v1;
import q04.C25526i;
import vz3.C22827d;
import wy3.C22935h;
import wy3.C26447e;
import xy3.C26564a;
import xy3.C26566c;
import zz3.C26794h;

/* renamed from: nz3.u */
public final class C25308u extends C25257a<C26566c> {

    /* renamed from: a */
    public final C26564a f71804a;

    /* renamed from: b */
    public final boolean f71805b;

    /* renamed from: c */
    public final C24651h f71806c;

    /* renamed from: d */
    public final C24498c f71807d;

    /* renamed from: e */
    public final boolean f71808e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25308u(C26564a aVar, boolean z, C24651h hVar, C24498c cVar, boolean z2, int i, C8480h hVar2) {
        this(aVar, z, hVar, cVar, (i & 16) != 0 ? false : z2);
    }

    /* renamed from: e */
    public C22827d mo52393e(C25526i iVar) {
        C87412m.m108594g(iVar, "<this>");
        C25176s0 s0Var = C25187v1.f71641a;
        C22935h o = ((C25143j0) iVar).mo37081K0().mo37094o();
        C26447e eVar = o instanceof C26447e ? (C26447e) o : null;
        if (eVar != null) {
            return C26794h.m35219g(eVar);
        }
        return null;
    }

    public C25308u(C26564a aVar, boolean z, C24651h hVar, C24498c cVar, boolean z2) {
        C87412m.m108594g(hVar, "containerContext");
        C87412m.m108594g(cVar, "containerApplicabilityType");
        this.f71804a = aVar;
        this.f71805b = z;
        this.f71806c = hVar;
        this.f71807d = cVar;
        this.f71808e = z2;
    }
}
