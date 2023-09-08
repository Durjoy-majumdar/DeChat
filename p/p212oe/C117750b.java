package p212oe;

import android.text.TextUtils;
import android.text.format.DateFormat;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import oa1.C117731d;
import p1177ce.C113287a;
import p269xe.C118873d;
import p761yd.C91441c;
import p933be.C113173i;
import qe3.C89625d;

/* renamed from: oe.b */
public final class C117750b {

    /* renamed from: a */
    public static int f352122a = 50;

    /* renamed from: b */
    public static long f352123b = 300000;

    /* renamed from: c */
    public static long f352124c = 6000;

    /* renamed from: d */
    public static long f352125d = 120;

    /* renamed from: e */
    public static long f352126e = 120000;

    /* renamed from: f */
    public static long f352127f = 2000;

    /* renamed from: g */
    public static long f352128g = 2;

    /* renamed from: h */
    public static int f352129h = 100;

    /* renamed from: i */
    public static int f352130i = 200;

    /* renamed from: j */
    public static int f352131j = 50;

    /* renamed from: k */
    public static long f352132k = 104857600;

    /* renamed from: l */
    public static long f352133l = 60000;

    /* renamed from: m */
    public static long f352134m = 300000;

    /* renamed from: n */
    public static boolean f352135n = false;

    /* renamed from: o */
    public static boolean f352136o = false;

    /* renamed from: p */
    public static boolean f352137p = false;

    /* renamed from: q */
    public static boolean f352138q = true;

    /* renamed from: r */
    public static boolean f352139r = true;

    /* renamed from: s */
    public static boolean f352140s = true;

    /* renamed from: t */
    public static String f352141t = "";

    /* renamed from: u */
    public static long f352142u;

    /* renamed from: v */
    public static C118873d f352143v;

    /* renamed from: w */
    public static C113173i f352144w;

    /* renamed from: x */
    public static AtomicBoolean f352145x;

