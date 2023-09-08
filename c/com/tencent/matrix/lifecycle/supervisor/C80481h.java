package com.tencent.matrix.lifecycle.supervisor;

import android.app.ActivityManager;
import android.app.Application;
import android.os.DeadObjectException;
import android.os.Process;
import com.tencent.matrix.lifecycle.C80392a0;
import com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner;
import com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner;
import com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner;
import com.tencent.matrix.lifecycle.supervisor.C28665d;
import com.tencent.matrix.util.JavaMemInfo;
import com.tencent.matrix.util.MemInfo;
import com.tencent.matrix.util.NativeMemInfo;
import com.tencent.matrix.util.ProcessInfo;
import com.tencent.matrix.util.PssInfo;
import com.tencent.matrix.util.StatusInfo;
import com.tencent.matrix.util.SystemInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32228q;
import fy3.C32229r;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import k20.C60958c;
import k20.C9556a;
import p723vf.C118672d;
import p723vf.C90776b;
import p723vf.C90779e;
import p723vf.C90787j;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.matrix.lifecycle.supervisor.h */
public final class C80481h {

    /* renamed from: a */
    public static final C13601g f235475a = C36568h.m40985a(C80486c.f235487d);

    /* renamed from: b */
    public static final C13601g f235476b = C36568h.m40985a(C80487d.f235488d);

    /* renamed from: c */
    public static final ArrayList<C32228q<String, String, Integer, Boolean>> f235477c = new ArrayList<>();

    /* renamed from: d */
    public static final ArrayList<C32229r<String, String, Integer, Boolean, C13598b0>> f235478d = new ArrayList<>();

    /* renamed from: e */
    public static final C80477c f235479e = new C80488e();

    /* renamed from: f */
    public static final C80481h f235480f = new C80481h();

    /* renamed from: com.tencent.matrix.lifecycle.supervisor.h$a */
    public static final class C80482a {

        /* renamed from: a */
        public final C13601g f235481a = C36568h.m40986b(C13602i.SYNCHRONIZED, C80483b.f235482d);

        /* renamed from: com.tencent.matrix.lifecycle.supervisor.h$a$a */
        public static final class C28670a extends C87413o implements C32226l<Map.Entry<? extends ProcessToken, ? extends C28665d>, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ String f78647d;

            /* renamed from: e */
            public final /* synthetic */ String f78648e;

            /* renamed from: f */
            public final /* synthetic */ boolean f78649f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C28670a(String str, String str2, boolean z) {
                super(1);
                this.f78647d = str;
                this.f78648e = str2;
                this.f78649f = z;
            }

