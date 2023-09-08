package com.tencent.p014mm.plugin.appbrand.app;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.C84803v;
import com.tencent.p014mm.plugin.appbrand.app.C81144a;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShellClientProcessHelper;
import com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShellClientProcessHelper$receiver$1;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.C55548a;
import com.tencent.p014mm.plugin.appbrand.report.C84125k;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.plugin.appbrand.task.C84274b0;
import com.tencent.p014mm.plugin.appbrand.task.ipc.AppBrandProcessSuicideNotifyTask$Args;
import com.tencent.p014mm.plugin.magicbrush.C85282s0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import eb0.C86493v0;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import js0.C88015a;
import k20.C60958c;
import k20.C9556a;
import kj2.C117407d;
import p910lj.C76701a;
import ur0.C90726c;
import x20.C15618a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.app.AppBrandProcessSuicideLogic */
public final class AppBrandProcessSuicideLogic extends C88015a {

    /* renamed from: g */
    public static final AtomicBoolean f238430g = new AtomicBoolean(false);

    /* renamed from: h */
    public static final AppBrandProcessSuicideLogic f238431h = new AppBrandProcessSuicideLogic();

    /* renamed from: d */
    public final AtomicInteger f238432d = new AtomicInteger(0);

    /* renamed from: e */
    public final AtomicBoolean f238433e = new AtomicBoolean();

    /* renamed from: f */
    public final Set<Activity> f238434f = new HashSet();

    /* renamed from: com.tencent.mm.plugin.appbrand.app.AppBrandProcessSuicideLogic$RebootProcessAndTask */
    public static class RebootProcessAndTask extends MainProcessTask {
        public static final Parcelable.Creator<RebootProcessAndTask> CREATOR = new C81136b();

        /* renamed from: f */
        public String f238435f;

        /* renamed from: g */
        public AppBrandInitConfigWC f238436g;

        /* renamed from: h */
        public AppBrandStatObject f238437h;

        /* renamed from: i */
        public String f238438i;

        /* renamed from: com.tencent.mm.plugin.appbrand.app.AppBrandProcessSuicideLogic$RebootProcessAndTask$a */
        public class C81135a implements Runnable {
            public C81135a() {
            }

            public void run() {
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) RebootProcessAndTask.this.f238438i, 1).show();
                RebootProcessAndTask rebootProcessAndTask = RebootProcessAndTask.this;
                AppBrandInitConfigWC appBrandInitConfigWC = rebootProcessAndTask.f238436g;
                AppBrandStatObject appBrandStatObject = rebootProcessAndTask.f238437h;
                C87412m.m108594g(appBrandInitConfigWC, "cfg");
                C87412m.m108594g(appBrandStatObject, "stat");
                AppBrandProcessesManager.m103869I().mo111383E(MMApplicationContext.getContext(), new C84274b0(appBrandInitConfigWC, appBrandStatObject, (ActivityStarterIpcDelegate) null));
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.app.AppBrandProcessSuicideLogic$RebootProcessAndTask$b */
        public class C81136b implements Parcelable.Creator<RebootProcessAndTask> {
            public Object createFromParcel(Parcel parcel) {
                RebootProcessAndTask rebootProcessAndTask = new RebootProcessAndTask();
                rebootProcessAndTask.mo1551g(parcel);
                return rebootProcessAndTask;
            }

            public Object[] newArray(int i) {
                return new RebootProcessAndTask[i];
            }
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f238435f = parcel.readString();
            this.f238436g = (AppBrandInitConfigWC) parcel.readParcelable(AppBrandInitConfigWC.class.getClassLoader());
            this.f238437h = (AppBrandStatObject) parcel.readParcelable(AppBrandStatObject.class.getClassLoader());
            this.f238438i = parcel.readString();
        }

