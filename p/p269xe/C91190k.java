package p269xe;

import android.os.Process;
import com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner;
import com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: xe.k */
public final class C91190k {

    /* renamed from: a */
    public static final C26537a f261451a = new C26537a((C8480h) null);

    /* renamed from: xe.k$a */
    public static final class C26537a {
        public C26537a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo53491a(C26538b bVar) {
            C87412m.m108594g(bVar, "data");
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[33];
            objArr[0] = Integer.valueOf(bVar.f73846a);
            objArr[1] = bVar.f73847b;
            objArr[2] = Integer.valueOf(bVar.f73848c);
            objArr[3] = Integer.valueOf(bVar.f73849d);
            objArr[4] = Long.valueOf(bVar.f73850e);
            objArr[5] = Long.valueOf(bVar.f73851f);
            objArr[6] = Long.valueOf(bVar.f73852g);
            objArr[7] = Integer.valueOf(bVar.f73853h);
            objArr[8] = bVar.f73854i;
            objArr[9] = Integer.valueOf(bVar.f73855j);
            objArr[10] = bVar.f73856k;
            objArr[11] = Integer.valueOf(bVar.f73857l);
            objArr[12] = bVar.f73858m;
            objArr[13] = Long.valueOf(bVar.f73859n);
            objArr[14] = Long.valueOf(bVar.f73860o);
            objArr[15] = Long.valueOf(bVar.f73861p);
            objArr[16] = bVar.f73862q;
            objArr[17] = bVar.f73863r;
            objArr[18] = Integer.valueOf(bVar.f73864s);
            objArr[19] = Integer.valueOf(bVar.f73865t);
            objArr[20] = Integer.valueOf(bVar.f73866u);
            objArr[21] = Integer.valueOf(bVar.f73867v);
            objArr[22] = Integer.valueOf(bVar.f73868w);
            objArr[23] = Long.valueOf(bVar.f73869x);
            objArr[24] = bVar.f73870y;
            objArr[25] = bVar.f73871z;
            String str = bVar.f73839A;
            if (str == null) {
                str = "";
            }
            objArr[26] = str;
            objArr[27] = Integer.valueOf(bVar.f73840B);
            objArr[28] = Integer.valueOf(bVar.f73841C);
            objArr[29] = bVar.f73842D;
            objArr[30] = bVar.f73843E;
            objArr[31] = Integer.valueOf(bVar.f73844F);
            objArr[32] = Integer.valueOf(bVar.f73845G);
            nVar.mo160131h(24556, objArr);
        }
    }

    /* renamed from: xe.k$b */
    public static final class C26538b {

        /* renamed from: A */
        public final String f73839A;

        /* renamed from: B */
        public final int f73840B;

        /* renamed from: C */
        public final int f73841C;

        /* renamed from: D */
        public final String f73842D;

        /* renamed from: E */
        public final String f73843E;

        /* renamed from: F */
        public final int f73844F;

        /* renamed from: G */
        public final int f73845G;

        /* renamed from: a */
        public final int f73846a;

        /* renamed from: b */
        public final String f73847b;

        /* renamed from: c */
        public final int f73848c;

        /* renamed from: d */
        public final int f73849d;

        /* renamed from: e */
        public final long f73850e;

        /* renamed from: f */
        public final long f73851f;

        /* renamed from: g */
        public final long f73852g;

        /* renamed from: h */
        public final int f73853h;

        /* renamed from: i */
        public final String f73854i;

        /* renamed from: j */
        public final int f73855j;

        /* renamed from: k */
        public final String f73856k;

        /* renamed from: l */
        public final int f73857l;

        /* renamed from: m */
        public final String f73858m;

        /* renamed from: n */
        public final long f73859n;

        /* renamed from: o */
        public final long f73860o;

        /* renamed from: p */
        public final long f73861p;

        /* renamed from: q */
        public final String f73862q;

        /* renamed from: r */
        public final String f73863r;

        /* renamed from: s */
        public final int f73864s;

        /* renamed from: t */
        public final int f73865t;

        /* renamed from: u */
        public final int f73866u;

        /* renamed from: v */
        public final int f73867v;

        /* renamed from: w */
        public final int f73868w;

        /* renamed from: x */
        public final long f73869x;

        /* renamed from: y */
        public final String f73870y;

        /* renamed from: z */
        public final String f73871z;

        public C26538b() {
            this(0, (String) null, 0, 0, 0, 0, 0, 0, (String) null, 0, (String) null, 0, (String) null, 0, 0, 0, (String) null, (String) null, 0, 0, 0, 0, 0, 0, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, 0, 0, -1, 1, (C8480h) null);
        }

