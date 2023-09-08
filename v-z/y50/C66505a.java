package y50;

import gy3.C87412m;
import java.util.Arrays;

/* renamed from: y50.a */
public final class C66505a {

    /* renamed from: a */
    public final long f191308a;

    /* renamed from: b */
    public final String f191309b;

    /* renamed from: c */
    public final String f191310c;

    /* renamed from: d */
    public final int f191311d;

    /* renamed from: e */
    public final int f191312e;

    /* renamed from: f */
    public final int f191313f;

    /* renamed from: g */
    public final String f191314g;

    /* renamed from: h */
    public final String f191315h;

    /* renamed from: i */
    public final long f191316i;

    /* renamed from: j */
    public final byte[] f191317j;

    /* renamed from: k */
    public final Integer f191318k;

    /* renamed from: l */
    public final long f191319l;

    /* renamed from: m */
    public final String f191320m;

    /* renamed from: n */
    public final boolean f191321n;

    /* renamed from: o */
    public final boolean f191322o;

    public C66505a(long j, String str, String str2, int i, int i2, int i3, String str3, String str4, long j2, byte[] bArr, Integer num, long j3, String str5, boolean z, boolean z2) {
        this.f191308a = j;
        this.f191309b = str;
        this.f191310c = str2;
        this.f191311d = i;
        this.f191312e = i2;
        this.f191313f = i3;
        this.f191314g = str3;
        this.f191315h = str4;
        this.f191316i = j2;
        this.f191317j = bArr;
        this.f191318k = num;
        this.f191319l = j3;
        this.f191320m = str5;
        this.f191321n = z;
        this.f191322o = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66505a)) {
            return false;
        }
        C66505a aVar = (C66505a) obj;
        return this.f191308a == aVar.f191308a && C87412m.m108589b(this.f191309b, aVar.f191309b) && C87412m.m108589b(this.f191310c, aVar.f191310c) && this.f191311d == aVar.f191311d && this.f191312e == aVar.f191312e && this.f191313f == aVar.f191313f && C87412m.m108589b(this.f191314g, aVar.f191314g) && C87412m.m108589b(this.f191315h, aVar.f191315h) && this.f191316i == aVar.f191316i && C87412m.m108589b(this.f191317j, aVar.f191317j) && C87412m.m108589b(this.f191318k, aVar.f191318k) && this.f191319l == aVar.f191319l && C87412m.m108589b(this.f191320m, aVar.f191320m) && this.f191321n == aVar.f191321n && this.f191322o == aVar.f191322o;
    }

    public int hashCode() {
        long j = this.f191308a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f191309b;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f191310c;
        int hashCode2 = (((((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f191311d) * 31) + this.f191312e) * 31) + this.f191313f) * 31;
        String str3 = this.f191314g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f191315h;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        long j2 = this.f191316i;
        int i3 = (((hashCode3 + hashCode4) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        byte[] bArr = this.f191317j;
        int hashCode5 = (i3 + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        Integer num = this.f191318k;
        int hashCode6 = num == null ? 0 : num.hashCode();
        long j3 = this.f191319l;
        int i4 = (((hashCode5 + hashCode6) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str5 = this.f191320m;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        int i5 = (i4 + i2) * 31;
        boolean z = this.f191321n;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i6 = (i5 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f191322o;
        if (!z3) {
            z2 = z3;
        }
        return i6 + (z2 ? 1 : 0);
    }

    public String toString() {
        return "AcceptLiveMicInfo(liveId=" + this.f191308a + ", micId=" + this.f191309b + ", userId=" + this.f191310c + ", sdkAppId=" + this.f191311d + ", roleId=" + this.f191312e + ", sdkLiveId=" + this.f191313f + ", userSig=" + this.f191314g + ", privateMapKey=" + this.f191315h + ", expireForPmk=" + this.f191316i + ", sdkParam=" + Arrays.toString(this.f191317j) + ", micType=" + this.f191318k + ", seq=" + this.f191319l + ", pkSign=" + this.f191320m + ", isAnchorPk=" + this.f191321n + ", isRandomMatch=" + this.f191322o + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C66505a(long r23, java.lang.String r25, java.lang.String r26, int r27, int r28, int r29, java.lang.String r30, java.lang.String r31, long r32, byte[] r34, java.lang.Integer r35, long r36, java.lang.String r38, boolean r39, boolean r40, int r41, gy3.C8480h r42) {
        /*
            r22 = this;
            r0 = r41
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r1 == 0) goto L_0x000e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r16 = r1
            goto L_0x0010
        L_0x000e:
            r16 = r35
        L_0x0010:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0019
            r3 = 0
            r17 = r3
            goto L_0x001b
        L_0x0019:
            r17 = r36
        L_0x001b:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0023
            r1 = 0
            r19 = r1
            goto L_0x0025
        L_0x0023:
            r19 = r38
        L_0x0025:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x002c
            r20 = 0
            goto L_0x002e
        L_0x002c:
            r20 = r39
        L_0x002e:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0035
            r21 = 0
            goto L_0x0037
        L_0x0035:
            r21 = r40
        L_0x0037:
            r3 = r22
            r4 = r23
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            r15 = r34
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y50.C66505a.<init>(long, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, long, byte[], java.lang.Integer, long, java.lang.String, boolean, boolean, int, gy3.h):void");
    }
}
