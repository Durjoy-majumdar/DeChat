package al1;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;

/* renamed from: al1.b */
public final class C0079b {

    /* renamed from: a */
    public int f489a;

    /* renamed from: b */
    public int f490b;

    /* renamed from: c */
    public long f491c;

    /* renamed from: d */
    public int f492d;

    /* renamed from: e */
    public long f493e;

    /* renamed from: f */
    public int f494f;

    /* renamed from: g */
    public int f495g;

    /* renamed from: h */
    public long f496h;

    /* renamed from: i */
    public int f497i;

    /* renamed from: j */
    public final LinkedList<FinderJumpInfo> f498j;

    /* renamed from: k */
    public int f499k;

    /* renamed from: l */
    public final FinderJumpInfo f500l;

    /* renamed from: m */
    public final int f501m;

    /* renamed from: n */
    public final FinderJumpInfo f502n;

    public C0079b() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, (LinkedList) null, 0, (FinderJumpInfo) null, 0, (FinderJumpInfo) null, 16383, (C8480h) null);
    }

    public C0079b(int i, int i2, long j, int i3, long j2, int i4, int i5, long j3, int i6, LinkedList<FinderJumpInfo> linkedList, int i7, FinderJumpInfo finderJumpInfo, int i8, FinderJumpInfo finderJumpInfo2) {
        LinkedList<FinderJumpInfo> linkedList2 = linkedList;
        C87412m.m108594g(linkedList2, "jumpInfos");
        this.f489a = i;
        this.f490b = i2;
        this.f491c = j;
        this.f492d = i3;
        this.f493e = j2;
        this.f494f = i4;
        this.f495g = i5;
        this.f496h = j3;
        this.f497i = i6;
        this.f498j = linkedList2;
        this.f499k = i7;
        this.f500l = finderJumpInfo;
        this.f501m = i8;
        this.f502n = finderJumpInfo2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0079b)) {
            return false;
        }
        C0079b bVar = (C0079b) obj;
        return this.f489a == bVar.f489a && this.f490b == bVar.f490b && this.f491c == bVar.f491c && this.f492d == bVar.f492d && this.f493e == bVar.f493e && this.f494f == bVar.f494f && this.f495g == bVar.f495g && this.f496h == bVar.f496h && this.f497i == bVar.f497i && C87412m.m108589b(this.f498j, bVar.f498j) && this.f499k == bVar.f499k && C87412m.m108589b(this.f500l, bVar.f500l) && this.f501m == bVar.f501m && C87412m.m108589b(this.f502n, bVar.f502n);
    }

    public int hashCode() {
        long j = this.f491c;
        long j2 = this.f493e;
        long j3 = this.f496h;
        int hashCode = ((((((((((((((((((((this.f489a * 31) + this.f490b) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f492d) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f494f) * 31) + this.f495g) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f497i) * 31) + this.f498j.hashCode()) * 31) + this.f499k) * 31;
        FinderJumpInfo finderJumpInfo = this.f500l;
        int i = 0;
        int hashCode2 = (((hashCode + (finderJumpInfo == null ? 0 : finderJumpInfo.hashCode())) * 31) + this.f501m) * 31;
        FinderJumpInfo finderJumpInfo2 = this.f502n;
        if (finderJumpInfo2 != null) {
            i = finderJumpInfo2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "AnchorFinishInfo(duration=" + this.f489a + ", audienceNum=" + this.f490b + ", likeCount=" + this.f491c + ", newFans=" + this.f492d + ", wecoinHot=" + this.f493e + ", maxOnlineCnt=" + this.f494f + ", avgDuration=" + this.f495g + ", totalGift=" + this.f496h + ", bizLiveNewFansNum=" + this.f497i + ",replayPrivilege:" + this.f499k + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C0079b(int r19, int r20, long r21, int r23, long r24, int r26, int r27, long r28, int r30, java.util.LinkedList r31, int r32, com.tencent.p014mm.protocal.protobuf.FinderJumpInfo r33, int r34, com.tencent.p014mm.protocal.protobuf.FinderJumpInfo r35, int r36, gy3.C8480h r37) {
        /*
            r18 = this;
            r0 = r36
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r19
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r20
        L_0x0012:
            r4 = r0 & 4
            r5 = 0
            if (r4 == 0) goto L_0x001a
            r7 = r5
            goto L_0x001c
        L_0x001a:
            r7 = r21
        L_0x001c:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0022
            r4 = 0
            goto L_0x0024
        L_0x0022:
            r4 = r23
        L_0x0024:
            r9 = r0 & 16
            if (r9 == 0) goto L_0x002a
            r9 = r5
            goto L_0x002c
        L_0x002a:
            r9 = r24
        L_0x002c:
            r11 = r0 & 32
            if (r11 == 0) goto L_0x0032
            r11 = 0
            goto L_0x0034
        L_0x0032:
            r11 = r26
        L_0x0034:
            r12 = r0 & 64
            if (r12 == 0) goto L_0x003a
            r12 = 0
            goto L_0x003c
        L_0x003a:
            r12 = r27
        L_0x003c:
            r13 = r0 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r5 = r28
        L_0x0043:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0049
            r13 = 0
            goto L_0x004b
        L_0x0049:
            r13 = r30
        L_0x004b:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x0055
            java.util.LinkedList r14 = new java.util.LinkedList
            r14.<init>()
            goto L_0x0057
        L_0x0055:
            r14 = r31
        L_0x0057:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x005d
            r15 = 0
            goto L_0x005f
        L_0x005d:
            r15 = r32
        L_0x005f:
            r2 = r0 & 2048(0x800, float:2.87E-42)
            r16 = 0
            if (r2 == 0) goto L_0x0068
            r2 = r16
            goto L_0x006a
        L_0x0068:
            r2 = r33
        L_0x006a:
            r17 = r2
            r2 = r0 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x0072
            r2 = 0
            goto L_0x0074
        L_0x0072:
            r2 = r34
        L_0x0074:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            r16 = r35
        L_0x007b:
            r19 = r18
            r20 = r1
            r21 = r3
            r22 = r7
            r24 = r4
            r25 = r9
            r27 = r11
            r28 = r12
            r29 = r5
            r31 = r13
            r32 = r14
            r33 = r15
            r34 = r17
            r35 = r2
            r36 = r16
            r19.<init>(r20, r21, r22, r24, r25, r27, r28, r29, r31, r32, r33, r34, r35, r36)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: al1.C0079b.<init>(int, int, long, int, long, int, int, long, int, java.util.LinkedList, int, com.tencent.mm.protocal.protobuf.FinderJumpInfo, int, com.tencent.mm.protocal.protobuf.FinderJumpInfo, int, gy3.h):void");
    }
}
