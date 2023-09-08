package if3;

import gy3.C87412m;
import java.util.Arrays;

/* renamed from: if3.a */
public final class C98670a {

    /* renamed from: a */
    public final int f289301a;

    /* renamed from: b */
    public final String f289302b;

    /* renamed from: c */
    public final long f289303c;

    /* renamed from: d */
    public final String f289304d;

    /* renamed from: e */
    public final String f289305e;

    /* renamed from: f */
    public final int f289306f;

    /* renamed from: g */
    public final long f289307g;

    /* renamed from: h */
    public final byte[] f289308h;

    public C98670a(int i, String str, long j, String str2, String str3, int i2, long j2, byte[] bArr) {
        C87412m.m108594g(str, "workTagId");
        C87412m.m108594g(str2, "videoMixPath");
        C87412m.m108594g(str3, "thumbPath");
        this.f289301a = i;
        this.f289302b = str;
        this.f289303c = j;
        this.f289304d = str2;
        this.f289305e = str3;
        this.f289306f = i2;
        this.f289307g = j2;
        this.f289308h = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C98670a)) {
            return false;
        }
        C98670a aVar = (C98670a) obj;
        return this.f289301a == aVar.f289301a && C87412m.m108589b(this.f289302b, aVar.f289302b) && this.f289303c == aVar.f289303c && C87412m.m108589b(this.f289304d, aVar.f289304d) && C87412m.m108589b(this.f289305e, aVar.f289305e) && this.f289306f == aVar.f289306f && this.f289307g == aVar.f289307g && C87412m.m108589b(this.f289308h, aVar.f289308h);
    }

    public int hashCode() {
        long j = this.f289303c;
        long j2 = this.f289307g;
        int hashCode = ((((((((((((this.f289301a * 31) + this.f289302b.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f289304d.hashCode()) * 31) + this.f289305e.hashCode()) * 31) + this.f289306f) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        byte[] bArr = this.f289308h;
        return hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    public String toString() {
        return "BackgroundVideoBean(workType=" + this.f289301a + ", workTagId=" + this.f289302b + ", confirmRemuxTime=" + this.f289303c + ", videoMixPath=" + this.f289304d + ", thumbPath=" + this.f289305e + ", muxResult=" + this.f289306f + ", muxFinishTime=" + this.f289307g + ", extInfo=" + Arrays.toString(this.f289308h) + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C98670a(int r14, java.lang.String r15, long r16, java.lang.String r18, java.lang.String r19, int r20, long r21, byte[] r23, int r24, gy3.C8480h r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0009
            r1 = -1
            r9 = -1
            goto L_0x000b
        L_0x0009:
            r9 = r20
        L_0x000b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0013
            r1 = 0
            r10 = r1
            goto L_0x0015
        L_0x0013:
            r10 = r21
        L_0x0015:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x001c
            r0 = 0
            r12 = r0
            goto L_0x001e
        L_0x001c:
            r12 = r23
        L_0x001e:
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r7 = r18
            r8 = r19
            r2.<init>(r3, r4, r5, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: if3.C98670a.<init>(int, java.lang.String, long, java.lang.String, java.lang.String, int, long, byte[], int, gy3.h):void");
    }
}
