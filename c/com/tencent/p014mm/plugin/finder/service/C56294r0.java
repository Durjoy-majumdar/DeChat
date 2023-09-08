package com.tencent.p014mm.plugin.finder.service;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderMultiTaskGuideShowStruct;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper;
import com.tencent.p014mm.plugin.finder.p056ui.FinderHomeAffinityUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderMultiTaskRouterUI;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86301e;
import di3.C86312j;
import dp1.C58373i0;
import dp1.C58377j0;
import dp1.C58417y0;
import dp1.C7435f2;
import eb0.C31543z5;
import ei3.C86522b;
import er1.C58684b;
import f40.C86709a0;
import fy3.C32224a;
import gr1.C59656d1;
import gr1.C59686x0;
import gy3.C24560g0;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import ht1.C60204t3;
import j20.C117292a;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import k20.C9556a;
import o40.C61926c;
import org.json.JSONObject;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import p156gj.C107835h0;
import p156gj.C107842p;
import p156gj.C87203t;
import p723vf.C90773a;
import qo3.C101218e0;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import up1.C37521f;
import w80.C111744e;
import z04.C112550d0;

@C86522b
/* renamed from: com.tencent.mm.plugin.finder.service.r0 */
public final class C56294r0 extends C86301e implements C60204t3 {

    /* renamed from: d */
    public boolean f160881d;

    /* renamed from: e */
    public boolean f160882e;

    /* renamed from: f */
    public boolean f160883f;

    /* renamed from: g */
    public boolean f160884g;

    /* renamed from: h */
    public final C13601g f160885h = C36568h.m40985a(C30012f.f81233d);

    /* renamed from: i */
    public boolean f160886i;

    /* renamed from: j */
    public boolean f160887j;

    /* renamed from: n */
    public Boolean f160888n;

    /* renamed from: o */
    public Boolean f160889o;

    /* renamed from: p */
    public long f160890p;

    /* renamed from: q */
    public final C13601g f160891q = C36568h.m40985a(C30011e.f81232d);

    /* renamed from: r */
    public final Set<AppCompatActivity> f160892r = Collections.synchronizedSet(new LinkedHashSet());

    /* renamed from: s */
    public final Set<AppCompatActivity> f160893s = Collections.synchronizedSet(new LinkedHashSet());

    /* renamed from: t */
    public final Set<Activity> f160894t = Collections.synchronizedSet(new LinkedHashSet());

    /* renamed from: u */
    public final Set<Activity> f160895u = Collections.synchronizedSet(new LinkedHashSet());

    /* renamed from: v */
    public long f160896v;

    /* renamed from: w */
    public boolean f160897w;

    /* renamed from: com.tencent.mm.plugin.finder.service.r0$a */
    public static final class C30010a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: d */
        public final /* synthetic */ C56294r0 f81231d;

        public C30010a(C56294r0 r0Var) {
            this.f81231d = r0Var;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (!(activity instanceof MMFinderUI) && this.f81231d.iu0(activity)) {
                Log.m105924i("FinderMultiTaskService", "onActivityCreated: non finder activity = " + activity.getClass().getSimpleName());
                this.f81231d.f160895u.add(activity);
            }
        }

        public void onActivityDestroyed(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            this.f81231d.f160894t.remove(activity);
            if (this.f81231d.f160895u.remove(activity)) {
                Log.m105924i("FinderMultiTaskService", "onActivityDestroyed: non finder activity same task activity = " + activity.getClass().getSimpleName());
            }
        }

        public void onActivityPaused(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        }

        public void onActivityResumed(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(bundle, "outState");
        }

        public void onActivityStarted(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (!(activity instanceof MMFinderUI) && this.f81231d.iu0(activity)) {
                C56294r0 r0Var = this.f81231d;
                if (!r0Var.f160894t.contains(activity)) {
                    Log.m105924i("FinderMultiTaskService", "onNonFinderActivityForeground: activity = " + activity.getClass().getSimpleName());
                    r0Var.f160894t.add(activity);
                    r0Var.f160890p = 0;
                }
            }
        }

