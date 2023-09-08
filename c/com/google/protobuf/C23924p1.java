package com.google.protobuf;

import com.google.protobuf.C23832g0;
import com.google.protobuf.C23932r0;
import com.google.protobuf.C24087z2;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.p1 */
public final class C23924p1<T> implements C23828f2<T> {

    /* renamed from: a */
    public final C23845j1 f68531a;

    /* renamed from: b */
    public final C23937r2<?, ?> f68532b;

    /* renamed from: c */
    public final boolean f68533c;

    /* renamed from: d */
    public final C23812b0<?> f68534d;

    public C23924p1(C23937r2<?, ?> r2Var, C23812b0<?> b0Var, C23845j1 j1Var) {
        this.f68532b = r2Var;
        this.f68533c = b0Var.mo37486e(j1Var);
        this.f68534d = b0Var;
        this.f68531a = j1Var;
    }

    /* renamed from: a */
    public void mo37609a(T t, T t2) {
        C23937r2<?, ?> r2Var = this.f68532b;
        Class<?> cls = C23842h2.f68331a;
        r2Var.mo38041o(t, r2Var.mo38037k(r2Var.mo38033g(t), r2Var.mo38033g(t2)));
        if (this.f68533c) {
            C23812b0<?> b0Var = this.f68534d;
            C23832g0<?> c = b0Var.mo37484c(t2);
            if (!c.mo37648p()) {
                b0Var.mo37485d(t).mo37652v(c);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo37610b(T t) {
        return this.f68534d.mo37484c(t).mo37649q();
    }

    /* renamed from: c */
    public void mo37611c(T t, C23809a3 a3Var) {
        Iterator<Map.Entry<?, Object>> t2 = this.f68534d.mo37484c(t).mo37650t();
        while (t2.hasNext()) {
            Map.Entry next = t2.next();
            C23832g0.C23835c cVar = (C23832g0.C23835c) next.getKey();
            if (cVar.mo37664Q() != C24087z2.C24094c.MESSAGE || cVar.mo37662E0() || cVar.mo37666T0()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof C23932r0.C23934b) {
                ((C23907o) a3Var).mo37969q(cVar.getNumber(), ((C23932r0.C23934b) next).f68562d.getValue().mo38290b());
            } else {
                ((C23907o) a3Var).mo37969q(cVar.getNumber(), next.getValue());
            }
        }
        C23937r2<?, ?> r2Var = this.f68532b;
        r2Var.mo38044r(r2Var.mo38033g(t), a3Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.google.protobuf.l0$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo37612d(T r11, byte[] r12, int r13, int r14, com.google.protobuf.C23825f.C23826a r15) {
        /*
            r10 = this;
            r0 = r11
            com.google.protobuf.l0 r0 = (com.google.protobuf.C23861l0) r0
            com.google.protobuf.t2 r1 = r0.unknownFields
            com.google.protobuf.t2 r2 = com.google.protobuf.C24046t2.f69159f
            if (r1 != r2) goto L_0x0010
            com.google.protobuf.t2 r1 = new com.google.protobuf.t2
            r1.<init>()
            r0.unknownFields = r1
        L_0x0010:
            com.google.protobuf.l0$c r11 = (com.google.protobuf.C23861l0.C23864c) r11
            com.google.protobuf.g0<com.google.protobuf.l0$d> r0 = r11.f68388d
            boolean r2 = r0.f68260b
            if (r2 == 0) goto L_0x001e
            com.google.protobuf.g0 r0 = r0.clone()
            r11.f68388d = r0
        L_0x001e:
            com.google.protobuf.g0<com.google.protobuf.l0$d> r11 = r11.f68388d
            r0 = 0
            r2 = r0
        L_0x0022:
            if (r13 >= r14) goto L_0x00cf
            int r4 = com.google.protobuf.C23825f.m28727I(r12, r13, r15)
            int r13 = r15.f68235a
            r3 = 11
            r5 = 2
            if (r13 == r3) goto L_0x006c
            r3 = r13 & 7
            if (r3 != r5) goto L_0x0067
            com.google.protobuf.b0<?> r2 = r10.f68534d
            com.google.protobuf.a0 r3 = r15.f68238d
            com.google.protobuf.j1 r5 = r10.f68531a
            int r6 = r13 >>> 3
            java.lang.Object r2 = r2.mo37483b(r3, r5, r6)
            r8 = r2
            com.google.protobuf.l0$e r8 = (com.google.protobuf.C23861l0.C23866e) r8
            if (r8 == 0) goto L_0x005c
            com.google.protobuf.z1 r13 = com.google.protobuf.C24086z1.f69225c
            com.google.protobuf.j1 r2 = r8.f68396c
            java.lang.Class r2 = r2.getClass()
            com.google.protobuf.f2 r13 = r13.mo38436a(r2)
            int r13 = com.google.protobuf.C23825f.m28747p(r13, r12, r4, r14, r15)
            com.google.protobuf.l0$d r2 = r8.f68397d
            java.lang.Object r3 = r15.f68237c
            r11.mo37654x(r2, r3)
            goto L_0x0065
        L_0x005c:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.protobuf.C23825f.m28725G(r2, r3, r4, r5, r6, r7)
        L_0x0065:
            r2 = r8
            goto L_0x0022
        L_0x0067:
            int r13 = com.google.protobuf.C23825f.m28731M(r13, r12, r4, r14, r15)
            goto L_0x0022
        L_0x006c:
            r13 = 0
            r3 = r0
        L_0x006e:
            if (r4 >= r14) goto L_0x00c4
            int r4 = com.google.protobuf.C23825f.m28727I(r12, r4, r15)
            int r6 = r15.f68235a
            int r7 = r6 >>> 3
            r8 = r6 & 7
            if (r7 == r5) goto L_0x00a5
            r9 = 3
            if (r7 == r9) goto L_0x0080
            goto L_0x00ba
        L_0x0080:
            if (r2 == 0) goto L_0x009a
            com.google.protobuf.z1 r6 = com.google.protobuf.C24086z1.f69225c
            com.google.protobuf.j1 r7 = r2.f68396c
            java.lang.Class r7 = r7.getClass()
            com.google.protobuf.f2 r6 = r6.mo38436a(r7)
            int r4 = com.google.protobuf.C23825f.m28747p(r6, r12, r4, r14, r15)
            com.google.protobuf.l0$d r6 = r2.f68397d
            java.lang.Object r7 = r15.f68237c
            r11.mo37654x(r6, r7)
            goto L_0x006e
        L_0x009a:
            if (r8 != r5) goto L_0x00ba
            int r4 = com.google.protobuf.C23825f.m28733b(r12, r4, r15)
            java.lang.Object r3 = r15.f68237c
            com.google.protobuf.k r3 = (com.google.protobuf.C16994k) r3
            goto L_0x006e
        L_0x00a5:
            if (r8 != 0) goto L_0x00ba
            int r4 = com.google.protobuf.C23825f.m28727I(r12, r4, r15)
            int r13 = r15.f68235a
            com.google.protobuf.b0<?> r2 = r10.f68534d
            com.google.protobuf.a0 r6 = r15.f68238d
            com.google.protobuf.j1 r7 = r10.f68531a
            java.lang.Object r2 = r2.mo37483b(r6, r7, r13)
            com.google.protobuf.l0$e r2 = (com.google.protobuf.C23861l0.C23866e) r2
            goto L_0x006e
        L_0x00ba:
            r7 = 12
            if (r6 != r7) goto L_0x00bf
            goto L_0x00c4
        L_0x00bf:
            int r4 = com.google.protobuf.C23825f.m28731M(r6, r12, r4, r14, r15)
            goto L_0x006e
        L_0x00c4:
            if (r3 == 0) goto L_0x00cc
            int r13 = r13 << 3
            r13 = r13 | r5
            r1.mo38361d(r13, r3)
        L_0x00cc:
            r13 = r4
            goto L_0x0022
        L_0x00cf:
            if (r13 != r14) goto L_0x00d2
            return
        L_0x00d2:
            com.google.protobuf.p0 r11 = com.google.protobuf.C23922p0.m29482g()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23924p1.mo37612d(java.lang.Object, byte[], int, int, com.google.protobuf.f$a):void");
    }

    /* renamed from: e */
    public void mo37613e(T t) {
        this.f68532b.mo38036j(t);
        this.f68534d.mo37487f(t);
    }

    public boolean equals(T t, T t2) {
        if (!this.f68532b.mo38033g(t).equals(this.f68532b.mo38033g(t2))) {
            return false;
        }
        if (this.f68533c) {
            return this.f68534d.mo37484c(t).equals(this.f68534d.mo37484c(t2));
        }
        return true;
    }

    /* renamed from: f */
    public int mo37615f(T t) {
        C23937r2<?, ?> r2Var = this.f68532b;
        int i = r2Var.mo38035i(r2Var.mo38033g(t)) + 0;
        return this.f68533c ? i + this.f68534d.mo37484c(t).mo37644l() : i;
    }

    /* renamed from: g */
    public T mo37616g() {
        return this.f68531a.newBuilderForType().buildPartial();
    }

    /* renamed from: h */
    public void mo37617h(T t, C23819d2 d2Var, C23806a0 a0Var) {
        C23937r2<?, ?> r2Var = this.f68532b;
        C23812b0<?> b0Var = this.f68534d;
        Object f = r2Var.mo38032f(t);
        C23832g0<?> d = b0Var.mo37485d(t);
        do {
            try {
                if (d2Var.mo37535C() == Integer.MAX_VALUE) {
                    break;
                }
            } finally {
                r2Var.mo38040n(t, f);
            }
        } while (mo38014i(d2Var, a0Var, b0Var, d, r2Var, f));
    }

    public int hashCode(T t) {
        int hashCode = this.f68532b.mo38033g(t).hashCode();
        return this.f68533c ? (hashCode * 53) + this.f68534d.mo37484c(t).hashCode() : hashCode;
    }

    /* renamed from: i */
    public final <UT, UB, ET extends C23832g0.C23835c<ET>> boolean mo38014i(C23819d2 d2Var, C23806a0 a0Var, C23812b0<ET> b0Var, C23832g0<ET> g0Var, C23937r2<UT, UB> r2Var, UB ub) {
        int tag = d2Var.getTag();
        if (tag == 11) {
            int i = 0;
            Object obj = null;
            C16994k kVar = null;
            while (d2Var.mo37535C() != Integer.MAX_VALUE) {
                int tag2 = d2Var.getTag();
                if (tag2 == 16) {
                    i = d2Var.mo37549a();
                    obj = b0Var.mo37483b(a0Var, this.f68531a, i);
                } else if (tag2 == 26) {
                    if (obj != null) {
                        b0Var.mo37489h(d2Var, obj, a0Var, g0Var);
                    } else {
                        kVar = d2Var.mo37577z();
                    }
                } else if (!d2Var.mo37558i()) {
                    break;
                }
            }
            if (d2Var.getTag() == 12) {
                if (kVar != null) {
                    if (obj != null) {
                        b0Var.mo37490i(kVar, obj, a0Var, g0Var);
                    } else {
                        r2Var.mo38030d(ub, i, kVar);
                    }
                }
                return true;
            }
            throw C23922p0.m29476a();
        } else if ((tag & 7) != 2) {
            return d2Var.mo37558i();
        } else {
            Object b = b0Var.mo37483b(a0Var, this.f68531a, tag >>> 3);
            if (b == null) {
                return r2Var.mo38038l(ub, d2Var);
            }
            b0Var.mo37489h(d2Var, b, a0Var, g0Var);
            return true;
        }
    }
}
