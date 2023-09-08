package o04;

import com.google.firebase.analytics.FirebaseAnalytics;
import fy3.C32226l;
import gy3.C24560g0;
import gy3.C24563k;
import gy3.C87412m;
import n04.C25109c0;
import n04.C25143j0;
import n04.C25146k0;
import n04.C25152l;
import n04.C25176s0;
import n04.C25194x1;
import n04.C25198y1;
import ny3.C109824f;
import q04.C25526i;
import rx3.C13603j;

/* renamed from: o04.d */
public abstract class C25320d extends C25152l {

    /* renamed from: o04.d$a */
    public static final class C25321a extends C25320d {

        /* renamed from: a */
        public static final C25321a f71822a = new C25321a();
    }

    /* renamed from: o04.d$b */
    public /* synthetic */ class C25322b extends C24563k implements C32226l<C25526i, C25198y1> {
        public C25322b(Object obj) {
            super(1, obj);
        }

        public final String getName() {
            return "prepareType";
        }

        public final C109824f getOwner() {
            return C24560g0.m30725a(C25320d.class);
        }

        public final String getSignature() {
            return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
        }

        public Object invoke(Object obj) {
            C25526i iVar = (C25526i) obj;
            C87412m.m108594g(iVar, "p0");
            return ((C25320d) this.receiver).mo52291a(iVar);
        }
    }

    /* renamed from: b */
    public C25198y1 mo52291a(C25526i iVar) {
        C25198y1 y1Var;
        C87412m.m108594g(iVar, "type");
        if (iVar instanceof C25143j0) {
            C25198y1 N0 = ((C25143j0) iVar).mo52229N0();
            if (N0 instanceof C25176s0) {
                y1Var = mo52407c((C25176s0) N0);
            } else if (N0 instanceof C25109c0) {
                C25109c0 c0Var = (C25109c0) N0;
                C25176s0 c = mo52407c(c0Var.f71540e);
                C25176s0 c2 = mo52407c(c0Var.f71541f);
                y1Var = (c == c0Var.f71540e && c2 == c0Var.f71541f) ? N0 : C25146k0.m31957c(c, c2);
            } else {
                throw new C13603j();
            }
            C25322b bVar = new C25322b(this);
            C87412m.m108594g(y1Var, "<this>");
            C87412m.m108594g(N0, FirebaseAnalytics.C113379b.ORIGIN);
            C25143j0 a = C25194x1.m32120a(N0);
            return C25194x1.m32122c(y1Var, a != null ? (C25143j0) bVar.invoke(a) : null);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: n04.y1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: n04.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: n04.j0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: n04.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: n04.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: n04.j0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: n04.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: n04.j0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: n04.y1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: n04.j0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: n04.y1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n04.C25176s0 mo52407c(n04.C25176s0 r18) {
        /*
            r17 = this;
            n04.j1 r0 = r18.mo37081K0()
            boolean r1 = r0 instanceof a04.C23606c
            r2 = 1
            r3 = 0
            r4 = 10
            r5 = 0
            if (r1 == 0) goto L_0x0089
            a04.c r0 = (a04.C23606c) r0
            n04.m1 r1 = r0.f67745a
            n04.z1 r6 = r1.mo52295a()
            n04.z1 r7 = n04.C25202z1.IN_VARIANCE
            if (r6 != r7) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            if (r2 == 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r1 = r5
        L_0x001f:
            if (r1 == 0) goto L_0x002b
            n04.j0 r1 = r1.getType()
            if (r1 == 0) goto L_0x002b
            n04.y1 r5 = r1.mo52229N0()
        L_0x002b:
            r9 = r5
            o04.i r1 = r0.f67746b
            if (r1 != 0) goto L_0x006f
            n04.m1 r11 = r0.f67745a
            java.util.Collection r1 = r0.mo37096r()
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = sx3.C36907w.m41090l(r1, r4)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0043:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0057
            java.lang.Object r3 = r1.next()
            n04.j0 r3 = (n04.C25143j0) r3
            n04.y1 r3 = r3.mo52229N0()
            r2.add(r3)
            goto L_0x0043
        L_0x0057:
            o04.i r1 = new o04.i
            r13 = 0
            java.lang.String r3 = "projection"
            gy3.C87412m.m108594g(r11, r3)
            o04.h r12 = new o04.h
            r12.<init>(r2)
            r14 = 0
            r15 = 8
            r16 = 0
            r10 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r0.f67746b = r1
        L_0x006f:
            o04.g r1 = new o04.g
            q04.b r7 = q04.C35757b.FOR_SUBTYPING
            o04.i r8 = r0.f67746b
            gy3.C87412m.m108591d(r8)
            n04.g1 r10 = r18.mo37080J0()
            boolean r11 = r18.mo37082L0()
            r12 = 0
            r13 = 32
            r14 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            return r1
        L_0x0089:
            boolean r1 = r0 instanceof b04.C23662r
            if (r1 != 0) goto L_0x00e5
            boolean r1 = r0 instanceof n04.C25124h0
            if (r1 == 0) goto L_0x00e4
            boolean r1 = r18.mo37082L0()
            if (r1 == 0) goto L_0x00e4
            n04.h0 r0 = (n04.C25124h0) r0
            java.util.LinkedHashSet<n04.j0> r1 = r0.f71561b
            java.util.ArrayList r6 = new java.util.ArrayList
            int r4 = sx3.C36907w.m41090l(r1, r4)
            r6.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x00a8:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00bd
            java.lang.Object r3 = r1.next()
            n04.j0 r3 = (n04.C25143j0) r3
            n04.j0 r3 = r04.C26094c.m33430j(r3)
            r6.add(r3)
            r3 = 1
            goto L_0x00a8
        L_0x00bd:
            if (r3 != 0) goto L_0x00c0
            goto L_0x00db
        L_0x00c0:
            n04.j0 r1 = r0.f71560a
            if (r1 == 0) goto L_0x00c8
            n04.j0 r5 = r04.C26094c.m33430j(r1)
        L_0x00c8:
            r6.isEmpty()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>(r6)
            r1.hashCode()
            n04.h0 r2 = new n04.h0
            r2.<init>(r1)
            r2.f71560a = r5
            r5 = r2
        L_0x00db:
            if (r5 != 0) goto L_0x00de
            goto L_0x00df
        L_0x00de:
            r0 = r5
        L_0x00df:
            n04.s0 r0 = r0.mo52269b()
            return r0
        L_0x00e4:
            return r18
        L_0x00e5:
            b04.r r0 = (b04.C23662r) r0
            r0.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            sx3.C36907w.m41090l(r5, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o04.C25320d.mo52407c(n04.s0):n04.s0");
    }
}
