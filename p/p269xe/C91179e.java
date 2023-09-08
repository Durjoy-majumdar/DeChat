package p269xe;

import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.matrix.batterycanary.monitor.feature.C114436a;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.sdk.platformtools.AppBrands;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kj2.C117407d;
import org.json.JSONObject;
import p1177ce.C113287a;
import p212oe.C117750b;
import p212oe.b$$f;
import p723vf.C118672d;
import p761yd.C91440a;
import p933be.C113173i;
import p981ie.C117159b;

/* renamed from: xe.e */
public final class C91179e {

    /* renamed from: xe.e$a */
    public static class C91180a {
        /* renamed from: a */
        public static void m114434a(long j) {
            if (j >= 300000) {
                int i = j < 600000 ? 70 : j < 1800000 ? 71 : 72;
                if (i > 0) {
                    C117407d.INSTANCE.idkeyStat(1540, (long) i, 1, false);
                }
            }
        }

        /* renamed from: b */
        public static void m114435b(boolean z) {
            C117407d.INSTANCE.idkeyStat(1540, z ? 2 : 3, 1, false);
        }

        /* renamed from: c */
        public static void m114436c(boolean z) {
            C117407d.INSTANCE.idkeyStat(1540, z ? 4 : 5, 1, false);
        }
    }

    /* renamed from: xe.e$b */
    public static class C91181b {

        /* renamed from: a */
        public static final SparseArray<Integer> f261436a = new SparseArray<>();

        /* renamed from: xe.e$b$a */
        public static final class C91182a {

            /* renamed from: a */
            public static List<String> f261437a = Collections.emptyList();

            /* renamed from: b */
            public static int f261438b = C117159b.m165216q(MMApplicationContext.getContext());

