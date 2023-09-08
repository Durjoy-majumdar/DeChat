package mr1;

import android.util.ArraySet;
import cm1.C55015f1;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderVideoDownloadPlayStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.TrafficStats;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import di3.C86312j;
import e03.C58469b;
import eb0.C31543z5;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o40.C61926c;
import p1081gi.C98121d;
import p1081gi.C98127h;
import p663qo.C101213l;
import rx3.C13598b0;
import sx3.C110818d0;
import tf0.C64916p1;
import wp1.C66167g;
import z04.C112551y;

/* renamed from: mr1.b */
public final class C25026b {

    /* renamed from: a */
    public final ConcurrentHashMap<String, C25027a> f71360a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public final ConcurrentHashMap<String, C25027a> f71361b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public final ConcurrentHashMap<String, C25029d> f71362c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public long f71363d;

    /* renamed from: e */
    public long f71364e;

    /* renamed from: f */
    public long f71365f;

    /* renamed from: g */
    public long f71366g;

    /* renamed from: mr1.b$a */
    public static final class C25027a {

        /* renamed from: U */
        public static final C25028a f71367U = new C25028a((C8480h) null);

        /* renamed from: A */
        public boolean f71368A = false;

        /* renamed from: B */
        public boolean f71369B = false;

        /* renamed from: C */
        public boolean f71370C = false;

        /* renamed from: D */
        public boolean f71371D = false;

        /* renamed from: E */
        public boolean f71372E = false;

        /* renamed from: F */
        public long f71373F = 0;

        /* renamed from: G */
        public long f71374G = 0;

        /* renamed from: H */
        public long f71375H = 0;

        /* renamed from: I */
        public boolean f71376I = false;

        /* renamed from: J */
        public boolean f71377J = false;

        /* renamed from: K */
        public boolean f71378K = false;

        /* renamed from: L */
        public boolean f71379L = false;

        /* renamed from: M */
        public boolean f71380M = false;

        /* renamed from: N */
        public boolean f71381N = false;

        /* renamed from: O */
        public long f71382O = 0;

        /* renamed from: P */
        public long f71383P = 0;

        /* renamed from: Q */
        public String f71384Q = "";

        /* renamed from: R */
        public ArraySet<Integer> f71385R;

        /* renamed from: S */
        public C25027a f71386S;

        /* renamed from: T */
        public String f71387T;

        /* renamed from: a */
        public long f71388a = 0;

        /* renamed from: b */
        public long f71389b = 0;

        /* renamed from: c */
        public long f71390c = 0;

        /* renamed from: d */
        public long f71391d = 0;

        /* renamed from: e */
        public String f71392e = "";

        /* renamed from: f */
        public long f71393f = 0;

        /* renamed from: g */
        public long f71394g = 0;

        /* renamed from: h */
        public long f71395h = 0;

        /* renamed from: i */
        public String f71396i = "";

        /* renamed from: j */
        public long f71397j = 0;

        /* renamed from: k */
        public String f71398k = "";

        /* renamed from: l */
        public String f71399l = "";

        /* renamed from: m */
        public long f71400m = 0;

        /* renamed from: n */
        public long f71401n = 0;

        /* renamed from: o */
        public long f71402o = 0;

        /* renamed from: p */
        public long f71403p = 0;

        /* renamed from: q */
        public long f71404q = 0;

        /* renamed from: r */
        public long f71405r = 0;

        /* renamed from: s */
        public long f71406s = 0;

        /* renamed from: t */
        public long f71407t = 0;

        /* renamed from: u */
        public long f71408u = 0;

        /* renamed from: v */
        public String f71409v = "";

        /* renamed from: w */
        public long f71410w = 0;

        /* renamed from: x */
        public long f71411x = 0;

        /* renamed from: y */
        public long f71412y = 0;

        /* renamed from: z */
        public boolean f71413z = false;

        /* renamed from: mr1.b$a$a */
        public static final class C25028a {
            public C25028a(C8480h hVar) {
            }

            /* renamed from: a */
            public final C25027a mo52136a(long j, String str, C58469b bVar) {
                C87412m.m108594g(str, "mediaId");
                C87412m.m108594g(bVar, "taskContext");
                C25027a aVar = new C25027a();
                aVar.f71388a = (long) bVar.f167445a;
                aVar.f71389b = (long) bVar.f167446b;
                aVar.f71390c = (long) bVar.f167447c;
                aVar.f71391d = (long) bVar.f167448d;
                aVar.f71392e = C61926c.m72691p(j);
                String valueOf = String.valueOf(C31543z5.m39451a());
                C87412m.m108594g(valueOf, "<set-?>");
                aVar.f71398k = valueOf;
                long j2 = bVar.f167449e;
                aVar.f71393f = j2 / ((long) 1000);
                aVar.f71394g = j2;
                aVar.f71409v = str;
                aVar.f71410w = C31543z5.m39451a();
                return aVar;
            }

