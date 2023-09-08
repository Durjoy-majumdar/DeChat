package uy3;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import m04.C24980n;
import sx3.C110818d0;
import sx3.C64187h0;
import ty3.C26331b;
import ty3.C26334f;
import uy3.C26371c;
import vz3.C22826c;
import vz3.C22830f;
import vz3.C26408b;
import wy3.C26447e;
import wy3.C26448e0;
import wy3.C26465i0;
import yy3.C26642b;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: uy3.a */
public final class C26368a implements C26642b {

    /* renamed from: a */
    public final C24980n f73553a;

    /* renamed from: b */
    public final C26448e0 f73554b;

    public C26368a(C24980n nVar, C26448e0 e0Var) {
        C87412m.m108594g(nVar, "storageManager");
        C87412m.m108594g(e0Var, "module");
        this.f73553a = nVar;
        this.f73554b = e0Var;
    }

    /* renamed from: a */
    public C26447e mo53351a(C26408b bVar) {
        C87412m.m108594g(bVar, "classId");
        if (bVar.f73646c || bVar.mo53396k()) {
            return null;
        }
        String b = bVar.mo53394i().mo35973b();
        C87412m.m108593f(b, "classId.relativeClassName.asString()");
        if (!C112550d0.m153801u(b, "Function", false)) {
            return null;
        }
        C22826c h = bVar.mo53392h();
        C87412m.m108593f(h, "classId.packageFqName");
        C26371c.C26372a.C26373a a = C26371c.f73565f.mo53357a(b, h);
        if (a == null) {
            return null;
        }
        C26371c cVar = a.f73573a;
        int i = a.f73574b;
        List<C26465i0> A = this.f73554b.mo52620b0(h).mo53458A();
        ArrayList arrayList = new ArrayList();
        for (T next : A) {
            if (next instanceof C26331b) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            if (next2 instanceof C26334f) {
                arrayList2.add(next2);
            }
        }
        C26465i0 i0Var = (C26334f) C110818d0.m150916N(arrayList2);
        if (i0Var == null) {
            i0Var = (C26331b) C110818d0.m150914L(arrayList);
        }
        return new C26369b(this.f73553a, i0Var, cVar, i);
    }

    /* renamed from: b */
    public Collection<C26447e> mo53352b(C22826c cVar) {
        C87412m.m108594g(cVar, "packageFqName");
        return C64187h0.f181908d;
    }

    /* renamed from: c */
    public boolean mo53353c(C22826c cVar, C22830f fVar) {
        C87412m.m108594g(cVar, "packageFqName");
        C87412m.m108594g(fVar, "name");
        String b = fVar.mo35995b();
        C87412m.m108593f(b, "name.asString()");
        return (C112551y.m153819s(b, "Function", false) || C112551y.m153819s(b, "KFunction", false) || C112551y.m153819s(b, "SuspendFunction", false) || C112551y.m153819s(b, "KSuspendFunction", false)) && C26371c.f73565f.mo53357a(b, cVar) != null;
    }
}
