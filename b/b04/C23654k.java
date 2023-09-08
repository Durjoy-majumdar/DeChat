package b04;

import gy3.C87412m;
import n04.C25143j0;
import n04.C25176s0;
import p04.C25416i;
import p04.C25417j;
import rx3.C13604l;
import vz3.C22830f;
import vz3.C26408b;
import wy3.C26447e;
import wy3.C26448e0;
import wy3.C26453f;
import wy3.C26510v;
import zz3.C26794h;

/* renamed from: b04.k */
public final class C23654k extends C23649g<C13604l<? extends C26408b, ? extends C22830f>> {

    /* renamed from: b */
    public final C26408b f67843b;

    /* renamed from: c */
    public final C22830f f67844c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23654k(C26408b bVar, C22830f fVar) {
        super(new C13604l(bVar, fVar));
        C87412m.m108594g(bVar, "enumClassId");
        C87412m.m108594g(fVar, "enumEntryName");
        this.f67843b = bVar;
        this.f67844c = fVar;
    }

    /* renamed from: a */
    public C25143j0 mo37191a(C26448e0 e0Var) {
        C87412m.m108594g(e0Var, "module");
        C26447e a = C26510v.m34216a(e0Var, this.f67843b);
        C25176s0 s0Var = null;
        if (a != null) {
            if (!C26794h.m35227o(a, C26453f.ENUM_CLASS)) {
                a = null;
            }
            if (a != null) {
                s0Var = a.mo36111s();
            }
        }
        if (s0Var != null) {
            return s0Var;
        }
        C25416i iVar = C25416i.ERROR_ENUM_TYPE;
        String bVar = this.f67843b.toString();
        C87412m.m108593f(bVar, "enumClassId.toString()");
        String str = this.f67844c.f65637d;
        C87412m.m108593f(str, "enumEntryName.toString()");
        return C25417j.m32698c(iVar, bVar, str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f67843b.mo53395j());
        sb.append('.');
        sb.append(this.f67844c);
        return sb.toString();
    }
}