            /* renamed from: b */
            public final void mo52137b(C25027a aVar, C55015f1 f1Var) {
                aVar.f71395h = f1Var.field_totalSize;
                String str = f1Var.field_fileFormat;
                if (str == null) {
                    str = "";
                }
                aVar.f71396i = str;
                try {
                    aVar.f71400m = (long) ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76703jw();
                } catch (Throwable th) {
                    Log.m105928w("FinderNetworkFlowReport", "generateClientStatus e:" + th);
                }
            }

            /* renamed from: c */
            public final void mo52138c(C25027a aVar, C55015f1 f1Var) {
                C87412m.m108594g(aVar, "downloadReportData");
                if (f1Var == null) {
                    Log.m105928w("FinderNetworkFlowReport", aVar.f71384Q + " updateFromMediaCacheOnStart return for " + f1Var);
                    return;
                }
                aVar.f71373F = f1Var.field_cacheSize;
                String valueOf = String.valueOf(C31543z5.m39451a());
                C87412m.m108594g(valueOf, "<set-?>");
                aVar.f71398k = valueOf;
                mo52137b(aVar, f1Var);
            }

            /* renamed from: d */
            public final void mo52139d(C25027a aVar, C55015f1 f1Var) {
                C87412m.m108594g(aVar, "downloadReportData");
                if (f1Var == null) {
                    Log.m105928w("FinderNetworkFlowReport", aVar.f71384Q + " updateFromMediaCacheOnStop return for " + f1Var);
                } else if (aVar.f71378K) {
                    Log.m105924i("FinderNetworkFlowReport", "updateFromMediaCacheOnStop return for result item:" + aVar);
                } else {
                    aVar.f71374G = f1Var.field_cacheSize;
                    String valueOf = String.valueOf(C31543z5.m39451a());
                    C87412m.m108594g(valueOf, "<set-?>");
                    aVar.f71399l = valueOf;
                    aVar.f71397j = aVar.f71374G - aVar.f71373F;
                    aVar.f71411x = C31543z5.m39451a();
                    mo52137b(aVar, f1Var);
                }
            }

            /* renamed from: e */
            public final void mo52140e(C25027a aVar, C98121d dVar) {
                C87412m.m108594g(aVar, "downloadReportData");
                C87412m.m108594g(dVar, "result");
                aVar.f71395h = dVar.field_fileLength;
                String str = dVar.field_videoFlag;
                C87412m.m108593f(str, "result.field_videoFlag");
                aVar.f71396i = str;
                aVar.f71397j = dVar.field_recvedBytes;
                String valueOf = String.valueOf(dVar.field_startTime);
                C87412m.m108594g(valueOf, "<set-?>");
                aVar.f71398k = valueOf;
                String valueOf2 = String.valueOf(dVar.field_endTime);
                C87412m.m108594g(valueOf2, "<set-?>");
                aVar.f71399l = valueOf2;
                aVar.f71400m = (long) dVar.f287614f;
                aVar.f71378K = true;
                aVar.f71411x = C31543z5.m39451a();
                String str2 = dVar.f287621m;
                C87412m.m108593f(str2, "result.profile");
                aVar.f71387T = C112551y.m153814n(str2, ",", ";", false);
            }
        }

