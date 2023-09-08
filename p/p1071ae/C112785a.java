package p1071ae;

import com.tencent.matrix.battery.accumulate.AccPowerStats;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import java.util.HashMap;
import java.util.Map;
import oa1.C117731d;
import p212oe.C117750b;
import p212oe.C117776s;
import p933be.C113173i;

/* renamed from: ae.a */
public class C112785a {

    /* renamed from: e */
    public static final int f337704e = ((BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.hasDebugger() || WeChatEnvironment.isCoolassistEnv()) ? 1 : 24);

    /* renamed from: f */
    public static C112785a f337705f = new C112785a();

    /* renamed from: a */
    public final Map<String, AccPowerStats> f337706a = new HashMap();

    /* renamed from: b */
    public boolean f337707b = false;

    /* renamed from: c */
    public final Runnable f337708c = new a$$a(this);

    /* renamed from: d */
    public final Runnable f337709d = new a$$b(this);

    /* renamed from: a */
    public void mo164538a(String str, C117776s sVar) {
        Log.m105924i("MicroMsg.AccPowerMonitor", "#collect: " + str);
        AccPowerStats accPowerStats = (AccPowerStats) ((HashMap) this.f337706a).get(str);
        if (accPowerStats == null) {
            accPowerStats = new AccPowerStats(str);
            ((HashMap) this.f337706a).put(str, accPowerStats);
        }
        sVar.mo173664h(new b$$a(accPowerStats, sVar));
    }

    /* renamed from: b */
    public void mo164539b() {
        C113173i e = C117750b.m166047e();
        if (e != null) {
            e.f338613h.f339059f.removeCallbacks(this.f337709d);
            e.f338613h.f339059f.postDelayed(this.f337709d, 60000);
        }
    }

    /* renamed from: c */
    public String mo164540c() {
        return C117731d.m166007c().mo182444f("clicfg_battery_acc_power_bg_poll", "0", false, true).equals("1") ? "ExplicitBgPoll" : "ExplicitBg";
    }

