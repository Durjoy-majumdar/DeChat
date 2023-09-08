package b04;

import gy3.C87412m;
import n04.C25122g1;
import n04.C25143j0;
import n04.C25146k0;
import n04.C25164o1;
import n04.C25176s0;
import n04.C25202z1;
import p04.C25416i;
import p04.C25417j;
import r04.C26094c;
import rx3.C13603j;
import sx3.C26236u;
import ty3.C26336h;
import ty3.C26343l;
import vz3.C26408b;
import wy3.C26447e;
import wy3.C26448e0;
import wy3.C26510v;

/* renamed from: b04.s */
public final class C23663s extends C23649g<C23664a> {

    /* renamed from: b04.s$a */
    public static abstract class C23664a {

        /* renamed from: b04.s$a$a */
        public static final class C23665a extends C23664a {

            /* renamed from: a */
            public final C25143j0 f67852a;

            public C23665a(C25143j0 j0Var) {
                C87412m.m108594g(j0Var, "type");
                this.f67852a = j0Var;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C23665a) && C87412m.m108589b(this.f67852a, ((C23665a) obj).f67852a);
            }

            public int hashCode() {
                return this.f67852a.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.f67852a + ')';
            }
        }

        /* renamed from: b04.s$a$b */
        public static final class C23666b extends C23664a {

            /* renamed from: a */
            public final C23648f f67853a;

            public C23666b(C23648f fVar) {
                C87412m.m108594g(fVar, "value");
                this.f67853a = fVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C23666b) && C87412m.m108589b(this.f67853a, ((C23666b) obj).f67853a);
            }

            public int hashCode() {
                return this.f67853a.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.f67853a + ')';
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23663s(C23664a aVar) {
        super(aVar);
        C87412m.m108594g(aVar, "value");
    }

    /* renamed from: a */
    public C25143j0 mo37191a(C26448e0 e0Var) {
        C25143j0 j0Var;
        C87412m.m108594g(e0Var, "module");
        C25122g1.f71557e.getClass();
        C25122g1 g1Var = C25122g1.f71558f;
        C26336h m = e0Var.mo52623m();
        m.getClass();
        C26447e j = m.mo53318j(C26343l.C26344a.f73397Q.mo35993i());
        if (j != null) {
            T t = this.f67839a;
            C23664a aVar = (C23664a) t;
            if (aVar instanceof C23664a.C23665a) {
                j0Var = ((C23664a.C23665a) t).f67852a;
            } else if (aVar instanceof C23664a.C23666b) {
                C23648f fVar = ((C23664a.C23666b) t).f67853a;
                C26408b bVar = fVar.f67837a;
                int i = fVar.f67838b;
                C26447e a = C26510v.m34216a(e0Var, bVar);
                if (a == null) {
                    C25416i iVar = C25416i.UNRESOLVED_KCLASS_CONSTANT_VALUE;
                    String bVar2 = bVar.toString();
                    C87412m.m108593f(bVar2, "classId.toString()");
                    j0Var = C25417j.m32698c(iVar, bVar2, String.valueOf(i));
                } else {
                    C25176s0 s = a.mo36111s();
                    C87412m.m108593f(s, "descriptor.defaultType");
                    C25143j0 m2 = C26094c.m33433m(s);
                    for (int i2 = 0; i2 < i; i2++) {
                        m2 = e0Var.mo52623m().mo53316h(C25202z1.INVARIANT, m2);
                    }
                    j0Var = m2;
                }
            } else {
                throw new C13603j();
            }
            return C25146k0.m31959e(g1Var, j, C26236u.m33719b(new C25164o1(j0Var)));
        }
        C26336h.m33836a(21);
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23663s(C23648f fVar) {
        super(new C23664a.C23666b(fVar));
        C87412m.m108594g(fVar, "value");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C23663s(C26408b bVar, int i) {
        this(new C23648f(bVar, i));
        C87412m.m108594g(bVar, "classId");
    }
}