        public void onActivityStopped(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (!(activity instanceof MMFinderUI) && this.f81231d.iu0(activity)) {
                C56294r0 r0Var = this.f81231d;
                r0Var.f160894t.remove(activity);
                Log.m105924i("FinderMultiTaskService", "onNonFinderActivityBackground: activity = " + activity.getClass().getSimpleName());
                if (r0Var.f160894t.size() == 0 && r0Var.f160892r.size() == 0) {
                    Log.m105924i("FinderMultiTaskService", "onNonFinderActivityBackground: record finder background timestamp");
                    r0Var.f160890p = System.currentTimeMillis();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.r0$e */
    public static final class C30011e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C30011e f81232d = new C30011e();

        public C30011e() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            return C37521f.f99257P5.mo60266n();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.r0$f */
    public static final class C30012f extends C87413o implements C32224a<PowerManager> {

        /* renamed from: d */
        public static final C30012f f81233d = new C30012f();

        public C30012f() {
            super(0);
        }

        public Object invoke() {
            Object systemService = MMApplicationContext.getContext().getSystemService("power");
            if (systemService instanceof PowerManager) {
                return (PowerManager) systemService;
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.r0$b */
    public static final class C56295b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C56294r0 f160898d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56295b(C56294r0 r0Var) {
            super(0);
            this.f160898d = r0Var;
        }

        public Object invoke() {
            Set<AppCompatActivity> set = this.f160898d.f160893s;
            C87412m.m108593f(set, "enterFinderActivity");
            Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AppCompatActivity appCompatActivity = (AppCompatActivity) it.next();
                if (C87412m.m108589b(appCompatActivity.getClass(), FinderHomeAffinityUI.class)) {
                    appCompatActivity.moveTaskToBack(true);
                    break;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.r0$c */
    public static final class C56296c implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ C101218e0 f160899a;

        /* renamed from: b */
        public final /* synthetic */ C56294r0 f160900b;

        public C56296c(C101218e0 e0Var, C56294r0 r0Var) {
            this.f160899a = e0Var;
            this.f160900b = r0Var;
        }

        /* renamed from: a */
        public final void mo2001a() {
            this.f160899a.mo140680z();
            this.f160900b.f160897w = true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.service.r0$d */
    public static final class C56297d implements C101218e0.C77394n {

        /* renamed from: a */
        public final /* synthetic */ C101218e0 f160901a;

        /* renamed from: b */
        public final /* synthetic */ C56294r0 f160902b;

        /* renamed from: c */
        public final /* synthetic */ int f160903c;

        public C56297d(C101218e0 e0Var, C56294r0 r0Var, int i) {
            this.f160901a = e0Var;
            this.f160902b = r0Var;
            this.f160903c = i;
        }

        public final void dismiss() {
            PAGView pAGView = (PAGView) this.f160901a.f296384g.findViewById(C0966R.C0970id.est);
            if (pAGView != null) {
                pAGView.stop();
            }
            C56294r0 r0Var = this.f160902b;
            r0Var.yx0(false, this.f160903c, r0Var.f160897w ? 1 : 2);
        }
    }

    public C56294r0() {
        Context context = MMApplicationContext.getContext();
        Application application = context instanceof Application ? (Application) context : null;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new C30010a(this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a1, code lost:
        if ((r4 != null && !r4.isFinishing()) != false) goto L_0x00a5;
     */
    /* renamed from: AG */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo78740AG(com.tencent.p014mm.p136ui.MMActivity r7) {
        /*
            r6 = this;
            java.lang.String r0 = "finder"
            gy3.C87412m.m108594g(r7, r0)
            java.util.Set<androidx.appcompat.app.AppCompatActivity> r0 = r6.f160892r
            r0.remove(r7)
            java.util.Set<androidx.appcompat.app.AppCompatActivity> r0 = r6.f160892r
            int r0 = r0.size()
            if (r0 != 0) goto L_0x00c8
            boolean r0 = r6.wx0()
            boolean r1 = r6.iu0(r7)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0028
            if (r1 == 0) goto L_0x0028
            boolean r4 = r7.isFinishing()
            if (r4 != 0) goto L_0x0028
            r4 = 1
            goto L_0x0029
        L_0x0028:
            r4 = 0
        L_0x0029:
            r6.f160881d = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onFinderBackground: isFinderTaskBackground = "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ", checkUIisFinderTask = "
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = ", finderIsFinishing = "
            r4.append(r0)
            boolean r0 = r7.isFinishing()
            r4.append(r0)
            java.lang.String r0 = ", isHomeFromFinder = "
            r4.append(r0)
            boolean r0 = r6.f160881d
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = "FinderMultiTaskService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            boolean r0 = r6.f160881d
            if (r0 == 0) goto L_0x006a
            dp1.i0 r0 = dp1.C58373i0.f167182a
            dp1.i0$a r4 = dp1.C58373i0.C58374a.EXIT_FROM_FINDER_TASK
            r0.mo83139a(r4)
        L_0x006a:
            dp1.s1 r0 = dp1.C58402s1.f167320a
            r0.mo83241a(r7, r3)
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            com.tencent.mm.storage.y1$a r0 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_BACKGROUND_TIMESTAMP_LONG_SYNC
            java.util.Set<androidx.appcompat.app.AppCompatActivity> r4 = r6.f160893s
            int r4 = r4.size()
            if (r4 > r2) goto L_0x00a5
            java.util.Set<androidx.appcompat.app.AppCompatActivity> r4 = r6.f160893s
            int r4 = r4.size()
            if (r4 != r2) goto L_0x00a4
            java.util.Set<androidx.appcompat.app.AppCompatActivity> r4 = r6.f160893s
            java.lang.String r5 = "enterFinderActivity"
            gy3.C87412m.m108593f(r4, r5)
            java.lang.Object r4 = sx3.C110818d0.m150915M(r4)
            androidx.appcompat.app.AppCompatActivity r4 = (androidx.appcompat.app.AppCompatActivity) r4
            if (r4 == 0) goto L_0x00a0
            boolean r4 = r4.isFinishing()
            if (r4 != 0) goto L_0x00a0
            r4 = 1
            goto L_0x00a1
        L_0x00a0:
            r4 = 0
        L_0x00a1:
            if (r4 == 0) goto L_0x00a4
            goto L_0x00a5
        L_0x00a4:
            r2 = 0
        L_0x00a5:
            if (r2 == 0) goto L_0x00ac
            long r2 = eb0.C31543z5.m39453c()
            goto L_0x00ae
        L_0x00ac:
            r2 = 0
        L_0x00ae:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r7.mo119677K(r0, r2)
            java.util.Set<android.app.Activity> r7 = r6.f160894t
            int r7 = r7.size()
            if (r7 != 0) goto L_0x00c8
            java.lang.String r7 = "onFinderBackground: record finder background timestamp"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)
            long r0 = java.lang.System.currentTimeMillis()
            r6.f160890p = r0
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.service.C56294r0.mo78740AG(com.tencent.mm.ui.MMActivity):void");
    }

    public void B50(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, "finder");
        this.f160893s.remove(appCompatActivity);
    }

    /* renamed from: GN */
    public Activity mo78742GN() {
        T t;
        Set<AppCompatActivity> set = this.f160893s;
        C87412m.m108593f(set, "enterFinderActivity");
        Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((AppCompatActivity) t) instanceof FinderHomeUI) {
                break;
            }
        }
        return (Activity) t;
    }

    public boolean Gs0() {
        return this.f160881d && wx0();
    }

    /* renamed from: H5 */
    public void mo78744H5() {
        if (!C86709a0.m107522a()) {
            Log.m105920e("FinderMultiTaskService", "onLauncherUIPause: acc not ready");
            return;
        }
        this.f160882e = false;
        this.f160881d = false;
    }

    public boolean Kv0(Context context) {
        boolean z;
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        String className;
        Class<FinderHomeAffinityUI> cls = FinderHomeAffinityUI.class;
        C87412m.m108594g(context, "context");
        if (!C86709a0.m107522a()) {
            Log.m105920e("FinderMultiTaskService", "isFinderTaskForeground: acc not ready");
            return false;
        } else if (this.f160892r.size() == 0) {
            return false;
        } else {
            Set<AppCompatActivity> set = this.f160893s;
            C87412m.m108593f(set, "enterFinderActivity");
            if (!set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C87412m.m108589b(((AppCompatActivity) it.next()).getClass(), cls)) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                return false;
            }
            try {
                Object systemService = context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                if (activityManager == null || (runningTasks = activityManager.getRunningTasks(1)) == null || (runningTaskInfo = (ActivityManager.RunningTaskInfo) C110818d0.m150916N(runningTasks)) == null || (componentName = runningTaskInfo.baseActivity) == null || (className = componentName.getClassName()) == null) {
                    return false;
                }
                return className.equals(C24560g0.m30725a(cls).mo51262e());
            } catch (Throwable th) {
                Log.m105921e("FinderMultiTaskService", "isFinderTaskForeground: ams is dead", th);
                return false;
            }
        }
    }

    /* renamed from: N */
    public boolean mo78746N() {
        return this.f160892r.size() > 0;
    }

    /* JADX WARNING: type inference failed for: r2v13, types: [android.app.Activity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: PV */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo78747PV(com.tencent.p014mm.p136ui.MMActivity r11) {
        /*
            r10 = this;
            java.lang.String r0 = "finder"
            gy3.C87412m.m108594g(r11, r0)
            java.util.Set<androidx.appcompat.app.AppCompatActivity> r0 = r10.f160892r
            boolean r0 = r0.contains(r11)
            if (r0 == 0) goto L_0x000e
            return
        L_0x000e:
            java.lang.Class<ns3.d> r0 = ns3.C11266d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ns3.d r0 = (ns3.C11266d) r0
            boolean r0 = r0.jk0(r11)
            r1 = 0
            if (r0 != 0) goto L_0x014d
            up1.f r2 = up1.C37521f.f99374d
            boolean r3 = r2.mo61188n()
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x008f
            boolean r3 = r10.mo78746N()
            if (r3 != 0) goto L_0x008f
            boolean r3 = r10.f160884g
            if (r3 != 0) goto L_0x008f
            boolean r3 = r10.f160883f
            if (r3 != 0) goto L_0x008f
            android.content.Intent r3 = r11.getIntent()
            java.lang.String r6 = "enter_finder_home_ui_type"
            int r3 = r3.getIntExtra(r6, r5)
            r7 = 2
            if (r3 != r7) goto L_0x0044
            r3 = 1
            goto L_0x0045
        L_0x0044:
            r3 = 0
        L_0x0045:
            android.content.Intent r7 = r11.getIntent()
            int r7 = r7.getIntExtra(r6, r5)
            r8 = 4
            if (r7 != r8) goto L_0x0052
            r7 = 1
            goto L_0x0053
        L_0x0052:
            r7 = 0
        L_0x0053:
            boolean r8 = r10.f160886i
            if (r8 != 0) goto L_0x0084
            if (r3 != 0) goto L_0x0084
            if (r7 != 0) goto L_0x0084
            java.lang.Class<ht1.t1> r3 = ht1.C60200t1.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ht1.t1 r3 = (ht1.C60200t1) r3
            r3.mo76876sZ(r5, r4)
            java.lang.Class<l31.e> r3 = l31.C61212e.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            l31.e r3 = (l31.C61212e) r3
            java.lang.Class<h81.i> r7 = h81.C59774i.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            h81.i r7 = (h81.C59774i) r7
            int r7 = r7.mo84748Ps()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "special_enter_source"
            r3.y50(r11, r8, r7)
        L_0x0084:
            r10.f160886i = r1
            android.content.Intent r3 = r11.getIntent()
            if (r3 == 0) goto L_0x008f
            r3.putExtra(r6, r5)
        L_0x008f:
            dp1.i0 r3 = dp1.C58373i0.f167182a
            boolean r6 = r10.f160883f
            boolean r7 = r10.f160884g
            boolean r2 = r2.mo61188n()
            if (r2 == 0) goto L_0x014d
            java.lang.Class<ht1.t3> r2 = ht1.C60204t3.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ht1.t3 r2 = (ht1.C60204t3) r2
            boolean r8 = r2.mo78746N()
            if (r8 != 0) goto L_0x00ae
            dp1.i0$a r9 = dp1.C58373i0.C58374a.ENTER_FINDER_TOTAL
            r3.mo83139a(r9)
        L_0x00ae:
            if (r8 != 0) goto L_0x0118
            boolean r8 = r2.iu0(r11)
            if (r8 == 0) goto L_0x0118
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "onFinderForeground: isMainProcBackground="
            r8.append(r9)
            r8.append(r6)
            java.lang.String r9 = ", isScreenOff = "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "FinderMultiTaskReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            if (r7 == 0) goto L_0x00dc
            dp1.i0$a r2 = dp1.C58373i0.C58374a.ENTER_FINDER_TASK_FROM_SCREEN_OFF
            r3.mo83139a(r2)
            goto L_0x0113
        L_0x00dc:
            android.app.Activity r2 = r2.mo78742GN()
            boolean r7 = r2 instanceof com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI
            if (r7 == 0) goto L_0x00e7
            r4 = r2
            com.tencent.mm.plugin.finder.ui.FinderHomeUI r4 = (com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI) r4
        L_0x00e7:
            if (r6 == 0) goto L_0x0104
            if (r4 != 0) goto L_0x00ec
            goto L_0x00ee
        L_0x00ec:
            r4.f16896p = r5
        L_0x00ee:
            dp1.s1 r2 = dp1.C58402s1.f167320a
            long r6 = java.lang.System.currentTimeMillis()
            dp1.C58402s1.f167321b = r6
            r2.mo83241a(r11, r5)
            dp1.i0$a r2 = dp1.C58373i0.C58374a.ENTER_FINDER_TASK_FROM_SYSTEM_UI
            r3.mo83139a(r2)
            java.lang.String r2 = "onFinderForeground: enter finder task from system ui"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            goto L_0x0113
        L_0x0104:
            if (r4 != 0) goto L_0x0107
            goto L_0x0109
        L_0x0107:
            r4.f16896p = r1
        L_0x0109:
            dp1.i0$a r2 = dp1.C58373i0.C58374a.ENTER_FINDER_TASK_FROM_WECHAT
            r3.mo83139a(r2)
            java.lang.String r2 = "onFinderForeground: enter finder task normally"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
        L_0x0113:
            dp1.i0$a r2 = dp1.C58373i0.C58374a.ENTER_FINDER_TASK_TOTAL
            r3.mo83139a(r2)
        L_0x0118:
            java.lang.Class r2 = r11.getClass()
            pt1.b r4 = pt1.C35640b.f95284a
            rx3.g r4 = pt1.C35640b.f95285b
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r2 = gy3.C87412m.m108589b(r2, r4)
            if (r2 == 0) goto L_0x0134
            dp1.i0$a r2 = dp1.C58373i0.C58374a.ENTER_NORMAL_TASK_LIVE
            r3.mo83139a(r2)
            goto L_0x014d
        L_0x0134:
            java.lang.Class r2 = r11.getClass()
            rx3.g r4 = pt1.C35640b.f95287d
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r2 = gy3.C87412m.m108589b(r2, r4)
            if (r2 == 0) goto L_0x014d
            dp1.i0$a r2 = dp1.C58373i0.C58374a.ENTER_FINDER_TASK_LIVE
            r3.mo83139a(r2)
        L_0x014d:
            r10.f160884g = r1
            if (r0 == 0) goto L_0x0152
            return
        L_0x0152:
            r2 = 0
            r10.f160890p = r2
            java.util.Set<androidx.appcompat.app.AppCompatActivity> r0 = r10.f160892r
            r0.add(r11)
            r10.f160881d = r1
            r10.f160882e = r1
            boolean r0 = r10.f160887j
            if (r0 != 0) goto L_0x0169
            boolean r11 = r10.Kv0(r11)
            r10.f160887j = r11
        L_0x0169:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.service.C56294r0.mo78747PV(com.tencent.mm.ui.MMActivity):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: android.app.ActivityManager} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Pm */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo78748Pm(boolean r10) {
        /*
            r9 = this;
            java.lang.Class<com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI> r0 = com.tencent.p014mm.plugin.finder.p056ui.FinderHomeAffinityUI.class
            java.lang.String r1 = "FinderMultiTaskService"
            r2 = 0
            r3 = 1
            java.util.Set<androidx.appcompat.app.AppCompatActivity> r4 = r9.f160893s     // Catch:{ all -> 0x00af }
            java.lang.String r5 = "enterFinderActivity"
            gy3.C87412m.m108593f(r4, r5)     // Catch:{ all -> 0x00af }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00af }
        L_0x0011:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00af }
            r6 = 0
            if (r5 == 0) goto L_0x002a
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00af }
            r7 = r5
            androidx.appcompat.app.AppCompatActivity r7 = (androidx.appcompat.app.AppCompatActivity) r7     // Catch:{ all -> 0x00af }
            java.lang.Class r7 = r7.getClass()     // Catch:{ all -> 0x00af }
            boolean r7 = gy3.C87412m.m108589b(r7, r0)     // Catch:{ all -> 0x00af }
            if (r7 == 0) goto L_0x0011
            goto L_0x002b
        L_0x002a:
            r5 = r6
        L_0x002b:
            androidx.appcompat.app.AppCompatActivity r5 = (androidx.appcompat.app.AppCompatActivity) r5     // Catch:{ all -> 0x00af }
            if (r5 == 0) goto L_0x0031
            r4 = 1
            goto L_0x0032
        L_0x0031:
            r4 = 0
        L_0x0032:
            if (r5 == 0) goto L_0x003a
            r5.finishAndRemoveTask()     // Catch:{ all -> 0x00af }
            rx3.b0 r5 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00af }
            goto L_0x003b
        L_0x003a:
            r5 = r6
        L_0x003b:
            if (r5 != 0) goto L_0x0092
            if (r10 == 0) goto L_0x0092
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x00af }
            java.lang.String r7 = "activity"
            java.lang.Object r5 = r5.getSystemService(r7)     // Catch:{ all -> 0x00af }
            boolean r7 = r5 instanceof android.app.ActivityManager     // Catch:{ all -> 0x00af }
            if (r7 == 0) goto L_0x0050
            r6 = r5
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6     // Catch:{ all -> 0x00af }
        L_0x0050:
            if (r6 == 0) goto L_0x0092
            java.util.List r5 = r6.getAppTasks()     // Catch:{ all -> 0x00af }
            if (r5 == 0) goto L_0x0092
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x00af }
        L_0x005c:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x00af }
            if (r6 == 0) goto L_0x0092
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x00af }
            android.app.ActivityManager$AppTask r6 = (android.app.ActivityManager.AppTask) r6     // Catch:{ all -> 0x00af }
            android.app.ActivityManager$RecentTaskInfo r7 = r6.getTaskInfo()     // Catch:{ all -> 0x00af }
            android.content.Intent r7 = r7.baseIntent     // Catch:{ all -> 0x00af }
            android.content.ComponentName r7 = r7.getComponent()     // Catch:{ all -> 0x00af }
            if (r7 == 0) goto L_0x008a
            java.lang.String r7 = r7.getClassName()     // Catch:{ all -> 0x00af }
            if (r7 == 0) goto L_0x008a
            ny3.d r8 = gy3.C24560g0.m30725a(r0)     // Catch:{ all -> 0x00af }
            java.lang.String r8 = r8.mo51262e()     // Catch:{ all -> 0x00af }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x00af }
            if (r7 != r3) goto L_0x008a
            r7 = 1
            goto L_0x008b
        L_0x008a:
            r7 = 0
        L_0x008b:
            if (r7 == 0) goto L_0x005c
            r6.finishAndRemoveTask()     // Catch:{ all -> 0x00af }
            r4 = 1
            goto L_0x005c
        L_0x0092:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00af }
            r0.<init>()     // Catch:{ all -> 0x00af }
            java.lang.String r5 = "clearAllFinderTaskActivity: forceClose = "
            r0.append(r5)     // Catch:{ all -> 0x00af }
            r0.append(r10)     // Catch:{ all -> 0x00af }
            java.lang.String r10 = ", clearSuccess = "
            r0.append(r10)     // Catch:{ all -> 0x00af }
            r0.append(r4)     // Catch:{ all -> 0x00af }
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x00af }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r10)     // Catch:{ all -> 0x00af }
            goto L_0x00b9
        L_0x00af:
            r10 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r2] = r10
            java.lang.String r10 = "clearAllFinderTaskActivity: error, "
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r10, r0)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.service.C56294r0.mo78748Pm(boolean):void");
    }

    /* renamed from: b2 */
    public boolean mo78749b2(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (!C86709a0.m107522a()) {
            Log.m105920e("FinderMultiTaskService", "checkReenterFinderFromLauncherUI: acc not ready");
            return false;
        } else if (!C37521f.f99374d.mo61188n()) {
            Log.m105924i("FinderMultiTaskService", "checkReenterFinderFromLauncherUI: finder multi task is close");
            return false;
        } else if (!this.f160882e) {
            Log.m105924i("FinderMultiTaskService", "checkReenterFinderFromLauncherUI: failed needReenterFinder = " + this.f160882e);
            return false;
        } else {
            this.f160881d = false;
            this.f160882e = false;
            if (!wx0()) {
                Log.m105924i("FinderMultiTaskService", "checkReenterFinderFromLauncherUI: failed is finder task forground");
                return false;
            }
            this.f160886i = true;
            activity.getIntent().putExtra("KEY_REENTER_FINDER", true);
            Intent intent = new Intent();
            intent.putExtra("KEY_NEED_ANIM", true);
            C13598b0 b0Var = C13598b0.f38549a;
            ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
            intent.setClass(activity, FinderMultiTaskRouterUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderMultiTaskRouterUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderMultiTaskRouterUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.overridePendingTransition(C0966R.C0968anim.f2505et, C0966R.C0968anim.f2500eo);
            C58373i0.f167182a.mo83139a(C58373i0.C58374a.ENTER_FINDER_TASK_FROM_LAUNCHER);
            return true;
        }
    }

    /* renamed from: c5 */
    public Set<Activity> mo78750c5() {
        Set<AppCompatActivity> set = this.f160893s;
        C87412m.m108593f(set, "enterFinderActivity");
        return set;
    }

    /* renamed from: dB */
    public void mo78751dB(AppCompatActivity appCompatActivity) {
        AppCompatActivity appCompatActivity2 = appCompatActivity;
        C87412m.m108594g(appCompatActivity2, "finder");
        if (!this.f160893s.contains(appCompatActivity2)) {
            this.f160893s.add(appCompatActivity2);
            if (!(appCompatActivity2 instanceof FinderMultiTaskRouterUI)) {
                C7335d c = C86312j.m106911c(C60204t3.class);
                C87412m.m108592e(c, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.service.FinderMultiTaskService");
                C56294r0 r0Var = (C56294r0) c;
                if (r0Var.iu0(appCompatActivity2)) {
                    MMFinderUI mMFinderUI = appCompatActivity2 instanceof MMFinderUI ? (MMFinderUI) appCompatActivity2 : null;
                    if (mMFinderUI != null) {
                        mMFinderUI.f161156h = new C58377j0(appCompatActivity2, r0Var);
                    }
                }
            }
        }
        Class cls = C32735h.class;
        boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_finder_video_enable_h266_download, false);
        int a = C107842p.m146108a();
        int i = (a >> 12) & 15;
        int i2 = a & 255;
        int i3 = Build.VERSION.SDK_INT;
        long j = (long) 1024;
        long g = (C90773a.m113841g(MMApplicationContext.getContext()) / j) / j;
        C111744e.C111745a aVar = C111744e.f334654d;
        int f = aVar.mo163483f();
        C59686x0.f170509d = f;
        boolean z = i >= 4;
        boolean z2 = i2 >= 70;
        boolean z3 = i3 >= 23;
        boolean z4 = g >= 4096;
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        boolean z5 = f >= C37521f.f99255P3.mo60266n().intValue();
        boolean z6 = BuildInfo.IS_ARM64;
        boolean z7 = z && z2 && z3 && z4 && z5 && z6;
        Log.m105925i("ThumbPlayer.MMTPPlayerH266Ability", "checkDeviceSupportH266LocalAbility, cpuFlags:%s, nCores:%s, nFreq:%s, gpuScore %s sdkInt:%s, totalMemMB:%s, coreNumCheck:%s, freqCheck:%s, sdkIntCheck:%s, totalMemMBCheck:%s gpucheck:%s isARM64:%s", Integer.valueOf(a), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(C59686x0.f170509d), Integer.valueOf(i3), Long.valueOf(g), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z6));
        if (!z7) {
            wf = false;
        }
        String k = C87203t.m108275k();
        C87412m.m108593f(k, "getModel()");
        Locale locale = Locale.getDefault();
        C87412m.m108593f(locale, "getDefault()");
        String lowerCase = k.toLowerCase(locale);
        C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_finder_video_disable_h266_download, "");
        C87412m.m108593f(Y60, "getService(IExptService:…isable_h266_download, \"\")");
        if (!Util.isNullOrNil(Y60) && C112550d0.m153801u(Y60, lowerCase, false)) {
            Log.m105925i("ThumbPlayer.MMTPPlayerH266Ability", "h266 switch model %s is hit, expt:%s", lowerCase, Y60);
            wf = false;
        }
        boolean z8 = C37521f.f99247O3.mo60266n().intValue() > 0;
        C59686x0.f170506a = wf || z8;
        Log.m105925i("ThumbPlayer.MMTPPlayerH266Ability", "h266 switch configResult: %s debugH266Switch:%s deviceAbility: %s ", Boolean.valueOf(wf), Boolean.valueOf(z8), Boolean.valueOf(z7));
        int f2 = aVar.mo163483f();
        fVar.getClass();
        int intValue = C37521f.f99273R3.mo60266n().intValue();
        C59686x0.f170508c = f2 >= intValue;
        Log.m105925i("ThumbPlayer.MMTPPlayerH266Ability", "720p gpu scroe %s gpuThreshold: %s ", Integer.valueOf(f2), Integer.valueOf(intValue));
        int f3 = aVar.mo163483f();
        fVar.getClass();
        int intValue2 = C37521f.f99264Q3.mo60266n().intValue();
        C59686x0.f170507b = f3 >= intValue2;
        Log.m105925i("ThumbPlayer.MMTPPlayerH266Ability", "1080p gpu scroe %s gpuThreshold: %s ", Integer.valueOf(f3), Integer.valueOf(intValue2));
        int a2 = C107842p.m146108a();
        int i4 = (a2 >> 12) & 15;
        int i5 = a2 & 255;
        int f4 = aVar.mo163483f();
        long g2 = (C90773a.m113841g(MMApplicationContext.getContext()) / j) / j;
        boolean z9 = i4 >= 4;
        boolean z15 = i5 >= 71;
        boolean z16 = i3 >= 23;
        boolean z17 = g2 >= 4096;
        fVar.getClass();
        boolean z18 = f4 >= C37521f.f99240N3.mo60266n().intValue();
        boolean z19 = C107835h0.f322845b.f322801P != 1;
        Log.m105925i("ThumbPlayer.MMTPPlayerSharpenAbility", "checkRendererSharpenLocalConfig, cpuFlags:%s, nCores:%s,gpuScore %s nFreq:%s, sdkInt:%s, totalMemMB:%s, coreNumCheck:%s, freqCheck:%s, sdkIntCheck:%s, totalMemMBCheck:%s gpuCheck:%s phoneCheck:%s", Integer.valueOf(a2), Integer.valueOf(i4), Integer.valueOf(f4), Integer.valueOf(i5), Integer.valueOf(i3), Long.valueOf(g2), Boolean.valueOf(z9), Boolean.valueOf(z15), Boolean.valueOf(z16), Boolean.valueOf(z17), Boolean.valueOf(z18), Boolean.valueOf(z19));
        C59656d1.f170480a = z9 && z15 && z16 && z17 && z18 && z19;
    }

    public boolean fe0() {
        T t;
        Set<AppCompatActivity> set = this.f160893s;
        C87412m.m108593f(set, "enterFinderActivity");
        Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(((AppCompatActivity) t).getClass(), FinderHomeAffinityUI.class)) {
                break;
            }
        }
        return t != null;
    }

    public boolean iu0(Activity activity) {
        T t;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (!C86709a0.m107522a()) {
            Log.m105920e("FinderMultiTaskService", "isFinderTaskForeground: acc not ready");
            return false;
        }
        Set<AppCompatActivity> set = this.f160893s;
        C87412m.m108593f(set, "enterFinderActivity");
        Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(((AppCompatActivity) t).getClass(), FinderHomeAffinityUI.class)) {
                break;
            }
        }
        AppCompatActivity appCompatActivity = (AppCompatActivity) t;
        return appCompatActivity != null && appCompatActivity.getTaskId() == activity.getTaskId();
    }

    /* renamed from: kf */
    public void mo78754kf(Context context, int i) {
        Intent intent;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_MULTI_TASK_GUIDE_WITHOUT_NAVI_BOOLEAN_SYNC;
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_FINDER_MULTI_TASK_GUIDE_WITH_NAVI_BOOLEAN_SYNC;
        C87412m.m108594g(context, "context");
        if (!C86709a0.m107522a()) {
            Log.m105920e("FinderMultiTaskService", "checkShowMultiTaskDialog: acc not ready");
        } else if (this.f160887j && C37521f.f99374d.mo61188n()) {
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity == null || (intent = activity.getIntent()) == null || !intent.getBooleanExtra("KEY_REENTER_FINDER", false)) {
                this.f160887j = false;
                if (this.f160888n == null) {
                    this.f160888n = Boolean.valueOf(C86709a0.m107535s().mo121142i().mo119686g(aVar2, false));
                    C13598b0 b0Var = C13598b0.f38549a;
                }
                if (this.f160889o == null) {
                    this.f160889o = Boolean.valueOf(C86709a0.m107535s().mo121142i().mo119686g(aVar, false));
                    C13598b0 b0Var2 = C13598b0.f38549a;
                }
                Boolean bool = this.f160888n;
                Boolean bool2 = Boolean.TRUE;
                if (!C87412m.m108589b(bool, bool2) || !C87412m.m108589b(this.f160889o, bool2)) {
                    Log.m105924i("FinderMultiTaskService", "checkShowMultiTaskDialog: withNaviAnimShown = " + this.f160888n + ", withNaviAnimShown = " + this.f160888n);
                    int e = C75044y4.m89993e(context);
                    boolean z = e > 0 && C85875k4.m106188j(context) <= e;
                    if (!((z && C87412m.m108589b(this.f160888n, bool2)) || (!z && C87412m.m108589b(this.f160889o, bool2)))) {
                        C101218e0 e0Var = new C101218e0(context, 2, 0, true);
                        e0Var.mo140676v(1);
                        e0Var.mo140677w(context.getString(C0966R.string.f8028zq));
                        e0Var.f296375F = new C56296c(e0Var, this);
                        e0Var.mo140662i(C0966R.C0971layout.amn);
                        PAGView pAGView = (PAGView) e0Var.f296384g.findViewById(C0966R.C0970id.est);
                        if (pAGView != null) {
                            pAGView.setComposition(PAGFile.Load(context.getAssets(), z ? "finder_multi_task_guide_with_navigation_bar.pag" : "finder_multi_task_guide_without_navigation_bar.pag"));
                            pAGView.setRepeatCount(0);
                            pAGView.play();
                        }
                        e0Var.mo140665l(new C56297d(e0Var, this, i));
                        e0Var.mo140655A();
                        yx0(true, i, 0);
                        this.f160896v = C31543z5.m39453c();
                        this.f160897w = false;
                        if (z) {
                            C86709a0.m107535s().mo121142i().mo119677K(aVar2, bool2);
                            this.f160888n = bool2;
                            return;
                        }
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, bool2);
                        this.f160889o = bool2;
                        return;
                    }
                    return;
                }
                return;
            }
            intent.removeExtra("KEY_REENTER_FINDER");
        }
    }

    /* renamed from: lM */
    public void mo78755lM() {
        C61926c.m72666K(0, new C56295b(this));
    }

    public void s20() {
        Set<AppCompatActivity> set = this.f160892r;
        C87412m.m108593f(set, "foregroundFinderActivity");
        AppCompatActivity appCompatActivity = (AppCompatActivity) C110818d0.m150924V(set);
        if (appCompatActivity != null) {
            FinderVideoPassiveMiniViewHelper.C55856d dVar = FinderVideoPassiveMiniViewHelper.f159083D;
            if (!((Set) ((C36570n) FinderVideoPassiveMiniViewHelper.f159084E).getValue()).contains(appCompatActivity.getClass())) {
                appCompatActivity = null;
            }
            if (appCompatActivity != null) {
                C7435f2 f2Var = C7435f2.f25626a;
                C13442s8 f = C13442s8.f38060Q0.mo12873f(appCompatActivity);
                f2Var.mo8577a(f != null ? f.mo12861q3() : null, "wechat_push_card", 0, (JSONObject) null);
            }
        }
    }

    public Activity ub0() {
        Set<AppCompatActivity> set = this.f160892r;
        C87412m.m108593f(set, "foregroundFinderActivity");
        return (Activity) C110818d0.m150924V(set);
    }

    public final int vx0() {
        return ((Number) ((C36570n) this.f160891q).getValue()).intValue();
    }

    /* renamed from: w2 */
    public void mo78759w2() {
        if (!C86709a0.m107522a()) {
            Log.m105920e("FinderMultiTaskService", "onLauncherUIStart: acc not ready");
            return;
        }
        Set<AppCompatActivity> set = this.f160892r;
        C87412m.m108593f(set, "foregroundFinderActivity");
        AppCompatActivity appCompatActivity = (AppCompatActivity) C110818d0.m150924V(set);
        C13598b0 b0Var = null;
        if (appCompatActivity != null) {
            if (!(!appCompatActivity.isFinishing())) {
                appCompatActivity = null;
            }
            if (appCompatActivity != null) {
                Log.m105924i("FinderMultiTaskService", "onLauncherUIStart: finder activity is still foreground");
                this.f160882e = true;
                b0Var = C13598b0.f38549a;
            }
        }
        if (b0Var == null) {
            Log.m105924i("FinderMultiTaskService", "onLauncherUIStart: isHomeFromFinder = " + this.f160881d);
            this.f160882e = this.f160881d;
        }
    }

    public final boolean wx0() {
        if (this.f160892r.size() != 0 || this.f160893s.size() <= 0) {
            return false;
        }
        Set<AppCompatActivity> set = this.f160893s;
        C87412m.m108593f(set, "enterFinderActivity");
        for (AppCompatActivity appCompatActivity : set) {
            if (C87412m.m108589b(appCompatActivity.getClass(), FinderHomeAffinityUI.class)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a3 A[SYNTHETIC, Splitter:B:29:0x00a3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void xx0() {
        /*
            r15 = this;
            r0 = 0
            r15.f160881d = r0
            r15.f160883f = r0
            boolean r1 = r15.f160882e
            if (r1 != 0) goto L_0x0120
            long r1 = r15.f160890p
            r3 = 0
            java.lang.String r5 = "FinderMultiTaskService"
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x00fe
            int r1 = r15.vx0()
            long r1 = (long) r1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x001e
            goto L_0x00fe
        L_0x001e:
            long r1 = java.lang.System.currentTimeMillis()
            long r6 = r15.f160890p
            long r1 = r1 - r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "checkClearFinderTask: timeDiff="
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = ", cleanThreshold="
            r6.append(r7)
            int r7 = r15.vx0()
            int r7 = r7 * 1000
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            int r6 = r15.vx0()
            int r6 = r6 * 1000
            long r6 = (long) r6
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0120
            r1 = 0
            r2 = 1
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x008f }
            java.lang.String r7 = "activity"
            java.lang.Object r6 = r6.getSystemService(r7)     // Catch:{ all -> 0x008f }
            boolean r7 = r6 instanceof android.app.ActivityManager     // Catch:{ all -> 0x008f }
            if (r7 == 0) goto L_0x0065
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6     // Catch:{ all -> 0x008f }
            goto L_0x0066
        L_0x0065:
            r6 = r1
        L_0x0066:
            if (r6 == 0) goto L_0x0099
            java.util.List r6 = r6.getRunningTasks(r2)     // Catch:{ all -> 0x008f }
            if (r6 == 0) goto L_0x0099
            java.lang.Object r6 = sx3.C110818d0.m150916N(r6)     // Catch:{ all -> 0x008f }
            android.app.ActivityManager$RunningTaskInfo r6 = (android.app.ActivityManager.RunningTaskInfo) r6     // Catch:{ all -> 0x008f }
            if (r6 == 0) goto L_0x0099
            android.content.ComponentName r6 = r6.baseActivity     // Catch:{ all -> 0x008f }
            if (r6 == 0) goto L_0x0099
            java.lang.String r6 = r6.getClassName()     // Catch:{ all -> 0x008f }
            if (r6 == 0) goto L_0x0099
            java.lang.Class<com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI> r7 = com.tencent.p014mm.plugin.finder.p056ui.FinderHomeAffinityUI.class
            ny3.d r7 = gy3.C24560g0.m30725a(r7)     // Catch:{ all -> 0x008f }
            java.lang.String r7 = r7.mo51262e()     // Catch:{ all -> 0x008f }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x008f }
            goto L_0x009a
        L_0x008f:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r0] = r6
            java.lang.String r6 = "checkClearFinderTask: ams is dead"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r6, r7)
        L_0x0099:
            r6 = 0
        L_0x009a:
            if (r6 == 0) goto L_0x00a3
            java.lang.String r0 = "checkClearFinderTask: finder task foreground, do not clean"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x0120
        L_0x00a3:
            java.util.Set<androidx.appcompat.app.AppCompatActivity> r6 = r15.f160893s     // Catch:{ all -> 0x00e0 }
            java.lang.String r7 = "enterFinderActivity"
            gy3.C87412m.m108593f(r6, r7)     // Catch:{ all -> 0x00e0 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x00e0 }
        L_0x00ae:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x00e0 }
            if (r7 == 0) goto L_0x00c8
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x00e0 }
            r8 = r7
            androidx.appcompat.app.AppCompatActivity r8 = (androidx.appcompat.app.AppCompatActivity) r8     // Catch:{ all -> 0x00e0 }
            java.lang.String r9 = "it"
            gy3.C87412m.m108593f(r8, r9)     // Catch:{ all -> 0x00e0 }
            boolean r8 = r15.iu0(r8)     // Catch:{ all -> 0x00e0 }
            if (r8 == 0) goto L_0x00ae
            r1 = r7
            goto L_0x00ae
        L_0x00c8:
            androidx.appcompat.app.AppCompatActivity r1 = (androidx.appcompat.app.AppCompatActivity) r1     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x0120
            r1.setResult(r0)     // Catch:{ all -> 0x00e0 }
            r1.finishAffinity()     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = "checkClearFinderTask: clean success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)     // Catch:{ all -> 0x00e0 }
            com.tencent.mm.plugin.finder.service.t0 r1 = new com.tencent.mm.plugin.finder.service.t0     // Catch:{ all -> 0x00e0 }
            r1.<init>(r15)     // Catch:{ all -> 0x00e0 }
            o40.C61926c.m72666K(r3, r1)     // Catch:{ all -> 0x00e0 }
            goto L_0x0120
        L_0x00e0:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r1
            java.lang.String r0 = "checkClearFinderTask1: crash,"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r2)
            ft1.a r6 = ft1.C59319a.f169618b
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            com.tencent.mm.plugin.finder.service.u0 r12 = new com.tencent.mm.plugin.finder.service.u0
            r12.<init>(r1)
            r13 = 28
            r14 = 0
            java.lang.String r7 = "clearFinderTaskCrash1"
            o40.C11348f.C11349a.m11178b(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0120
        L_0x00fe:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "checkClearFinderTask: do not clean, finderBackgroundTimestamp="
            r0.append(r1)
            long r1 = r15.f160890p
            r0.append(r1)
            java.lang.String r1 = ", cleanMultiTaskThreshold="
            r0.append(r1)
            int r1 = r15.vx0()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.service.C56294r0.xx0():void");
    }

    public final void yx0(boolean z, int i, int i2) {
        if (z) {
            this.f160896v = C31543z5.m39453c();
        }
        FinderMultiTaskGuideShowStruct finderMultiTaskGuideShowStruct = new FinderMultiTaskGuideShowStruct();
        finderMultiTaskGuideShowStruct.f155736d = (long) i;
        if (!z) {
            if (this.f160896v != 0) {
                finderMultiTaskGuideShowStruct.f155738f = C31543z5.m39453c() - this.f160896v;
                finderMultiTaskGuideShowStruct.f155737e = (long) i2;
                this.f160896v = 0;
            } else {
                return;
            }
        }
        finderMultiTaskGuideShowStruct.mo86054n();
        ((C58417y0) C86312j.m106911c(C58417y0.class)).Ec0(finderMultiTaskGuideShowStruct);
    }
}
