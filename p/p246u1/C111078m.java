package p246u1;

import gy3.C87412m;
import p658q1.C110282c0;
import p658q1.C110309q;
import p658q1.C110311s;

/* renamed from: u1.m */
public final class C111078m extends C110309q<C111078m, C111079n> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111078m(C110311s sVar, C111079n nVar) {
        super(sVar, nVar);
        C87412m.m108594g(sVar, "wrapped");
        C87412m.m108594g(nVar, "modifier");
    }

    /* renamed from: a */
    public void mo161688a() {
        this.f329964g = true;
        C110282c0 c0Var = this.f329961d.f329972h.f329918j;
        if (c0Var != null) {
            c0Var.mo144669k();
        }
    }

    /* renamed from: b */
    public void mo161694b() {
        this.f329964g = false;
        C110282c0 c0Var = this.f329961d.f329972h.f329918j;
        if (c0Var != null) {
            c0Var.mo144669k();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0100  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p246u1.C111075k mo162827c() {
        /*
            r8 = this;
            T r0 = r8.f329963f
            u1.m r0 = (p246u1.C111078m) r0
            r1 = 2
            r2 = 0
            if (r0 != 0) goto L_0x003f
            q1.s r0 = r8.f329961d
            q1.s r0 = r0.mo161744K0()
            if (r0 == 0) goto L_0x0056
        L_0x0010:
            if (r0 == 0) goto L_0x001f
            q1.q<?, ?>[] r3 = r0.f329986y
            boolean r3 = p658q1.C110290e.m149956a(r3, r1)
            if (r3 != 0) goto L_0x001f
            q1.s r0 = r0.mo161744K0()
            goto L_0x0010
        L_0x001f:
            if (r0 == 0) goto L_0x0056
            q1.q<?, ?>[] r0 = r0.f329986y
            r0 = r0[r1]
            u1.m r0 = (p246u1.C111078m) r0
            if (r0 == 0) goto L_0x0056
            q1.s r3 = r0.f329961d
        L_0x002b:
            if (r3 == 0) goto L_0x0056
            if (r0 == 0) goto L_0x0030
            goto L_0x0045
        L_0x0030:
            q1.s r3 = r3.mo161744K0()
            if (r3 == 0) goto L_0x003d
            q1.q<?, ?>[] r0 = r3.f329986y
            r0 = r0[r1]
            u1.m r0 = (p246u1.C111078m) r0
            goto L_0x002b
        L_0x003d:
            r0 = r2
            goto L_0x002b
        L_0x003f:
            q1.s r3 = r0.f329961d
        L_0x0041:
            if (r3 == 0) goto L_0x0056
            if (r0 == 0) goto L_0x0047
        L_0x0045:
            r2 = r0
            goto L_0x0056
        L_0x0047:
            q1.s r3 = r3.mo161744K0()
            if (r3 == 0) goto L_0x0054
            q1.q<?, ?>[] r0 = r3.f329986y
            r0 = r0[r1]
            u1.m r0 = (p246u1.C111078m) r0
            goto L_0x0041
        L_0x0054:
            r0 = r2
            goto L_0x0041
        L_0x0056:
            if (r2 == 0) goto L_0x0100
            M r0 = r8.f329962e
            u1.n r0 = (p246u1.C111079n) r0
            u1.k r0 = r0.mo162830v0()
            boolean r0 = r0.f332626f
            if (r0 == 0) goto L_0x0066
            goto L_0x0100
        L_0x0066:
            M r0 = r8.f329962e
            u1.n r0 = (p246u1.C111079n) r0
            u1.k r0 = r0.mo162830v0()
            r0.getClass()
            u1.k r1 = new u1.k
            r1.<init>()
            boolean r3 = r0.f332625e
            r1.f332625e = r3
            boolean r3 = r0.f332626f
            r1.f332626f = r3
            java.util.Map<u1.z<?>, java.lang.Object> r3 = r1.f332624d
            java.util.Map<u1.z<?>, java.lang.Object> r0 = r0.f332624d
            r3.putAll(r0)
            u1.k r0 = r2.mo162827c()
            java.lang.String r2 = "peer"
            gy3.C87412m.m108594g(r0, r2)
            boolean r2 = r0.f332625e
            r3 = 1
            if (r2 == 0) goto L_0x0095
            r1.f332625e = r3
        L_0x0095:
            boolean r2 = r0.f332626f
            if (r2 == 0) goto L_0x009b
            r1.f332626f = r3
        L_0x009b:
            java.util.Map<u1.z<?>, java.lang.Object> r0 = r0.f332624d
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x00a7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00ff
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            u1.z r3 = (p246u1.C111096z) r3
            java.lang.Object r2 = r2.getValue()
            java.util.Map<u1.z<?>, java.lang.Object> r4 = r1.f332624d
            boolean r4 = r4.containsKey(r3)
            if (r4 != 0) goto L_0x00cb
            java.util.Map<u1.z<?>, java.lang.Object> r4 = r1.f332624d
            r4.put(r3, r2)
            goto L_0x00a7
        L_0x00cb:
            boolean r4 = r2 instanceof p246u1.C111063a
            if (r4 == 0) goto L_0x00a7
            java.util.Map<u1.z<?>, java.lang.Object> r4 = r1.f332624d
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4
            java.lang.Object r4 = r4.get(r3)
            if (r4 == 0) goto L_0x00f7
            u1.a r4 = (p246u1.C111063a) r4
            java.util.Map<u1.z<?>, java.lang.Object> r5 = r1.f332624d
            u1.a r6 = new u1.a
            java.lang.String r7 = r4.f332590a
            if (r7 != 0) goto L_0x00e8
            r7 = r2
            u1.a r7 = (p246u1.C111063a) r7
            java.lang.String r7 = r7.f332590a
        L_0x00e8:
            T r4 = r4.f332591b
            if (r4 != 0) goto L_0x00f0
            u1.a r2 = (p246u1.C111063a) r2
            T r4 = r2.f332591b
        L_0x00f0:
            r6.<init>(r7, r4)
            r5.put(r3, r6)
            goto L_0x00a7
        L_0x00f7:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>"
            r0.<init>(r1)
            throw r0
        L_0x00ff:
            return r1
        L_0x0100:
            M r0 = r8.f329962e
            u1.n r0 = (p246u1.C111079n) r0
            u1.k r0 = r0.mo162830v0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p246u1.C111078m.mo162827c():u1.k");
    }

    public String toString() {
        return super.toString() + " id: " + ((C111079n) this.f329962e).getId() + " config: " + ((C111079n) this.f329962e).mo162830v0();
    }
}