        public C26538b(int i, String str, int i2, int i3, long j, long j2, long j3, int i4, String str2, int i5, String str3, int i6, String str4, long j4, long j5, long j6, String str5, String str6, int i7, int i8, int i9, int i15, int i16, long j7, String str7, String str8, String str9, int i17, int i18, String str10, String str11, int i19, int i25, int i26, int i27, C8480h hVar) {
            String str12;
            int i28;
            int i29;
            int i35;
            String str13;
            long j8;
            String str14;
            String str15;
            String str16;
            int i36 = i26;
            int i37 = (i36 & 1) != 0 ? 0 : i;
            if ((i36 & 2) != 0) {
                str12 = MMApplicationContext.getProcessName();
                C87412m.m108593f(str12, "getProcessName()");
            } else {
                str12 = str;
            }
            if ((i36 & 4) != 0) {
                ProcessSupervisor.f235421k.getClass();
                i28 = ProcessSupervisor.f235417g.active();
            } else {
                i28 = i2;
            }
            if ((i36 & 8) != 0) {
                ProcessUILifecycleOwner.f235399x.getClass();
                i29 = ProcessUILifecycleOwner.f235396u;
            } else {
                i29 = i3;
            }
            long j9 = (i36 & 16) != 0 ? 0 : j;
            long j15 = (i36 & 32) != 0 ? 0 : j2;
            long j16 = (i36 & 64) != 0 ? 0 : j3;
            int i38 = (i36 & 128) != 0 ? 0 : i4;
            String str17 = (i36 & 256) != 0 ? "" : str2;
            int i39 = (i36 & 512) != 0 ? 0 : i5;
            String str18 = (i36 & 1024) != 0 ? "" : str3;
            int i44 = i39;
            int i45 = (i36 & 2048) != 0 ? 0 : i6;
            String str19 = (i36 & 4096) != 0 ? "" : str4;
            int i46 = i38;
            long j17 = (i36 & 8192) != 0 ? 0 : j4;
            long j18 = (i36 & 16384) != 0 ? 0 : j5;
            long j19 = (32768 & i36) != 0 ? 0 : j6;
            String str20 = (65536 & i36) != 0 ? "" : str5;
            long j25 = j16;
            String str21 = (i36 & 131072) != 0 ? "" : str6;
            int i47 = (262144 & i36) != 0 ? 0 : i7;
            int i48 = (i36 & 524288) != 0 ? 0 : i8;
            int i49 = (i36 & 1048576) != 0 ? 0 : i9;
            int i54 = (i36 & 2097152) != 0 ? 0 : i15;
            boolean z = (i36 & 4194304) != 0 ? BuildInfo.IS_ARM64 : i16;
            long j26 = (i36 & 8388608) != 0 ? 0 : j7;
            if ((i36 & TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0) {
                i35 = i47;
                str13 = "";
            } else {
                i35 = i47;
                str13 = str7;
            }
            long j27 = j15;
            String str22 = (i36 & TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0 ? "" : str8;
            String str23 = (67108864 & i36) != 0 ? "" : str9;
            int i55 = (i36 & 134217728) != 0 ? 0 : i17;
            int i56 = (i36 & 268435456) != 0 ? 0 : i18;
            if ((i36 & 536870912) != 0) {
                str14 = str23;
                str15 = BuildInfo.BUILD_TAG;
                j8 = j9;
                C87412m.m108593f(str15, "BUILD_TAG");
            } else {
                j8 = j9;
                str14 = str23;
                str15 = str10;
            }
            if ((1073741824 & i36) != 0) {
                str16 = BuildInfo.REV;
                C87412m.m108593f(str16, "REV");
            } else {
                str16 = str11;
            }
            int i57 = (i36 & Integer.MIN_VALUE) != 0 ? 0 : i19;
            int myPid = (i27 & 1) != 0 ? Process.myPid() : i25;
            C87412m.m108594g(str12, "process");
            C87412m.m108594g(str17, "debugPssDetailK");
            C87412m.m108594g(str18, "amsPssDetailK");
            C87412m.m108594g(str19, "allProcessPssDetailK");
            C87412m.m108594g(str20, "recentActivity");
            C87412m.m108594g(str21, "leakActivity");
            C87412m.m108594g(str13, "systemMemInfo");
            C87412m.m108594g(str22, "processState");
            C87412m.m108594g(str15, "buildTag");
            C87412m.m108594g(str16, "buildRevision");
            this.f73846a = i37;
            this.f73847b = str12;
            this.f73848c = i28;
            this.f73849d = i29;
            this.f73850e = j8;
            this.f73851f = j27;
            this.f73852g = j25;
            this.f73853h = i46;
            this.f73854i = str17;
            this.f73855j = i44;
            this.f73856k = str18;
            this.f73857l = i45;
            this.f73858m = str19;
            this.f73859n = j17;
            this.f73860o = j18;
            this.f73861p = j19;
            this.f73862q = str20;
            this.f73863r = str21;
            this.f73864s = i35;
            this.f73865t = i48;
            this.f73866u = i49;
            this.f73867v = i54;
            this.f73868w = z;
            this.f73869x = j26;
            this.f73870y = str13;
            this.f73871z = str22;
            this.f73839A = str14;
            this.f73840B = i55;
            this.f73841C = i56;
            this.f73842D = str15;
            this.f73843E = str16;
            this.f73844F = i57;
            this.f73845G = myPid;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26538b)) {
                return false;
            }
            C26538b bVar = (C26538b) obj;
            return this.f73846a == bVar.f73846a && C87412m.m108589b(this.f73847b, bVar.f73847b) && this.f73848c == bVar.f73848c && this.f73849d == bVar.f73849d && this.f73850e == bVar.f73850e && this.f73851f == bVar.f73851f && this.f73852g == bVar.f73852g && this.f73853h == bVar.f73853h && C87412m.m108589b(this.f73854i, bVar.f73854i) && this.f73855j == bVar.f73855j && C87412m.m108589b(this.f73856k, bVar.f73856k) && this.f73857l == bVar.f73857l && C87412m.m108589b(this.f73858m, bVar.f73858m) && this.f73859n == bVar.f73859n && this.f73860o == bVar.f73860o && this.f73861p == bVar.f73861p && C87412m.m108589b(this.f73862q, bVar.f73862q) && C87412m.m108589b(this.f73863r, bVar.f73863r) && this.f73864s == bVar.f73864s && this.f73865t == bVar.f73865t && this.f73866u == bVar.f73866u && this.f73867v == bVar.f73867v && this.f73868w == bVar.f73868w && this.f73869x == bVar.f73869x && C87412m.m108589b(this.f73870y, bVar.f73870y) && C87412m.m108589b(this.f73871z, bVar.f73871z) && C87412m.m108589b(this.f73839A, bVar.f73839A) && this.f73840B == bVar.f73840B && this.f73841C == bVar.f73841C && C87412m.m108589b(this.f73842D, bVar.f73842D) && C87412m.m108589b(this.f73843E, bVar.f73843E) && this.f73844F == bVar.f73844F && this.f73845G == bVar.f73845G;
        }

