package df0;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;

/* renamed from: df0.a */
public class C86271a {

    /* renamed from: a */
    public final int f250876a;

    /* renamed from: b */
    public final long f250877b;

    /* renamed from: c */
    public final long f250878c;

    /* renamed from: d */
    public final long f250879d;

    /* renamed from: e */
    public final String f250880e;

    /* renamed from: f */
    public final boolean f250881f;

    /* renamed from: g */
    public final long f250882g;

    /* renamed from: h */
    public long f250883h = -1;

    public C86271a(int i, long j, long j2, long j3, String str, boolean z, long j4) {
        this.f250876a = i;
        this.f250877b = j;
        this.f250878c = j2;
        this.f250879d = j3;
        this.f250880e = str;
        this.f250881f = z;
        this.f250882g = j4;
    }

    /* renamed from: a */
    public static String m106880a(byte[] bArr, boolean z) {
        if (bArr == null) {
            return null;
        }
        String str = z ? "UTF8" : "Cp437";
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("System doesn't support " + str, e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C86271a.class != obj.getClass()) {
            return false;
        }
        C86271a aVar = (C86271a) obj;
        return this.f250878c == aVar.f250878c && this.f250876a == aVar.f250876a && this.f250877b == aVar.f250877b && TextUtils.equals(this.f250880e, aVar.f250880e) && this.f250883h == aVar.f250883h && this.f250882g == aVar.f250882g && this.f250881f == aVar.f250881f && this.f250879d == aVar.f250879d;
    }

    public int hashCode() {
        long j = this.f250878c;
        long j2 = this.f250877b;
        int i = ((((((int) (j ^ (j >>> 32))) + 31) * 31) + this.f250876a) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        String str = this.f250880e;
        if (str != null) {
            i = (i * 31) + str.hashCode();
        }
        long j3 = this.f250883h;
        long j4 = this.f250882g;
        int i2 = ((((i * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        int i3 = this.f250881f ? 1231 : 1237;
        long j5 = this.f250879d;
        return ((i2 + i3) * 31) + ((int) (j5 ^ (j5 >>> 32)));
    }
}
