package com.tencent.p014mm.plugin.expt.resource;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.autogen.mmdata.rpt.ResortZipStartTimeReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import java.util.regex.Pattern;
import lc3.C10485b;
import o40.C61926c;
import p156gj.C87201q;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.expt.resource.MMResReporter */
public final class MMResReporter {

    /* renamed from: a */
    public static final MMResReporter f80989a = new MMResReporter();

    /* renamed from: b */
    public static final HashMap<String, Integer> f80990b = new HashMap<>();

    /* renamed from: c */
    public static final Vector<C29898a> f80991c = new Vector<>();

    /* renamed from: d */
    public static final BroadcastReceiver f80992d;

    /* renamed from: e */
    public static final C13601g f80993e = C36568h.m40985a(C29900c.f81002d);

    /* renamed from: f */
    public static final C13601g f80994f = C36568h.m40985a(C29901d.f81003d);

    /* renamed from: com.tencent.mm.plugin.expt.resource.MMResReporter$a */
    public static final class C29898a implements Serializable {

        /* renamed from: d */
        public String f80995d;

        /* renamed from: e */
        public final long f80996e;

        /* renamed from: f */
        public final int f80997f;

        /* renamed from: g */
        public final int f80998g;

        public C29898a() {
            this("", -1, 0, -1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29898a)) {
                return false;
            }
            C29898a aVar = (C29898a) obj;
            return C87412m.m108589b(this.f80995d, aVar.f80995d) && this.f80996e == aVar.f80996e && this.f80997f == aVar.f80997f && this.f80998g == aVar.f80998g;
        }

