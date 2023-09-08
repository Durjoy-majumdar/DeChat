package n04;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import g04.C20776o;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import o04.C25323e;
import q04.C25525h;
import sx3.C110818d0;
import sx3.C64186f0;
import ty3.C26336h;
import ux3.C65486b;
import wy3.C22935h;
import wy3.C26446d1;

/* renamed from: n04.h0 */
public final class C25124h0 implements C25144j1, C25525h {

    /* renamed from: a */
    public C25143j0 f71560a;

    /* renamed from: b */
    public final LinkedHashSet<C25143j0> f71561b;

    /* renamed from: c */
    public final int f71562c;

    /* renamed from: n04.h0$b */
    public static final class C21581b<T> implements Comparator {

        /* renamed from: d */
        public final /* synthetic */ C32226l f61115d;

        public C21581b(C32226l lVar) {
            this.f61115d = lVar;
        }

        public final int compare(T t, T t2) {
            C25143j0 j0Var = (C25143j0) t;
            C32226l lVar = this.f61115d;
            C87412m.m108593f(j0Var, LocaleUtil.ITALIAN);
            String obj = lVar.invoke(j0Var).toString();
            C25143j0 j0Var2 = (C25143j0) t2;
            C32226l lVar2 = this.f61115d;
            C87412m.m108593f(j0Var2, LocaleUtil.ITALIAN);
            return C65486b.m77169a(obj, lVar2.invoke(j0Var2).toString());
        }
    }

    /* renamed from: n04.h0$c */
    public static final class C21582c extends C87413o implements C32226l<C25143j0, CharSequence> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<C25143j0, Object> f61116d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21582c(C32226l<? super C25143j0, ? extends Object> lVar) {
            super(1);
            this.f61116d = lVar;
        }

        public Object invoke(Object obj) {
            C25143j0 j0Var = (C25143j0) obj;
            C32226l<C25143j0, Object> lVar = this.f61116d;
            C87412m.m108593f(j0Var, LocaleUtil.ITALIAN);
            return lVar.invoke(j0Var).toString();
        }
    }

    /* renamed from: n04.h0$a */
    public static final class C25125a extends C87413o implements C32226l<C25323e, C25176s0> {

        /* renamed from: d */
        public final /* synthetic */ C25124h0 f71563d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25125a(C25124h0 h0Var) {
            super(1);
            this.f71563d = h0Var;
        }

        public Object invoke(Object obj) {
            C25323e eVar = (C25323e) obj;
            C87412m.m108594g(eVar, "kotlinTypeRefiner");
            return this.f71563d.mo37093n(eVar).mo52269b();
        }
    }

    public C25124h0(Collection<? extends C25143j0> collection) {
        C87412m.m108594g(collection, "typesToIntersect");
        collection.isEmpty();
        LinkedHashSet<C25143j0> linkedHashSet = new LinkedHashSet<>(collection);
        this.f71561b = linkedHashSet;
        this.f71562c = linkedHashSet.hashCode();
    }

    /* renamed from: b */
    public final C25176s0 mo52269b() {
        C25122g1.f71557e.getClass();
        return C25146k0.m31963i(C25122g1.f71558f, this, C64186f0.f181907d, false, C20776o.f58685c.mo32465a("member scope for intersection type", this.f71561b), new C25125a(this));
    }

    /* renamed from: c */
    public final String mo52270c(C32226l<? super C25143j0, ? extends Object> lVar) {
        C87412m.m108594g(lVar, "getProperTypeRelatedToStringify");
        return C110818d0.m150921S(C110818d0.m150943o0(this.f71561b, new C21581b(lVar)), " & ", "{", "}", 0, (CharSequence) null, new C21582c(lVar), 24, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: n04.h0} */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v6, types: [n04.j0] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n04.C25124h0 mo37093n(o04.C25323e r5) {
        /*
            r4 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            gy3.C87412m.m108594g(r5, r0)
            java.util.LinkedHashSet<n04.j0> r0 = r4.f71561b
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = sx3.C36907w.m41090l(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L_0x0017:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x002c
            java.lang.Object r2 = r0.next()
            n04.j0 r2 = (n04.C25143j0) r2
            n04.j0 r2 = r2.mo37083M0(r5)
            r1.add(r2)
            r2 = 1
            goto L_0x0017
        L_0x002c:
            r0 = 0
            if (r2 != 0) goto L_0x0030
            goto L_0x0047
        L_0x0030:
            n04.j0 r2 = r4.f71560a
            if (r2 == 0) goto L_0x0038
            n04.j0 r0 = r2.mo37083M0(r5)
        L_0x0038:
            n04.h0 r5 = new n04.h0
            r5.<init>(r1)
            n04.h0 r1 = new n04.h0
            java.util.LinkedHashSet<n04.j0> r5 = r5.f71561b
            r1.<init>(r5)
            r1.f71560a = r0
            r0 = r1
        L_0x0047:
            if (r0 != 0) goto L_0x004a
            r0 = r4
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n04.C25124h0.mo37093n(o04.e):n04.h0");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25124h0)) {
            return false;
        }
        return C87412m.m108589b(this.f71561b, ((C25124h0) obj).f71561b);
    }

    public List<C26446d1> getParameters() {
        return C64186f0.f181907d;
    }

    public int hashCode() {
        return this.f71562c;
    }

    /* renamed from: m */
    public C26336h mo37092m() {
        C26336h m = this.f71561b.iterator().next().mo37081K0().mo37092m();
        C87412m.m108593f(m, "intersectedTypes.iterato…xt().constructor.builtIns");
        return m;
    }

    /* renamed from: o */
    public C22935h mo37094o() {
        return null;
    }

    /* renamed from: p */
    public boolean mo37095p() {
        return false;
    }

    /* renamed from: r */
    public Collection<C25143j0> mo37096r() {
        return this.f71561b;
    }

    public String toString() {
        return mo52270c(C34724i0.f93362d);
    }
}
