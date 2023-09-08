package com.tencent.p014mm.app;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import bp3.C79757o;
import bp3.C79760s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.PeriodRecorder;
import com.tencent.tinker.entry.ApplicationLike;
import fi3.C86868b;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tencent.mm.app.z0 */
public enum C80637z0 {
    INSTANCE;
    

    /* renamed from: Q */
    public static final PeriodRecorder f235905Q = null;

    /* renamed from: R */
    public static final long f235906R = 0;

    /* renamed from: S */
    public static final long f235907S = 0;

    /* renamed from: T */
    public static final long f235908T = 0;

    /* renamed from: U */
    public static final long f235909U = 0;

    /* renamed from: A */
    public final byte[] f235911A;

    /* renamed from: B */
    public boolean f235912B;

    /* renamed from: C */
    public long f235913C;

    /* renamed from: D */
    public boolean f235914D;

    /* renamed from: E */
    public final Map<C80646h, Long> f235915E;

    /* renamed from: F */
    public C28698g f235916F;

    /* renamed from: G */
    public C80643f f235917G;

    /* renamed from: H */
    public final int[] f235918H;

    /* renamed from: I */
    public final int[] f235919I;

    /* renamed from: J */
    public final Runnable f235920J;

    /* renamed from: K */
    public final Runnable f235921K;

    /* renamed from: L */
    public final Runnable f235922L;

    /* renamed from: M */
    public final Runnable f235923M;

    /* renamed from: N */
    public final Application.ActivityLifecycleCallbacks f235924N;

    /* renamed from: d */
    public final Handler f235925d;

    /* renamed from: e */
    public Application f235926e;

    /* renamed from: f */
    public String f235927f;

    /* renamed from: g */
    public long f235928g;

    /* renamed from: h */
    public long f235929h;

    /* renamed from: i */
    public long f235930i;

    /* renamed from: j */
    public long f235931j;

    /* renamed from: n */
    public long f235932n;

    /* renamed from: o */
    public boolean f235933o;

    /* renamed from: p */
    public boolean f235934p;

    /* renamed from: q */
    public long f235935q;

    /* renamed from: r */
    public volatile boolean f235936r;

    /* renamed from: s */
    public boolean f235937s;

    /* renamed from: t */
    public boolean f235938t;

    /* renamed from: u */
    public volatile boolean f235939u;

    /* renamed from: v */
    public final byte[] f235940v;

    /* renamed from: w */
    public boolean f235941w;

    /* renamed from: x */
    public long f235942x;

    /* renamed from: y */
    public long f235943y;

    /* renamed from: z */
    public final boolean[] f235944z;

    /* renamed from: com.tencent.mm.app.z0$g */
    public interface C28698g {
    }

    /* renamed from: com.tencent.mm.app.z0$a */
    public class C80638a implements Runnable {
        public C80638a() {
        }

        public void run() {
            if (C80637z0.this.mo112371a(false) == 0) {
                C80637z0.this.f235937s = false;
            }
        }
    }

    /* renamed from: com.tencent.mm.app.z0$b */
    public class C80639b implements Runnable {
        public C80639b() {
        }

