package c13;

import com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner;
import com.tencent.matrix.traffic.TrafficPlugin;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kj2.C117407d;
import p1047uf.C90656a;
import zt3.C119157j;

/* renamed from: c13.m */
public class C79914m {

    /* renamed from: a */
    public static TrafficPlugin f234114a = null;

    /* renamed from: b */
    public static C90656a f234115b = null;

    /* renamed from: c */
    public static boolean f234116c = false;

    /* renamed from: d */
    public static boolean f234117d = true;

    /* renamed from: e */
    public static final DateFormat f234118e = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.CHINA);

    /* renamed from: f */
    public static long f234119f = 0;

    /* renamed from: g */
    public static int f234120g = 0;

    /* renamed from: h */
    public static boolean f234121h = NetStatusUtil.isWifiFromCache(MMApplicationContext.getContext());

    /* renamed from: i */
    public static boolean f234122i = false;

    /* renamed from: j */
    public static int f234123j = 0;

    /* renamed from: k */
    public static long f234124k = 0;

    /* renamed from: l */
    public static long f234125l = 0;

    /* renamed from: m */
    public static String f234126m = null;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v49, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m97076a(int r26) {
        /*
            r1 = r26
            com.tencent.matrix.traffic.TrafficPlugin r0 = f234114a
            java.util.HashMap r0 = r0.mo112141g(r1)
            boolean r2 = r0.isEmpty()
            java.lang.String r3 = "MatrixTrafficCollector"
            if (r2 == 0) goto L_0x0026
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "trafficInfoMap is empty, dumpTraffic type = "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            return
        L_0x0026:
            r2 = 2
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r26)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = r0.toString()
            r7 = 1
            r4[r7] = r5
            java.lang.String r5 = "dumpTraffic type = %d, trafficInfoMap = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r4)
            java.util.Set r4 = r0.entrySet()
            java.util.Iterator r4 = r4.iterator()
            java.lang.String r5 = ""
            r10 = r5
            r11 = 0
            r13 = 0
        L_0x004b:
            boolean r15 = r4.hasNext()
            if (r15 == 0) goto L_0x0072
            java.lang.Object r15 = r4.next()
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15
            java.lang.Object r16 = r15.getKey()
            java.lang.String r16 = (java.lang.String) r16
            java.lang.Object r15 = r15.getValue()
            java.lang.String r15 = (java.lang.String) r15
            long r17 = java.lang.Long.parseLong(r15)
            long r13 = r13 + r17
            int r15 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r15 <= 0) goto L_0x004b
            r10 = r16
            r11 = r17
            goto L_0x004b
        L_0x0072:
            r4 = 3
            java.lang.Object[] r15 = new java.lang.Object[r4]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r26)
            r15[r6] = r16
            r15[r7] = r10
            java.lang.Long r16 = java.lang.Long.valueOf(r11)
            r15[r2] = r16
            java.lang.String r8 = "getTraffic final, type = %d, theKey = %s, maxTraffic = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r15)
            if (r10 == 0) goto L_0x035f
            boolean r8 = r10.isEmpty()
            if (r8 == 0) goto L_0x0092
            goto L_0x035f
        L_0x0092:
            long r8 = f234119f
            long r8 = r8 + r11
            f234119f = r8
            long r8 = f234125l
            long r8 = r8 + r13
            f234125l = r8
            java.lang.String r0 = r0.toString()
            r8 = 44
            r9 = 59
            java.lang.String r8 = r0.replace(r8, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r18 = 102400(0x19000, double:5.05923E-319)
            int r20 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r20 < 0) goto L_0x0130
            com.tencent.matrix.traffic.TrafficPlugin r0 = f234114a
            java.lang.String r0 = r0.mo112140f(r10)
            com.tencent.matrix.traffic.TrafficPlugin r4 = f234114a
            uf.a r4 = r4.f235662h
            boolean r4 = r4.f260468c
            if (r4 != 0) goto L_0x00c8
            goto L_0x00e6
        L_0x00c8:
            java.util.Map<java.lang.String, java.lang.String> r4 = com.tencent.matrix.traffic.TrafficPlugin.f235661j
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4
            java.lang.Object r4 = r4.get(r10)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x00e6
            boolean r21 = r4.isEmpty()
            if (r21 == 0) goto L_0x00db
            goto L_0x00e6
        L_0x00db:
            java.util.Map<java.lang.String, java.lang.String> r5 = com.tencent.matrix.traffic.TrafficPlugin.f235660i
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5
            java.lang.Object r4 = r5.get(r4)
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
        L_0x00e6:
            r9.append(r0)
            java.lang.String r4 = " \n "
            r9.append(r4)
            r9.append(r5)
            java.lang.String r4 = "\n"
            java.lang.String[] r0 = r0.split(r4)
            int r7 = r0.length
        L_0x00f8:
            if (r6 >= r7) goto L_0x012d
            r2 = r0[r6]
            r22 = r0
            java.lang.String r0 = "/"
            java.lang.String[] r0 = r2.split(r0)
            int r2 = r0.length
            r23 = r7
            r7 = 2
            if (r2 < r7) goto L_0x0119
            r2 = 0
            r7 = r0[r2]
            r15.append(r7)
            int r7 = r0.length
            int r7 = r7 + -1
            r0 = r0[r7]
            r15.append(r0)
            goto L_0x0122
        L_0x0119:
            r2 = 0
            int r7 = r0.length
            if (r7 <= 0) goto L_0x0122
            r0 = r0[r2]
            r15.append(r0)
        L_0x0122:
            r15.append(r4)
            int r6 = r6 + 1
            r0 = r22
            r7 = r23
            r2 = 2
            goto L_0x00f8
        L_0x012d:
            r15.append(r5)
        L_0x0130:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r2 = "webview_url_prefs_url"
            r4 = 0
            java.lang.String r2 = r0.getString(r2, r4)
            java.lang.String r0 = "-"
            int r0 = r10.indexOf(r0)     // Catch:{ all -> 0x0149 }
            r5 = 1
            int r0 = r0 + r5
            java.lang.String r0 = r10.substring(r0)     // Catch:{ all -> 0x0149 }
            goto L_0x0163
        L_0x0149:
            r0 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "dumpTraffic get threadName error : "
            r5.append(r6)
            java.lang.String r0 = r0.getMessage()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            r0 = r10
        L_0x0163:
            r5 = 6
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r7 = 0
            r6[r7] = r10
            java.lang.Long r7 = java.lang.Long.valueOf(r11)
            r10 = 1
            r6[r10] = r7
            java.lang.Long r7 = java.lang.Long.valueOf(r13)
            r10 = 2
            r6[r10] = r7
            r7 = 3
            r6[r7] = r9
            java.lang.Integer r7 = java.lang.Integer.valueOf(r26)
            r10 = 4
            r6[r10] = r7
            r7 = 5
            r6[r7] = r2
            java.lang.String r4 = "theKey = %s, maxTraffic = %d, sumTraffic = %d, evilStackTrace = %s, type = %d, lastUrl = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r6)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            java.lang.String r6 = r15.toString()
            int r15 = r6.length()
            if (r15 <= 0) goto L_0x01b2
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r6)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r5 = "stackMd5 = "
            r15.append(r5)
            r15.append(r6)
            java.lang.String r5 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            goto L_0x01b4
        L_0x01b2:
            java.lang.String r6 = "null"
        L_0x01b4:
            boolean r5 = f234121h
            if (r5 == 0) goto L_0x01b9
            return
        L_0x01b9:
            boolean r5 = c13.C79917p.f234136d
            r15 = 9
            r24 = 8
            if (r5 == 0) goto L_0x0330
            if (r1 != 0) goto L_0x01d4
            c13.p$a r5 = c13.C79917p.C79918a.INSTANCE
            boolean r25 = c13.C79917p.f234136d
            if (r25 != 0) goto L_0x01cd
            r5.getClass()
            goto L_0x01dd
        L_0x01cd:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.concurrent.atomic.AtomicLong> r7 = r5.f234139d
            java.util.Map r5 = r5.mo110080a(r7)
            goto L_0x01e5
        L_0x01d4:
            c13.p$a r5 = c13.C79917p.C79918a.INSTANCE
            boolean r7 = c13.C79917p.f234136d
            if (r7 != 0) goto L_0x01df
            r5.getClass()
        L_0x01dd:
            r5 = 0
            goto L_0x01e5
        L_0x01df:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.concurrent.atomic.AtomicLong> r7 = r5.f234140e
            java.util.Map r5 = r5.mo110080a(r7)
        L_0x01e5:
            if (r5 == 0) goto L_0x0330
            int r7 = r5.size()
            if (r7 <= 0) goto L_0x0330
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = "cdnTrafficMap = "
            r7.append(r11)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0209:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x028e
            java.lang.Object r7 = r5.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            r17 = r5
            r16 = r6
            r11 = 0
            long r5 = java.lang.Math.max(r11, r13)
            java.lang.Object r20 = r7.getValue()
            java.lang.Long r20 = (java.lang.Long) r20
            long r11 = r20.longValue()
            long r5 = java.lang.Math.min(r5, r11)
            java.lang.Object r11 = r7.getValue()
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            long r13 = r13 - r11
            int r11 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r11 < 0) goto L_0x0287
            kj2.d r11 = kj2.C117407d.INSTANCE
            java.lang.Object[] r12 = new java.lang.Object[r15]
            r20 = 0
            r12[r20] = r4
            r20 = 1
            r12[r20] = r0
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 2
            r12[r6] = r5
            r5 = 3
            r12[r5] = r9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r26)
            r12[r10] = r5
            r5 = 5
            r12[r5] = r8
            r5 = 6
            r12[r5] = r2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = r16
            r5.append(r6)
            java.lang.String r10 = "::"
            r5.append(r10)
            java.lang.Object r7 = r7.getKey()
            java.lang.String r7 = (java.lang.String) r7
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r7 = 7
            r12[r7] = r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV
            r12[r24] = r5
            r5 = 24883(0x6133, float:3.4869E-41)
            r11.mo160131h(r5, r12)
            goto L_0x0289
        L_0x0287:
            r6 = r16
        L_0x0289:
            r5 = r17
            r10 = 4
            goto L_0x0209
        L_0x028e:
            int r5 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r5 < 0) goto L_0x02de
            r5 = 1
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.Long r10 = java.lang.Long.valueOf(r13)
            r11 = 0
            r7[r11] = r10
            java.lang.String r10 = "tag=notClustered, traffic=%d\n"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r10, r7)
            kj2.d r7 = kj2.C117407d.INSTANCE
            java.lang.Object[] r10 = new java.lang.Object[r15]
            r10[r11] = r4
            r10[r5] = r0
            java.lang.Long r5 = java.lang.Long.valueOf(r13)
            r11 = 2
            r10[r11] = r5
            r5 = 3
            r10[r5] = r9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r26)
            r11 = 4
            r10[r11] = r5
            r5 = 5
            r10[r5] = r8
            r5 = 6
            r10[r5] = r2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            java.lang.String r11 = "::notClustered"
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            r11 = 7
            r10[r11] = r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV
            r10[r24] = r5
            r5 = 24883(0x6133, float:3.4869E-41)
            r7.mo160131h(r5, r10)
        L_0x02de:
            long r10 = -r13
            int r5 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r5 < 0) goto L_0x032f
            r5 = 1
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.Long r12 = java.lang.Long.valueOf(r10)
            r13 = 0
            r7[r13] = r12
            java.lang.String r12 = "tag=notHooked, traffic=%d\n"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r12, r7)
            kj2.d r3 = kj2.C117407d.INSTANCE
            java.lang.Object[] r7 = new java.lang.Object[r15]
            r7[r13] = r4
            r7[r5] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r4 = 2
            r7[r4] = r0
            r4 = 3
            r7[r4] = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r26)
            r1 = 4
            r7[r1] = r0
            r0 = 5
            r7[r0] = r8
            r0 = 6
            r7[r0] = r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r1 = "::notHooked"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 7
            r7[r1] = r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV
            r7[r24] = r0
            r0 = 24883(0x6133, float:3.4869E-41)
            r3.mo160131h(r0, r7)
        L_0x032f:
            return
        L_0x0330:
            if (r20 < 0) goto L_0x035f
            kj2.d r3 = kj2.C117407d.INSTANCE
            java.lang.Object[] r5 = new java.lang.Object[r15]
            r7 = 0
            r5[r7] = r4
            r4 = 1
            r5[r4] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            r4 = 2
            r5[r4] = r0
            r4 = 3
            r5[r4] = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r26)
            r1 = 4
            r5[r1] = r0
            r0 = 5
            r5[r0] = r8
            r0 = 6
            r5[r0] = r2
            r0 = 7
            r5[r0] = r6
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV
            r5[r24] = r0
            r0 = 24883(0x6133, float:3.4869E-41)
            r3.mo160131h(r0, r5)
        L_0x035f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c13.C79914m.m97076a(int):void");
    }

    /* renamed from: b */
    public static void m97077b() {
        if (f234122i) {
            f234124k += f234125l;
            if (!f234121h && AppExplicitBackgroundOwner.INSTANCE.isBackground() && (f234125l >= 20971520 || f234124k >= 314572800)) {
                int i = f234123j + 1;
                f234123j = i;
                if (i >= 10) {
                    C117407d.INSTANCE.mo160131h(24883, MMApplicationContext.getProcessName(), "kill-self", Long.valueOf(f234124k), f234126m, 110, f234118e.format(new Date()), MultiProcessMMKV.getDefault().getString("webview_url_prefs_url", (String) null), String.valueOf(f234125l), BuildInfo.REV);
                    Log.m105924i("MatrixTrafficCollector", "Try to kill self after 30s, because current process spend too much mobile traffic at background.");
                    ((C119157j) C119157j.f356862d).mo183878i(new m$$b(), 30000);
                }
                Log.m105925i("MatrixTrafficCollector", "unsafeCount=%d, totalTraffic=%d, currentTraffic=%d", Integer.valueOf(f234123j), Long.valueOf(f234124k), Long.valueOf(f234125l));
                if (f234123j == 1) {
                    f234126m = f234118e.format(new Date());
                    return;
                }
                return;
            }
            f234123j = 0;
            f234124k = 0;
        }
    }
}