    /* JADX WARNING: Removed duplicated region for block: B:340:0x07d4  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x07f7  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x080d  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x081a  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0826  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0832  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x0839  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0840  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x0847  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x084e  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0855  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x085c  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x0863  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x087c  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x08ae  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x08c8  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x0901  */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x090a  */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x0913  */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x092c  */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x0935  */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x093e  */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0967  */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x097f  */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x0986  */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x09a1  */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x09b1  */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x09c8  */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x09dc  */
    /* JADX WARNING: Removed duplicated region for block: B:448:0x09e8  */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x09fe  */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x0a14  */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x0a2a  */
    /* JADX WARNING: Removed duplicated region for block: B:460:0x0a53  */
    /* JADX WARNING: Removed duplicated region for block: B:463:0x0a69  */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0a75  */
    /* JADX WARNING: Removed duplicated region for block: B:469:0x0a7b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p933be.C113173i m166043a() {
        /*
            java.lang.String r0 = "clicfg_battery_ams_hook_enable"
            java.lang.String r1 = "Matrix.battery.BatteryCanaryConfigs"
            java.lang.String r2 = ""
            java.lang.String r3 = "0"
            java.lang.String r4 = "1"
            boolean r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r5 == 0) goto L_0x0024
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 24
            if (r5 < r6) goto L_0x0024
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            p212oe.C117774q.m166126i(r5)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            p212oe.C117774q.m166125h(r5)
        L_0x0024:
            r5 = 5
            oe.b$$c r6 = new oe.b$$c
            r6.<init>()
            f62.C75701k1.m90961a(r5, r6)
            oe.b$$d r5 = new oe.b$$d
            r5.<init>()
            p981ie.C117178r.f351048b = r5
            xe.d r5 = new xe.d
            r5.<init>()
            f352143v = r5
            r5 = 1
            r6 = 0
            oa1.d r7 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0747 }
            java.lang.String r8 = "clicfg_battery_global_enable"
            java.lang.String r7 = r7.mo182444f(r8, r4, r6, r5)     // Catch:{ Exception -> 0x0747 }
            boolean r7 = r4.equals(r7)     // Catch:{ Exception -> 0x0747 }
            oa1.d r8 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x06d2 }
            java.lang.String r9 = "clicfg_battery_stat_pid_proc"
            java.lang.String r8 = r8.mo182444f(r9, r4, r6, r5)     // Catch:{ Exception -> 0x06d2 }
            boolean r8 = r4.equals(r8)     // Catch:{ Exception -> 0x06d2 }
            oa1.d r9 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x06c0 }
            java.lang.String r10 = "clicfg_battery_devstat_enable"
            java.lang.String r9 = r9.mo182444f(r10, r4, r6, r5)     // Catch:{ Exception -> 0x06c0 }
            boolean r9 = r4.equals(r9)     // Catch:{ Exception -> 0x06c0 }
            oa1.d r10 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0695 }
            java.lang.String r11 = "clicfg_battery_threadpool_enable"
            java.lang.String r10 = r10.mo182444f(r11, r4, r6, r5)     // Catch:{ Exception -> 0x0695 }
            boolean r10 = r4.equals(r10)     // Catch:{ Exception -> 0x0695 }
            oa1.d r11 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0686 }
            java.lang.String r12 = "clicfg_battery_mmhandler_task_enable"
            java.lang.String r11 = r11.mo182444f(r12, r4, r6, r5)     // Catch:{ Exception -> 0x0686 }
            boolean r11 = r4.equals(r11)     // Catch:{ Exception -> 0x0686 }
            oa1.d r12 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0675 }
            java.lang.String r13 = "clicfg_battery_ipc_task_enable"
            java.lang.String r12 = r12.mo182444f(r13, r4, r6, r5)     // Catch:{ Exception -> 0x0675 }
            boolean r12 = r4.equals(r12)     // Catch:{ Exception -> 0x0675 }
            oa1.d r13 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0666 }
            java.lang.String r14 = "clicfg_battery_module_jiffies_enable"
            java.lang.String r5 = r13.mo182444f(r14, r4, r6, r5)     // Catch:{ Exception -> 0x0666 }
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x0666 }
            java.util.concurrent.atomic.AtomicBoolean r13 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ Exception -> 0x0654 }
            oa1.d r14 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0654 }
            java.lang.String r15 = "clicfg_battery_process_scope_lifecycle"
            r16 = r5
            r5 = 1
            java.lang.String r5 = r14.mo182444f(r15, r4, r6, r5)     // Catch:{ Exception -> 0x0650 }
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x0650 }
            r13.<init>(r5)     // Catch:{ Exception -> 0x0650 }
            f352145x = r13     // Catch:{ Exception -> 0x0650 }
            oa1.d r5 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0650 }
            java.lang.String r13 = "clicfg_battery_bluetooth_enable"
            r14 = 1
            java.lang.String r5 = r5.mo182444f(r13, r4, r6, r14)     // Catch:{ Exception -> 0x0650 }
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x0650 }
            oa1.d r13 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x063e }
            java.lang.String r15 = "clicfg_battery_wifi_enable"
            java.lang.String r13 = r13.mo182444f(r15, r4, r6, r14)     // Catch:{ Exception -> 0x063e }
            boolean r13 = r4.equals(r13)     // Catch:{ Exception -> 0x063e }
            oa1.d r14 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x062b }
            java.lang.String r15 = "clicfg_battery_location_enable"
            r17 = r5
            r5 = 1
            java.lang.String r5 = r14.mo182444f(r15, r4, r6, r5)     // Catch:{ Exception -> 0x0627 }
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x0627 }
            oa1.d r14 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0616 }
            java.lang.String r15 = "clicfg_battery_stats_enable"
            r18 = r5
            r5 = 1
            java.lang.String r5 = r14.mo182444f(r15, r4, r6, r5)     // Catch:{ Exception -> 0x0612 }
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x0612 }
            oa1.d r14 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x05ff }
            java.lang.String r15 = "clicfg_battery_top_enable"
            r19 = r5
            r5 = 1
            java.lang.String r5 = r14.mo182444f(r15, r4, r6, r5)     // Catch:{ Exception -> 0x05fb }
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x05fb }
            oa1.d r14 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x05ea }
            java.lang.String r15 = "clicfg_battery_traffic_enable"
            r20 = r5
            r5 = 1
            java.lang.String r5 = r14.mo182444f(r15, r4, r6, r5)     // Catch:{ Exception -> 0x05e6 }
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x05e6 }
            oa1.d r14 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x05d3 }
            java.lang.String r15 = "clicfg_battery_health_enable"
            r21 = r5
            r5 = 1
            java.lang.String r5 = r14.mo182444f(r15, r4, r6, r5)     // Catch:{ Exception -> 0x05cf }
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x05cf }
            oa1.d r14 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x05be }
            java.lang.String r15 = "clicfg_battery_canary_thread"
            r22 = r5
            r5 = 1
            java.lang.String r5 = r14.mo182444f(r15, r3, r6, r5)     // Catch:{ Exception -> 0x05ba }
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x05ba }
            oa1.d r14 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x05a5 }
            java.lang.String r15 = "clicfg_battery_fg_loop_enable"
            r23 = r5
            r5 = 1
            java.lang.String r5 = r14.mo182444f(r15, r3, r6, r5)     // Catch:{ Exception -> 0x05a1 }
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x05a1 }
            oa1.d r14 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x058c }
            java.lang.String r15 = "clicfg_battery_wakelock_enable"
            r24 = r5
            r5 = 1
            java.lang.String r5 = r14.mo182444f(r15, r3, r6, r5)     // Catch:{ Exception -> 0x0588 }
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x0588 }
            oa1.d r14 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x056f }
            java.lang.String r15 = "clicfg_battery_alarm_enable"
            r25 = r5
            r5 = 1
            java.lang.String r5 = r14.mo182444f(r15, r3, r6, r5)     // Catch:{ Exception -> 0x056b }
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x056b }
            oa1.d r14 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0552 }
            java.lang.String r15 = "clicfg_battery_bg_loop_r_enable"
            r26 = r5
            r5 = 1
            java.lang.String r5 = r14.mo182444f(r15, r3, r6, r5)     // Catch:{ Exception -> 0x054e }
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x054e }
            oa1.d r14 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0533 }
            java.lang.String r15 = "clicfg_battery_use_thread_clock"
            r27 = r5
            r5 = 1
            java.lang.String r14 = r14.mo182444f(r15, r3, r6, r5)     // Catch:{ Exception -> 0x052f }
            r4.equals(r14)     // Catch:{ Exception -> 0x052f }
            oa1.d r14 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x052f }
            java.lang.String r5 = r14.mo182444f(r0, r3, r6, r5)     // Catch:{ Exception -> 0x052f }
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x052f }
            oa1.d r14 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0512 }
            boolean r15 = p206nj.C76866m.m92673b()     // Catch:{ Exception -> 0x0512 }
            if (r15 != 0) goto L_0x01cf
            boolean r15 = p206nj.C76866m.m92672a()     // Catch:{ Exception -> 0x01ad }
            if (r15 == 0) goto L_0x01ab
            goto L_0x01cf
        L_0x01ab:
            r15 = r3
            goto L_0x01d0
        L_0x01ad:
            r0 = move-exception
            r3 = 0
            r4 = 0
            r14 = 1200000(0x124f80, double:5.92879E-318)
            r6 = 10000(0x2710, float:1.4013E-41)
            r28 = 120000(0x1d4c0, double:5.9288E-319)
            r30 = 30000(0x7530, double:1.4822E-319)
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 1800000(0x1b7740, double:8.89318E-318)
            r4 = r2
            r38 = r28
            r6 = 0
            r28 = r5
            r5 = r23
            r23 = 10000(0x2710, float:1.4013E-41)
            goto L_0x0794
        L_0x01cf:
            r15 = r4
        L_0x01d0:
            r28 = r5
            r5 = 1
            java.lang.String r0 = r14.mo182444f(r0, r15, r6, r5)     // Catch:{ Exception -> 0x050e }
            boolean r33 = r4.equals(r0)     // Catch:{ Exception -> 0x050e }
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x04f1 }
            java.lang.String r14 = "clicfg_battery_aggressive_enable"
            java.lang.String r0 = r0.mo182444f(r14, r3, r6, r5)     // Catch:{ Exception -> 0x04f1 }
            boolean r5 = r4.equals(r0)     // Catch:{ Exception -> 0x04f1 }
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x04df }
            java.lang.String r14 = "clicfg_battery_looper_task_enable"
            r15 = 1
            java.lang.String r0 = r0.mo182444f(r14, r3, r6, r15)     // Catch:{ Exception -> 0x04df }
            boolean r34 = r4.equals(r0)     // Catch:{ Exception -> 0x04df }
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x04be }
            java.lang.String r14 = "clicfg_battery_notify_trace_enable"
            r15 = 1
            java.lang.String r0 = r0.mo182444f(r14, r3, r6, r15)     // Catch:{ Exception -> 0x04be }
            boolean r32 = r4.equals(r0)     // Catch:{ Exception -> 0x04be }
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x04a6 }
            java.lang.String r3 = "clicfg_battery_bg_delay_mils"
            r14 = 30000(0x7530, double:1.4822E-319)
            java.lang.String r4 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x04a2 }
            r14 = 1
            java.lang.String r0 = r0.mo182444f(r3, r4, r6, r14)     // Catch:{ Exception -> 0x04a6 }
            r14 = 30000(0x7530, double:1.4822E-319)
            long r30 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r0, r14)     // Catch:{ Exception -> 0x04a2 }
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0485 }
            java.lang.String r3 = "clicfg_battery_fg_loop_mils"
            r14 = 1200000(0x124f80, double:5.92879E-318)
            java.lang.String r4 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x047c }
            r14 = 1
            java.lang.String r0 = r0.mo182444f(r3, r4, r6, r14)     // Catch:{ Exception -> 0x0475 }
            r3 = 1200000(0x124f80, double:5.92879E-318)
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r0, r3)     // Catch:{ Exception -> 0x0471 }
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x046a }
            java.lang.String r3 = "clicfg_battery_bg_loop_mils"
            r29 = r7
            r6 = 1800000(0x1b7740, double:8.89318E-318)
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0466 }
            r6 = 1
            r7 = 0
            java.lang.String r0 = r0.mo182444f(r3, r4, r7, r6)     // Catch:{ Exception -> 0x0461 }
            r3 = 1800000(0x1b7740, double:8.89318E-318)
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r0, r3)     // Catch:{ Exception -> 0x045f }
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0452 }
            java.lang.String r6 = "clicfg_battery_min_stat_bg_ratio"
            r7 = 50
            r36 = r3
            java.lang.String r3 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x0450 }
            r4 = 1
            r7 = 0
            java.lang.String r0 = r0.mo182444f(r6, r3, r7, r4)     // Catch:{ Exception -> 0x0450 }
            r3 = 50
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0, r3)     // Catch:{ Exception -> 0x0450 }
            f352122a = r0     // Catch:{ Exception -> 0x0450 }
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0450 }
            java.lang.String r3 = "clicfg_battery_min_stat_window"
            r6 = 300000(0x493e0, double:1.482197E-318)
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0450 }
            r6 = 1
            r7 = 0
            java.lang.String r0 = r0.mo182444f(r3, r4, r7, r6)     // Catch:{ Exception -> 0x0450 }
            r3 = 300000(0x493e0, double:1.482197E-318)
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r0, r3)     // Catch:{ Exception -> 0x0450 }
            f352123b = r3     // Catch:{ Exception -> 0x0450 }
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0450 }
            java.lang.String r3 = "clicfg_battery_jiffies_threshold"
            r6 = 6000(0x1770, double:2.9644E-320)
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0450 }
            r6 = 1
            r7 = 0
            java.lang.String r0 = r0.mo182444f(r3, r4, r7, r6)     // Catch:{ Exception -> 0x0450 }
            r3 = 6000(0x1770, double:2.9644E-320)
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r0, r3)     // Catch:{ Exception -> 0x0450 }
            f352124c = r3     // Catch:{ Exception -> 0x0450 }
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0450 }
            java.lang.String r3 = "clicfg_battery_long_time_jiffies_threshold"
            r6 = 120(0x78, double:5.93E-322)
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0450 }
            r6 = 1
            r7 = 0
            java.lang.String r0 = r0.mo182444f(r3, r4, r7, r6)     // Catch:{ Exception -> 0x0450 }
            r3 = 120(0x78, double:5.93E-322)
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r0, r3)     // Catch:{ Exception -> 0x0450 }
            f352125d = r3     // Catch:{ Exception -> 0x0450 }
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0450 }
            java.lang.String r3 = "clicfg_battery_min_task_stat_window"
            r6 = 120000(0x1d4c0, double:5.9288E-319)
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x044e }
            r6 = 1
            r7 = 0
            java.lang.String r0 = r0.mo182444f(r3, r4, r7, r6)     // Catch:{ Exception -> 0x0450 }
            r6 = 120000(0x1d4c0, double:5.9288E-319)
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r0, r6)     // Catch:{ Exception -> 0x044e }
            f352126e = r3     // Catch:{ Exception -> 0x0450 }
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0450 }
            java.lang.String r3 = "clicfg_battery_task_jiffies_threshold"
            r6 = 2000(0x7d0, double:9.88E-321)
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0450 }
            r6 = 1
            r7 = 0
            java.lang.String r0 = r0.mo182444f(r3, r4, r7, r6)     // Catch:{ Exception -> 0x0450 }
            r3 = 2000(0x7d0, double:9.88E-321)
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r0, r3)     // Catch:{ Exception -> 0x0450 }
            f352127f = r3     // Catch:{ Exception -> 0x0450 }
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0450 }
            java.lang.String r3 = "clicfg_battery_wakelock_overtime"
            r6 = 120000(0x1d4c0, double:5.9288E-319)
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x044e }
            r6 = 1
            r7 = 0
            java.lang.String r0 = r0.mo182444f(r3, r4, r7, r6)     // Catch:{ Exception -> 0x0450 }
            r3 = 120000(0x1d4c0, double:5.9288E-319)
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r0, r3)     // Catch:{ Exception -> 0x044b }
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0436 }
            java.lang.String r6 = "clicfg_battery_wakelock_overtime_count"
            r7 = 2
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x0436 }
            r38 = r3
            r3 = 0
            r4 = 1
            java.lang.String r0 = r0.mo182444f(r6, r7, r3, r4)     // Catch:{ Exception -> 0x0434 }
            r3 = 2
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r0, r3)     // Catch:{ Exception -> 0x0434 }
            f352128g = r3     // Catch:{ Exception -> 0x0434 }
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0434 }
            java.lang.String r3 = "clicfg_battery_app_importance_limit"
            r4 = 100
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0434 }
            r7 = 1
            r4 = 0
            java.lang.String r0 = r0.mo182444f(r3, r6, r4, r7)     // Catch:{ Exception -> 0x0434 }
            r3 = 100
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0, r3)     // Catch:{ Exception -> 0x0434 }
            f352129h = r0     // Catch:{ Exception -> 0x0434 }
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0434 }
            java.lang.String r3 = "clicfg_battery_app_list_over_heat"
            r4 = 200(0xc8, float:2.8E-43)
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0434 }
            r7 = 1
            r4 = 0
            java.lang.String r0 = r0.mo182444f(r3, r6, r4, r7)     // Catch:{ Exception -> 0x0434 }
            r3 = 200(0xc8, float:2.8E-43)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0, r3)     // Catch:{ Exception -> 0x0434 }
            f352130i = r0     // Catch:{ Exception -> 0x0434 }
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0434 }
            java.lang.String r3 = "clicfg_battery_task_current_limit"
            r4 = 50
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0434 }
            r7 = 1
            r4 = 0
            java.lang.String r0 = r0.mo182444f(r3, r6, r4, r7)     // Catch:{ Exception -> 0x0434 }
            r3 = 50
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0, r3)     // Catch:{ Exception -> 0x0434 }
            f352131j = r0     // Catch:{ Exception -> 0x0434 }
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0434 }
            java.lang.String r3 = "clicfg_battery_traffic_threshold"
            r6 = 104857600(0x6400000, double:5.1806538E-316)
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0434 }
            r6 = 0
            r7 = 1
            java.lang.String r0 = r0.mo182444f(r3, r4, r6, r7)     // Catch:{ Exception -> 0x0434 }
            r3 = 104857600(0x6400000, double:5.1806538E-316)
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r0, r3)     // Catch:{ Exception -> 0x0434 }
            f352132k = r3     // Catch:{ Exception -> 0x0434 }
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0434 }
            java.lang.String r3 = "clicfg_battery_min_module_stat_window"
            r6 = 60000(0xea60, double:2.9644E-319)
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0434 }
            r6 = 0
            r7 = 1
            java.lang.String r0 = r0.mo182444f(r3, r4, r6, r7)     // Catch:{ Exception -> 0x0434 }
            r3 = 60000(0xea60, double:2.9644E-319)
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r0, r3)     // Catch:{ Exception -> 0x0434 }
            f352133l = r3     // Catch:{ Exception -> 0x0434 }
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0434 }
            java.lang.String r3 = "clicfg_battery_loopers_to_watch"
            r4 = 1
            r6 = 0
            java.lang.String r3 = r0.mo182444f(r3, r2, r6, r4)     // Catch:{ Exception -> 0x0434 }
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x042b }
            java.lang.String r7 = "clicfg_battery_thread_watch_fg"
            r4 = 10000(0x2710, float:1.4013E-41)
            r40 = r3
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0427 }
            r4 = 1
            java.lang.String r0 = r0.mo182444f(r7, r3, r6, r4)     // Catch:{ Exception -> 0x0427 }
            r3 = 10000(0x2710, float:1.4013E-41)
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0, r3)     // Catch:{ Exception -> 0x0425 }
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0421 }
            java.lang.String r3 = "clicfg_battery_thread_watch_bg"
            r7 = 5000(0x1388, float:7.006E-42)
            r41 = r4
            java.lang.String r4 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x041d }
            r7 = 1
            java.lang.String r0 = r0.mo182444f(r3, r4, r6, r7)     // Catch:{ Exception -> 0x041d }
            r3 = 5000(0x1388, float:7.006E-42)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0, r3)     // Catch:{ Exception -> 0x041d }
            r42 = r8
            r6 = r9
            r7 = r10
            r3 = r12
            r4 = r13
            r43 = r14
            r12 = r16
            r15 = r17
            r14 = r18
            r10 = r20
            r13 = r21
            r9 = r22
            r22 = r27
            r8 = r29
            r45 = r30
            r47 = r33
            r20 = r36
            r29 = r38
            r16 = r40
            r18 = r41
            r17 = r0
            r0 = r11
            r11 = r19
            r19 = r5
            r5 = r32
            goto L_0x07cd
        L_0x041d:
            r0 = move-exception
            r4 = r41
            goto L_0x0430
        L_0x0421:
            r0 = move-exception
            r41 = r4
            goto L_0x0430
        L_0x0425:
            r0 = move-exception
            goto L_0x042e
        L_0x0427:
            r0 = move-exception
            r3 = 10000(0x2710, float:1.4013E-41)
            goto L_0x042e
        L_0x042b:
            r0 = move-exception
            r40 = r3
        L_0x042e:
            r4 = 10000(0x2710, float:1.4013E-41)
        L_0x0430:
            r6 = r4
            r3 = r40
            goto L_0x043e
        L_0x0434:
            r0 = move-exception
            goto L_0x0439
        L_0x0436:
            r0 = move-exception
            r38 = r3
        L_0x0439:
            r3 = 10000(0x2710, float:1.4013E-41)
            r3 = r2
            r6 = 10000(0x2710, float:1.4013E-41)
        L_0x043e:
            r4 = 0
            r4 = r3
            r3 = r5
            r5 = r23
            r7 = r29
            r35 = r36
            r23 = r6
            goto L_0x0745
        L_0x044b:
            r0 = move-exception
            r6 = r3
            goto L_0x0458
        L_0x044e:
            r0 = move-exception
            goto L_0x0458
        L_0x0450:
            r0 = move-exception
            goto L_0x0455
        L_0x0452:
            r0 = move-exception
            r36 = r3
        L_0x0455:
            r6 = 120000(0x1d4c0, double:5.9288E-319)
        L_0x0458:
            r3 = r5
            r5 = r23
            r35 = r36
            goto L_0x073d
        L_0x045f:
            r0 = move-exception
            goto L_0x0468
        L_0x0461:
            r0 = move-exception
            r3 = 1800000(0x1b7740, double:8.89318E-318)
            goto L_0x0468
        L_0x0466:
            r0 = move-exception
            r3 = r6
        L_0x0468:
            r6 = r3
            goto L_0x048e
        L_0x046a:
            r0 = move-exception
            r29 = r7
            r6 = 1800000(0x1b7740, double:8.89318E-318)
            goto L_0x048e
        L_0x0471:
            r0 = move-exception
            r29 = r7
            goto L_0x0480
        L_0x0475:
            r0 = move-exception
            r29 = r7
            r3 = 1200000(0x124f80, double:5.92879E-318)
            goto L_0x0480
        L_0x047c:
            r0 = move-exception
            r29 = r7
            r3 = r14
        L_0x0480:
            r6 = 1800000(0x1b7740, double:8.89318E-318)
            r14 = r3
            goto L_0x048e
        L_0x0485:
            r0 = move-exception
            r29 = r7
            r6 = 1800000(0x1b7740, double:8.89318E-318)
            r14 = 1200000(0x124f80, double:5.92879E-318)
        L_0x048e:
            r3 = 120000(0x1d4c0, double:5.9288E-319)
            r35 = r6
            r6 = 0
            r7 = 10000(0x2710, float:1.4013E-41)
            r38 = r3
            r3 = r5
            r5 = r23
            r7 = r29
            r23 = 10000(0x2710, float:1.4013E-41)
            r4 = r2
            goto L_0x0794
        L_0x04a2:
            r0 = move-exception
            r29 = r7
            goto L_0x04ab
        L_0x04a6:
            r0 = move-exception
            r29 = r7
            r14 = 30000(0x7530, double:1.4822E-319)
        L_0x04ab:
            r3 = 1200000(0x124f80, double:5.92879E-318)
            r6 = 120000(0x1d4c0, double:5.9288E-319)
            r30 = 1800000(0x1b7740, double:8.89318E-318)
            r49 = r6
            r7 = r5
            r5 = r23
            r23 = r32
            r6 = r33
            goto L_0x04d7
        L_0x04be:
            r0 = move-exception
            r29 = r7
            r14 = 30000(0x7530, double:1.4822E-319)
            r3 = 1200000(0x124f80, double:5.92879E-318)
            r6 = 120000(0x1d4c0, double:5.9288E-319)
            r30 = 1800000(0x1b7740, double:8.89318E-318)
            r32 = 0
            r49 = r6
            r7 = r5
            r5 = r23
            r6 = r33
            r23 = 0
        L_0x04d7:
            r32 = r30
            r30 = r14
            r14 = r49
            goto L_0x0731
        L_0x04df:
            r0 = move-exception
            r29 = r7
            r3 = 30000(0x7530, double:1.4822E-319)
            r6 = 1200000(0x124f80, double:5.92879E-318)
            r14 = 120000(0x1d4c0, double:5.9288E-319)
            r30 = 1800000(0x1b7740, double:8.89318E-318)
            r49 = r6
            r7 = r5
            goto L_0x0502
        L_0x04f1:
            r0 = move-exception
            r29 = r7
            r3 = 30000(0x7530, double:1.4822E-319)
            r5 = 1200000(0x124f80, double:5.92879E-318)
            r14 = 120000(0x1d4c0, double:5.9288E-319)
            r30 = 1800000(0x1b7740, double:8.89318E-318)
            r7 = 0
            r49 = r5
        L_0x0502:
            r5 = r23
            r6 = r33
            r32 = r30
            r30 = r3
            r3 = r49
            goto L_0x072d
        L_0x050e:
            r0 = move-exception
        L_0x050f:
            r29 = r7
            goto L_0x0516
        L_0x0512:
            r0 = move-exception
            r28 = r5
            goto L_0x050f
        L_0x0516:
            r3 = 30000(0x7530, double:1.4822E-319)
            r5 = 1200000(0x124f80, double:5.92879E-318)
            r14 = 120000(0x1d4c0, double:5.9288E-319)
            r30 = 1800000(0x1b7740, double:8.89318E-318)
            r7 = r23
            r23 = r24
            r24 = r25
            r25 = r26
            r26 = r27
            r27 = r28
            goto L_0x0717
        L_0x052f:
            r0 = move-exception
        L_0x0530:
            r29 = r7
            goto L_0x0537
        L_0x0533:
            r0 = move-exception
            r27 = r5
            goto L_0x0530
        L_0x0537:
            r3 = 30000(0x7530, double:1.4822E-319)
            r5 = 1200000(0x124f80, double:5.92879E-318)
            r14 = 120000(0x1d4c0, double:5.9288E-319)
            r30 = 1800000(0x1b7740, double:8.89318E-318)
            r7 = r23
            r23 = r24
            r24 = r25
            r25 = r26
            r26 = r27
            goto L_0x0715
        L_0x054e:
            r0 = move-exception
        L_0x054f:
            r29 = r7
            goto L_0x0556
        L_0x0552:
            r0 = move-exception
            r26 = r5
            goto L_0x054f
        L_0x0556:
            r3 = 30000(0x7530, double:1.4822E-319)
            r5 = 1200000(0x124f80, double:5.92879E-318)
            r14 = 120000(0x1d4c0, double:5.9288E-319)
            r27 = 1800000(0x1b7740, double:8.89318E-318)
            r7 = r23
            r23 = r24
            r24 = r25
            r25 = r26
            goto L_0x0711
        L_0x056b:
            r0 = move-exception
        L_0x056c:
            r29 = r7
            goto L_0x0573
        L_0x056f:
            r0 = move-exception
            r25 = r5
            goto L_0x056c
        L_0x0573:
            r3 = 30000(0x7530, double:1.4822E-319)
            r5 = 1200000(0x124f80, double:5.92879E-318)
            r14 = 120000(0x1d4c0, double:5.9288E-319)
            r26 = 1800000(0x1b7740, double:8.89318E-318)
            r7 = r23
            r23 = r24
            r24 = r25
            r27 = r26
            goto L_0x070f
        L_0x0588:
            r0 = move-exception
        L_0x0589:
            r29 = r7
            goto L_0x0590
        L_0x058c:
            r0 = move-exception
            r24 = r5
            goto L_0x0589
        L_0x0590:
            r3 = 30000(0x7530, double:1.4822E-319)
            r5 = 1200000(0x124f80, double:5.92879E-318)
            r14 = 120000(0x1d4c0, double:5.9288E-319)
            r25 = 1800000(0x1b7740, double:8.89318E-318)
            r7 = r23
            r23 = r24
            goto L_0x070b
        L_0x05a1:
            r0 = move-exception
        L_0x05a2:
            r29 = r7
            goto L_0x05a9
        L_0x05a5:
            r0 = move-exception
            r23 = r5
            goto L_0x05a2
        L_0x05a9:
            r3 = 30000(0x7530, double:1.4822E-319)
            r5 = 1200000(0x124f80, double:5.92879E-318)
            r14 = 120000(0x1d4c0, double:5.9288E-319)
            r24 = 1800000(0x1b7740, double:8.89318E-318)
            r7 = r23
            r25 = r24
            goto L_0x0709
        L_0x05ba:
            r0 = move-exception
        L_0x05bb:
            r29 = r7
            goto L_0x05c2
        L_0x05be:
            r0 = move-exception
            r22 = r5
            goto L_0x05bb
        L_0x05c2:
            r3 = 30000(0x7530, double:1.4822E-319)
            r5 = 1200000(0x124f80, double:5.92879E-318)
            r14 = 120000(0x1d4c0, double:5.9288E-319)
            r23 = 1800000(0x1b7740, double:8.89318E-318)
            goto L_0x0706
        L_0x05cf:
            r0 = move-exception
        L_0x05d0:
            r29 = r7
            goto L_0x05d7
        L_0x05d3:
            r0 = move-exception
            r21 = r5
            goto L_0x05d0
        L_0x05d7:
            r3 = 30000(0x7530, double:1.4822E-319)
            r5 = 1200000(0x124f80, double:5.92879E-318)
            r14 = 120000(0x1d4c0, double:5.9288E-319)
            r22 = 1800000(0x1b7740, double:8.89318E-318)
            r23 = r22
            goto L_0x0703
        L_0x05e6:
            r0 = move-exception
        L_0x05e7:
            r29 = r7
            goto L_0x05ee
        L_0x05ea:
            r0 = move-exception
            r20 = r5
            goto L_0x05e7
        L_0x05ee:
            r3 = 30000(0x7530, double:1.4822E-319)
            r5 = 1200000(0x124f80, double:5.92879E-318)
            r14 = 120000(0x1d4c0, double:5.9288E-319)
            r21 = 1800000(0x1b7740, double:8.89318E-318)
            goto L_0x06fe
        L_0x05fb:
            r0 = move-exception
        L_0x05fc:
            r29 = r7
            goto L_0x0603
        L_0x05ff:
            r0 = move-exception
            r19 = r5
            goto L_0x05fc
        L_0x0603:
            r3 = 30000(0x7530, double:1.4822E-319)
            r5 = 1200000(0x124f80, double:5.92879E-318)
            r14 = 120000(0x1d4c0, double:5.9288E-319)
            r20 = 1800000(0x1b7740, double:8.89318E-318)
            r21 = r20
            goto L_0x06be
        L_0x0612:
            r0 = move-exception
        L_0x0613:
            r29 = r7
            goto L_0x061a
        L_0x0616:
            r0 = move-exception
            r18 = r5
            goto L_0x0613
        L_0x061a:
            r3 = 30000(0x7530, double:1.4822E-319)
            r5 = 1200000(0x124f80, double:5.92879E-318)
            r14 = 120000(0x1d4c0, double:5.9288E-319)
            r19 = 1800000(0x1b7740, double:8.89318E-318)
            goto L_0x06b9
        L_0x0627:
            r0 = move-exception
        L_0x0628:
            r29 = r7
            goto L_0x062f
        L_0x062b:
            r0 = move-exception
            r17 = r5
            goto L_0x0628
        L_0x062f:
            r3 = 30000(0x7530, double:1.4822E-319)
            r5 = 1200000(0x124f80, double:5.92879E-318)
            r14 = 120000(0x1d4c0, double:5.9288E-319)
            r18 = 1800000(0x1b7740, double:8.89318E-318)
            r19 = r18
            goto L_0x06b6
        L_0x063e:
            r0 = move-exception
            r17 = r5
            r29 = r7
            r3 = 30000(0x7530, double:1.4822E-319)
            r5 = 1200000(0x124f80, double:5.92879E-318)
            r13 = 120000(0x1d4c0, double:5.9288E-319)
            r18 = 1800000(0x1b7740, double:8.89318E-318)
            goto L_0x06b1
        L_0x0650:
            r0 = move-exception
        L_0x0651:
            r29 = r7
            goto L_0x0658
        L_0x0654:
            r0 = move-exception
            r16 = r5
            goto L_0x0651
        L_0x0658:
            r3 = 30000(0x7530, double:1.4822E-319)
            r5 = 1200000(0x124f80, double:5.92879E-318)
            r13 = 120000(0x1d4c0, double:5.9288E-319)
            r17 = 1800000(0x1b7740, double:8.89318E-318)
            r18 = r17
            goto L_0x06ae
        L_0x0666:
            r0 = move-exception
            r29 = r7
            r3 = 30000(0x7530, double:1.4822E-319)
            r5 = 1200000(0x124f80, double:5.92879E-318)
            r13 = 120000(0x1d4c0, double:5.9288E-319)
            r15 = 1800000(0x1b7740, double:8.89318E-318)
            goto L_0x06a9
        L_0x0675:
            r0 = move-exception
            r29 = r7
            r3 = 30000(0x7530, double:1.4822E-319)
            r5 = 1200000(0x124f80, double:5.92879E-318)
            r12 = 120000(0x1d4c0, double:5.9288E-319)
            r14 = 1800000(0x1b7740, double:8.89318E-318)
            r15 = r14
            r13 = r12
            goto L_0x06a8
        L_0x0686:
            r0 = move-exception
            r29 = r7
            r3 = 30000(0x7530, double:1.4822E-319)
            r5 = 1200000(0x124f80, double:5.92879E-318)
            r11 = 120000(0x1d4c0, double:5.9288E-319)
            r13 = 1800000(0x1b7740, double:8.89318E-318)
            goto L_0x06a4
        L_0x0695:
            r0 = move-exception
            r29 = r7
            r3 = 30000(0x7530, double:1.4822E-319)
            r5 = 1200000(0x124f80, double:5.92879E-318)
            r11 = 120000(0x1d4c0, double:5.9288E-319)
            r13 = 1800000(0x1b7740, double:8.89318E-318)
            r10 = 1
        L_0x06a4:
            r7 = 1
            r15 = r13
            r13 = r11
            r11 = 1
        L_0x06a8:
            r12 = 1
        L_0x06a9:
            r7 = 1
            r18 = r15
            r16 = 1
        L_0x06ae:
            r7 = 1
            r17 = 1
        L_0x06b1:
            r7 = 1
            r14 = r13
            r19 = r18
            r13 = 1
        L_0x06b6:
            r7 = 1
            r18 = 1
        L_0x06b9:
            r7 = 1
            r21 = r19
            r19 = 1
        L_0x06be:
            r7 = 1
            goto L_0x06fc
        L_0x06c0:
            r0 = move-exception
            r29 = r7
            r3 = 30000(0x7530, double:1.4822E-319)
            r5 = 1200000(0x124f80, double:5.92879E-318)
            r9 = 120000(0x1d4c0, double:5.9288E-319)
            r11 = 1800000(0x1b7740, double:8.89318E-318)
            r14 = r9
            r21 = r11
            goto L_0x06e5
        L_0x06d2:
            r0 = move-exception
            r29 = r7
            r3 = 30000(0x7530, double:1.4822E-319)
            r5 = 1200000(0x124f80, double:5.92879E-318)
            r7 = 120000(0x1d4c0, double:5.9288E-319)
            r9 = 1800000(0x1b7740, double:8.89318E-318)
            r11 = 1
            r14 = r7
            r21 = r9
            r8 = 1
        L_0x06e5:
            r7 = 1
            r9 = 1
            r10 = 1
            r11 = 1
            r12 = 1
            r13 = 1
            r16 = 1
            r17 = 1
            r18 = 1
            r19 = 1
            r13 = 1
            r16 = 1
            r17 = 1
            r18 = 1
            r19 = 1
        L_0x06fc:
            r20 = 1
        L_0x06fe:
            r7 = 0
            r23 = r21
            r21 = 0
        L_0x0703:
            r7 = 1
            r22 = 1
        L_0x0706:
            r7 = 0
            r25 = r23
        L_0x0709:
            r23 = 0
        L_0x070b:
            r24 = 0
            r27 = r25
        L_0x070f:
            r25 = 0
        L_0x0711:
            r26 = 0
            r30 = r27
        L_0x0715:
            r27 = 0
        L_0x0717:
            r28 = 0
            r33 = 0
            r28 = r27
            r32 = r30
            r30 = r3
            r3 = r5
            r5 = r7
            r27 = r26
            r6 = 0
            r7 = 0
            r26 = r25
            r25 = r24
            r24 = r23
        L_0x072d:
            r23 = 0
            r34 = 0
        L_0x0731:
            r35 = r32
            r33 = r6
            r32 = r23
            r49 = r3
            r3 = r7
            r6 = r14
            r14 = r49
        L_0x073d:
            r4 = 0
            r23 = 10000(0x2710, float:1.4013E-41)
            r4 = r2
            r38 = r6
            r7 = r29
        L_0x0745:
            r6 = 0
            goto L_0x0794
        L_0x0747:
            r0 = move-exception
            r30 = 30000(0x7530, double:1.4822E-319)
            r14 = 1200000(0x124f80, double:5.92879E-318)
            r28 = 120000(0x1d4c0, double:5.9288E-319)
            r35 = 1800000(0x1b7740, double:8.89318E-318)
            r5 = 0
            r3 = 0
            r4 = 0
            r6 = 1
            r8 = 1
            r9 = 1
            r10 = 1
            r11 = 1
            r12 = 1
            r7 = 1
            r13 = 10000(0x2710, float:1.4013E-41)
            r32 = 0
            r16 = 1
            r17 = 1
            r18 = 1
            r19 = 1
            r20 = 1
            r21 = 0
            r22 = 1
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r33 = 0
            r34 = 0
            r27 = 0
            r4 = r2
            r38 = r28
            r3 = 0
            r6 = 0
            r7 = 1
            r13 = 1
            r16 = 1
            r18 = 1
            r23 = 10000(0x2710, float:1.4013E-41)
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
        L_0x0794:
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r29 = r3
            java.lang.String r3 = "get clicfg err"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r3, r6)
            r0 = 5000(0x1388, float:7.006E-42)
            r42 = r8
            r6 = r9
            r0 = r11
            r3 = r12
            r43 = r14
            r12 = r16
            r15 = r17
            r14 = r18
            r11 = r19
            r9 = r22
            r18 = r23
            r22 = r27
            r19 = r29
            r45 = r30
            r47 = r33
            r29 = r38
            r17 = 5000(0x1388, float:7.006E-42)
            r16 = r4
            r23 = r5
            r8 = r7
            r7 = r10
            r4 = r13
            r10 = r20
            r13 = r21
            r5 = r32
            r20 = r35
        L_0x07cd:
            m166051i()
            boolean r27 = f352138q
            if (r27 == 0) goto L_0x07d7
            com.tencent.wxperf.thread.ThreadInspect.init()
        L_0x07d7:
            r27 = r9
            ce.f$b r9 = new ce.f$b
            r9.<init>()
            r31 = r10
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.g0> r10 = com.tencent.matrix.batterycanary.monitor.feature.C114462g0.class
            r9.mo165875c(r10)
            boolean r10 = m166049g()
            if (r10 == 0) goto L_0x080d
            boolean r10 = p206nj.C76866m.m92673b()
            if (r10 != 0) goto L_0x07f7
            boolean r10 = p206nj.C76866m.m92672a()
            if (r10 == 0) goto L_0x080d
        L_0x07f7:
            int r10 = android.os.Build.VERSION.SDK_INT
            r32 = r11
            r11 = 29
            if (r10 > r11) goto L_0x080f
            r10 = 1
            r26 = 1
            r25 = 1
            r28 = 1
            r25 = r3
            r3 = 1
            r11 = 1
            r48 = 1
            goto L_0x0818
        L_0x080d:
            r32 = r11
        L_0x080f:
            r10 = 1
            r11 = r25
            r48 = r28
            r25 = r3
            r3 = r26
        L_0x0818:
            if (r8 != r10) goto L_0x0824
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature> r8 = com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.class
            r9.mo165875c(r8)
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature> r8 = com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature.class
            r9.mo165875c(r8)
        L_0x0824:
            if (r6 != r10) goto L_0x0830
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.e> r6 = com.tencent.matrix.batterycanary.monitor.feature.C114451e.class
            r9.mo165875c(r6)
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.x> r6 = com.tencent.matrix.batterycanary.monitor.feature.C114536x.class
            r9.mo165875c(r6)
        L_0x0830:
            if (r11 != r10) goto L_0x0837
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.q0> r6 = com.tencent.matrix.batterycanary.monitor.feature.C114519q0.class
            r9.mo165875c(r6)
        L_0x0837:
            if (r3 != r10) goto L_0x083e
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.c> r3 = com.tencent.matrix.batterycanary.monitor.feature.C114444c.class
            r9.mo165875c(r3)
        L_0x083e:
            if (r7 != r10) goto L_0x0845
            java.lang.Class<oe.c0> r3 = p212oe.C117754c0.class
            r9.mo165875c(r3)
        L_0x0845:
            if (r12 != r10) goto L_0x084c
            java.lang.Class<oe.v> r3 = p212oe.C89205v.class
            r9.mo165875c(r3)
        L_0x084c:
            if (r13 != r10) goto L_0x0853
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.o0> r3 = com.tencent.matrix.batterycanary.monitor.feature.C114513o0.class
            r9.mo165875c(r3)
        L_0x0853:
            if (r4 != r10) goto L_0x085a
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.t0> r3 = com.tencent.matrix.batterycanary.monitor.feature.C80373t0.class
            r9.mo165875c(r3)
        L_0x085a:
            if (r14 != r10) goto L_0x0861
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.h0> r3 = com.tencent.matrix.batterycanary.monitor.feature.C80368h0.class
            r9.mo165875c(r3)
        L_0x0861:
            if (r15 != r10) goto L_0x0874
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 < r4) goto L_0x086f
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.g> r1 = com.tencent.matrix.batterycanary.monitor.feature.C80364g.class
            r9.mo165875c(r1)
            goto L_0x0874
        L_0x086f:
            java.lang.String r3 = "only support bluetooth monitoring >= android 8.0 for the moment"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r3)
        L_0x0874:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r3 = ";"
            if (r1 != 0) goto L_0x08ae
            r1 = 4096(0x1000, float:5.74E-42)
            f352130i = r1
            java.lang.String r1 = ","
            java.lang.String[] r1 = r2.split(r1)
            int r2 = r1.length
            r4 = 0
            r4 = r16
            r6 = 0
        L_0x088b:
            if (r6 >= r2) goto L_0x08aa
            r7 = r1[r6]
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x08a7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            r8.append(r3)
            r8.append(r7)
            java.lang.String r4 = r8.toString()
        L_0x08a7:
            int r6 = r6 + 1
            goto L_0x088b
        L_0x08aa:
            r34 = 1
            r1 = 1
            goto L_0x08b2
        L_0x08ae:
            r4 = r16
            r1 = r34
        L_0x08b2:
            r2 = 1
            if (r1 != r2) goto L_0x08f1
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x08f1
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.j0> r1 = com.tencent.matrix.batterycanary.monitor.feature.C114486j0.class
            r9.mo165875c(r1)
            java.lang.String[] r1 = r4.split(r3)
            int r2 = r1.length
            r4 = 0
        L_0x08c6:
            if (r4 >= r2) goto L_0x08f1
            r6 = r1[r4]
            java.lang.String r7 = r6.trim()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x08ee
            java.lang.String r6 = r6.trim()
            ce.f r7 = r9.f339056a
            java.util.List<java.lang.String> r8 = r7.f339051v
            java.util.List r10 = java.util.Collections.EMPTY_LIST
            if (r8 != r10) goto L_0x08e7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r7.f339051v = r8
        L_0x08e7:
            ce.f r7 = r9.f339056a
            java.util.List<java.lang.String> r7 = r7.f339051v
            r7.add(r6)
        L_0x08ee:
            int r4 = r4 + 1
            goto L_0x08c6
        L_0x08f1:
            r1 = 1
            if (r0 != r1) goto L_0x08ff
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 == 0) goto L_0x08ff
            java.lang.Class<oe.u> r0 = p212oe.C117778u.class
            r9.mo165875c(r0)
        L_0x08ff:
            if (r5 != r1) goto L_0x0906
            java.lang.Class<de.b> r0 = p1190de.C116609b.class
            r9.mo165875c(r0)
        L_0x0906:
            r12 = r25
            if (r12 != r1) goto L_0x090f
            java.lang.Class<oe.r> r0 = p212oe.C117775r.class
            r9.mo165875c(r0)
        L_0x090f:
            r0 = r32
            if (r0 != r1) goto L_0x0928
            java.lang.Class<com.tencent.matrix.batterycanary.stats.i> r0 = com.tencent.matrix.batterycanary.stats.C114572i.class
            r9.mo165875c(r0)
            java.lang.String r0 = "battery-stats.bin"
            r2 = 2
            com.tencent.mmkv.MMKV r0 = com.tencent.mmkv.MMKV.mmkvWithID((java.lang.String) r0, (int) r2)
            oe.k r2 = new oe.k
            r2.<init>(r0)
            ce.f r0 = r9.f339056a
            r0.f339054y = r2
        L_0x0928:
            r0 = r31
            if (r0 != r1) goto L_0x0931
            java.lang.Class<ee.b> r0 = p961ee.C86507b.class
            r9.mo165875c(r0)
        L_0x0931:
            r0 = r27
            if (r0 != r1) goto L_0x093a
            java.lang.Class<ge.b> r0 = p1195ge.C116947b.class
            r9.mo165875c(r0)
        L_0x093a:
            boolean r0 = f352136o
            if (r0 == 0) goto L_0x0951
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "battery-dump"
            r0.<init>(r1)
            r0.start()
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r0 = r0.getLooper()
            r1.<init>(r0)
        L_0x0951:
            boolean r0 = f352137p
            if (r0 == 0) goto L_0x0979
            java.lang.String r0 = f352141t
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0979
            java.lang.String r0 = f352141t
            java.lang.String[] r0 = r0.split(r3)
            int r1 = r0.length
            r2 = 0
        L_0x0965:
            if (r2 >= r1) goto L_0x0979
            r3 = r0[r2]
            java.lang.String r3 = r3.trim()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0976
            r9.mo165873a(r3)
        L_0x0976:
            int r2 = r2 + 1
            goto L_0x0965
        L_0x0979:
            be.i r0 = new be.i
            r1 = 10
            if (r23 == 0) goto L_0x0986
            java.lang.String r2 = "matrix_batt"
            android.os.HandlerThread r2 = p723vf.C90778c.m113845c(r2, r1)
            goto L_0x0987
        L_0x0986:
            r2 = 0
        L_0x0987:
            ce.f r3 = r9.f339056a
            r3.f339030a = r2
            r2 = 0
            r3.f339043n = r2
            xe.d r2 = f352143v
            r3.f339031b = r2
            r2 = 60000(0xea60, double:2.9644E-319)
            r4 = r29
            long r2 = java.lang.Math.max(r4, r2)
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x09a5
            ce.f r6 = r9.f339056a
            r6.f339033d = r2
        L_0x09a5:
            r2 = 5000(0x1388, double:2.4703E-320)
            r6 = r45
            long r2 = java.lang.Math.max(r6, r2)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x09b5
            ce.f r6 = r9.f339056a
            r6.f339034e = r2
        L_0x09b5:
            ce.f r2 = r9.f339056a
            r3 = r24
            r2.f339041l = r3
            r2 = 60000(0xea60, double:2.9644E-319)
            r14 = r43
            long r6 = java.lang.Math.max(r14, r2)
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x09cc
            ce.f r8 = r9.f339056a
            r8.f339035f = r6
        L_0x09cc:
            ce.f r6 = r9.f339056a
            r7 = r22
            r6.f339042m = r7
            r6 = r20
            long r2 = java.lang.Math.max(r6, r2)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x09e0
            ce.f r4 = r9.f339056a
            r4.f339036g = r2
        L_0x09e0:
            ce.f r2 = r9.f339056a
            java.util.List<java.lang.String> r3 = r2.f339049t
            java.util.List r4 = java.util.Collections.EMPTY_LIST
            if (r3 != r4) goto L_0x09ef
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f339049t = r3
        L_0x09ef:
            ce.f r2 = r9.f339056a
            java.util.List<java.lang.String> r2 = r2.f339049t
            java.lang.String r3 = "MicroMsg.MMAutoAuth"
            r2.add(r3)
            ce.f r2 = r9.f339056a
            java.util.List<java.lang.String> r3 = r2.f339049t
            if (r3 != r4) goto L_0x0a05
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f339049t = r3
        L_0x0a05:
            ce.f r2 = r9.f339056a
            java.util.List<java.lang.String> r2 = r2.f339049t
            java.lang.String r3 = "PlatformComm"
            r2.add(r3)
            ce.f r2 = r9.f339056a
            java.util.List<java.lang.String> r3 = r2.f339050u
            if (r3 != r4) goto L_0x0a1b
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f339050u = r3
        L_0x0a1b:
            ce.f r2 = r9.f339056a
            java.util.List<java.lang.String> r2 = r2.f339050u
            java.lang.String r3 = "MicroMsg.JsApiSetKeepScreenOn"
            r2.add(r3)
            ce.f r2 = r9.f339056a
            java.util.List<java.lang.String> r3 = r2.f339050u
            if (r3 != r4) goto L_0x0a31
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f339050u = r3
        L_0x0a31:
            ce.f r2 = r9.f339056a
            java.util.List<java.lang.String> r2 = r2.f339050u
            java.lang.String r3 = "QQBrowserVideo"
            r2.add(r3)
            boolean r2 = p212oe.b$$f.m166058c()
            ce.f r3 = r9.f339056a
            r3.f339044o = r2
            oe.b$$a r2 = new oe.b$$a
            r2.<init>()
            r3.f339032c = r2
            int r2 = f352130i
            r3 = 20
            int r2 = java.lang.Math.max(r2, r3)
            if (r2 < r1) goto L_0x0a57
            ce.f r1 = r9.f339056a
            r1.f339037h = r2
        L_0x0a57:
            ce.f r1 = r9.f339056a
            r8 = r42
            r1.f339045p = r8
            int r2 = f352129h
            r1.f339038i = r2
            r2 = r48
            r1.f339046q = r2
            r2 = r47
            if (r2 < 0) goto L_0x0a6b
            r1.f339047r = r2
        L_0x0a6b:
            r5 = r19
            r1.f339048s = r5
            r2 = 1000(0x3e8, float:1.401E-42)
            r3 = r18
            if (r3 <= r2) goto L_0x0a77
            r1.f339039j = r3
        L_0x0a77:
            r3 = r17
            if (r3 <= r2) goto L_0x0a7d
            r1.f339040k = r3
        L_0x0a7d:
            oe.a r1 = new oe.a
            r1.<init>()
            r9.mo165877e(r1)
            boolean r1 = p212oe.b$$f.m166060e()
            r9.mo165876d(r1)
            ce.f r1 = r9.mo165874b()
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p212oe.C117750b.m166043a():be.i");
    }

    /* renamed from: b */
    public static int m166044b() {
        String valueOf = String.valueOf(DateFormat.format("yyyyMMdd", System.currentTimeMillis()));
        if (TextUtils.isEmpty(valueOf)) {
            return 0;
        }
        return MultiProcessMMKV.getDefault().getInt("battery_tkill_count_" + valueOf, 0);
    }

