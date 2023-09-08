package w10;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: w10.b */
public final class C53065b {

    /* renamed from: a */
    public final String f148104a;

    /* renamed from: b */
    public final long f148105b;

    /* renamed from: c */
    public final long f148106c;

    /* renamed from: d */
    public final int f148107d;

    /* renamed from: e */
    public final int f148108e;

    /* renamed from: f */
    public final int f148109f;

    /* renamed from: g */
    public final int f148110g;

    /* renamed from: h */
    public final int f148111h;

    /* renamed from: i */
    public final String f148112i;

    public C53065b() {
        this((String) null, 0, 0, 0, 0, 0, 0, 0, (String) null, 511, (C8480h) null);
    }

    public C53065b(String str, long j, long j2, int i, int i2, int i3, int i4, int i5, String str2) {
        this.f148104a = str;
        this.f148105b = j;
        this.f148106c = j2;
        this.f148107d = i;
        this.f148108e = i2;
        this.f148109f = i3;
        this.f148110g = i4;
        this.f148111h = i5;
        this.f148112i = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53065b)) {
            return false;
        }
        C53065b bVar = (C53065b) obj;
        return C87412m.m108589b(this.f148104a, bVar.f148104a) && this.f148105b == bVar.f148105b && this.f148106c == bVar.f148106c && this.f148107d == bVar.f148107d && this.f148108e == bVar.f148108e && this.f148109f == bVar.f148109f && this.f148110g == bVar.f148110g && this.f148111h == bVar.f148111h && C87412m.m108589b(this.f148112i, bVar.f148112i);
    }

    public int hashCode() {
        String str = this.f148104a;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f148105b;
        long j2 = this.f148106c;
        int i2 = ((((((((((((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f148107d) * 31) + this.f148108e) * 31) + this.f148109f) * 31) + this.f148110g) * 31) + this.f148111h) * 31;
        String str2 = this.f148112i;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "MiniGameVideoReportInfo(appId=" + this.f148104a + ", uiArea=" + this.f148105b + ", positionId=" + this.f148106c + ", actionId=" + this.f148107d + ", opType=" + this.f148108e + ", actionStatus=" + this.f148109f + ", miniGameVersion=" + this.f148110g + ", appState=" + this.f148111h + ", extInfo=" + this.f148112i + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C53065b(java.lang.String r14, long r15, long r17, int r19, int r20, int r21, int r22, int r23, java.lang.String r24, int r25, gy3.C8480h r26) {
        /*
            r13 = this;
            r0 = r25
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r14
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = 601(0x259, double:2.97E-321)
            goto L_0x0012
        L_0x0011:
            r3 = r15
        L_0x0012:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0019
            r5 = 0
            goto L_0x001b
        L_0x0019:
            r5 = r17
        L_0x001b:
            r7 = r0 & 8
            r8 = 0
            if (r7 == 0) goto L_0x0022
            r7 = 0
            goto L_0x0024
        L_0x0022:
            r7 = r19
        L_0x0024:
            r9 = r0 & 16
            if (r9 == 0) goto L_0x002a
            r9 = 0
            goto L_0x002c
        L_0x002a:
            r9 = r20
        L_0x002c:
            r10 = r0 & 32
            if (r10 == 0) goto L_0x0032
            r10 = 0
            goto L_0x0034
        L_0x0032:
            r10 = r21
        L_0x0034:
            r11 = r0 & 64
            if (r11 == 0) goto L_0x003a
            r11 = 0
            goto L_0x003c
        L_0x003a:
            r11 = r22
        L_0x003c:
            r12 = r0 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r8 = r23
        L_0x0043:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r2 = r24
        L_0x004a:
            r14 = r13
            r15 = r1
            r16 = r3
            r18 = r5
            r20 = r7
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r8
            r25 = r2
            r14.<init>(r15, r16, r18, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w10.C53065b.<init>(java.lang.String, long, long, int, int, int, int, int, java.lang.String, int, gy3.h):void");
    }
}
