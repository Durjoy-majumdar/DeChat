package a04;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import m04.C24959e;
import m04.C24980n;
import n04.C25121g0;
import n04.C25122g1;
import n04.C25143j0;
import n04.C25158m1;
import n04.C25160n0;
import n04.C25164o1;
import n04.C25167p1;
import n04.C25202z1;
import rx3.C13604l;
import sx3.C36907w;
import wy3.C26446d1;

/* renamed from: a04.d */
public final class C23607d {

    /* renamed from: a04.d$a */
    public static final class C23608a extends C87413o implements C32224a<C25143j0> {

        /* renamed from: d */
        public final /* synthetic */ C25158m1 f67747d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23608a(C25158m1 m1Var) {
            super(0);
            this.f67747d = m1Var;
        }

        public Object invoke() {
            C25143j0 type = this.f67747d.getType();
            C87412m.m108593f(type, "this@createCapturedIfNeeded.type");
            return type;
        }
    }

    /* renamed from: a */
    public static final C25158m1 m28200a(C25158m1 m1Var, C26446d1 d1Var) {
        if (d1Var == null || m1Var.mo52295a() == C25202z1.INVARIANT) {
            return m1Var;
        }
        if (d1Var.mo53423o() != m1Var.mo52295a()) {
            C23606c cVar = new C23606c(m1Var);
            C25122g1.f71557e.getClass();
            return new C25164o1(new C23604a(m1Var, cVar, false, C25122g1.f71558f));
        } else if (!m1Var.mo52296b()) {
            return new C25164o1(m1Var.getType());
        } else {
            C24980n nVar = C24959e.f71117e;
            C87412m.m108593f(nVar, "NO_LOCKS");
            return new C25164o1(new C25160n0(nVar, new C23608a(m1Var)));
        }
    }

    /* renamed from: b */
    public static C25167p1 m28201b(C25167p1 p1Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        C87412m.m108594g(p1Var, "<this>");
        if (!(p1Var instanceof C25121g0)) {
            return new C23609e(p1Var, z);
        }
        C25121g0 g0Var = (C25121g0) p1Var;
        C26446d1[] d1VarArr = g0Var.f71554b;
        C25158m1[] m1VarArr = g0Var.f71555c;
        C87412m.m108594g(m1VarArr, "<this>");
        C87412m.m108594g(d1VarArr, "other");
        int min = Math.min(m1VarArr.length, d1VarArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(new C13604l(m1VarArr[i2], d1VarArr[i2]));
        }
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C13604l lVar = (C13604l) it.next();
            arrayList2.add(m28200a((C25158m1) lVar.f38555d, (C26446d1) lVar.f38556e));
        }
        Object[] array = arrayList2.toArray(new C25158m1[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return new C25121g0(d1VarArr, (C25158m1[]) array, z);
    }
}
