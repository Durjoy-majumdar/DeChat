package p338ff;

/* renamed from: ff.a */
public final class C20706a {

    /* renamed from: a */
    public final int f58553a;

    /* renamed from: b */
    public final C20707b f58554b;

    /* renamed from: c */
    public final Object f58555c;

    public C20706a(int i, C20707b bVar, Object obj) {
        this.f58553a = i;
        this.f58554b = bVar;
        this.f58555c = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        r5 = r5.f58555c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof p338ff.C20706a
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            ff.a r5 = (p338ff.C20706a) r5
            int r1 = r4.f58553a
            int r3 = r5.f58553a
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            ff.b r1 = r4.f58554b
            ff.b r3 = r5.f58554b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            java.lang.Object r1 = r4.f58555c
            if (r1 == 0) goto L_0x002a
            java.lang.Object r3 = r5.f58555c
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0037
        L_0x002a:
            java.lang.Object r5 = r5.f58555c
            if (r5 == 0) goto L_0x0038
            java.lang.Object r1 = r4.f58555c
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p338ff.C20706a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (this.f58554b.hashCode() << 31) + this.f58553a;
    }
}
