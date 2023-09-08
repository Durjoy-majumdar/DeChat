package s73;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: s73.b */
public final class C90150b {

    /* renamed from: a */
    public final long f258835a;

    /* renamed from: b */
    public final long f258836b;

    /* renamed from: c */
    public final String f258837c;

    /* renamed from: d */
    public final long f258838d;

    /* renamed from: e */
    public volatile boolean f258839e;

    /* renamed from: f */
    public long f258840f;

    /* renamed from: g */
    public final ConcurrentHashMap<String, C90151b> f258841g;

    /* renamed from: h */
    public final ConcurrentHashMap<Integer, C13629a> f258842h;

    /* renamed from: i */
    public long f258843i;

    /* renamed from: j */
    public long f258844j;

    /* renamed from: k */
    public long f258845k;

    /* renamed from: l */
    public long f258846l;

    /* renamed from: s73.b$a */
    public static final class C13629a {

        /* renamed from: a */
        public long f38620a;

        /* renamed from: b */
        public final int f38621b;

        /* renamed from: c */
        public final String f38622c;

        public C13629a(long j, int i, String str) {
            C87412m.m108594g(str, "canvasId");
            this.f38620a = j;
            this.f38621b = i;
            this.f38622c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13629a)) {
                return false;
            }
            C13629a aVar = (C13629a) obj;
            return this.f38620a == aVar.f38620a && this.f38621b == aVar.f38621b && C87412m.m108589b(this.f38622c, aVar.f38622c);
        }

        public int hashCode() {
            long j = this.f38620a;
            return (((((int) (j ^ (j >>> 32))) * 31) + this.f38621b) * 31) + this.f38622c.hashCode();
        }

        public String toString() {
            return "BindInfo(createTime=" + this.f38620a + ", elementId=" + this.f38621b + ", canvasId=" + this.f38622c + ')';
        }
    }

    /* renamed from: s73.b$b */
    public static final class C90151b {

        /* renamed from: a */
        public long f258847a;

        /* renamed from: b */
        public final boolean f258848b;

        /* renamed from: c */
        public boolean f258849c;

        /* renamed from: d */
        public int f258850d;

        public C90151b(long j, boolean z) {
            this.f258847a = j;
            this.f258848b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C90151b)) {
                return false;
            }
            C90151b bVar = (C90151b) obj;
            return this.f258847a == bVar.f258847a && this.f258848b == bVar.f258848b;
        }

        public int hashCode() {
            long j = this.f258847a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            boolean z = this.f258848b;
            if (z) {
                z = true;
            }
            return i + (z ? 1 : 0);
        }

        public String toString() {
            return "CreateInfo(createTime=" + this.f258847a + ", isMainContextStarted=" + this.f258848b + ')';
        }
    }

    public C90150b(long j, long j2, String str, int i, C8480h hVar) {
        str = (i & 4) != 0 ? "wxf337cbaa27790d8e" : str;
        C87412m.m108594g(str, "appId");
        this.f258835a = j;
        this.f258836b = j2;
        this.f258837c = str;
        this.f258838d = 1497;
        this.f258841g = new ConcurrentHashMap<>();
        this.f258842h = new ConcurrentHashMap<>();
        System.currentTimeMillis();
        this.f258843i = System.currentTimeMillis();
        this.f258846l = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo124398a(String str, long j) {
        C87412m.m108594g(str, "id");
        C90151b bVar = this.f258841g.get(str);
        if (bVar != null) {
            long currentTimeMillis = System.currentTimeMillis() - j;
            mo124402e(25, 1);
            mo124402e(26, currentTimeMillis);
            bVar.f258850d = (int) currentTimeMillis;
            Log.m105924i("MicroMsg.WebCanvasPerformanceReporter", "performance: [ConfigClient]:" + currentTimeMillis + "ms isMainContextStarted:" + bVar.f258848b);
        }
    }

    /* renamed from: b */
    public final void mo124399b(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        if (j <= 0) {
            j = this.f258836b;
        }
        long j2 = currentTimeMillis - j;
        mo124402e(12, j2);
        long j3 = currentTimeMillis - this.f258840f;
        mo124402e(16, j3);
        Log.m105924i("MicroMsg.WebCanvasPerformanceReporter", "performance: [ConfigEnd]:" + j2 + LocaleUtil.MALAY);
        this.f258845k = j3;
    }

    /* renamed from: c */
    public final void mo124400c(long j) {
        this.f258840f = System.currentTimeMillis();
        mo124402e(10, 1);
        long j2 = this.f258840f;
        if (j <= 0) {
            j = this.f258836b;
        }
        long j3 = j2 - j;
        mo124402e(11, j3);
        Log.m105924i("MicroMsg.WebCanvasPerformanceReporter", "performance: [ConfigStart]:" + j3 + LocaleUtil.MALAY);
    }

    /* renamed from: d */
    public final void mo124401d(long j) {
        boolean z = true;
        this.f258839e = true;
        long currentTimeMillis = System.currentTimeMillis();
        if (j <= 0) {
            j = this.f258836b;
        }
        long j2 = currentTimeMillis - j;
        long j3 = currentTimeMillis - this.f258840f;
        mo124402e(17, j2);
        Log.m105924i("MicroMsg.WebCanvasPerformanceReporter", "performance: [MainContextReady]:" + j2 + "ms, inject mainContextCost " + j3);
        if (50 <= j3 && j3 < 101) {
            mo124402e(19, 1);
        } else {
            if (101 <= j3 && j3 < 301) {
                mo124402e(20, 1);
            } else {
                if (301 > j3 || j3 >= 501) {
                    z = false;
                }
                if (z) {
                    mo124402e(21, 1);
                } else if (j3 > 500) {
                    mo124402e(22, 1);
                }
            }
        }
        String str = this.f258837c + "," + this.f258844j + "," + this.f258845k + "," + j2;
        C87412m.m108593f(str, "StringBuilder().apply {\n…ast)\n        }.toString()");
        C115669n.INSTANCE.kvStat(20918, str);
    }

    /* renamed from: e */
    public final void mo124402e(long j, long j2) {
        C115669n nVar = C115669n.INSTANCE;
        long j3 = j;
        long j4 = j2;
        nVar.mo175913w(this.f258838d, j3, j4);
        nVar.mo175913w(this.f258835a, j3, j4);
    }
}
