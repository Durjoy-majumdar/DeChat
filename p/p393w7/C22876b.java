package p393w7;

import p333e8.C20528a;
import p333e8.C20551y;
import p383t7.C22439a;
import p383t7.C22442d;

/* renamed from: w7.b */
public final class C22876b implements C22442d {

    /* renamed from: d */
    public final C22439a[] f65768d;

    /* renamed from: e */
    public final long[] f65769e;

    public C22876b(C22439a[] aVarArr, long[] jArr) {
        this.f65768d = aVarArr;
        this.f65769e = jArr;
    }

    /* renamed from: a */
    public long mo14896a(int i) {
        boolean z = true;
        C20528a.m22237a(i >= 0);
        if (i >= this.f65769e.length) {
            z = false;
        }
        C20528a.m22237a(z);
        return this.f65769e[i];
    }

    /* renamed from: b */
    public int mo14897b() {
        return this.f65769e.length;
    }

    /* renamed from: c */
    public int mo14898c(long j) {
        int b = C20551y.m22312b(this.f65769e, j, false, false);
        if (b < this.f65769e.length) {
            return b;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r4 = r3.f65768d[r4];
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<p383t7.C22439a> mo14899e(long r4) {
        /*
            r3 = this;
            long[] r0 = r3.f65769e
            r1 = 1
            r2 = 0
            int r4 = p333e8.C20551y.m22313c(r0, r4, r1, r2)
            r5 = -1
            if (r4 == r5) goto L_0x0017
            t7.a[] r5 = r3.f65768d
            r4 = r5[r4]
            if (r4 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            java.util.List r4 = java.util.Collections.singletonList(r4)
            return r4
        L_0x0017:
            java.util.List r4 = java.util.Collections.emptyList()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p393w7.C22876b.mo14899e(long):java.util.List");
    }
}
