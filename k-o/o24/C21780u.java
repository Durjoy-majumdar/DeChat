package o24;

import gy3.C87412m;

/* renamed from: o24.u */
public final class C21780u implements C21760d0 {

    /* renamed from: d */
    public final C21766h f61718d;

    /* renamed from: e */
    public C21784y f61719e;

    /* renamed from: f */
    public int f61720f;

    /* renamed from: g */
    public boolean f61721g;

    /* renamed from: h */
    public long f61722h;

    /* renamed from: i */
    public final C21768j f61723i;

    public C21780u(C21768j jVar) {
        C87412m.m108594g(jVar, "upstream");
        this.f61723i = jVar;
        C21766h buffer = jVar.getBuffer();
        this.f61718d = buffer;
        C21784y yVar = buffer.f61694d;
        this.f61719e = yVar;
        this.f61720f = yVar != null ? yVar.f61732b : -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r5 == r6.f61732b) goto L_0x002b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e  */
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo32327L0(o24.C21766h r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            gy3.C87412m.m108594g(r9, r0)
            r0 = 0
            r1 = 0
            r3 = 1
            int r4 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r4 < 0) goto L_0x0010
            r5 = 1
            goto L_0x0011
        L_0x0010:
            r5 = 0
        L_0x0011:
            if (r5 == 0) goto L_0x0086
            boolean r5 = r8.f61721g
            r5 = r5 ^ r3
            if (r5 == 0) goto L_0x007a
            o24.y r5 = r8.f61719e
            if (r5 == 0) goto L_0x002b
            o24.h r6 = r8.f61718d
            o24.y r6 = r6.f61694d
            if (r5 != r6) goto L_0x002c
            int r5 = r8.f61720f
            gy3.C87412m.m108591d(r6)
            int r6 = r6.f61732b
            if (r5 != r6) goto L_0x002c
        L_0x002b:
            r0 = 1
        L_0x002c:
            if (r0 == 0) goto L_0x006e
            if (r4 != 0) goto L_0x0031
            return r1
        L_0x0031:
            o24.j r0 = r8.f61723i
            long r1 = r8.f61722h
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.mo34138h(r1)
            if (r0 != 0) goto L_0x0041
            r9 = -1
            return r9
        L_0x0041:
            o24.y r0 = r8.f61719e
            if (r0 != 0) goto L_0x0054
            o24.h r0 = r8.f61718d
            o24.y r0 = r0.f61694d
            if (r0 == 0) goto L_0x0054
            r8.f61719e = r0
            gy3.C87412m.m108591d(r0)
            int r0 = r0.f61732b
            r8.f61720f = r0
        L_0x0054:
            o24.h r0 = r8.f61718d
            long r0 = r0.f61695e
            long r2 = r8.f61722h
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            o24.h r2 = r8.f61718d
            long r4 = r8.f61722h
            r3 = r9
            r6 = r10
            r2.mo34129b(r3, r4, r6)
            long r0 = r8.f61722h
            long r0 = r0 + r10
            r8.f61722h = r0
            return r10
        L_0x006e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x007a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0086:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o24.C21780u.mo32327L0(o24.h, long):long");
    }

    public void close() {
        this.f61721g = true;
    }

    /* renamed from: f */
    public C21762e0 mo32328f() {
        return this.f61723i.mo32328f();
    }
}
