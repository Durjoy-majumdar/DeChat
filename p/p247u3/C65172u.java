package p247u3;

import gy3.C87412m;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import my3.C34690i;
import p247u3.C65060g0;
import p247u3.C65086n0;
import sx3.C110818d0;
import zx3.C66986c;

/* renamed from: u3.u */
public final class C65172u<T> {

    /* renamed from: a */
    public int f187624a;

    /* renamed from: b */
    public int f187625b;

    /* renamed from: c */
    public final ArrayDeque<C65048d2<T>> f187626c = new ArrayDeque<>();

    /* renamed from: d */
    public final C65080m0 f187627d = new C65080m0();

    /* renamed from: a */
    public final void mo89327a(C65086n0<T> n0Var) {
        C87412m.m108594g(n0Var, "event");
        int i = 0;
        if (n0Var instanceof C65086n0.C65088b) {
            C65086n0.C65088b bVar = (C65086n0.C65088b) n0Var;
            C65080m0 m0Var = this.f187627d;
            C65079m mVar = bVar.f187331e;
            m0Var.getClass();
            C87412m.m108594g(mVar, "combinedLoadStates");
            m0Var.f187309a = mVar.f187304a;
            m0Var.f187310b = mVar.f187305b;
            m0Var.f187311c = mVar.f187306c;
            m0Var.f187312d = mVar.f187307d;
            m0Var.f187313e = mVar.f187308e;
            int ordinal = bVar.f187327a.ordinal();
            if (ordinal == 0) {
                this.f187626c.clear();
                this.f187625b = bVar.f187330d;
                this.f187624a = bVar.f187329c;
                this.f187626c.addAll(bVar.f187328b);
            } else if (ordinal == 1) {
                this.f187624a = bVar.f187329c;
                int size = bVar.f187328b.size() - 1;
                C34690i iVar = new C34690i(size, C66986c.m79137a(size, 0, -1), -1);
                while (iVar.f93287f) {
                    this.f187626c.addFirst(bVar.f187328b.get(iVar.mo59695a()));
                }
            } else if (ordinal == 2) {
                this.f187625b = bVar.f187330d;
                this.f187626c.addAll(bVar.f187328b);
            }
        } else if (n0Var instanceof C65086n0.C65087a) {
            C65086n0.C65087a aVar = (C65086n0.C65087a) n0Var;
            this.f187627d.mo89279b(aVar.f187321a, false, C65060g0.C65063c.f187265c);
            int ordinal2 = aVar.f187321a.ordinal();
            if (ordinal2 == 1) {
                this.f187624a = aVar.f187324d;
                int b = aVar.mo89283b();
                while (i < b) {
                    this.f187626c.removeFirst();
                    i++;
                }
            } else if (ordinal2 == 2) {
                this.f187625b = aVar.f187324d;
                int b2 = aVar.mo89283b();
                while (i < b2) {
                    this.f187626c.removeLast();
                    i++;
                }
            } else {
                throw new IllegalArgumentException("Page drop type must be prepend or append");
            }
        } else if (n0Var instanceof C65086n0.C65091c) {
            C65086n0.C65091c cVar = (C65086n0.C65091c) n0Var;
            this.f187627d.mo89279b(cVar.f187349a, cVar.f187350b, cVar.f187351c);
        }
    }

    /* renamed from: b */
    public final List<C65086n0<T>> mo89328b() {
        ArrayList arrayList = new ArrayList();
        if (!this.f187626c.isEmpty()) {
            arrayList.add(C65086n0.C65088b.f187326g.mo89290a(C110818d0.m150953y0(this.f187626c), this.f187624a, this.f187625b, this.f187627d.mo89280c()));
        } else {
            C65080m0 m0Var = this.f187627d;
            C65066h0 h0Var = m0Var.f187312d;
            C65069i0 i0Var = C65069i0.REFRESH;
            C65060g0 g0Var = h0Var.f187269a;
            C65086n0.C65091c.C65092a aVar = C65086n0.C65091c.f187348d;
            if (aVar.mo89294a(g0Var, false)) {
                arrayList.add(new C65086n0.C65091c(i0Var, false, g0Var));
            }
            C65069i0 i0Var2 = C65069i0.PREPEND;
            C65060g0 g0Var2 = h0Var.f187270b;
            if (aVar.mo89294a(g0Var2, false)) {
                arrayList.add(new C65086n0.C65091c(i0Var2, false, g0Var2));
            }
            C65069i0 i0Var3 = C65069i0.APPEND;
            C65060g0 g0Var3 = h0Var.f187271c;
            if (aVar.mo89294a(g0Var3, false)) {
                arrayList.add(new C65086n0.C65091c(i0Var3, false, g0Var3));
            }
            C65066h0 h0Var2 = m0Var.f187313e;
            if (h0Var2 != null) {
                C65060g0 g0Var4 = h0Var2.f187269a;
                if (aVar.mo89294a(g0Var4, true)) {
                    arrayList.add(new C65086n0.C65091c(i0Var, true, g0Var4));
                }
                C65060g0 g0Var5 = h0Var2.f187270b;
                if (aVar.mo89294a(g0Var5, true)) {
                    arrayList.add(new C65086n0.C65091c(i0Var2, true, g0Var5));
                }
                C65060g0 g0Var6 = h0Var2.f187271c;
                if (aVar.mo89294a(g0Var6, true)) {
                    arrayList.add(new C65086n0.C65091c(i0Var3, true, g0Var6));
                }
            }
        }
        return arrayList;
    }
}
