package p396x6;

import p370p7.C21949o;
import p396x6.C23027v;

/* renamed from: x6.m */
public final class C23013m {

    /* renamed from: a */
    public final C23027v.C23029b f66174a = new C23027v.C23029b();

    /* renamed from: b */
    public final C23027v.C23030c f66175b = new C23027v.C23030c();

    /* renamed from: c */
    public C23027v f66176c;

    /* renamed from: d */
    public int f66177d;

    /* renamed from: x6.m$a */
    public static final class C23014a {

        /* renamed from: a */
        public final C21949o.C21951b f66178a;

        /* renamed from: b */
        public final long f66179b;

        /* renamed from: c */
        public final long f66180c;

        /* renamed from: d */
        public final long f66181d;

        /* renamed from: e */
        public final long f66182e;

        /* renamed from: f */
        public final boolean f66183f;

        /* renamed from: g */
        public final boolean f66184g;

        public C23014a(C21949o.C21951b bVar, long j, long j2, long j3, long j4, boolean z, boolean z2) {
            this.f66178a = bVar;
            this.f66179b = j;
            this.f66180c = j2;
            this.f66181d = j3;
            this.f66182e = j4;
            this.f66183f = z;
            this.f66184g = z2;
        }
    }

    /* renamed from: a */
    public final C23014a mo36312a(C21949o.C21951b bVar, long j, long j2) {
        this.f66176c.mo36342d(bVar.f62123a, this.f66174a);
        if (bVar.mo35017a()) {
            C23027v.C23029b bVar2 = this.f66174a;
            int i = bVar.f62124b;
            int i2 = bVar.f62125c;
            if (!(i2 < bVar2.f66213h[i])) {
                return null;
            }
            return mo36313b(bVar.f62123a, i, i2, j);
        }
        int a = this.f66174a.mo36346a(j2);
        return mo36314c(bVar.f62123a, j2, a == -1 ? Long.MIN_VALUE : this.f66174a.f66211f[a]);
    }

    /* renamed from: b */
    public final C23014a mo36313b(int i, int i2, int i3, long j) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        C21949o.C21951b bVar = new C21949o.C21951b(i, i5, i6);
        boolean e = mo36316e(bVar, Long.MIN_VALUE);
        boolean f = mo36317f(bVar, e);
        long[] jArr = this.f66176c.mo34969e(i, this.f66174a, false).f66215j[i5];
        long j2 = i6 >= jArr.length ? -9223372036854775807L : jArr[i6];
        C23027v.C23029b bVar2 = this.f66174a;
        return new C23014a(bVar, i6 == bVar2.f66214i[i5] ? bVar2.f66216k : 0, Long.MIN_VALUE, j, j2, e, f);
    }

    /* renamed from: c */
    public final C23014a mo36314c(int i, long j, long j2) {
        int i2 = i;
        long j3 = j2;
        C21949o.C21951b bVar = new C21949o.C21951b(i, -1, -1);
        boolean e = mo36316e(bVar, j3);
        boolean f = mo36317f(bVar, e);
        this.f66176c.mo36342d(i, this.f66174a);
        return new C23014a(bVar, j, j2, -9223372036854775807L, j3 == Long.MIN_VALUE ? this.f66174a.f66209d : j3, e, f);
    }

    /* renamed from: d */
    public final C23014a mo36315d(C23014a aVar, C21949o.C21951b bVar) {
        long j;
        long j2;
        long j3 = aVar.f66179b;
        long j4 = aVar.f66180c;
        boolean e = mo36316e(bVar, j4);
        boolean f = mo36317f(bVar, e);
        this.f66176c.mo36342d(bVar.f62123a, this.f66174a);
        if (bVar.mo35017a()) {
            C23027v.C23029b bVar2 = this.f66174a;
            int i = bVar.f62124b;
            int i2 = bVar.f62125c;
            long[] jArr = bVar2.f66215j[i];
            j2 = i2 >= jArr.length ? -9223372036854775807L : jArr[i2];
        } else if (j4 == Long.MIN_VALUE) {
            j2 = this.f66174a.f66209d;
        } else {
            j = j4;
            return new C23014a(bVar, j3, j4, aVar.f66181d, j, e, f);
        }
        j = j2;
        return new C23014a(bVar, j3, j4, aVar.f66181d, j, e, f);
    }

    /* renamed from: e */
    public final boolean mo36316e(C21949o.C21951b bVar, long j) {
        long[] jArr = this.f66176c.mo34969e(bVar.f62123a, this.f66174a, false).f66211f;
        int length = jArr == null ? 0 : jArr.length;
        if (length == 0) {
            return true;
        }
        int i = length - 1;
        boolean a = bVar.mo35017a();
        C23027v.C23029b bVar2 = this.f66174a;
        if (bVar2.f66211f[i] != Long.MIN_VALUE) {
            return !a && j == Long.MIN_VALUE;
        }
        int i2 = bVar2.f66212g[i];
        if (i2 == -1) {
            return false;
        }
        return (a && bVar.f62124b == i && bVar.f62125c == i2 + -1) || (!a && bVar2.f66214i[i] == i2);
    }

    /* renamed from: f */
    public final boolean mo36317f(C21949o.C21951b bVar, boolean z) {
        if (this.f66176c.mo36344h(this.f66176c.mo34969e(bVar.f62123a, this.f66174a, false).f66208c, this.f66175b, false).f66221e) {
            return false;
        }
        return (this.f66176c.mo36341b(bVar.f62123a, this.f66174a, this.f66175b, this.f66177d) == -1) && z;
    }

    /* renamed from: g */
    public C21949o.C21951b mo36318g(int i, long j) {
        this.f66176c.mo36342d(i, this.f66174a);
        int b = this.f66174a.mo36347b(j);
        return b == -1 ? new C21949o.C21951b(i, -1, -1) : new C21949o.C21951b(i, b, this.f66174a.f66214i[b]);
    }
}
