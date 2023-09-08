package com.tencent.matrix.lifecycle.supervisor;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.matrix.lifecycle.C80392a0;
import com.tencent.matrix.lifecycle.C80407h;
import com.tencent.matrix.lifecycle.IForegroundStatefulOwner;
import com.tencent.matrix.lifecycle.IStatefulOwner;
import com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner;
import com.tencent.matrix.lifecycle.supervisor.C80478e;
import com.tencent.matrix.lifecycle.supervisor.C80481h;
import com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import p723vf.C118672d;
import p723vf.C90779e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36570n;

/* renamed from: com.tencent.matrix.lifecycle.supervisor.j */
public final class C80489j implements ServiceConnection {

    /* renamed from: d */
    public final /* synthetic */ Application f235489d;

    /* renamed from: e */
    public final /* synthetic */ Intent f235490e;

    /* renamed from: com.tencent.matrix.lifecycle.supervisor.j$a */
    public static final class C80490a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C80489j f235491d;

        /* renamed from: e */
        public final /* synthetic */ IBinder f235492e;

        /* renamed from: com.tencent.matrix.lifecycle.supervisor.j$a$a */
        public static final class C80491a implements ProcessUILifecycleOwner.C80437b {
            /* renamed from: a */
            public void mo111931a(String str, String str2) {
                C87412m.m108594g(str, "newScene");
                C87412m.m108594g(str2, FirebaseAnalytics.C113379b.ORIGIN);
                ProcessSupervisor processSupervisor = ProcessSupervisor.f235421k;
                String b = processSupervisor.mo111975b();
                C118672d.m167351a(b, "onSceneChanged: " + str2 + " -> " + str, new Object[0]);
                processSupervisor.getClass();
                C80478e eVar = ProcessSupervisor.f235416f;
                if (eVar != null) {
                    String b2 = processSupervisor.mo111975b();
                    try {
                        eVar.mo112006ja(str);
                    } catch (Throwable th) {
                        C118672d.m167354d(b2, th, "", new Object[0]);
                    }
                }
            }
        }

        public C80490a(C80489j jVar, IBinder iBinder) {
            this.f235491d = jVar;
            this.f235492e = iBinder;
        }

