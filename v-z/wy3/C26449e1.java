package wy3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import d04.C24442a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n04.C25144j1;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64186f0;
import y04.C112354s;
import y04.C15925h;
import y04.C26622u;

/* renamed from: wy3.e1 */
public final class C26449e1 {

    /* renamed from: wy3.e1$a */
    public static final class C26450a extends C87413o implements C32226l<C26469k, Boolean> {

        /* renamed from: d */
        public static final C26450a f73739d = new C26450a();

        public C26450a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C26469k kVar = (C26469k) obj;
            C87412m.m108594g(kVar, LocaleUtil.ITALIAN);
            return Boolean.valueOf(kVar instanceof C26434a);
        }
    }

    /* renamed from: wy3.e1$b */
    public static final class C26451b extends C87413o implements C32226l<C26469k, Boolean> {

        /* renamed from: d */
        public static final C26451b f73740d = new C26451b();

        public C26451b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C26469k kVar = (C26469k) obj;
            C87412m.m108594g(kVar, LocaleUtil.ITALIAN);
            return Boolean.valueOf(!(kVar instanceof C26467j));
        }
    }

    /* renamed from: wy3.e1$c */
    public static final class C26452c extends C87413o implements C32226l<C26469k, C15925h<? extends C26446d1>> {

        /* renamed from: d */
        public static final C26452c f73741d = new C26452c();

        public C26452c() {
            super(1);
        }

        public Object invoke(Object obj) {
            C26469k kVar = (C26469k) obj;
            C87412m.m108594g(kVar, LocaleUtil.ITALIAN);
            List<C26446d1> typeParameters = ((C26434a) kVar).getTypeParameters();
            C87412m.m108593f(typeParameters, "it as CallableDescriptor).typeParameters");
            return C110818d0.m150897A(typeParameters);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [wy3.k] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final wy3.C26488p0 m34099a(n04.C25143j0 r5, wy3.C26464i r6, int r7) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x005a
            boolean r1 = p04.C25417j.m32699f(r6)
            if (r1 == 0) goto L_0x000a
            goto L_0x005a
        L_0x000a:
            java.util.List r1 = r6.mo51805t()
            int r1 = r1.size()
            int r1 = r1 + r7
            boolean r2 = r6.mo51795Y()
            if (r2 != 0) goto L_0x003d
            java.util.List r2 = r5.mo37079I0()
            int r2 = r2.size()
            if (r1 == r2) goto L_0x0027
            boolean r1 = zz3.C26794h.m35228p(r6)
        L_0x0027:
            wy3.p0 r1 = new wy3.p0
            java.util.List r2 = r5.mo37079I0()
            java.util.List r5 = r5.mo37079I0()
            int r5 = r5.size()
            java.util.List r5 = r2.subList(r7, r5)
            r1.<init>(r6, r5, r0)
            return r1
        L_0x003d:
            java.util.List r2 = r5.mo37079I0()
            java.util.List r7 = r2.subList(r7, r1)
            wy3.p0 r2 = new wy3.p0
            wy3.k r3 = r6.mo51892b()
            boolean r4 = r3 instanceof wy3.C26464i
            if (r4 == 0) goto L_0x0052
            r0 = r3
            wy3.i r0 = (wy3.C26464i) r0
        L_0x0052:
            wy3.p0 r5 = m34099a(r5, r0, r1)
            r2.<init>(r6, r7, r5)
            return r2
        L_0x005a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wy3.C26449e1.m34099a(n04.j0, wy3.i, int):wy3.p0");
    }

    /* renamed from: b */
    public static final List<C26446d1> m34100b(C26464i iVar) {
        List<C26446d1> list;
        C26469k kVar;
        C25144j1 l;
        C87412m.m108594g(iVar, "<this>");
        List<C26446d1> t = iVar.mo51805t();
        C87412m.m108593f(t, "declaredTypeParameters");
        if (!iVar.mo51795Y() && !(iVar.mo51892b() instanceof C26434a)) {
            return t;
        }
        C15925h<C26469k> k = C24442a.m30544k(iVar);
        C26450a aVar = C26450a.f73739d;
        C87412m.m108594g(k, "<this>");
        C87412m.m108594g(aVar, "predicate");
        List s = C112354s.m153296s(C112354s.m153289l(C112354s.m153285h(new C26622u(k, aVar), C26451b.f73740d), C26452c.f73741d));
        Iterator<C26469k> it = C24442a.m30544k(iVar).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                kVar = null;
                break;
            }
            kVar = it.next();
            if (kVar instanceof C26447e) {
                break;
            }
        }
        C26447e eVar = (C26447e) kVar;
        if (!(eVar == null || (l = eVar.mo36110l()) == null)) {
            list = l.getParameters();
        }
        if (list == null) {
            list = C64186f0.f181907d;
        }
        if (!s.isEmpty() || !list.isEmpty()) {
            List<T> e0 = C110818d0.m150933e0(s, list);
            ArrayList arrayList = new ArrayList(C36907w.m41090l(e0, 10));
            for (T t2 : e0) {
                C87412m.m108593f(t2, LocaleUtil.ITALIAN);
                arrayList.add(new C26441c(t2, iVar, t.size()));
            }
            return C110818d0.m150933e0(t, arrayList);
        }
        List<C26446d1> t3 = iVar.mo51805t();
        C87412m.m108593f(t3, "declaredTypeParameters");
        return t3;
    }
}
