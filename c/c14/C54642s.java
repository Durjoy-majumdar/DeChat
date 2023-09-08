package c14;

import c14.C54614c;
import f14.C58872c0;
import f14.C58887j0;
import f14.C58889l;
import f14.C58891n;
import f14.C58903u;
import fy3.C32226l;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: c14.s */
public class C54642s<E> extends C54602a<E> {
    public C54642s(C32226l<? super E, C13598b0> lVar) {
        super(lVar);
    }

    /* renamed from: A */
    public void mo75509A(Object obj, C54634n<?> nVar) {
        C58887j0 j0Var = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                C54610a0 a0Var = (C54610a0) obj;
                if (a0Var instanceof C54614c.C54615a) {
                    C32226l<E, C13598b0> lVar = this.f153127d;
                    if (lVar != null) {
                        j0Var = C58903u.m68763a(lVar, ((C54614c.C54615a) a0Var).f153129g, (C58887j0) null);
                    }
                } else {
                    a0Var.mo75532v(nVar);
                }
            } else {
                ArrayList arrayList = (ArrayList) obj;
                C58887j0 j0Var2 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    C54610a0 a0Var2 = (C54610a0) arrayList.get(size);
                    if (a0Var2 instanceof C54614c.C54615a) {
                        C32226l<E, C13598b0> lVar2 = this.f153127d;
                        j0Var2 = lVar2 != null ? C58903u.m68763a(lVar2, ((C54614c.C54615a) a0Var2).f153129g, j0Var2) : null;
                    } else {
                        a0Var2.mo75532v(nVar);
                    }
                }
                j0Var = j0Var2;
            }
        }
        if (j0Var != null) {
            throw j0Var;
        }
    }

    /* renamed from: l */
    public final boolean mo75546l() {
        return false;
    }

    /* renamed from: n */
    public final boolean mo75547n() {
        return false;
    }

    /* renamed from: q */
    public Object mo75548q(E e) {
        C54650y yVar;
        do {
            Object q = super.mo75548q(e);
            C58872c0 c0Var = C54611b.f153121b;
            if (q == c0Var) {
                return c0Var;
            }
            if (q == C54611b.f153122c) {
                C58889l lVar = this.f153128e;
                C54614c.C54615a aVar = new C54614c.C54615a(e);
                while (true) {
                    C58891n n = lVar.mo84080n();
                    if (!(n instanceof C54650y)) {
                        if (n.mo84075h(aVar, lVar)) {
                            yVar = null;
                            break;
                        }
                    } else {
                        yVar = (C54650y) n;
                        break;
                    }
                }
                if (yVar == null) {
                    return C54611b.f153121b;
                }
            } else if (q instanceof C54634n) {
                return q;
            } else {
                throw new IllegalStateException(("Invalid offerInternal result " + q).toString());
            }
        } while (!(yVar instanceof C54634n));
        return yVar;
    }

    /* renamed from: x */
    public final boolean mo75520x() {
        return true;
    }

    /* renamed from: y */
    public final boolean mo75521y() {
        return true;
    }
}