        /* JADX INFO: finally extract failed */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x0143  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0223  */
        public void run() {
            /*
                r22 = this;
                r1 = r22
                com.tencent.mm.app.z0 r2 = com.tencent.p014mm.app.C80637z0.this
                boolean[] r3 = r2.f235944z
                monitor-enter(r3)
                boolean[] r0 = r2.f235944z     // Catch:{ all -> 0x02d2 }
                r4 = 0
                boolean r5 = r0[r4]     // Catch:{ all -> 0x02d2 }
                monitor-exit(r3)     // Catch:{ all -> 0x02d2 }
                byte[] r6 = r2.f235940v
                monitor-enter(r6)
                boolean r3 = r2.f235941w     // Catch:{ all -> 0x02cc }
                long r7 = r2.f235942x     // Catch:{ all -> 0x02cc }
                long r9 = r2.f235943y     // Catch:{ all -> 0x02cc }
                monitor-exit(r6)     // Catch:{ all -> 0x02cc }
                r11 = -1
                int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r0 == 0) goto L_0x002d
                long r13 = com.tencent.p014mm.app.C80637z0.f235909U
                int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r0 > 0) goto L_0x002d
                int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r0 == 0) goto L_0x002d
                int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
                if (r0 > 0) goto L_0x002d
                r13 = 1
                goto L_0x002e
            L_0x002d:
                r13 = 0
            L_0x002e:
                byte[] r14 = r2.f235911A
                monitor-enter(r14)
                boolean r15 = r2.f235912B     // Catch:{ all -> 0x02c6 }
                r16 = r7
                long r6 = r2.f235913C     // Catch:{ all -> 0x02c6 }
                monitor-exit(r14)     // Catch:{ all -> 0x02c6 }
                int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r0 == 0) goto L_0x0044
                long r11 = com.tencent.p014mm.app.C80637z0.f235909U
                int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r0 > 0) goto L_0x0044
                r11 = 1
                goto L_0x0045
            L_0x0044:
                r11 = 0
            L_0x0045:
                if (r13 != 0) goto L_0x0049
                if (r11 == 0) goto L_0x02b4
            L_0x0049:
                com.tencent.tinker.entry.ApplicationLike r0 = com.tencent.p014mm.app.C80589e.f235760a
                boolean r12 = iv3.C87824b.m109281c(r0)
                com.tencent.mm.app.z0$g r0 = r2.f235916F
                if (r0 == 0) goto L_0x0060
                java.util.Map r0 = p156gj.C87201q.m108259c()
                java.lang.String r14 = "Hardware"
                java.lang.Object r0 = r0.get(r14)
                java.lang.String r0 = (java.lang.String) r0
                goto L_0x0061
            L_0x0060:
                r0 = 0
            L_0x0061:
                r14 = r0
                com.tencent.mm.app.z0$g r0 = r2.f235916F
                if (r0 == 0) goto L_0x00b9
                java.lang.String r8 = "[tomys] Cannot get config value, return 0 as benchmark level."
                java.lang.String r4 = "MicroMsg.InfoCollectorForStartupCostReport"
                java.lang.String r0 = "startup_cost_info"
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
                java.lang.String r1 = "device_benchmark_level"
                r19 = r15
                r15 = -2147483648(0xffffffff80000000, float:-0.0)
                r20 = r6
                int r6 = r0.decodeInt(r1, r15)
                if (r6 != r15) goto L_0x00be
                boolean r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
                if (r6 != 0) goto L_0x0086
                goto L_0x00bd
            L_0x0086:
                java.lang.Class<lc3.b> r6 = lc3.C10485b.class
                k40.a r6 = f40.C86709a0.m107533q(r6)     // Catch:{ all -> 0x0099 }
                lc3.b r6 = (lc3.C10485b) r6     // Catch:{ all -> 0x0099 }
                if (r6 != 0) goto L_0x009b
                java.lang.String r0 = "[tomys] Cannot get config service on main process, return 0 as benchmark level."
                r1 = 0
                java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0099 }
                com.tencent.p014mm.app.C80611s0.m98245c(r4, r0, r6)     // Catch:{ all -> 0x0099 }
                goto L_0x00bd
            L_0x0099:
                r0 = move-exception
                goto L_0x00b2
            L_0x009b:
                pj.f r6 = r6.vh0()     // Catch:{ all -> 0x0099 }
                java.lang.String r7 = "ClientBenchmarkLevel"
                int r6 = r6.mo107404b(r7, r15)     // Catch:{ all -> 0x0099 }
                if (r6 < 0) goto L_0x00ab
                r0.encode((java.lang.String) r1, (int) r6)     // Catch:{ all -> 0x0099 }
                goto L_0x00be
            L_0x00ab:
                r1 = 0
                java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ all -> 0x0099 }
                com.tencent.p014mm.app.C80611s0.m98245c(r4, r8, r0)     // Catch:{ all -> 0x0099 }
                goto L_0x00bd
            L_0x00b2:
                r1 = 0
                java.lang.Object[] r6 = new java.lang.Object[r1]
                com.tencent.p014mm.app.C80611s0.m98246d(r4, r0, r8, r6)
                goto L_0x00bd
            L_0x00b9:
                r20 = r6
                r19 = r15
            L_0x00bd:
                r6 = 0
            L_0x00be:
                r0 = 9
                java.util.Map$Entry[] r0 = new java.util.Map.Entry[r0]
                java.util.AbstractMap$SimpleImmutableEntry r1 = new java.util.AbstractMap$SimpleImmutableEntry
                java.lang.String r4 = "is_cold_startup"
                java.lang.String r7 = "%s"
                r1.<init>(r4, r7)
                r4 = 0
                r0[r4] = r1
                java.util.AbstractMap$SimpleImmutableEntry r1 = new java.util.AbstractMap$SimpleImmutableEntry
                java.lang.String r4 = "is_first_startup"
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                r1.<init>(r4, r5)
                r4 = 1
                r0[r4] = r1
                java.util.AbstractMap$SimpleImmutableEntry r1 = new java.util.AbstractMap$SimpleImmutableEntry
                java.lang.String r4 = "is_patch"
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r12)
                r1.<init>(r4, r5)
                r4 = 2
                r0[r4] = r1
                java.util.AbstractMap$SimpleImmutableEntry r1 = new java.util.AbstractMap$SimpleImmutableEntry
                java.lang.String r5 = "has_login"
                java.lang.String r7 = "%s"
                r1.<init>(r5, r7)
                r5 = 3
                r0[r5] = r1
                r1 = 4
                java.util.AbstractMap$SimpleImmutableEntry r7 = new java.util.AbstractMap$SimpleImmutableEntry
                java.lang.String r12 = "cpu_model"
                r7.<init>(r12, r14)
                r0[r1] = r7
                r1 = 5
                java.util.AbstractMap$SimpleImmutableEntry r7 = new java.util.AbstractMap$SimpleImmutableEntry
                java.lang.String r12 = "fingerprint"
                java.lang.String r14 = android.os.Build.FINGERPRINT
                r7.<init>(r12, r14)
                r0[r1] = r7
                r1 = 6
                java.util.AbstractMap$SimpleImmutableEntry r7 = new java.util.AbstractMap$SimpleImmutableEntry
                java.lang.String r12 = "rev"
                java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV
                r7.<init>(r12, r14)
                r0[r1] = r7
                r1 = 7
                java.util.AbstractMap$SimpleImmutableEntry r7 = new java.util.AbstractMap$SimpleImmutableEntry
                java.lang.String r12 = "dev_level"
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r7.<init>(r12, r6)
                r0[r1] = r7
                r1 = 8
                java.util.AbstractMap$SimpleImmutableEntry r6 = new java.util.AbstractMap$SimpleImmutableEntry
                java.lang.String r7 = "cost"
                java.lang.String r12 = "%s"
                r6.<init>(r7, r12)
                r0[r1] = r6
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.StartupILogsReport.buildJson(r0)
                r1 = 131077(0x20005, float:1.83678E-40)
                r6 = 131076(0x20004, float:1.83677E-40)
                r7 = 131073(0x20001, float:1.83672E-40)
                if (r13 == 0) goto L_0x0221
                com.tencent.mm.sdk.platformtools.PeriodRecorder r12 = com.tencent.p014mm.app.C80637z0.f235905Q
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "rpt_"
                r13.append(r14)
                java.lang.String r14 = r2.f235927f
                r13.append(r14)
                java.lang.String r14 = "_sc_cold"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                boolean r12 = r12.isExpired(r13)
                if (r12 == 0) goto L_0x020a
                android.app.Application r12 = r2.f235926e
                r13 = 65541(0x10005, float:9.1843E-41)
                java.lang.Long r14 = java.lang.Long.valueOf(r9)
                com.tencent.p014mm.sdk.platformtools.StartupILogsReport.reportNumericValue(r12, r13, r14)
                android.app.Application r12 = r2.f235926e
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.Boolean r14 = java.lang.Boolean.TRUE
                r15 = 0
                r13[r15] = r14
                java.lang.Boolean r18 = java.lang.Boolean.valueOf(r3)
                r8 = 1
                r13[r8] = r18
                java.lang.Long r18 = java.lang.Long.valueOf(r9)
                r13[r4] = r18
                java.lang.String r13 = java.lang.String.format(r0, r13)
                com.tencent.p014mm.sdk.platformtools.StartupILogsReport.reportStringValue(r12, r7, r13)
                android.app.Application r12 = r2.f235926e
                java.lang.Object[] r13 = new java.lang.Object[r5]
                r13[r15] = r14
                java.lang.Boolean r18 = java.lang.Boolean.valueOf(r3)
                r13[r8] = r18
                java.lang.Long r18 = java.lang.Long.valueOf(r16)
                r13[r4] = r18
                java.lang.String r13 = java.lang.String.format(r0, r13)
                com.tencent.p014mm.sdk.platformtools.StartupILogsReport.reportStringValue(r12, r6, r13)
                android.app.Application r12 = r2.f235926e
                java.lang.Object[] r13 = new java.lang.Object[r5]
                r13[r15] = r14
                java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
                r13[r8] = r14
                long r9 = r9 + r16
                java.lang.Long r9 = java.lang.Long.valueOf(r9)
                r13[r4] = r9
                java.lang.String r9 = java.lang.String.format(r0, r13)
                com.tencent.p014mm.sdk.platformtools.StartupILogsReport.reportStringValue(r12, r1, r9)
                java.util.Map<com.tencent.mm.app.z0$h, java.lang.Long> r12 = r2.f235915E
                monitor-enter(r12)
                java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x0207 }
                java.util.Map<com.tencent.mm.app.z0$h, java.lang.Long> r10 = r2.f235915E     // Catch:{ all -> 0x0207 }
                r9.<init>(r10)     // Catch:{ all -> 0x0207 }
                monitor-exit(r12)     // Catch:{ all -> 0x0207 }
                com.tencent.mm.app.z0$h[] r10 = com.tencent.p014mm.app.C80637z0.C80646h.values()
                int r12 = r10.length
                r13 = 0
            L_0x01d2:
                if (r13 >= r12) goto L_0x0221
                r14 = r10[r13]
                boolean r15 = r14.f235971e
                if (r15 != 0) goto L_0x01db
                goto L_0x0201
            L_0x01db:
                java.lang.Object r15 = r9.get(r14)
                java.lang.Long r15 = (java.lang.Long) r15
                if (r15 != 0) goto L_0x01e4
                goto L_0x0201
            L_0x01e4:
                android.app.Application r8 = r2.f235926e
                int r14 = r14.f235970d
                java.lang.Object[] r1 = new java.lang.Object[r5]
                java.lang.Boolean r16 = java.lang.Boolean.TRUE
                r17 = 0
                r1[r17] = r16
                java.lang.Boolean r16 = java.lang.Boolean.valueOf(r3)
                r17 = 1
                r1[r17] = r16
                r1[r4] = r15
                java.lang.String r1 = java.lang.String.format(r0, r1)
                com.tencent.p014mm.sdk.platformtools.StartupILogsReport.reportStringValue(r8, r14, r1)
            L_0x0201:
                int r13 = r13 + 1
                r1 = 131077(0x20005, float:1.83678E-40)
                goto L_0x01d2
            L_0x0207:
                r0 = move-exception
                monitor-exit(r12)     // Catch:{ all -> 0x0207 }
                throw r0
            L_0x020a:
                java.lang.String r1 = "MicroMsg.StartupCostReporter"
                java.lang.String r3 = "[tomys] Hit report freq limit, skip reporting this time. tinkerLoadCost:%s, coldStartupCost:%s"
                java.lang.Object[] r12 = new java.lang.Object[r4]
                java.lang.Long r8 = java.lang.Long.valueOf(r16)
                r13 = 0
                r12[r13] = r8
                java.lang.Long r8 = java.lang.Long.valueOf(r9)
                r9 = 1
                r12[r9] = r8
                com.tencent.p014mm.app.C80611s0.m98247e(r1, r3, r12)
            L_0x0221:
                if (r11 == 0) goto L_0x02b4
                com.tencent.mm.sdk.platformtools.PeriodRecorder r1 = com.tencent.p014mm.app.C80637z0.f235905Q
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r9 = "rpt_"
                r3.append(r9)
                java.lang.String r9 = r2.f235927f
                r3.append(r9)
                java.lang.String r9 = "_sc_hot"
                r3.append(r9)
                java.lang.String r3 = r3.toString()
                boolean r1 = r1.isExpired(r3)
                if (r1 == 0) goto L_0x02a3
                android.app.Application r1 = r2.f235926e
                r3 = 65542(0x10006, float:9.1844E-41)
                java.lang.Long r9 = java.lang.Long.valueOf(r20)
                com.tencent.p014mm.sdk.platformtools.StartupILogsReport.reportNumericValue(r1, r3, r9)
                android.app.Application r1 = r2.f235926e
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.Boolean r9 = java.lang.Boolean.FALSE
                r10 = 0
                r3[r10] = r9
                java.lang.Boolean r11 = java.lang.Boolean.valueOf(r19)
                r8 = 1
                r3[r8] = r11
                java.lang.Long r11 = java.lang.Long.valueOf(r20)
                r3[r4] = r11
                java.lang.String r3 = java.lang.String.format(r0, r3)
                com.tencent.p014mm.sdk.platformtools.StartupILogsReport.reportStringValue(r1, r7, r3)
                android.app.Application r1 = r2.f235926e
                java.lang.Object[] r3 = new java.lang.Object[r5]
                r3[r10] = r9
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r19)
                r3[r8] = r7
                java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
                r3[r4] = r7
                java.lang.String r3 = java.lang.String.format(r0, r3)
                com.tencent.p014mm.sdk.platformtools.StartupILogsReport.reportStringValue(r1, r6, r3)
                android.app.Application r1 = r2.f235926e
                java.lang.Object[] r2 = new java.lang.Object[r5]
                r2[r10] = r9
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r19)
                r2[r8] = r3
                java.lang.Long r3 = java.lang.Long.valueOf(r20)
                r2[r4] = r3
                java.lang.String r0 = java.lang.String.format(r0, r2)
                r2 = 131077(0x20005, float:1.83678E-40)
                com.tencent.p014mm.sdk.platformtools.StartupILogsReport.reportStringValue(r1, r2, r0)
                goto L_0x02b4
            L_0x02a3:
                r8 = 1
                java.lang.String r0 = "MicroMsg.StartupCostReporter"
                java.lang.String r1 = "[tomys] Hit report freq limit, skip reporting this time. hotStartupCost:%s"
                java.lang.Object[] r2 = new java.lang.Object[r8]
                java.lang.Long r3 = java.lang.Long.valueOf(r20)
                r4 = 0
                r2[r4] = r3
                com.tencent.p014mm.app.C80611s0.m98247e(r0, r1, r2)
            L_0x02b4:
                zt3.t r0 = zt3.C119157j.f356862d
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
                r2 = 60
                long r1 = r1.toMillis(r2)
                zt3.j r0 = (zt3.C119157j) r0
                r4 = r22
                r0.mo183878i(r4, r1)
                return
            L_0x02c6:
                r0 = move-exception
                r4 = r1
            L_0x02c8:
                monitor-exit(r14)     // Catch:{ all -> 0x02ca }
                throw r0
            L_0x02ca:
                r0 = move-exception
                goto L_0x02c8
            L_0x02cc:
                r0 = move-exception
                r4 = r1
            L_0x02ce:
                monitor-exit(r6)     // Catch:{ all -> 0x02d0 }
                throw r0
            L_0x02d0:
                r0 = move-exception
                goto L_0x02ce
            L_0x02d2:
                r0 = move-exception
                r4 = r1
            L_0x02d4:
                monitor-exit(r3)     // Catch:{ all -> 0x02d6 }
                throw r0
            L_0x02d6:
                r0 = move-exception
                goto L_0x02d4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.C80637z0.C80639b.run():void");
        }
    }

    /* renamed from: com.tencent.mm.app.z0$c */
    public class C80640c implements Runnable {
        public C80640c() {
        }

        public void run() {
            C80611s0.m98247e("MicroMsg.StartupCostReporter", "[tomys] Switch out too long, skip report this time.", new Object[0]);
            C80637z0.this.f235938t = true;
        }
    }

    /* renamed from: com.tencent.mm.app.z0$d */
    public class C80641d implements Runnable {
        public C80641d() {
        }

        public void run() {
            C80611s0.m98247e("MicroMsg.StartupCostReporter", "[tomys] All activity was destroyed, next startup may be warm.", new Object[0]);
            C80637z0 z0Var = C80637z0.this;
            z0Var.f235938t = false;
            z0Var.f235937s = false;
        }
    }

    /* renamed from: com.tencent.mm.app.z0$e */
    public class C80642e implements Application.ActivityLifecycleCallbacks {
        public C80642e() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C80637z0 z0Var = C80637z0.this;
            z0Var.getClass();
            boolean a = C86868b.m107886a(activity);
            synchronized (z0Var.f235918H) {
                int[] iArr = z0Var.f235918H;
                iArr[0] = iArr[0] + 1;
                if (a) {
                    iArr[1] = iArr[1] + 1;
                }
            }
            if (z0Var.mo112371a(false) == 1) {
                z0Var.f235931j = SystemClock.elapsedRealtime();
                z0Var.f235925d.removeCallbacks(z0Var.f235923M);
            }
            if (z0Var.mo112371a(true) == 1) {
                z0Var.f235932n = SystemClock.elapsedRealtime();
                z0Var.f235934p = z0Var.mo112373c();
            }
        }

        public void onActivityDestroyed(Activity activity) {
            C80637z0 z0Var = C80637z0.this;
            z0Var.getClass();
            boolean a = C86868b.m107886a(activity);
            synchronized (z0Var.f235918H) {
                int[] iArr = z0Var.f235918H;
                iArr[0] = iArr[0] - 1;
                if (a) {
                    iArr[1] = iArr[1] - 1;
                }
            }
            if (z0Var.f235938t && z0Var.mo112371a(false) == 0) {
                z0Var.f235925d.removeCallbacks(z0Var.f235923M);
                z0Var.f235925d.postDelayed(z0Var.f235923M, TimeUnit.SECONDS.toMillis(2));
            }
        }

        public void onActivityPaused(Activity activity) {
            C80643f fVar;
            C80637z0 z0Var = C80637z0.this;
            if (z0Var.mo112371a(true) > 0 && (fVar = z0Var.f235917G) != null) {
                fVar.mo112386a();
                z0Var.f235917G = null;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0080  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onActivityResumed(android.app.Activity r13) {
            /*
                r12 = this;
                com.tencent.mm.app.z0 r0 = com.tencent.p014mm.app.C80637z0.this
                boolean r1 = r0.f235938t
                if (r1 == 0) goto L_0x0008
                goto L_0x00f5
            L_0x0008:
                r1 = 1
                int r2 = r0.mo112371a(r1)
                if (r2 != 0) goto L_0x0011
                goto L_0x00f5
            L_0x0011:
                if (r2 != r1) goto L_0x0019
                long r2 = android.os.SystemClock.elapsedRealtime()
                r0.f235935q = r2
            L_0x0019:
                android.os.Handler r2 = r0.f235925d
                java.lang.Runnable r3 = r0.f235922L
                r2.removeCallbacks(r3)
                boolean r2 = r0.f235937s
                java.lang.String r3 = "MicroMsg.StartupCostReporter"
                r4 = 0
                if (r2 == 0) goto L_0x0086
                java.util.Map<com.tencent.mm.app.z0$h, java.lang.Long> r5 = r0.f235915E
                com.tencent.mm.app.z0$h r6 = com.tencent.p014mm.app.C80637z0.C80646h.UNTIL_KERNEL_STARTUP_END
                java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5
                java.lang.Object r5 = r5.get(r6)
                java.lang.Long r5 = (java.lang.Long) r5
                r6 = -1
                long r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Long) r5, (long) r6)
                int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r5 != 0) goto L_0x0045
                java.lang.Object[] r5 = new java.lang.Object[r4]
                java.lang.String r6 = "[tomys] Bad startup seq, kernel end time tick was lost. Ignore reporting."
                com.tencent.p014mm.app.C80611s0.m98248f(r3, r6, r5)
                goto L_0x007d
            L_0x0045:
                long r5 = r0.f235932n
                long r10 = r0.f235928g
                long r10 = r5 - r10
                long r10 = r10 - r8
                long r7 = com.tencent.p014mm.app.C80637z0.f235907S
                int r9 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r9 <= 0) goto L_0x005a
                java.lang.Object[] r5 = new java.lang.Object[r4]
                java.lang.String r6 = "[tomys] Bad startup seq, first ui create is too far from kernel startup end. Ignore reporting."
                com.tencent.p014mm.app.C80611s0.m98248f(r3, r6, r5)
                goto L_0x007d
            L_0x005a:
                long r7 = r0.f235935q
                long r7 = r7 - r5
                long r5 = com.tencent.p014mm.app.C80637z0.f235908T
                int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r9 <= 0) goto L_0x006b
                java.lang.Object[] r5 = new java.lang.Object[r4]
                java.lang.String r6 = "[tomys] Bad startup seq, first biz ui resumed is too far from first biz ui created. Ignore reporting."
                com.tencent.p014mm.app.C80611s0.m98248f(r3, r6, r5)
                goto L_0x007d
            L_0x006b:
                boolean r5 = r0.f235933o
                if (r5 == 0) goto L_0x0076
                boolean r5 = r0.f235934p
                if (r5 != 0) goto L_0x0074
                goto L_0x0076
            L_0x0074:
                r5 = 1
                goto L_0x007e
            L_0x0076:
                java.lang.Object[] r5 = new java.lang.Object[r4]
                java.lang.String r6 = "[tomys] Bad startup seq, startup or first biz ui created in background. Ignore reporting."
                com.tencent.p014mm.app.C80611s0.m98248f(r3, r6, r5)
            L_0x007d:
                r5 = 0
            L_0x007e:
                if (r5 != 0) goto L_0x0086
                r0.f235937s = r4
                r0.f235938t = r1
                goto L_0x00f5
            L_0x0086:
                if (r2 == 0) goto L_0x00a5
                long r5 = r0.f235931j
                long r7 = r0.f235928g
                long r5 = r5 - r7
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
                r8 = 10
                long r7 = r7.toMillis(r8)
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 <= 0) goto L_0x00a5
                java.lang.Object[] r13 = new java.lang.Object[r4]
                java.lang.String r2 = "[tomys] First ui create is too far from appLike.onBaseContextAttached, ignore report this time."
                com.tencent.p014mm.app.C80611s0.m98248f(r3, r2, r13)
                r0.f235937s = r4
                r0.f235938t = r1
                goto L_0x00f5
            L_0x00a5:
                android.view.Window r3 = r13.getWindow()
                if (r3 != 0) goto L_0x00ac
                goto L_0x00f5
            L_0x00ac:
                android.view.View r3 = r3.getDecorView()
                if (r3 != 0) goto L_0x00b3
                goto L_0x00f5
            L_0x00b3:
                com.tencent.mm.app.z0$g r3 = r0.f235916F     // Catch:{ all -> 0x00c1 }
                if (r3 == 0) goto L_0x00be
                boolean r3 = f40.C86709a0.m107522a()     // Catch:{ all -> 0x00c1 }
                if (r3 == 0) goto L_0x00be
                goto L_0x00bf
            L_0x00be:
                r1 = 0
            L_0x00bf:
                r4 = r1
                goto L_0x00c2
            L_0x00c1:
            L_0x00c2:
                com.tencent.mm.app.z0$f r1 = r0.f235917G
                if (r1 == 0) goto L_0x00c7
                goto L_0x00f5
            L_0x00c7:
                java.lang.Class r1 = r13.getClass()
                java.lang.String r1 = r1.getName()
                com.tencent.mm.app.a1 r3 = new com.tencent.mm.app.a1
                r3.<init>(r0, r1, r2, r4)
                r0.f235917G = r3
                android.view.View r0 = r3.f235950a
                if (r0 == 0) goto L_0x00dd
                r3.mo112386a()
            L_0x00dd:
                android.view.Window r13 = r13.getWindow()
                if (r13 != 0) goto L_0x00e4
                goto L_0x00f5
            L_0x00e4:
                android.view.View r13 = r13.getDecorView()
                if (r13 == 0) goto L_0x00f5
                r3.f235950a = r13
                android.view.ViewTreeObserver r13 = r13.getViewTreeObserver()
                android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r3.f235951b
                r13.addOnGlobalLayoutListener(r0)
            L_0x00f5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.C80637z0.C80642e.onActivityResumed(android.app.Activity):void");
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            C80637z0 z0Var = C80637z0.this;
            z0Var.getClass();
            boolean a = C86868b.m107886a(activity);
            synchronized (z0Var.f235919I) {
                int[] iArr = z0Var.f235919I;
                iArr[0] = iArr[0] + 1;
                if (a) {
                    iArr[1] = iArr[1] + 1;
                }
            }
        }

        public void onActivityStopped(Activity activity) {
            int[] iArr;
            int i;
            C80637z0 z0Var = C80637z0.this;
            z0Var.getClass();
            boolean a = C86868b.m107886a(activity);
            synchronized (z0Var.f235919I) {
                iArr = z0Var.f235919I;
                iArr[0] = iArr[0] - 1;
                if (a) {
                    iArr[1] = iArr[1] - 1;
                }
            }
            if (!z0Var.f235938t) {
                synchronized (iArr) {
                    i = z0Var.f235919I[0];
                }
                if (i == 0) {
                    z0Var.f235925d.removeCallbacks(z0Var.f235922L);
                    z0Var.f235925d.postDelayed(z0Var.f235922L, C80637z0.f235906R);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.app.z0$f */
    public abstract class C80643f {

        /* renamed from: a */
        public View f235950a;

        /* renamed from: b */
        public final ViewTreeObserver.OnGlobalLayoutListener f235951b;

        /* renamed from: com.tencent.mm.app.z0$f$a */
        public class C80644a implements ViewTreeObserver.OnGlobalLayoutListener {

            /* renamed from: com.tencent.mm.app.z0$f$a$a */
            public class C80645a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ View f235954d;

                public C80645a(View view) {
                    this.f235954d = view;
                }

                public void run() {
                    C80643f fVar = C80643f.this;
                    View view = this.f235954d;
                    C80583a1 a1Var = (C80583a1) fVar;
                    a1Var.getClass();
                    try {
                        C79760s.m96908a("StartupCostReporter.recordCost");
                        a1Var.mo112273b(view);
                    } finally {
                        C79760s.m96909b();
                    }
                }
            }

            public C80644a() {
            }

            public void onGlobalLayout() {
                C80643f fVar = C80643f.this;
                View view = fVar.f235950a;
                if (view != null) {
                    fVar.mo112386a();
                    C80643f.this.getClass();
                    C80637z0.this.f235925d.postAtFrontOfQueue(new C80645a(view));
                }
            }
        }

        public C80643f(C80638a aVar) {
            this.f235950a = null;
            this.f235951b = new C80644a();
        }

        /* renamed from: a */
        public void mo112386a() {
            View view = this.f235950a;
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f235951b);
                this.f235950a = null;
            }
        }
    }

    /* renamed from: com.tencent.mm.app.z0$h */
    public enum C80646h {
        UNTIL_TINKER_LOADED(196609, true),
        UNTIL_ON_BASE_CONTEXT_ATTACHED_END(196610, false),
        UNTIL_APPLICATION_ON_CREATE_END(196611, false),
        UNTIL_KERNEL_STARTUP_BEGIN(196612, true),
        UNTIL_PRELOAD_ON_SPLASH_BEGIN(196613, false),
        UNTIL_PRELOAD_ON_SPLASH_END(196614, false),
        UNTIL_INVOKE_KERNEL_EXTENSION_BEGIN(196615, false),
        UNTIL_INVOKE_KERNEL_EXTENSION_END(196616, false),
        UNTIL_KERNEL_STARTUP_END(196617, true),
        UNTIL_LAUNCHER_UI_ON_CREATE_BEGIN(196618, false),
        UNTIL_LAUNCHER_UI_ON_CREATE_END(196619, false),
        UNTIL_LAUNCHER_UI_ON_RESUME_END(196620, true),
        UNTIL_LAUNCHER_UI_FIRST_FRAME_END(196621, true);
        

        /* renamed from: d */
        public int f235970d;

        /* renamed from: e */
        public boolean f235971e;

        /* access modifiers changed from: public */
        C80646h(int i, boolean z) {
            this.f235970d = i;
            this.f235971e = z;
        }
    }

    /* access modifiers changed from: public */
    static {
        f235905Q = new PeriodRecorder("StartupCostReporter_kvstat", TimeUnit.DAYS.toMillis(1), false, true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f235906R = timeUnit.toMillis(1);
        f235907S = timeUnit.toMillis(5);
        f235908T = timeUnit.toMillis(5);
        f235909U = TimeUnit.MINUTES.toMillis(10);
    }

    /* renamed from: a */
    public final int mo112371a(boolean z) {
        int i;
        synchronized (this.f235918H) {
            i = this.f235918H[z ? (char) 1 : 0];
        }
        return i;
    }

    /* renamed from: b */
    public void mo112372b(ApplicationLike applicationLike, C28698g gVar) {
        if (this.f235936r) {
            C80611s0.m98248f("MicroMsg.StartupCostReporter", "[tomys] Already installed.", new Object[0]);
            return;
        }
        this.f235928g = applicationLike.getApplicationStartElapsedTime();
        this.f235929h = SystemClock.elapsedRealtime();
        this.f235930i = SystemClock.uptimeMillis();
        this.f235933o = mo112373c();
        Application application = applicationLike.getApplication();
        this.f235926e = application;
        this.f235927f = C79757o.m96896a(application);
        this.f235916F = gVar;
        this.f235926e.registerActivityLifecycleCallbacks(this.f235924N);
        this.f235925d.post(this.f235920J);
        this.f235936r = true;
        C80611s0.m98247e("MicroMsg.StartupCostReporter", "[tomys] install, startup_begin_ts:%s, install_ts:%s, install_ts_nh:%s, install_cgroup_foreground:%s", Long.valueOf(this.f235928g), Long.valueOf(this.f235929h), Long.valueOf(this.f235930i), Boolean.valueOf(this.f235933o));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r1.importance == 100) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006d A[Catch:{ all -> 0x0090, all -> 0x0095, all -> 0x009a }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo112373c() {
        /*
            r7 = this;
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.mm.app.u0 r1 = com.tencent.p014mm.app.C80622u0.m98265a(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0055
            com.tencent.mm.app.u0$a r1 = r1.f235889g
            com.tencent.mm.app.u0$a r4 = com.tencent.p014mm.app.C80622u0.C80623a.ISOLATED
            if (r1 != r4) goto L_0x0013
            goto L_0x0055
        L_0x0013:
            java.lang.String r1 = "activity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            if (r0 != 0) goto L_0x001e
            goto L_0x0053
        L_0x001e:
            java.util.List r0 = r0.getRunningAppProcesses()
            if (r0 == 0) goto L_0x0053
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002b
            goto L_0x0053
        L_0x002b:
            java.util.Iterator r0 = r0.iterator()
        L_0x002f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0053
            java.lang.Object r1 = r0.next()
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1
            int r4 = r1.pid
            int r5 = android.os.Process.myPid()
            if (r4 != r5) goto L_0x002f
            int r4 = r1.uid
            int r5 = android.os.Process.myUid()
            if (r4 == r5) goto L_0x004c
            goto L_0x002f
        L_0x004c:
            int r0 = r1.importance
            r1 = 100
            if (r0 != r1) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r0 = 0
            goto L_0x0056
        L_0x0055:
            r0 = 1
        L_0x0056:
            java.io.File r1 = new java.io.File
            java.lang.String r4 = "/proc/self/cgroup"
            r1.<init>(r4)
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x009a }
            java.io.FileReader r5 = new java.io.FileReader     // Catch:{ all -> 0x009a }
            r5.<init>(r1)     // Catch:{ all -> 0x009a }
            r4.<init>(r5)     // Catch:{ all -> 0x009a }
        L_0x0067:
            java.lang.String r1 = r4.readLine()     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x008c
            java.lang.String r5 = "top-app"
            boolean r5 = r1.contains(r5)     // Catch:{ all -> 0x0090 }
            if (r5 == 0) goto L_0x007b
            r4.close()     // Catch:{ all -> 0x009a }
            r1 = 1
            goto L_0x00a5
        L_0x007b:
            java.lang.String r5 = "background"
            boolean r5 = r1.contains(r5)     // Catch:{ all -> 0x0090 }
            if (r5 != 0) goto L_0x008c
            java.lang.String r5 = "restricted"
            boolean r1 = r1.contains(r5)     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x0067
        L_0x008c:
            r4.close()     // Catch:{ all -> 0x009a }
            goto L_0x00a4
        L_0x0090:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0095 }
            goto L_0x0099
        L_0x0095:
            r4 = move-exception
            r1.addSuppressed(r4)     // Catch:{ all -> 0x009a }
        L_0x0099:
            throw r1     // Catch:{ all -> 0x009a }
        L_0x009a:
            r1 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "MicroMsg.StartupCostReporter"
            java.lang.String r6 = "[-] Fail to read cgroup file."
            com.tencent.p014mm.app.C80611s0.m98246d(r5, r1, r6, r4)
        L_0x00a4:
            r1 = 0
        L_0x00a5:
            if (r0 == 0) goto L_0x00aa
            if (r1 == 0) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            r2 = 0
        L_0x00ab:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.C80637z0.mo112373c():boolean");
    }

    /* renamed from: e */
    public void mo112374e(C80646h hVar) {
        if (this.f235936r && !this.f235939u) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f235928g;
            synchronized (this.f235915E) {
                ((ConcurrentHashMap) this.f235915E).put(hVar, Long.valueOf(elapsedRealtime));
            }
            Log.m105925i("MicroMsg.StartupCostReporter", "[startup] since app startup %s cost %s ms.", hVar, Long.valueOf(elapsedRealtime));
            Objects.toString(hVar);
        }
    }
}