        public int hashCode() {
            long j = this.f73850e;
            long j2 = this.f73851f;
            long j3 = this.f73852g;
            long j4 = this.f73859n;
            long j5 = this.f73860o;
            long j6 = this.f73861p;
            long j7 = this.f73869x;
            int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((this.f73846a * 31) + this.f73847b.hashCode()) * 31) + this.f73848c) * 31) + this.f73849d) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f73853h) * 31) + this.f73854i.hashCode()) * 31) + this.f73855j) * 31) + this.f73856k.hashCode()) * 31) + this.f73857l) * 31) + this.f73858m.hashCode()) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.f73862q.hashCode()) * 31) + this.f73863r.hashCode()) * 31) + this.f73864s) * 31) + this.f73865t) * 31) + this.f73866u) * 31) + this.f73867v) * 31) + this.f73868w) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + this.f73870y.hashCode()) * 31) + this.f73871z.hashCode()) * 31;
            String str = this.f73839A;
            return ((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f73840B) * 31) + this.f73841C) * 31) + this.f73842D.hashCode()) * 31) + this.f73843E.hashCode()) * 31) + this.f73844F) * 31) + this.f73845G;
        }

        public String toString() {
            return "Data(type=" + this.f73846a + ", process='" + this.f73847b + "', appForeground=" + this.f73848c + ", processForeground=" + this.f73849d + ", javaHeapByte=" + this.f73850e + ", nativeHeapByte=" + this.f73851f + ", vmSizeK=" + this.f73852g + ", debugPssK=" + this.f73853h + ", debugPssDetailK='" + this.f73854i + "', amsPssK=" + this.f73855j + ", amsPssDetailK='" + this.f73856k + "', allProcessPssSumK=" + this.f73857l + ", allProcessPssDetailK='" + this.f73858m + "', vmRss=" + this.f73859n + ", vmSwap=" + this.f73860o + ", threads=" + this.f73861p + ", recentActivity='" + this.f73862q + "', leakActivity='" + this.f73863r + "', activityLeakAnalyseEnable=" + this.f73864s + ", hasHprof=" + this.f73865t + ", memHookEnable=" + this.f73866u + ", hasSmaps=" + this.f73867v + ", is64bit=" + this.f73868w + ", bgDuration=" + this.f73869x + ", systemMemInfo='" + this.f73870y + "', processState='" + this.f73871z + "', extra=" + this.f73839A + ", debugGraphicPssK=" + this.f73840B + ", amsGraphicPssK=" + this.f73841C + ", buildTag='" + this.f73842D + "', buildRevision='" + this.f73843E + "', hasDumpsysMemInfo=" + this.f73844F + ", pid=" + this.f73845G + ')';
        }
    }
}
