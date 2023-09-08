package p659qe;

/* renamed from: qe.o */
public final class C35836o {

    /* renamed from: a */
    public int f95653a;

    /* renamed from: b */
    public long f95654b;

    /* renamed from: c */
    public final long f95655c;

    /* renamed from: d */
    public final int f95656d;

    /* renamed from: e */
    public final long f95657e;

    public C35836o(long j, int i, long j2) {
        this.f95655c = j;
        this.f95656d = i;
        this.f95657e = j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo60436a(long r8, fy3.C32224a<rx3.C13598b0> r10) {
        /*
            r7 = this;
            java.lang.String r0 = "cb"
            gy3.C87412m.m108594g(r10, r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r7.f95654b
            long r2 = r0 - r2
            r7.f95654b = r0
            long r0 = r7.f95655c
            r4 = 1
            r5 = 0
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x0019
            r8 = 1
            goto L_0x001a
        L_0x0019:
            r8 = 0
        L_0x001a:
            if (r8 == 0) goto L_0x0031
            long r0 = r7.f95657e
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x0031
            int r9 = r7.f95653a
            int r0 = r7.f95656d
            if (r9 >= r0) goto L_0x0031
            int r9 = r9 + r4
            r7.f95653a = r9
            if (r9 != r0) goto L_0x0031
            r10.invoke()
            goto L_0x0041
        L_0x0031:
            if (r8 != 0) goto L_0x0041
            long r9 = r7.f95657e
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0041
            int r9 = r7.f95653a
            int r10 = r7.f95656d
            if (r9 >= r10) goto L_0x0041
            r7.f95653a = r5
        L_0x0041:
            if (r8 == 0) goto L_0x004a
            long r8 = r7.f95657e
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r4 = 0
        L_0x004b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p659qe.C35836o.mo60436a(long, fy3.a):boolean");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35836o)) {
            return false;
        }
        C35836o oVar = (C35836o) obj;
        return this.f95655c == oVar.f95655c && this.f95656d == oVar.f95656d && this.f95657e == oVar.f95657e;
    }

    public int hashCode() {
        long j = this.f95655c;
        long j2 = this.f95657e;
        return (((((int) (j ^ (j >>> 32))) * 31) + this.f95656d) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "{size = " + this.f95655c + ", checkTimes = " + this.f95656d + '}';
    }
}
