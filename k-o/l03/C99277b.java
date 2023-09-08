package l03;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: l03.b */
public final class C99277b implements C21387c, C99276a {

    /* renamed from: a */
    public final long f291098a;

    /* renamed from: b */
    public long f291099b;

    /* renamed from: c */
    public long f291100c;

    /* renamed from: d */
    public long f291101d;

    /* renamed from: e */
    public int f291102e;

    /* renamed from: f */
    public long f291103f;

    /* renamed from: g */
    public long f291104g;

    /* renamed from: h */
    public long f291105h;

    /* renamed from: i */
    public int f291106i;

    /* renamed from: j */
    public long f291107j;

    /* renamed from: k */
    public long f291108k;

    /* renamed from: l */
    public long f291109l;

    /* renamed from: m */
    public int f291110m;

    /* renamed from: n */
    public int f291111n;

    /* renamed from: o */
    public boolean f291112o;

    /* renamed from: l03.b$a */
    public static final class C99278a {

        /* renamed from: a */
        public final int f291113a;

        /* renamed from: b */
        public final int f291114b;

        /* renamed from: c */
        public final int f291115c;

        /* renamed from: d */
        public final int f291116d;

        /* renamed from: e */
        public final int f291117e;

        /* renamed from: f */
        public final int f291118f;

        /* renamed from: g */
        public final int f291119g;

        /* renamed from: h */
        public final long f291120h;

        /* renamed from: i */
        public final int f291121i;

        /* renamed from: j */
        public final int f291122j;

        /* renamed from: k */
        public final boolean f291123k;