        public int hashCode() {
            long j = this.f80996e;
            return (((((this.f80995d.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f80997f) * 31) + this.f80998g;
        }

        public String toString() {
            return "ReportItem(resName=" + this.f80995d + ", cost=" + this.f80996e + ", resType=" + this.f80997f + ", resId=" + this.f80998g + ')';
        }

        public C29898a(String str, long j, int i, int i2) {
            C87412m.m108594g(str, "resName");
            this.f80995d = str;
            this.f80996e = j;
            this.f80997f = i;
            this.f80998g = i2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.expt.resource.MMResReporter$b */
    public enum C29899b {
        broadcast,
        onDestroy
    }

    /* renamed from: com.tencent.mm.plugin.expt.resource.MMResReporter$c */
    public static final class C29900c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C29900c f81002d = new C29900c();

        public C29900c() {
            super(0);
        }

        public Object invoke() {
            String str = C87201q.m108259c().get("Hardware");
            if ((str == null || C112551y.m153811k(str)) || !C112550d0.m153803w(str, ",", false, 2, (Object) null)) {
                return str;
            }
            Pattern compile = Pattern.compile(",");
            C87412m.m108593f(compile, "compile(pattern)");
            String replaceAll = compile.matcher(str).replaceAll(" ");
            C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
            return replaceAll;
        }
    }

    /* renamed from: com.tencent.mm.plugin.expt.resource.MMResReporter$d */
    public static final class C29901d extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C29901d f81003d = new C29901d();

        public C29901d() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(MMResReporter.f80989a.mo56976a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.expt.resource.MMResReporter$e */
    public static final class C29902e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ArrayList<C29898a> f81004d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29902e(ArrayList<C29898a> arrayList) {
            super(0);
            this.f81004d = arrayList;
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x007a A[Catch:{ all -> 0x00e5 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r13 = this;
                java.util.ArrayList<com.tencent.mm.plugin.expt.resource.MMResReporter$a> r0 = r13.f81004d
                java.util.Iterator r0 = r0.iterator()
            L_0x0006:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x00f0
                java.lang.Object r1 = r0.next()
                com.tencent.mm.plugin.expt.resource.MMResReporter$a r1 = (com.tencent.p014mm.plugin.expt.resource.MMResReporter.C29898a) r1
                if (r1 == 0) goto L_0x0006
                com.tencent.mm.plugin.expt.resource.MMResReporter r2 = com.tencent.p014mm.plugin.expt.resource.MMResReporter.f80989a
                int r3 = r1.f80998g
                r4 = -1
                java.lang.String r5 = "MMResReporter"
                r6 = 0
                r7 = 1
                if (r3 == r4) goto L_0x0049
                android.util.TypedValue r3 = new android.util.TypedValue     // Catch:{ all -> 0x0040 }
                r3.<init>()     // Catch:{ all -> 0x0040 }
                android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0040 }
                android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0040 }
                int r8 = r1.f80998g     // Catch:{ all -> 0x0040 }
                r4.getValue(r8, r3, r7)     // Catch:{ all -> 0x0040 }
                java.lang.CharSequence r3 = r3.string     // Catch:{ all -> 0x0040 }
                if (r3 == 0) goto L_0x003b
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0040 }
                if (r3 != 0) goto L_0x003d
            L_0x003b:
                java.lang.String r3 = ""
            L_0x003d:
                r1.f80995d = r3     // Catch:{ all -> 0x0040 }
                goto L_0x0049
            L_0x0040:
                r3 = move-exception
                java.lang.Object[] r4 = new java.lang.Object[r6]
                java.lang.String r8 = "validate err"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r3, r8, r4)
            L_0x0049:
                java.lang.String r3 = r1.f80995d
                if (r3 == 0) goto L_0x0056
                boolean r3 = z04.C112551y.m153811k(r3)
                if (r3 == 0) goto L_0x0054
                goto L_0x0056
            L_0x0054:
                r3 = 0
                goto L_0x0057
            L_0x0056:
                r3 = 1
            L_0x0057:
                r3 = r3 ^ r7
                if (r3 != 0) goto L_0x005b
                goto L_0x0006
            L_0x005b:
                int r2 = r2.mo56977b(r1)     // Catch:{ all -> 0x00e5 }
                java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()     // Catch:{ all -> 0x00e5 }
                com.tencent.mm.autogen.mmdata.rpt.ResortZipStartTimeReportStruct r4 = new com.tencent.mm.autogen.mmdata.rpt.ResortZipStartTimeReportStruct     // Catch:{ all -> 0x00e5 }
                r4.<init>()     // Catch:{ all -> 0x00e5 }
                com.tencent.mm.plugin.expt.resource.MMResReporter r8 = com.tencent.p014mm.plugin.expt.resource.MMResReporter.f80989a     // Catch:{ all -> 0x00e5 }
                java.lang.String r9 = r1.f80995d     // Catch:{ all -> 0x00e5 }
                if (r9 == 0) goto L_0x0077
                boolean r10 = z04.C112551y.m153811k(r9)     // Catch:{ all -> 0x00e5 }
                if (r10 == 0) goto L_0x0075
                goto L_0x0077
            L_0x0075:
                r10 = 0
                goto L_0x0078
            L_0x0077:
                r10 = 1
            L_0x0078:
                if (r10 != 0) goto L_0x009d
                r10 = 2
                r11 = 0
                java.lang.String r12 = ","
                boolean r10 = z04.C112550d0.m153803w(r9, r12, r6, r10, r11)     // Catch:{ all -> 0x00e5 }
                if (r10 != 0) goto L_0x0085
                goto L_0x009d
            L_0x0085:
                java.util.regex.Pattern r10 = java.util.regex.Pattern.compile(r12)     // Catch:{ all -> 0x00e5 }
                java.lang.String r11 = "compile(pattern)"
                gy3.C87412m.m108593f(r10, r11)     // Catch:{ all -> 0x00e5 }
                java.util.regex.Matcher r9 = r10.matcher(r9)     // Catch:{ all -> 0x00e5 }
                java.lang.String r10 = "-"
                java.lang.String r9 = r9.replaceAll(r10)     // Catch:{ all -> 0x00e5 }
                java.lang.String r10 = "nativePattern.matcher(in…).replaceAll(replacement)"
                gy3.C87412m.m108593f(r9, r10)     // Catch:{ all -> 0x00e5 }
            L_0x009d:
                java.lang.String r10 = "resourceName"
                java.lang.String r9 = r4.mo86045b(r10, r9, r7)     // Catch:{ all -> 0x00e5 }
                r4.f79146g = r9     // Catch:{ all -> 0x00e5 }
                int r9 = r1.f80997f     // Catch:{ all -> 0x00e5 }
                long r9 = (long) r9     // Catch:{ all -> 0x00e5 }
                r4.f79147h = r9     // Catch:{ all -> 0x00e5 }
                long r9 = r1.f80996e     // Catch:{ all -> 0x00e5 }
                r4.f79145f = r9     // Catch:{ all -> 0x00e5 }
                r4.f79150k = r2     // Catch:{ all -> 0x00e5 }
                rx3.g r1 = com.tencent.p014mm.plugin.expt.resource.MMResReporter.f80993e     // Catch:{ all -> 0x00e5 }
                rx3.n r1 = (rx3.C36570n) r1     // Catch:{ all -> 0x00e5 }
                java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x00e5 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00e5 }
                java.lang.String r2 = "cpuModel"
                java.lang.String r1 = r4.mo86045b(r2, r1, r7)     // Catch:{ all -> 0x00e5 }
                r4.f79148i = r1     // Catch:{ all -> 0x00e5 }
                rx3.g r1 = com.tencent.p014mm.plugin.expt.resource.MMResReporter.f80994f     // Catch:{ all -> 0x00e5 }
                rx3.n r1 = (rx3.C36570n) r1     // Catch:{ all -> 0x00e5 }
                java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x00e5 }
                java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ all -> 0x00e5 }
                int r1 = r1.intValue()     // Catch:{ all -> 0x00e5 }
                long r1 = (long) r1     // Catch:{ all -> 0x00e5 }
                r4.f79149j = r1     // Catch:{ all -> 0x00e5 }
                java.lang.String r1 = "processName"
                java.lang.String r1 = r4.mo86045b(r1, r3, r7)     // Catch:{ all -> 0x00e5 }
                r4.f79151l = r1     // Catch:{ all -> 0x00e5 }
                r4.mo86054n()     // Catch:{ all -> 0x00e5 }
                r8.mo56979d(r4)     // Catch:{ all -> 0x00e5 }
                goto L_0x0006
            L_0x00e5:
                r1 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r6]
                java.lang.String r3 = "report err"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r1, r3, r2)
                goto L_0x0006
            L_0x00f0:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.expt.resource.MMResReporter.C29902e.invoke():java.lang.Object");
        }
    }

    static {
        MMResReporter$reportReceiver$1 mMResReporter$reportReceiver$1 = new MMResReporter$reportReceiver$1();
        f80992d = mMResReporter$reportReceiver$1;
        Context context = MMApplicationContext.getContext();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.tencent.mm.plugin.expt.resource.MMResReporter");
        C13598b0 b0Var = C13598b0.f38549a;
        context.registerReceiver(mMResReporter$reportReceiver$1, intentFilter);
    }

    /* renamed from: a */
    public final int mo56976a() {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("startup_cost_info");
        C87412m.m108593f(mmkv, "getMMKV(STARTUP_COST_INFO_MMKV_NAME)");
        int decodeInt = mmkv.decodeInt("device_benchmark_level", Integer.MIN_VALUE);
        if (decodeInt != Integer.MIN_VALUE) {
            return decodeInt;
        }
        int i = 0;
        if (!MMApplicationContext.isMainProcess()) {
            return 0;
        }
        try {
            C10485b bVar = (C10485b) C86709a0.m107533q(C10485b.class);
            if (bVar == null) {
                Log.m105920e("MMResReporter", "[tomys] Cannot get config service on main process, return 0 as benchmark level.");
                return 0;
            }
            int b = bVar.vh0().mo107404b("ClientBenchmarkLevel", Integer.MIN_VALUE);
            if (b >= 0) {
                mmkv.encode("device_benchmark_level", b);
                i = b;
            } else {
                Log.m105920e("MMResReporter", "[tomys] Cannot get config value, return 0 as benchmark level.");
            }
            return i;
        } catch (Throwable th) {
            Log.printErrStackTrace("MMResReporter", th, "[tomys] Cannot get config value, return 0 as benchmark level.", new Object[0]);
            return 0;
        }
    }

    /* renamed from: b */
    public final int mo56977b(C29898a aVar) {
        C87412m.m108594g(aVar, "item");
        HashMap<String, Integer> hashMap = f80990b;
        if (hashMap.containsKey(aVar.f80995d)) {
            Integer num = hashMap.get(aVar.f80995d);
            if (num == null) {
                num = 0;
            }
            int intValue = 1 + num.intValue();
            hashMap.put(aVar.f80995d, Integer.valueOf(intValue));
            return intValue;
        }
        hashMap.put(aVar.f80995d, 1);
        return 1;
    }

    /* renamed from: c */
    public final boolean mo56978c(C32735h.C32737c cVar) {
        C87412m.m108594g(cVar, "sampleKey");
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(cVar, 10);
            if (Qe < 1000) {
                if (Qe < 1) {
                    return false;
                }
                if (Math.abs(C86709a0.m107523b().mo121110g() % 1000) > Qe) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            Log.printErrStackTrace("MMResReporter", th, "get sample err:%s", cVar);
            return false;
        }
    }

    /* renamed from: d */
    public final void mo56979d(ResortZipStartTimeReportStruct resortZipStartTimeReportStruct) {
        String str;
        if (Log.getLogLevel() <= 1) {
            float f = ((float) resortZipStartTimeReportStruct.f79145f) / ((float) 1000000);
            switch ((int) resortZipStartTimeReportStruct.f79147h) {
                case 1:
                    str = "RES_TYPE_DRAWABLE";
                    break;
                case 2:
                    str = "RES_TYPE_RAW";
                    break;
                case 3:
                    str = "RES_TYPE_XML";
                    break;
                case 4:
                    str = "RES_TYPE_ASSET";
                    break;
                case 5:
                    str = "RES_TYPE_INFLATE_XML";
                    break;
                case 6:
                    str = "RES_TYPE_ACTIVITY_START";
                    break;
                case 7:
                    str = "RES_TYPE_ACTIVITY_START_VAS";
                    break;
                default:
                    str = "RES_TYPE_NONE";
                    break;
            }
            String q = resortZipStartTimeReportStruct.mo1006q();
            C87412m.m108593f(q, "struct.toShowString()");
            Log.m105919d("MMResReporter", "report%s costms:%s type:%s %s", 26008, Float.valueOf(f), str, C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
        }
    }

    /* renamed from: e */
    public final void mo56980e(C29899b bVar) {
        C87412m.m108594g(bVar, "reportScene");
        boolean c = mo56978c(C32735h.C32737c.clicfg_activity_cost_sample_and);
        if (Log.getLogLevel() <= 1) {
            Log.m105918d("MMResReporter", "tryReport() called with: reportScene = " + bVar + " isCanReport=" + c + " size = " + f80991c.size() + " process:" + MMApplicationContext.getProcessName());
        }
        Vector<C29898a> vector = f80991c;
        if (!(!vector.isEmpty())) {
            return;
        }
        if (!c) {
            try {
                vector.clear();
            } catch (Throwable th) {
                Log.printErrStackTrace("MMResReporter", th, "tryReport err", new Object[0]);
            }
        } else {
            ArrayList arrayList = new ArrayList(vector);
            vector.clear();
            C61926c.m72661F("MMResRepThread", new C29902e(arrayList));
        }
    }
}
