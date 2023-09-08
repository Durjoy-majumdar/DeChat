package dp1;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderFeedLoadingTimeExStruct;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C31543z5;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o40.C61926c;
import p933be.C113159b;
import p981ie.C117159b;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C64858yi1;
import te3.C90420iq;
import tf0.C64916p1;
import z04.C112551y;

/* renamed from: dp1.e0 */
public final class C20480e0 {

    /* renamed from: a */
    public static final C20480e0 f57583a = new C20480e0();

    /* renamed from: b */
    public static long f57584b;

    /* renamed from: c */
    public static boolean f57585c;

    /* renamed from: d */
    public static C55718s0 f57586d;

    /* renamed from: e */
    public static final ConcurrentHashMap<Integer, C20481a> f57587e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public static final ConcurrentHashMap<Integer, Long> f57588f = new ConcurrentHashMap<>();

    /* renamed from: g */
    public static final ConcurrentHashMap<Integer, C20481a> f57589g = new ConcurrentHashMap<>();

    /* renamed from: h */
    public static final HashSet<C20481a> f57590h = new HashSet<>();

    /* renamed from: dp1.e0$a */
    public static final class C20481a {

        /* renamed from: A */
        public String f57591A = "";

        /* renamed from: B */
        public String f57592B = "";

        /* renamed from: C */
        public long f57593C;

        /* renamed from: D */
        public long f57594D;

        /* renamed from: E */
        public long f57595E;

        /* renamed from: F */
        public long f57596F;

        /* renamed from: G */
        public int f57597G;

        /* renamed from: H */
        public long f57598H;

        /* renamed from: I */
        public long f57599I;

        /* renamed from: J */
        public long f57600J;

        /* renamed from: K */
        public long f57601K;

        /* renamed from: L */
        public long f57602L;

        /* renamed from: M */
        public long f57603M;

        /* renamed from: N */
        public long f57604N;

        /* renamed from: O */
        public long f57605O;

        /* renamed from: P */
        public int f57606P;

        /* renamed from: Q */
        public int f57607Q;

        /* renamed from: R */
        public int f57608R;

        /* renamed from: S */
        public int f57609S;

        /* renamed from: T */
        public int f57610T;

        /* renamed from: U */
        public int f57611U;

        /* renamed from: V */
        public int f57612V;

        /* renamed from: W */
        public int f57613W;

        /* renamed from: X */
        public String f57614X = "";

        /* renamed from: Y */
        public long f57615Y;

        /* renamed from: Z */
        public long f57616Z;

        /* renamed from: a */
        public boolean f57617a;

        /* renamed from: a0 */
        public int f57618a0;

        /* renamed from: b */
        public boolean f57619b;

        /* renamed from: b0 */
        public int f57620b0;

        /* renamed from: c */
        public boolean f57621c;

        /* renamed from: c0 */
        public int f57622c0;

        /* renamed from: d */
        public long f57623d;

        /* renamed from: d0 */
        public int f57624d0;

        /* renamed from: e */
        public long f57625e;

        /* renamed from: e0 */
        public int f57626e0;

        /* renamed from: f */
        public long f57627f;

        /* renamed from: f0 */
        public long f57628f0;

        /* renamed from: g */
        public long f57629g;

        /* renamed from: g0 */
        public long f57630g0;

        /* renamed from: h */
        public long f57631h;

        /* renamed from: h0 */
        public long f57632h0;

        /* renamed from: i */
        public long f57633i;

        /* renamed from: i0 */
        public long f57634i0;

        /* renamed from: j */
        public long f57635j;

        /* renamed from: j0 */
        public long f57636j0;

        /* renamed from: k */
        public long f57637k;

        /* renamed from: k0 */
        public C90420iq f57638k0;

        /* renamed from: l */
        public long f57639l;

        /* renamed from: m */
        public long f57640m;

        /* renamed from: n */
        public long f57641n;

        /* renamed from: o */
        public long f57642o;

        /* renamed from: p */
        public long f57643p;

        /* renamed from: q */
        public long f57644q;

        /* renamed from: r */
        public long f57645r;

        /* renamed from: s */
        public long f57646s;

        /* renamed from: t */
        public long f57647t;

        /* renamed from: u */
        public long f57648u;

        /* renamed from: v */
        public long f57649v;

        /* renamed from: w */
        public long f57650w;

        /* renamed from: x */
        public String f57651x = "";

        /* renamed from: y */
        public C89349b f57652y;

        /* renamed from: z */
        public boolean f57653z;
    }

    /* renamed from: dp1.e0$b */
    public static final class C20482b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedLoadingTimeExStruct f57654d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20482b(FinderFeedLoadingTimeExStruct finderFeedLoadingTimeExStruct) {
            super(0);
            this.f57654d = finderFeedLoadingTimeExStruct;
        }