        /* renamed from: j */
        public void mo1553j() {
            C117407d.INSTANCE.idkeyStat(365, 5, 1, false);
            new Handler(Looper.getMainLooper()).postDelayed(new C81135a(), 500);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f238435f);
            parcel.writeParcelable(this.f238436g, i);
            parcel.writeParcelable(this.f238437h, i);
            parcel.writeString(this.f238438i);
        }
    }

    /* renamed from: N */
    public static void m99381N(AppBrandProcessSuicideLogic$$d appBrandProcessSuicideLogic$$d) {
        Iterator it = ((HashSet) f238431h.f238434f).iterator();
        while (it.hasNext()) {
            Activity activity = (Activity) it.next();
            if (activity instanceof AppBrandUI) {
                activity.finish();
            }
        }
        ((C119157j) C119157j.f356862d).mo183871b(new AppBrandProcessSuicideLogic$$a(appBrandProcessSuicideLogic$$d), "MicroMsg.AppBrandProcessSuicideLogic");
    }

    /* renamed from: M */
    public final void mo113317M(Class<? extends Activity> cls, AppBrandProcessSuicideLogic$$d appBrandProcessSuicideLogic$$d) {
        AppBrandProcessSuicideLogic$$d appBrandProcessSuicideLogic$$d2 = appBrandProcessSuicideLogic$$d;
        int selfMemInMB = Util.getSelfMemInMB(C86709a0.m107531m().mo58407a().f124990c);
        Log.m105925i("MicroMsg.AppBrandReporterManager", "report now process mem : %d", Integer.valueOf(selfMemInMB));
        int i = selfMemInMB <= 90 ? 2 : selfMemInMB <= 130 ? 3 : selfMemInMB <= 170 ? 4 : selfMemInMB <= 210 ? 5 : 6;
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(386, 1, 1, false);
        nVar.idkeyStat(386, (long) i, 1, false);
        try {
            KVCommCrossProcessReceiver.m162690b();
            C55548a.m63179d(true);
            C84125k.f245593a.mo116792c("cleanupAndSuicideInWorker", false);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrandProcessSuicideLogic", e, "sendKV", new Object[0]);
        }
        if (DebuggerShell.f239772d && DebuggerShell.f239771c) {
            return;
        }
        if (MMApplicationContext.isMainProcess()) {
            Log.m105921e("MicroMsg.AppBrandProcessSuicideLogic", "cleanupAndSuicideInWorker, lastActivity:%s, reason:%s, skip for main process.", cls, appBrandProcessSuicideLogic$$d2);
        } else if (!MMApplicationContext.getProcessName().endsWith("appbrand1") || !C85282s0.f248437b) {
            boolean z = !C84803v.f247240a.isEmpty();
            if (C81144a.C81145a.f238455a == null || C81144a.C81145a.f238456b == null) {
                try {
                    C81144a.m99391a((Application) MMApplicationContext.getContext().getApplicationContext());
                } catch (Throwable th) {
                    Log.m105921e("MicroMsg.AppBrandProcessSuicideLogic.ActivityThreadHackDetector", "hack ActivityThread failed %s", th);
                }
            }
            Handler handler = C81144a.C81145a.f238456b;
            boolean z2 = handler != null && (handler.hasMessages(100) || handler.hasMessages(126) || ((Build.VERSION.SDK_INT == 28 && handler.hasMessages(160)) || handler.hasMessages(159)));
            Log.m105925i("MicroMsg.AppBrandProcessSuicideLogic", "before suicide, dump DataCenter %s", C86493v0.m107224d().toString());
            Object[] objArr = new Object[1];
            objArr[0] = cls == null ? "null" : cls.getName();
            Log.m105925i("MicroMsg.AppBrandProcessSuicideLogic", "before suicide, last activity is %s", objArr);
            Log.m105925i("MicroMsg.AppBrandProcessSuicideLogic", "before suicide, mActivityRecreatingByConfigurationChanged %B", Boolean.valueOf(this.f238433e.get()));
            Log.m105925i("MicroMsg.AppBrandProcessSuicideLogic", "before suicide, hasPersistentRuntimes %B", Boolean.valueOf(z));
            Log.m105925i("MicroMsg.AppBrandProcessSuicideLogic", "before suicide, hasPendingLaunchActivity %B", Boolean.valueOf(z2));
            Log.appenderFlushSync();
            if (!this.f238433e.get() && !z && !z2 && this.f238432d.get() <= 0) {
                DebuggerShellClientProcessHelper$receiver$1 debuggerShellClientProcessHelper$receiver$1 = DebuggerShellClientProcessHelper.f239774a;
                try {
                    MMApplicationContext.getContext().unregisterReceiver(DebuggerShellClientProcessHelper.f239774a);
                } catch (Throwable th4) {
                    Log.m105920e("MicroMsg.AppBrand.DebuggerShellClientProcessHelper", "unregisterReceiver get exception " + th4);
                }
                C87412m.m108594g(appBrandProcessSuicideLogic$$d2, TPReportKeys.PlayerStep.PLAYER_REASON);
                if (MMApplicationContext.isMMProcessExist()) {
                    String processName = MMApplicationContext.getProcessName();
                    C87412m.m108593f(processName, "getProcessName()");
                    C15618a.m14626b(new AppBrandProcessSuicideNotifyTask$Args(processName, Util.nowMilliSecond(), appBrandProcessSuicideLogic$$d2.f238449d), new C90726c(), (C1256g) null);
                }
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                Object obj = new Object();
                C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/app/AppBrandProcessSuicideLogic", "cleanupAndSuicideInWorker", "(Ljava/lang/Class;Lcom/tencent/mm/plugin/appbrand/app/AppBrandProcessSuicideLogic$SUICIDE_REASON;)V", "java/lang/System_EXEC_", "exit", "(I)V");
                System.exit(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(obj, "com/tencent/mm/plugin/appbrand/app/AppBrandProcessSuicideLogic", "cleanupAndSuicideInWorker", "(Ljava/lang/Class;Lcom/tencent/mm/plugin/appbrand/app/AppBrandProcessSuicideLogic$SUICIDE_REASON;)V", "java/lang/System_EXEC_", "exit", "(I)V");
            }
        } else {
            Log.m105921e("MicroMsg.AppBrandProcessSuicideLogic", "cleanupAndSuicideInWorker, but mb2.0 is running, lastActivity:%s, reason: %s", cls, appBrandProcessSuicideLogic$$d2);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f238433e.set(false);
        if (((HashSet) this.f238434f).add(activity)) {
            this.f238432d.incrementAndGet();
        }
    }

    public void onActivityDestroyed(Activity activity) {
        if ((((HashSet) this.f238434f).remove(activity) ? this.f238432d.decrementAndGet() : this.f238432d.get()) == 0) {
            ((C119157j) C119157j.f356862d).mo183871b(new AppBrandProcessSuicideLogic$$c(this, activity.getClass()), "MicroMsg.AppBrandProcessSuicideLogic");
        }
    }

    public void onActivityStopped(Activity activity) {
        if ((activity instanceof AppBrandUI) && activity.isFinishing()) {
            C84125k.f245593a.mo116792c("onActivityStopped", false);
        }
    }
}
