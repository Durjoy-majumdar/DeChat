package wy3;

import java.util.Collection;
import java.util.List;
import n04.C25143j0;
import n04.C25167p1;
import n04.C25180t1;
import vz3.C22830f;
import wy3.C26434a;
import wy3.C26436b;
import xy3.C26571h;

/* renamed from: wy3.w */
public interface C26516w extends C26436b {

    /* renamed from: wy3.w$a */
    public interface C26517a<D extends C26516w> {
        /* renamed from: a */
        C26517a<D> mo52599a(C26571h hVar);

        /* renamed from: b */
        C26517a<D> mo52600b();

        D build();

        /* renamed from: c */
        C26517a<D> mo52602c(C22830f fVar);

        /* renamed from: d */
        C26517a<D> mo52603d(C26469k kVar);

        /* renamed from: e */
        C26517a<D> mo52604e(C25143j0 j0Var);

        /* renamed from: f */
        <V> C26517a<D> mo52605f(C26434a.C22933a<V> aVar, V v);

        /* renamed from: g */
        C26517a<D> mo52606g(C26442c0 c0Var);

        /* renamed from: h */
        C26517a<D> mo52607h();

        /* renamed from: i */
        C26517a<D> mo52608i(boolean z);

        /* renamed from: j */
        C26517a<D> mo52609j(C26436b.C26437a aVar);

        /* renamed from: k */
        C26517a<D> mo52610k(List<C26446d1> list);

        /* renamed from: l */
        C26517a<D> mo52611l(C26436b bVar);

        /* renamed from: m */
        C26517a<D> mo52612m(List<C26463h1> list);

        /* renamed from: n */
        C26517a<D> mo52613n(C26505s sVar);

        /* renamed from: o */
        C26517a<D> mo52614o(C26509u0 u0Var);

        /* renamed from: p */
        C26517a<D> mo52615p();

        /* renamed from: q */
        C26517a<D> mo52616q(C25167p1 p1Var);

        /* renamed from: r */
        C26517a<D> mo52617r();
    }

    /* renamed from: C */
    boolean mo53472C();

    /* renamed from: D0 */
    C26516w mo53473D0();

    /* renamed from: H0 */
    boolean mo53474H0();

    /* renamed from: Z */
    boolean mo51885Z();

    /* renamed from: a */
    C26516w mo36109a();

    /* renamed from: b */
    C26469k mo51892b();

    /* renamed from: c */
    C26516w mo51921c(C25180t1 t1Var);

    /* renamed from: e */
    Collection<? extends C26516w> mo52633e();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    /* renamed from: p */
    C26517a<? extends C26516w> mo52597p();
}