        public Object invoke() {
            C113159b.C113163c a = C113159b.m154842h().mo165664a();
            this.f57654d.f48382I = (long) a.mo165677b();
            this.f57654d.f48383J = C117159b.m165220u(a.f338598b) ? 1 : 0;
            FinderFeedLoadingTimeExStruct finderFeedLoadingTimeExStruct = this.f57654d;
            a.mo165680e();
            finderFeedLoadingTimeExStruct.f48384K = 0;
            this.f57654d.mo86054n();
            StringBuilder sb = new StringBuilder();
            sb.append("report20713 info:");
            String q = this.f57654d.mo1006q();
            C87412m.m108593f(q, "structEx.toShowString()");
            sb.append(C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
            Log.m105924i("Finder.FinderLoadingTimeReporter", sb.toString());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: n */
    public static void m22094n(C20480e0 e0Var, int i, boolean z, C49712hj1 hj12, boolean z2, long j, boolean z3, int i2, Object obj) {
        C64858yi1 yi12;
        if ((i2 & 4) != 0) {
            hj12 = null;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        long j2 = 0;
        if ((i2 & 16) != 0) {
            j = 0;
        }
        if ((i2 & 32) != 0) {
            z3 = true;
        }
        C20481a e = e0Var.mo32032e(i);
        if (e != null) {
            if (!(e.f57617a && !e.f57619b)) {
                e = null;
            }
            if (e != null) {
                String str = "";
                if (hj12 != null) {
                    String str2 = hj12.f134670d;
                    if (str2 == null) {
                        str2 = str;
                    }
                    e.f57591A = str2;
                    String str3 = hj12.f134672f;
                    if (str3 == null) {
                        str3 = str;
                    }
                    e.f57592B = str3;
                    e.f57593C = (long) hj12.f134675i;
                }
                if (!z) {
                    e.f57619b = true;
                    e.f57640m = C31543z5.m39453c();
                    e.f57595E = 1;
                    e.f57608R = z2 ? 1 : 0;
                    e.f57636j0 = j;
                    if (e.f57620b0 == 0) {
                        e.f57620b0 = 1;
                        e.f57622c0 = 1;
                    }
                    Log.m105924i("Finder.FinderLoadingTimeReporter", "notifyLoadingStatus: loading end, tabType=" + i + ", pullType=" + e.f57596F + ", commentScene=" + e.f57593C + ", cgiType=" + e.f57594D + ", firstVideoFeedId=" + C61926c.m72691p(j) + ", firstFeedIsPhoto=" + z2 + ", needRecordVideoPlay=" + z3);
                    if ((i == 4 || i == 3 || i == 1) && z3 && !z2) {
                        C20480e0 e0Var2 = f57583a;
                        ConcurrentHashMap<Integer, C20481a> concurrentHashMap = f57589g;
                        C20481a aVar = concurrentHashMap.get(Integer.valueOf(i));
                        if (aVar != null) {
                            if (aVar.f57594D == 5 && aVar.f57644q == 0) {
                                Log.m105924i("Finder.FinderLoadingTimeReporter", "cacheLateReportData: abnormal report, cgiType=5");
                                aVar.f57644q = C31543z5.m39453c();
                            }
                            e0Var2.mo32044s(aVar, i);
                        }
                        concurrentHashMap.put(Integer.valueOf(i), e);
                        return;
                    }
                    if (e.f57612V == 1 || e.f57594D == 5) {
                        long j3 = f57584b;
                        if (j3 > 0) {
                            e.f57623d = j3;
                            long c = C31543z5.m39453c();
                            e.f57625e = c;
                            f57584b = 0;
                            e.f57598H = c - e.f57623d;
                            boolean z4 = f57585c;
                            e.f57609S = z4 ? 1 : 0;
                            if (z4) {
                                C55718s0 s0Var = f57586d;
                                e.f57615Y = s0Var != null ? (long) s0Var.field_ctrType : 0;
                                String str4 = s0Var != null ? s0Var.field_tipsId : null;
                                if (str4 != null) {
                                    str = str4;
                                }
                                e.f57614X = str;
                                if (!(s0Var == null || (yi12 = s0Var.f158585F) == null)) {
                                    j2 = (long) yi12.f186541C;
                                }
                                e.f57616Z = j2;
                            }
                            f57586d = null;
                            f57585c = false;
                        }
                    }
                    f57583a.mo32044s(e, i);
                } else if (e.f57627f <= 0 || e.f57626e0 != 1) {
                    long c2 = C31543z5.m39453c();
                    e.f57627f = c2;
                    if (e.f57598H > 0) {
                        long j4 = e.f57625e;
                        if (j4 > 0) {
                            j2 = c2 - j4;
                        }
                    }
                    e.f57628f0 = j2;
                } else {
                    long c3 = C31543z5.m39453c();
                    e.f57629g = c3;
                    if (e.f57598H > 0) {
                        long j5 = e.f57625e;
                        if (j5 > 0) {
                            j2 = c3 - j5;
                        }
                    }
                    e.f57628f0 = j2;
                }
            }
        }
    }

    /* renamed from: r */
    public static void m22095r(C20480e0 e0Var, int i, int i2, C49712hj1 hj12, long j, boolean z, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            j = 0;
        }
        if ((i3 & 16) != 0) {
            z = false;
        }
        e0Var.getClass();
        if (!(i2 == 0 || i2 == 1 || i2 == 2) || hj12 == null) {
            Log.m105924i("Finder.FinderLoadingTimeReporter", "prepare: not support to report tabType = " + i + ", contextObj = " + hj12);
            return;
        }
        C20481a e = e0Var.mo32032e(i);
        if (e != null) {
            C13598b0 b0Var = null;
            if (!(e.f57617a && !e.f57619b)) {
                e = null;
            }
            if (e != null) {
                if (e.f57626e0 == 1 && !e.f57621c && i2 == 0) {
                    Log.m105924i("Finder.FinderLoadingTimeReporter", "prepare: remove duplicate enter report");
                    return;
                }
                if (((e.f57639l > 0 ? 1 : (e.f57639l == 0 ? 0 : -1)) == 0 && (e.f57595E > 2 ? 1 : (e.f57595E == 2 ? 0 : -1)) == 0 ? e : null) != null) {
                    f57583a.mo32034g(i, false);
                    b0Var = C13598b0.f38549a;
                }
                if (b0Var == null) {
                    C20480e0 e0Var2 = f57583a;
                    e.f57619b = true;
                    e0Var2.mo32044s(e, i);
                }
            }
        }
        C20481a e2 = e0Var.mo32032e(i);
        if (e2 != null) {
            e2.f57617a = true;
            e2.f57596F = (long) i2;
            String str = hj12.f134670d;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            e2.f57591A = str;
            String str3 = hj12.f134672f;
            if (str3 != null) {
                str2 = str3;
            }
            e2.f57592B = str2;
            e2.f57593C = (long) hj12.f134675i;
            e2.f57594D = j;
            e2.f57653z = z;
        }
    }

    /* renamed from: a */
    public final void mo32028a(int i, int i2) {
        C20481a e;
        if (i2 > 0 && (e = mo32032e(i)) != null) {
            if (!(e.f57617a && !e.f57619b)) {
                e = null;
            }
            if (e != null) {
                e.f57613W += i2;
            }
        }
    }

    /* renamed from: b */
    public final void mo32029b(int i) {
        C64858yi1 yi12;
        C20481a e = mo32032e(i);
        if (e != null) {
            long j = f57584b;
            long j2 = 0;
            if (j > 0) {
                e.f57623d = j;
                Long l = f57588f.get(Integer.valueOf(i));
                long longValue = l == null ? 0 : l.longValue();
                e.f57625e = longValue;
                f57584b = 0;
                e.f57598H = longValue > 0 ? longValue - e.f57623d : 0;
                boolean z = f57585c;
                e.f57609S = z ? 1 : 0;
                if (z) {
                    C55718s0 s0Var = f57586d;
                    e.f57615Y = s0Var != null ? (long) s0Var.field_ctrType : 0;
                    String str = s0Var != null ? s0Var.field_tipsId : null;
                    if (str == null) {
                        str = "";
                    }
                    e.f57614X = str;
                    C55718s0 s0Var2 = f57586d;
                    if (!(s0Var2 == null || (yi12 = s0Var2.f158585F) == null)) {
                        j2 = (long) yi12.f186541C;
                    }
                    e.f57616Z = j2;
                }
                f57586d = null;
                f57585c = false;
            }
        }
    }

    /* renamed from: c */
    public final void mo32030c() {
        f57584b = 0;
        f57585c = false;
        f57586d = null;
    }

    /* renamed from: d */
    public final void mo32031d() {
        f57584b = C31543z5.m39453c();
    }

    /* renamed from: e */
    public final C20481a mo32032e(int i) {
        boolean z = true;
        if (!(i == 4 || i == 3 || i == 1 || i == 2 || i == 6 || i == 5 || i == 7 || i == 8 || i == 9)) {
            z = false;
        }
        if (!z) {
            return null;
        }
        ConcurrentHashMap<Integer, C20481a> concurrentHashMap = f57587e;
        C20481a aVar = concurrentHashMap.get(Integer.valueOf(i));
        if (aVar != null && !aVar.f57619b) {
            return aVar;
        }
        C20481a aVar2 = new C20481a();
        aVar2.f57597G = i;
        concurrentHashMap.put(Integer.valueOf(i), aVar2);
        return aVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01a3 A[SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<te3.C22489al0> mo32033f() {
        /*
            r20 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.HashSet<dp1.e0$a> r1 = f57590h
            monitor-enter(r1)
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x0273 }
        L_0x000c:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0273 }
            if (r3 == 0) goto L_0x026a
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0273 }
            dp1.e0$a r3 = (dp1.C20480e0.C20481a) r3     // Catch:{ all -> 0x0273 }
            te3.al0 r4 = new te3.al0     // Catch:{ all -> 0x0273 }
            r4.<init>()     // Catch:{ all -> 0x0273 }
            boolean r5 = r3.f57653z     // Catch:{ all -> 0x0273 }
            r6 = 2
            if (r5 == 0) goto L_0x0024
            r5 = 5
            goto L_0x0025
        L_0x0024:
            r5 = 2
        L_0x0025:
            r4.f63690d = r5     // Catch:{ all -> 0x0273 }
            long r7 = r3.f57596F     // Catch:{ all -> 0x0273 }
            int r5 = (int) r7     // Catch:{ all -> 0x0273 }
            r4.f63692f = r5     // Catch:{ all -> 0x0273 }
            long r9 = r3.f57598H     // Catch:{ all -> 0x0273 }
            int r5 = (int) r9     // Catch:{ all -> 0x0273 }
            long r9 = r3.f57628f0     // Catch:{ all -> 0x0273 }
            int r10 = (int) r9     // Catch:{ all -> 0x0273 }
            int r5 = r5 + r10
            r4.f63694h = r5     // Catch:{ all -> 0x0273 }
            int r5 = r3.f57622c0     // Catch:{ all -> 0x0273 }
            if (r5 != r6) goto L_0x003d
            r11 = 100000000(0x5f5e100, float:2.3122341E-35)
            goto L_0x0040
        L_0x003d:
            long r10 = r3.f57602L     // Catch:{ all -> 0x0273 }
            int r11 = (int) r10     // Catch:{ all -> 0x0273 }
        L_0x0040:
            r4.f63695i = r11     // Catch:{ all -> 0x0273 }
            int r10 = r3.f57611U     // Catch:{ all -> 0x0273 }
            r11 = 1
            r12 = 0
            if (r10 != r11) goto L_0x005d
            long r14 = r3.f57627f     // Catch:{ all -> 0x0273 }
            r16 = r7
            long r6 = r3.f57640m     // Catch:{ all -> 0x0273 }
            int r8 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x005f
            int r8 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r8 <= 0) goto L_0x005f
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r8 <= 0) goto L_0x005f
            long r6 = r6 - r14
            goto L_0x0060
        L_0x005d:
            r16 = r7
        L_0x005f:
            r6 = r12
        L_0x0060:
            if (r10 != 0) goto L_0x0074
            long r14 = r3.f57639l     // Catch:{ all -> 0x0273 }
            long r9 = r3.f57640m     // Catch:{ all -> 0x0273 }
            int r18 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r18 >= 0) goto L_0x0074
            int r18 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r18 <= 0) goto L_0x0074
            int r18 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r18 <= 0) goto L_0x0074
            long r6 = r9 - r14
        L_0x0074:
            int r7 = (int) r6     // Catch:{ all -> 0x0273 }
            r4.f63696j = r7     // Catch:{ all -> 0x0273 }
            int r6 = r3.f57608R     // Catch:{ all -> 0x0273 }
            r9 = 2
            if (r6 != 0) goto L_0x00de
            long r14 = r3.f57642o     // Catch:{ all -> 0x0273 }
            int r6 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r6 <= 0) goto L_0x0091
            long r7 = r3.f57641n     // Catch:{ all -> 0x0273 }
            int r19 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r19 <= 0) goto L_0x0091
            int r19 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r19 <= 0) goto L_0x0091
            long r7 = r14 - r7
            int r8 = (int) r7     // Catch:{ all -> 0x0273 }
            goto L_0x0098
        L_0x0091:
            if (r5 != r11) goto L_0x0097
            r8 = 100000000(0x5f5e100, float:2.3122341E-35)
            goto L_0x0098
        L_0x0097:
            r8 = 0
        L_0x0098:
            r4.f63697n = r8     // Catch:{ all -> 0x0273 }
            int r7 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x009f
            goto L_0x00a7
        L_0x009f:
            long r14 = r3.f57643p     // Catch:{ all -> 0x0273 }
            int r7 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r14 = r12
        L_0x00a7:
            int r7 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x00b8
            long r7 = r3.f57644q     // Catch:{ all -> 0x0273 }
            int r19 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r19 <= 0) goto L_0x00b8
            int r19 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r19 <= 0) goto L_0x00b8
            long r7 = r7 - r14
            int r5 = (int) r7     // Catch:{ all -> 0x0273 }
            goto L_0x00dc
        L_0x00b8:
            if (r5 != r11) goto L_0x00db
            int r5 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x00c4
            long r7 = r3.f57632h0     // Catch:{ all -> 0x0273 }
            int r5 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x00d7
        L_0x00c4:
            java.lang.Class<tf0.p1> r5 = tf0.C64916p1.class
            di3.d r5 = di3.C86312j.m106911c(r5)     // Catch:{ all -> 0x0273 }
            tf0.p1 r5 = (tf0.C64916p1) r5     // Catch:{ all -> 0x0273 }
            boolean r5 = r5.mo59665N()     // Catch:{ all -> 0x0273 }
            if (r5 == 0) goto L_0x00d4
            r5 = 4
            goto L_0x00d5
        L_0x00d4:
            r5 = 2
        L_0x00d5:
            r3.f57622c0 = r5     // Catch:{ all -> 0x0273 }
        L_0x00d7:
            r5 = 100000000(0x5f5e100, float:2.3122341E-35)
            goto L_0x00dc
        L_0x00db:
            r5 = 0
        L_0x00dc:
            r4.f63698o = r5     // Catch:{ all -> 0x0273 }
        L_0x00de:
            int r5 = r3.f57620b0     // Catch:{ all -> 0x0273 }
            r4.f63693g = r5     // Catch:{ all -> 0x0273 }
            pe3.b r5 = r3.f57652y     // Catch:{ all -> 0x0273 }
            r4.f63700q = r5     // Catch:{ all -> 0x0273 }
            long r5 = r3.f57593C     // Catch:{ all -> 0x0273 }
            int r6 = (int) r5     // Catch:{ all -> 0x0273 }
            r4.f63701r = r6     // Catch:{ all -> 0x0273 }
            int r5 = r3.f57622c0     // Catch:{ all -> 0x0273 }
            r4.f63702s = r5     // Catch:{ all -> 0x0273 }
            long r5 = r3.f57594D     // Catch:{ all -> 0x0273 }
            int r6 = (int) r5     // Catch:{ all -> 0x0273 }
            r4.f63703t = r6     // Catch:{ all -> 0x0273 }
            long r5 = r3.f57630g0     // Catch:{ all -> 0x0273 }
            int r7 = (int) r5     // Catch:{ all -> 0x0273 }
            r4.f63704u = r7     // Catch:{ all -> 0x0273 }
            int r6 = (int) r5     // Catch:{ all -> 0x0273 }
            r4.f63705v = r6     // Catch:{ all -> 0x0273 }
            long r5 = r3.f57603M     // Catch:{ all -> 0x0273 }
            int r6 = (int) r5     // Catch:{ all -> 0x0273 }
            r4.f63689E = r6     // Catch:{ all -> 0x0273 }
            long r5 = r3.f57596F     // Catch:{ all -> 0x0273 }
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x010b
            boolean r5 = r3.f57653z     // Catch:{ all -> 0x0273 }
            if (r5 == 0) goto L_0x0121
        L_0x010b:
            long r5 = r3.f57632h0     // Catch:{ all -> 0x0273 }
            int r7 = (int) r5     // Catch:{ all -> 0x0273 }
            r4.f63705v = r7     // Catch:{ all -> 0x0273 }
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 > 0) goto L_0x0121
            r5 = 0
            r4.f63698o = r5     // Catch:{ all -> 0x0273 }
            r4.f63697n = r5     // Catch:{ all -> 0x0273 }
            long r5 = r3.f57640m     // Catch:{ all -> 0x0273 }
            long r7 = r3.f57627f     // Catch:{ all -> 0x0273 }
            long r5 = r5 - r7
            int r6 = (int) r5     // Catch:{ all -> 0x0273 }
            r4.f63704u = r6     // Catch:{ all -> 0x0273 }
        L_0x0121:
            te3.iq r5 = r3.f57638k0     // Catch:{ all -> 0x0273 }
            if (r5 == 0) goto L_0x01a3
            long r6 = r5.f259607n     // Catch:{ all -> 0x0273 }
            r4.f63706w = r6     // Catch:{ all -> 0x0273 }
            long r6 = r5.f259600d     // Catch:{ all -> 0x0273 }
            r4.f63707x = r6     // Catch:{ all -> 0x0273 }
            long r6 = r5.f259601e     // Catch:{ all -> 0x0273 }
            r4.f63708y = r6     // Catch:{ all -> 0x0273 }
            long r6 = r5.f259602f     // Catch:{ all -> 0x0273 }
            r4.f63709z = r6     // Catch:{ all -> 0x0273 }
            long r6 = r5.f259603g     // Catch:{ all -> 0x0273 }
            r4.f63685A = r6     // Catch:{ all -> 0x0273 }
            long r6 = r5.f259604h     // Catch:{ all -> 0x0273 }
            r4.f63686B = r6     // Catch:{ all -> 0x0273 }
            long r6 = r5.f259605i     // Catch:{ all -> 0x0273 }
            r4.f63687C = r6     // Catch:{ all -> 0x0273 }
            long r6 = r5.f259606j     // Catch:{ all -> 0x0273 }
            r4.f63688D = r6     // Catch:{ all -> 0x0273 }
            java.lang.String r6 = "Finder.FinderLoadingTimeReporter"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0273 }
            r7.<init>()     // Catch:{ all -> 0x0273 }
            java.lang.String r8 = "profile time\nstartConnectTime: "
            r7.append(r8)     // Catch:{ all -> 0x0273 }
            long r8 = r5.f259600d     // Catch:{ all -> 0x0273 }
            r7.append(r8)     // Catch:{ all -> 0x0273 }
            java.lang.String r8 = " \nconnectSuccessfulTime："
            r7.append(r8)     // Catch:{ all -> 0x0273 }
            long r8 = r5.f259601e     // Catch:{ all -> 0x0273 }
            r7.append(r8)     // Catch:{ all -> 0x0273 }
            java.lang.String r8 = " \nstartHandshakeTime："
            r7.append(r8)     // Catch:{ all -> 0x0273 }
            long r8 = r5.f259602f     // Catch:{ all -> 0x0273 }
            r7.append(r8)     // Catch:{ all -> 0x0273 }
            java.lang.String r8 = " \nhandshakeSuccessfulTime："
            r7.append(r8)     // Catch:{ all -> 0x0273 }
            long r8 = r5.f259603g     // Catch:{ all -> 0x0273 }
            r7.append(r8)     // Catch:{ all -> 0x0273 }
            java.lang.String r8 = " \nstartSendPacketTime："
            r7.append(r8)     // Catch:{ all -> 0x0273 }
            long r8 = r5.f259604h     // Catch:{ all -> 0x0273 }
            r7.append(r8)     // Catch:{ all -> 0x0273 }
            java.lang.String r8 = " \nstartReadPacketTime："
            r7.append(r8)     // Catch:{ all -> 0x0273 }
            long r8 = r5.f259605i     // Catch:{ all -> 0x0273 }
            r7.append(r8)     // Catch:{ all -> 0x0273 }
            java.lang.String r8 = " \nreadPacketFinishedTime： "
            r7.append(r8)     // Catch:{ all -> 0x0273 }
            long r8 = r5.f259606j     // Catch:{ all -> 0x0273 }
            r7.append(r8)     // Catch:{ all -> 0x0273 }
            java.lang.String r8 = " \ntaskStartTime："
            r7.append(r8)     // Catch:{ all -> 0x0273 }
            long r8 = r5.f259607n     // Catch:{ all -> 0x0273 }
            r7.append(r8)     // Catch:{ all -> 0x0273 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0273 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)     // Catch:{ all -> 0x0273 }
        L_0x01a3:
            r0.add(r4)     // Catch:{ all -> 0x0273 }
            java.lang.String r5 = "Finder.FinderLoadingTimeReporter"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0273 }
            r6.<init>()     // Catch:{ all -> 0x0273 }
            java.lang.String r7 = "finderFluencyInfo: scene = "
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            int r7 = r4.f63690d     // Catch:{ all -> 0x0273 }
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            java.lang.String r7 = ", pullType = "
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            int r7 = r4.f63692f     // Catch:{ all -> 0x0273 }
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            java.lang.String r7 = ", globalInitMs = "
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            int r7 = r4.f63694h     // Catch:{ all -> 0x0273 }
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            java.lang.String r7 = ", enterCost="
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            long r7 = r3.f57598H     // Catch:{ all -> 0x0273 }
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            java.lang.String r7 = ", resumeToLoadingStartCost="
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            long r7 = r3.f57628f0     // Catch:{ all -> 0x0273 }
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            java.lang.String r7 = " pullCgiMs = "
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            int r7 = r4.f63695i     // Catch:{ all -> 0x0273 }
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            java.lang.String r7 = ", showUiMs = "
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            int r7 = r4.f63696j     // Catch:{ all -> 0x0273 }
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            java.lang.String r7 = ", downloadToDecodeMs = "
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            int r7 = r4.f63697n     // Catch:{ all -> 0x0273 }
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            java.lang.String r7 = ", decodeToFirstFrameMs = "
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            int r7 = r4.f63698o     // Catch:{ all -> 0x0273 }
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            java.lang.String r7 = ", finishScene = "
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            int r7 = r4.f63693g     // Catch:{ all -> 0x0273 }
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            java.lang.String r7 = ", commentScene = "
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            int r7 = r4.f63701r     // Catch:{ all -> 0x0273 }
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            java.lang.String r7 = ", status = "
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            int r7 = r4.f63702s     // Catch:{ all -> 0x0273 }
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            java.lang.String r7 = ", it.cgiType = "
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            int r7 = r4.f63703t     // Catch:{ all -> 0x0273 }
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            java.lang.String r7 = ", total_time_ms = "
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            int r7 = r4.f63704u     // Catch:{ all -> 0x0273 }
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            java.lang.String r7 = ", loading_time_ms = "
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            int r7 = r4.f63705v     // Catch:{ all -> 0x0273 }
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            java.lang.String r7 = ", ui_refresh_end_cost_ms = "
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            int r7 = r4.f63689E     // Catch:{ all -> 0x0273 }
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            java.lang.String r7 = " firstFeedIsPhoto = "
            r6.append(r7)     // Catch:{ all -> 0x0273 }
            int r3 = r3.f57608R     // Catch:{ all -> 0x0273 }
            r6.append(r3)     // Catch:{ all -> 0x0273 }
            java.lang.String r3 = ", debug_message = "
            r6.append(r3)     // Catch:{ all -> 0x0273 }
            pe3.b r3 = r4.f63700q     // Catch:{ all -> 0x0273 }
            r6.append(r3)     // Catch:{ all -> 0x0273 }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x0273 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)     // Catch:{ all -> 0x0273 }
            goto L_0x000c
        L_0x026a:
            java.util.HashSet<dp1.e0$a> r2 = f57590h     // Catch:{ all -> 0x0273 }
            r2.clear()     // Catch:{ all -> 0x0273 }
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0273 }
            monitor-exit(r1)
            return r0
        L_0x0273:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C20480e0.mo32033f():java.util.List");
    }

    /* renamed from: g */
    public final void mo32034g(int i, boolean z) {
        C20481a e = mo32032e(i);
        if (e != null) {
            if (!(e.f57617a && !e.f57619b)) {
                e = null;
            }
            if (e == null) {
                return;
            }
            if (z) {
                e.f57639l = 0;
            } else if (e.f57639l <= 0 || e.f57626e0 != 1) {
                e.f57639l = C31543z5.m39453c();
                if (e.f57595E == 2) {
                    e.f57619b = true;
                    e.f57621c = false;
                    f57583a.mo32044s(e, i);
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo32035h(int i, String str, long j, boolean z) {
        C87412m.m108594g(str, "tag");
        C20481a aVar = f57589g.get(Integer.valueOf(i));
        if (aVar != null) {
            long j2 = aVar.f57636j0;
            if (!(j2 == 0 || j2 == j || aVar.f57641n == 0)) {
                aVar = null;
            }
            if (aVar != null) {
                Log.m105924i("Finder.FinderLoadingTimeReporter", "notifyDecodeStart: " + str + ", feedId=" + C61926c.m72691p(j) + ", checkVideoPreload=" + z + ", usePreloadCache=" + aVar.f57611U + ", cgiType=" + aVar.f57594D + ", videoDecodeStart=" + aVar.f57642o);
                if (!z || ((aVar.f57611U == 1 && aVar.f57642o == 0) || (aVar.f57594D == 5 && aVar.f57642o == 0))) {
                    aVar.f57642o = C31543z5.m39453c();
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo32036i(int i, boolean z) {
        C20481a e = mo32032e(i);
        if (e != null) {
            if (!(e.f57617a && !e.f57619b)) {
                e = null;
            }
            if (e != null && e.f57620b0 == 0) {
                e.f57620b0 = z ? 3 : 4;
                e.f57622c0 = 4;
            }
        }
    }

    /* renamed from: j */
    public final void mo32037j(int i) {
        C20481a e = mo32032e(i);
        if (e != null) {
            if (!(e.f57617a && !e.f57619b)) {
                e = null;
            }
            if (e != null) {
                e.f57649v = C31543z5.m39453c();
            }
        }
    }

    /* renamed from: k */
    public final void mo32038k(int i, boolean z, boolean z2, boolean z3) {
        C20481a e = mo32032e(i);
        if (e != null) {
            int i2 = 1;
            if (!(e.f57617a && !e.f57619b)) {
                e = null;
            }
            if (e == null) {
                return;
            }
            if (z) {
                e.f57645r = C31543z5.m39453c();
                if (z2 && z3) {
                    i2 = 3;
                } else if (!z2) {
                    i2 = 2;
                }
                e.f57618a0 = i2;
                return;
            }
            e.f57646s = C31543z5.m39453c();
        }
    }

    /* renamed from: l */
    public final void mo32039l(int i, boolean z) {
        C20481a e = mo32032e(i);
        if (e != null) {
            if (!(e.f57617a && !e.f57619b)) {
                e = null;
            }
            if (e == null) {
                return;
            }
            if (z) {
                e.f57647t = C31543z5.m39453c();
            } else {
                e.f57648u = C31543z5.m39453c();
            }
        }
    }

    /* renamed from: m */
    public final void mo32040m(int i, boolean z) {
        C20481a e = mo32032e(i);
        if (e != null) {
            if (!(e.f57617a && !e.f57619b)) {
                e = null;
            }
            if (e == null) {
                return;
            }
            if (z) {
                e.f57635j = C31543z5.m39453c();
                e.f57594D = e.f57594D == 0 ? 2 : 3;
                return;
            }
            e.f57637k = C31543z5.m39453c();
        }
    }

    /* renamed from: o */
    public final void mo32041o(int i, boolean z, C89349b bVar, C90420iq iqVar) {
        C20481a e = mo32032e(i);
        if (e != null) {
            if (!(e.f57617a && !e.f57619b)) {
                e = null;
            }
            if (e == null) {
                return;
            }
            if (z) {
                e.f57631h = C31543z5.m39453c();
                e.f57594D = e.f57594D == 0 ? 1 : 3;
                return;
            }
            e.f57633i = C31543z5.m39453c();
            e.f57638k0 = iqVar;
            e.f57652y = bVar;
        }
    }

    /* renamed from: p */
    public final void mo32042p(int i, C89349b bVar, String str, C90420iq iqVar, boolean z, boolean z2) {
        C87412m.m108594g(str, "preloadMediaId");
        C20481a e = mo32032e(i);
        if (e != null) {
            boolean z3 = false;
            if (!(e.f57617a && !e.f57619b && e.f57626e0 == 0)) {
                e = null;
            }
            if (e != null) {
                if (e.f57594D > 0) {
                    e.f57633i = C31543z5.m39453c();
                    e.f57611U = 2;
                } else {
                    e.f57611U = 1;
                    if (!z) {
                        if (str.length() > 0) {
                            z3 = true;
                        }
                        if (z3 && !((C64916p1) C86312j.m106911c(C64916p1.class)).mo76663Gi(str)) {
                            e.f57611U = 3;
                        }
                    }
                }
                Log.m105924i("Finder.FinderLoadingTimeReporter", "notifyUsePreloadCache: usePreloadCache=" + e.f57611U + ", tabType=" + i + ", preloadMediaId=" + str + ", isFirstFeedPhoto=" + z + ", showCacheWithoutRefresh=" + z2);
                e.f57652y = bVar;
                if (iqVar != null) {
                    e.f57638k0 = iqVar;
                }
                e.f57612V = z2 ? 1 : 0;
            }
        }
    }

    /* renamed from: q */
    public final void mo32043q(int i) {
        C64858yi1 yi12;
        Integer valueOf = Integer.valueOf(i);
        ConcurrentHashMap<Integer, Long> concurrentHashMap = f57588f;
        concurrentHashMap.put(valueOf, Long.valueOf(C31543z5.m39453c()));
        C20481a aVar = f57589g.get(Integer.valueOf(i));
        if (aVar == null) {
            return;
        }
        if (aVar.f57612V == 1 || aVar.f57594D == 5) {
            long j = f57584b;
            long j2 = 0;
            if (j > 0) {
                aVar.f57623d = j;
                Long l = concurrentHashMap.get(Integer.valueOf(i));
                long longValue = l == null ? 0 : l.longValue();
                aVar.f57625e = longValue;
                f57584b = 0;
                aVar.f57598H = longValue > 0 ? longValue - aVar.f57623d : 0;
                boolean z = f57585c;
                aVar.f57609S = z ? 1 : 0;
                if (z) {
                    C55718s0 s0Var = f57586d;
                    aVar.f57615Y = s0Var != null ? (long) s0Var.field_ctrType : 0;
                    String str = s0Var != null ? s0Var.field_tipsId : null;
                    if (str == null) {
                        str = "";
                    }
                    aVar.f57614X = str;
                    C55718s0 s0Var2 = f57586d;
                    if (!(s0Var2 == null || (yi12 = s0Var2.f158585F) == null)) {
                        j2 = (long) yi12.f186541C;
                    }
                    aVar.f57616Z = j2;
                }
                f57586d = null;
                f57585c = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0310, code lost:
        if ((r4 == null || r4.length() == 0) != false) goto L_0x06eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008c, code lost:
        if (r10 > 0) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e4, code lost:
        if (r13 > 0) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0108, code lost:
        if (r13 > 0) goto L_0x010d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e0  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32044s(dp1.C20480e0.C20481a r33, int r34) {
        /*
            r32 = this;
            r0 = r33
            r1 = r34
            java.lang.Class<tf0.p1> r2 = tf0.C64916p1.class
            com.tencent.mm.autogen.mmdata.rpt.FinderFeedLoadingTimeStruct r3 = new com.tencent.mm.autogen.mmdata.rpt.FinderFeedLoadingTimeStruct
            r3.<init>()
            java.lang.String r4 = r0.f57591A
            java.lang.String r5 = "Sessionid"
            r6 = 1
            java.lang.String r4 = r3.mo86045b(r5, r4, r6)
            r3.f48415d = r4
            java.lang.String r4 = r0.f57592B
            java.lang.String r5 = "ClickTabContextid"
            java.lang.String r4 = r3.mo86045b(r5, r4, r6)
            r3.f48416e = r4
            long r4 = r0.f57593C
            r3.f48417f = r4
            long r4 = r0.f57594D
            r3.f48418g = r4
            long r4 = r0.f57640m
            int r7 = r0.f57626e0
            if (r7 != r6) goto L_0x0031
            long r7 = r0.f57629g
            goto L_0x0033
        L_0x0031:
            long r7 = r0.f57627f
        L_0x0033:
            long r7 = r4 - r7
            r3.f48419h = r7
            int r7 = r0.f57611U
            r8 = 0
            if (r7 != 0) goto L_0x0040
            long r10 = r0.f57627f
            goto L_0x0041
        L_0x0040:
            r10 = r8
        L_0x0041:
            r3.f48420i = r10
            long r10 = r0.f57631h
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0056
            long r12 = r0.f57633i
            int r7 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0056
            int r7 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0056
            long r12 = r12 - r10
            r0.f57599I = r12
        L_0x0056:
            long r10 = r0.f57635j
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0069
            long r12 = r0.f57637k
            int r14 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r14 <= 0) goto L_0x0069
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 <= 0) goto L_0x0069
            long r12 = r12 - r10
            r0.f57601K = r12
        L_0x0069:
            long r12 = r0.f57633i
            int r14 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r14 <= 0) goto L_0x0078
            if (r7 <= 0) goto L_0x0078
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x0078
            long r10 = r10 - r12
            r0.f57600J = r10
        L_0x0078:
            long r10 = r0.f57599I
            long r12 = r0.f57601K
            long r10 = r10 + r12
            long r12 = r0.f57600J
            long r10 = r10 + r12
            r0.f57602L = r10
            long r10 = r0.f57596F
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x008f
            long r10 = r0.f57623d
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            long r10 = r0.f57627f
        L_0x0091:
            long r10 = r4 - r10
            r0.f57603M = r10
            long r12 = r0.f57639l
            int r7 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x00a1
            int r7 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a1
            long r4 = r4 - r12
            goto L_0x00a2
        L_0x00a1:
            r4 = r8
        L_0x00a2:
            r0.f57604N = r4
            r0.f57630g0 = r10
            long r4 = r0.f57644q
            r7 = 2
            r10 = 3
            int r11 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x00ee
            long r11 = r0.f57641n
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 <= 0) goto L_0x00b9
            int r13 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x00b9
            goto L_0x00c3
        L_0x00b9:
            long r11 = r0.f57642o
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 <= 0) goto L_0x00c5
            int r13 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x00c5
        L_0x00c3:
            long r4 = r4 - r11
            goto L_0x00c6
        L_0x00c5:
            r4 = r8
        L_0x00c6:
            r0.f57605O = r4
            r0.f57606P = r6
            long r4 = eb0.C31543z5.m39453c()
            long r11 = r0.f57644q
            long r4 = r4 - r11
            r13 = 10000(0x2710, double:4.9407E-320)
            int r15 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x00da
            r0.f57606P = r10
            r4 = r13
        L_0x00da:
            long r13 = r0.f57596F
            int r15 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r15 != 0) goto L_0x00e7
            long r13 = r0.f57623d
            int r15 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r15 <= 0) goto L_0x00e7
            goto L_0x00e9
        L_0x00e7:
            long r13 = r0.f57627f
        L_0x00e9:
            long r11 = r11 - r13
            r0.f57630g0 = r11
            r11 = r8
            goto L_0x0114
        L_0x00ee:
            long r4 = r0.f57641n
            int r11 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x0112
            long r4 = eb0.C31543z5.m39453c()
            long r11 = r0.f57641n
            long r11 = r4 - r11
            r0.f57606P = r7
            long r13 = r0.f57596F
            int r15 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r15 != 0) goto L_0x010b
            long r13 = r0.f57623d
            int r15 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r15 <= 0) goto L_0x010b
            goto L_0x010d
        L_0x010b:
            long r13 = r0.f57627f
        L_0x010d:
            long r4 = r4 - r13
            r0.f57630g0 = r4
            r4 = r8
            goto L_0x0114
        L_0x0112:
            r4 = r8
            r11 = r4
        L_0x0114:
            org.json.JSONObject r13 = new org.json.JSONObject
            r13.<init>()
            long r14 = r0.f57598H
            java.lang.String r7 = "enterCost"
            r13.put(r7, r14)
            long r14 = r0.f57628f0
            java.lang.String r7 = "resumeToLoadingStartCost"
            r13.put(r7, r14)
            int r7 = r0.f57597G
            r14 = 9
            r15 = 8
            r6 = 7
            r10 = 5
            r8 = 6
            if (r7 == r8) goto L_0x013d
            if (r7 == r10) goto L_0x013d
            if (r7 == r6) goto L_0x013d
            if (r7 == r15) goto L_0x013d
            if (r7 != r14) goto L_0x013b
            goto L_0x013d
        L_0x013b:
            r7 = 0
            goto L_0x013e
        L_0x013d:
            r7 = 1
        L_0x013e:
            java.lang.String r14 = "cgiBackFeedCount"
            java.lang.String r15 = "cgiEndToLoadingEndCost"
            java.lang.String r6 = "loadCost"
            if (r7 == 0) goto L_0x01a9
            long r4 = r0.f57649v
            r11 = 0
            int r7 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x0152
            long r11 = r0.f57627f
            long r4 = r4 - r11
            goto L_0x0154
        L_0x0152:
            r4 = 0
        L_0x0154:
            java.lang.String r7 = "firstFeedShowCost"
            r13.put(r7, r4)
            long r4 = r0.f57646s
            long r11 = r0.f57645r
            int r7 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x0169
            r16 = 0
            int r7 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r7 <= 0) goto L_0x0169
            long r4 = r4 - r11
            goto L_0x016b
        L_0x0169:
            r4 = 0
        L_0x016b:
            java.lang.String r7 = "getDetailCost"
            r13.put(r7, r4)
            long r4 = r0.f57648u
            long r11 = r0.f57647t
            int r7 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x0180
            r16 = 0
            int r7 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r7 <= 0) goto L_0x0180
            long r4 = r4 - r11
            goto L_0x0182
        L_0x0180:
            r4 = 0
        L_0x0182:
            java.lang.String r7 = "getRelatedCost"
            r13.put(r7, r4)
            long r4 = r0.f57604N
            r13.put(r15, r4)
            long r4 = r0.f57603M
            r13.put(r6, r4)
            long r4 = r0.f57640m
            long r6 = r0.f57627f
            long r4 = r4 - r6
            java.lang.String r6 = "loadCostWitchActivityCost"
            r13.put(r6, r4)
            int r4 = r0.f57618a0
            java.lang.String r5 = "feedIdType"
            r13.put(r5, r4)
            int r4 = r0.f57613W
            r13.put(r14, r4)
            goto L_0x023c
        L_0x01a9:
            long r8 = r0.f57599I
            java.lang.String r7 = "streamCost"
            r13.put(r7, r8)
            long r7 = r0.f57600J
            java.lang.String r9 = "spanCgiCost"
            r13.put(r9, r7)
            long r7 = r0.f57601K
            java.lang.String r9 = "historyCost"
            r13.put(r9, r7)
            long r7 = r0.f57602L
            java.lang.String r9 = "cgiAllCost"
            r13.put(r9, r7)
            long r7 = r0.f57603M
            r13.put(r6, r7)
            long r6 = r0.f57604N
            r13.put(r15, r6)
            long r6 = r0.f57641n
            java.lang.String r8 = "startDownloadTimeStamp"
            r13.put(r8, r6)
            long r6 = r0.f57642o
            java.lang.String r8 = "videoDecodeStartTimeStamp"
            r13.put(r8, r6)
            long r6 = r0.f57644q
            java.lang.String r8 = "firstFrameDrawTimeStamp"
            r13.put(r8, r6)
            long r6 = r0.f57605O
            java.lang.String r8 = "downLoadToFirstFrameDrawCost"
            r13.put(r8, r6)
            java.lang.String r6 = "downloadToExitCost"
            r13.put(r6, r11)
            long r6 = r0.f57630g0
            java.lang.String r8 = "totalCost"
            r13.put(r8, r6)
            int r6 = r0.f57606P
            java.lang.String r7 = "firstFrameStatus"
            r13.put(r7, r6)
            java.lang.String r6 = "standingMsAfterFirstFrame"
            r13.put(r6, r4)
            int r4 = r0.f57607Q
            java.lang.String r5 = "exitStatus"
            r13.put(r5, r4)
            int r4 = r0.f57608R
            java.lang.String r5 = "firstFeedIsPhoto"
            r13.put(r5, r4)
            int r4 = r0.f57609S
            java.lang.String r5 = "enterWithRedDot"
            r13.put(r5, r4)
            long r4 = r0.f57598H
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0229
            int r4 = r0.f57610T
            goto L_0x022a
        L_0x0229:
            r4 = 0
        L_0x022a:
            java.lang.String r5 = "enterWithFirstPageData"
            r13.put(r5, r4)
            int r4 = r0.f57613W
            r13.put(r14, r4)
            int r4 = r0.f57611U
            java.lang.String r5 = "usePreloadCache"
            r13.put(r5, r4)
        L_0x023c:
            long r4 = r0.f57595E
            java.lang.String r6 = "finishStatus"
            r13.put(r6, r4)
            long r4 = r0.f57593C
            java.lang.String r6 = "commentScene"
            r13.put(r6, r4)
            int r4 = r0.f57597G
            java.lang.String r5 = "tabType"
            r13.put(r5, r4)
            long r4 = r0.f57596F
            java.lang.String r6 = "pullType"
            r13.put(r6, r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            java.lang.String r5 = "api"
            r13.put(r5, r4)
            int r4 = r0.f57624d0
            java.lang.String r5 = "hasBeenAppBackground"
            r13.put(r5, r4)
            long r4 = r0.f57598H
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x028c
            int r4 = r0.f57626e0
            java.lang.String r5 = "isEnterLoad"
            r13.put(r5, r4)
            up1.f r4 = up1.C37521f.f99374d
            r4.getClass()
            pe1.c<java.lang.Integer> r4 = up1.C37521f.f99520t4
            java.lang.Object r4 = r4.mo60266n()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.String r5 = "finderEnterLoadSwitch"
            r13.put(r5, r4)
        L_0x028c:
            long r4 = r0.f57598H
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x02a4
            int r4 = r0.f57606P
            r5 = 3
            if (r4 != r5) goto L_0x02a4
            com.tencent.mm.plugin.report.service.n r19 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r20 = 1458(0x5b2, double:7.203E-321)
            r22 = 30
            r24 = 1
            r19.mo175913w(r20, r22, r24)
        L_0x02a4:
            java.lang.String r4 = r13.toString()
            java.lang.String r5 = "buildExtraInfoJson(data).toString()"
            gy3.C87412m.m108593f(r4, r5)
            java.lang.String r5 = ","
            java.lang.String r6 = ";"
            r7 = 0
            java.lang.String r4 = z04.C112551y.m153814n(r4, r5, r6, r7)
            java.lang.String r5 = "ExtraInfo"
            r6 = 1
            java.lang.String r4 = r3.mo86045b(r5, r4, r6)
            r3.f48422k = r4
            long r4 = r0.f57595E
            r3.f48421j = r4
            r4 = 21
            r3.f48423l = r4
            long r4 = r0.f57596F
            r3.f48424m = r4
            int r4 = r0.f57611U
            if (r4 != 0) goto L_0x02d2
            long r4 = r0.f57639l
            goto L_0x02d4
        L_0x02d2:
            r4 = 0
        L_0x02d4:
            r3.f48425n = r4
            long r6 = r3.f48420i
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x06eb
            long r4 = r3.f48419h
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x02ea
            long r4 = r0.f57603M
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x02f2
        L_0x02ea:
            long r4 = r0.f57594D
            r6 = 5
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x06eb
        L_0x02f2:
            java.lang.String r4 = r3.f48415d
            if (r4 == 0) goto L_0x02ff
            int r4 = r4.length()
            if (r4 != 0) goto L_0x02fd
            goto L_0x02ff
        L_0x02fd:
            r4 = 0
            goto L_0x0300
        L_0x02ff:
            r4 = 1
        L_0x0300:
            if (r4 == 0) goto L_0x0314
            java.lang.String r4 = r3.f48416e
            if (r4 == 0) goto L_0x030f
            int r4 = r4.length()
            if (r4 != 0) goto L_0x030d
            goto L_0x030f
        L_0x030d:
            r4 = 0
            goto L_0x0310
        L_0x030f:
            r4 = 1
        L_0x0310:
            if (r4 == 0) goto L_0x0314
            goto L_0x06eb
        L_0x0314:
            r4 = 4
            if (r1 == r4) goto L_0x0328
            r5 = 3
            if (r1 == r5) goto L_0x0328
            r5 = 1
            if (r1 == r5) goto L_0x0328
            r5 = 2
            if (r1 == r5) goto L_0x0328
            r5 = 6
            if (r1 == r5) goto L_0x0328
            if (r1 != r10) goto L_0x0326
            goto L_0x0328
        L_0x0326:
            r5 = 0
            goto L_0x0329
        L_0x0328:
            r5 = 1
        L_0x0329:
            if (r5 == 0) goto L_0x0361
            r3.mo86054n()
            java.lang.String r5 = "Finder.FinderLoadingTimeReporter"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "report"
            r6.append(r8)
            r8 = 20672(0x50c0, float:2.8968E-41)
            r6.append(r8)
            r8 = 32
            r6.append(r8)
            java.lang.String r8 = r3.mo1006q()
            java.lang.String r9 = "struct.toShowString()"
            gy3.C87412m.m108593f(r8, r9)
            java.lang.String r9 = "\r\n"
            java.lang.String r11 = " "
            r12 = 0
            java.lang.String r8 = z04.C112551y.m153814n(r8, r9, r11, r12)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
        L_0x0361:
            long r5 = r0.f57602L
            r8 = 600000(0x927c0, double:2.964394E-318)
            int r11 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r11 > 0) goto L_0x06be
            long r5 = r0.f57603M
            int r11 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r11 > 0) goto L_0x06be
            long r5 = r0.f57598H
            r8 = 0
            int r11 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r11 >= 0) goto L_0x037a
            goto L_0x06be
        L_0x037a:
            if (r1 == r4) goto L_0x0385
            r5 = 3
            if (r1 == r5) goto L_0x0385
            r5 = 1
            if (r1 != r5) goto L_0x0383
            goto L_0x0385
        L_0x0383:
            r5 = 0
            goto L_0x0386
        L_0x0385:
            r5 = 1
        L_0x0386:
            r8 = 1
            if (r5 == 0) goto L_0x04bc
            long r5 = r0.f57595E
            int r11 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r11 != 0) goto L_0x04bc
            long r5 = r0.f57599I
            r11 = 0
            int r13 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x03b0
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 1458(0x5b2, double:7.203E-321)
            r21 = 0
            r19 = 1458(0x5b2, double:7.203E-321)
            r18 = r11
            r23 = r5
            r18.mo175913w(r19, r21, r23)
            r21 = 3
            r23 = 1
            r19 = r12
            r18.mo175913w(r19, r21, r23)
        L_0x03b0:
            long r5 = r0.f57601K
            r11 = 0
            int r13 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x03ce
            com.tencent.mm.plugin.report.service.n r18 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r26 = 1458(0x5b2, double:7.203E-321)
            r28 = 1
            r25 = r18
            r30 = r5
            r25.mo175913w(r26, r28, r30)
            r19 = 1458(0x5b2, double:7.203E-321)
            r21 = 4
            r23 = 1
            r18.mo175913w(r19, r21, r23)
        L_0x03ce:
            long r5 = r0.f57599I
            r11 = 0
            int r13 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x03f6
            long r5 = r0.f57601K
            int r13 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x03f6
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 1458(0x5b2, double:7.203E-321)
            r21 = 2
            long r13 = r0.f57602L
            r19 = 1458(0x5b2, double:7.203E-321)
            r18 = r5
            r23 = r13
            r18.mo175913w(r19, r21, r23)
            r21 = 5
            r23 = 1
            r19 = r11
            r18.mo175913w(r19, r21, r23)
        L_0x03f6:
            long r5 = r0.f57598H
            r11 = 0
            int r13 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x04bc
            long r5 = r0.f57602L
            int r13 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x0457
            int r11 = r0.f57597G
            r12 = 1
            if (r11 == r12) goto L_0x043f
            r12 = 3
            if (r11 == r12) goto L_0x0428
            if (r11 == r4) goto L_0x040f
            goto L_0x0457
        L_0x040f:
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 1458(0x5b2, double:7.203E-321)
            r21 = 10
            r19 = 1458(0x5b2, double:7.203E-321)
            r18 = r11
            r23 = r5
            r18.mo175913w(r19, r21, r23)
            r21 = 11
            r23 = 1
            r19 = r12
            r18.mo175913w(r19, r21, r23)
            goto L_0x0457
        L_0x0428:
            com.tencent.mm.plugin.report.service.n r25 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r19 = 1458(0x5b2, double:7.203E-321)
            r21 = 16
            r18 = r25
            r23 = r5
            r18.mo175913w(r19, r21, r23)
            r26 = 1458(0x5b2, double:7.203E-321)
            r28 = 17
            r30 = 1
            r25.mo175913w(r26, r28, r30)
            goto L_0x0457
        L_0x043f:
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 1458(0x5b2, double:7.203E-321)
            r21 = 13
            r19 = 1458(0x5b2, double:7.203E-321)
            r18 = r11
            r23 = r5
            r18.mo175913w(r19, r21, r23)
            r21 = 14
            r23 = 1
            r19 = r12
            r18.mo175913w(r19, r21, r23)
        L_0x0457:
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 1458(0x5b2, double:7.203E-321)
            r28 = 20
            long r13 = r0.f57598H
            r26 = 1458(0x5b2, double:7.203E-321)
            r25 = r5
            r30 = r13
            r25.mo175913w(r26, r28, r30)
            r28 = 21
            r30 = 1
            r26 = r11
            r25.mo175913w(r26, r28, r30)
            long r11 = r0.f57627f
            long r13 = r0.f57625e
            long r30 = r11 - r13
            r11 = 0
            int r6 = (r30 > r11 ? 1 : (r30 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x0491
            r11 = 1458(0x5b2, double:7.203E-321)
            r28 = 23
            r26 = 1458(0x5b2, double:7.203E-321)
            r25 = r5
            r25.mo175913w(r26, r28, r30)
            r28 = 24
            r30 = 1
            r26 = r11
            r25.mo175913w(r26, r28, r30)
        L_0x0491:
            long r11 = r0.f57639l
            long r13 = r0.f57640m
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 >= 0) goto L_0x04a0
            long r11 = r13 - r11
            r30 = r11
            r11 = 0
            goto L_0x04a4
        L_0x04a0:
            r11 = 0
            r30 = 0
        L_0x04a4:
            int r6 = (r30 > r11 ? 1 : (r30 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x04bc
            r11 = 1458(0x5b2, double:7.203E-321)
            r28 = 26
            r26 = 1458(0x5b2, double:7.203E-321)
            r25 = r5
            r25.mo175913w(r26, r28, r30)
            r28 = 27
            r30 = 1
            r26 = r11
            r25.mo175913w(r26, r28, r30)
        L_0x04bc:
            com.tencent.mm.autogen.mmdata.rpt.FinderFeedLoadingTimeExStruct r5 = new com.tencent.mm.autogen.mmdata.rpt.FinderFeedLoadingTimeExStruct
            r5.<init>()
            java.lang.String r6 = r3.f48415d
            java.lang.String r11 = "Sessionid"
            r12 = 1
            java.lang.String r6 = r5.mo86045b(r11, r6, r12)
            r5.f48392d = r6
            java.lang.String r6 = r3.f48416e
            java.lang.String r11 = "ClickTabContextid"
            java.lang.String r6 = r5.mo86045b(r11, r6, r12)
            r5.f48393e = r6
            long r11 = r3.f48417f
            r5.f48394f = r11
            long r11 = r3.f48418g
            r5.f48395g = r11
            long r11 = r3.f48419h
            r5.f48396h = r11
            long r11 = r3.f48420i
            r5.f48397i = r11
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r11 = "enterShowPreloadCacheDirectly"
            int r12 = r0.f57612V
            r6.put(r11, r12)
            java.lang.String r11 = "findPreloadTpSwitchOn"
            up1.f r12 = up1.C37521f.f99374d
            boolean r13 = r12.mo61166T()
            r6.put(r11, r13)
            java.lang.String r11 = "findPreloadTpAttachSurface"
            boolean r12 = r12.mo61167U()
            r6.put(r11, r12)
            java.lang.String r11 = "finderHomeInitLogicOptimize"
            pe1.c<java.lang.Integer> r12 = up1.C37521f.f99398f6
            java.lang.Object r12 = r12.mo60266n()
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            r6.put(r11, r12)
            java.lang.String r11 = "finderExitPreloadFeed"
            pe1.c<java.lang.Integer> r12 = up1.C37521f.f99407g6
            java.lang.Object r12 = r12.mo60266n()
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            r6.put(r11, r12)
            java.lang.String r11 = "foregroundPrefetch"
            di3.d r12 = di3.C86312j.m106911c(r2)
            tf0.p1 r12 = (tf0.C64916p1) r12
            te3.vl1 r12 = r12.mo76676RO()
            boolean r12 = r12.f185933M
            r6.put(r11, r12)
            java.lang.String r11 = "foregroundPrefetchIntervalSec"
            di3.d r2 = di3.C86312j.m106911c(r2)
            tf0.p1 r2 = (tf0.C64916p1) r2
            te3.vl1 r2 = r2.mo76676RO()
            int r2 = r2.f185934N
            r6.put(r11, r2)
            java.lang.String r2 = "finderEnterShowUnreadFeed"
            pe1.c<java.lang.Integer> r11 = up1.C37521f.f99416h6
            java.lang.Object r11 = r11.mo60266n()
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r6.put(r2, r11)
            java.lang.String r2 = r6.toString()
            java.lang.String r6 = "JSONObject().apply {\n   …e())\n        }.toString()"
            gy3.C87412m.m108593f(r2, r6)
            java.lang.String r6 = ","
            java.lang.String r11 = ";"
            r12 = 0
            java.lang.String r2 = z04.C112551y.m153814n(r2, r6, r11, r12)
            java.lang.String r6 = "ExtraInfo"
            r11 = 1
            java.lang.String r2 = r5.mo86045b(r6, r2, r11)
            r5.f48399k = r2
            long r11 = r3.f48421j
            r5.f48398j = r11
            long r11 = r3.f48423l
            r5.f48400l = r11
            long r11 = r3.f48424m
            r5.f48401m = r11
            long r11 = r3.f48425n
            r5.f48402n = r11
            long r11 = r0.f57598H
            r5.f48403o = r11
            long r13 = r0.f57628f0
            r5.f48404p = r13
            long r11 = r11 + r13
            r5.f48405q = r11
            long r11 = r0.f57599I
            r5.f48406r = r11
            long r11 = r0.f57601K
            r5.f48407s = r11
            long r11 = r0.f57602L
            r5.f48408t = r11
            long r11 = r0.f57603M
            r5.f48409u = r11
            long r11 = r0.f57604N
            r5.f48410v = r11
            long r11 = r0.f57605O
            r5.f48411w = r11
            int r2 = r0.f57606P
            long r11 = (long) r2
            r5.f48412x = r11
            int r2 = r0.f57622c0
            long r11 = (long) r2
            r5.f48413y = r11
            int r2 = r0.f57609S
            long r11 = (long) r2
            r5.f48414z = r11
            int r2 = r0.f57613W
            long r11 = (long) r2
            r5.f48374A = r11
            int r2 = r0.f57597G
            long r11 = (long) r2
            r5.f48375B = r11
            int r2 = r0.f57611U
            long r11 = (long) r2
            r5.f48376C = r11
            int r2 = r0.f57624d0
            long r11 = (long) r2
            r5.f48377D = r11
            int r2 = r0.f57626e0
            long r11 = (long) r2
            r5.f48378E = r11
            long r11 = r0.f57630g0
            r5.f48379F = r11
            long r11 = r0.f57596F
            r13 = 2
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x05e1
            boolean r2 = r0.f57653z
            if (r2 == 0) goto L_0x05ed
        L_0x05e1:
            long r11 = r0.f57632h0
            r5.f48379F = r11
            r7 = 0
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x05ed
            r5.f48411w = r7
        L_0x05ed:
            int r2 = r0.f57608R
            long r6 = (long) r2
            r5.f48380G = r6
            long r6 = r0.f57634i0
            r5.f48381H = r6
            te3.iq r2 = r0.f57638k0
            if (r2 == 0) goto L_0x060d
            long r6 = r2.f259606j
            long r8 = r2.f259600d
            long r6 = r6 - r8
            r8 = 0
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 >= 0) goto L_0x0606
            goto L_0x0607
        L_0x0606:
            r8 = r6
        L_0x0607:
            r5.f48385L = r8
            long r6 = r2.f259608o
            r5.f48386M = r6
        L_0x060d:
            java.lang.String r2 = r0.f57651x
            java.lang.String r6 = "videoPlayTraceJson"
            r7 = 1
            java.lang.String r2 = r5.mo86045b(r6, r2, r7)
            r5.f48387N = r2
            long r8 = r0.f57650w
            r5.f48388O = r8
            long r8 = r0.f57615Y
            r5.f48389P = r8
            java.lang.String r2 = r0.f57614X
            java.lang.String r6 = "enterRedDotTipsId"
            java.lang.String r2 = r5.mo86045b(r6, r2, r7)
            r5.f48390Q = r2
            long r8 = r0.f57616Z
            r5.f48391R = r8
            java.lang.String r2 = "Finder.FinderLoadingTimeReporter"
            dp1.e0$b r6 = new dp1.e0$b
            r6.<init>(r5)
            o40.C61926c.m72661F(r2, r6)
            if (r1 == r4) goto L_0x0643
            r2 = 3
            if (r1 == r2) goto L_0x0643
            if (r1 != r7) goto L_0x0641
            goto L_0x0643
        L_0x0641:
            r7 = 0
            goto L_0x0644
        L_0x0643:
            r7 = 1
        L_0x0644:
            if (r7 == 0) goto L_0x0652
            java.util.HashSet<dp1.e0$a> r2 = f57590h
            monitor-enter(r2)
            r2.add(r0)     // Catch:{ all -> 0x064e }
            monitor-exit(r2)
            goto L_0x0652
        L_0x064e:
            r0 = move-exception
            r1 = r0
            monitor-exit(r2)
            throw r1
        L_0x0652:
            java.lang.String r2 = r3.f48422k
            java.lang.String r3 = "struct.extraInfo"
            gy3.C87412m.m108593f(r2, r3)
            long r3 = r0.f57603M
            java.lang.String r0 = java.lang.String.valueOf(r3)
            com.tencent.mm.autogen.mmdata.rpt.FinderGlobalLoadingRptStruct r3 = new com.tencent.mm.autogen.mmdata.rpt.FinderGlobalLoadingRptStruct
            r3.<init>()
            r4 = 10
            r3.f155345d = r4
            r4 = 6
            if (r1 == r4) goto L_0x067c
            if (r1 == r10) goto L_0x067c
            r4 = 7
            if (r1 == r4) goto L_0x067c
            r4 = 8
            if (r1 == r4) goto L_0x067c
            r4 = 9
            if (r1 != r4) goto L_0x067a
            goto L_0x067c
        L_0x067a:
            r7 = 0
            goto L_0x067d
        L_0x067c:
            r7 = 1
        L_0x067d:
            if (r7 == 0) goto L_0x0681
            r8 = r13
            goto L_0x0683
        L_0x0681:
            r8 = 1
        L_0x0683:
            r3.f155346e = r8
            r3.mo76254s(r2)
            java.lang.String r1 = "majorData"
            r2 = 1
            java.lang.String r0 = r3.mo86045b(r1, r0, r2)
            r3.f155349h = r0
            r3.mo86054n()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "report21680 info:"
            r0.append(r1)
            java.lang.String r1 = r3.mo1006q()
            java.lang.String r2 = "struct.toShowString()"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r2 = "\r\n"
            java.lang.String r3 = " "
            r4 = 0
            java.lang.String r1 = z04.C112551y.m153814n(r1, r2, r3, r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FinderLoadingTimeReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return
        L_0x06be:
            java.lang.String r1 = "Finder.FinderLoadingTimeReporter"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "report20672and20713 waiting time out cgiAllCost = "
            r2.append(r3)
            long r3 = r0.f57602L
            r2.append(r3)
            java.lang.String r3 = ", loadCost = "
            r2.append(r3)
            long r3 = r0.f57603M
            r2.append(r3)
            java.lang.String r3 = ", enterCose = "
            r2.append(r3)
            long r3 = r0.f57598H
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            return
        L_0x06eb:
            java.lang.String r0 = "Finder.FinderLoadingTimeReporter"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "report20672and20713 error info:"
            r1.append(r2)
            java.lang.String r2 = r3.mo1006q()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C20480e0.mo32044s(dp1.e0$a, int):void");
    }

    /* renamed from: t */
    public final void mo32045t(int i) {
        if (i != -1) {
            ConcurrentHashMap<Integer, C20481a> concurrentHashMap = f57589g;
            C20481a aVar = concurrentHashMap.get(Integer.valueOf(i));
            if (aVar != null) {
                f57583a.mo32044s(aVar, i);
            }
            concurrentHashMap.remove(Integer.valueOf(i));
            return;
        }
        for (Map.Entry next : f57589g.entrySet()) {
            f57583a.mo32044s((C20481a) next.getValue(), ((Number) next.getKey()).intValue());
        }
        f57589g.clear();
    }

    /* renamed from: u */
    public final void mo32046u(int i, C49712hj1 hj12) {
        C20481a e = mo32032e(i);
        if (e != null) {
            if (!(e.f57617a && !e.f57619b)) {
                e = null;
            }
            if (e != null) {
                if (hj12 != null) {
                    String str = hj12.f134670d;
                    String str2 = "";
                    if (str == null) {
                        str = str2;
                    }
                    e.f57591A = str;
                    String str3 = hj12.f134672f;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    e.f57592B = str2;
                    e.f57593C = (long) hj12.f134675i;
                }
                e.f57619b = true;
                long c = C31543z5.m39453c();
                e.f57640m = c;
                if (e.f57631h > 0 && e.f57633i == 0) {
                    e.f57633i = c;
                }
                if (e.f57635j > 0 && e.f57637k == 0) {
                    e.f57637k = c;
                }
                e.f57595E = 3;
                e.f57622c0 = 3;
                f57583a.mo32044s(e, i);
            }
        }
    }

    /* renamed from: v */
    public final void mo32047v(int i, C49712hj1 hj12) {
        C20481a e = mo32032e(i);
        if (e != null) {
            if (!(e.f57617a && !e.f57619b)) {
                e = null;
            }
            if (e != null) {
                if (hj12 != null) {
                    String str = hj12.f134670d;
                    String str2 = "";
                    if (str == null) {
                        str = str2;
                    }
                    e.f57591A = str;
                    String str3 = hj12.f134672f;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    e.f57592B = str2;
                    e.f57593C = (long) hj12.f134675i;
                }
                if (e.f57595E == 0) {
                    long c = C31543z5.m39453c();
                    e.f57640m = c;
                    e.f57607Q = 3;
                    if (e.f57631h > 0 && e.f57633i == 0) {
                        e.f57633i = c;
                        e.f57607Q = 1;
                    }
                    if (e.f57635j > 0 && e.f57637k == 0) {
                        e.f57637k = c;
                        e.f57607Q = 2;
                    }
                    e.f57620b0 = 2;
                    e.f57622c0 = 2;
                    e.f57595E = 2;
                    e.f57619b = true;
                    f57583a.mo32044s(e, i);
                }
            }
        }
    }
}