        public C99278a(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, int i9, boolean z) {
            this.f291113a = i;
            this.f291114b = i2;
            this.f291115c = i3;
            this.f291116d = i4;
            this.f291117e = i5;
            this.f291118f = i6;
            this.f291119g = i7;
            this.f291120h = j;
            this.f291121i = i8;
            this.f291122j = i9;
            this.f291123k = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C99278a)) {
                return false;
            }
            C99278a aVar = (C99278a) obj;
            return this.f291113a == aVar.f291113a && this.f291114b == aVar.f291114b && this.f291115c == aVar.f291115c && this.f291116d == aVar.f291116d && this.f291117e == aVar.f291117e && this.f291118f == aVar.f291118f && this.f291119g == aVar.f291119g && this.f291120h == aVar.f291120h && this.f291121i == aVar.f291121i && this.f291122j == aVar.f291122j && this.f291123k == aVar.f291123k;
        }

        public int hashCode() {
            long j = this.f291120h;
            int i = ((((((((((((((((((this.f291113a * 31) + this.f291114b) * 31) + this.f291115c) * 31) + this.f291116d) * 31) + this.f291117e) * 31) + this.f291118f) * 31) + this.f291119g) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f291121i) * 31) + this.f291122j) * 31;
            boolean z = this.f291123k;
            if (z) {
                z = true;
            }
            return i + (z ? 1 : 0);
        }

        public String toString() {
            return "Measurement(playDuration=" + this.f291113a + ", startWaitTime=" + this.f291114b + ", moovWaitTime=" + this.f291115c + ", bufferingCount=" + this.f291116d + ", avgBufferingDuration=" + this.f291117e + ", pageTime=" + this.f291118f + ", errorCode=" + this.f291119g + ", timeBeforeFirstFrame=" + this.f291120h + ", seekFlags=" + this.f291121i + ", maxProgressMilliseconds=" + this.f291122j + ", completed=" + this.f291123k + ')';
        }
    }

    public C99277b(long j) {
        this.f291098a = j;
    }

    /* renamed from: a */
    public void mo33480a() {
        long j = this.f291100c;
        if (j > 0) {
            this.f291101d += Util.milliSecondsToNow(j);
            this.f291100c = 0;
        }
        this.f291112o = true;
    }

    /* renamed from: b */
    public void mo135882b() {
        this.f291109l = Util.nowMilliSecond();
    }

    /* renamed from: c */
    public void mo135883c(long j) {
    }

    /* renamed from: d */
    public void mo33481d(int i) {
        this.f291102e = i;
        long j = this.f291100c;
        if (j > 0) {
            this.f291101d += Util.milliSecondsToNow(j);
            this.f291100c = 0;
        }
    }

    /* renamed from: e */
    public void mo33482e(int i, int i2) {
        Log.m105924i("MicroMsg.CdnPlayerReporter", "seek to " + i2);
        if (i2 != 0) {
            if (i2 < i) {
                this.f291110m |= 2;
            } else if (i2 > i) {
                this.f291110m |= 1;
            }
        }
        C115669n.INSTANCE.idkeyStat(354, 4, 1, false);
    }

    /* renamed from: f */
    public void mo33483f() {
        if (this.f291103f > 0) {
            this.f291103f = 0;
            this.f291104g = Util.milliSecondsToNow(0);
        }
    }

    /* renamed from: g */
    public void mo135884g() {
    }

    /* renamed from: h */
    public void mo135885h() {
    }

    /* renamed from: i */
    public void mo135886i(int i) {
    }

    /* renamed from: j */
    public void mo33484j() {
        this.f291107j = Util.nowMilliSecond();
    }

    /* renamed from: k */
    public void mo33485k(int i, long j, long j2) {
    }

    /* renamed from: l */
    public void mo135887l() {
    }

    /* renamed from: m */
    public void mo135888m(long j) {
    }

    /* renamed from: n */
    public void mo33486n() {
        this.f291106i++;
        this.f291103f = Util.nowMilliSecond();
    }

    /* renamed from: o */
    public void mo135889o(long j, long j2) {
        this.f291108k = Util.nowMilliSecond();
    }

    public void onPause() {
        long j = this.f291100c;
        if (j > 0) {
            this.f291101d += Util.milliSecondsToNow(j);
            this.f291100c = 0;
        }
    }

    public void onStart() {
        long nowMilliSecond = Util.nowMilliSecond();
        this.f291100c = nowMilliSecond;
        if (this.f291099b == 0) {
            this.f291099b = nowMilliSecond;
        }
    }

    public void onStop() {
        long j = this.f291100c;
        if (j > 0) {
            this.f291101d += Util.milliSecondsToNow(j);
            this.f291100c = 0;
        }
        this.f291105h = Util.nowMilliSecond();
    }

    /* renamed from: p */
    public void mo135890p() {
    }

    /* renamed from: q */
    public void mo33490q(boolean z, String str) {
    }

    /* renamed from: r */
    public void mo135891r() {
    }

    /* renamed from: s */
    public void mo135892s() {
    }

    /* renamed from: t */
    public void mo135893t() {
    }

    /* renamed from: u */
    public void mo135894u() {
    }

    /* renamed from: v */
    public void mo33491v(int i) {
        this.f291111n = Math.max(this.f291111n, i);
    }

    /* renamed from: w */
    public void mo33492w() {
    }

    /* renamed from: x */
    public void mo135895x() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x008c  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final l03.C99277b.C99278a mo138685y() {
        /*
            r22 = this;
            r0 = r22
            long r1 = r0.f291101d
            r3 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r3
            long r1 = r1 / r3
            long r3 = r0.f291099b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0016
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.f291099b = r3
        L_0x0016:
            long r3 = r0.f291099b
            long r7 = r0.f291109l
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x0020
            r7 = r5
            goto L_0x0022
        L_0x0020:
            long r7 = r0.f291108k
        L_0x0022:
            long r3 = r3 - r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0028
            r3 = r5
        L_0x0028:
            long r7 = r0.f291108k
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x0032
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
        L_0x0032:
            long r9 = r0.f291109l
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 > 0) goto L_0x003a
            r9 = r5
            goto L_0x003c
        L_0x003a:
            long r9 = r0.f291108k
        L_0x003c:
            long r7 = r7 - r9
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x0042
            r7 = r5
        L_0x0042:
            int r13 = r0.f291106i
            if (r13 <= 0) goto L_0x0062
            long r9 = r0.f291104g
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x005b
            long r11 = r0.f291103f
            int r14 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r14 <= 0) goto L_0x005b
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r11)
            int r12 = (int) r11
            long r11 = (long) r12
            long r9 = r9 + r11
            r0.f291104g = r9
        L_0x005b:
            long r9 = r0.f291104g
            long r11 = (long) r13
            long r9 = r9 / r11
            int r10 = (int) r9
            r14 = r10
            goto L_0x0064
        L_0x0062:
            r9 = 0
            r14 = 0
        L_0x0064:
            long r9 = r0.f291105h
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 > 0) goto L_0x0070
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.f291105h = r9
        L_0x0070:
            long r9 = r0.f291105h
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 <= 0) goto L_0x0082
            long r11 = r0.f291098a
            int r15 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r15 < 0) goto L_0x0082
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 <= 0) goto L_0x0082
            long r9 = r9 - r11
            goto L_0x0083
        L_0x0082:
            r9 = r5
        L_0x0083:
            int r15 = r0.f291102e
            long r11 = r0.f291109l
            int r16 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r16 <= 0) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            long r11 = r0.f291099b
        L_0x008e:
            l03.b$a r5 = new l03.b$a
            int r2 = (int) r1
            int r1 = (int) r3
            int r3 = (int) r7
            int r4 = (int) r9
            long r6 = r0.f291107j
            long r17 = r6 - r11
            int r6 = r0.f291110m
            int r7 = r0.f291111n
            boolean r8 = r0.f291112o
            r9 = r5
            r10 = r2
            r11 = r1
            r12 = r3
            r1 = r15
            r15 = r4
            r16 = r1
            r19 = r6
            r20 = r7
            r21 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l03.C99277b.mo138685y():l03.b$a");
    }
}
