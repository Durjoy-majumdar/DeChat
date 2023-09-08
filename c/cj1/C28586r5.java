package cj1;

import c30.C104289g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86013q1;
import ft1.C59319a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C11348f;
import ok1.C62042e;

/* renamed from: cj1.r5 */
public final class C28586r5 implements Runnable {

    /* renamed from: d */
    public static final C28586r5 f78461d = new C28586r5();

    /* renamed from: cj1.r5$a */
    public static final class C28587a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ long f78462d;

        /* renamed from: e */
        public final /* synthetic */ boolean f78463e;

        /* renamed from: f */
        public final /* synthetic */ boolean f78464f;

        /* renamed from: g */
        public final /* synthetic */ int f78465g;

        /* renamed from: h */
        public final /* synthetic */ int f78466h;

        /* renamed from: i */
        public final /* synthetic */ boolean f78467i;

        /* renamed from: j */
        public final /* synthetic */ int f78468j;

        /* renamed from: n */
        public final /* synthetic */ Integer f78469n;

        /* renamed from: o */
        public final /* synthetic */ String f78470o;

        /* renamed from: p */
        public final /* synthetic */ boolean f78471p;

        /* renamed from: q */
        public final /* synthetic */ boolean f78472q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28587a(long j, boolean z, boolean z2, int i, int i2, boolean z3, int i3, Integer num, String str, boolean z4, boolean z5) {
            super(0);
            this.f78462d = j;
            this.f78463e = z;
            this.f78464f = z2;
            this.f78465g = i;
            this.f78466h = i2;
            this.f78467i = z3;
            this.f78468j = i3;
            this.f78469n = num;
            this.f78470o = str;
            this.f78471p = z4;
            this.f78472q = z5;
        }

        public Object invoke() {
            String str;
            try {
                C104289g gVar = new C104289g();
                long j = this.f78462d;
                boolean z = this.f78463e;
                boolean z2 = this.f78464f;
                int i = this.f78465g;
                int i2 = this.f78466h;
                boolean z3 = this.f78467i;
                int i3 = this.f78468j;
                Integer num = this.f78469n;
                String str2 = this.f78470o;
                boolean z4 = this.f78471p;
                boolean z5 = this.f78472q;
                gVar.mo145967r("liveId", Long.valueOf(j));
                gVar.mo145967r("isFloat", Boolean.valueOf(z));
                gVar.mo145967r("isForeground", Boolean.valueOf(z2));
                gVar.mo145967r("threadCntInProcess", Integer.valueOf(i));
                gVar.mo145967r("threadCntInJava", Integer.valueOf(i2));
                gVar.mo145967r("screenOff", Boolean.valueOf(z3));
                gVar.mo145967r("battery", Integer.valueOf(i3));
                gVar.mo145967r("curBattery", num);
                gVar.mo145967r("memInfo", str2);
                gVar.mo145967r("hasStack", Boolean.valueOf(z4));
                gVar.mo145967r("deleteSuc", Boolean.valueOf(z5));
                str = gVar.toString();
            } catch (Exception e) {
                str = e.getMessage();
                if (str == null) {
                    str = "";
                }
            }
            C87412m.m108593f(str, "try {\n                  …e ?: \"\"\n                }");
            return str;
        }
    }

    public final void run() {
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("live_exception_monitor");
        long j = singleMMKV.getLong("PARAM_LIVE_ID", 0);
        boolean z = singleMMKV.getBoolean("PARAM_IS_FOREGROUND", false);
        boolean z2 = singleMMKV.getBoolean("PARAM_IS_FLOAT", false);
        int i = singleMMKV.getInt("PARAM_THREAD_CNT_IN_PROCESS", 0);
        int i2 = singleMMKV.getInt("PARAM_THREAD_CNT_IN_JAVA", 0);
        boolean z3 = singleMMKV.getBoolean("PARAM_IS_SCREEN_OFF", false);
        int i3 = singleMMKV.getInt("PARAM_LIVING_BATTERY", 0);
        Integer O = C62042e.f176370a.mo87029O();
        String str = MMApplicationContext.getContext().getFilesDir().getAbsolutePath() + "/crashFlag.live";
        boolean k = C86013q1.m106450k(str);
        boolean h = C86013q1.m106447h(str);
        String string = singleMMKV.getString("PARAM_MEM_INFO", "");
        Log.m105924i("Finder.LiveExceptionMonitor", "checkAndReportExceptionQuit [lastLiveId:" + j + ", isForeground:" + z + ", isFloat:" + z2 + ", screenOff:" + z3 + ", battery:" + i3 + ", curBattery:" + O + ", threadCntInProcess:" + i + ", threadCntInJava:" + i2 + ", meminfo:" + string + " hasStack:" + k + " deleteSuc:" + h);
        C11348f.C11349a.m11178b(C59319a.f169618b, "liveKillByUserOrSys", j == 0, (C11348f.C11352b) null, false, false, new C28587a(j, z2, z, i, i2, z3, i3, O, string, k, h), 28, (Object) null);
        C28567a6.m38271a(C28567a6.f78431a);
    }
}