    /* renamed from: c */
    public static long m166045c() {
        return Math.max(f352123b, 10000);
    }

    /* renamed from: d */
    public static long m166046d() {
        return Math.max(f352126e, 10000);
    }

    /* renamed from: e */
    public static C113173i m166047e() {
        if (f352144w == null && C91441c.m114729c()) {
            f352144w = (C113173i) C91441c.m114730d().mo125377a(C113173i.class);
        }
        C113173i iVar = f352144w;
        if (iVar == null) {
            return iVar;
        }
        if (iVar.f261039g == 4) {
            return null;
        }
        return iVar;
    }

    /* renamed from: f */
    public static boolean m166048f() {
        return WeChatEnvironment.hasDebugger() || WeChatEnvironment.isCoolassistEnv() || C89625d.f257845k || C89625d.f257846l;
    }

    /* renamed from: g */
    public static boolean m166049g() {
        if (m166048f()) {
            return true;
        }
        int i = C89625d.f257841g;
        return (i & 255) >= 48 && (i & 255) <= 51;
    }

    /* renamed from: h */
    public static boolean m166050h() {
        return WeChatEnvironment.hasDebugger() || WeChatEnvironment.isCoolassistEnv() || C89625d.f257844j || C89625d.f257846l;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x009c A[Catch:{ Exception -> 0x00c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x009e A[Catch:{ Exception -> 0x00c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a3 A[Catch:{ Exception -> 0x00c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b0 A[Catch:{ Exception -> 0x00c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00df A[SYNTHETIC, Splitter:B:26:0x00df] */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m166051i() {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "0"
            java.lang.String r2 = "1"
            r3 = 1
            r4 = 0
            oa1.d r5 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r6 = "clicfg_battery_thread_inspect"
            java.lang.String r5 = r5.mo182444f(r6, r2, r4, r3)     // Catch:{ Exception -> 0x00c9 }
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x00c9 }
            f352138q = r5     // Catch:{ Exception -> 0x00c9 }
            oa1.d r5 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r6 = "clicfg_battery_bg_poll"
            java.lang.String r5 = r5.mo182444f(r6, r2, r4, r3)     // Catch:{ Exception -> 0x00c9 }
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x00c9 }
            f352140s = r5     // Catch:{ Exception -> 0x00c9 }
            oa1.d r5 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r6 = "clicfg_battery_cpuload_threshold"
            java.lang.String r5 = r5.mo182444f(r6, r2, r4, r3)     // Catch:{ Exception -> 0x00c9 }
            r6 = 50
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r6)     // Catch:{ Exception -> 0x00c9 }
            oa1.d r5 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r6 = "clicfg_battery_cpusip_threshold"
            java.lang.String r5 = r5.mo182444f(r6, r2, r4, r3)     // Catch:{ Exception -> 0x00c9 }
            r6 = 10
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r6)     // Catch:{ Exception -> 0x00c9 }
            oa1.d r5 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r6 = "clicfg_battery_fg_poll"
            java.lang.String r5 = r5.mo182444f(r6, r1, r4, r3)     // Catch:{ Exception -> 0x00c9 }
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x00c9 }
            f352139r = r5     // Catch:{ Exception -> 0x00c9 }
            oa1.d r5 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r6 = "clicfg_battery_min_report"
            java.lang.String r5 = r5.mo182444f(r6, r1, r4, r3)     // Catch:{ Exception -> 0x00c9 }
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x00c9 }
            f352135n = r5     // Catch:{ Exception -> 0x00c9 }
            oa1.d r5 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r6 = "clicfg_battery_dump_debug"
            java.lang.String r5 = r5.mo182444f(r6, r1, r4, r3)     // Catch:{ Exception -> 0x00c9 }
            boolean r5 = r5.equals(r2)     // Catch:{ Exception -> 0x00c9 }
            f352136o = r5     // Catch:{ Exception -> 0x00c9 }
            oa1.d r5 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r6 = "clicfg_battery_thread_watch"
            java.lang.String r1 = r5.mo182444f(r6, r1, r4, r3)     // Catch:{ Exception -> 0x00c9 }
            boolean r2 = r2.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x00c9 }
            if (r2 != 0) goto L_0x008f
            boolean r2 = m166048f()     // Catch:{ Exception -> 0x00c9 }
            if (r2 == 0) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r2 = 0
            goto L_0x0090
        L_0x008f:
            r2 = 1
        L_0x0090:
            f352137p = r2     // Catch:{ Exception -> 0x00c9 }
            if (r2 == 0) goto L_0x009e
            java.lang.String r2 = "2"
            boolean r1 = r2.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x00c9 }
            if (r1 != 0) goto L_0x009e
            r1 = 1
            goto L_0x009f
        L_0x009e:
            r1 = 0
        L_0x009f:
            f352137p = r1     // Catch:{ Exception -> 0x00c9 }
            if (r1 == 0) goto L_0x00b0
            oa1.d r1 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r2 = "clicfg_battery_thread_watch_list"
            java.lang.String r1 = r1.mo182444f(r2, r0, r4, r3)     // Catch:{ Exception -> 0x00c9 }
            f352141t = r1     // Catch:{ Exception -> 0x00c9 }
            goto L_0x00b2
        L_0x00b0:
            f352141t = r0     // Catch:{ Exception -> 0x00c9 }
        L_0x00b2:
            oa1.d r1 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r2 = "clicfg_battery_min_health_stats_window"
            java.lang.String r5 = "300000"
            java.lang.String r1 = r1.mo182444f(r2, r5, r4, r3)     // Catch:{ Exception -> 0x00c9 }
            r2 = 300000(0x493e0, float:4.2039E-40)
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)     // Catch:{ Exception -> 0x00c9 }
            long r1 = (long) r1     // Catch:{ Exception -> 0x00c9 }
            f352134m = r1     // Catch:{ Exception -> 0x00c9 }
            goto L_0x00d3
        L_0x00c9:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r5 = "Matrix.battery.BatteryCanaryConfigs"
            java.lang.String r6 = "refreshCliCfg error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r1, r6, r2)
        L_0x00d3:
            boolean r1 = p212oe.b$$f.m166058c()
            if (r1 != 0) goto L_0x00df
            boolean r1 = m166048f()
            if (r1 == 0) goto L_0x0147
        L_0x00df:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0136 }
            ie.p r1 = p981ie.C117173p.m165234j(r1)     // Catch:{ all -> 0x0136 }
            r2 = 0
        L_0x00e8:
            int r5 = r1.mo181090g()     // Catch:{ all -> 0x0101 }
            if (r2 >= r5) goto L_0x010c
            int r5 = r1.mo181089f(r2)     // Catch:{ all -> 0x0101 }
            int r5 = r1.mo181092i(r5)     // Catch:{ all -> 0x0101 }
            ie.k r6 = new ie.k     // Catch:{ all -> 0x0101 }
            r6.<init>(r2, r5)     // Catch:{ all -> 0x0101 }
            r6.mo158998b()     // Catch:{ all -> 0x0101 }
            int r2 = r2 + 1
            goto L_0x00e8
        L_0x0101:
            r2 = move-exception
            java.lang.String r3 = "CpuSpeedReader"
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0136 }
            p269xe.C91179e.C91181b.C91183b.m114444a(r3, r2)     // Catch:{ all -> 0x0136 }
            r3 = 0
        L_0x010c:
            ie.p$b[] r2 = r1.f351033a     // Catch:{ all -> 0x012b }
            int r2 = r2.length     // Catch:{ all -> 0x012b }
            int[] r5 = new int[r2]     // Catch:{ all -> 0x012b }
            r6 = 0
        L_0x0112:
            if (r6 >= r2) goto L_0x011d
            int r7 = r1.mo181092i(r6)     // Catch:{ all -> 0x012b }
            r5[r6] = r7     // Catch:{ all -> 0x012b }
            int r6 = r6 + 1
            goto L_0x0112
        L_0x011d:
            ie.l r1 = new ie.l     // Catch:{ all -> 0x012b }
            int r2 = android.os.Process.myPid()     // Catch:{ all -> 0x012b }
            r1.<init>(r2, r5)     // Catch:{ all -> 0x012b }
            r1.mo159000b()     // Catch:{ all -> 0x012b }
            r4 = r3
            goto L_0x0140
        L_0x012b:
            r1 = move-exception
            java.lang.String r2 = "ProcCpuSpeedReader"
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0136 }
            p269xe.C91179e.C91181b.C91183b.m114444a(r2, r1)     // Catch:{ all -> 0x0136 }
            goto L_0x0140
        L_0x0136:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            java.lang.String r2 = "PowerProfile"
            p269xe.C91179e.C91181b.C91183b.m114444a(r2, r1)
        L_0x0140:
            if (r4 == 0) goto L_0x0147
            java.lang.String r1 = "AllGreen"
            p269xe.C91179e.C91181b.C91183b.m114444a(r1, r0)
        L_0x0147:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p212oe.C117750b.m166051i():void");
    }

    /* renamed from: j */
    public static boolean m166052j(String str, C114467i iVar) {
        C113287a aVar;
        C114490k0.C114491a.C114492a<JiffiesMonitorFeature.JiffiesSnapshot> k;
        if (!"canary".equals(str) || (aVar = iVar.f343163l) == null || aVar.mo165841e() < 120 || ((!m166048f() && !b$$f.m166058c()) || (k = iVar.mo173667k(JiffiesMonitorFeature.JiffiesSnapshot.class)) == null || !k.mo173690b() || ((JiffiesMonitorFeature.JiffiesSnapshot) k.f343207c).f343063h.f343212a.isEmpty())) {
            return false;
        }
        String str2 = ((JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry) ((JiffiesMonitorFeature.JiffiesSnapshot) k.f343207c).f343063h.f343212a.get(0)).f343067c;
        if (str2.startsWith("TVKDL") || str2.startsWith("Thread-")) {
            return true;
        }
        return Arrays.asList(new String[]{"DNSThread", "transThread"}).contains(str2);
    }

    /* renamed from: k */
    public static boolean m166053k(int i) {
        try {
            C117731d c = C117731d.m166007c();
            return c.mo182444f("clicfg_battery_opt_" + i, "1", false, true).equals("1");
        } catch (Exception e) {
            Log.printErrStackTrace("Matrix.battery.BatteryCanaryConfigs", e, "tryOptimize expt error, id = " + i, new Object[0]);
            return false;
        }
    }
}
