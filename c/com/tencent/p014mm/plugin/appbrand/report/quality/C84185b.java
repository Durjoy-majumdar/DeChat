package com.tencent.p014mm.plugin.appbrand.report.quality;

import android.os.Parcel;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityFlagsStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySystemResourceReadyStruct;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.p014mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle;
import com.tencent.p014mm.plugin.appbrand.performance.C83997d;
import com.tencent.p014mm.plugin.appbrand.report.C84116i0;
import com.tencent.p014mm.plugin.appbrand.utils.C84788u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import js0.C88024r;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.report.quality.b */
public class C84185b {

    /* renamed from: a */
    public static final C84191e f245912a = new C84191e();

    /* renamed from: b */
    public static final HashMap<String, QualitySessionRuntime> f245913b = new HashMap<>();

    /* renamed from: c */
    public static final C84180a f245914c = new C84180a();

    /* JADX WARNING: CFG modification limit reached, blocks count: 119 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.p014mm.plugin.appbrand.report.quality.QualitySessionRuntime m103768a(com.tencent.p014mm.plugin.appbrand.AppBrandRuntime r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime> r1 = f245913b
            monitor-enter(r1)
            java.lang.String r2 = r3.f238147j     // Catch:{ all -> 0x001a }
            java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x001a }
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r2 = (com.tencent.p014mm.plugin.appbrand.report.quality.QualitySessionRuntime) r2     // Catch:{ all -> 0x001a }
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            if (r2 == 0) goto L_0x0017
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r2.f245854o
            if (r3 != r1) goto L_0x0017
            return r2
        L_0x0017:
            return r0
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r3
        L_0x001a:
            r3 = move-exception
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.m103768a(com.tencent.mm.plugin.appbrand.AppBrandRuntime):com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime");
    }

    /* renamed from: b */
    public static QualitySessionRuntime m103769b(String str) {
        return m103770c(str, true);
    }

    /* renamed from: c */
    public static QualitySessionRuntime m103770c(String str, boolean z) {
        QualitySessionRuntime qualitySessionRuntime;
        HashMap<String, QualitySessionRuntime> hashMap = f245913b;
        synchronized (hashMap) {
            qualitySessionRuntime = hashMap.get(str);
        }
        if (qualitySessionRuntime == null) {
            String format = String.format(Locale.US, "QualitySession not open. appId=%s", new Object[]{str});
            if (!z || (!BuildInfo.DEBUG && !BuildInfo.IS_FLAVOR_RED)) {
                Log.printErrStackTrace("MicroMsg.AppBrandQualitySystem", new Throwable(), format, new Object[0]);
            } else {
                throw new IllegalStateException(format);
            }
        }
        return qualitySessionRuntime;
    }

