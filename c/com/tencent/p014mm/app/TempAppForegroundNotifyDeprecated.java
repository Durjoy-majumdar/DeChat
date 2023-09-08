package com.tencent.p014mm.app;

import a70.C112760b;
import android.app.ActivityManager;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import com.tencent.matrix.lifecycle.C80401d;
import com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.autogen.events.ActivateEvent;
import com.tencent.p014mm.autogen.events.ActiveStatusChangedForDataReportEvent;
import com.tencent.p014mm.autogen.events.AppActiveEvent;
import com.tencent.p014mm.autogen.events.SyncOfflineTokenEvent;
import com.tencent.p014mm.booter.StayTimeReport;
import com.tencent.p014mm.modelavatar.C68099t;
import com.tencent.p014mm.modelsimple.C81013m;
import com.tencent.p014mm.modelstat.C114750t;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager;
import di3.C86312j;
import eb0.C116756s5;
import eb0.C97625j3;
import f40.C86709a0;
import f40.C86718e;
import g62.C75880o;
import h81.C32735h;
import java.util.List;
import oa1.C117731d;
import p235sm.C90229c;
import p504em.C75626b;
import p757xv.C38853w;
import pc0.C100760a0;
import qe3.C89625d;
import qo3.C47883u;
import qo3.C77426q;
import s00.C90110f;
import tc0.C77885p;
import u24.C90599h;
import ud3.C14181a;
import ud3.C90644b;
import ud3.C90645c;
import yb0.C118950a;
import zt3.C119157j;

@Deprecated
/* renamed from: com.tencent.mm.app.TempAppForegroundNotifyDeprecated */
public class TempAppForegroundNotifyDeprecated extends C114668z.C104589a {

    /* renamed from: v */
    public static int f235718v = -1;

    /* renamed from: w */
    public static boolean f235719w;

    /* renamed from: x */
    public static Integer f235720x;

    /* renamed from: d */
    public boolean f235721d = true;

    /* renamed from: e */
    public boolean f235722e = false;

