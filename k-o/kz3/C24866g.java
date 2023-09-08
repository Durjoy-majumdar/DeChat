package kz3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import g04.C20770i;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import n04.C25109c0;
import n04.C25122g1;
import n04.C25143j0;
import n04.C25158m1;
import n04.C25173r0;
import n04.C25176s0;
import n04.C25198y1;
import o04.C25318c;
import o04.C25323e;
import o04.C25332l;
import sx3.C36907w;
import wy3.C22935h;
import wy3.C26447e;
import yz3.C23393c;
import z04.C112550d0;

/* renamed from: kz3.g */
public final class C24866g extends C25109c0 implements C25173r0 {

    /* renamed from: kz3.g$a */
    public static final class C21386a extends C87413o implements C32226l<String, CharSequence> {

        /* renamed from: d */
        public static final C21386a f60493d = new C21386a();

        public C21386a() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            return "(raw) " + str;
        }
    }

    public C24866g(C25176s0 s0Var, C25176s0 s0Var2, boolean z) {
        super(s0Var, s0Var2);
        if (!z) {
            ((C25332l) C25318c.f71821a).mo52423d(s0Var, s0Var2);
        }
    }

    /* renamed from: U0 */
    public static final List<String> m31351U0(C23393c cVar, C25143j0 j0Var) {
        List<C25158m1> I0 = j0Var.mo37079I0();
        ArrayList arrayList = new ArrayList(C36907w.m41090l(I0, 10));
        for (C25158m1 v : I0) {
            arrayList.add(cVar.mo36864v(v));
        }
        return arrayList;
    }

    /* renamed from: V0 */
    public static final String m31352V0(String str, String str2) {
        if (!C112550d0.m153802v(str, '<', false, 2, (Object) null)) {
            return str;
        }
        return C112550d0.m153796f0(str, '<', (String) null, 2, (Object) null) + '<' + str2 + '>' + C112550d0.m153793c0(str, '>', str);
    }

    /* renamed from: O0 */
    public C25198y1 mo37084O0(boolean z) {
        return new C24866g(this.f71540e.mo37084O0(z), this.f71541f.mo37084O0(z));
    }

    /* renamed from: Q0 */
    public C25198y1 mo51873Q0(C25122g1 g1Var) {
        C87412m.m108594g(g1Var, "newAttributes");
        return new C24866g(this.f71540e.mo51873Q0(g1Var), this.f71541f.mo51873Q0(g1Var));
    }

    /* renamed from: R0 */
    public C25176s0 mo51874R0() {
        return this.f71540e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bd  */
    /* renamed from: S0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo51875S0(yz3.C23393c r13, yz3.C23413j r14) {
        /*
            r12 = this;
            java.lang.String r0 = "renderer"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "options"
            gy3.C87412m.m108594g(r14, r0)
            n04.s0 r0 = r12.f71540e
            java.lang.String r0 = r13.mo36863u(r0)
            n04.s0 r1 = r12.f71541f
            java.lang.String r1 = r13.mo36863u(r1)
            boolean r14 = r14.mo36877h()
            if (r14 == 0) goto L_0x003b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "raw ("
            r13.append(r14)
            r13.append(r0)
            java.lang.String r14 = ".."
            r13.append(r14)
            r13.append(r1)
            r14 = 41
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            return r13
        L_0x003b:
            n04.s0 r14 = r12.f71541f
            java.util.List r14 = r14.mo37079I0()
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x0050
            ty3.h r14 = r04.C26094c.m33425e(r12)
            java.lang.String r13 = r13.mo36860r(r0, r1, r14)
            return r13
        L_0x0050:
            n04.s0 r14 = r12.f71540e
            java.util.List r14 = m31351U0(r13, r14)
            n04.s0 r2 = r12.f71541f
            java.util.List r11 = m31351U0(r13, r2)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            kz3.g$a r8 = kz3.C24866g.C21386a.f60493d
            r9 = 30
            r10 = 0
            java.lang.String r3 = ", "
            r2 = r14
            java.lang.String r2 = sx3.C110818d0.m150921S(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.util.List r14 = sx3.C110818d0.m150908F0(r14, r11)
            boolean r3 = r14.isEmpty()
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x007a
        L_0x0078:
            r4 = 1
            goto L_0x00ac
        L_0x007a:
            java.util.Iterator r14 = r14.iterator()
        L_0x007e:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x0078
            java.lang.Object r3 = r14.next()
            rx3.l r3 = (rx3.C13604l) r3
            A r6 = r3.f38555d
            java.lang.String r6 = (java.lang.String) r6
            B r3 = r3.f38556e
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r7 = "out "
            java.lang.String r7 = z04.C112550d0.m153777M(r3, r7)
            boolean r6 = gy3.C87412m.m108589b(r6, r7)
            if (r6 != 0) goto L_0x00a9
            java.lang.String r6 = "*"
            boolean r3 = gy3.C87412m.m108589b(r3, r6)
            if (r3 == 0) goto L_0x00a7
            goto L_0x00a9
        L_0x00a7:
            r3 = 0
            goto L_0x00aa
        L_0x00a9:
            r3 = 1
        L_0x00aa:
            if (r3 != 0) goto L_0x007e
        L_0x00ac:
            if (r4 == 0) goto L_0x00b2
            java.lang.String r1 = m31352V0(r1, r2)
        L_0x00b2:
            java.lang.String r14 = m31352V0(r0, r2)
            boolean r0 = gy3.C87412m.m108589b(r14, r1)
            if (r0 == 0) goto L_0x00bd
            return r14
        L_0x00bd:
            ty3.h r0 = r04.C26094c.m33425e(r12)
            java.lang.String r13 = r13.mo36860r(r14, r1, r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kz3.C24866g.mo51875S0(yz3.c, yz3.j):java.lang.String");
    }

    /* renamed from: T0 */
    public C25109c0 mo37085P0(C25323e eVar) {
        C87412m.m108594g(eVar, "kotlinTypeRefiner");
        C25143j0 h = eVar.mo52414h(this.f71540e);
        C87412m.m108592e(h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        C25143j0 h2 = eVar.mo52414h(this.f71541f);
        C87412m.m108592e(h2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C24866g((C25176s0) h, (C25176s0) h2, true);
    }

    /* renamed from: n */
    public C20770i mo37088n() {
        C22935h o = mo37081K0().mo37094o();
        C26447e eVar = o instanceof C26447e ? (C26447e) o : null;
        if (eVar != null) {
            C20770i t0 = eVar.mo53430t0(new C24864f((C24867h) null, 1, (C8480h) null));
            C87412m.m108593f(t0, "classDescriptor.getMemberScope(RawSubstitution())");
            return t0;
        }
        throw new IllegalStateException(("Incorrect classifier: " + mo37081K0().mo37094o()).toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C24866g(C25176s0 s0Var, C25176s0 s0Var2) {
        this(s0Var, s0Var2, false);
        C87412m.m108594g(s0Var, "lowerBound");
        C87412m.m108594g(s0Var2, "upperBound");
    }
}
