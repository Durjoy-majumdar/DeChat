package p300c8;

import android.net.Uri;
import java.util.Arrays;
import p333e8.C20528a;

/* renamed from: c8.j */
public final class C79950j {

    /* renamed from: a */
    public final Uri f234181a;

    /* renamed from: b */
    public final byte[] f234182b;

    /* renamed from: c */
    public final long f234183c;

    /* renamed from: d */
    public final long f234184d;

    /* renamed from: e */
    public final long f234185e;

    /* renamed from: f */
    public final String f234186f;

    /* renamed from: g */
    public final int f234187g;

    public C79950j(Uri uri, int i) {
        this(uri, 0, -1, (String) null, i);
    }

    /* renamed from: a */
    public C79950j mo110137a(long j) {
        long j2 = this.f234185e;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j2 - j;
        }
        long j4 = j3;
        return (j == 0 && j2 == j4) ? this : new C79950j(this.f234181a, this.f234182b, this.f234183c + j, this.f234184d + j, j4, this.f234186f, this.f234187g);
    }

    public String toString() {
        return "DataSpec[" + this.f234181a + ", " + Arrays.toString(this.f234182b) + ", " + this.f234183c + ", " + this.f234184d + ", " + this.f234185e + ", " + this.f234186f + ", " + this.f234187g + "]";
    }

    public C79950j(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    public C79950j(Uri uri, long j, long j2, String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    public C79950j(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, (byte[]) null, j, j2, j3, str, i);
    }

    public C79950j(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = true;
        C20528a.m22237a(j >= 0);
        C20528a.m22237a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        C20528a.m22237a(z);
        this.f234181a = uri;
        this.f234182b = bArr;
        this.f234183c = j;
        this.f234184d = j2;
        this.f234185e = j3;
        this.f234186f = str;
        this.f234187g = i;
    }
}
