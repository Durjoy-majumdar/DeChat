package com.tencent.p014mm.app;

import com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner;
import com.tencent.matrix.trace.tracer.SignalAnrTracer;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tav.coremedia.TimeUtil;
import java.util.Arrays;
import java.util.Map;
import kj2.C117407d;
import p761yd.C91440a;

/* renamed from: com.tencent.mm.app.n0 */
public class C80607n0 implements SignalAnrTracer.C80545c {
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0399 A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0313 A[SYNTHETIC, Splitter:B:80:0x0313] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x037b A[Catch:{ all -> 0x040a }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo112348a(java.lang.String r66, java.lang.String r67, long r68, boolean r70, java.lang.String r71) {
        /*
            r65 = this;
            r1 = r66
            r2 = r71
            java.lang.String r3 = "MicroMsg.MMCrashReporter"
            com.tencent.p014mm.app.C80600i0.m98219a(r66)
            com.tencent.p014mm.app.C80600i0.f235795n = r68
            com.tencent.p014mm.app.C80600i0.f235794m = r67
            com.tencent.p014mm.app.C80600i0.f235796o = r70
            kj2.d r4 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x001c }
            r5 = 1356(0x54c, double:6.7E-321)
            r7 = 60
            r9 = 1
            r11 = 1
            r4.idkeyStat(r5, r7, r9, r11)     // Catch:{ all -> 0x001c }
            goto L_0x0021
        L_0x001c:
            java.lang.String r0 = "ANR report PERFORMANCE_ANR_IDKEY_START_KEY failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
        L_0x0021:
            java.lang.String r4 = ""
            yd.a r0 = p761yd.C91440a.INSTANCE
            boolean r5 = r0.mo125375b()
            r7 = 0
            if (r5 != 0) goto L_0x0035
            com.tencent.mm.app.AppForegroundDelegate r5 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
            boolean r5 = r5.f343454n
            if (r5 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r5 = 0
            goto L_0x0036
        L_0x0035:
            r5 = 1
        L_0x0036:
            com.tencent.mm.app.AppForegroundDelegate r8 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
            java.lang.String r8 = r8.mo174210c()
            java.lang.String r8 = r0.mo125374a()     // Catch:{ Exception -> 0x0041 }
            goto L_0x005b
        L_0x0041:
            r0 = move-exception
            r9 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = "get scene from Matrix failed , e : "
            r0.append(r10)
            java.lang.String r9 = r9.getMessage()
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
        L_0x005b:
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            r10 = 2
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask     // Catch:{ all -> 0x007c }
            com.tencent.mm.app.i0$$d r12 = new com.tencent.mm.app.i0$$d     // Catch:{ all -> 0x007c }
            r12.<init>()     // Catch:{ all -> 0x007c }
            r0.<init>(r12)     // Catch:{ all -> 0x007c }
            zt3.t r12 = zt3.C119157j.f356862d     // Catch:{ all -> 0x007c }
            zt3.j r12 = (zt3.C119157j) r12     // Catch:{ all -> 0x007c }
            r12.mo183875f(r0)     // Catch:{ all -> 0x007c }
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x007c }
            java.lang.Object r0 = r0.get(r10, r12)     // Catch:{ all -> 0x007c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x007c }
            r12 = r0
            goto L_0x0085
        L_0x007c:
            r0 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[r7]
            java.lang.String r13 = "get memory failed"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r13, r12)
            r12 = r4
        L_0x0085:
            java.lang.String r0 = android.os.Build.FINGERPRINT
            long r13 = java.lang.System.currentTimeMillis()
            r15 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 / r15
            java.lang.String r15 = "yyyy-MM-dd HH:mm:ss"
            java.lang.String r13 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85111d(r15, r13)
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION
            java.lang.String r10 = com.tencent.p014mm.sdk.crash.CrashReportFactory.recentlyDbPoolBusyRunningSql
            long r16 = com.tencent.p014mm.sdk.crash.CrashReportFactory.heavyUserFlag
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r6 = "cgroup = "
            r11.append(r6)
            r11.append(r2)
            java.lang.String r6 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
            r6 = 2
            java.lang.Object[] r11 = new java.lang.Object[r6]
            java.lang.Long r18 = java.lang.Long.valueOf(r16)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r7)
            r11[r7] = r18
            r18 = 1
            r11[r18] = r10
            java.lang.String r6 = "reportSignalAnrReal, heavyUserflag = %d, dbPoolBusyRunningSql = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r11)
            r6 = 44
            r11 = 32
            java.lang.String r10 = r10.replace(r6, r11)
            java.lang.String r0 = r0.replace(r6, r11)     // Catch:{ all -> 0x00d6 }
            r6 = r0
            goto L_0x00f1
        L_0x00d6:
            r0 = move-exception
            r6 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r11 = "fingerprint replace error : "
            r0.append(r11)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            r6 = r4
        L_0x00f1:
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask
            com.tencent.mm.app.i0$$e r11 = new com.tencent.mm.app.i0$$e
            r11.<init>()
            r0.<init>(r11)
            zt3.t r11 = zt3.C119157j.f356862d     // Catch:{ all -> 0x0111 }
            zt3.j r11 = (zt3.C119157j) r11     // Catch:{ all -> 0x0111 }
            r11.mo183875f(r0)     // Catch:{ all -> 0x0111 }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0111 }
            r21 = r8
            r7 = 2
            java.lang.Object r0 = r0.get(r7, r11)     // Catch:{ all -> 0x010f }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x010f }
            goto L_0x013d
        L_0x010f:
            r0 = move-exception
            goto L_0x0114
        L_0x0111:
            r0 = move-exception
            r21 = r8
        L_0x0114:
            java.lang.String r22 = ""
            java.lang.String r23 = ""
            java.lang.String r24 = ""
            java.lang.String r25 = ""
            java.lang.String r26 = ""
            java.lang.String r27 = ""
            java.lang.String[] r7 = new java.lang.String[]{r22, r23, r24, r25, r26, r27}
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "get sideInfo timeout, t = "
            r8.append(r11)
            java.lang.String r0 = r0.getMessage()
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            r0 = r7
        L_0x013d:
            if (r70 != 0) goto L_0x01b8
            java.lang.String r7 = "background"
            boolean r7 = r2.contains(r7)
            java.lang.String r8 = "bg"
            boolean r8 = r2.contains(r8)
            java.lang.String r11 = "top"
            boolean r11 = r2.contains(r11)
            if (r7 != 0) goto L_0x016c
            if (r8 != 0) goto L_0x016c
            if (r11 != 0) goto L_0x016c
            java.lang.String r7 = "foreground"
            boolean r7 = r2.contains(r7)
            if (r7 != 0) goto L_0x016c
            java.lang.String r7 = "fg"
            boolean r7 = r2.contains(r7)
            if (r7 == 0) goto L_0x0169
            goto L_0x016c
        L_0x0169:
            boolean r7 = com.tencent.p014mm.app.AppForegroundDelegate.f343443w
            goto L_0x01b2
        L_0x016c:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r7 != 0) goto L_0x0186
            boolean r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isToolsProcess()
            if (r7 != 0) goto L_0x0186
            boolean r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isAppBrandProcess()
            if (r7 == 0) goto L_0x017f
            goto L_0x0186
        L_0x017f:
            java.lang.String r7 = "isSilentAnrJudgeByCgroup NO UI Process"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            r7 = 1
            goto L_0x01b4
        L_0x0186:
            java.lang.String r7 = "isSilentAnrJudgeByCgroup UI Process"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            if (r11 == 0) goto L_0x018f
            r7 = 0
            goto L_0x01b4
        L_0x018f:
            java.util.List r7 = com.tencent.p014mm.app.C80617t0.m98256e()
            java.util.Iterator r7 = r7.iterator()
        L_0x0197:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01b1
            java.lang.Object r8 = r7.next()
            android.view.View r8 = (android.view.View) r8
            java.lang.String r8 = r8.toString()
            java.lang.String r11 = "com.tencent.mm.plugin.ball.view"
            boolean r8 = r8.contains(r11)
            if (r8 == 0) goto L_0x0197
            r7 = 1
            goto L_0x01b2
        L_0x01b1:
            r7 = 0
        L_0x01b2:
            r8 = 1
            r7 = r7 ^ r8
        L_0x01b4:
            if (r7 == 0) goto L_0x01b8
            r7 = 1
            goto L_0x01b9
        L_0x01b8:
            r7 = 0
        L_0x01b9:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            java.lang.String r2 = " ; "
            r8.append(r2)
            int r2 = android.os.Process.myPid()
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            kj2.d r8 = kj2.C117407d.INSTANCE
            r23 = 1356(0x54c, double:6.7E-321)
            r25 = 61
            r27 = 1
            r29 = 1
            r22 = r8
            r22.idkeyStat(r23, r25, r27, r29)
            r11 = 25
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r20 = 0
            r11[r20] = r1
            r22 = 1
            r11[r22] = r21
            r22 = 10
            java.lang.Integer r23 = java.lang.Integer.valueOf(r22)
            r18 = 2
            r11[r18] = r23
            java.lang.Integer r23 = java.lang.Integer.valueOf(r5)
            r24 = 3
            r11[r24] = r23
            r23 = 4
            r11[r23] = r9
            r25 = r3
            r3 = 5
            r11[r3] = r13
            r13 = 6
            r11[r13] = r14
            java.lang.String r14 = com.tencent.p014mm.app.C80600i0.f235794m
            r13 = 7
            r11[r13] = r14
            r14 = 8
            long r26 = com.tencent.p014mm.app.C80600i0.f235795n
            java.lang.Long r26 = java.lang.Long.valueOf(r26)
            r11[r14] = r26
            r14 = 9
            boolean r26 = com.tencent.p014mm.app.C80600i0.f235796o
            java.lang.Integer r26 = java.lang.Integer.valueOf(r26)
            r11[r14] = r26
            r11[r22] = r19
            r14 = 11
            java.lang.Long r16 = java.lang.Long.valueOf(r16)
            r11[r14] = r16
            r14 = 12
            r11[r14] = r15
            r14 = 13
            r11[r14] = r10
            r10 = 14
            r14 = 1
            r15 = r0[r14]
            r11[r10] = r15
            r10 = 15
            r14 = 2
            r15 = r0[r14]
            r11[r10] = r15
            r10 = 16
            r14 = r0[r24]
            r11[r10] = r14
            r10 = 17
            r14 = 0
            r15 = r0[r14]
            r11[r10] = r15
            r10 = 18
            r11[r10] = r6
            r10 = 19
            r11[r10] = r12
            r10 = 20
            r14 = r0[r23]
            r11[r10] = r14
            r10 = 21
            r0 = r0[r3]
            r11[r10] = r0
            r0 = 22
            r11[r0] = r19
            r0 = 23
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11[r0] = r7
            r0 = 24
            r11[r0] = r2
            r0 = 19664(0x4cd0, float:2.7555E-41)
            r8.mo160131h(r0, r11)
            com.tencent.p014mm.app.C80600i0.m98221d()
            com.tencent.p014mm.sdk.crash.CrashReportFactory.recentlyDbPoolBusyRunningSql = r4
            com.tencent.mm.autogen.events.ANRDetectedEvent r0 = new com.tencent.mm.autogen.events.ANRDetectedEvent
            r0.<init>()
            com.tencent.mm.autogen.events.ANRDetectedEvent$a r2 = r0.f236113d
            r2.f236114a = r1
            r8 = r21
            r2.f236115b = r8
            r2.f236116c = r5
            r2.f236117d = r9
            r2.f236118e = r6
            r2.f236119f = r12
            r0.publish()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread$State r0 = r0.getState()
            java.lang.Object[] r2 = new java.lang.Object[r13]
            r4 = 0
            r2[r4] = r1
            r4 = 1
            r2[r4] = r9
            r6 = 2
            r2[r6] = r8
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r2[r24] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r22)
            r2[r23] = r5
            r2[r3] = r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION
            r5 = 6
            r2[r5] = r0
            java.lang.String r0 = "happens ANR stacktrace : %s, processName :%s , scene : %s, isForeground : %b, type : %d, status: %s, clientVersion : %s"
            r5 = r25
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r2)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r2 = 0
            r0[r2] = r12
            java.lang.String r2 = "ANR MemoryInfo : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r0)
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.app.n0$$a r2 = new com.tencent.mm.app.n0$$a
            r2.<init>()
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183875f(r2)
            if (r70 != 0) goto L_0x02eb
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.app.n0$$b r2 = new com.tencent.mm.app.n0$$b
            r2.<init>()
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183875f(r2)
        L_0x02eb:
            java.lang.String r0 = "MicroMsg.FCM.FcmServiceHelper"
            java.lang.String r2 = "notifyAnr"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r66)
            if (r2 != 0) goto L_0x0328
            java.lang.String r2 = "com.google.android.gms.common.internal.BaseGmsClient"
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L_0x0328
            java.lang.String r2 = "android.os.BinderProxy.transactNative(Native Method)"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x0328
            java.lang.String r1 = "note that fcm anr happened"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            if (r0 == 0) goto L_0x0328
            java.lang.String r1 = android.os.Build.FINGERPRINT     // Catch:{ all -> 0x031d }
            java.lang.String r2 = "utf-8"
            java.lang.String r1 = p206nj.C117627q.m165909b(r1, r2)     // Catch:{ all -> 0x031d }
            goto L_0x0323
        L_0x031d:
            int r1 = qe3.C89625d.f257841g
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L_0x0323:
            java.lang.String r2 = "fcm_last_anr_fg"
            r0.encode((java.lang.String) r2, (java.lang.String) r1)
        L_0x0328:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 == 0) goto L_0x0349
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            if (r0 == 0) goto L_0x0349
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_recovery_r_anr_enable
            r2 = 0
            int r0 = r0.mo58779Qe(r1, r2)
            r1 = 1
            if (r0 != r1) goto L_0x0349
            com.tencent.mm.recoveryv2.l r0 = com.tencent.p014mm.recoveryv2.C85695l.m105842a()
            r0.mo119282c(r3)
        L_0x0349:
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.app.j0 r1 = new com.tencent.mm.app.j0
            r1.<init>()
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183875f(r1)
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x040a }
            long r0 = r0.totalMemory()     // Catch:{ all -> 0x040a }
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x040a }
            long r2 = r2.freeMemory()     // Catch:{ all -> 0x040a }
            long r0 = r0 - r2
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x040a }
            long r2 = r2.maxMemory()     // Catch:{ all -> 0x040a }
            double r6 = (double) r0     // Catch:{ all -> 0x040a }
            double r2 = (double) r2     // Catch:{ all -> 0x040a }
            r8 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r2 = r2 * r8
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0413
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_dump_hprof_when_oom_occurred     // Catch:{ all -> 0x040a }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ all -> 0x040a }
            if (r3 != 0) goto L_0x0392
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_P_ALPHA     // Catch:{ all -> 0x040a }
            if (r3 != 0) goto L_0x0392
            boolean r3 = qe3.C89625d.f257845k     // Catch:{ all -> 0x040a }
            if (r3 != 0) goto L_0x0392
            boolean r3 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()     // Catch:{ all -> 0x040a }
            if (r3 == 0) goto L_0x0390
            goto L_0x0392
        L_0x0390:
            r3 = 0
            goto L_0x0393
        L_0x0392:
            r3 = 1
        L_0x0393:
            boolean r2 = p761yd.C38993b.m41993c(r2, r3)     // Catch:{ all -> 0x040a }
            if (r2 == 0) goto L_0x0413
            java.lang.String r2 = "is ANR and Java Heap over 80%, dump hprof"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)     // Catch:{ all -> 0x040a }
            df.e r2 = p955df.C86266e.f250872e     // Catch:{ all -> 0x040a }
            java.lang.String r3 = "ANR"
            r4 = 1
            java.io.File r2 = r2.mo120674b(r3, r4)     // Catch:{ all -> 0x040a }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ all -> 0x040a }
            r3 = 60
            com.tencent.matrix.resource.MemoryUtil.m98119e(r2, r3)     // Catch:{ all -> 0x040a }
            xe.k$a r2 = p269xe.C91190k.f261451a     // Catch:{ all -> 0x040a }
            xe.k$b r3 = new xe.k$b     // Catch:{ all -> 0x040a }
            r22 = 202(0xca, float:2.83E-43)
            r23 = 0
            r24 = 0
            r25 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = -18
            r63 = 1
            r64 = 0
            r21 = r3
            r26 = r0
            r21.<init>(r22, r23, r24, r25, r26, r28, r30, r32, r33, r34, r35, r36, r37, r38, r40, r42, r44, r45, r46, r47, r48, r49, r50, r51, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64)     // Catch:{ all -> 0x040a }
            r2.mo53491a(r3)     // Catch:{ all -> 0x040a }
            java.lang.String r0 = "hprof dumped when ANR"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)     // Catch:{ all -> 0x040a }
            goto L_0x0413
        L_0x040a:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "dump hprof failed"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r2, r1)
        L_0x0413:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.C80607n0.mo112348a(java.lang.String, java.lang.String, long, boolean, java.lang.String):void");
    }

    /* renamed from: b */
    public void mo112349b(String str, String str2, String str3, Map.Entry<int[], String[]> entry) {
        String str4;
        String[] value = entry.getValue();
        if (value != null) {
            Arrays.sort(value);
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String append : value) {
                sb.append(append);
                sb.append(";");
            }
            sb.setCharAt(sb.length() - 1, ']');
            str4 = sb.toString();
        } else {
            str4 = "";
        }
        int indexOf = str2.indexOf("at ");
        int indexOf2 = str2.indexOf("at ");
        while (true) {
            indexOf++;
            if (indexOf >= str2.length() || (indexOf2 = indexOf2 + 1) >= str3.length()) {
                break;
            }
            int charAt = str2.charAt(indexOf) - str3.charAt(indexOf2);
            if (charAt != 0) {
                if (charAt > 0) {
                    String str5 = str3;
                    str3 = str2;
                    str2 = str5;
                }
            }
        }
        C117407d dVar = C117407d.INSTANCE;
        ProcessUILifecycleOwner.f235399x.getClass();
        dVar.mo160131h(28391, str, str2, str3, str4, ProcessUILifecycleOwner.f235397v, 110, MMApplicationContext.getProcessName());
    }

    /* renamed from: c */
    public void mo112350c(String str) {
        C117407d dVar = C117407d.INSTANCE;
        ProcessUILifecycleOwner.f235399x.getClass();
        dVar.mo160131h(28391, str, "", "", "", ProcessUILifecycleOwner.f235397v, 10, MMApplicationContext.getProcessName());
    }

    /* renamed from: d */
    public void mo112351d(String str, String str2, long j, boolean z) {
        C80600i0.m98219a(str);
        AppForegroundDelegate appForegroundDelegate = AppForegroundDelegate.INSTANCE;
        String c = appForegroundDelegate.mo174210c();
        int i = (C91440a.INSTANCE.mo125375b() || appForegroundDelegate.f343454n) ? 1 : 0;
        C117407d.INSTANCE.mo160131h(19664, str, c, 0, Integer.valueOf(i), MMApplicationContext.getProcessName(), C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, System.currentTimeMillis() / 1000), BuildInfo.REV, str2, Long.valueOf(j), Integer.valueOf(z ? 1 : 0), 1, 0, BuildInfo.CLIENT_VERSION, "", 0, 0, 0, "", "", "", "", "", 0, 1, "");
        C80600i0.m98221d();
    }
}