    /* renamed from: d */
    public String mo164541d() {
        return C117731d.m166007c().mo182444f("clicfg_battery_acc_power_fg_poll", "0", false, true).equals("1") ? "ExplicitFgPoll" : "ExplicitFg";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo164542e(long r52) {
        /*
            r51 = this;
            r1 = r51
            r2 = r52
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "#report, periodMs="
            r0.append(r4)
            r0.append(r2)
            java.lang.String r4 = ", size="
            r0.append(r4)
            java.util.Map<java.lang.String, com.tencent.matrix.battery.accumulate.AccPowerStats> r4 = r1.f337706a
            java.util.HashMap r4 = (java.util.HashMap) r4
            int r4 = r4.size()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "MicroMsg.AccPowerMonitor"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            java.util.Map<java.lang.String, com.tencent.matrix.battery.accumulate.AccPowerStats> r0 = r1.f337706a
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r5 = r0.iterator()
        L_0x0036:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x08aa
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r6 = r0.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r0.getValue()
            r7 = r0
            com.tencent.matrix.battery.accumulate.AccPowerStats r7 = (com.tencent.matrix.battery.accumulate.AccPowerStats) r7
            r7.f343034i = r2
            java.util.List<java.lang.String> r0 = p269xe.C91179e.C91181b.C91182a.f261437a
            java.lang.String r8 = "Matrix.battery.BatteryReporter"
            boolean r0 = p212oe.b$$f.m166056a()
            r9 = 0
            r10 = 1
            if (r0 != 0) goto L_0x0070
            boolean r0 = p212oe.C117750b.m166050h()
            if (r0 != 0) goto L_0x0070
            r0 = 10
            java.lang.String r11 = "powerAcc"
            boolean r0 = p212oe.b$$f.m166059d(r11, r0)
            if (r0 == 0) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            r0 = 0
            goto L_0x0071
        L_0x0070:
            r0 = 1
        L_0x0071:
            if (r0 != 0) goto L_0x0075
            goto L_0x0899
        L_0x0075:
            long r11 = r7.f343033h
            r13 = 0
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0899
            int r0 = r7.f343032g
            if (r0 > 0) goto L_0x0083
            goto L_0x0899
        L_0x0083:
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature> r0 = com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature.class
            com.tencent.matrix.batterycanary.monitor.feature.k0 r0 = p933be.C79691a.m96804a(r0)
            com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature r0 = (com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature) r0
            if (r0 != 0) goto L_0x008f
            goto L_0x0899
        L_0x008f:
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ NumberFormatException -> 0x00a0 }
            java.lang.String r15 = "clicfg_battery_power_charge_ratio"
            java.lang.String r13 = "30"
            java.lang.String r0 = r0.mo182444f(r15, r13, r9, r10)     // Catch:{ NumberFormatException -> 0x00a0 }
            int r15 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x00a0 }
            goto L_0x00bb
        L_0x00a0:
            r0 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "parse int err: "
            r13.append(r14)
            java.lang.String r0 = r0.getMessage()
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            r15 = 30
        L_0x00bb:
            long r13 = r7.f343036n
            float r0 = (float) r13
            r13 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r13
            long r9 = r7.f343033h
            float r9 = (float) r9
            float r0 = r0 / r9
            float r9 = (float) r15
            r10 = 2
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x00f0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "skip, chargeRatio="
            r0.append(r6)
            long r11 = r7.f343036n
            float r6 = (float) r11
            float r6 = r6 * r13
            long r11 = r7.f343033h
            float r7 = (float) r11
            float r6 = r6 / r7
            double r6 = (double) r6
            double r6 = p1195ge.C116951c.m165015p(r6, r10)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            goto L_0x0899
        L_0x00f0:
            r16 = 60000(0xea60, double:2.9644E-319)
            long r14 = r11 / r16
            r9 = 1
            long r14 = java.lang.Math.max(r9, r14)
            long r0 = r7.f343035j
            float r0 = (float) r0
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r1
            float r13 = (float) r11
            float r0 = r0 / r13
            int r0 = (int) r0
            long r9 = r7.f343036n
            float r9 = (float) r9
            float r9 = r9 * r1
            float r9 = r9 / r13
            int r1 = (int) r9
            long r9 = r7.f343034i
            r21 = 3600000(0x36ee80, double:1.7786363E-317)
            long r9 = r9 / r21
            r2 = 1
            long r2 = java.lang.Math.max(r2, r9)
            long r9 = r7.f343038p
            r41 = r4
            r42 = r5
            long r4 = r7.f343037o
            long r4 = java.lang.Math.max(r9, r4)
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            java.lang.String r10 = "power-profile"
            r19 = r0
            java.lang.String r0 = "supported"
            r9.put(r10, r0)
            java.lang.String r0 = p981ie.C117173p.f351032f
            java.lang.String r10 = "resType"
            r9.put(r10, r0)
            ae.a r0 = f337705f
            java.lang.String r0 = r0.mo164541d()
            java.lang.String r10 = "fg-mode"
            r9.put(r10, r0)
            ae.a r0 = f337705f
            java.lang.String r0 = r0.mo164540c()
            java.lang.String r10 = "bg-mode"
            r9.put(r10, r0)
            r0 = 2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r0 = r19
            r19 = r4
            java.lang.String r4 = "ver"
            r9.put(r4, r10)
            java.util.Calendar r4 = java.util.Calendar.getInstance()
            r10 = r0
            r5 = r1
            long r0 = r7.f343031f
            r4.setTimeInMillis(r0)
            r0 = 11
            int r0 = r4.get(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "report-fromHr"
            r9.put(r1, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.String r1 = "report-periodHr"
            r9.put(r1, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            java.lang.String r1 = "during-minute"
            r9.put(r1, r0)
            int r0 = r7.f343032g
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "during-count"
            r9.put(r1, r0)
            long r0 = r7.f343037o
            float r0 = (float) r0
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 * r1
            float r0 = r0 / r13
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "cpu-load-prc"
            r9.put(r2, r0)
            long r2 = r7.f343038p
            float r0 = (float) r2
            float r0 = r0 * r1
            float r0 = r0 / r13
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "cpu-load-uid"
            r9.put(r1, r0)
            long r0 = r7.f343037o
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "cpu-pid-jiffies"
            r9.put(r1, r0)
            long r0 = r7.f343038p
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "cpu-uid-jiffies"
            r9.put(r1, r0)
            int r0 = p981ie.C117159b.m165210k()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "cpu-core-num"
            r9.put(r1, r0)
            int r0 = r7.f343039q
            if (r0 <= 0) goto L_0x0238
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Boolean r0 = p737wf.C118763b.m167464b(r0)
            if (r0 == 0) goto L_0x0238
            boolean r1 = r0.booleanValue()
            if (r1 == 0) goto L_0x01f1
            r1 = 1000(0x3e8, float:1.401E-42)
            goto L_0x01f2
        L_0x01f1:
            r1 = 1
        L_0x01f2:
            int r2 = r7.f343039q
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "bat-count"
            r9.put(r3, r2)
            long r2 = r7.f343041s
            float r2 = (float) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r3
            int r4 = r7.f343039q
            float r4 = (float) r4
            float r2 = r2 / r4
            double r3 = (double) r2
            r2 = 2
            double r3 = p1195ge.C116951c.m165015p(r3, r2)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            java.lang.String r4 = "bat-temp-avg"
            r9.put(r4, r3)
            long r3 = r7.f343040r
            float r3 = (float) r3
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r4
            int r4 = r7.f343039q
            float r4 = (float) r4
            float r3 = r3 / r4
            float r1 = (float) r1
            float r3 = r3 / r1
            double r3 = (double) r3
            r1 = 2
            double r2 = p1195ge.C116951c.m165015p(r3, r1)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.String r3 = "bat-curr-avg"
            r9.put(r3, r2)
            java.lang.String r2 = "bat-curr-mcr"
            r9.put(r2, r0)
        L_0x0238:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.os.Bundle r2 = r7.f343043u
            boolean r2 = r2.isEmpty()
            java.lang.String r3 = "="
            java.lang.String r4 = ""
            java.lang.String r1 = "top-"
            r18 = r4
            java.lang.String r4 = "/"
            r21 = 1017370378(0x3ca3d70a, float:0.02)
            r22 = 1092616192(0x41200000, float:10.0)
            r23 = 1036831949(0x3dcccccd, float:0.1)
            if (r2 != 0) goto L_0x0405
            float r2 = r13 / r22
            float r24 = r2 * r21
            float r2 = r2 * r23
            r26 = r5
            android.os.Bundle r5 = r7.f343043u
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
            r25 = r18
            r31 = r25
            r27 = 0
            r29 = 0
        L_0x0271:
            boolean r32 = r5.hasNext()
            if (r32 == 0) goto L_0x03f0
            java.lang.Object r32 = r5.next()
            r33 = r5
            r5 = r32
            java.lang.String r5 = (java.lang.String) r5
            r32 = r10
            android.os.Bundle r10 = r7.f343043u
            android.os.Bundle r10 = r10.getBundle(r5)
            r34 = r8
            android.os.Bundle r8 = r7.f343044v
            android.os.Bundle r8 = r8.getBundle(r5)
            if (r10 == 0) goto L_0x03d0
            r35 = r6
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Set r36 = r10.keySet()
            java.util.Iterator r36 = r36.iterator()
        L_0x02a2:
            boolean r37 = r36.hasNext()
            if (r37 == 0) goto L_0x02c6
            java.lang.Object r37 = r36.next()
            r38 = r11
            r11 = r37
            java.lang.String r11 = (java.lang.String) r11
            r43 = r14
            r14 = 0
            long r45 = r10.getLong(r11, r14)
            java.lang.Long r12 = java.lang.Long.valueOf(r45)
            r6.put(r11, r12)
            r11 = r38
            r14 = r43
            goto L_0x02a2
        L_0x02c6:
            r38 = r11
            r43 = r14
            xe.e$b$a$$a r10 = new xe.e$b$a$$a
            r10.<init>()
            java.util.Map r6 = p981ie.C117159b.m165221v(r6, r10)
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            java.util.LinkedHashMap r6 = (java.util.LinkedHashMap) r6
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
            r40 = r13
            r13 = r18
            r12 = 0
            r14 = 0
            r36 = 0
        L_0x02f0:
            boolean r45 = r6.hasNext()
            if (r45 == 0) goto L_0x0382
            java.lang.Object r45 = r6.next()
            java.util.Map$Entry r45 = (java.util.Map.Entry) r45
            java.lang.Object r46 = r45.getKey()
            r47 = r6
            r6 = r46
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r45 = r45.getValue()
            java.lang.Long r45 = (java.lang.Long) r45
            r48 = r14
            r15 = r13
            long r13 = r45.longValue()
            if (r12 != 0) goto L_0x031a
            r45 = r6
            r36 = r13
            goto L_0x031c
        L_0x031a:
            r45 = r15
        L_0x031c:
            r15 = 5
            if (r12 >= r15) goto L_0x0370
            float r15 = (float) r13
            int r46 = (r15 > r24 ? 1 : (r15 == r24 ? 0 : -1))
            if (r46 <= 0) goto L_0x0344
            r46 = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            r50 = r1
            int r1 = r12 + 1
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            r10.put(r1, r6)
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            r11.put(r6, r1)
            goto L_0x0348
        L_0x0344:
            r50 = r1
            r46 = r7
        L_0x0348:
            if (r8 == 0) goto L_0x0374
            int r1 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0350
            if (r12 != 0) goto L_0x0374
        L_0x0350:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r4)
            r1.append(r6)
            r1.append(r3)
            java.util.ArrayList r6 = r8.getIntegerArrayList(r6)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            goto L_0x0374
        L_0x0370:
            r50 = r1
            r46 = r7
        L_0x0374:
            long r14 = r48 + r13
            int r12 = r12 + 1
            r13 = r45
            r7 = r46
            r6 = r47
            r1 = r50
            goto L_0x02f0
        L_0x0382:
            r50 = r1
            r46 = r7
            r48 = r14
            r15 = r13
            int r1 = (r48 > r29 ? 1 : (r48 == r29 ? 0 : -1))
            if (r1 <= 0) goto L_0x039b
            r1 = -1
            r6 = r15
            java.lang.String r1 = p269xe.C118872b.m167612i(r6, r1)
            r31 = r1
            r25 = r5
            r27 = r36
            r29 = r48
        L_0x039b:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.lang.Long r6 = java.lang.Long.valueOf(r48)
            java.lang.String r7 = "jiffies"
            r1.put(r7, r6)
            boolean r6 = r10.isEmpty()
            if (r6 != 0) goto L_0x03bb
            boolean r6 = r11.isEmpty()
            if (r6 != 0) goto L_0x03bb
            r1.putAll(r10)
            r1.putAll(r11)
        L_0x03bb:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "jiffy-"
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r9.put(r5, r1)
            goto L_0x03dc
        L_0x03d0:
            r50 = r1
            r35 = r6
            r46 = r7
            r38 = r11
            r40 = r13
            r43 = r14
        L_0x03dc:
            r10 = r32
            r5 = r33
            r8 = r34
            r6 = r35
            r11 = r38
            r13 = r40
            r14 = r43
            r7 = r46
            r1 = r50
            goto L_0x0271
        L_0x03f0:
            r50 = r1
            r35 = r6
            r46 = r7
            r34 = r8
            r32 = r10
            r38 = r11
            r40 = r13
            r43 = r14
            r1 = r25
            r2 = r31
            goto L_0x041c
        L_0x0405:
            r50 = r1
            r26 = r5
            r35 = r6
            r46 = r7
            r34 = r8
            r32 = r10
            r38 = r11
            r40 = r13
            r43 = r14
            r1 = r18
            r2 = r1
            r27 = 0
        L_0x041c:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = r46
            android.os.Bundle r7 = r6.f343045w
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x057d
            float r13 = r40 / r22
            float r21 = r21 * r13
            float r13 = r13 * r23
            android.os.Bundle r7 = r6.f343045w
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x043b:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x057d
            java.lang.Object r10 = r7.next()
            java.lang.String r10 = (java.lang.String) r10
            android.os.Bundle r11 = r6.f343045w
            android.os.Bundle r11 = r11.getBundle(r10)
            if (r11 == 0) goto L_0x0565
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            java.util.Set r14 = r11.keySet()
            java.util.Iterator r14 = r14.iterator()
        L_0x045c:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x047a
            java.lang.Object r15 = r14.next()
            java.lang.String r15 = (java.lang.String) r15
            r18 = r9
            r8 = 0
            long r24 = r11.getLong(r15, r8)
            java.lang.Long r8 = java.lang.Long.valueOf(r24)
            r12.put(r15, r8)
            r9 = r18
            goto L_0x045c
        L_0x047a:
            r18 = r9
            xe.e$b$a$$k r8 = new xe.e$b$a$$k
            r8.<init>()
            java.util.Map r8 = p981ie.C117159b.m165221v(r12, r8)
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            java.util.LinkedHashMap r8 = (java.util.LinkedHashMap) r8
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
            r12 = 0
        L_0x049a:
            boolean r14 = r8.hasNext()
            if (r14 == 0) goto L_0x052d
            java.lang.Object r14 = r8.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r15 = r14.getKey()
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r14 = r14.getValue()
            java.lang.Long r14 = (java.lang.Long) r14
            r24 = r7
            r25 = r8
            long r7 = r14.longValue()
            r14 = 3
            if (r12 >= r14) goto L_0x0515
            float r14 = (float) r7
            int r29 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r29 > 0) goto L_0x04ce
            if (r12 != 0) goto L_0x04c5
            goto L_0x04ce
        L_0x04c5:
            r29 = r0
            r31 = r1
            r30 = r2
            r2 = r50
            goto L_0x04f1
        L_0x04ce:
            r29 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r30 = r2
            r2 = r50
            r0.append(r2)
            r31 = r1
            int r1 = r12 + 1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.put(r0, r15)
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r11.put(r15, r0)
        L_0x04f1:
            int r0 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x04f7
            if (r12 != 0) goto L_0x051d
        L_0x04f7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r4)
            r0.append(r15)
            r0.append(r3)
            long r7 = r7 / r43
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r5.add(r0)
            goto L_0x051d
        L_0x0515:
            r29 = r0
            r31 = r1
            r30 = r2
            r2 = r50
        L_0x051d:
            int r12 = r12 + 1
            r50 = r2
            r7 = r24
            r8 = r25
            r0 = r29
            r2 = r30
            r1 = r31
            goto L_0x049a
        L_0x052d:
            r29 = r0
            r31 = r1
            r30 = r2
            r24 = r7
            r2 = r50
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto L_0x054e
            boolean r1 = r11.isEmpty()
            if (r1 != 0) goto L_0x054e
            r0.putAll(r9)
            r0.putAll(r11)
        L_0x054e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "task-"
            r1.append(r7)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r7 = r18
            r7.put(r1, r0)
            goto L_0x0570
        L_0x0565:
            r29 = r0
            r31 = r1
            r30 = r2
            r24 = r7
            r7 = r9
            r2 = r50
        L_0x0570:
            r50 = r2
            r9 = r7
            r7 = r24
            r0 = r29
            r2 = r30
            r1 = r31
            goto L_0x043b
        L_0x057d:
            r29 = r0
            r31 = r1
            r30 = r2
            r7 = r9
            r2 = r50
            android.os.Bundle r0 = r6.f343046x
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x063c
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            float r13 = r40 * r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            android.os.Bundle r1 = r6.f343046x
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x05a2:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x05be
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            android.os.Bundle r8 = r6.f343046x
            r9 = 0
            long r11 = r8.getLong(r3, r9)
            java.lang.Long r8 = java.lang.Long.valueOf(r11)
            r0.put(r3, r8)
            goto L_0x05a2
        L_0x05be:
            xe.e$b$a$$l r1 = new xe.e$b$a$$l
            r1.<init>()
            java.util.Map r0 = p981ie.C117159b.m165221v(r0, r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r8 = 0
        L_0x05dc:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x0620
            java.lang.Object r9 = r0.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r10 = r9.getKey()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r9.getValue()
            java.lang.Long r9 = (java.lang.Long) r9
            long r11 = r9.longValue()
            r9 = 3
            if (r8 >= r9) goto L_0x061d
            float r9 = (float) r11
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 > 0) goto L_0x0602
            if (r8 != 0) goto L_0x061d
        L_0x0602:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            int r14 = r8 + 1
            r9.append(r14)
            java.lang.String r9 = r9.toString()
            r1.put(r9, r10)
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            r3.put(r10, r9)
        L_0x061d:
            int r8 = r8 + 1
            goto L_0x05dc
        L_0x0620:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            boolean r8 = r1.isEmpty()
            if (r8 != 0) goto L_0x0637
            boolean r8 = r3.isEmpty()
            if (r8 != 0) goto L_0x0637
            r0.putAll(r1)
            r0.putAll(r3)
        L_0x0637:
            java.lang.String r1 = "wakelock-partial"
            r7.put(r1, r0)
        L_0x063c:
            android.os.Bundle r0 = r6.f343047y
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x06ef
            float r13 = r40 * r23
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            android.os.Bundle r1 = r6.f343047y
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0655:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0671
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            android.os.Bundle r8 = r6.f343047y
            r9 = 0
            long r11 = r8.getLong(r3, r9)
            java.lang.Long r8 = java.lang.Long.valueOf(r11)
            r0.put(r3, r8)
            goto L_0x0655
        L_0x0671:
            xe.e$b$a$$m r1 = new xe.e$b$a$$m
            r1.<init>()
            java.util.Map r0 = p981ie.C117159b.m165221v(r0, r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r9 = 0
        L_0x068f:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x06d3
            java.lang.Object r8 = r0.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r10 = r8.getKey()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r8 = r8.getValue()
            java.lang.Long r8 = (java.lang.Long) r8
            long r11 = r8.longValue()
            r8 = 3
            if (r9 >= r8) goto L_0x06d0
            float r14 = (float) r11
            int r14 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r14 > 0) goto L_0x06b5
            if (r9 != 0) goto L_0x06d0
        L_0x06b5:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r2)
            int r15 = r9 + 1
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r1.put(r14, r10)
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r3.put(r10, r11)
        L_0x06d0:
            int r9 = r9 + 1
            goto L_0x068f
        L_0x06d3:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x06ea
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x06ea
            r0.putAll(r1)
            r0.putAll(r3)
        L_0x06ea:
            java.lang.String r1 = "wakelock-full"
            r7.put(r1, r0)
        L_0x06ef:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.f343042t
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x06fb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x074a
            java.lang.Object r1 = r0.next()
            boolean r2 = r1 instanceof java.util.Map
            if (r2 == 0) goto L_0x0744
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "power"
            java.lang.Object r3 = r1.get(r2)
            boolean r8 = r3 instanceof java.lang.Double
            if (r8 == 0) goto L_0x0744
            java.lang.Double r3 = (java.lang.Double) r3
            double r8 = r3.doubleValue()
            r10 = 2
            double r8 = p1195ge.C116951c.m165015p(r8, r10)
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            r1.put(r2, r8)
            double r2 = r3.doubleValue()
            r8 = 4704985352480227328(0x414b774000000000, double:3600000.0)
            double r2 = r2 * r8
            r8 = r38
            double r11 = (double) r8
            double r2 = r2 / r11
            double r2 = p1195ge.C116951c.m165015p(r2, r10)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.String r3 = "powerAvg"
            r1.put(r3, r2)
            goto L_0x0747
        L_0x0744:
            r8 = r38
            r10 = 2
        L_0x0747:
            r38 = r8
            goto L_0x06fb
        L_0x074a:
            r10 = 2
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.f343042t
            r7.putAll(r0)
            zh.c$$f r0 = p285zh.c$$f.m167932b()
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Long> r1 = r0.f356711d
            DIGIT r1 = r1.f343211a
            java.lang.String r2 = "notify-push-count"
            r7.put(r2, r1)
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Long> r1 = r0.f356712e
            DIGIT r1 = r1.f343211a
            java.lang.String r2 = "notify-push-during"
            r7.put(r2, r1)
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Long> r1 = r0.f356713f
            DIGIT r1 = r1.f343211a
            java.lang.String r2 = "notify-net-count"
            r7.put(r2, r1)
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Long> r1 = r0.f356714g
            DIGIT r1 = r1.f343211a
            java.lang.String r2 = "notify-net-during"
            r7.put(r2, r1)
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Long> r1 = r0.f356715h
            DIGIT r1 = r1.f343211a
            java.lang.String r2 = "notify-msg-count"
            r7.put(r2, r1)
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Long> r1 = r0.f356716i
            DIGIT r1 = r1.f343211a
            java.lang.String r2 = "notify-msg-during"
            r7.put(r2, r1)
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Long> r0 = r0.f356717j
            DIGIT r0 = r0.f343211a
            java.lang.String r1 = "notify-lightPush-during"
            r7.put(r1, r0)
            java.lang.String r0 = "BizExplicitBgPoll"
            r1 = r35
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x07a0
            java.lang.String r0 = "BizExplicitBg"
            goto L_0x07a1
        L_0x07a0:
            r0 = r1
        L_0x07a1:
            java.lang.String r1 = "BizExplicitFgPoll"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x07ab
            java.lang.String r0 = "BizExplicitFg"
        L_0x07ab:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "accPower"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "Stats"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "#reportAccPowerStats "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = ": minute="
            r1.append(r2)
            r2 = r43
            r1.append(r2)
            java.lang.String r8 = ", avgPidJiffies="
            r1.append(r8)
            long r8 = r6.f343037o
            long r8 = r8 / r2
            r1.append(r8)
            java.lang.String r8 = ", avgUidJiffies="
            r1.append(r8)
            long r8 = r6.f343038p
            long r8 = r8 / r2
            r1.append(r8)
            java.lang.String r6 = ", topThread="
            r1.append(r6)
            r6 = r31
            r1.append(r6)
            r1.append(r4)
            r8 = r30
            r1.append(r8)
            r1.append(r4)
            long r11 = r27 / r2
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r4 = r34
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            java.util.Iterator r1 = r29.iterator()
        L_0x0815:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x0836
            java.lang.Object r9 = r1.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "#reportAccPowerStats tid: "
            r13.append(r14)
            r13.append(r9)
            java.lang.String r9 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            goto L_0x0815
        L_0x0836:
            java.util.Iterator r1 = r5.iterator()
        L_0x083a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x085b
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r13 = "#reportAccPowerStats task: "
            r9.append(r13)
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            goto L_0x083a
        L_0x085b:
            r17 = 0
            r18 = 5
            java.lang.String r1 = p269xe.C91179e.C91181b.m114438b(r7)
            r4 = 50
            r5 = r32
            r7 = r26
            if (r5 >= r4) goto L_0x086e
            r21 = 1
            goto L_0x0870
        L_0x086e:
            r21 = 2
        L_0x0870:
            if (r7 < r4) goto L_0x0875
            r22 = 1
            goto L_0x0877
        L_0x0875:
            r22 = 2
        L_0x0877:
            long r24 = r19 / r2
            long r4 = (long) r5
            r34 = r4
            long r4 = (long) r7
            r36 = r4
            r38 = 0
            java.lang.String r29 = "duringMin"
            java.lang.String r32 = ""
            java.lang.String r33 = ""
            java.lang.String r40 = ""
            r19 = r6
            r20 = r1
            r23 = r0
            r26 = r8
            r27 = r11
            r30 = r2
            p269xe.C91179e.C91181b.m114437a(r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r29, r30, r32, r33, r34, r36, r38, r40)
            goto L_0x089d
        L_0x0899:
            r41 = r4
            r42 = r5
        L_0x089d:
            r42.remove()
            r1 = r51
            r2 = r52
            r4 = r41
            r5 = r42
            goto L_0x0036
        L_0x08aa:
            r41 = r4
            java.lang.String r0 = "#deleteSaved"
            r1 = r41
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.lang.String r0 = "acc-power-stats.bin"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            r0.clearAll()
            p285zh.C119114c.m167917b()
            p285zh.C119114c.m167917b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1071ae.C112785a.mo164542e(long):void");
    }

    /* renamed from: f */
    public void mo164543f() {
        Log.m105924i("MicroMsg.AccPowerMonitor", "#scheduleSaving");
        C113173i e = C117750b.m166047e();
        if (e != null) {
            e.f338613h.f339059f.removeCallbacks(this.f337708c);
            e.f338613h.f339059f.postDelayed(this.f337708c, 600000);
        }
    }
}