            /* JADX WARNING: Removed duplicated region for block: B:35:0x00e0  */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x0108  */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x0112  */
            /* JADX WARNING: Removed duplicated region for block: B:49:0x0126  */
            /* JADX WARNING: Removed duplicated region for block: B:50:0x0151  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static void m114440a(p1177ce.C113287a r31, com.tencent.matrix.batterycanary.monitor.feature.C114490k0.C114491a.C114492a<com.tencent.matrix.batterycanary.monitor.feature.C114436a.C114440d> r32, java.lang.String r33) {
                /*
                    r0 = r31
                    r1 = r32
                    long r2 = r1.f343208d
                    r4 = 60000(0xea60, double:2.9644E-319)
                    long r2 = r2 / r4
                    r4 = 1
                    long r19 = java.lang.Math.max(r4, r2)
                    RECORD r2 = r1.f343207c
                    com.tencent.matrix.batterycanary.monitor.feature.a$d r2 = (com.tencent.matrix.batterycanary.monitor.feature.C114436a.C114440d) r2
                    com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Long> r2 = r2.f343110g
                    DIGIT r2 = r2.f343211a
                    java.lang.Long r2 = (java.lang.Long) r2
                    long r2 = r2.longValue()
                    long r13 = r2 / r19
                    long r2 = p212oe.C117750b.f352127f
                    r4 = 1000(0x3e8, double:4.94E-321)
                    long r2 = java.lang.Math.max(r2, r4)
                    int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
                    if (r4 >= 0) goto L_0x002d
                    return
                L_0x002d:
                    boolean r2 = r31.mo165843g()
                    if (r2 != 0) goto L_0x0186
                    int r2 = r0.f338964b
                    int r3 = p212oe.C117750b.f352122a
                    r4 = 0
                    int r3 = java.lang.Math.max(r3, r4)
                    if (r2 > r3) goto L_0x0040
                    goto L_0x0186
                L_0x0040:
                    java.lang.String r8 = p269xe.C118872b.m167609f()
                    int r10 = r31.mo165839c()
                    int r11 = r31.mo165840d()
                    int r2 = r0.f338972j
                    java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.j0> r3 = com.tencent.matrix.batterycanary.monitor.feature.C114486j0.class
                    com.tencent.matrix.batterycanary.monitor.feature.k0 r3 = p933be.C79691a.m96804a(r3)
                    com.tencent.matrix.batterycanary.monitor.feature.a r3 = (com.tencent.matrix.batterycanary.monitor.feature.C114436a) r3
                    r5 = 0
                    java.lang.String r6 = "Matrix.battery.BatteryReporter"
                    if (r3 == 0) goto L_0x00fd
                    RECORD r7 = r1.f343207c
                    com.tencent.matrix.batterycanary.monitor.feature.a$d r7 = (com.tencent.matrix.batterycanary.monitor.feature.C114436a.C114440d) r7
                    com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Long> r7 = r7.f343110g
                    DIGIT r7 = r7.f343211a
                    java.lang.Long r7 = (java.lang.Long) r7
                    long r23 = r7.longValue()
                    RECORD r7 = r1.f343206b
                    com.tencent.matrix.batterycanary.monitor.feature.a$d r7 = (com.tencent.matrix.batterycanary.monitor.feature.C114436a.C114440d) r7
                    com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Long> r7 = r7.f343110g
                    DIGIT r7 = r7.f343211a
                    java.lang.Long r7 = (java.lang.Long) r7
                    long r25 = r7.longValue()
                    RECORD r7 = r1.f343207c
                    com.tencent.matrix.batterycanary.monitor.feature.a$d r7 = (com.tencent.matrix.batterycanary.monitor.feature.C114436a.C114440d) r7
                    int r7 = r7.f343107d
                    r15 = 0
                    int r9 = (r25 > r15 ? 1 : (r25 == r15 ? 0 : -1))
                    if (r9 <= 0) goto L_0x00fd
                    java.util.ArrayList r9 = r3.mo173636m(r7)
                    if (r9 == 0) goto L_0x0092
                    r21 = r3
                    r22 = r7
                    ie.w$d r3 = r21.mo173635l(r22, r23, r25)
                    goto L_0x0093
                L_0x0092:
                    r3 = r5
                L_0x0093:
                    if (r3 == 0) goto L_0x00fd
                    boolean r7 = r3.f351076c
                    if (r7 == 0) goto L_0x00fd
                    ie.w$d$a r7 = r3.mo181114b()
                    if (r7 == 0) goto L_0x00dc
                    java.lang.String r9 = r7.f351077a
                    boolean r9 = android.text.TextUtils.isEmpty(r9)
                    java.lang.String r12 = "thread_pool@idle"
                    if (r9 != 0) goto L_0x00b6
                    java.lang.String r9 = r7.f351077a
                    boolean r9 = r9.equals(r12)
                    if (r9 != 0) goto L_0x00b6
                    java.lang.String r3 = r7.f351077a
                    int r5 = r7.f351078b
                    goto L_0x00d5
                L_0x00b6:
                    ie.w$d$a r3 = r3.mo181115c()
                    if (r3 == 0) goto L_0x00dc
                    java.lang.String r7 = r3.f351077a
                    boolean r7 = android.text.TextUtils.isEmpty(r7)
                    if (r7 != 0) goto L_0x00dc
                    java.lang.String r7 = r3.f351077a
                    boolean r7 = r7.equals(r12)
                    if (r7 != 0) goto L_0x00dc
                    java.lang.String r5 = r3.f351077a
                    int r3 = r3.f351078b
                    r30 = r5
                    r5 = r3
                    r3 = r30
                L_0x00d5:
                    r7 = 1
                    r30 = r5
                    r5 = r3
                    r3 = r30
                    goto L_0x00de
                L_0x00dc:
                    r3 = 0
                    r7 = 0
                L_0x00de:
                    if (r7 == 0) goto L_0x00fe
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    java.lang.String r9 = " #overHeat reportJiffies found task: name = "
                    r7.append(r9)
                    r7.append(r5)
                    java.lang.String r9 = ", ratio = "
                    r7.append(r9)
                    r7.append(r3)
                    java.lang.String r7 = r7.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
                    goto L_0x00fe
                L_0x00fd:
                    r3 = 0
                L_0x00fe:
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    boolean r7 = android.text.TextUtils.isEmpty(r5)
                    if (r7 != 0) goto L_0x0112
                    if (r3 != 0) goto L_0x010b
                    goto L_0x010f
                L_0x010b:
                    int r4 = r3.intValue()
                L_0x010f:
                    r2 = r4
                    r9 = r5
                    goto L_0x0114
                L_0x0112:
                    r9 = r33
                L_0x0114:
                    boolean r3 = p212oe.C117750b.f352138q
                    java.lang.String r4 = ""
                    if (r3 == 0) goto L_0x0151
                    r15 = 5
                    int r3 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
                    if (r3 < 0) goto L_0x0151
                    r15 = 3000(0xbb8, double:1.482E-320)
                    int r3 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                    if (r3 < 0) goto L_0x0151
                    RECORD r3 = r1.f343207c
                    com.tencent.matrix.batterycanary.monitor.feature.a$d r3 = (com.tencent.matrix.batterycanary.monitor.feature.C114436a.C114440d) r3
                    int r3 = r3.f343107d
                    d3.c r3 = p269xe.C91178c.m114429b(r3)
                    F r4 = r3.f166179a
                    java.lang.String r4 = (java.lang.String) r4
                    S r3 = r3.f166180b
                    java.lang.String r3 = (java.lang.String) r3
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    java.lang.String r7 = " #overHeat matrix internal thread, stack = \n"
                    r5.append(r7)
                    r5.append(r4)
                    java.lang.String r5 = r5.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
                    r29 = r3
                    r22 = r4
                    goto L_0x0155
                L_0x0151:
                    r22 = r4
                    r29 = r22
                L_0x0155:
                    java.lang.String r3 = "#reportInternalJiffies"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
                    android.util.SparseArray<java.lang.Integer> r3 = p269xe.C91179e.C91181b.f261436a
                    r6 = 1
                    r7 = 5
                    RECORD r1 = r1.f343206b
                    com.tencent.matrix.batterycanary.monitor.feature.a$d r1 = (com.tencent.matrix.batterycanary.monitor.feature.C114436a.C114440d) r1
                    com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Long> r1 = r1.f343110g
                    DIGIT r1 = r1.f343211a
                    java.lang.Long r1 = (java.lang.Long) r1
                    long r16 = r1.longValue()
                    java.lang.String r1 = r0.f338971i
                    r21 = r1
                    int r1 = r0.f338964b
                    long r3 = (long) r1
                    r23 = r3
                    int r0 = r0.f338967e
                    long r0 = (long) r0
                    r25 = r0
                    long r0 = (long) r2
                    r27 = r0
                    java.lang.String r12 = "avgSelfJiffiesException"
                    java.lang.String r15 = "matrix_default_"
                    java.lang.String r18 = "duringMin"
                    p269xe.C91179e.C91181b.m114437a(r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r18, r19, r21, r22, r23, r25, r27, r29)
                L_0x0186:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p269xe.C91179e.C91181b.C91182a.m114440a(ce.a, com.tencent.matrix.batterycanary.monitor.feature.k0$a$a, java.lang.String):void");
            }

            /* renamed from: b */
            public static void m114441b(String str, C114467i iVar, boolean z) {
                C113173i e = C117750b.m166047e();
                if (e != null) {
                    if (str.equals("canary") || str.equals("module") || str.equals("biz") || str.equals("alertBatt") || str.equals("alertThermal")) {
                        iVar.mo173664h(new e$b$a$$q(iVar, str, e, z));
                    }
                }
            }

