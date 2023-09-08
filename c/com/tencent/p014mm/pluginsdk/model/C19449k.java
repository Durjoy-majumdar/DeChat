package com.tencent.p014mm.pluginsdk.model;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.xweb.WCWebUpdater;
import gy3.C87412m;
import java.util.Arrays;
import java.util.HashMap;
import p823sg.C90193h;
import rx3.C13604l;
import sx3.C90364q0;
import z04.C119027c;

/* renamed from: com.tencent.mm.pluginsdk.model.k */
public final class C19449k {

    /* renamed from: a */
    public static final C19449k f54939a = new C19449k();

    /* renamed from: b */
    public static final HashMap<String, C19451b> f54940b = new HashMap<>();

    /* renamed from: c */
    public static final HashMap<String, String> f54941c = new HashMap<>();

    /* renamed from: d */
    public static C19452c f54942d = new C19452c();

    /* renamed from: e */
    public static boolean f54943e;

    /* renamed from: f */
    public static final HashMap<String, String> f54944f = C90364q0.m113146e(new C13604l(WeChatHosts.domainString(C0966R.string.f360885fm3), "1"), new C13604l("mmbiz.qpic.cn", "2"), new C13604l("vpic.video.qq.com", "3"), new C13604l("mmbiz.qlogo.cn", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL));

    /* renamed from: com.tencent.mm.pluginsdk.model.k$a */
    public static final class C19450a {

        /* renamed from: a */
        public int f54945a;

        /* renamed from: b */
        public int f54946b = 0;

        /* renamed from: c */
        public long f54947c = 0;

        /* renamed from: d */
        public long f54948d = 0;

        /* renamed from: e */
        public String f54949e;

        public C19450a(String str, int i) {
            C87412m.m108594g(str, "id");
            this.f54949e = str;
            this.f54945a = i;
        }

        /* renamed from: a */
        public final void mo25211a(long j) {
            if (this.f54946b == 2) {
                Log.m105927v("MicroMsg.BizImageBlankReporter", "alvinluo pause action: %d, id: %s, status: %d, timestamp: %d", Integer.valueOf(this.f54945a), this.f54949e, Integer.valueOf(this.f54946b), Long.valueOf(j));
                if (j < 0) {
                    j = System.currentTimeMillis();
                }
                long j2 = this.f54948d;
                if (j >= j2) {
                    this.f54947c += j - j2;
                }
                this.f54946b = 3;
            }
        }