    /* renamed from: d */
    public static void m103771d(AppBrandSysConfigWC appBrandSysConfigWC, AppStartupPerformanceReportBundle appStartupPerformanceReportBundle, AppBrandRuntimeWC appBrandRuntimeWC) {
        long j;
        QualitySessionRuntime a = m103768a(appBrandRuntimeWC);
        if (a != null) {
            a.f245857r = System.currentTimeMillis();
            a.f245861v = appStartupPerformanceReportBundle;
            String str = appBrandRuntimeWC.f238147j;
            AppStartupPerformanceReportBundle appStartupPerformanceReportBundle2 = (AppStartupPerformanceReportBundle) appBrandRuntimeWC.mo113021O(AppStartupPerformanceReportBundle.class, false);
            if (appStartupPerformanceReportBundle2 == null) {
                Log.m105920e("MicroMsg.AppBrandQualitySystem", "ReportBundle == null in resourceReady");
            } else {
                WeAppQualitySystemResourceReadyStruct weAppQualitySystemResourceReadyStruct = new WeAppQualitySystemResourceReadyStruct();
                QualitySessionRuntime c = m103770c(str, true);
                if (c != null) {
                    weAppQualitySystemResourceReadyStruct.f237258e = weAppQualitySystemResourceReadyStruct.mo86045b("AppId", c.f245833e, true);
                    weAppQualitySystemResourceReadyStruct.f237257d = weAppQualitySystemResourceReadyStruct.mo86045b("InstanceId", c.f245832d, true);
                    int i = c.f245834f;
                    weAppQualitySystemResourceReadyStruct.f237260g = i != 1 ? i != 2 ? i != 3 ? null : WeAppQualitySystemResourceReadyStruct.C80787a.demo : WeAppQualitySystemResourceReadyStruct.C80787a.debug : WeAppQualitySystemResourceReadyStruct.C80787a.release;
                    weAppQualitySystemResourceReadyStruct.f237261h = (long) c.f245835g;
                    weAppQualitySystemResourceReadyStruct.f237263j = (long) c.f245836h;
                    weAppQualitySystemResourceReadyStruct.f237259f = (long) c.f245837i;
                    long j2 = c.f245855p;
                    weAppQualitySystemResourceReadyStruct.f237264k = j2;
                    weAppQualitySystemResourceReadyStruct.mo86048e("StartTimeStampMs", j2);
                    long nowMilliSecond = Util.nowMilliSecond();
                    weAppQualitySystemResourceReadyStruct.f237265l = nowMilliSecond;
                    weAppQualitySystemResourceReadyStruct.mo86048e("EndTimeStampMs", nowMilliSecond);
                    long j3 = weAppQualitySystemResourceReadyStruct.f237265l - weAppQualitySystemResourceReadyStruct.f237264k;
                    weAppQualitySystemResourceReadyStruct.f237262i = j3;
                    weAppQualitySystemResourceReadyStruct.mo86046c("CostTimeMs", j3);
                    weAppQualitySystemResourceReadyStruct.f237274u = appStartupPerformanceReportBundle2.f243293j;
                    weAppQualitySystemResourceReadyStruct.f237275v = appStartupPerformanceReportBundle2.f243295o;
                    weAppQualitySystemResourceReadyStruct.f237276w = c.f245838j;
                    weAppQualitySystemResourceReadyStruct.f237277x = (long) appStartupPerformanceReportBundle2.f243300t;
                    AppBrandSysConfigWC S1 = appBrandRuntimeWC.mo113213o1();
                    AppBrandInitConfigWC M1 = appBrandRuntimeWC.mo113210l1();
                    weAppQualitySystemResourceReadyStruct.f237267n = appStartupPerformanceReportBundle2.f243301u ? WeAppQualitySystemResourceReadyStruct.C80789c.sync : WeAppQualitySystemResourceReadyStruct.C80789c.unsync;
                    weAppQualitySystemResourceReadyStruct.f237268o = M1.f234825W0 ? WeAppQualitySystemResourceReadyStruct.C80788b.sync : WeAppQualitySystemResourceReadyStruct.C80788b.unsync;
                    long j4 = 0;
                    weAppQualitySystemResourceReadyStruct.f237270q = appBrandRuntimeWC.f238285m1 ? 1 : 0;
                    if (!C86013q1.m106450k(S1.f261072r.pkgPath)) {
                        Iterator<ModulePkgInfo> it = S1.f261072r.f238588g.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                j = 0;
                                break;
                            }
                            ModulePkgInfo next = it.next();
                            if (C86013q1.m106450k(next.pkgPath)) {
                                j = C86013q1.m106451l(next.pkgPath);
                                break;
                            }
                        }
                    } else {
                        j = C86013q1.m106451l(S1.f261072r.pkgPath);
                    }
                    if (appBrandRuntimeWC.f238285m1) {
                        j4 = j;
                    }
                    weAppQualitySystemResourceReadyStruct.f237266m = j4;
                    weAppQualitySystemResourceReadyStruct.f237269p = (long) C84201i.m103806c();
                    weAppQualitySystemResourceReadyStruct.f237273t = c.f245846G;
                    weAppQualitySystemResourceReadyStruct.f237271r = c.mo116871a();
                    long j5 = c.f245861v.f243291h - c.f245861v.f243290g;
                    weAppQualitySystemResourceReadyStruct.f237272s = j5;
                    weAppQualitySystemResourceReadyStruct.mo86046c("NonUICostTimeMs", j5);
                    weAppQualitySystemResourceReadyStruct.f237278y = appStartupPerformanceReportBundle2.f243302v ? WeAppQualitySystemResourceReadyStruct.C80791e.sync : WeAppQualitySystemResourceReadyStruct.C80791e.unsync;
                    weAppQualitySystemResourceReadyStruct.f237279z = appStartupPerformanceReportBundle2.f243297q - appStartupPerformanceReportBundle2.f243296p;
                    weAppQualitySystemResourceReadyStruct.f237255C = appStartupPerformanceReportBundle2.f243303w ? WeAppQualitySystemResourceReadyStruct.C80790d.sync : WeAppQualitySystemResourceReadyStruct.C80790d.unsync;
                    weAppQualitySystemResourceReadyStruct.f237256D = appStartupPerformanceReportBundle2.f243299s - appStartupPerformanceReportBundle2.f243298r;
                    weAppQualitySystemResourceReadyStruct.f237253A = c.mo116872b();
                    weAppQualitySystemResourceReadyStruct.f237254B = weAppQualitySystemResourceReadyStruct.mo86045b("NetworkTypeStr", C84116i0.m103659b(MMApplicationContext.getContext()), true);
                    weAppQualitySystemResourceReadyStruct.mo86054n();
                    if (DebuggerShell.f239772d) {
                        C83997d.m103521d(weAppQualitySystemResourceReadyStruct.f237258e, "ResourcePrepare", weAppQualitySystemResourceReadyStruct.f237264k, weAppQualitySystemResourceReadyStruct.f237265l);
                    }
                }
            }
            C88024r.m109572b(new b$$b(a, appBrandSysConfigWC));
        }
    }

    /* renamed from: e */
    public static void m103772e(C81879g gVar, String str, long j, String str2, int i, long j2, int i2, C80669j.C80676g gVar2) {
        String str3 = str;
        m103773f(gVar, str, j, str2, i, j2, i2, gVar2, str.endsWith("app-service.js") || "game.js".equals(str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0173  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m103773f(com.tencent.p014mm.plugin.appbrand.C81879g r20, java.lang.String r21, long r22, java.lang.String r24, int r25, long r26, int r28, com.tencent.p014mm.appbrand.p942v8.C80669j.C80676g r29, boolean r30) {
        /*
            r0 = r20
            r1 = r21
            r2 = r26
            r4 = r29
            java.lang.String r5 = r20.getAppId()
            r6 = 1
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r7 = m103770c(r5, r6)
            if (r7 != 0) goto L_0x0014
            return
        L_0x0014:
            r8 = 4
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r10 = 0
            r9[r10] = r5
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r11 = r7.f245854o
            int r11 = r11.hashCode()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r9[r6] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r28)
            r12 = 2
            r9[r12] = r11
            r11 = 3
            r9[r11] = r1
            java.lang.String r13 = "MicroMsg.AppBrandQualitySystem"
            java.lang.String r14 = "[QualitySystem] onUserScriptInject appId = [%s] session.runtime.hashCode = [%d] runtimeHashCode = [%d] name = [%s]."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r14, r9)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r9 = r7.f245854o
            int r9 = r9.hashCode()
            r14 = r28
            if (r14 == r9) goto L_0x0057
            java.lang.String r0 = "[QualitySystem] onUserScriptInject runtime hashCode mismatch"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r0 != 0) goto L_0x004f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 != 0) goto L_0x004f
            return
        L_0x004f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "[RED_FLAVOR_ONLY] [APPBRAND] onUserScriptInject runtime hashCode mismatch"
            r0.<init>(r1)
            throw r0
        L_0x0057:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityJSInjectStruct r9 = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityJSInjectStruct
            r9.<init>()
            java.lang.String r13 = r7.f245833e
            java.lang.String r14 = "AppId"
            java.lang.String r13 = r9.mo86045b(r14, r13, r6)
            r9.f236842e = r13
            java.lang.String r13 = r7.f245832d
            java.lang.String r15 = "InstanceId"
            java.lang.String r13 = r9.mo86045b(r15, r13, r6)
            r9.f236841d = r13
            int r13 = r7.f245834f
            long r10 = (long) r13
            r9.f236844g = r10
            int r10 = r7.f245835g
            long r10 = (long) r10
            r9.f236845h = r10
            int r10 = r7.f245837i
            long r10 = (long) r10
            r9.f236843f = r10
            int r10 = r7.f245836h
            long r10 = (long) r10
            r9.f236847j = r10
            r9.f236848k = r2
            java.lang.String r10 = "StartTimeStampMs"
            r9.mo86048e(r10, r2)
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r9.f236849l = r2
            java.lang.String r11 = "EndTimeStampMs"
            r9.mo86048e(r11, r2)
            long r2 = r9.f236849l
            long r12 = r9.f236848k
            long r2 = r2 - r12
            r9.f236846i = r2
            java.lang.String r12 = "CostTimeMs"
            r9.mo86046c(r12, r2)
            r2 = r22
            r9.f236850m = r2
            java.lang.String r2 = "filePath"
            java.lang.String r1 = r9.mo86045b(r2, r1, r6)
            r9.f236851n = r1
            com.tencent.mm.plugin.appbrand.jsruntime.i r1 = r20.getJsRuntime()
            com.tencent.mm.plugin.appbrand.report.m r1 = com.tencent.p014mm.plugin.appbrand.report.C84136m.m103674a(r1)
            int r2 = r1.ordinal()
            switch(r2) {
                case 0: goto L_0x00d0;
                case 1: goto L_0x00ce;
                case 2: goto L_0x00cc;
                case 3: goto L_0x00d1;
                case 4: goto L_0x00ca;
                case 5: goto L_0x00c8;
                case 6: goto L_0x00c5;
                case 7: goto L_0x00c2;
                case 8: goto L_0x00bf;
                default: goto L_0x00bd;
            }
        L_0x00bd:
            r8 = 0
            goto L_0x00d1
        L_0x00bf:
            r8 = 104(0x68, float:1.46E-43)
            goto L_0x00d1
        L_0x00c2:
            r8 = 103(0x67, float:1.44E-43)
            goto L_0x00d1
        L_0x00c5:
            r8 = 102(0x66, float:1.43E-43)
            goto L_0x00d1
        L_0x00c8:
            r8 = 5
            goto L_0x00d1
        L_0x00ca:
            r8 = 6
            goto L_0x00d1
        L_0x00cc:
            r8 = 3
            goto L_0x00d1
        L_0x00ce:
            r8 = 2
            goto L_0x00d1
        L_0x00d0:
            r8 = 1
        L_0x00d1:
            long r2 = (long) r8
            r9.f236852o = r2
            if (r4 == 0) goto L_0x00e3
            int r2 = r4.codeCacheStatus
            if (r2 < 0) goto L_0x00e3
            int[] r3 = com.tencent.p014mm.plugin.appbrand.jsruntime.C83187w.f242988l0
            r8 = 7
            if (r2 >= r8) goto L_0x00e3
            r2 = r3[r2]
            long r2 = (long) r2
            goto L_0x00e5
        L_0x00e3:
            r2 = 4
        L_0x00e5:
            r9.f236853p = r2
            boolean r2 = r0 instanceof kr0.C88267e
            if (r2 == 0) goto L_0x00f3
            r2 = r0
            kr0.e r2 = (kr0.C88267e) r2
            boolean r2 = r2.mo122650O0()
            goto L_0x0104
        L_0x00f3:
            boolean r2 = r0 instanceof com.tencent.p014mm.plugin.appbrand.page.C83928t1
            if (r2 == 0) goto L_0x0103
            r2 = r0
            com.tencent.mm.plugin.appbrand.page.t1 r2 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r2
            kr0.e r2 = r2.mo116160O0()
            boolean r2 = r2.mo122650O0()
            goto L_0x0104
        L_0x0103:
            r2 = 0
        L_0x0104:
            r16 = 1
            r18 = 0
            if (r2 == 0) goto L_0x010d
            r2 = r16
            goto L_0x010f
        L_0x010d:
            r2 = r18
        L_0x010f:
            r9.f236854q = r2
            if (r4 == 0) goto L_0x0116
            long r2 = r4.flatJSCompileCost
            goto L_0x0118
        L_0x0116:
            r2 = r18
        L_0x0118:
            r9.f236855r = r2
            com.tencent.mm.plugin.appbrand.report.m[] r2 = com.tencent.p014mm.plugin.appbrand.report.C84136m.f245619j
            boolean r1 = u24.C90595a.m113498b(r2, r1)
            java.lang.String r2 = "engineVersion"
            if (r1 == 0) goto L_0x012f
            java.lang.String r1 = com.eclipsesource.mmv8.C80135V8.getV8Version()
            java.lang.String r1 = r9.mo86045b(r2, r1, r6)
            r9.f236856s = r1
            goto L_0x0154
        L_0x012f:
            com.tencent.mm.plugin.appbrand.jsruntime.i r1 = r20.getJsRuntime()
            boolean r1 = r1 instanceof com.tencent.p014mm.plugin.appbrand.page.C83797e3
            if (r1 == 0) goto L_0x0154
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.tencent.mm.plugin.appbrand.report.quality.e r3 = f245912a
            long r3 = r3.mo116900d()
            r1.append(r3)
            java.lang.String r3 = ""
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r9.mo86045b(r2, r1, r6)
            r9.f236856s = r1
        L_0x0154:
            java.lang.String r1 = "pluginAppid"
            r2 = r24
            java.lang.String r1 = r9.mo86045b(r1, r2, r6)
            r9.f236857t = r1
            java.lang.String r1 = java.lang.String.valueOf(r25)
            java.lang.String r2 = "pluginVersion"
            java.lang.String r1 = r9.mo86045b(r2, r1, r6)
            r9.f236858u = r1
            r9.mo86054n()
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.appbrand.C81925i2
            if (r1 == 0) goto L_0x019c
            gm0.a r1 = new gm0.a
            r1.<init>()
            java.lang.String r2 = "evaluateJavaScript"
            r1.f252991a = r2
            long r2 = r9.f236848k
            r1.f252992b = r2
            long r2 = r9.f236849l
            r1.f252993c = r2
            java.lang.String r2 = r9.f236851n
            java.lang.String r3 = "fileName"
            r1.mo121669b(r3, r2)
            long r2 = r9.f236850m
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "size"
            r1.mo121669b(r3, r2)
            com.tencent.mm.plugin.appbrand.i2 r0 = (com.tencent.p014mm.plugin.appbrand.C81925i2) r0
            r1.mo121668a(r0)
        L_0x019c:
            com.tencent.mm.plugin.appbrand.report.quality.b$$c r0 = r7.f245863x
            boolean r1 = r0.f245918a
            if (r1 != 0) goto L_0x0294
            if (r30 == 0) goto L_0x0294
            r0.f245918a = r6
            long r0 = java.lang.System.currentTimeMillis()
            r7.f245858s = r0
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r7.f245854o
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLaunchJSStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLaunchJSStruct
            r1.<init>()
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r2 = m103770c(r5, r6)
            if (r2 != 0) goto L_0x01bb
            goto L_0x0276
        L_0x01bb:
            java.lang.String r3 = r2.f245833e
            java.lang.String r3 = r1.mo86045b(r14, r3, r6)
            r1.f236860e = r3
            java.lang.String r3 = r2.f245832d
            java.lang.String r3 = r1.mo86045b(r15, r3, r6)
            r1.f236859d = r3
            int r3 = r2.f245834f
            if (r3 == r6) goto L_0x01dd
            r4 = 2
            if (r3 == r4) goto L_0x01da
            r4 = 3
            if (r3 == r4) goto L_0x01d7
            r3 = 0
            goto L_0x01df
        L_0x01d7:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLaunchJSStruct$a r3 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityLaunchJSStruct.C80767a.demo
            goto L_0x01df
        L_0x01da:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLaunchJSStruct$a r3 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityLaunchJSStruct.C80767a.debug
            goto L_0x01df
        L_0x01dd:
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLaunchJSStruct$a r3 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityLaunchJSStruct.C80767a.release
        L_0x01df:
            r1.f236862g = r3
            int r3 = r2.f245835g
            long r3 = (long) r3
            r1.f236863h = r3
            int r3 = r2.f245837i
            long r3 = (long) r3
            r1.f236861f = r3
            int r3 = r2.f245836h
            long r3 = (long) r3
            r1.f236865j = r3
            long r3 = r2.f245855p
            r1.f236866k = r3
            r1.mo86048e(r10, r3)
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r1.f236867l = r3
            r1.mo86048e(r11, r3)
            long r3 = r1.f236867l
            long r7 = r2.f245855p
            long r3 = r3 - r7
            r1.f236864i = r3
            r1.mo86046c(r12, r3)
            java.lang.String r3 = r0.mo113030T()
            java.lang.String r3 = p206nj.C117627q.m165908a(r3)
            java.lang.String r4 = "path"
            java.lang.String r3 = r1.mo86045b(r4, r3, r6)
            r1.f236868m = r3
            boolean r3 = r0.f238285m1
            if (r3 == 0) goto L_0x0222
            r3 = r16
            goto L_0x0224
        L_0x0222:
            r3 = r18
        L_0x0224:
            r1.f236869n = r3
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r3 = r2.f245861v
            if (r3 == 0) goto L_0x023a
            com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle r3 = r2.f245861v
            boolean r3 = r3.mo115530a()
            if (r3 == 0) goto L_0x0235
            r3 = r16
            goto L_0x0237
        L_0x0235:
            r3 = r18
        L_0x0237:
            r1.f236870o = r3
            goto L_0x023e
        L_0x023a:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r3 != 0) goto L_0x028c
        L_0x023e:
            long r3 = r2.mo116871a()
            r1.f236871p = r3
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = com.tencent.p014mm.plugin.appbrand.report.C84116i0.m103659b(r3)
            java.lang.String r4 = "networkType"
            java.lang.String r3 = r1.mo86045b(r4, r3, r6)
            r1.f236872q = r3
            long r3 = r2.f245846G
            r1.f236873r = r3
            long r2 = r2.mo116872b()
            r1.f236874s = r2
            java.lang.Class<com.tencent.mm.plugin.appbrand.page.c1> r2 = com.tencent.p014mm.plugin.appbrand.page.C83773c1.class
            com.tencent.mm.plugin.appbrand.jsapi.m r0 = r0.mo113018M(r2)
            com.tencent.mm.plugin.appbrand.page.c1 r0 = (com.tencent.p014mm.plugin.appbrand.page.C83773c1) r0
            boolean r0 = r0.mo116114a()
            if (r0 == 0) goto L_0x026d
            goto L_0x026f
        L_0x026d:
            r16 = 2
        L_0x026f:
            r2 = r16
            r1.f236875t = r2
            r1.mo86054n()
        L_0x0276:
            boolean r0 = com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShell.f239772d
            if (r0 == 0) goto L_0x0294
            long r0 = r9.f236848k
            long r2 = r9.f236849l
            java.lang.String r4 = "JsInject"
            r20 = r5
            r21 = r4
            r22 = r0
            r24 = r2
            com.tencent.p014mm.plugin.appbrand.performance.C83997d.m103521d(r20, r21, r22, r24)
            goto L_0x0294
        L_0x028c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "StartupBundle not registered."
            r0.<init>(r1)
            throw r0
        L_0x0294:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.m103773f(com.tencent.mm.plugin.appbrand.g, java.lang.String, long, java.lang.String, int, long, int, com.tencent.mm.appbrand.v8.j$g, boolean):void");
    }

    /* renamed from: g */
    public static void m103774g(long j, long j2, long j3) {
        if (j3 < j2) {
            C115669n.INSTANCE.mo175913w(j, 1, 1);
        } else if (j3 < 2 * j2) {
            C115669n.INSTANCE.mo175913w(j, 2, 1);
        } else if (j3 < 3 * j2) {
            C115669n.INSTANCE.mo175913w(j, 3, 1);
        } else if (j3 < 4 * j2) {
            C115669n.INSTANCE.mo175913w(j, 4, 1);
        } else if (j3 < 5 * j2) {
            C115669n.INSTANCE.mo175913w(j, 5, 1);
        } else if (j3 < 6 * j2) {
            C115669n.INSTANCE.mo175913w(j, 6, 1);
        } else if (j3 < 7 * j2) {
            C115669n.INSTANCE.mo175913w(j, 7, 1);
        } else if (j3 < 8 * j2) {
            C115669n.INSTANCE.mo175913w(j, 8, 1);
        } else if (j3 < 9 * j2) {
            C115669n.INSTANCE.mo175913w(j, 9, 1);
        } else if (j3 < 10 * j2) {
            C115669n.INSTANCE.mo175913w(j, 10, 1);
        } else {
            C115669n.INSTANCE.mo175913w(j, 11, 1);
        }
    }

    /* renamed from: h */
    public static void m103775h(AppBrandRuntimeWC appBrandRuntimeWC) {
        Log.m105925i("MicroMsg.AppBrandQualitySystem", "[QualitySystem] startSession appId = [%s] runtime.hashCode = [%d]", appBrandRuntimeWC.f238147j, Integer.valueOf(appBrandRuntimeWC.hashCode()));
        QualitySession qualitySession = appBrandRuntimeWC.mo113210l1().f239379j1;
        if (qualitySession == null) {
            Log.m105920e("MicroMsg.AppBrandQualitySystem", "startSession with NULL qualityReportSession in InitConfig");
            qualitySession = new QualitySession(C84788u.m104467a(appBrandRuntimeWC.mo113210l1().f234818T), appBrandRuntimeWC.mo113210l1(), appBrandRuntimeWC.mo121253n1());
            appBrandRuntimeWC.mo113210l1().f239379j1 = qualitySession;
        }
        Parcel obtain = Parcel.obtain();
        C87412m.m108593f(obtain, "obtain()");
        obtain.setDataPosition(0);
        qualitySession.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        QualitySessionRuntime qualitySessionRuntime = new QualitySessionRuntime(obtain);
        obtain.recycle();
        qualitySessionRuntime.f245854o = appBrandRuntimeWC;
        qualitySessionRuntime.f245865z = appBrandRuntimeWC.mo121254q1();
        qualitySessionRuntime.f245856q = System.currentTimeMillis();
        qualitySessionRuntime.f245855p = appBrandRuntimeWC.mo113210l1().f234800D;
        qualitySessionRuntime.f245844E = appBrandRuntimeWC.mo113210l1().f234832a1;
        C84180a aVar = f245914c;
        String str = qualitySessionRuntime.f245832d;
        aVar.getClass();
        C87412m.m108594g(str, "instanceId");
        WeAppQualityFlagsStruct weAppQualityFlagsStruct = new WeAppQualityFlagsStruct();
        weAppQualityFlagsStruct.f236840e = weAppQualityFlagsStruct.mo86045b("flags", C84180a.f245866a.mo116874a(), true);
        weAppQualityFlagsStruct.f236839d = weAppQualityFlagsStruct.mo86045b("instanceId", str, true);
        Log.m105918d("MicroMsg.AppBrandQualityFlagsReport", "reportFlags: instanceId=" + str + ",flags=" + weAppQualityFlagsStruct.f236840e);
        weAppQualityFlagsStruct.mo86054n();
        ((C119157j) C119157j.f356862d).mo183875f(new C84189c(qualitySessionRuntime));
        if (1 == appBrandRuntimeWC.mo113210l1().f234835p) {
            qualitySessionRuntime.f245846G = 2;
        } else {
            qualitySessionRuntime.f245846G = appBrandRuntimeWC.mo113210l1().f239377h1 ? 0 : 1;
        }
        HashMap<String, QualitySessionRuntime> hashMap = f245913b;
        synchronized (hashMap) {
            hashMap.put(qualitySessionRuntime.f245833e, qualitySessionRuntime);
        }
        appBrandRuntimeWC.f238109G.add(new b$$a(appBrandRuntimeWC));
    }
}