        public C25027a() {
            ArraySet<Integer> arraySet = new ArraySet<>();
            this.f71385R = arraySet;
            this.f71386S = null;
            this.f71387T = "";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25027a)) {
                return false;
            }
            C25027a aVar = (C25027a) obj;
            return this.f71388a == aVar.f71388a && this.f71389b == aVar.f71389b && this.f71390c == aVar.f71390c && this.f71391d == aVar.f71391d && C87412m.m108589b(this.f71392e, aVar.f71392e) && this.f71393f == aVar.f71393f && this.f71394g == aVar.f71394g && this.f71395h == aVar.f71395h && C87412m.m108589b(this.f71396i, aVar.f71396i) && this.f71397j == aVar.f71397j && C87412m.m108589b(this.f71398k, aVar.f71398k) && C87412m.m108589b(this.f71399l, aVar.f71399l) && this.f71400m == aVar.f71400m && this.f71401n == aVar.f71401n && this.f71402o == aVar.f71402o && this.f71403p == aVar.f71403p && this.f71404q == aVar.f71404q && this.f71405r == aVar.f71405r && this.f71406s == aVar.f71406s && this.f71407t == aVar.f71407t && this.f71408u == aVar.f71408u && C87412m.m108589b(this.f71409v, aVar.f71409v) && this.f71410w == aVar.f71410w && this.f71411x == aVar.f71411x && this.f71412y == aVar.f71412y && this.f71413z == aVar.f71413z && this.f71368A == aVar.f71368A && this.f71369B == aVar.f71369B && this.f71370C == aVar.f71370C && this.f71371D == aVar.f71371D && this.f71372E == aVar.f71372E && this.f71373F == aVar.f71373F && this.f71374G == aVar.f71374G && this.f71375H == aVar.f71375H && this.f71376I == aVar.f71376I && this.f71377J == aVar.f71377J && this.f71378K == aVar.f71378K && this.f71379L == aVar.f71379L && this.f71380M == aVar.f71380M && this.f71381N == aVar.f71381N && this.f71382O == aVar.f71382O && this.f71383P == aVar.f71383P && C87412m.m108589b(this.f71384Q, aVar.f71384Q) && C87412m.m108589b(this.f71385R, aVar.f71385R) && C87412m.m108589b(this.f71386S, aVar.f71386S) && C87412m.m108589b(this.f71387T, aVar.f71387T);
        }

        public int hashCode() {
            long j = this.f71388a;
            long j2 = this.f71389b;
            long j3 = this.f71390c;
            long j4 = this.f71391d;
            long j5 = this.f71393f;
            long j6 = this.f71394g;
            long j7 = this.f71395h;
            long j8 = this.f71397j;
            long j9 = this.f71400m;
            long j15 = this.f71401n;
            long j16 = this.f71402o;
            long j17 = this.f71403p;
            long j18 = this.f71404q;
            long j19 = this.f71405r;
            long j25 = this.f71406s;
            long j26 = this.f71407t;
            long j27 = this.f71408u;
            long j28 = this.f71410w;
            long j29 = this.f71411x;
            long j35 = this.f71412y;
            int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f71392e.hashCode()) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + this.f71396i.hashCode()) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.f71398k.hashCode()) * 31) + this.f71399l.hashCode()) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31) + ((int) (j15 ^ (j15 >>> 32)))) * 31) + ((int) (j16 ^ (j16 >>> 32)))) * 31) + ((int) (j17 ^ (j17 >>> 32)))) * 31) + ((int) (j18 ^ (j18 >>> 32)))) * 31) + ((int) (j19 ^ (j19 >>> 32)))) * 31) + ((int) (j25 ^ (j25 >>> 32)))) * 31) + ((int) (j26 ^ (j26 >>> 32)))) * 31) + ((int) (j27 ^ (j27 >>> 32)))) * 31) + this.f71409v.hashCode()) * 31) + ((int) (j28 ^ (j28 >>> 32)))) * 31) + ((int) (j29 ^ (j29 >>> 32)))) * 31) + ((int) (j35 ^ (j35 >>> 32)))) * 31;
            boolean z = this.f71413z;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f71368A;
            if (z3) {
                z3 = true;
            }
            int i2 = (i + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f71369B;
            if (z4) {
                z4 = true;
            }
            int i3 = (i2 + (z4 ? 1 : 0)) * 31;
            boolean z5 = this.f71370C;
            if (z5) {
                z5 = true;
            }
            int i4 = (i3 + (z5 ? 1 : 0)) * 31;
            boolean z6 = this.f71371D;
            if (z6) {
                z6 = true;
            }
            int i5 = (i4 + (z6 ? 1 : 0)) * 31;
            boolean z7 = this.f71372E;
            if (z7) {
                z7 = true;
            }
            long j36 = this.f71373F;
            long j37 = this.f71374G;
            long j38 = this.f71375H;
            int i6 = (((((((i5 + (z7 ? 1 : 0)) * 31) + ((int) (j36 ^ (j36 >>> 32)))) * 31) + ((int) (j37 ^ (j37 >>> 32)))) * 31) + ((int) (j38 ^ (j38 >>> 32)))) * 31;
            boolean z8 = this.f71376I;
            if (z8) {
                z8 = true;
            }
            int i7 = (i6 + (z8 ? 1 : 0)) * 31;
            boolean z9 = this.f71377J;
            if (z9) {
                z9 = true;
            }
            int i8 = (i7 + (z9 ? 1 : 0)) * 31;
            boolean z15 = this.f71378K;
            if (z15) {
                z15 = true;
            }
            int i9 = (i8 + (z15 ? 1 : 0)) * 31;
            boolean z16 = this.f71379L;
            if (z16) {
                z16 = true;
            }
            int i15 = (i9 + (z16 ? 1 : 0)) * 31;
            boolean z17 = this.f71380M;
            if (z17) {
                z17 = true;
            }
            int i16 = (i15 + (z17 ? 1 : 0)) * 31;
            boolean z18 = this.f71381N;
            if (!z18) {
                z2 = z18;
            }
            long j39 = this.f71382O;
            long j44 = this.f71383P;
            int hashCode2 = (((((((((i16 + (z2 ? 1 : 0)) * 31) + ((int) (j39 ^ (j39 >>> 32)))) * 31) + ((int) (j44 ^ (j44 >>> 32)))) * 31) + this.f71384Q.hashCode()) * 31) + this.f71385R.hashCode()) * 31;
            C25027a aVar = this.f71386S;
            return ((hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f71387T.hashCode();
        }

        public String toString() {
            return "DownloadReportData(actionType=" + this.f71388a + ", downloadType=" + this.f71389b + ", commentScene=" + this.f71390c + ", downloadStrategy=" + this.f71391d + ", feedId=" + this.f71392e + ", durationS=" + this.f71393f + ", durationMs=" + this.f71394g + ", fileSize=" + this.f71395h + ", videoFormat=" + this.f71396i + ", downloadSize=" + this.f71397j + ", downloadStartTime=" + this.f71398k + ", downloadEndTime=" + this.f71399l + ", netType=" + this.f71400m + ", uniqPlayTime=" + this.f71401n + ", realPlayTime=" + this.f71402o + ", playTime=" + this.f71403p + ", playCount=" + this.f71404q + ", playStartTime=" + this.f71405r + ", playEndTime=" + this.f71406s + ", playStartPos=" + this.f71407t + ", playStopPos=" + this.f71408u + ", mediaId=" + this.f71409v + ", startRecordTimeMs=" + this.f71410w + ", stopRecordTimeMs=" + this.f71411x + ", playSessionIndex=" + this.f71412y + ", startPlayHit=" + this.f71413z + ", stopPlayHit=" + this.f71368A + ", startDownloaderHit=" + this.f71369B + ", stopDownloaderHit=" + this.f71370C + ", startPreRenderHit=" + this.f71371D + ", stopPreRenderHit=" + this.f71372E + ", startPlayCacheSize=" + this.f71373F + ", stopPlayCacheSize=" + this.f71374G + ", downloaderCompleteSizeInPlaySession=" + this.f71375H + ", playerComeStopState=" + this.f71376I + ", downloaderComeStopState=" + this.f71377J + ", updateFromDownloadResult=" + this.f71378K + ", allFileDownloadCompleteBeforePlay=" + this.f71379L + ", allFileDownloadCompleteInPlaying=" + this.f71380M + ", segmentSizeInPreRender=" + this.f71381N + ", lastPauseTimeMs=" + this.f71382O + ", totalPauseTime=" + this.f71383P + ", tag=" + this.f71384Q + ", progressList=" + this.f71385R + ", preRenderItem=" + this.f71386S + ", netConnInfo=" + this.f71387T + ')';
        }
    }

    /* renamed from: mr1.b$d */
    public static final class C25029d {

        /* renamed from: a */
        public boolean f71414a;

        /* renamed from: b */
        public boolean f71415b;

        /* renamed from: c */
        public boolean f71416c;

        /* renamed from: d */
        public boolean f71417d;

        /* renamed from: e */
        public boolean f71418e;

        /* renamed from: f */
        public ArrayList<C25027a> f71419f;

        public C25029d(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ArrayList<C25027a> arrayList) {
            C87412m.m108594g(arrayList, "playItemList");
            this.f71414a = z;
            this.f71415b = z2;
            this.f71416c = z3;
            this.f71417d = z4;
            this.f71418e = z5;
            this.f71419f = arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25029d)) {
                return false;
            }
            C25029d dVar = (C25029d) obj;
            return this.f71414a == dVar.f71414a && this.f71415b == dVar.f71415b && this.f71416c == dVar.f71416c && this.f71417d == dVar.f71417d && this.f71418e == dVar.f71418e && C87412m.m108589b(this.f71419f, dVar.f71419f);
        }

        public int hashCode() {
            boolean z = this.f71414a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f71415b;
            if (z3) {
                z3 = true;
            }
            int i2 = (i + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f71416c;
            if (z4) {
                z4 = true;
            }
            int i3 = (i2 + (z4 ? 1 : 0)) * 31;
            boolean z5 = this.f71417d;
            if (z5) {
                z5 = true;
            }
            int i4 = (i3 + (z5 ? 1 : 0)) * 31;
            boolean z6 = this.f71418e;
            if (!z6) {
                z2 = z6;
            }
            return ((i4 + (z2 ? 1 : 0)) * 31) + this.f71419f.hashCode();
        }

        public String toString() {
            return "PlaySession(hitPrepare=" + this.f71414a + ", hitStart=" + this.f71415b + ", hitStop=" + this.f71416c + ", allFileDownloadComplete=" + this.f71417d + ", onlyPreRender=" + this.f71418e + ", playItemList=" + this.f71419f + ')';
        }
    }

    /* renamed from: mr1.b$e */
    public static final class C25030e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f71420d;

        /* renamed from: e */
        public final /* synthetic */ String f71421e;

        /* renamed from: f */
        public final /* synthetic */ C58469b f71422f;

        /* renamed from: g */
        public final /* synthetic */ C55015f1 f71423g;

        /* renamed from: h */
        public final /* synthetic */ C25026b f71424h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25030e(long j, String str, C58469b bVar, C55015f1 f1Var, C25026b bVar2) {
            super(0);
            this.f71420d = j;
            this.f71421e = str;
            this.f71422f = bVar;
            this.f71423g = f1Var;
            this.f71424h = bVar2;
        }

        public Object invoke() {
            C25027a aVar;
            C13598b0 b0Var;
            C25027a aVar2;
            C25030e eVar;
            C25027a a = C25027a.f71367U.mo52136a(this.f71420d, this.f71421e, this.f71422f);
            String str = this.f71422f.f167450f;
            C87412m.m108594g(str, "<set-?>");
            a.f71384Q = str;
            a.f71373F = this.f71423g.field_cacheSize;
            C25027a aVar3 = this.f71424h.f71360a.get(this.f71421e);
            if (aVar3 != null) {
                String str2 = this.f71421e;
                long j = this.f71420d;
                C25026b bVar = this.f71424h;
                aVar = a;
                long a2 = C31543z5.m39451a() - aVar3.f71410w;
                Log.m105928w("FinderNetworkFlowReport", "PRELOAD_startPreload " + aVar3.f71384Q + " duplicated recentRecordDiffMs:" + a2 + " mediaId:" + str2 + " feedId:" + C61926c.m72691p(j) + " startRecordMs:" + aVar3.f71410w + " size:" + bVar.f71360a.size() + " list:");
                b0Var = C13598b0.f38549a;
            } else {
                aVar = a;
                b0Var = null;
            }
            if (b0Var == null) {
                eVar = this;
                C25026b bVar2 = eVar.f71424h;
                String str3 = eVar.f71421e;
                long j2 = eVar.f71420d;
                StringBuilder sb = new StringBuilder();
                sb.append("PRELOAD_startPreload ");
                aVar2 = aVar;
                sb.append(aVar2.f71384Q);
                sb.append(" mediaId:");
                sb.append(str3);
                sb.append(" feedId:");
                sb.append(C61926c.m72691p(j2));
                sb.append(" size:");
                sb.append(bVar2.f71360a.size());
                sb.append(" list:");
                Log.m105924i("FinderNetworkFlowReport", sb.toString());
            } else {
                eVar = this;
                aVar2 = aVar;
            }
            eVar.f71424h.f71360a.put(eVar.f71421e, aVar2);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: mr1.b$f */
    public static final class C25031f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C25026b f71425d;

        /* renamed from: e */
        public final /* synthetic */ String f71426e;

        /* renamed from: f */
        public final /* synthetic */ String f71427f;

        /* renamed from: g */
        public final /* synthetic */ C98121d f71428g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25031f(C25026b bVar, String str, String str2, C98121d dVar) {
            super(0);
            this.f71425d = bVar;
            this.f71426e = str;
            this.f71427f = str2;
            this.f71428g = dVar;
        }

        public Object invoke() {
            C13598b0 b0Var;
            C25027a remove = this.f71425d.f71360a.remove(this.f71426e);
            if (remove != null) {
                String str = this.f71427f;
                String str2 = this.f71426e;
                C25026b bVar = this.f71425d;
                C98121d dVar = this.f71428g;
                Log.m105924i("FinderNetworkFlowReport", "PRELOAD_stopPreload " + remove.f71384Q + ' ' + str + " mediaId:" + str2 + " size:" + bVar.f71360a.size());
                C25027a.f71367U.mo52140e(remove, dVar);
                long j = dVar.field_recvedTotalBytes;
                remove.f71397j = j;
                bVar.mo52126c(j);
                bVar.mo52129f(remove, "stopPreload");
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                C25026b bVar2 = this.f71425d;
                String str3 = this.f71426e;
                String str4 = this.f71427f;
                Log.m105928w("FinderNetworkFlowReport", "PRELOAD_stopPreload hit null mediaId:" + str3 + ' ' + str4 + " return for size:" + bVar2.f71360a.size() + " list:");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: mr1.b$b */
    public static final class C25032b {

        /* renamed from: a */
        public C25033c f71429a;

        /* renamed from: b */
        public C32226l<? super C25033c, C13598b0> f71430b;

        /* renamed from: a */
        public final void mo52144a(C32226l<? super C25033c, C13598b0> lVar) {
            this.f71430b = lVar;
            C25033c cVar = this.f71429a;
            if (cVar != null) {
                if (lVar != null) {
                    C87412m.m108591d(cVar);
                    lVar.invoke(cVar);
                }
                this.f71430b = null;
            }
        }
    }

    /* renamed from: mr1.b$c */
    public static final class C25033c {

        /* renamed from: a */
        public boolean f71431a;

        /* renamed from: b */
        public final C55015f1 f71432b;

        /* renamed from: c */
        public C55015f1 f71433c;

        /* renamed from: d */
        public C98121d f71434d;

        public C25033c(boolean z, C55015f1 f1Var, C55015f1 f1Var2, C98121d dVar) {
            this.f71431a = z;
            this.f71432b = f1Var;
            this.f71433c = f1Var2;
            this.f71434d = dVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25033c)) {
                return false;
            }
            C25033c cVar = (C25033c) obj;
            return this.f71431a == cVar.f71431a && C87412m.m108589b(this.f71432b, cVar.f71432b) && C87412m.m108589b(this.f71433c, cVar.f71433c) && C87412m.m108589b(this.f71434d, cVar.f71434d);
        }

        public int hashCode() {
            boolean z = this.f71431a;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            C55015f1 f1Var = this.f71432b;
            int i2 = 0;
            int hashCode = (i + (f1Var == null ? 0 : f1Var.hashCode())) * 31;
            C55015f1 f1Var2 = this.f71433c;
            int hashCode2 = (hashCode + (f1Var2 == null ? 0 : f1Var2.hashCode())) * 31;
            C98121d dVar = this.f71434d;
            if (dVar != null) {
                i2 = dVar.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            return "DownloaderResult(isDownloaderOnStart=" + this.f71431a + ", mediaCacheOneStart=" + this.f71432b + ", mediaCacheOnStop=" + this.f71433c + ", downloaderResultOnStop=" + this.f71434d + ')';
        }
    }

    /* renamed from: a */
    public static final void m31704a(C25026b bVar, String str, C25029d dVar, String str2) {
        boolean z;
        bVar.getClass();
        if (dVar.f71416c) {
            ArrayList<C25027a> arrayList = dVar.f71419f;
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = arrayList.iterator();
            while (true) {
                boolean z2 = false;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                C25027a aVar = (C25027a) next;
                if (((int) aVar.f71388a) == 2 || !(z = aVar.f71369B) || (z && aVar.f71370C)) {
                    z2 = true;
                }
                if (z2) {
                    arrayList2.add(next);
                }
            }
            if (arrayList2.size() == dVar.f71419f.size()) {
                bVar.f71362c.remove(str);
                Log.m105924i("FinderNetworkFlowReport", "PLAY_checkPlaySessionReport " + str2 + " size:" + arrayList2.size());
                for (C25027a aVar2 : dVar.f71419f) {
                    if (((int) aVar2.f71388a) == 2 || !aVar2.f71369B) {
                        aVar2.f71397j = 0;
                        aVar2.f71398k = "";
                        aVar2.f71399l = "";
                    }
                    long j = aVar2.f71406s - aVar2.f71405r;
                    aVar2.f71403p = j;
                    aVar2.f71402o = j - aVar2.f71383P;
                    C66167g gVar = C66167g.f190173a;
                    gVar.getClass();
                    C87412m.m108594g(str, "mediaId");
                    C55015f1 c = gVar.mo90234c(str, false);
                    int i = c.field_playCount + 1;
                    c.field_playCount = i;
                    gVar.mo90238i(str, c, false);
                    aVar2.f71404q = (long) i;
                    aVar2.f71401n = ((long) aVar2.f71385R.size()) * 100;
                    bVar.mo52129f(aVar2, "checkPlaySessionReport#" + str2);
                }
            } else if (C87412m.m108589b(str2, "onPlayerStop")) {
                for (T t : C110818d0.m150930b0(dVar.f71419f, arrayList2)) {
                    Log.m105928w("FinderNetworkFlowReport", "PLAY_checkPlaySessionReport " + str2 + " come stop but item" + t);
                }
            }
        }
        if (bVar.f71362c.size() > 200) {
            Log.m105928w("FinderNetworkFlowReport", "checkIfDeleteSomeItem leak 200");
            bVar.f71362c.clear();
        }
    }

    /* renamed from: b */
    public static final void m31705b(C25026b bVar, C25029d dVar, C25027a aVar, C55015f1 f1Var, long j, long j2, boolean z, C25032b bVar2, String str) {
        C25027a aVar2 = aVar;
        long j3 = j2;
        C25032b bVar3 = bVar2;
        String str2 = str;
        bVar.getClass();
        aVar2.f71408u = j;
        aVar2.f71406s = C31543z5.m39451a();
        aVar2.f71368A = z;
        if (j3 > 0) {
            aVar2.f71394g = j3;
            aVar2.f71393f = j3 / ((long) 1000);
        }
        aVar2.f71411x = C31543z5.m39451a();
        if (((int) aVar2.f71388a) == 2 || !aVar2.f71369B) {
            Log.m105924i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose#closeitem local play " + aVar2.f71384Q + "  " + str2);
            C55015f1 f1Var2 = f1Var;
            C25027a.f71367U.mo52139d(aVar, f1Var);
        } else if (aVar2.f71370C) {
            Log.m105924i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose " + aVar2.f71384Q + ' ' + str2 + " return for stopDownloaderHit.");
        } else {
            Log.m105924i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose " + aVar2.f71384Q + ' ' + str2 + " observer:" + bVar3 + '.');
            if (bVar3 != null) {
                bVar3.mo52144a(new C25036e(aVar, str, bVar, z, dVar));
            }
        }
    }

    /* renamed from: c */
    public final void mo52126c(long j) {
        this.f71363d += j;
        Log.m105924i("FinderNetworkFlowReport", "FinderNetworkFlowReport.checkTotalSize finderTotalDownloadSize cdr " + TrafficStats.totalWxRx + XVFSFile.PATH_SEPARATOR_CHAR + mo52128e() + XVFSFile.PATH_SEPARATOR_CHAR + this.f71363d + XVFSFile.PATH_SEPARATOR_CHAR + this.f71364e + " percent:" + ((((float) this.f71364e) * 1.0f) / ((float) this.f71363d)) + " gap size:" + (this.f71363d - this.f71364e));
    }

    /* renamed from: d */
    public final String mo52127d(long j) {
        return j == 1 ? "预下载" : j == 2 ? "本地播放" : j == 3 ? "边下边播" : j == 4 ? "本地预渲染" : j == 5 ? "在线预渲染" : "未知非法";
    }

    /* renamed from: e */
    public final long mo52128e() {
        return ((C101213l) C86312j.m106911c(C101213l.class)).mo140300Og();
    }

    /* renamed from: f */
    public final void mo52129f(C25027a aVar, String str) {
        FinderVideoDownloadPlayStruct finderVideoDownloadPlayStruct = new FinderVideoDownloadPlayStruct();
        finderVideoDownloadPlayStruct.f69483d = aVar.f71388a;
        finderVideoDownloadPlayStruct.f69484e = aVar.f71389b;
        finderVideoDownloadPlayStruct.f69485f = aVar.f71390c;
        finderVideoDownloadPlayStruct.f69486g = aVar.f71391d;
        finderVideoDownloadPlayStruct.f69487h = finderVideoDownloadPlayStruct.mo86045b("FeedId", aVar.f71392e, true);
        finderVideoDownloadPlayStruct.f69488i = aVar.f71393f;
        finderVideoDownloadPlayStruct.f69489j = aVar.f71394g;
        finderVideoDownloadPlayStruct.f69490k = aVar.f71395h;
        finderVideoDownloadPlayStruct.f69491l = finderVideoDownloadPlayStruct.mo86045b("VideoFormat", aVar.f71396i, true);
        finderVideoDownloadPlayStruct.f69492m = aVar.f71397j;
        finderVideoDownloadPlayStruct.f69493n = finderVideoDownloadPlayStruct.mo86045b("DownloadStartTime", aVar.f71398k, true);
        finderVideoDownloadPlayStruct.f69494o = finderVideoDownloadPlayStruct.mo86045b("DownloadEndTime", aVar.f71399l, true);
        finderVideoDownloadPlayStruct.f69495p = aVar.f71400m;
        finderVideoDownloadPlayStruct.f69496q = aVar.f71401n;
        finderVideoDownloadPlayStruct.f69497r = aVar.f71402o;
        finderVideoDownloadPlayStruct.f69498s = aVar.f71403p;
        finderVideoDownloadPlayStruct.f69499t = aVar.f71404q;
        finderVideoDownloadPlayStruct.f69500u = finderVideoDownloadPlayStruct.mo86045b("PlayStartTime", String.valueOf(aVar.f71405r), true);
        finderVideoDownloadPlayStruct.f69501v = finderVideoDownloadPlayStruct.mo86045b("PlayEndTime", String.valueOf(aVar.f71406s), true);
        finderVideoDownloadPlayStruct.f69502w = aVar.f71407t;
        finderVideoDownloadPlayStruct.f69503x = aVar.f71408u;
        finderVideoDownloadPlayStruct.f69505z = TrafficStats.totalWxRx - this.f71366g;
        finderVideoDownloadPlayStruct.f69504y = mo52128e() - this.f71365f;
        finderVideoDownloadPlayStruct.f69481A = finderVideoDownloadPlayStruct.mo86045b("NetConnInfo", aVar.f71387T, true);
        this.f71365f = mo52128e();
        this.f71366g = TrafficStats.totalWxRx;
        finderVideoDownloadPlayStruct.mo86054n();
        if (aVar.f71388a == -1) {
            Log.m105920e("FinderNetworkFlowReport", "FinderNetworkFlowReport.checkValidItem invalid actionType " + aVar);
        }
        if (aVar.f71389b == -1) {
            Log.m105920e("FinderNetworkFlowReport", "FinderNetworkFlowReport.checkValidItem invalid downloadType " + aVar);
        }
        if (aVar.f71395h <= 0) {
            Log.m105920e("FinderNetworkFlowReport", "FinderNetworkFlowReport.checkValidItem invalid fileSize:" + aVar.f71395h + ' ' + aVar);
        }
        if (aVar.f71397j < 0) {
            Log.m105920e("FinderNetworkFlowReport", "FinderNetworkFlowReport.checkValidItem invalid downloadSize:" + aVar.f71397j + ' ' + aVar);
        }
        if (aVar.f71397j - aVar.f71395h > 1024) {
            Log.m105920e("FinderNetworkFlowReport", "FinderNetworkFlowReport.checkValidItem invalid gap size:" + (aVar.f71397j - aVar.f71395h) + ' ' + aVar);
        }
        this.f71364e += aVar.f71397j;
        Log.m105924i("FinderNetworkFlowReport", "checkTotalSize finderTotalReportSize wcdr " + TrafficStats.totalWxRx + XVFSFile.PATH_SEPARATOR_CHAR + mo52128e() + XVFSFile.PATH_SEPARATOR_CHAR + this.f71363d + XVFSFile.PATH_SEPARATOR_CHAR + this.f71364e + " percent:" + ((((float) this.f71364e) * 1.0f) / ((float) this.f71363d)) + " gap size:" + (this.f71363d - this.f71364e));
        Log.m105924i("FinderNetworkFlowReport", "FinderNetworkFlowReport.handleReport " + mo52127d(aVar.f71388a) + ' ' + aVar.f71412y + " ftpp:" + aVar.f71384Q + " mediaId:" + aVar.f71409v + " recordMs:" + (aVar.f71411x - aVar.f71410w) + ' ' + str + ' ' + mo52130g() + " downloadReportData:" + aVar);
    }

    /* renamed from: g */
    public final String mo52130g() {
        ConcurrentHashMap<String, C25029d> concurrentHashMap = this.f71362c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : concurrentHashMap.entrySet()) {
            if (((C25029d) next.getValue()).f71417d) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        ConcurrentHashMap<String, C25029d> concurrentHashMap2 = this.f71362c;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry next2 : concurrentHashMap2.entrySet()) {
            if (!((C25029d) next2.getValue()).f71417d) {
                linkedHashMap2.put(next2.getKey(), next2.getValue());
            }
        }
        return "T:" + this.f71362c.size() + " P:" + this.f71360a.size() + " R:" + this.f71361b.size() + " L:" + linkedHashMap.size() + " O:" + linkedHashMap2.size();
    }

    /* renamed from: h */
    public final void mo52131h(long j, String str, C58469b bVar, C98127h hVar, C55015f1 f1Var) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(bVar, "taskContext");
        C87412m.m108594g(f1Var, XWalkPlugin.PRIVATE_CACHE_DIR_NAME);
        if (hVar == null) {
            Log.m105928w("FinderNetworkFlowReport", "PRELOAD_startPreload mediaId:" + str + " return for result is null  size:" + this.f71360a.size() + " list:");
            return;
        }
        C61926c.m72661F("FinderNetworkFlowReport_Thread", new C25030e(j, str, bVar, f1Var, this));
    }

    /* renamed from: i */
    public final void mo52132i(String str, C98121d dVar, String str2) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(str2, "invokeSource");
        if (dVar == null) {
            Log.m105928w("FinderNetworkFlowReport", "PRELOAD_stopPreload mediaId:" + str + ' ' + str2 + " return for result is null  size:" + this.f71360a.size() + " list:");
            return;
        }
        C61926c.m72661F("FinderNetworkFlowReport_Thread", new C25031f(this, str, str2, dVar));
    }
}
