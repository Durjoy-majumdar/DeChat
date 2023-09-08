package kz3;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import gz3.C24597k;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import m04.C24959e;
import m04.C24975g;
import n04.C25143j0;
import n04.C25154l1;
import n04.C25158m1;
import n04.C25176s0;
import n04.C25180t1;
import n04.C25202z1;
import p04.C25414g;
import p04.C25416i;
import p04.C25417j;
import r04.C26094c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C22415w0;
import sx3.C36907w;
import sx3.C48501y0;
import sx3.C90363p0;
import wy3.C22935h;
import wy3.C26446d1;
import wy3.C26447e;

/* renamed from: kz3.h */
public final class C24867h {

    /* renamed from: a */
    public final C13601g f70870a = C36568h.m40985a(new C24869b(this));

    /* renamed from: b */
    public final C24864f f70871b;

    /* renamed from: c */
    public final C24975g<C24868a, C25143j0> f70872c;

    /* renamed from: kz3.h$a */
    public static final class C24868a {

        /* renamed from: a */
        public final C26446d1 f70873a;

        /* renamed from: b */
        public final boolean f70874b;

        /* renamed from: c */
        public final C24859a f70875c;

        public C24868a(C26446d1 d1Var, boolean z, C24859a aVar) {
            C87412m.m108594g(d1Var, "typeParameter");
            C87412m.m108594g(aVar, "typeAttr");
            this.f70873a = d1Var;
            this.f70874b = z;
            this.f70875c = aVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C24868a)) {
                return false;
            }
            C24868a aVar = (C24868a) obj;
            if (!C87412m.m108589b(aVar.f70873a, this.f70873a) || aVar.f70874b != this.f70874b) {
                return false;
            }
            C24859a aVar2 = aVar.f70875c;
            C24860b bVar = aVar2.f70845b;
            C24859a aVar3 = this.f70875c;
            return bVar == aVar3.f70845b && aVar2.f70844a == aVar3.f70844a && aVar2.f70846c == aVar3.f70846c && C87412m.m108589b(aVar2.f70848e, aVar3.f70848e);
        }

        public int hashCode() {
            int hashCode = this.f70873a.hashCode();
            int i = hashCode + (hashCode * 31) + (this.f70874b ? 1 : 0);
            int hashCode2 = i + (i * 31) + this.f70875c.f70845b.hashCode();
            int hashCode3 = hashCode2 + (hashCode2 * 31) + this.f70875c.f70844a.hashCode();
            C24859a aVar = this.f70875c;
            int i2 = hashCode3 + (hashCode3 * 31) + (aVar.f70846c ? 1 : 0);
            int i3 = i2 * 31;
            C25176s0 s0Var = aVar.f70848e;
            return i2 + i3 + (s0Var != null ? s0Var.hashCode() : 0);
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f70873a + ", isRaw=" + this.f70874b + ", typeAttr=" + this.f70875c + ')';
        }
    }

    /* renamed from: kz3.h$b */
    public static final class C24869b extends C87413o implements C32224a<C25414g> {

        /* renamed from: d */
        public final /* synthetic */ C24867h f70876d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24869b(C24867h hVar) {
            super(0);
            this.f70876d = hVar;
        }

        public Object invoke() {
            return C25417j.m32698c(C25416i.CANNOT_COMPUTE_ERASED_BOUND, this.f70876d.toString());
        }
    }

    /* renamed from: kz3.h$c */
    public static final class C24870c extends C87413o implements C32226l<C24868a, C25143j0> {

        /* renamed from: d */
        public final /* synthetic */ C24867h f70877d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24870c(C24867h hVar) {
            super(1);
            this.f70877d = hVar;
        }

        public Object invoke(Object obj) {
            C25143j0 m;
            C25158m1 m1Var;
            C26446d1 d1Var;
            C25143j0 m2;
            C24868a aVar = (C24868a) obj;
            C24867h hVar = this.f70877d;
            C26446d1 d1Var2 = aVar.f70873a;
            boolean z = aVar.f70874b;
            C24859a aVar2 = aVar.f70875c;
            hVar.getClass();
            C25202z1 z1Var = C25202z1.OUT_VARIANCE;
            Set<C26446d1> set = aVar2.f70847d;
            if (set == null || !set.contains(d1Var2.mo36109a())) {
                C25176s0 s = d1Var2.mo36111s();
                C87412m.m108593f(s, "typeParameter.defaultType");
                LinkedHashSet<C26446d1> linkedHashSet = new LinkedHashSet<>();
                C26094c.m33424d(s, s, linkedHashSet, set);
                int a = C90363p0.m113142a(C36907w.m41090l(linkedHashSet, 10));
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                for (C26446d1 d1Var3 : linkedHashSet) {
                    if (set == null || !set.contains(d1Var3)) {
                        C24864f fVar = hVar.f70871b;
                        C24859a b = z ? aVar2 : aVar2.mo51862b(C24860b.INFLEXIBLE);
                        Set<C26446d1> set2 = aVar2.f70847d;
                        d1Var = d1Var3;
                        C25143j0 a2 = hVar.mo51877a(d1Var, z, C24859a.m31338a(aVar2, (C24597k) null, (C24860b) null, false, set2 != null ? C48501y0.m53873h(set2, d1Var2) : C22415w0.m26092a(d1Var2), (C25176s0) null, 23, (Object) null));
                        C87412m.m108593f(a2, "getErasedUpperBound(it, …Parameter(typeParameter))");
                        m1Var = fVar.mo51870g(d1Var, b, a2);
                    } else {
                        m1Var = C24863e.m31345a(d1Var3, aVar2);
                        d1Var = d1Var3;
                    }
                    linkedHashMap.put(d1Var.mo36110l(), m1Var);
                }
                C25180t1 e = C25180t1.m32044e(C25154l1.C25155a.m31971c(C25154l1.f71605b, linkedHashMap, false, 2, (Object) null));
                List<C25143j0> upperBounds = d1Var2.getUpperBounds();
                C87412m.m108593f(upperBounds, "typeParameter.upperBounds");
                C25143j0 j0Var = (C25143j0) C110818d0.m150914L(upperBounds);
                if (j0Var.mo37081K0().mo37094o() instanceof C26447e) {
                    return C26094c.m33432l(j0Var, e, linkedHashMap, z1Var, aVar2.f70847d);
                }
                Set<C26446d1> set3 = aVar2.f70847d;
                if (set3 == null) {
                    set3 = C22415w0.m26092a(hVar);
                }
                C22935h o = j0Var.mo37081K0().mo37094o();
                C87412m.m108592e(o, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                while (true) {
                    C26446d1 d1Var4 = (C26446d1) o;
                    if (!set3.contains(d1Var4)) {
                        List<C25143j0> upperBounds2 = d1Var4.getUpperBounds();
                        C87412m.m108593f(upperBounds2, "current.upperBounds");
                        C25143j0 j0Var2 = (C25143j0) C110818d0.m150914L(upperBounds2);
                        if (j0Var2.mo37081K0().mo37094o() instanceof C26447e) {
                            return C26094c.m33432l(j0Var2, e, linkedHashMap, z1Var, aVar2.f70847d);
                        }
                        o = j0Var2.mo37081K0().mo37094o();
                        C87412m.m108592e(o, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                    } else {
                        C25176s0 s0Var = aVar2.f70848e;
                        return (s0Var == null || (m = C26094c.m33433m(s0Var)) == null) ? (C25414g) ((C36570n) hVar.f70870a).getValue() : m;
                    }
                }
            } else {
                C25176s0 s0Var2 = aVar2.f70848e;
                return (s0Var2 == null || (m2 = C26094c.m33433m(s0Var2)) == null) ? (C25414g) ((C36570n) hVar.f70870a).getValue() : m2;
            }
        }
    }

    public C24867h(C24864f fVar) {
        C24959e eVar = new C24959e("Type parameter upper bound erasion results");
        this.f70871b = fVar == null ? new C24864f(this) : fVar;
        this.f70872c = eVar.mo52007h(new C24870c(this));
    }

    /* renamed from: a */
    public final C25143j0 mo51877a(C26446d1 d1Var, boolean z, C24859a aVar) {
        C87412m.m108594g(d1Var, "typeParameter");
        C87412m.m108594g(aVar, "typeAttr");
        return (C25143j0) ((C24959e.C24972m) this.f70872c).invoke(new C24868a(d1Var, z, aVar));
    }
}