            /* renamed from: c */
            public static void m114442c(boolean z, String str, C114490k0.C114491a.C114492a<C114436a.C114440d> aVar) {
                String str2;
                String str3 = str;
                C114490k0.C114491a.C114492a<C114436a.C114440d> aVar2 = aVar;
                String f = C118872b.m167609f();
                StringBuilder sb = new StringBuilder();
                RECORD record = aVar2.f343207c;
                int i = ((C114436a.C114440d) record).f343111h;
                int i2 = ((C114436a.C114440d) record).f343112i;
                long max = Math.max(1, aVar2.f343208d / 60000);
                long longValue = ((Long) ((C114436a.C114440d) aVar2.f343207c).f343110g.f343211a).longValue() / max;
                Log.m105924i("Matrix.battery.BatteryReporter", "#reportTaskJiffiesException, feat = " + str3);
                sb.append("finish=");
                sb.append(((C114436a.C114440d) aVar2.f343207c).f343114k);
                int h = C117159b.m165207h(MMApplicationContext.getContext());
                sb.append("|");
                sb.append("batTemp=");
                sb.append(h);
                int[] l = C117159b.m165211l();
                if (l.length > 0) {
                    sb.append("|");
                    sb.append("cupFreq=");
                    sb.append(Arrays.toString(l));
                }
                StringBuilder sb4 = new StringBuilder();
                if (str3.equals("threadPool")) {
                    str2 = "avgTaskJiffies";
                } else {
                    str2 = "avg" + C118872b.m167604a(str) + "TaskJiffies";
                }
                sb4.append(str2);
                sb4.append(z ? "LongException" : "Exception");
                String sb5 = sb4.toString();
                SparseArray<Integer> sparseArray = C91181b.f261436a;
                String sb6 = sb.toString();
                String str4 = ((C114436a.C114440d) aVar2.f343207c).f343108e;
                long longValue2 = ((Long) ((C114436a.C114440d) aVar2.f343206b).f343110g.f343211a).longValue();
                RECORD record2 = aVar2.f343207c;
                C91181b.m114437a(1, 5, f, sb6, i, i2, sb5, longValue, str4, longValue2, "duringMin", max, ((C114436a.C114440d) record2).f343113j, "", ((C114436a.C114440d) record2).f343115l, ((C114436a.C114440d) record2).f343116m, ((C114436a.C114440d) record2).f343117n, "");
            }