        /* renamed from: b */
        public final void mo25212b(long j) {
            int i = this.f54946b;
            if (i == 3 || i == 1) {
                Log.m105927v("MicroMsg.BizImageBlankReporter", "alvinluo resume action: %d, id: %s, timestamp: %d", Integer.valueOf(this.f54945a), this.f54949e, Long.valueOf(j));
                this.f54946b = 2;
                if (j < 0) {
                    j = System.currentTimeMillis();
                }
                this.f54948d = j;
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.k$b */
    public static final class C19451b {

        /* renamed from: a */
        public long f54950a;

        /* renamed from: b */
        public long f54951b;

        /* renamed from: c */
        public long f54952c;

        /* renamed from: d */
        public long f54953d;

        /* renamed from: e */
        public long f54954e;

        /* renamed from: f */
        public long f54955f;

        /* renamed from: g */
        public String f54956g = "";

        /* renamed from: h */
        public String f54957h = "";

        /* renamed from: i */
        public String f54958i = "";

        /* renamed from: j */
        public int f54959j = -1;

        /* renamed from: k */
        public long f54960k;

        /* renamed from: l */
        public int f54961l;

        /* renamed from: m */
        public boolean f54962m;

        /* renamed from: n */
        public boolean f54963n;

        /* renamed from: o */
        public int f54964o = -1;

        /* renamed from: p */
        public boolean f54965p;

        /* renamed from: q */
        public boolean f54966q;

        /* renamed from: r */
        public boolean f54967r;

        /* renamed from: s */
        public String f54968s = "";

        /* renamed from: t */
        public HashMap<Integer, C19450a> f54969t = new HashMap<>();

        /* renamed from: u */
        public boolean f54970u;

        public C19451b(String str) {
            C87412m.m108594g(str, "url");
            this.f54956g = str;
            this.f54968s = C19449k.f54939a.mo25209b(str);
        }

        /* renamed from: a */
        public final void mo25213a(int i, long j) {
            switch (i) {
                case 1:
                    this.f54950a = j;
                    return;
                case 2:
                    this.f54955f = j;
                    return;
                case 3:
                    this.f54952c = j;
                    return;
                case 4:
                    this.f54950a = j;
                    return;
                case 5:
                case 6:
                case 7:
                    this.f54951b += j;
                    return;
                case 8:
                    this.f54954e = j;
                    return;
                case 9:
                    this.f54953d = j;
                    return;
                default:
                    return;
            }
        }

        /* renamed from: b */
        public final void mo25214b(int i, long j) {
            int i2;
            C19450a aVar = this.f54969t.get(Integer.valueOf(i));
            if (aVar != null && ((i2 = aVar.f54946b) == 2 || i2 == 3)) {
                Log.m105927v("MicroMsg.BizImageBlankReporter", "alvinluo finish action: %d, id: %s, status: %d, timestamp: %d", Integer.valueOf(aVar.f54945a), aVar.f54949e, Integer.valueOf(aVar.f54946b), Long.valueOf(j));
                if (aVar.f54946b == 2) {
                    if (j < 0) {
                        j = System.currentTimeMillis();
                    }
                    aVar.getClass();
                    long j2 = aVar.f54948d;
                    if (j >= j2) {
                        aVar.f54947c += j - j2;
                    }
                }
                aVar.f54946b = 4;
            }
            this.f54964o = -1;
            if (i == 9) {
                this.f54967r = false;
            }
        }

        /* renamed from: c */
        public final void mo25215c(int i, long j) {
            if (i == 2) {
                this.f54965p = true;
                this.f54966q = true;
            } else if (i == 9) {
                this.f54967r = true;
            }
            C19450a aVar = this.f54969t.get(Integer.valueOf(i));
            if (aVar == null) {
                aVar = new C19450a(this.f54968s, i);
                this.f54969t.put(Integer.valueOf(i), aVar);
            }
            if (aVar.f54946b == 0) {
                Log.m105927v("MicroMsg.BizImageBlankReporter", "alvinluo start action: %d, id: %s, status: %d, timestamp: %d", Integer.valueOf(aVar.f54945a), aVar.f54949e, Integer.valueOf(aVar.f54946b), Long.valueOf(j));
                aVar.f54946b = 1;
            }
            if (i == 1 || i == 2) {
                aVar.mo25212b(j);
            } else {
                aVar.mo25212b(j);
            }
            if (i != 9) {
                this.f54964o = i;
            }
        }

        public String toString() {
            String format = String.format("BizImageBlankReportInfo %s {id: %s, timeTotal: %d, timeTaskRun: %d, timeFile: %d, timeNet: %d, timeScroll: %d, timeHevc: %d, timeThread: %d, \nnetType: %s, position: %d, imageSize: %d, retryCount: %d, downloadSuccess: %b, local: %b, \nurl: %s}", Arrays.copyOf(new Object[]{Integer.valueOf(hashCode()), C19449k.f54939a.mo25209b(this.f54956g), Long.valueOf(this.f54950a), Long.valueOf(this.f54955f), Long.valueOf(this.f54951b), Long.valueOf(this.f54952c), Long.valueOf(this.f54953d), 0L, Long.valueOf(this.f54954e), this.f54958i, Integer.valueOf(this.f54959j), Long.valueOf(this.f54960k), Integer.valueOf(this.f54961l), Boolean.valueOf(this.f54962m), Boolean.valueOf(this.f54963n), this.f54956g}, 16));
            C87412m.m108593f(format, "format(format, *args)");
            return format;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.k$c */
    public static final class C19452c {

        /* renamed from: a */
        public int f54971a;

        /* renamed from: b */
        public int f54972b;

        /* renamed from: c */
        public int f54973c;

        /* renamed from: d */
        public int f54974d;

        public String toString() {
            String format = String.format("totalCount: %d, fromNetCount: %d, fromFileCount: %d, fromMemoryCount: %d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f54971a), Integer.valueOf(this.f54972b), Integer.valueOf(this.f54973c), Integer.valueOf(this.f54974d)}, 4));
            C87412m.m108593f(format, "format(format, *args)");
            return format;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.k$d */
    public static final class C19453d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f54975d;

        /* renamed from: e */
        public final /* synthetic */ int f54976e;

        /* renamed from: f */
        public final /* synthetic */ long f54977f;

        public C19453d(String str, int i, long j) {
            this.f54975d = str;
            this.f54976e = i;
            this.f54977f = j;
        }

        public final void run() {
            HashMap<String, C19451b> hashMap = C19449k.f54940b;
            C19451b bVar = hashMap.get(this.f54975d);
            if (bVar == null) {
                bVar = new C19451b(this.f54975d);
                hashMap.put(this.f54975d, bVar);
            }
            bVar.mo25215c(this.f54976e, this.f54977f);
        }
    }

    /* renamed from: a */
    public static void m20803a(C19449k kVar, int i, String str, long j, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j = 0;
        }
        kVar.getClass();
        if (!(str == null || str.length() == 0)) {
            if (j == 0) {
                j = System.currentTimeMillis();
            }
            MMHandlerThread.postToMainThread(new C19455l(str, i, j));
        }
    }

    /* renamed from: b */
    public final String mo25209b(String str) {
        C87412m.m108594g(str, "url");
        byte[] bytes = str.getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        String f = C90193h.m112878f(bytes);
        C87412m.m108593f(f, "getMessageDigest(url.toByteArray())");
        return f;
    }

    /* renamed from: c */
    public final void mo25210c(int i, String str, long j) {
        if (!(str == null || str.length() == 0)) {
            if (j == 0) {
                j = System.currentTimeMillis();
            }
            MMHandlerThread.postToMainThread(new C19453d(str, i, j));
        }
    }
}
