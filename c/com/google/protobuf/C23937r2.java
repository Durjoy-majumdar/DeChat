package com.google.protobuf;

/* renamed from: com.google.protobuf.r2 */
public abstract class C23937r2<T, B> {
    /* renamed from: a */
    public abstract void mo38027a(B b, int i, int i2);

    /* renamed from: b */
    public abstract void mo38028b(B b, int i, long j);

    /* renamed from: c */
    public abstract void mo38029c(B b, int i, T t);

    /* renamed from: d */
    public abstract void mo38030d(B b, int i, C16994k kVar);

    /* renamed from: e */
    public abstract void mo38031e(B b, int i, long j);

    /* renamed from: f */
    public abstract B mo38032f(Object obj);

    /* renamed from: g */
    public abstract T mo38033g(Object obj);

    /* renamed from: h */
    public abstract int mo38034h(T t);

    /* renamed from: i */
    public abstract int mo38035i(T t);

    /* renamed from: j */
    public abstract void mo38036j(Object obj);

    /* renamed from: k */
    public abstract T mo38037k(T t, T t2);

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f A[LOOP:0: B:16:0x002f->B:19:0x003c, LOOP_START] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo38038l(B r7, com.google.protobuf.C23819d2 r8) {
        /*
            r6 = this;
            int r0 = r8.getTag()
            int r1 = r0 >>> 3
            r0 = r0 & 7
            r2 = 1
            if (r0 == 0) goto L_0x0061
            if (r0 == r2) goto L_0x0059
            r3 = 2
            if (r0 == r3) goto L_0x0051
            r3 = 4
            r4 = 3
            if (r0 == r4) goto L_0x0028
            if (r0 == r3) goto L_0x0026
            r3 = 5
            if (r0 != r3) goto L_0x0021
            int r8 = r8.mo37570s()
            r6.mo38027a(r7, r1, r8)
            return r2
        L_0x0021:
            com.google.protobuf.p0$a r7 = com.google.protobuf.C23922p0.m29479d()
            throw r7
        L_0x0026:
            r7 = 0
            return r7
        L_0x0028:
            java.lang.Object r0 = r6.mo38039m()
            int r4 = r1 << 3
            r3 = r3 | r4
        L_0x002f:
            int r4 = r8.mo37535C()
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x003e
            boolean r4 = r6.mo38038l(r0, r8)
            if (r4 != 0) goto L_0x002f
        L_0x003e:
            int r8 = r8.getTag()
            if (r3 != r8) goto L_0x004c
            java.lang.Object r8 = r6.mo38043q(r0)
            r6.mo38029c(r7, r1, r8)
            return r2
        L_0x004c:
            com.google.protobuf.p0 r7 = com.google.protobuf.C23922p0.m29476a()
            throw r7
        L_0x0051:
            com.google.protobuf.k r8 = r8.mo37577z()
            r6.mo38030d(r7, r1, r8)
            return r2
        L_0x0059:
            long r3 = r8.mo37540H()
            r6.mo38028b(r7, r1, r3)
            return r2
        L_0x0061:
            long r3 = r8.mo37559j()
            r6.mo38031e(r7, r1, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23937r2.mo38038l(java.lang.Object, com.google.protobuf.d2):boolean");
    }

    /* renamed from: m */
    public abstract B mo38039m();

    /* renamed from: n */
    public abstract void mo38040n(Object obj, B b);

    /* renamed from: o */
    public abstract void mo38041o(Object obj, T t);

    /* renamed from: p */
    public abstract boolean mo38042p(C23819d2 d2Var);

    /* renamed from: q */
    public abstract T mo38043q(B b);

    /* renamed from: r */
    public abstract void mo38044r(T t, C23809a3 a3Var);

    /* renamed from: s */
    public abstract void mo38045s(T t, C23809a3 a3Var);
}
