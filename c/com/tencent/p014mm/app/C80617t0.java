package com.tencent.p014mm.app;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.tencent.matrix.lifecycle.C80403e;
import com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner;
import com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import oa1.C117731d;
import p261wl.C15510f;
import p261wl.C38166b;
import p261wl.C38174i;
import zt3.C119157j;

/* renamed from: com.tencent.mm.app.t0 */
public final class C80617t0 {

    /* renamed from: c */
    public static volatile C80617t0 f235846c;

    /* renamed from: a */
    public boolean f235847a = false;

    /* renamed from: b */
    public final List<C80620c> f235848b = new LinkedList();

    /* renamed from: com.tencent.mm.app.t0$a */
    public class C80618a extends C80403e {
        public C80618a() {
        }

        /* renamed from: a */
        public void mo56329a() {
            ProcessUILifecycleOwner.f235399x.getClass();
            String str = ProcessUILifecycleOwner.f235392q;
            ((C119157j) C119157j.f356862d).mo183895z(new t0$a$$b(this, str));
        }

        /* renamed from: b */
        public void mo56330b() {
            ProcessUILifecycleOwner.f235399x.getClass();
            String str = ProcessUILifecycleOwner.f235392q;
            ((C119157j) C119157j.f356862d).mo183895z(new t0$a$$a(this, str));
        }
    }

    /* renamed from: com.tencent.mm.app.t0$b */
    public class C80619b implements Application.ActivityLifecycleCallbacks {

        /* renamed from: d */
        public int f235850d = 0;

        /* renamed from: e */
        public boolean f235851e = false;

        public C80619b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            String str = activity.getClass().getName() + "@" + activity.hashCode();
            Log.m105924i("MicroMsg.ProcForegroundDelegate", "#onStarted: " + str + ", refs = " + this.f235850d);
            int i = this.f235850d + 1;
            this.f235850d = i;
            if (i == 1 && !this.f235851e) {
                C80617t0.m98254b(C80617t0.this, str);
            }
        }

        public void onActivityStopped(Activity activity) {
            String str = activity.getClass().getName() + "@" + activity.hashCode();
            Log.m105924i("MicroMsg.ProcForegroundDelegate", "#onStopped: " + str + ", refs = " + this.f235850d);
            boolean isChangingConfigurations = activity.isChangingConfigurations();
            this.f235851e = isChangingConfigurations;
            int i = this.f235850d + -1;
            this.f235850d = i;
            if (i == 0 && !isChangingConfigurations) {
                C80617t0.m98253a(C80617t0.this, str);
            }
        }
    }

    /* renamed from: com.tencent.mm.app.t0$c */
    public interface C80620c {
        /* renamed from: J0 */
        void mo31867J0(String str);

        /* renamed from: h2 */
        void mo31871h2(String str);
    }

    /* renamed from: com.tencent.mm.app.t0$d */
    public interface C80621d extends C15510f {
        /* renamed from: J0 */
        void mo58534J0(String str);

        /* renamed from: h2 */
        void mo58535h2(String str);
    }

    public C80617t0(Context context) {
        int i;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        boolean z = false;
        if (C117731d.m166007c().mo182444f("clicfg_battery_use_matrix_lifecycle", "1", false, true).equals("1")) {
            ProcessUIStartedStateOwner processUIStartedStateOwner = ProcessUIStartedStateOwner.INSTANCE;
            this.f235847a = processUIStartedStateOwner.isForeground();
            processUIStartedStateOwner.addLifecycleCallback((C80403e) new C80618a());
            return;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (!TextUtils.isEmpty(next.processName) && next.processName.startsWith(context.getPackageName())) {
                    i = next.importance;
                    break;
                }
            }
        }
        i = -1;
        if (i != -1) {
            this.f235847a = i <= 100 ? true : z;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C80619b());
    }

    /* renamed from: a */
    public static void m98253a(C80617t0 t0Var, String str) {
        t0Var.getClass();
        Log.m105924i("MicroMsg.ProcForegroundDelegate", "onProcessBackground");
        t0Var.f235847a = false;
        synchronized (t0Var.f235848b) {
            for (C80620c next : t0Var.f235848b) {
                if (next != null) {
                    next.mo31867J0(str);
                }
            }
        }
        C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C80621d.class);
        C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
        while (bVar.hasNext()) {
            C38174i iVar = (C38174i) bVar.next();
            if (C38166b.m41757d(C38166b.f100836c, iVar)) {
                ((C80621d) ((C15510f) iVar.get())).mo58534J0(str);
            }
        }
    }

    /* renamed from: b */
    public static void m98254b(C80617t0 t0Var, String str) {
        t0Var.getClass();
        Log.m105924i("MicroMsg.ProcForegroundDelegate", "onProcessForeground");
        t0Var.f235847a = true;
        synchronized (t0Var.f235848b) {
            for (C80620c next : t0Var.f235848b) {
                if (next != null) {
                    next.mo31871h2(str);
                }
            }
        }
        C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C80621d.class);
        C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
        while (bVar.hasNext()) {
            C38174i iVar = (C38174i) bVar.next();
            if (C38166b.m41757d(C38166b.f100836c, iVar)) {
                ((C80621d) ((C15510f) iVar.get())).mo58535h2(str);
            }
        }
    }

    /* renamed from: d */
    public static C80617t0 m98255d() {
        if (f235846c == null) {
            synchronized ("MicroMsg.ProcForegroundDelegate") {
                if (f235846c == null) {
                    throw new IllegalStateException("Call #init() first!");
                }
            }
        }
        return f235846c;
    }

    /* renamed from: e */
    public static List<View> m98256e() {
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Object invoke = cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
            String[] strArr = (String[]) cls.getDeclaredMethod("getViewRootNames", new Class[0]).invoke(invoke, new Object[0]);
            if (strArr != null) {
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    Object invoke2 = cls.getDeclaredMethod("getRootView", new Class[]{String.class}).invoke(invoke, new Object[]{str});
                    if (invoke2 instanceof View) {
                        arrayList.add((View) invoke2);
                    }
                }
                return arrayList;
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.ProcForegroundDelegate", th, "getBallInfoListSync fail!", new Object[0]);
        }
        return Collections.emptyList();
    }

    /* renamed from: c */
    public void mo112357c(C80620c cVar) {
        synchronized (this.f235848b) {
            if (!this.f235848b.contains(cVar)) {
                this.f235848b.add(cVar);
            }
        }
    }

    /* renamed from: f */
    public void mo112358f(C80620c cVar) {
        synchronized (this.f235848b) {
            ListIterator<C80620c> listIterator = this.f235848b.listIterator();
            while (listIterator.hasNext()) {
                if (listIterator.next() == cVar) {
                    listIterator.remove();
                }
            }
        }
    }
}
