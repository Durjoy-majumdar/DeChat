package cn0;

import android.net.Uri;

/* renamed from: cn0.g */
public final class C80081g {

    /* renamed from: a */
    public final Uri f234519a;

    /* renamed from: b */
    public final long f234520b;

    /* renamed from: c */
    public final long f234521c;

    /* renamed from: d */
    public final long f234522d;

    /* renamed from: e */
    public final String f234523e;

    /* renamed from: f */
    public final int f234524f;

    /* renamed from: g */
    public final String f234525g;

    /* renamed from: h */
    public final int f234526h;

    public C80081g(Uri uri, long j, long j2, long j3, String str, int i, String str2) {
        this(uri, j, j, j3, str, i, str2, -1);
    }

    public String toString() {
        return "DataSpec[uri=" + this.f234519a + ", absPos=" + this.f234520b + ", pos=" + this.f234521c + ", len=" + this.f234522d + ", key=" + this.f234523e + ", flags=" + this.f234524f + ", uuid=" + this.f234525g + "]";
    }

    public C80081g(Uri uri, long j, long j2, long j3, String str, int i, String str2, int i2) {
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        boolean z = false;
        if (j4 >= 0) {
            if (j5 >= 0) {
                if ((j6 > 0 || j6 == -1) ? true : z) {
                    this.f234519a = uri;
                    this.f234520b = j4;
                    this.f234521c = j5;
                    this.f234522d = j6;
                    this.f234523e = str;
                    this.f234524f = i;
                    this.f234525g = str2;
                    this.f234526h = i2;
                    return;
                }
                try {
                    throw new IllegalArgumentException();
                } catch (IllegalArgumentException e) {
                    throw new C80098m(e);
                }
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