        public final void run() {
            SupervisorPacemaker.f235439d.getClass();
            C80478e eVar = null;
            if (SupervisorPacemaker.f235438c != null) {
                ProcessUILifecycleOwner.f235399x.getClass();
                IForegroundStatefulOwner iForegroundStatefulOwner = ProcessUILifecycleOwner.f235390o;
                C80407h hVar = SupervisorPacemaker.f235438c;
                C87412m.m108591d(hVar);
                iForegroundStatefulOwner.removeObserver(hVar);
                SupervisorPacemaker.f235438c = null;
                C118672d.m167353c(ProcessSupervisor.f235421k.mo111975b(), "pacemaker: uninstall pacemaker", new Object[0]);
            }
            SubordinatePacemaker.f235434e.mo111985a(this.f235491d.f235489d);
            ProcessSupervisor processSupervisor = ProcessSupervisor.f235421k;
            IBinder iBinder = this.f235492e;
            int i = C80478e.C80479a.f235473d;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
                eVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C80478e)) ? new C80478e.C80479a.C80480a(iBinder) : (C80478e) queryLocalInterface;
            }
            processSupervisor.getClass();
            ProcessSupervisor.f235416f = eVar;
            C118672d.m167353c(processSupervisor.mo111975b(), "on Supervisor Connected " + ProcessSupervisor.f235416f, new Object[0]);
            ProcessUILifecycleOwner processUILifecycleOwner = ProcessUILifecycleOwner.f235399x;
            C80491a aVar = new C80491a();
            processUILifecycleOwner.getClass();
            ProcessUILifecycleOwner.f235391p = aVar;
            if (ProcessUILifecycleOwner.f235390o.active() && !TextUtils.isEmpty(ProcessUILifecycleOwner.f235392q)) {
                aVar.mo111931a(ProcessUILifecycleOwner.f235392q, "");
            }
            C80478e eVar2 = ProcessSupervisor.f235416f;
            if (eVar2 != null) {
                String b = processSupervisor.mo111975b();
                String str = "supervisor is " + ProcessSupervisor.f235416f;
                try {
                    ProcessToken[] a = DispatcherStateOwner.Companion.mo111973a(this.f235491d.f235489d);
                    C13601g gVar = C80481h.f235475a;
                    Application application = this.f235491d.f235489d;
                    C87412m.m108594g(application, "app");
                    eVar2.mo112004Kj(a, new C80481h.C80484b(application));
                } catch (Throwable th) {
                    C118672d.m167354d(b, th, str, new Object[0]);
                }
            }
            DispatcherStateOwner.C80455a aVar2 = DispatcherStateOwner.Companion;
            C13601g gVar2 = ProcessSupervisor.f235412b;
            Application application2 = ProcessSupervisor.f235413c;
            C87412m.m108591d(application2);
            aVar2.getClass();
            for (Map.Entry entry : DispatcherStateOwner.dispatchOwners.entrySet()) {
                DispatcherStateOwner dispatcherStateOwner = (DispatcherStateOwner) entry.getValue();
                C80407h access$getAttachedObserver$p = dispatcherStateOwner.attachedObserver;
                if (access$getAttachedObserver$p != null) {
                    dispatcherStateOwner.getAttachedSource().removeObserver(access$getAttachedObserver$p);
                }
                dispatcherStateOwner.attachedObserver = new C80475a(entry, application2);
                IStatefulOwner attachedSource = dispatcherStateOwner.getAttachedSource();
                C80407h access$getAttachedObserver$p2 = dispatcherStateOwner.attachedObserver;
                C87412m.m108591d(access$getAttachedObserver$p2);
                attachedSource.observeForever(access$getAttachedObserver$p2);
            }
            C118672d.m167353c(ProcessSupervisor.f235421k.mo111975b(), "DispatcherStateOwners attached", new Object[0]);
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.supervisor.j$b */
    public static final class C80492b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C80489j f235493d;

        /* renamed from: e */
        public final /* synthetic */ ComponentName f235494e;

        /* renamed from: com.tencent.matrix.lifecycle.supervisor.j$b$a */
        public static final class C80493a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C80492b f235495d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C80493a(C80492b bVar) {
                super(0);
                this.f235495d = bVar;
            }

            public Object invoke() {
                C80489j jVar = this.f235495d.f235493d;
                ProcessSupervisor processSupervisor = ProcessSupervisor.f235421k;
                String b = processSupervisor.mo111975b();
                try {
                    C80489j jVar2 = this.f235495d.f235493d;
                    jVar2.f235489d.bindService(jVar2.f235490e, jVar, 32);
                    SubordinatePacemaker.f235434e.mo111985a(this.f235495d.f235493d.f235489d);
                    C118672d.m167353c(processSupervisor.mo111975b(), "subordinate pacemaker rebound supervisor", new Object[0]);
                } catch (Throwable th) {
                    C118672d.m167354d(b, th, "", new Object[0]);
                }
                return C13598b0.f38549a;
            }
        }

        public C80492b(C80489j jVar, ComponentName componentName) {
            this.f235493d = jVar;
            this.f235494e = componentName;
        }

        public final void run() {
            String b = ProcessSupervisor.f235421k.mo111975b();
            C118672d.m167352b(b, "onServiceDisconnected " + this.f235494e, new Object[0]);
            ProcessSupervisor.f235416f = null;
            ProcessUILifecycleOwner.f235399x.getClass();
            ProcessUILifecycleOwner.f235391p = null;
            DispatcherStateOwner.Companion.getClass();
            for (Map.Entry value : DispatcherStateOwner.dispatchOwners.entrySet()) {
                DispatcherStateOwner dispatcherStateOwner = (DispatcherStateOwner) value.getValue();
                C80407h access$getAttachedObserver$p = dispatcherStateOwner.attachedObserver;
                if (access$getAttachedObserver$p != null) {
                    dispatcherStateOwner.getAttachedSource().removeObserver(access$getAttachedObserver$p);
                }
                dispatcherStateOwner.attachedObserver = null;
            }
            C118672d.m167353c(ProcessSupervisor.f235421k.mo111975b(), "DispatcherStateOwners detached", new Object[0]);
            SupervisorPacemaker.f235439d.mo111988a(this.f235493d.f235489d);
            C80489j jVar = this.f235493d;
            try {
                jVar.f235489d.unbindService(jVar);
            } catch (Throwable unused) {
            }
            C80489j jVar2 = this.f235493d;
            try {
                jVar2.f235489d.bindService(jVar2.f235490e, jVar2, 32);
                C118672d.m167352b(ProcessSupervisor.f235421k.mo111975b(), "rebound supervisor", new Object[0]);
                C13598b0 b0Var = C13598b0.f38549a;
            } catch (Throwable th) {
                ProcessSupervisor processSupervisor = ProcessSupervisor.f235421k;
                C118672d.m167354d(processSupervisor.mo111975b(), th, "rebound supervisor failed", new Object[0]);
                SubordinatePacemaker subordinatePacemaker = SubordinatePacemaker.f235434e;
                Application application = this.f235493d.f235489d;
                C80493a aVar = new C80493a(this);
                subordinatePacemaker.getClass();
                if (SubordinatePacemaker.f235432c != null) {
                    C118672d.m167352b(processSupervisor.mo111975b(), "SubordinatePacemaker: already installed", new Object[0]);
                } else if (!processSupervisor.mo111977d()) {
                    SubordinatePacemaker.f235433d = aVar;
                    String str = C90779e.f260690b;
                    if (str == null) {
                        str = application.getPackageName();
                        C90779e.f260690b = str;
                    }
                    SubordinatePacemaker.f235430a = str;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("SUPERVISOR_INSTALLED");
                    if (application != null) {
                        application.registerReceiver(subordinatePacemaker, intentFilter, (String) ((C36570n) SubordinatePacemaker.f235431b).getValue(), (Handler) null);
                    }
                    SubordinatePacemaker.f235432c = new C80494k(aVar);
                    ProcessUILifecycleOwner.f235399x.getClass();
                    IForegroundStatefulOwner iForegroundStatefulOwner = ProcessUILifecycleOwner.f235390o;
                    C80407h hVar = SubordinatePacemaker.f235432c;
                    C87412m.m108591d(hVar);
                    iForegroundStatefulOwner.observeForever(hVar);
                }
            }
        }
    }

    public C80489j(Application application, Intent intent) {
        this.f235489d = application;
        this.f235490e = intent;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C80392a0.f235326f.mo111887a().post(new C80490a(this, iBinder));
    }

    public void onServiceDisconnected(ComponentName componentName) {
        C80392a0.f235326f.mo111887a().post(new C80492b(this, componentName));
    }
}
