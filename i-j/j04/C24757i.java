package j04;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Set;
import sx3.C22415w0;
import ty3.C26343l;
import vz3.C26408b;
import wy3.C26447e;

/* renamed from: j04.i */
public final class C24757i {

    /* renamed from: c */
    public static final Set<C26408b> f70614c = C22415w0.m26092a(C26408b.m33992l(C26343l.C26344a.f73413d.mo35993i()));

    /* renamed from: a */
    public final C24763k f70615a;

    /* renamed from: b */
    public final C32226l<C24758a, C26447e> f70616b;

    /* renamed from: j04.i$a */
    public static final class C24758a {

        /* renamed from: a */
        public final C26408b f70617a;

        /* renamed from: b */
        public final C24747g f70618b;

        public C24758a(C26408b bVar, C24747g gVar) {
            C87412m.m108594g(bVar, "classId");
            this.f70617a = bVar;
            this.f70618b = gVar;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C24758a) && C87412m.m108589b(this.f70617a, ((C24758a) obj).f70617a);
        }

        public int hashCode() {
            return this.f70617a.hashCode();
        }
    }

    /* renamed from: j04.i$b */
    public static final class C24759b extends C87413o implements C32226l<C24758a, C26447e> {

        /* renamed from: d */
        public final /* synthetic */ C24757i f70619d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24759b(C24757i iVar) {
            super(1);
            this.f70619d = iVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:38:0x00ce A[EDGE_INSN: B:38:0x00ce->B:32:0x00ce ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r14) {
            /*
                r13 = this;
                j04.i$a r14 = (j04.C24757i.C24758a) r14
                java.lang.String r0 = "key"
                gy3.C87412m.m108594g(r14, r0)
                j04.i r0 = r13.f70619d
                r0.getClass()
                vz3.b r1 = r14.f70617a
                j04.k r2 = r0.f70615a
                java.lang.Iterable<yy3.b> r2 = r2.f70632k
                java.util.Iterator r2 = r2.iterator()
            L_0x0016:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x002a
                java.lang.Object r3 = r2.next()
                yy3.b r3 = (yy3.C26642b) r3
                wy3.e r3 = r3.mo53351a(r1)
                if (r3 == 0) goto L_0x0016
                goto L_0x0101
            L_0x002a:
                java.util.Set<vz3.b> r2 = j04.C24757i.f70614c
                boolean r2 = r2.contains(r1)
                r3 = 0
                if (r2 == 0) goto L_0x0035
                goto L_0x0101
            L_0x0035:
                j04.g r14 = r14.f70618b
                if (r14 != 0) goto L_0x0045
                j04.k r14 = r0.f70615a
                j04.h r14 = r14.f70625d
                j04.g r14 = r14.mo51710a(r1)
                if (r14 != 0) goto L_0x0045
                goto L_0x0101
            L_0x0045:
                sz3.c r2 = r14.f70595a
                qz3.c r11 = r14.f70596b
                sz3.a r12 = r14.f70597c
                wy3.y0 r14 = r14.f70598d
                vz3.b r4 = r1.mo53391g()
                java.lang.String r5 = "classId.shortClassName"
                if (r4 == 0) goto L_0x0080
                wy3.e r0 = r0.mo51738a(r4, r3)
                boolean r4 = r0 instanceof l04.C24874d
                if (r4 == 0) goto L_0x0060
                l04.d r0 = (l04.C24874d) r0
                goto L_0x0061
            L_0x0060:
                r0 = r3
            L_0x0061:
                if (r0 != 0) goto L_0x0065
                goto L_0x0101
            L_0x0065:
                vz3.f r1 = r1.mo53395j()
                gy3.C87412m.m108593f(r1, r5)
                l04.d$a r4 = r0.mo51891J0()
                java.util.Set r4 = r4.mo51907m()
                boolean r1 = r4.contains(r1)
                if (r1 != 0) goto L_0x007c
                goto L_0x0101
            L_0x007c:
                j04.m r0 = r0.f70896r
                goto L_0x00f6
            L_0x0080:
                j04.k r4 = r0.f70615a
                wy3.j0 r4 = r4.f70627f
                vz3.c r6 = r1.mo53392h()
                java.lang.String r7 = "classId.packageFqName"
                gy3.C87412m.m108593f(r6, r7)
                java.util.List r4 = wy3.C22940l0.m26961c(r4, r6)
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                java.util.Iterator r4 = r4.iterator()
            L_0x0097:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L_0x00cd
                java.lang.Object r6 = r4.next()
                r7 = r6
                wy3.i0 r7 = (wy3.C26465i0) r7
                boolean r8 = r7 instanceof j04.C24770p
                if (r8 == 0) goto L_0x00c9
                j04.p r7 = (j04.C24770p) r7
                vz3.f r8 = r1.mo53395j()
                gy3.C87412m.m108593f(r8, r5)
                r7.getClass()
                j04.q r7 = (j04.C24771q) r7
                g04.i r7 = r7.mo51753n()
                l04.j r7 = (l04.C24895j) r7
                java.util.Set r7 = r7.mo51907m()
                boolean r7 = r7.contains(r8)
                if (r7 == 0) goto L_0x00c7
                goto L_0x00c9
            L_0x00c7:
                r7 = 0
                goto L_0x00ca
            L_0x00c9:
                r7 = 1
            L_0x00ca:
                if (r7 == 0) goto L_0x0097
                goto L_0x00ce
            L_0x00cd:
                r6 = r3
            L_0x00ce:
                r5 = r6
                wy3.i0 r5 = (wy3.C26465i0) r5
                if (r5 != 0) goto L_0x00d4
                goto L_0x0101
            L_0x00d4:
                j04.k r4 = r0.f70615a
                sz3.g r7 = new sz3.g
                qz3.t r0 = r11.f72483K
                java.lang.String r1 = "classProto.typeTable"
                gy3.C87412m.m108593f(r0, r1)
                r7.<init>(r0)
                sz3.h$a r0 = sz3.C26248h.f73183b
                qz3.w r1 = r11.f72485M
                java.lang.String r3 = "classProto.versionRequirementTable"
                gy3.C87412m.m108593f(r1, r3)
                sz3.h r8 = r0.mo53148a(r1)
                r10 = 0
                r6 = r2
                r9 = r12
                j04.m r0 = r4.mo51742a(r5, r6, r7, r8, r9, r10)
            L_0x00f6:
                r5 = r0
                l04.d r3 = new l04.d
                r4 = r3
                r6 = r11
                r7 = r2
                r8 = r12
                r9 = r14
                r4.<init>(r5, r6, r7, r8, r9)
            L_0x0101:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: j04.C24757i.C24759b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public C24757i(C24763k kVar) {
        C87412m.m108594g(kVar, "components");
        this.f70615a = kVar;
        this.f70616b = kVar.f70622a.mo52004e(new C24759b(this));
    }

    /* renamed from: a */
    public final C26447e mo51738a(C26408b bVar, C24747g gVar) {
        C87412m.m108594g(bVar, "classId");
        return this.f70616b.invoke(new C24758a(bVar, gVar));
    }
}
