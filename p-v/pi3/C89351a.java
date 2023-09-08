package pi3;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: pi3.a */
public class C89351a {

    /* renamed from: a */
    public final int f257332a;

    /* renamed from: b */
    public final long f257333b;

    /* renamed from: c */
    public final long f257334c;

    /* renamed from: d */
    public final long f257335d;

    /* renamed from: e */
    public final byte[] f257336e;

    /* renamed from: f */
    public final boolean f257337f;

    /* renamed from: g */
    public final long f257338g;

    /* renamed from: h */
    public long f257339h = -1;

    /* renamed from: i */
    public String f257340i;

    public C89351a(int i, long j, long j2, long j3, byte[] bArr, boolean z, long j4, boolean z2) {
        this.f257332a = i;
        this.f257333b = j;
        this.f257334c = j2;
        this.f257335d = j3;
        byte[] bArr2 = bArr == null ? null : (byte[]) bArr.clone();
        this.f257336e = bArr2;
        this.f257337f = z;
        this.f257338g = j4;
        String str = z ? "UTF8" : "Cp437";
        try {
            this.f257340i = new String(bArr2, str);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("System doesn't support " + str, e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C89351a.class != obj.getClass()) {
            return false;
        }
        C89351a aVar = (C89351a) obj;
        return this.f257334c == aVar.f257334c && this.f257332a == aVar.f257332a && this.f257333b == aVar.f257333b && Arrays.equals(this.f257336e, aVar.f257336e) && this.f257339h == aVar.f257339h && this.f257338g == aVar.f257338g && this.f257337f == aVar.f257337f && this.f257335d == aVar.f257335d;
    }

    public int hashCode() {
        long j = this.f257334c;
        long j2 = this.f257333b;
        long j3 = this.f257339h;
        long j4 = this.f257338g;
        int hashCode = (((((((((((((int) (j ^ (j >>> 32))) + 31) * 31) + this.f257332a) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.f257336e)) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        int i = this.f257337f ? 1231 : 1237;
        long j5 = this.f257335d;
        return ((hashCode + i) * 31) + ((int) (j5 ^ (j5 >>> 32)));
    }
}
