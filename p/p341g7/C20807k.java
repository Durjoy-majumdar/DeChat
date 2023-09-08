package p341g7;

import p333e8.C20541m;
import p396x6.C23015n;

/* renamed from: g7.k */
public final class C20807k {

    /* renamed from: g7.k$a */
    public static final class C20808a {
        public C20808a(String str, String[] strArr, int i) {
        }
    }

    /* renamed from: g7.k$b */
    public static final class C20809b {

        /* renamed from: a */
        public final boolean f58804a;

        public C20809b(boolean z, int i, int i2, int i3) {
            this.f58804a = z;
        }
    }

    /* renamed from: g7.k$c */
    public static final class C20810c {

        /* renamed from: a */
        public final int f58805a;

        /* renamed from: b */
        public final long f58806b;

        /* renamed from: c */
        public final int f58807c;

        /* renamed from: d */
        public final int f58808d;

        /* renamed from: e */
        public final int f58809e;

        /* renamed from: f */
        public final byte[] f58810f;

        public C20810c(long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, boolean z, byte[] bArr) {
            this.f58805a = i;
            this.f58806b = j2;
            this.f58807c = i3;
            this.f58808d = i5;
            this.f58809e = i6;
            this.f58810f = bArr;
        }
    }

    /* renamed from: a */
    public static boolean m22805a(int i, C20541m mVar, boolean z) {
        if (mVar.f57811c - mVar.f57810b < 7) {
            if (z) {
                return false;
            }
            throw new C23015n("too short header: " + (mVar.f57811c - mVar.f57810b));
        } else if (mVar.mo32103n() != i) {
            if (z) {
                return false;
            }
            throw new C23015n("expected header type " + Integer.toHexString(i));
        } else if (mVar.mo32103n() == 118 && mVar.mo32103n() == 111 && mVar.mo32103n() == 114 && mVar.mo32103n() == 98 && mVar.mo32103n() == 105 && mVar.mo32103n() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new C23015n("expected characters 'vorbis'");
        }
    }
}
