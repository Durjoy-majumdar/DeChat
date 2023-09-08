package com.tencent.p014mm.plugin.appbrand.app;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ExptChangeEvent;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80924w;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPreLoadingUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPreLoadingUI1;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPreLoadingUI2;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPreLoadingUI3;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPreLoadingUI4;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import p1042u.C90590d;
import p235sm.C90236m0;
import p385u2.C111105a;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64186f0;
import sx3.C90364q0;
import z04.C112551y;
import zt3.C119157j;

@C86522b(creator = C29099b0.class, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.app.z */
public final class C81194z extends C86301e implements C90236m0 {

    /* renamed from: d */
    public static final C81194z f238510d = new C81194z();

    /* renamed from: e */
    public static long f238511e = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: f */
    public static boolean f238512f = true;

    /* renamed from: g */
    public static boolean f238513g = true;

    /* renamed from: h */
    public static boolean f238514h = true;

    /* renamed from: i */
    public static boolean f238515i = true;

    /* renamed from: j */
    public static boolean f238516j = true;

    /* renamed from: n */
    public static boolean f238517n = true;

    /* renamed from: o */
    public static final AtomicBoolean f238518o = new AtomicBoolean(false);

    /* renamed from: p */
    public static final AtomicBoolean f238519p = new AtomicBoolean(false);

    /* renamed from: q */
    public static long f238520q;

    /* renamed from: r */
    public static final C90590d<Integer> f238521r = new C90590d<>();

    /* renamed from: s */
    public static final C80924w f238522s = C81205j.f238543a;

    /* renamed from: com.tencent.mm.plugin.appbrand.app.z$c */
    public static final class C29175c extends IStaticListener<ExptChangeEvent> {
        public boolean callback(IEvent iEvent) {
            C87412m.m108594g((ExptChangeEvent) iEvent, "event");
            C81194z.f238510d.yx0();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.z$a */
    public static final class C81195a {

        /* renamed from: a */
        public static final C81195a f238523a = new C81195a();

        /* renamed from: a */
        public final boolean mo113364a(ActivityManager.AppTask appTask) {
            Intent intent;
            ComponentName component;
            C87412m.m108594g(appTask, "appTask");
            ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
            if (!(taskInfo == null || (intent = taskInfo.baseIntent) == null || C87412m.m108589b(intent.getAction(), "android.intent.action.MAIN"))) {
                Set<String> categories = intent.getCategories();
                if ((categories != null && categories.contains("android.intent.category.LAUNCHER")) || (component = intent.getComponent()) == null) {
                    return false;
                }
                String className = component.getClassName();
                C87412m.m108593f(className, "cmp.className");
                if (C112551y.m153819s(className, AppBrandUI.class.getName(), false)) {
                    return true;
                }
                if (C81194z.f238516j) {
                    String className2 = component.getClassName();
                    C87412m.m108593f(className2, "cmp.className");
                    if (C112551y.m153819s(className2, AppBrandPreLoadingUI.class.getName(), false)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.z$b */
    public enum C81196b {
        APP_FOREGROUND(21),
        FIRST_SCREEN(25),
        PULLDOWN_TASK_BAR(22),
        APPBRAND_LAUNCHER(23),
        APPBRAND_BINDER_DIED(24),
        SCAN_WEAPP_QRCODE(26),
        BEFORE_START_APPBRAND_UI(27);
        

        /* renamed from: d */
        public final int f238532d;

        /* access modifiers changed from: public */
        C81196b(int i) {
            this.f238532d = i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.z$d */
    public interface C81197d {

        /* renamed from: a */
        public static final C81198a f238533a = C81198a.f238534a;

        /* renamed from: com.tencent.mm.plugin.appbrand.app.z$d$a */
        public static final class C81198a {

            /* renamed from: a */
            public static final /* synthetic */ C81198a f238534a = new C81198a();

            /* renamed from: b */
            public static final C13601g<C81146a0> f238535b = C36568h.m40985a(C81199a.f238536d);

            /* renamed from: com.tencent.mm.plugin.appbrand.app.z$d$a$a */
            public static final class C81199a extends C87413o implements C32224a<C81146a0> {

                /* renamed from: d */
                public static final C81199a f238536d = new C81199a();

                public C81199a() {
                    super(0);
                }

                public Object invoke() {
                    return new C81146a0();
                }
            }
        }

        /* renamed from: a */
        boolean mo113336a(ActivityManager.AppTask appTask);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.z$e */
    public static final class C81200e implements C81197d {

        /* renamed from: b */
        public static final C81200e f238537b = new C81200e();

        /* renamed from: a */
        public boolean mo113336a(ActivityManager.AppTask appTask) {
            C87412m.m108594g(appTask, "appTask");
            ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
            return taskInfo != null && taskInfo.numActivities <= 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.z$f */
    public static final class C81201f implements C81197d {

        /* renamed from: b */
        public static final C81201f f238538b = new C81201f();

        /* renamed from: a */
        public boolean mo113336a(ActivityManager.AppTask appTask) {
            C87412m.m108594g(appTask, "appTask");
            ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
            return taskInfo != null && !taskInfo.isRunning;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.z$g */
    public static final class C81202g implements C81197d {

        /* renamed from: b */
        public static final C81202g f238539b = new C81202g();

        /* renamed from: a */
        public boolean mo113336a(ActivityManager.AppTask appTask) {
            C87412m.m108594g(appTask, "appTask");
            ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
            return taskInfo != null && taskInfo.id == -1;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.z$h */
    public static final class C81203h implements C81197d {

        /* renamed from: b */
        public static final C81203h f238540b = new C81203h();

        /* renamed from: a */
        public boolean mo113336a(ActivityManager.AppTask appTask) {
            C87412m.m108594g(appTask, "appTask");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.z$i */
    public static final class C81204i implements C81197d {

        /* renamed from: b */
        public static final C81204i f238541b = new C81204i();

        /* renamed from: c */
        public static final Map<String, String> f238542c = C90364q0.m113147f(new C13604l(AppBrandPreLoadingUI.class.getName(), ":appbrand0"), new C13604l(AppBrandPreLoadingUI1.class.getName(), ":appbrand1"), new C13604l(AppBrandPreLoadingUI2.class.getName(), ":appbrand2"), new C13604l(AppBrandPreLoadingUI3.class.getName(), ":appbrand3"), new C13604l(AppBrandPreLoadingUI4.class.getName(), ":appbrand4"));

        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0120, code lost:
            r10 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0121, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.AppBrandZombieTaskKiller", "ZombieTaskPredicateForDeadProcess.isZombieTask get exception " + r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x0137, code lost:
            return false;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo113336a(android.app.ActivityManager.AppTask r10) {
            /*
                r9 = this;
                java.lang.String r0 = "appTask"
                gy3.C87412m.m108594g(r10, r0)
                boolean r0 = com.tencent.p014mm.plugin.appbrand.app.C81194z.f238515i
                r1 = 0
                if (r0 != 0) goto L_0x000b
                return r1
            L_0x000b:
                android.app.ActivityManager$RecentTaskInfo r0 = r10.getTaskInfo()     // Catch:{ all -> 0x0120 }
                if (r0 == 0) goto L_0x011f
                android.content.Intent r0 = r0.baseIntent     // Catch:{ all -> 0x0120 }
                if (r0 == 0) goto L_0x011f
                android.content.ComponentName r0 = r0.getComponent()     // Catch:{ all -> 0x0120 }
                if (r0 != 0) goto L_0x001d
                goto L_0x011f
            L_0x001d:
                java.util.Map<java.lang.String, java.lang.String> r2 = f238542c     // Catch:{ all -> 0x0120 }
                java.lang.String r3 = r0.getClassName()     // Catch:{ all -> 0x0120 }
                java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0120 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0120 }
                r3 = 1
                if (r2 == 0) goto L_0x008b
                boolean r0 = com.tencent.p014mm.plugin.appbrand.app.C81194z.f238516j     // Catch:{ all -> 0x0120 }
                if (r0 != 0) goto L_0x0031
                return r1
            L_0x0031:
                com.tencent.mm.plugin.appbrand.app.z r0 = com.tencent.p014mm.plugin.appbrand.app.C81194z.f238510d     // Catch:{ all -> 0x0120 }
                r0.getClass()     // Catch:{ all -> 0x0120 }
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0120 }
                r4 = 0
                r5 = 29
                if (r0 < r5) goto L_0x004a
                android.app.ActivityManager$RecentTaskInfo r10 = r10.getTaskInfo()     // Catch:{ all -> 0x0120 }
                if (r10 == 0) goto L_0x0056
                int r10 = r10.taskId     // Catch:{ all -> 0x0120 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0120 }
                goto L_0x0056
            L_0x004a:
                android.app.ActivityManager$RecentTaskInfo r10 = r10.getTaskInfo()     // Catch:{ all -> 0x0120 }
                if (r10 == 0) goto L_0x0056
                int r10 = r10.id     // Catch:{ all -> 0x0120 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0120 }
            L_0x0056:
                if (r4 == 0) goto L_0x0072
                int r10 = r4.intValue()     // Catch:{ all -> 0x0120 }
                u.d<java.lang.Integer> r0 = com.tencent.p014mm.plugin.appbrand.app.C81194z.f238521r     // Catch:{ all -> 0x0120 }
                monitor-enter(r0)     // Catch:{ all -> 0x0120 }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x006f }
                boolean r10 = r0.contains(r10)     // Catch:{ all -> 0x006f }
                if (r10 == 0) goto L_0x006b
                monitor-exit(r0)     // Catch:{ all -> 0x0120 }
                return r1
            L_0x006b:
                rx3.b0 r10 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x006f }
                monitor-exit(r0)     // Catch:{ all -> 0x0120 }
                goto L_0x0072
            L_0x006f:
                r10 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0120 }
                throw r10     // Catch:{ all -> 0x0120 }
            L_0x0072:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0120 }
                r10.<init>()     // Catch:{ all -> 0x0120 }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getApplicationId()     // Catch:{ all -> 0x0120 }
                r10.append(r0)     // Catch:{ all -> 0x0120 }
                r10.append(r2)     // Catch:{ all -> 0x0120 }
                java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0120 }
                boolean r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isProcessExist(r10)     // Catch:{ all -> 0x0120 }
                r10 = r10 ^ r3
                return r10
            L_0x008b:
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0120 }
                android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ all -> 0x0120 }
                if (r2 != 0) goto L_0x0096
                return r1
            L_0x0096:
                android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0120 }
                java.lang.Class<android.app.ActivityManager> r5 = android.app.ActivityManager.class
                java.lang.Object r4 = p385u2.C111105a.m151502d(r4, r5)     // Catch:{ all -> 0x0120 }
                android.app.ActivityManager r4 = (android.app.ActivityManager) r4     // Catch:{ all -> 0x0120 }
                if (r4 != 0) goto L_0x00a5
                return r1
            L_0x00a5:
                r5 = 128(0x80, float:1.794E-43)
                android.content.pm.ActivityInfo r0 = r2.getActivityInfo(r0, r5)     // Catch:{ all -> 0x0120 }
                java.util.List r6 = r4.getRunningAppProcesses()     // Catch:{ all -> 0x0120 }
                java.lang.String r7 = "am.runningAppProcesses"
                gy3.C87412m.m108593f(r6, r7)     // Catch:{ all -> 0x0120 }
                java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0120 }
            L_0x00b8:
                boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0120 }
                if (r7 == 0) goto L_0x00cf
                java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0120 }
                android.app.ActivityManager$RunningAppProcessInfo r7 = (android.app.ActivityManager.RunningAppProcessInfo) r7     // Catch:{ all -> 0x0120 }
                java.lang.String r7 = r7.processName     // Catch:{ all -> 0x0120 }
                java.lang.String r8 = r0.processName     // Catch:{ all -> 0x0120 }
                boolean r7 = gy3.C87412m.m108589b(r7, r8)     // Catch:{ all -> 0x0120 }
                if (r7 == 0) goto L_0x00b8
                return r1
            L_0x00cf:
                android.app.ActivityManager$RecentTaskInfo r10 = r10.getTaskInfo()     // Catch:{ all -> 0x0107 }
                if (r10 == 0) goto L_0x011e
                android.content.ComponentName r0 = r10.topActivity     // Catch:{ all -> 0x0107 }
                int r10 = r10.numActivities     // Catch:{ all -> 0x0107 }
                if (r10 == r3) goto L_0x0106
                if (r0 != 0) goto L_0x00de
                goto L_0x0106
            L_0x00de:
                android.content.pm.ActivityInfo r10 = r2.getActivityInfo(r0, r5)     // Catch:{ all -> 0x0107 }
                java.util.List r0 = r4.getRunningAppProcesses()     // Catch:{ all -> 0x0107 }
                java.lang.String r2 = "am.runningAppProcesses"
                gy3.C87412m.m108593f(r0, r2)     // Catch:{ all -> 0x0107 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0107 }
            L_0x00ef:
                boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0107 }
                if (r2 == 0) goto L_0x011e
                java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0107 }
                android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2     // Catch:{ all -> 0x0107 }
                java.lang.String r2 = r2.processName     // Catch:{ all -> 0x0107 }
                java.lang.String r4 = r10.processName     // Catch:{ all -> 0x0107 }
                boolean r2 = gy3.C87412m.m108589b(r2, r4)     // Catch:{ all -> 0x0107 }
                if (r2 == 0) goto L_0x00ef
                return r1
            L_0x0106:
                return r3
            L_0x0107:
                r10 = move-exception
                java.lang.String r0 = "MicroMsg.AppBrandZombieTaskKiller"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0120 }
                r2.<init>()     // Catch:{ all -> 0x0120 }
                java.lang.String r4 = "ZombieTaskPredicateForDeadProcess.isZombieTask get exception for reading topActivity, "
                r2.append(r4)     // Catch:{ all -> 0x0120 }
                r2.append(r10)     // Catch:{ all -> 0x0120 }
                java.lang.String r10 = r2.toString()     // Catch:{ all -> 0x0120 }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r10)     // Catch:{ all -> 0x0120 }
            L_0x011e:
                return r3
            L_0x011f:
                return r1
            L_0x0120:
                r10 = move-exception
                java.lang.String r0 = "MicroMsg.AppBrandZombieTaskKiller"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "ZombieTaskPredicateForDeadProcess.isZombieTask get exception "
                r2.append(r3)
                r2.append(r10)
                java.lang.String r10 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r10)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.app.C81194z.C81204i.mo113336a(android.app.ActivityManager$AppTask):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.z$j */
    public static final class C81205j implements C80924w {

        /* renamed from: a */
        public static final C81205j f238543a = new C81205j();

        /* renamed from: a */
        public final void mo111377a() {
            if (C81194z.f238515i) {
                C81194z.zx0(C81196b.APPBRAND_BINDER_DIED);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.z$k */
    public static final class C81206k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C81196b f238544d;

        public C81206k(C81196b bVar) {
            this.f238544d = bVar;
        }

        public final void run() {
            try {
                Log.m105924i("MicroMsg.AppBrandZombieTaskKiller", "check with scene:" + this.f238544d);
                C81194z.vx0(C81194z.f238510d, this.f238544d);
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.AppBrandZombieTaskKiller", "checkAndKillZombieTasks get exception:" + th);
            }
        }
    }

    public static final void vx0(C81194z zVar, C81196b bVar) {
        List<ActivityManager.AppTask> appTasks;
        Object obj;
        zVar.getClass();
        ActivityManager activityManager = (ActivityManager) C111105a.m151502d(MMApplicationContext.getContext(), ActivityManager.class);
        int i = 0;
        if (!(activityManager == null || (appTasks = activityManager.getAppTasks()) == null)) {
            for (ActivityManager.AppTask appTask : appTasks) {
                ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                String xx02 = taskInfo != null ? f238510d.xx0(taskInfo) : null;
                Log.m105918d("MicroMsg.AppBrandZombieTaskKiller", "dump task:" + xx02);
                if (C81195a.f238523a.mo113364a(appTask)) {
                    C81197d.f238533a.getClass();
                    if (((C81197d) ((C36570n) C81197d.C81198a.f238535b).getValue()).mo113336a(appTask)) {
                        try {
                            Result.Companion companion = Result.Companion;
                            appTask.finishAndRemoveTask();
                            obj = Result.m168114constructorimpl(Boolean.TRUE);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
                        }
                        Log.m105924i("MicroMsg.AppBrandZombieTaskKiller", "kill ZombieTask:" + xx02 + ", result:" + Result.m168122toStringimpl(obj));
                        i++;
                    }
                }
            }
        }
        if (i > 0) {
            zVar.Ax0(bVar, i);
        }
    }

    public static final void zx0(C81196b bVar) {
        C87412m.m108594g(bVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        boolean z = true;
        if (!f238518o.getAndSet(true)) {
            f238510d.yx0();
        }
        if (f238515i && !f238519p.getAndSet(true)) {
            String[] strArr = C86709a0.f251722m;
            for (int i = 0; i < 5; i++) {
                String str = strArr[i];
                C80907o.m98778a(MMApplicationContext.getApplicationId() + str, f238522s);
            }
        }
        if (bVar == C81196b.APPBRAND_BINDER_DIED) {
            z = false;
        }
        if (!z || Util.ticksToNow(f238520q) >= f238511e) {
            f238520q = Util.currentTicks();
            ((C119157j) C119157j.f356862d).mo183876g(new C81206k(bVar), "MicroMsg.AppBrandZombieTaskKiller");
        }
    }

    public final void Ax0(C81196b bVar, int i) {
        int i2 = bVar.f238532d;
        Log.m105924i("MicroMsg.AppBrandZombieTaskKiller", "reportIDKey ID:" + 1761 + ", key:" + i2 + ", count:" + i);
        C115669n.INSTANCE.mo175913w((long) 1761, (long) i2, (long) i);
    }

    public void Rc0(String str) {
        List<ActivityManager.AppTask> appTasks;
        Object obj;
        ActivityManager activityManager = (ActivityManager) C111105a.m151502d(MMApplicationContext.getContext(), ActivityManager.class);
        if (activityManager != null && (appTasks = activityManager.getAppTasks()) != null) {
            for (ActivityManager.AppTask appTask : appTasks) {
                ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                String xx02 = taskInfo != null ? f238510d.xx0(taskInfo) : null;
                if (C81195a.f238523a.mo113364a(appTask)) {
                    try {
                        Result.Companion companion = Result.Companion;
                        appTask.finishAndRemoveTask();
                        obj = Result.m168114constructorimpl(Boolean.TRUE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
                    }
                    Log.m105924i("MicroMsg.AppBrandZombieTaskKiller", "kill AppBrand task:" + xx02 + " for " + str + ", result:" + Result.m168122toStringimpl(obj));
                }
            }
        }
    }

    public final void wx0(AppBrandInitConfigWC appBrandInitConfigWC, Intent intent) {
        Object obj;
        Intent intent2;
        C87412m.m108594g(appBrandInitConfigWC, "cfg");
        C87412m.m108594g(intent, "intent");
        if (!f238518o.getAndSet(true)) {
            yx0();
        }
        if (f238517n) {
            try {
                ComponentName component = intent.getComponent();
                C87412m.m108591d(component);
                ActivityManager activityManager = (ActivityManager) C111105a.m151502d(MMApplicationContext.getContext(), ActivityManager.class);
                String str = null;
                List<ActivityManager.AppTask> appTasks = activityManager != null ? activityManager.getAppTasks() : null;
                if (appTasks == null) {
                    appTasks = C64186f0.f181907d;
                }
                for (ActivityManager.AppTask appTask : appTasks) {
                    ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                    if (C87412m.m108589b(component, (taskInfo == null || (intent2 = taskInfo.baseIntent) == null) ? null : intent2.getComponent())) {
                        if (C81195a.f238523a.mo113364a(appTask)) {
                            ActivityManager.RecentTaskInfo taskInfo2 = appTask.getTaskInfo();
                            if (taskInfo2 != null) {
                                str = xx0(taskInfo2);
                            }
                            Result.Companion companion = Result.Companion;
                            appTask.finishAndRemoveTask();
                            obj = Result.m168114constructorimpl(Boolean.TRUE);
                            Log.m105924i("MicroMsg.AppBrandZombieTaskKiller", "checkIfKillZombieTaskBeforeStartAppBrandUI for appId:" + appBrandInitConfigWC.f239362d + ", kill ZombieTask:" + str + ", result:" + Result.m168122toStringimpl(obj));
                            Ax0(C81196b.BEFORE_START_APPBRAND_UI, 1);
                            return;
                        }
                        return;
                    }
                }
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.AppBrandZombieTaskKiller", "checkIfKillZombieTaskBeforeStartAppBrandUI for appId:" + appBrandInitConfigWC.f239362d + ", detect ZombieTask get exception:" + android.util.Log.getStackTraceString(th));
            }
        }
    }

    public final String xx0(ActivityManager.RecentTaskInfo recentTaskInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            String obj = recentTaskInfo.toString();
            C87412m.m108593f(obj, "{\n            this.toString()\n        }");
            return obj;
        }
        try {
            return "RecentTaskInfo{id=" + recentTaskInfo.id + " persistentId=" + recentTaskInfo.persistentId + " baseIntent=" + recentTaskInfo.baseIntent + " baseActivity=" + recentTaskInfo.baseActivity + " topActivity=" + recentTaskInfo.topActivity + " origActivity=" + recentTaskInfo.origActivity + " numActivities=" + recentTaskInfo.numActivities + '}';
        } catch (Throwable unused) {
            String obj2 = recentTaskInfo.toString();
            C87412m.m108593f(obj2, "{\n                this.toString()\n            }");
            return obj2;
        }
    }

    public final void yx0() {
        try {
            f238517n = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32738b.clicfg_android_appbrand_check_kill_zombie_task_before_start_ui, f238517n);
        } finally {
            f238518o.set(true);
        }
    }
}