    /* renamed from: f */
    public final ActivityManager f235723f = ((ActivityManager) MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME));

    /* renamed from: g */
    public Handler f235724g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    public final MTimerHandler f235725h = new MTimerHandler(new MTimerHandler.CallBack() {
        public boolean onTimerExpired() {
            Log.m105920e("MicroMsg.TempAppForegroundNotifyDeprecated", "killWAGameTimer onTimerExpired");
            C90229c cVar = (C90229c) C86312j.m106911c(C90229c.class);
            if (cVar == null) {
                return false;
            }
            TempAppForegroundNotifyDeprecated.this.getClass();
            Class cls = C32735h.class;
            int i = Integer.MAX_VALUE;
            try {
                if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_kill_wagame_background_500, 0) == 1) {
                    i = 500000;
                }
                if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_kill_wagame_background_800, 0) == 1) {
                    i = 800000;
                }
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.TempAppForegroundNotifyDeprecated", th, "", new Object[0]);
            }
            Log.m105921e("MicroMsg.TempAppForegroundNotifyDeprecated", "getWAGameKillSize killSize =  %d", Integer.valueOf(i));
            List<C90229c.C90230a> L10 = cVar.L10();
            Log.m105921e("MicroMsg.TempAppForegroundNotifyDeprecated", "appbrand process count = %s", Integer.valueOf(L10.size()));
            for (C90229c.C90230a next : L10) {
                if (!C90599h.m113509b(next.mo124463a(), MMApplicationContext.getMainProcessName())) {
                    Log.m105920e("MicroMsg.TempAppForegroundNotifyDeprecated", "kill WAGame: processName = " + next.mo124463a() + ", process.isProcessAlive = " + next.mo124467e() + ", process.getAllAppId() = " + next.mo124464b());
                    if (next.mo124467e()) {
                        int a = TempAppForegroundNotifyDeprecated.this.mo112262a(next.mo124463a());
                        String obj = next.mo124464b().toString();
                        Log.m105920e("MicroMsg.TempAppForegroundNotifyDeprecated", "kill WAGame: useAs = " + next.mo124465c() + ", graphics pss = " + a + ", killGraphicsPssSize = " + i);
                        if (next.mo124465c() == C90229c.C90232c.WAGAME && a >= i) {
                            next.mo124469u0();
                            C115669n.INSTANCE.mo160131h(19854, "kill WAGame|", 0, "", 0, 0, obj, Integer.valueOf(a), 1);
                            Log.m105920e("MicroMsg.TempAppForegroundNotifyDeprecated", "kill WAGame: kill success !");
                        }
                    }
                }
            }
            return false;
        }
    }, true);

    /* renamed from: i */
    public final MTimerHandler f235726i = new MTimerHandler(new MTimerHandler.CallBack() {
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00c5  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00c7  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00da  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0104  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTimerExpired() {
            /*
                r23 = this;
                r1 = r23
                com.tencent.mm.app.TempAppForegroundNotifyDeprecated r0 = com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.this
                boolean r0 = r0.f235735u
                r2 = 0
                java.lang.String r3 = "MicroMsg.TempAppForegroundNotifyDeprecated"
                if (r0 != 0) goto L_0x0012
                java.lang.String r0 = "timer no working required"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                return r2
            L_0x0012:
                f40.a0 r0 = f40.C86709a0.m107528h()
                f40.g0<j40.b> r0 = r0.f251724a
                boolean r0 = r0.f251792d
                r4 = 1
                if (r0 != 0) goto L_0x0023
                java.lang.String r0 = "Startup doesn't finish, killToolsTimer return."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                return r4
            L_0x0023:
                java.lang.String r0 = "killToolsTimer onTimerExpired"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0039 }
                java.lang.String r5 = "clicfg_tools_and_mp_release_use_delegate"
                java.lang.String r6 = "1"
                java.lang.String r0 = r0.mo182444f(r5, r6, r2, r4)     // Catch:{ Exception -> 0x0039 }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x0039 }
                goto L_0x0047
            L_0x0039:
                r0 = move-exception
                java.lang.String r5 = "get clicfg_tools_and_mp_release_use_delegate error!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
                java.lang.Object[] r5 = new java.lang.Object[r2]
                java.lang.String r6 = ""
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r6, r5)
                r0 = 1
            L_0x0047:
                if (r0 != r4) goto L_0x0056
                com.tencent.mm.app.AppForegroundDelegate r0 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
                boolean r0 = r0.f343454n
                if (r0 == 0) goto L_0x0075
                java.lang.String r0 = "onTimerExpired, AppForeground"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                return r2
            L_0x0056:
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.getTopActivityName(r0)
                if (r0 == 0) goto L_0x0075
                java.lang.String r0 = r0.toLowerCase()
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getSourcePackageName()
                boolean r0 = r0.startsWith(r5)
                if (r0 == 0) goto L_0x0075
                java.lang.String r0 = "onTimerExpired, top activity belongs to mm, skip kill tools"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                return r2
            L_0x0075:
                long r5 = java.lang.System.currentTimeMillis()
                java.lang.Class<com.tencent.mm.plugin.multitask.j> r0 = com.tencent.p014mm.plugin.multitask.C105918j.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                com.tencent.mm.plugin.multitask.j r0 = (com.tencent.p014mm.plugin.multitask.C105918j) r0
                r7 = 2
                java.util.List r0 = r0.mo151025p5(r7)
                if (r0 == 0) goto L_0x00a9
                java.util.Iterator r0 = r0.iterator()
            L_0x008c:
                boolean r8 = r0.hasNext()
                if (r8 == 0) goto L_0x00a9
                java.lang.Object r8 = r0.next()
                com.tencent.mm.plugin.multitask.model.MultiTaskInfo r8 = (com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo) r8
                long r8 = r8.field_createTime
                int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r10 > 0) goto L_0x008c
                long r8 = r5 - r8
                r10 = 1800000(0x1b7740, double:8.89318E-318)
                int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r12 > 0) goto L_0x008c
                r0 = 1
                goto L_0x00aa
            L_0x00a9:
                r0 = 0
            L_0x00aa:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "ToolsProfile.ToolsProcessLocker.isLockedUsedByOtherProcess():"
                r8.append(r9)
                java.util.concurrent.atomic.AtomicInteger r9 = com.tencent.p014mm.app.ToolsProfile.C80582b.f235748a
                int r9 = r9.get()
                if (r9 > 0) goto L_0x00c7
                java.lang.String r9 = "com.tencent.mm:tools"
                boolean r9 = com.tencent.p014mm.app.ToolsProfile.C80582b.m98200a(r9)
                if (r9 == 0) goto L_0x00c5
                goto L_0x00c7
            L_0x00c5:
                r9 = 0
                goto L_0x00c8
            L_0x00c7:
                r9 = 1
            L_0x00c8:
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)
                boolean r8 = com.tencent.p014mm.pluginsdk.model.C44594n1.m49046b()
                java.lang.String r9 = "com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS"
                if (r8 == 0) goto L_0x0104
                com.tencent.mm.app.TempAppForegroundNotifyDeprecated r4 = com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.this
                r4.getClass()
                java.lang.String r5 = "doRecycleMainProcessWebView"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
                com.tencent.p014mm.xwebutil.C86032n.m106476b(r9)
                int r5 = com.tencent.xweb.XWebSdk.getWebViewCount()
                if (r5 != 0) goto L_0x00f9
                java.lang.String r0 = "doRecycleMainProcessWebView, no webview, force kill child process"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                com.tencent.xweb.XWebSdk.forceKillRenderProcess()
                com.tencent.xweb.XWebSdk.forceKillGpuProcess()
                goto L_0x0103
            L_0x00f9:
                android.os.Handler r3 = r4.f235724g
                com.tencent.mm.app.TempAppForegroundNotifyDeprecated$$a r5 = new com.tencent.mm.app.TempAppForegroundNotifyDeprecated$$a
                r5.<init>(r4, r0)
                r3.post(r5)
            L_0x0103:
                return r2
            L_0x0104:
                boolean r8 = p757xv.C38853w.m41953a()
                if (r8 == 0) goto L_0x010d
                if (r0 != 0) goto L_0x011f
                goto L_0x011d
            L_0x010d:
                if (r0 == 0) goto L_0x0117
                com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner r8 = com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE
                boolean r8 = r8.isBackground()
                if (r8 == 0) goto L_0x011f
            L_0x0117:
                boolean r8 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.isToolsAlive()
                if (r8 == 0) goto L_0x011f
            L_0x011d:
                r8 = 1
                goto L_0x0120
            L_0x011f:
                r8 = 0
            L_0x0120:
                if (r8 == 0) goto L_0x01bc
                java.lang.String r0 = "onTimerExpired, kill tools process"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                com.tencent.p014mm.xwebutil.C86032n.m106476b(r9)
                com.tencent.mm.app.TempAppForegroundNotifyDeprecated r0 = com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.this
                int r0 = r0.f235729o
                r8 = 3
                switch(r0) {
                    case 0: goto L_0x0142;
                    case 1: goto L_0x0140;
                    case 2: goto L_0x013e;
                    case 3: goto L_0x013c;
                    case 4: goto L_0x013a;
                    case 5: goto L_0x0138;
                    case 6: goto L_0x0136;
                    default: goto L_0x0133;
                }
            L_0x0133:
                r0 = 8
                goto L_0x0143
            L_0x0136:
                r0 = 7
                goto L_0x0143
            L_0x0138:
                r0 = 6
                goto L_0x0143
            L_0x013a:
                r0 = 5
                goto L_0x0143
            L_0x013c:
                r0 = 4
                goto L_0x0143
            L_0x013e:
                r0 = 3
                goto L_0x0143
            L_0x0140:
                r0 = 2
                goto L_0x0143
            L_0x0142:
                r0 = 1
            L_0x0143:
                com.tencent.mm.plugin.report.service.n r17 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r18 = 1686(0x696, double:8.33E-321)
                r12 = 11
                r20 = 1
                r22 = 0
                r10 = 1686(0x696, double:8.33E-321)
                r14 = 1
                r16 = 0
                r9 = r17
                r9.idkeyStat(r10, r12, r14, r16)
                long r12 = (long) r0
                r10 = r18
                r14 = r20
                r16 = r22
                r9.idkeyStat(r10, r12, r14, r16)
                com.tencent.mm.app.TempAppForegroundNotifyDeprecated r0 = com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.this
                int r9 = r0.f235731q
                int r9 = r9 + r4
                r0.f235731q = r9
                java.lang.Object[] r0 = new java.lang.Object[r8]
                java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
                r0[r2] = r8
                com.tencent.mm.app.TempAppForegroundNotifyDeprecated r8 = com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.this
                long r8 = r8.f235730p
                java.lang.Long r8 = java.lang.Long.valueOf(r8)
                r0[r4] = r8
                com.tencent.mm.app.TempAppForegroundNotifyDeprecated r8 = com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.this
                int r8 = r8.f235729o
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r0[r7] = r8
                java.lang.String r8 = "sameLevelReleaseCnt:%d    lastReleaseTime:%d    level:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r0)
                com.tencent.mm.app.TempAppForegroundNotifyDeprecated r0 = com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.this
                long r8 = r0.f235730p
                long r8 = r5 - r8
                r10 = 2
                long r12 = r0.mo112264c()
                long r12 = r12 * r10
                int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r0 > 0) goto L_0x01b7
                com.tencent.mm.app.TempAppForegroundNotifyDeprecated r0 = com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.this
                int r8 = r0.f235731q
                if (r8 < r7) goto L_0x01b7
                int r7 = r0.f235729o
                int r7 = r7 + r4
                r0.f235729o = r7
                r0.f235731q = r2
                java.lang.Object[] r0 = new java.lang.Object[r4]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
                r0[r2] = r4
                java.lang.String r4 = "level up, now:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r0)
            L_0x01b7:
                com.tencent.mm.app.TempAppForegroundNotifyDeprecated r0 = com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.this
                r0.f235730p = r5
                return r2
            L_0x01bc:
                if (r0 == 0) goto L_0x01ca
                com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r8 = 1686(0x696, double:8.33E-321)
                r10 = 12
                r12 = 1
                r14 = 0
                r7.idkeyStat(r8, r10, r12, r14)
            L_0x01ca:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.C805742.onTimerExpired():boolean");
        }
    }, true);

    /* renamed from: j */
    public final MTimerHandler f235727j = new MTimerHandler(new MTimerHandler.CallBack() {
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c0, code lost:
            r11 = com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.f235720x;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00dd, code lost:
            r11 = com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.f235720x;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTimerExpired() {
            /*
                r14 = this;
                sm.c$c r0 = p235sm.C90229c.C90232c.WASERVICE
                java.lang.Class<lc3.b> r1 = lc3.C10485b.class
                f40.a0 r2 = f40.C86709a0.m107528h()
                f40.g0<j40.b> r2 = r2.f251724a
                boolean r2 = r2.f251792d
                java.lang.String r3 = "MicroMsg.TempAppForegroundNotifyDeprecated"
                r4 = 1
                if (r2 != 0) goto L_0x0017
                java.lang.String r0 = "Startup doesn't finish, killAppBrandTimer return."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                return r4
            L_0x0017:
                java.lang.String r2 = "killAppBrandTimer onTimerExpired"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                java.lang.Class<sm.c> r2 = p235sm.C90229c.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                sm.c r2 = (p235sm.C90229c) r2
                r5 = 0
                if (r2 != 0) goto L_0x0028
                return r5
            L_0x0028:
                java.lang.Integer r6 = com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.f235720x
                if (r6 != 0) goto L_0x0053
                f40.e r6 = f40.C86709a0.m107523b()
                boolean r6 = r6.mo121114l()
                if (r6 == 0) goto L_0x0053
                k40.a r6 = f40.C86709a0.m107533q(r1)
                if (r6 == 0) goto L_0x0053
                k40.a r1 = f40.C86709a0.m107533q(r1)
                lc3.b r1 = (lc3.C10485b) r1
                pj.f r1 = r1.vh0()
                r6 = -1
                java.lang.String r7 = "ClientBenchmarkLevel"
                int r1 = r1.mo107404b(r7, r6)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.f235720x = r1
            L_0x0053:
                java.util.LinkedList r1 = new java.util.LinkedList
                r1.<init>()
                long r6 = java.lang.System.currentTimeMillis()
                java.util.List r2 = r2.L10()
                java.lang.Object[] r8 = new java.lang.Object[r4]
                int r9 = r2.size()
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r8[r5] = r9
                java.lang.String r9 = "appbrand process count = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r8)
                java.util.Iterator r2 = r2.iterator()
            L_0x0075:
                boolean r8 = r2.hasNext()
                r9 = 3
                r10 = 2
                if (r8 == 0) goto L_0x0189
                java.lang.Object r8 = r2.next()
                sm.c$a r8 = (p235sm.C90229c.C90230a) r8
                java.lang.String r11 = r8.mo124463a()
                java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getMainProcessName()
                boolean r11 = u24.C90599h.m113509b(r11, r12)
                if (r11 == 0) goto L_0x0092
                goto L_0x0075
            L_0x0092:
                boolean r11 = r8.mo124467e()
                if (r11 == 0) goto L_0x0132
                java.util.List r11 = r8.mo124466d()
                boolean r11 = r11.isEmpty()
                if (r11 == 0) goto L_0x0132
                java.lang.String r11 = r8.mo124463a()
                java.lang.String r12 = "appbrand1"
                boolean r11 = r11.endsWith(r12)
                if (r11 == 0) goto L_0x00b2
                boolean r11 = com.tencent.p014mm.plugin.magicbrush.C85282s0.f248438c
                if (r11 != 0) goto L_0x0132
            L_0x00b2:
                boolean r11 = p757xv.C38853w.m41953a()
                r12 = 15
                if (r11 == 0) goto L_0x00d7
                sm.c$c r11 = r8.mo124465c()
                if (r11 == r0) goto L_0x00d5
                java.lang.Integer r11 = com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.f235720x
                if (r11 == 0) goto L_0x00d5
                int r11 = r11.intValue()
                if (r11 >= r12) goto L_0x00d5
                java.lang.Integer r11 = com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.f235720x
                int r11 = r11.intValue()
                if (r11 >= 0) goto L_0x00d3
                goto L_0x00d5
            L_0x00d3:
                r11 = 0
                goto L_0x00f8
            L_0x00d5:
                r11 = 1
                goto L_0x00f8
            L_0x00d7:
                sm.c$c r11 = r8.mo124465c()
                if (r11 == r0) goto L_0x00d5
                java.lang.Integer r11 = com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.f235720x
                if (r11 == 0) goto L_0x00d5
                int r11 = r11.intValue()
                if (r11 >= r12) goto L_0x00d5
                java.lang.Integer r11 = com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.f235720x
                int r11 = r11.intValue()
                if (r11 < 0) goto L_0x00d5
                com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner r11 = com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE
                boolean r11 = r11.isBackground()
                if (r11 == 0) goto L_0x00d3
                goto L_0x00d5
            L_0x00f8:
                if (r11 == 0) goto L_0x0119
                sm.c$c r9 = r8.mo124465c()
                r1.add(r9)
                r8.mo124469u0()
                java.lang.Object[] r9 = new java.lang.Object[r10]
                java.lang.String r10 = r8.mo124463a()
                r9[r5] = r10
                sm.c$c r8 = r8.mo124465c()
                r9[r4] = r8
                java.lang.String r8 = "Kill idle appbrand process(%s), used as(%s)"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r9)
                goto L_0x0075
            L_0x0119:
                java.lang.Object[] r9 = new java.lang.Object[r9]
                java.lang.String r11 = r8.mo124463a()
                r9[r5] = r11
                sm.c$c r8 = r8.mo124465c()
                r9[r4] = r8
                java.lang.Integer r8 = com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.f235720x
                r9[r10] = r8
                java.lang.String r8 = "Not kill idle appbrand process(%s), used as(%s), sBenchmarkLevel(%s)"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r9)
                goto L_0x0075
            L_0x0132:
                java.util.List r11 = r8.mo124464b()
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.util.Iterator r11 = r11.iterator()
                boolean r13 = r11.hasNext()
                if (r13 == 0) goto L_0x015a
            L_0x0145:
                java.lang.Object r13 = r11.next()
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                r12.append(r13)
                boolean r13 = r11.hasNext()
                if (r13 == 0) goto L_0x015a
                java.lang.String r13 = ";"
                r12.append(r13)
                goto L_0x0145
            L_0x015a:
                java.lang.String r11 = r12.toString()
                r12 = 4
                java.lang.Object[] r12 = new java.lang.Object[r12]
                java.lang.String r13 = r8.mo124463a()
                r12[r5] = r13
                sm.c$c r13 = r8.mo124465c()
                r12[r4] = r13
                boolean r13 = r8.mo124467e()
                java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
                r12[r10] = r13
                r12[r9] = r11
                java.lang.String r9 = "Not kill appbrand process(%s), used as(%s), alive(%s), allAppId(%s)"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r12)
                boolean r9 = r8.mo124467e()
                if (r9 == 0) goto L_0x0075
                r8.mo124468f()
                goto L_0x0075
            L_0x0189:
                int r0 = r1.size()
                if (r0 <= 0) goto L_0x01e8
                com.tencent.mm.app.TempAppForegroundNotifyDeprecated r0 = com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.this
                int r1 = r0.f235734t
                int r1 = r1 + r4
                r0.f235734t = r1
                java.lang.Object[] r0 = new java.lang.Object[r9]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r5] = r1
                com.tencent.mm.app.TempAppForegroundNotifyDeprecated r1 = com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.this
                long r1 = r1.f235733s
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0[r4] = r1
                com.tencent.mm.app.TempAppForegroundNotifyDeprecated r1 = com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.this
                int r1 = r1.f235732r
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r10] = r1
                java.lang.String r1 = "mLuggageSameLevelReleaseCnt:%d mLuggageLastReleaseTime:%d mLuggageReleaseLevel:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r0)
                com.tencent.mm.app.TempAppForegroundNotifyDeprecated r0 = com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.this
                long r1 = r0.f235733s
                long r1 = r6 - r1
                r8 = 2
                long r11 = r0.mo112263b()
                long r11 = r11 * r8
                int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
                if (r0 > 0) goto L_0x01e3
                com.tencent.mm.app.TempAppForegroundNotifyDeprecated r0 = com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.this
                int r1 = r0.f235734t
                if (r1 < r10) goto L_0x01e3
                int r1 = r0.f235732r
                int r1 = r1 + r4
                r0.f235732r = r1
                r0.f235734t = r5
                java.lang.Object[] r0 = new java.lang.Object[r4]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r5] = r1
                java.lang.String r1 = "level up, now:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r0)
            L_0x01e3:
                com.tencent.mm.app.TempAppForegroundNotifyDeprecated r0 = com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.this
                r0.f235733s = r6
                return r5
            L_0x01e8:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.C805753.onTimerExpired():boolean");
        }
    }, true);

    /* renamed from: n */
    public long f235728n = 30000;

    /* renamed from: o */
    public int f235729o = 0;

    /* renamed from: p */
    public long f235730p = 0;

    /* renamed from: q */
    public int f235731q = 0;

    /* renamed from: r */
    public int f235732r = 0;

    /* renamed from: s */
    public long f235733s = 0;

    /* renamed from: t */
    public int f235734t = 0;

    /* renamed from: u */
    public boolean f235735u = false;

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ab A[ADDED_TO_REGION, RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo112262a(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            java.lang.String r1 = "MicroMsg.TempAppForegroundNotifyDeprecated"
            r2 = 1
            r3 = 0
            r4 = -1
            if (r0 == 0) goto L_0x0011
            java.lang.String r8 = "getPicByProcessName() processName == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)
            goto L_0x0060
        L_0x0011:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0044 }
            java.lang.String r5 = "activity"
            java.lang.Object r0 = r0.getSystemService(r5)     // Catch:{ Exception -> 0x0044 }
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch:{ Exception -> 0x0044 }
            java.util.List r0 = r0.getRunningAppProcesses()     // Catch:{ Exception -> 0x0044 }
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "getPicByProcessName() processes == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)     // Catch:{ Exception -> 0x0044 }
            goto L_0x0060
        L_0x0029:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0044 }
        L_0x002d:
            boolean r5 = r0.hasNext()     // Catch:{ Exception -> 0x0044 }
            if (r5 == 0) goto L_0x0060
            java.lang.Object r5 = r0.next()     // Catch:{ Exception -> 0x0044 }
            android.app.ActivityManager$RunningAppProcessInfo r5 = (android.app.ActivityManager.RunningAppProcessInfo) r5     // Catch:{ Exception -> 0x0044 }
            java.lang.String r6 = r5.processName     // Catch:{ Exception -> 0x0044 }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x0044 }
            if (r6 == 0) goto L_0x002d
            int r8 = r5.pid     // Catch:{ Exception -> 0x0044 }
            goto L_0x0061
        L_0x0044:
            r0 = move-exception
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r3] = r8
            java.lang.Class r8 = r0.getClass()
            java.lang.String r8 = r8.getSimpleName()
            r5[r2] = r8
            r8 = 2
            java.lang.String r0 = r0.getMessage()
            r5[r8] = r0
            java.lang.String r8 = "getPidByProcessName() %s %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r8, r5)
        L_0x0060:
            r8 = -1
        L_0x0061:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "getGraphicsPss: pid = "
            r0.append(r5)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            android.app.ActivityManager r0 = r7.f235723f
            int[] r1 = new int[r2]
            r1[r3] = r8
            android.os.Debug$MemoryInfo[] r8 = r0.getProcessMemoryInfo(r1)
            if (r8 == 0) goto L_0x00ab
            int r0 = r8.length
            if (r0 == r2) goto L_0x0085
            goto L_0x00ab
        L_0x0085:
            r8 = r8[r3]
            if (r8 != 0) goto L_0x008a
            return r4
        L_0x008a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x00ab
            java.util.Map r8 = r8.getMemoryStats()
            java.lang.String r0 = "summary.graphics"
            java.lang.Object r8 = r8.get(r0)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x00ab
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x00a6
            goto L_0x00ab
        L_0x00a6:
            int r8 = java.lang.Integer.parseInt(r8)
            return r8
        L_0x00ab:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.mo112262a(java.lang.String):int");
    }

    /* renamed from: b */
    public final long mo112263b() {
        switch (this.f235732r) {
            case 0:
                return this.f235728n;
            case 1:
                return 30000;
            case 2:
                return 60000;
            case 3:
                return ApkDownloadManager.INTERVAL;
            case 4:
                return 300000;
            case 5:
                return 600000;
            case 6:
                return 1200000;
            default:
                return 1800000;
        }
    }

    /* renamed from: c */
    public final long mo112264c() {
        if (1 != ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_tools_on_background_release, 0) && !C89625d.f257845k) {
            return 1800000;
        }
        switch (this.f235729o) {
            case 0:
                return this.f235728n;
            case 1:
                return 30000;
            case 2:
                return 60000;
            case 3:
                return ApkDownloadManager.INTERVAL;
            case 4:
                return 300000;
            case 5:
                return 600000;
            case 6:
                return 1200000;
            default:
                return 1800000;
        }
    }

    /* renamed from: d */
    public void mo112265d() {
        alive();
        this.f235728n = ((long) C117731d.m166007c().mo182443e("clicfg_tools_mp_background_time_s", 30, true, true)) * 1000;
        if (!C38853w.m41953a()) {
            Log.m105924i("MicroMsg.TempAppForegroundNotifyDeprecated", "Enable deep backgroud process reclaim");
            AppDeepBackgroundOwner.INSTANCE.addLifecycleCallback((C80401d) new C80401d() {
                /* renamed from: a */
                public void mo17850a() {
                    TempAppForegroundNotifyDeprecated.this.f235724g.post(new Runnable() {
                        public void run() {
                            if (AppDeepBackgroundOwner.INSTANCE.isBackground()) {
                                Log.m105924i("MicroMsg.TempAppForegroundNotifyDeprecated", "On deep background.");
                                if (TempAppForegroundNotifyDeprecated.this.f235726i.stopped() || TempAppForegroundNotifyDeprecated.this.f235729o != 0) {
                                    if (!TempAppForegroundNotifyDeprecated.this.f235726i.stopped()) {
                                        TempAppForegroundNotifyDeprecated.this.f235726i.stopTimer();
                                    }
                                    TempAppForegroundNotifyDeprecated tempAppForegroundNotifyDeprecated = TempAppForegroundNotifyDeprecated.this;
                                    tempAppForegroundNotifyDeprecated.f235731q = 0;
                                    tempAppForegroundNotifyDeprecated.f235729o = 0;
                                    Log.m105924i("MicroMsg.TempAppForegroundNotifyDeprecated", "Clear level");
                                    TempAppForegroundNotifyDeprecated.this.mo112267f();
                                }
                                if (TempAppForegroundNotifyDeprecated.this.f235727j.stopped() || TempAppForegroundNotifyDeprecated.this.f235732r != 0) {
                                    TempAppForegroundNotifyDeprecated tempAppForegroundNotifyDeprecated2 = TempAppForegroundNotifyDeprecated.this;
                                    tempAppForegroundNotifyDeprecated2.f235734t = 0;
                                    tempAppForegroundNotifyDeprecated2.f235732r = 0;
                                    Log.m105924i("MicroMsg.TempAppForegroundNotifyDeprecated", "Clear level for APPBRAND process.");
                                    TempAppForegroundNotifyDeprecated.this.mo112266e();
                                }
                            }
                        }
                    });
                }

                /* renamed from: b */
                public void mo17851b() {
                }
            });
        }
    }

    /* renamed from: e */
    public final void mo112266e() {
        boolean z;
        if (!this.f235727j.stopped()) {
            this.f235727j.stopTimer();
        }
        boolean z2 = false;
        if (BuildInfo.IS_ARM64) {
            try {
                if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_appbrand_process_background_reclaim, 0) == 1) {
                    z = true;
                    Log.m105925i("MicroMsg.TempAppForegroundNotifyDeprecated", "Enable appbrand process background reclaim: %s", Boolean.valueOf(z));
                    z2 = z;
                }
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.TempAppForegroundNotifyDeprecated", th, "", new Object[0]);
            }
            z = false;
            Log.m105925i("MicroMsg.TempAppForegroundNotifyDeprecated", "Enable appbrand process background reclaim: %s", Boolean.valueOf(z));
            z2 = z;
        }
        if (z2) {
            this.f235727j.startTimer(mo112263b());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008c, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.getInt(r0, 1) > 0) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00bd, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.getInt(r0, 1) > 0) goto L_0x00bf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e1  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo112267f() {
        /*
            r7 = this;
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r7.f235726i
            boolean r0 = r0.stopped()
            if (r0 != 0) goto L_0x000d
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r7.f235726i
            r0.stopTimer()
        L_0x000d:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
            r1.append(r2)
            java.lang.String r2 = ":tools"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isProcessRunning(r0, r1)
            boolean r1 = com.tencent.p014mm.pluginsdk.model.C44594n1.m49046b()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r4 = 0
            r2[r4] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = "MicroMsg.TempAppForegroundNotifyDeprecated"
            java.lang.String r6 = "before kill tools, tools is running: %b, isWebViewRunInMainProc: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r2)
            if (r0 != 0) goto L_0x004a
            if (r1 == 0) goto L_0x00e9
        L_0x004a:
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "huawei"
            boolean r1 = r0.contains(r1)
            java.lang.String r2 = "1"
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x0064
            java.lang.String r1 = "honor"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x009b
        L_0x0064:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 != r1) goto L_0x009b
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x008f }
            java.lang.String r1 = "clicfg_tools_and_mp_hw_honor_29"
            java.lang.String r0 = r0.mo182444f(r1, r2, r4, r5)     // Catch:{ Exception -> 0x008f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008f }
            r1.<init>()     // Catch:{ Exception -> 0x008f }
            java.lang.String r2 = "get clicfg_tools_and_mp_hw_honor_29 "
            r1.append(r2)     // Catch:{ Exception -> 0x008f }
            r1.append(r0)     // Catch:{ Exception -> 0x008f }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x008f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)     // Catch:{ Exception -> 0x008f }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r5)     // Catch:{ Exception -> 0x008f }
            if (r0 <= 0) goto L_0x00cc
            goto L_0x00bf
        L_0x008f:
            r0 = move-exception
            java.lang.String r1 = "get clicfg_tools_and_mp_hw_honor_29 error!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r6, r1)
            goto L_0x00cc
        L_0x009b:
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r1 = "clicfg_tools_and_mp_bg_proc_release"
            java.lang.String r0 = r0.mo182444f(r1, r2, r4, r5)     // Catch:{ Exception -> 0x00c1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c1 }
            r1.<init>()     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r2 = "get clicfg_tools_and_mp_bg_proc_release "
            r1.append(r2)     // Catch:{ Exception -> 0x00c1 }
            r1.append(r0)     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00c1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)     // Catch:{ Exception -> 0x00c1 }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r5)     // Catch:{ Exception -> 0x00c1 }
            if (r0 <= 0) goto L_0x00cc
        L_0x00bf:
            r0 = 1
            goto L_0x00cd
        L_0x00c1:
            r0 = move-exception
            java.lang.String r1 = "get clicfg_tools_and_mp_bg_proc_release error!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r6, r1)
        L_0x00cc:
            r0 = 0
        L_0x00cd:
            if (r0 == 0) goto L_0x00e1
            java.lang.String r0 = "startToolsProcKillTimer work"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r7.f235726i
            long r1 = r7.mo112264c()
            r0.startTimer(r1)
            r7.f235735u = r5
            goto L_0x00e9
        L_0x00e1:
            java.lang.String r0 = "startToolsProcKillTimer skip"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            r7.f235735u = r4
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.mo112267f():void");
    }

    public Handler getHandler() {
        return this.f235724g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bb A[SYNTHETIC, Splitter:B:30:0x00bb] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAppBackground(java.lang.String r19) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            java.lang.String r3 = ""
            java.lang.String r4 = "MicroMsg.TempAppForegroundNotifyDeprecated"
            boolean r0 = eb0.C97625j3.m125811a()
            if (r0 == 0) goto L_0x022e
            f40.e r0 = f40.C86709a0.m107523b()
            boolean r0 = r0.f251765p
            if (r0 == 0) goto L_0x022e
            boolean r0 = f40.C86718e.m107551r()
            if (r0 != 0) goto L_0x022e
            r5 = 0
            com.tencent.p014mm.modelsimple.C81013m.m98919j1(r5)
            yb0.C118950a.m167707d(r5)
            com.tencent.p014mm.modelstat.C114750t.m161443h(r5)
            java.lang.String r0 = le3.C10499a.m10433b()
            le3.C10499a.m10434c(r0)
            r18.mo112267f()
            r18.mo112266e()
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r1.f235725h
            boolean r0 = r0.stopped()
            if (r0 != 0) goto L_0x0040
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r1.f235725h
            r0.stopTimer()
        L_0x0040:
            r6 = 1
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x0053 }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ all -> 0x0053 }
            h81.h$c r7 = h81.C32735h.C32737c.clicfg_kill_wagame_background_open     // Catch:{ all -> 0x0053 }
            int r0 = r0.mo58779Qe(r7, r5)     // Catch:{ all -> 0x0053 }
            if (r0 != r6) goto L_0x0059
            r0 = 1
            goto L_0x005a
        L_0x0053:
            r0 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r3, r7)
        L_0x0059:
            r0 = 0
        L_0x005a:
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            r7[r5] = r8
            java.lang.String r8 = "whetherEnableKillWAGame enable =  %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r7)
            if (r0 == 0) goto L_0x0072
            r7 = 960000(0xea600, double:4.74303E-318)
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r1.f235725h
            r0.startTimer(r7)
        L_0x0072:
            java.lang.String r0 = "[oneliang][statInputMethod]"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r0)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r7 = 0
            r8 = 327808(0x50080, float:4.59357E-40)
            java.lang.Object r0 = r0.mo119684e(r8, r7)
            if (r0 != 0) goto L_0x008a
            goto L_0x00a9
        L_0x008a:
            java.lang.String r7 = r0.toString()
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x0095
            goto L_0x00a9
        L_0x0095:
            java.lang.String r0 = r0.toString()
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r0)
            long r11 = java.lang.System.currentTimeMillis()
            long r11 = r11 - r9
            r9 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x00ab
        L_0x00a9:
            r0 = 1
            goto L_0x00ac
        L_0x00ab:
            r0 = 0
        L_0x00ac:
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r9 = java.lang.String.valueOf(r0)
            r7[r5] = r9
            java.lang.String r9 = "[oneliang][statInputMethod] needToStat:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r9, r7)
            if (r0 == 0) goto L_0x0123
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x010a }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ Exception -> 0x010a }
            java.lang.String r7 = "default_input_method"
            k20.a r9 = new k20.a     // Catch:{ Exception -> 0x010a }
            r9.<init>()     // Catch:{ Exception -> 0x010a }
            r9.mo10233c(r7)     // Catch:{ Exception -> 0x010a }
            r9.mo10233c(r0)     // Catch:{ Exception -> 0x010a }
            java.lang.Object r10 = new java.lang.Object     // Catch:{ Exception -> 0x010a }
            r10.<init>()     // Catch:{ Exception -> 0x010a }
            java.lang.Object[] r11 = r9.mo10232b()     // Catch:{ Exception -> 0x010a }
            java.lang.String r12 = "com/tencent/mm/app/TempAppForegroundNotifyDeprecated"
            java.lang.String r13 = "inputMethodStat"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/provider/Settings$Secure"
            java.lang.String r16 = "getString"
            java.lang.String r17 = "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;"
            java.lang.Object r0 = j20.C117292a.m165364j(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x010a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x010a }
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x010a }
            r9 = 11375(0x2c6f, float:1.594E-41)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x010a }
            r7.kvStat(r9, r0)     // Catch:{ Exception -> 0x010a }
            eb0.c r0 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x010a }
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()     // Catch:{ Exception -> 0x010a }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x010a }
            java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x010a }
            r0.mo119676J(r8, r7)     // Catch:{ Exception -> 0x010a }
            goto L_0x0123
        L_0x010a:
            r0 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "[oneliang][inputMethodStat]exception:"
            r7.append(r8)
            java.lang.String r0 = r0.getMessage()
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x0123:
            com.tencent.mm.autogen.events.AppActiveEvent r0 = new com.tencent.mm.autogen.events.AppActiveEvent
            r0.<init>()
            com.tencent.mm.autogen.events.AppActiveEvent$a r4 = r0.f78710d
            r4.f78711a = r5
            r0.publish()
            com.tencent.mm.autogen.events.ActivateEvent r0 = new com.tencent.mm.autogen.events.ActivateEvent
            r0.<init>()
            com.tencent.mm.autogen.events.ActivateEvent$a r4 = r0.f78706d
            r4.f78707a = r5
            r0.publish()
            com.tencent.mm.booter.StayTimeReport r0 = com.tencent.p014mm.booter.StayTimeReport.f237543q
            long r7 = r0.f237555l
            r9 = -1
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x0148
        L_0x0145:
            r4 = 0
            goto L_0x0220
        L_0x0148:
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            com.tencent.mm.storage.u1 r4 = r0.f237544a
            r11 = 2
            java.lang.Object r4 = r4.mo119661b(r11, r3)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            long r13 = r0.f237555l
            r12.append(r13)
            java.lang.String r4 = "|"
            r12.append(r4)
            r12.append(r7)
            java.lang.String r4 = "#"
            r12.append(r4)
            java.lang.String r4 = r12.toString()
            com.tencent.mm.storage.u1 r12 = r0.f237544a
            r12.mo119664f(r11, r4)
            com.tencent.mm.storage.u1 r12 = r0.f237544a
            r13 = 3
            int r12 = r12.mo119662c(r13, r5)
            int r12 = r12 + r6
            com.tencent.mm.storage.u1 r14 = r0.f237544a
            r14.mo119666g(r13, r12)
            java.lang.Object[] r14 = new java.lang.Object[r13]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            r14[r5] = r15
            long r9 = r0.f237555l
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r14[r6] = r9
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r14[r11] = r7
            java.lang.String r7 = "MicroMsg.StayTimeReport"
            java.lang.String r8 = "onAppPause,appReportCnt:%d app(%d-%d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r14)
            r8 = -1
            r0.f237555l = r8
            com.tencent.mm.storage.u1 r8 = r0.f237544a
            r9 = 0
            long r8 = r8.mo118846d(r6, r9)
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r8)
            r14 = 3600(0xe10, double:1.7786E-320)
            int r10 = r0.f237557n
            long r5 = (long) r10
            long r5 = r5 * r14
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 > 0) goto L_0x01c2
            int r5 = r0.f237556m
            if (r12 <= r5) goto L_0x01df
        L_0x01c2:
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 13110(0x3336, float:1.8371E-41)
            r5.kvStat(r6, r4)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r5 = 0
            r6[r5] = r4
            java.lang.String r4 = "report appStayTime:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r4, r6)
            com.tencent.mm.storage.u1 r4 = r0.f237544a
            r4.mo119664f(r11, r3)
            com.tencent.mm.storage.u1 r3 = r0.f237544a
            r3.mo119666g(r13, r5)
        L_0x01df:
            com.tencent.mm.booter.StayTimeReport$b r3 = r0.f237548e
            if (r3 != 0) goto L_0x01e5
            goto L_0x0145
        L_0x01e5:
            long r4 = r3.f237563c
            long r8 = r0.f237552i
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r8)
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 / r10
            long r4 = r4 + r8
            r3.f237563c = r4
            if (r2 == 0) goto L_0x020d
            java.lang.String r3 = "WebViewUI"
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L_0x020d
            com.tencent.mm.booter.StayTimeReport$b r3 = r0.f237548e
            int r4 = r3.f237568h
            long r4 = (long) r4
            long r8 = r0.f237553j
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r8)
            long r8 = r8 / r10
            long r4 = r4 + r8
            int r5 = (int) r4
            r3.f237568h = r5
        L_0x020d:
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.mm.booter.StayTimeReport$b r0 = r0.f237548e
            long r4 = r0.f237563c
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r4 = 0
            r3[r4] = r0
            java.lang.String r0 = "onAppPause, chatting:totalTime:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r3)
        L_0x0220:
            com.tencent.mm.autogen.events.ActiveStatusChangedForDataReportEvent r0 = new com.tencent.mm.autogen.events.ActiveStatusChangedForDataReportEvent
            r0.<init>()
            com.tencent.mm.autogen.events.ActiveStatusChangedForDataReportEvent$a r3 = r0.f236120d
            r3.f236121a = r4
            r3.f236122b = r2
            r0.publish()
        L_0x022e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated.onAppBackground(java.lang.String):void");
    }

    public void onAppForeground(final String str) {
        final long uptimeMillis = SystemClock.uptimeMillis();
        if (!this.f235725h.stopped()) {
            this.f235725h.stopTimer();
        }
        if (!this.f235726i.stopped()) {
            this.f235726i.stopTimer();
        }
        if (!this.f235727j.stopped()) {
            this.f235727j.stopTimer();
        }
        if (System.currentTimeMillis() - this.f235730p > 3600000) {
            this.f235731q = 0;
            this.f235729o = 0;
            Log.m105924i("MicroMsg.TempAppForegroundNotifyDeprecated", "Clear level");
        }
        if (System.currentTimeMillis() - this.f235733s > 3600000) {
            this.f235734t = 0;
            this.f235732r = 0;
            Log.m105924i("MicroMsg.TempAppForegroundNotifyDeprecated", "Clear level for APPBRAND process.");
        }
        if (C97625j3.m125811a() && C86709a0.m107523b().f251765p && !C86718e.m107551r()) {
            ((C119157j) C119157j.f356862d).mo183876g(new Runnable() {
                public void run() {
                    boolean z;
                    if (!((C75626b) C86312j.m106911c(C75626b.class)).mo58021Xy()) {
                        ((C90110f) C86312j.m106911c(C90110f.class)).mo124152cj();
                    }
                    C81013m.m98919j1(true);
                    C118950a.m167707d(true);
                    C100760a0.m131932b(C100760a0.C100763e.TEXT).mo140195a().mo123694a();
                    ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q((C75880o) null);
                    C114750t.m161443h(true);
                    SyncOfflineTokenEvent syncOfflineTokenEvent = new SyncOfflineTokenEvent();
                    SyncOfflineTokenEvent.C28838a aVar = syncOfflineTokenEvent.f79021d;
                    aVar.f79022a = true;
                    aVar.f79023b = 1;
                    syncOfflineTokenEvent.publish();
                    C68099t.f195741b = 0;
                    C68099t.f195742c.stopTimer();
                    C116756s5.m164691d().mo180727a(19, 1);
                    AppActiveEvent appActiveEvent = new AppActiveEvent();
                    appActiveEvent.f78710d.f78711a = true;
                    appActiveEvent.publish();
                    ActivateEvent activateEvent = new ActivateEvent();
                    activateEvent.f78706d.f78707a = true;
                    activateEvent.publish();
                    StayTimeReport stayTimeReport = StayTimeReport.f237543q;
                    String str = str;
                    if (stayTimeReport.f237555l == -1) {
                        if (stayTimeReport.f237544a.mo119662c(3, 0) == 0) {
                            stayTimeReport.f237544a.mo119667h(1, Util.nowSecond());
                        }
                        stayTimeReport.f237555l = Util.nowSecond();
                        Object[] objArr = new Object[2];
                        StayTimeReport.C80808b bVar = stayTimeReport.f237548e;
                        objArr[0] = bVar == null ? "null" : bVar.f237561a;
                        objArr[1] = str;
                        Log.m105925i("MicroMsg.StayTimeReport", "onAppResume chatUser:%s, class:%s", objArr);
                        if (stayTimeReport.f237548e != null) {
                            stayTimeReport.f237552i = Util.currentTicks();
                            if (str != null && str.contains("WebViewUI")) {
                                stayTimeReport.f237553j = Util.currentTicks();
                            }
                        }
                    }
                    ActiveStatusChangedForDataReportEvent activeStatusChangedForDataReportEvent = new ActiveStatusChangedForDataReportEvent();
                    ActiveStatusChangedForDataReportEvent.C80698a aVar2 = activeStatusChangedForDataReportEvent.f236120d;
                    aVar2.f236121a = true;
                    aVar2.f236122b = str;
                    activeStatusChangedForDataReportEvent.publish();
                    try {
                        if (!TempAppForegroundNotifyDeprecated.f235719w) {
                            TempAppForegroundNotifyDeprecated.f235719w = true;
                            TempAppForegroundNotifyDeprecated tempAppForegroundNotifyDeprecated = TempAppForegroundNotifyDeprecated.this;
                            if (tempAppForegroundNotifyDeprecated.f235721d) {
                                C14181a.m13515a();
                                C86709a0.m107528h();
                                if (!C86709a0.m107535s().mo121147n()) {
                                    z = true;
                                } else {
                                    z = C90645c.m113611a(C112760b.m154195C());
                                    C86709a0.m107525e().postToWorker(new C90644b());
                                }
                                if (!z) {
                                    if (!TempAppForegroundNotifyDeprecated.this.f235722e) {
                                        int i = TempAppForegroundNotifyDeprecated.f235718v + 1;
                                        TempAppForegroundNotifyDeprecated.f235718v = i;
                                        Log.m105925i("MicroMsg.TempAppForegroundNotifyDeprecated", "tipCountAboutSdcardDisable:%d", Integer.valueOf(i));
                                        int i2 = TempAppForegroundNotifyDeprecated.f235718v;
                                        if (i2 <= 0) {
                                            TempAppForegroundNotifyDeprecated.f235719w = false;
                                            Log.m105925i("MicroMsg.TempAppForegroundNotifyDeprecated", "[onAppForeground] cost:%s", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                                            return;
                                        }
                                        TempAppForegroundNotifyDeprecated.this.f235722e = true;
                                        if (i2 == 1) {
                                            C115669n.INSTANCE.mo175911u(951, 0);
                                            SharedPreferences.Editor edit = MMApplicationContext.getContext().getSharedPreferences("sdcard_usable_report", 4).edit();
                                            edit.putInt("mm_process_pid", Process.myPid());
                                            edit.apply();
                                        } else if (i2 == 3) {
                                            C115669n.INSTANCE.mo175911u(951, 1);
                                        } else if (i2 == 5) {
                                            C115669n.INSTANCE.mo175911u(951, 2);
                                        } else if (i2 == 10) {
                                            C115669n.INSTANCE.mo175911u(951, 3);
                                        }
                                        TempAppForegroundNotifyDeprecated.this.f235724g.post(new Runnable() {
                                            public void run() {
                                                C77426q qVar = new C77426q(MMApplicationContext.getContext());
                                                qVar.mo107595g(MMApplicationContext.getContext().getString(C0966R.string.ify));
                                                qVar.mo107606r(MMApplicationContext.getContext().getString(C0966R.string.a3h));
                                                qVar.mo107589a(false);
                                                qVar.mo107600l(new C47883u() {
                                                    /* renamed from: a */
                                                    public void mo353a(boolean z, String str) {
                                                        TempAppForegroundNotifyDeprecated tempAppForegroundNotifyDeprecated = TempAppForegroundNotifyDeprecated.this;
                                                        tempAppForegroundNotifyDeprecated.f235721d = false;
                                                        tempAppForegroundNotifyDeprecated.f235722e = false;
                                                    }
                                                });
                                                qVar.mo107603o();
                                            }
                                        });
                                        TempAppForegroundNotifyDeprecated.f235719w = false;
                                        Log.m105925i("MicroMsg.TempAppForegroundNotifyDeprecated", "[onAppForeground] cost:%s", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                                        return;
                                    }
                                }
                                Log.m105925i("MicroMsg.TempAppForegroundNotifyDeprecated", "SdcardUsableDetectionEvent pass tipCountAboutSdcardDisable=%s ifSdcardDialogShow=%s", Integer.valueOf(TempAppForegroundNotifyDeprecated.f235718v), Boolean.valueOf(TempAppForegroundNotifyDeprecated.this.f235722e));
                                TempAppForegroundNotifyDeprecated.f235718v = -1;
                                if (TempAppForegroundNotifyDeprecated.this.f235722e) {
                                    TempAppForegroundNotifyDeprecated.f235719w = false;
                                    Log.m105925i("MicroMsg.TempAppForegroundNotifyDeprecated", "[onAppForeground] cost:%s", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                                    return;
                                }
                                SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("sdcard_usable_report", 4);
                                int i3 = sharedPreferences.getInt("mm_process_pid", -1);
                                int myPid = Process.myPid();
                                Log.m105925i("MicroMsg.TempAppForegroundNotifyDeprecated", "SdcardUsableDetectionEvent pass mmPid=%s mmCurPid=%s", Integer.valueOf(i3), Integer.valueOf(myPid));
                                if (Util.isEqual(i3, -1)) {
                                    TempAppForegroundNotifyDeprecated.f235719w = false;
                                    Log.m105925i("MicroMsg.TempAppForegroundNotifyDeprecated", "[onAppForeground] cost:%s", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                                    return;
                                }
                                if (Util.isEqual(i3, myPid)) {
                                    C115669n.INSTANCE.mo175911u(951, 22);
                                } else if (!Util.isEqual(i3, myPid)) {
                                    C115669n.INSTANCE.mo175911u(951, 21);
                                }
                                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                edit2.putInt("mm_process_pid", -1);
                                edit2.apply();
                                TempAppForegroundNotifyDeprecated.f235719w = false;
                                Log.m105925i("MicroMsg.TempAppForegroundNotifyDeprecated", "[onAppForeground] cost:%s", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                                return;
                            }
                            tempAppForegroundNotifyDeprecated.f235721d = true;
                            TempAppForegroundNotifyDeprecated.f235719w = false;
                            Log.m105925i("MicroMsg.TempAppForegroundNotifyDeprecated", "[onAppForeground] cost:%s", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                        }
                    } catch (Throwable th) {
                        Log.m105921e("MicroMsg.TempAppForegroundNotifyDeprecated", "check sdcard failed, message = %s", th.getMessage());
                    } finally {
                        TempAppForegroundNotifyDeprecated.f235719w = false;
                        Log.m105925i("MicroMsg.TempAppForegroundNotifyDeprecated", "[onAppForeground] cost:%s", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                    }
                }
            }, "onAppForegroundThread");
        }
    }
}