            public Object invoke(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                C87412m.m108594g(entry, LocaleUtil.ITALIAN);
                ((C28665d) entry.getValue()).mo56254DX(this.f78647d, this.f78648e, this.f78649f);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.matrix.lifecycle.supervisor.h$a$b */
        public static final class C80483b extends C87413o implements C32224a<ConcurrentHashMap<ProcessToken, C28665d>> {

            /* renamed from: d */
            public static final C80483b f235482d = new C80483b();

            public C80483b() {
                super(0);
            }

            public Object invoke() {
                return new ConcurrentHashMap();
            }
        }

        /* renamed from: a */
        public final void mo112019a(ProcessToken processToken, String str, String str2, boolean z) {
            C87412m.m108594g(processToken, "supervisorToken");
            ConcurrentHashMap<ProcessToken, C28665d> c = mo112021c();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : c.entrySet()) {
                if (!C87412m.m108589b((ProcessToken) next.getKey(), processToken)) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            mo112020b(linkedHashMap, new C28670a(str, str2, z));
        }

        /* renamed from: b */
        public final void mo112020b(Map<ProcessToken, ? extends C28665d> map, C32226l<? super Map.Entry<ProcessToken, ? extends C28665d>, C13598b0> lVar) {
            for (Map.Entry next : map.entrySet()) {
                try {
                    lVar.invoke(next);
                    C13598b0 b0Var = C13598b0.f38549a;
                } catch (Throwable th) {
                    C80481h hVar = C80481h.f235480f;
                    String a = C80481h.m98049a(hVar);
                    C118672d.m167354d(a, th, ((ProcessToken) next.getKey()).f235426e + ((ProcessToken) next.getKey()).f235427f, new Object[0]);
                    if (th instanceof DeadObjectException) {
                        String a2 = C80481h.m98049a(hVar);
                        C118672d.m167352b(a2, "remote process of proxy is dead, remove proxy: " + ((ProcessToken) next.getKey()), new Object[0]);
                        mo112021c().remove(next.getKey());
                    }
                }
            }
        }

        /* renamed from: c */
        public final ConcurrentHashMap<ProcessToken, C28665d> mo112021c() {
            return (ConcurrentHashMap) this.f235481a.getValue();
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.supervisor.h$b */
    public static final class C80484b extends C28665d.C28666a {

        /* renamed from: e */
        public boolean f235483e;

        /* renamed from: f */
        public final Application f235484f;

        /* renamed from: com.tencent.matrix.lifecycle.supervisor.h$b$a */
        public static final class C80485a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C80484b f235485d;

            /* renamed from: e */
            public final /* synthetic */ ProcessToken f235486e;

            public C80485a(C80484b bVar, ProcessToken processToken) {
                this.f235485d = bVar;
                this.f235486e = processToken;
            }

            public final void run() {
                ProcessUILifecycleOwner.f235399x.getClass();
                if (ProcessUILifecycleOwner.f235390o.active() || ForegroundServiceLifecycleOwner.INSTANCE.hasForegroundService() || OverlayWindowLifecycleOwner.INSTANCE.hasVisibleWindow()) {
                    String a = C80481h.m98049a(C80481h.f235480f);
                    try {
                        ProcessSupervisor.f235421k.getClass();
                        C80478e eVar = ProcessSupervisor.f235416f;
                        if (eVar != null) {
                            eVar.mo112007st(this.f235486e);
                        }
                    } catch (Throwable th) {
                        C118672d.m167354d(a, th, "", new Object[0]);
                    }
                    C118672d.m167353c(ProcessSupervisor.f235421k.mo111975b(), "recheck: process is on foreground", new Object[0]);
                    return;
                }
                String a2 = C80481h.m98049a(C80481h.f235480f);
                try {
                    ProcessSupervisor.f235421k.getClass();
                    C80478e eVar2 = ProcessSupervisor.f235416f;
                    if (eVar2 != null) {
                        eVar2.ul0(this.f235486e);
                    }
                } catch (Throwable th4) {
                    C118672d.m167354d(a2, th4, "", new Object[0]);
                }
                ProcessSupervisor processSupervisor = ProcessSupervisor.f235421k;
                String b = processSupervisor.mo111975b();
                StringBuilder sb = new StringBuilder();
                sb.append("actual kill !!! supervisor = ");
                processSupervisor.getClass();
                sb.append(ProcessSupervisor.f235416f);
                C118672d.m167352b(b, sb.toString(), new Object[0]);
                String a3 = C90779e.m113846a(this.f235485d.f235484f);
                C87412m.m108593f(a3, "MatrixUtil.getProcessName(app)");
                ActivityManager activityManager = ProcessUILifecycleOwner.f235378c;
                if (activityManager != null) {
                    ActivityManager.AppTask[] appTaskArr = new ActivityManager.AppTask[0];
                    try {
                        C87412m.m108591d(activityManager);
                        List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
                        C87412m.m108593f(appTasks, "activityManager!!.appTasks");
                        ArrayList arrayList = new ArrayList();
                        for (T next : appTasks) {
                            ActivityManager.AppTask appTask = (ActivityManager.AppTask) next;
                            ProcessUILifecycleOwner processUILifecycleOwner = ProcessUILifecycleOwner.f235399x;
                            C87412m.m108593f(appTask, LocaleUtil.ITALIAN);
                            ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                            C87412m.m108593f(taskInfo, "it.taskInfo");
                            if (processUILifecycleOwner.mo111925a(taskInfo, a3)) {
                                arrayList.add(next);
                            }
                        }
                        Object[] array = arrayList.toArray(new ActivityManager.AppTask[0]);
                        if (array != null) {
                            appTaskArr = (ActivityManager.AppTask[]) array;
                            for (ActivityManager.AppTask appTask2 : appTaskArr) {
                                String b2 = ProcessSupervisor.f235421k.mo111975b();
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("removed task ");
                                ActivityManager.RecentTaskInfo taskInfo2 = appTask2.getTaskInfo();
                                C87412m.m108593f(taskInfo2, "it.taskInfo");
                                sb4.append(C90787j.m113851a(taskInfo2));
                                C118672d.m167352b(b2, sb4.toString(), new Object[0]);
                                appTask2.finishAndRemoveTask();
                            }
                            int myPid = Process.myPid();
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(Integer.valueOf(myPid));
                            Object obj = new Object();
                            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/matrix/lifecycle/supervisor/ProcessSubordinate$Subordinate$dispatchKill$1$1", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                            Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(obj, "com/tencent/matrix/lifecycle/supervisor/ProcessSubordinate$Subordinate$dispatchKill$1$1", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    } catch (Throwable th5) {
                        C118672d.m167354d("Matrix.ProcessLifecycle", th5, "", new Object[0]);
                    }
                } else {
                    throw new IllegalStateException("NOT initialized yet");
                }
            }
        }

        public C80484b(Application application) {
            C87412m.m108594g(application, "app");
            this.f235484f = application;
        }

        /* renamed from: DX */
        public void mo56254DX(String str, String str2, boolean z) {
            C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            C87412m.m108594g(str2, "stateName");
            String a = C80481h.m98049a(C80481h.f235480f);
            if (z) {
                try {
                    DispatcherStateOwner.Companion.getClass();
                    DispatcherStateOwner dispatcherStateOwner = (DispatcherStateOwner) DispatcherStateOwner.dispatchOwners.get(str2);
                    if (dispatcherStateOwner != null) {
                        dispatcherStateOwner.dispatchOn();
                    }
                } catch (Throwable th) {
                    C118672d.m167354d(a, th, "", new Object[0]);
                }
            } else {
                DispatcherStateOwner.Companion.getClass();
                DispatcherStateOwner dispatcherStateOwner2 = (DispatcherStateOwner) DispatcherStateOwner.dispatchOwners.get(str2);
                if (dispatcherStateOwner2 != null) {
                    dispatcherStateOwner2.dispatchOff();
                }
            }
        }

        public void F60(String str, String str2, int i, boolean z) {
            String b;
            C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            C87412m.m108594g(str2, "targetProcess");
            String a = C80481h.m98049a(C80481h.f235480f);
            try {
                ArrayList<C32229r<String, String, Integer, Boolean, C13598b0>> arrayList = C80481h.f235478d;
                Integer valueOf = Integer.valueOf(i);
                Boolean valueOf2 = Boolean.valueOf(z);
                Iterator<C32229r<String, String, Integer, Boolean, C13598b0>> it = arrayList.iterator();
                while (it.hasNext()) {
                    C32229r next = it.next();
                    b = ProcessSupervisor.f235421k.mo111975b();
                    next.mo162I(str, str2, valueOf, valueOf2);
                }
            } catch (Throwable th) {
                C118672d.m167354d(a, th, "", new Object[0]);
            }
        }

        /* renamed from: b9 */
        public void mo56256b9(String str, String str2, int i) {
            C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            C87412m.m108594g(str2, "targetProcess");
            C80481h hVar = C80481h.f235480f;
            String a = C80481h.m98049a(hVar);
            try {
                ProcessSupervisor processSupervisor = ProcessSupervisor.f235421k;
                String b = processSupervisor.mo111975b();
                C118672d.m167351a(b, "receive kill target: " + i + '-' + str2, new Object[0]);
                boolean b2 = C80481h.m98050b(hVar, C80481h.f235477c, str, str2, Integer.valueOf(i));
                if (C87412m.m108589b(str2, C90779e.m113846a(this.f235484f)) && Process.myPid() == i) {
                    Application application = this.f235484f;
                    String str3 = true & true ? "" : null;
                    C87412m.m108594g(application, "context");
                    C87412m.m108594g(str3, "statefulName");
                    int myPid = Process.myPid();
                    String a2 = C90779e.m113846a(application);
                    C87412m.m108593f(a2, "MatrixUtil.getProcessName(context)");
                    ProcessToken processToken = new ProcessToken(myPid, a2, str3, false);
                    if (!b2 || !this.f235483e) {
                        C80392a0.f235326f.mo111887a().postDelayed(new C80485a(this, processToken), TimeUnit.SECONDS.toMillis(10));
                        return;
                    }
                    this.f235483e = true;
                    processSupervisor.getClass();
                    C80478e eVar = ProcessSupervisor.f235416f;
                    if (eVar != null) {
                        eVar.mo112005ed(processToken);
                    }
                    C118672d.m167352b(processSupervisor.mo111975b(), "rescued once !!!", new Object[0]);
                }
            } catch (Throwable th) {
                C118672d.m167354d(a, th, "", new Object[0]);
            }
        }

        /* renamed from: uY */
        public MemInfo mo56257uY() {
            String a = C80481h.m98049a(C80481h.f235480f);
            MemInfo memInfo = new MemInfo((ProcessInfo) null, (StatusInfo) null, (JavaMemInfo) null, (NativeMemInfo) null, (SystemInfo) null, new PssInfo(0, 0, 0, 0, 0, 0, 0, 0, 0, 511, (C8480h) null), new PssInfo(0, 0, 0, 0, 0, 0, 0, 0, 0, 511, (C8480h) null), (C90776b) null, 159, (C8480h) null);
            try {
                return MemInfo.f235669p.mo112157b();
            } catch (Throwable th) {
                C118672d.m167354d(a, th, "", new Object[0]);
                return memInfo;
            }
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.supervisor.h$c */
    public static final class C80486c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C80486c f235487d = new C80486c();

        public C80486c() {
            super(0);
        }

        public Object invoke() {
            return ProcessSupervisor.f235421k.mo111975b() + ".Subordinate";
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.supervisor.h$d */
    public static final class C80487d extends C87413o implements C32224a<C80482a> {

        /* renamed from: d */
        public static final C80487d f235488d = new C80487d();

        public C80487d() {
            super(0);
        }

        public Object invoke() {
            if (ProcessSupervisor.f235421k.mo111977d()) {
                return new C80482a();
            }
            throw new IllegalAccessException("NOT allow for subordinate processes");
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.supervisor.h$e */
    public static final class C80488e implements C80477c {
    }

    /* renamed from: a */
    public static final String m98049a(C80481h hVar) {
        hVar.getClass();
        return (String) ((C36570n) f235475a).getValue();
    }

    /* renamed from: b */
    public static final boolean m98050b(C80481h hVar, ArrayList arrayList, String str, String str2, Integer num) {
        hVar.getClass();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                C32228q qVar = (C32228q) it.next();
                ProcessSupervisor processSupervisor = ProcessSupervisor.f235421k;
                String b = processSupervisor.mo111975b();
                try {
                    boolean booleanValue = ((Boolean) qVar.invoke(str, str2, num)).booleanValue();
                    if (booleanValue) {
                        String b2 = processSupervisor.mo111975b();
                        C118672d.m167352b(b2, qVar.getClass() + " try to rescue process", new Object[0]);
                    }
                    if (z || booleanValue) {
                        z = true;
                    }
                } catch (Throwable th) {
                    C118672d.m167354d(b, th, "", new Object[0]);
                }
            }
        }
    }

    /* renamed from: c */
    public final C80482a mo112018c() {
        return (C80482a) ((C36570n) f235476b).getValue();
    }
}