            /* renamed from: d */
            public static void m114443d(C113287a aVar, boolean z, long j, long j2) {
                C113287a aVar2 = aVar;
                if (!aVar.mo165843g() && aVar2.f338964b > Math.max(C117750b.f352122a, 0)) {
                    String f = C118872b.m167609f();
                    String str = z ? "wifi" : "mobile";
                    int c = aVar.mo165839c();
                    int d = aVar.mo165840d();
                    Log.m105924i("Matrix.battery.BatteryReporter", "#reportTrafficException");
                    SparseArray<Integer> sparseArray = C91181b.f261436a;
                    C91181b.m114437a(1, 5, f, str, c, d, z ? "avgWifiException" : "avgRadioException", z ? j : j2, z ? "avgRadio" : "avgWifi", z ? j2 : j, "duringMin", Math.max(1, aVar2.f338976n / 60000), aVar2.f338971i, "", (long) aVar2.f338964b, (long) aVar2.f338967e, (long) aVar2.f338972j, "");
                }
            }
        }

        /* renamed from: xe.e$b$b */
        public static final class C91183b {
            /* renamed from: a */
            public static void m114444a(String str, String str2) {
                if (b$$f.m166058c()) {
                    String f = C118872b.m167609f();
                    StringBuilder sb = new StringBuilder();
                    sb.append("#statMetricsCompat, type = ");
                    String str3 = str;
                    sb.append(str3);
                    Log.m105924i("Matrix.battery.BatteryReporter", sb.toString());
                    C91181b.m114437a(1, 5, f, "", 0, 0, "metricsCompat", 0, str3, 0, str2, 0, "", "", 0, 0, 0, "");
                }
            }
        }

        /* renamed from: a */
        public static void m114437a(int i, int i2, String str, String str2, int i3, int i4, String str3, long j, String str4, long j2, String str5, long j3, String str6, String str7, long j4, long j5, long j6, String str8) {
            m114439c(false, i, i2, str, str2, i3, i4, str3, j, str4, j2, str5, j3, str6, str7, j4, j5, j6, str8);
        }

        /* renamed from: b */
        public static String m114438b(Map<String, Object> map) {
            try {
                return new JSONObject(map).toString().replace(",", ";");
            } catch (Exception e) {
                C118672d.m167354d("Matrix.battery.BatteryReporter", e, "json error", new Object[0]);
                return e.getMessage();
            }
        }

        /* renamed from: c */
        public static void m114439c(boolean z, int i, int i2, String str, String str2, int i3, int i4, String str3, long j, String str4, long j2, String str5, long j3, String str6, String str7, long j4, long j5, long j6, String str8) {
            String str9 = str;
            String str10 = str2;
            String str11 = str3;
            String str12 = str4;
            String str13 = str5;
            String str14 = str6;
            String str15 = str7;
            String str16 = str8;
            if (z) {
                Log.m105924i("Matrix.battery.BatteryReporter", "#kvPost, data: \n\ttype = " + i + "\n, version = " + i2 + "\n, proc = " + str9 + "\n, extra = " + str10 + "\n, appStat = " + i3 + "\n, devStat = " + i4 + "\n, keyDgt1 = " + str11 + "\n, valDgt1 = " + j + "\n, keyDgt2 = " + str12 + "\n, valDgt2 = " + j2 + "\n, keyDgt3 = " + str13 + "\n, valDgt3 " + j3 + "\n, scene = " + str14 + "\n, stack = " + str15 + "\n, extraDigit1 = " + j4 + "\n, extraDigit2 = " + j5 + "\n, extraDigit3 = " + j6 + "\n, stackR = " + str16);
            } else {
                int i5 = i3;
                int i6 = i4;
                long j7 = j;
                long j8 = j6;
            }
            C117407d.INSTANCE.mo160131h(21468, Integer.valueOf(i), Integer.valueOf(i2), str9, str10, Integer.valueOf(i3), Integer.valueOf(i4), str11, Long.valueOf(j), str12, Long.valueOf(j2), str13, Long.valueOf(j3), str14, str15, Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6), str16, BuildInfo.REV);
        }
    }

    /* renamed from: a */
    public static String m114432a() {
        String c = AppForegroundDelegate.INSTANCE.mo174210c();
        if (TextUtils.isEmpty(c)) {
            c = C91440a.INSTANCE.mo125374a();
        }
        return m114433b(c);
    }

    /* renamed from: b */
    public static String m114433b(String str) {
        AppBrands.AppBrandAppInfo appBrandInfo;
        return (!AppBrands.isAppBrandProc() || (appBrandInfo = AppBrands.getAppBrandInfo()) == null || TextUtils.isEmpty(appBrandInfo.appName)) ? str.contains("@") ? str.substring(0, str.lastIndexOf("@")) : str : appBrandInfo.appName;
    }
}
