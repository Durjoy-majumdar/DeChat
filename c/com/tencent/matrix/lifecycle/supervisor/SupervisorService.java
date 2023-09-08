package com.tencent.matrix.lifecycle.supervisor;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Process;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.matrix.lifecycle.C80392a0;
import com.tencent.matrix.lifecycle.StatefulOwner;
import com.tencent.matrix.lifecycle.supervisor.C80478e;
import com.tencent.matrix.lifecycle.supervisor.C80481h;
import com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import p723vf.C118672d;
import p723vf.C90779e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110823p;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/matrix/lifecycle/supervisor/SupervisorService;", "Landroid/app/Service;", "<init>", "()V", "a", "RemoteProcessLifecycleProxy", "b", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public final class SupervisorService extends Service {

    /* renamed from: i */
    public static volatile boolean f235440i;

    /* renamed from: j */
    public static volatile String f235441j = "";

    /* renamed from: n */
    public static volatile SupervisorService f235442n;

    /* renamed from: o */
    public static final C80462a f235443o = new C80462a();

    /* renamed from: d */
    public final Handler f235444d = C80392a0.f235326f.mo111887a();

    /* renamed from: e */
    public final C80463b f235445e = new C80463b();

    /* renamed from: f */
    public final C13601g f235446f = C36568h.m40986b(C13602i.SYNCHRONIZED, C80466c.f235453d);

    /* renamed from: g */
    public C32228q<? super Integer, ? super String, ? super Integer, C13598b0> f235447g;

    /* renamed from: h */
    public final C80467d f235448h = new C80467d(this);

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/matrix/lifecycle/supervisor/SupervisorService$RemoteProcessLifecycleProxy;", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "", "state", "Lrx3/b0;", "onStateChanged", "", "toString", "Lcom/tencent/matrix/lifecycle/supervisor/ProcessToken;", "token", "Lcom/tencent/matrix/lifecycle/supervisor/ProcessToken;", "getToken", "()Lcom/tencent/matrix/lifecycle/supervisor/ProcessToken;", "<init>", "(Lcom/tencent/matrix/lifecycle/supervisor/ProcessToken;)V", "Companion", "b", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
    public static final class RemoteProcessLifecycleProxy extends StatefulOwner {
        public static final C80461b Companion = new C80461b();
        /* access modifiers changed from: private */
        public static final C13601g processProxies$delegate = C36568h.m40985a(C28664a.f78637d);
        private final ProcessToken token;

        /* renamed from: com.tencent.matrix.lifecycle.supervisor.SupervisorService$RemoteProcessLifecycleProxy$a */
        public static final class C28664a extends C87413o implements C32224a<ConcurrentHashMap<ProcessToken, ConcurrentHashMap<String, RemoteProcessLifecycleProxy>>> {

            /* renamed from: d */
            public static final C28664a f78637d = new C28664a();

            public C28664a() {
                super(0);
            }

            public Object invoke() {
                return new ConcurrentHashMap();
            }
        }

        /* renamed from: com.tencent.matrix.lifecycle.supervisor.SupervisorService$RemoteProcessLifecycleProxy$b */
        public static final class C80461b {
            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0017, code lost:
                r1 = new java.util.concurrent.ConcurrentHashMap();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
                r2 = new com.tencent.matrix.lifecycle.supervisor.SupervisorService.RemoteProcessLifecycleProxy(r4);
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.tencent.matrix.lifecycle.supervisor.SupervisorService.RemoteProcessLifecycleProxy mo111997a(com.tencent.matrix.lifecycle.supervisor.ProcessToken r4) {
                /*
                    r3 = this;
                    java.lang.String r0 = "token"
                    gy3.C87412m.m108594g(r4, r0)
                    rx3.g r0 = com.tencent.matrix.lifecycle.supervisor.SupervisorService.RemoteProcessLifecycleProxy.processProxies$delegate
                    java.lang.Object r0 = r0.getValue()
                    java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
                    java.lang.Object r1 = r0.get(r4)
                    if (r1 == 0) goto L_0x0017
                    goto L_0x0023
                L_0x0017:
                    java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
                    r1.<init>()
                    java.lang.Object r0 = r0.putIfAbsent(r4, r1)
                    if (r0 == 0) goto L_0x0023
                    r1 = r0
                L_0x0023:
                    java.util.concurrent.ConcurrentMap r1 = (java.util.concurrent.ConcurrentMap) r1
                    java.lang.String r0 = r4.f235428g
                    java.lang.Object r2 = r1.get(r0)
                    if (r2 == 0) goto L_0x002e
                    goto L_0x003a
                L_0x002e:
                    com.tencent.matrix.lifecycle.supervisor.SupervisorService$RemoteProcessLifecycleProxy r2 = new com.tencent.matrix.lifecycle.supervisor.SupervisorService$RemoteProcessLifecycleProxy
                    r2.<init>(r4)
                    java.lang.Object r4 = r1.putIfAbsent(r0, r2)
                    if (r4 == 0) goto L_0x003a
                    r2 = r4
                L_0x003a:
                    com.tencent.matrix.lifecycle.supervisor.SupervisorService$RemoteProcessLifecycleProxy r2 = (com.tencent.matrix.lifecycle.supervisor.SupervisorService.RemoteProcessLifecycleProxy) r2
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.lifecycle.supervisor.SupervisorService.RemoteProcessLifecycleProxy.C80461b.mo111997a(com.tencent.matrix.lifecycle.supervisor.ProcessToken):com.tencent.matrix.lifecycle.supervisor.SupervisorService$RemoteProcessLifecycleProxy");
            }

            /* renamed from: b */
            public final boolean mo111998b(ProcessToken processToken) {
                C87412m.m108594g(processToken, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) RemoteProcessLifecycleProxy.processProxies$delegate.getValue()).remove(processToken);
                if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
                    return false;
                }
                for (Map.Entry entry : concurrentHashMap.entrySet()) {
                    DispatcherStateOwner.C80455a aVar = DispatcherStateOwner.Companion;
                    String str = (String) entry.getKey();
                    StatefulOwner statefulOwner = (StatefulOwner) entry.getValue();
                    aVar.getClass();
                    C87412m.m108594g(str, "name");
                    C87412m.m108594g(statefulOwner, FirebaseAnalytics.C113379b.SOURCE);
                    DispatcherStateOwner dispatcherStateOwner = (DispatcherStateOwner) DispatcherStateOwner.dispatchOwners.get(str);
                    if (dispatcherStateOwner != null) {
                        dispatcherStateOwner.removeSourceOwner(statefulOwner);
                    }
                }
                return true;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RemoteProcessLifecycleProxy(ProcessToken processToken) {
            super(false, 1, (C8480h) null);
            C87412m.m108594g(processToken, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
            this.token = processToken;
            DispatcherStateOwner.C80455a aVar = DispatcherStateOwner.Companion;
            String str = processToken.f235428g;
            aVar.getClass();
            C87412m.m108594g(str, "name");
            DispatcherStateOwner dispatcherStateOwner = (DispatcherStateOwner) DispatcherStateOwner.dispatchOwners.get(str);
            if (dispatcherStateOwner != null) {
                dispatcherStateOwner.addSourceOwner((StatefulOwner) this);
            }
        }

        public final ProcessToken getToken() {
            return this.token;
        }

        public final void onStateChanged(boolean z) {
            if (z) {
                turnOn();
            } else {
                turnOff();
            }
        }

        public String toString() {
            return "OwnerProxy_" + this.token.f235428g + '_' + active() + '@' + hashCode() + '_' + this.token.f235427f + '_' + this.token.f235426e;
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.supervisor.SupervisorService$a */
    public static final class C80462a {
        /* renamed from: a */
        public final C80462a mo111999a(Context context) {
            C87412m.m108594g(context, "context");
            try {
                if (SupervisorService.f235442n != null) {
                    C118672d.m167352b("Matrix.ProcessSupervisor.Service", "duplicated start", new Object[0]);
                } else {
                    ProcessSupervisor.f235421k.getClass();
                    C80496l lVar = ProcessSupervisor.f235414d;
                    if (lVar != null) {
                        if (true == lVar.f235498a) {
                            context.startService(new Intent(context, SupervisorService.class));
                            C118672d.m167353c("Matrix.ProcessSupervisor.Service", "start service", new Object[0]);
                        }
                    }
                    C118672d.m167352b("Matrix.ProcessSupervisor.Service", "supervisor was disabled", new Object[0]);
                }
            } catch (Throwable th) {
                C118672d.m167354d("Matrix.ProcessSupervisor.Service", th, "", new Object[0]);
            }
            return this;
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.supervisor.SupervisorService$b */
    public static final class C80463b {

        /* renamed from: a */
        public final C13601g f235449a;

        /* renamed from: b */
        public final C13601g f235450b;

        /* renamed from: com.tencent.matrix.lifecycle.supervisor.SupervisorService$b$a */
        public static final class C80464a extends C87413o implements C32224a<ConcurrentHashMap<String, ProcessToken>> {

            /* renamed from: d */
            public static final C80464a f235451d = new C80464a();

            public C80464a() {
                super(0);
            }

            public Object invoke() {
                return new ConcurrentHashMap();
            }
        }

        /* renamed from: com.tencent.matrix.lifecycle.supervisor.SupervisorService$b$b */
        public static final class C80465b extends C87413o implements C32224a<ConcurrentHashMap<Integer, ProcessToken>> {

            /* renamed from: d */
            public static final C80465b f235452d = new C80465b();

            public C80465b() {
                super(0);
            }

            public Object invoke() {
                return new ConcurrentHashMap();
            }
        }

        public C80463b() {
            C13602i iVar = C13602i.SYNCHRONIZED;
            this.f235449a = C36568h.m40986b(iVar, C80465b.f235452d);
            this.f235450b = C36568h.m40986b(iVar, C80464a.f235451d);
        }

        /* renamed from: a */
        public final boolean mo112000a() {
            boolean z;
            boolean z2;
            if (((ConcurrentHashMap) this.f235449a.getValue()).isEmpty()) {
                return true;
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f235449a.getValue();
            if (!concurrentHashMap.isEmpty()) {
                Iterator it = concurrentHashMap.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((Number) ((Map.Entry) it.next()).getKey()).intValue() == Process.myPid()) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (!z2) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            return z;
        }

        /* renamed from: b */
        public final ProcessToken mo112001b(int i) {
            ProcessToken processToken = (ProcessToken) ((ConcurrentHashMap) this.f235449a.getValue()).remove(Integer.valueOf(i));
            if (processToken != null) {
                ((ConcurrentHashMap) this.f235450b.getValue()).remove(processToken.f235427f);
                return processToken;
            }
            throw new IllegalStateException("token with pid=" + i + " not found");
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.supervisor.SupervisorService$c */
    public static final class C80466c extends C87413o implements C32224a<ConcurrentLinkedQueue<ProcessToken>> {

        /* renamed from: d */
        public static final C80466c f235453d = new C80466c();

        public C80466c() {
            super(0);
        }

        public Object invoke() {
            return new ConcurrentLinkedQueue();
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.supervisor.SupervisorService$d */
    public static final class C80467d extends C80478e.C80479a {

        /* renamed from: e */
        public final /* synthetic */ SupervisorService f235454e;

        /* renamed from: com.tencent.matrix.lifecycle.supervisor.SupervisorService$d$a */
        public static final class C80468a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C80467d f235455d;

            /* renamed from: e */
            public final /* synthetic */ ProcessToken f235456e;

            public C80468a(C80467d dVar, ProcessToken processToken) {
                this.f235455d = dVar;
                this.f235456e = processToken;
            }

            public final void run() {
                try {
                    C32228q<? super Integer, ? super String, ? super Integer, C13598b0> qVar = this.f235455d.f235454e.f235447g;
                    if (qVar != null) {
                        ProcessToken processToken = this.f235456e;
                        C13598b0 invoke = qVar.invoke(3, processToken.f235427f, Integer.valueOf(processToken.f235426e));
                    }
                } catch (Throwable th) {
                    C118672d.m167354d("Matrix.ProcessSupervisor.Service", th, "", new Object[0]);
                }
            }
        }

        /* renamed from: com.tencent.matrix.lifecycle.supervisor.SupervisorService$d$b */
        public static final class C80469b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C80467d f235457d;

            /* renamed from: e */
            public final /* synthetic */ ProcessToken f235458e;

            public C80469b(C80467d dVar, ProcessToken processToken) {
                this.f235457d = dVar;
                this.f235458e = processToken;
            }

            public final void run() {
                try {
                    C32228q<? super Integer, ? super String, ? super Integer, C13598b0> qVar = this.f235457d.f235454e.f235447g;
                    if (qVar != null) {
                        ProcessToken processToken = this.f235458e;
                        C13598b0 invoke = qVar.invoke(1, processToken.f235427f, Integer.valueOf(processToken.f235426e));
                    }
                } catch (Throwable th) {
                    C118672d.m167354d("Matrix.ProcessSupervisor.Service", th, "", new Object[0]);
                }
                SupervisorService supervisorService = this.f235457d.f235454e;
                boolean z = SupervisorService.f235440i;
                supervisorService.mo111990b().remove(this.f235458e);
                RemoteProcessLifecycleProxy.Companion.mo111998b(this.f235458e);
                StringBuilder sb = new StringBuilder();
                sb.append("KILL: [");
                sb.append(this.f235458e.f235426e);
                sb.append('-');
                sb.append(this.f235458e.f235427f);
                sb.append("] X [");
                sb.append(this.f235457d.f235454e.mo111990b().size());
                sb.append(']');
                SupervisorService supervisorService2 = this.f235457d.f235454e;
                sb.append(SupervisorService.m98022a(supervisorService2, supervisorService2.mo111990b()));
                C118672d.m167353c("Matrix.ProcessSupervisor.Service", sb.toString(), new Object[0]);
            }
        }

        /* renamed from: com.tencent.matrix.lifecycle.supervisor.SupervisorService$d$c */
        public static final class C80470c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C80467d f235459d;

            /* renamed from: e */
            public final /* synthetic */ ProcessToken f235460e;

            public C80470c(C80467d dVar, ProcessToken processToken) {
                this.f235459d = dVar;
                this.f235460e = processToken;
            }

            public final void run() {
                try {
                    C32228q<? super Integer, ? super String, ? super Integer, C13598b0> qVar = this.f235459d.f235454e.f235447g;
                    if (qVar != null) {
                        ProcessToken processToken = this.f235460e;
                        C13598b0 invoke = qVar.invoke(2, processToken.f235427f, Integer.valueOf(processToken.f235426e));
                    }
                } catch (Throwable th) {
                    C118672d.m167354d("Matrix.ProcessSupervisor.Service", th, "", new Object[0]);
                }
            }
        }

        /* renamed from: com.tencent.matrix.lifecycle.supervisor.SupervisorService$d$d */
        public static final class C80471d implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C80467d f235461d;

            /* renamed from: e */
            public final /* synthetic */ ProcessToken f235462e;

            public C80471d(C80467d dVar, ProcessToken processToken) {
                this.f235461d = dVar;
                this.f235462e = processToken;
            }

            public final void run() {
                C118672d.m167353c("Matrix.ProcessSupervisor.Service", "onStateChanged: " + this.f235462e.f235428g + ' ' + this.f235462e.f235429h + ' ' + this.f235462e.f235427f, new Object[0]);
                RemoteProcessLifecycleProxy.Companion.mo111997a(this.f235462e).onStateChanged(this.f235462e.f235429h);
                C80467d dVar = this.f235461d;
                ProcessToken processToken = this.f235462e;
                dVar.getClass();
                ProcessSupervisor.f235421k.getClass();
                C80496l lVar = ProcessSupervisor.f235414d;
                if (lVar == null || true != lVar.f235498a) {
                    C118672d.m167352b("Matrix.ProcessSupervisor.Service", "supervisor was disabled", new Object[0]);
                } else if (!C87412m.m108589b("ExplicitBackgroundOwner", processToken.f235428g)) {
                } else {
                    if (processToken.f235429h) {
                        SupervisorService supervisorService = dVar.f235454e;
                        boolean z = SupervisorService.f235440i;
                        ConcurrentLinkedQueue<ProcessToken> b = supervisorService.mo111990b();
                        b.remove(processToken);
                        b.add(processToken);
                        StringBuilder sb = new StringBuilder();
                        sb.append("BACKGROUND: [");
                        sb.append(processToken.f235426e);
                        sb.append('-');
                        sb.append(processToken.f235427f);
                        sb.append("] -> [");
                        sb.append(dVar.f235454e.mo111990b().size());
                        sb.append(']');
                        SupervisorService supervisorService2 = dVar.f235454e;
                        sb.append(SupervisorService.m98022a(supervisorService2, supervisorService2.mo111990b()));
                        C118672d.m167353c("Matrix.ProcessSupervisor.Service", sb.toString(), new Object[0]);
                        return;
                    }
                    SupervisorService supervisorService3 = dVar.f235454e;
                    boolean z2 = SupervisorService.f235440i;
                    supervisorService3.mo111990b().remove(processToken);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("FOREGROUND: [");
                    sb4.append(processToken.f235426e);
                    sb4.append('-');
                    sb4.append(processToken.f235427f);
                    sb4.append("] <- [");
                    sb4.append(dVar.f235454e.mo111990b().size());
                    sb4.append(']');
                    SupervisorService supervisorService4 = dVar.f235454e;
                    sb4.append(SupervisorService.m98022a(supervisorService4, supervisorService4.mo111990b()));
                    C118672d.m167353c("Matrix.ProcessSupervisor.Service", sb4.toString(), new Object[0]);
                }
            }
        }

        /* renamed from: com.tencent.matrix.lifecycle.supervisor.SupervisorService$d$e */
        public static final class C80472e implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C80467d f235463d;

            /* renamed from: e */
            public final /* synthetic */ ProcessToken[] f235464e;

            /* renamed from: f */
            public final /* synthetic */ C28665d f235465f;

            /* renamed from: g */
            public final /* synthetic */ int f235466g;

            /* renamed from: com.tencent.matrix.lifecycle.supervisor.SupervisorService$d$e$a */
            public static final class C80473a implements IBinder.DeathRecipient {

                /* renamed from: d */
                public final /* synthetic */ C80472e f235467d;

                public C80473a(ProcessToken processToken, C80472e eVar) {
                    this.f235467d = eVar;
                }

                public final void binderDied() {
                    try {
                        C80472e eVar = this.f235467d;
                        ProcessToken b = eVar.f235463d.f235454e.f235445e.mo112001b(eVar.f235466g);
                        boolean remove = this.f235467d.f235463d.f235454e.mo111990b().remove(b);
                        C80481h hVar = C80481h.f235480f;
                        C80481h.C80482a c = hVar.mo112018c();
                        c.getClass();
                        C28665d remove2 = c.mo112021c().remove(b);
                        boolean b2 = RemoteProcessLifecycleProxy.Companion.mo111998b(b);
                        C80481h.C80482a c2 = hVar.mo112018c();
                        boolean z = true;
                        c2.mo112020b(c2.mo112021c(), new C28668f(this.f235467d.f235463d.mo112002BT(), b.f235427f, b.f235426e, !remove && !b2));
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f235467d.f235466g);
                        sb.append('-');
                        sb.append(b);
                        sb.append(" was dead. is LRU kill? ");
                        if (remove || b2) {
                            z = false;
                        }
                        sb.append(z);
                        C118672d.m167353c("Matrix.ProcessSupervisor.Service", sb.toString(), new Object[0]);
                    } catch (Throwable th) {
                        C118672d.m167354d("Matrix.ProcessSupervisor.Service", th, "", new Object[0]);
                    }
                }
            }

            public C80472e(C80467d dVar, ProcessToken[] processTokenArr, C28665d dVar2, int i) {
                this.f235463d = dVar;
                this.f235464e = processTokenArr;
                this.f235465f = dVar2;
                this.f235466g = i;
            }

            public final void run() {
                StringBuilder sb = new StringBuilder();
                sb.append("supervisor called register, tokens(");
                sb.append(this.f235464e.length);
                sb.append("): ");
                String arrays = Arrays.toString(this.f235464e);
                C87412m.m108593f(arrays, "java.util.Arrays.toString(this)");
                sb.append(arrays);
                C118672d.m167351a("Matrix.ProcessSupervisor.Service", sb.toString(), new Object[0]);
                try {
                    ProcessToken processToken = (ProcessToken) C110823p.m150976B(this.f235464e);
                    C80463b bVar = this.f235463d.f235454e.f235445e;
                    bVar.getClass();
                    C87412m.m108594g(processToken, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
                    ((ConcurrentHashMap) bVar.f235449a.getValue()).put(Integer.valueOf(processToken.f235426e), processToken);
                    ((ConcurrentHashMap) bVar.f235450b.getValue()).put(processToken.f235427f, processToken);
                    C80481h.C80482a c = C80481h.f235480f.mo112018c();
                    C28665d dVar = this.f235465f;
                    c.getClass();
                    C87412m.m108594g(dVar, "subordinate");
                    C28665d put = c.mo112021c().put(processToken, dVar);
                    ConcurrentLinkedQueue<ProcessToken> b = this.f235463d.f235454e.mo111990b();
                    b.remove(processToken);
                    b.add(processToken);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("CREATED: [");
                    sb4.append(processToken.f235426e);
                    sb4.append('-');
                    sb4.append(processToken.f235427f);
                    sb4.append("] -> [");
                    sb4.append(this.f235463d.f235454e.mo111990b().size());
                    sb4.append(']');
                    SupervisorService supervisorService = this.f235463d.f235454e;
                    sb4.append(SupervisorService.m98022a(supervisorService, supervisorService.mo111990b()));
                    C118672d.m167353c("Matrix.ProcessSupervisor.Service", sb4.toString(), new Object[0]);
                    processToken.f235425d.linkToDeath(new C80473a(processToken, this), 0);
                } catch (Throwable th) {
                    C118672d.m167354d("Matrix.ProcessSupervisor.Service", th, "", new Object[0]);
                }
                for (ProcessToken processToken2 : this.f235464e) {
                    C118672d.m167351a("Matrix.ProcessSupervisor.Service", "register: " + processToken2.f235427f + ", " + processToken2.f235428g + ", " + processToken2.f235429h, new Object[0]);
                    RemoteProcessLifecycleProxy.Companion.mo111997a(processToken2).onStateChanged(processToken2.f235429h);
                }
                if (this.f235463d.f235454e.f235445e.mo112000a()) {
                    C118672d.m167353c("Matrix.ProcessSupervisor.Service", "stateRegister: no other process registered, ignore state changes", new Object[0]);
                    return;
                }
                DispatcherStateOwner.C80455a aVar = DispatcherStateOwner.Companion;
                Context applicationContext = this.f235463d.f235454e.getApplicationContext();
                C87412m.m108593f(applicationContext, "applicationContext");
                int myPid = Process.myPid();
                String a = C90779e.m113846a(applicationContext);
                C87412m.m108593f(a, "MatrixUtil.getProcessName(context)");
                ProcessToken processToken3 = new ProcessToken(myPid, a, "", false);
                String BT = this.f235463d.mo112002BT();
                aVar.getClass();
                C87412m.m108594g(BT, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                if (ProcessSupervisor.f235421k.mo111977d()) {
                    for (Map.Entry entry : DispatcherStateOwner.dispatchOwners.entrySet()) {
                        boolean active = ((DispatcherStateOwner) entry.getValue()).active();
                        C118672d.m167353c(ProcessSupervisor.f235421k.mo111975b(), "syncStates: " + ((String) entry.getKey()) + ' ' + active, new Object[0]);
                        C80481h.f235480f.mo112018c().mo112019a(processToken3, BT, (String) entry.getKey(), active);
                    }
                    return;
                }
                throw new IllegalStateException("call forbidden");
            }
        }

        public C80467d(SupervisorService supervisorService) {
            this.f235454e = supervisorService;
        }

        /* renamed from: BT */
        public String mo112002BT() {
            ProcessSupervisor.f235421k.getClass();
            C80496l lVar = ProcessSupervisor.f235414d;
            if (lVar == null || true != lVar.f235498a) {
                C118672d.m167352b("Matrix.ProcessSupervisor.Service", "supervisor was disabled", new Object[0]);
                return "";
            }
            SupervisorService.f235443o.getClass();
            return SupervisorService.f235441j;
        }

        /* renamed from: JF */
        public void mo112003JF(ProcessToken processToken) {
            C87412m.m108594g(processToken, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
            ProcessSupervisor.f235421k.getClass();
            C80496l lVar = ProcessSupervisor.f235414d;
            if (lVar == null || true != lVar.f235498a) {
                C118672d.m167352b("Matrix.ProcessSupervisor.Service", "supervisor was disabled", new Object[0]);
            } else {
                this.f235454e.f235444d.post(new C80471d(this, processToken));
            }
        }

        /* renamed from: Kj */
        public void mo112004Kj(ProcessToken[] processTokenArr, C28665d dVar) {
            C87412m.m108594g(processTokenArr, "tokens");
            C87412m.m108594g(dVar, "subordinateProxy");
            int callingPid = Binder.getCallingPid();
            ProcessSupervisor.f235421k.getClass();
            C80496l lVar = ProcessSupervisor.f235414d;
            if (lVar == null || true != lVar.f235498a) {
                C118672d.m167352b("Matrix.ProcessSupervisor.Service", "supervisor was disabled", new Object[0]);
            } else {
                this.f235454e.f235444d.post(new C80472e(this, processTokenArr, dVar, callingPid));
            }
        }

        /* renamed from: ed */
        public void mo112005ed(ProcessToken processToken) {
            C87412m.m108594g(processToken, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
            ProcessSupervisor.f235421k.getClass();
            C80496l lVar = ProcessSupervisor.f235414d;
            if (lVar == null || true != lVar.f235498a) {
                C118672d.m167352b("Matrix.ProcessSupervisor.Service", "supervisor was disabled", new Object[0]);
            } else {
                this.f235454e.f235444d.post(new C80470c(this, processToken));
            }
        }

        /* renamed from: ja */
        public void mo112006ja(String str) {
            C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            ProcessSupervisor.f235421k.getClass();
            C80496l lVar = ProcessSupervisor.f235414d;
            if (lVar == null || true != lVar.f235498a) {
                C118672d.m167352b("Matrix.ProcessSupervisor.Service", "supervisor was disabled", new Object[0]);
                return;
            }
            SupervisorService.f235443o.getClass();
            SupervisorService.f235441j = str;
        }

        /* renamed from: st */
        public void mo112007st(ProcessToken processToken) {
            C87412m.m108594g(processToken, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
            ProcessSupervisor.f235421k.getClass();
            C80496l lVar = ProcessSupervisor.f235414d;
            if (lVar == null || true != lVar.f235498a) {
                C118672d.m167352b("Matrix.ProcessSupervisor.Service", "supervisor was disabled", new Object[0]);
            } else {
                this.f235454e.f235444d.post(new C80468a(this, processToken));
            }
        }

        public void ul0(ProcessToken processToken) {
            C87412m.m108594g(processToken, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
            ProcessSupervisor.f235421k.getClass();
            C80496l lVar = ProcessSupervisor.f235414d;
            if (lVar == null || true != lVar.f235498a) {
                C118672d.m167352b("Matrix.ProcessSupervisor.Service", "supervisor was disabled", new Object[0]);
            } else {
                this.f235454e.f235444d.post(new C80469b(this, processToken));
            }
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.supervisor.SupervisorService$e */
    public static final class C80474e extends C87413o implements C32227p<String, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SupervisorService f235468d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80474e(SupervisorService supervisorService) {
            super(2);
            this.f235468d = supervisorService;
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C87412m.m108594g(str, "stateName");
            if (this.f235468d.f235445e.mo112000a()) {
                C118672d.m167353c("Matrix.ProcessSupervisor.Service", "observe: no other process registered, ignore state changes", new Object[0]);
            } else {
                C118672d.m167351a("Matrix.ProcessSupervisor.Service", "supervisor dispatch " + str + ' ' + booleanValue, new Object[0]);
                C80481h.C80482a c = C80481h.f235480f.mo112018c();
                Context applicationContext = this.f235468d.getApplicationContext();
                C87412m.m108593f(applicationContext, "applicationContext");
                int myPid = Process.myPid();
                String a = C90779e.m113846a(applicationContext);
                C87412m.m108593f(a, "MatrixUtil.getProcessName(context)");
                ProcessToken processToken = new ProcessToken(myPid, a, "", false);
                SupervisorService.f235443o.getClass();
                c.mo112019a(processToken, SupervisorService.f235441j, str, booleanValue);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final String m98022a(SupervisorService supervisorService, ConcurrentLinkedQueue concurrentLinkedQueue) {
        supervisorService.getClass();
        Iterator it = concurrentLinkedQueue.iterator();
        C87412m.m108593f(it, "iterator()");
        if (!it.hasNext()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        while (true) {
            ProcessToken processToken = (ProcessToken) it.next();
            sb.append(processToken.f235426e + '-' + processToken.f235427f);
            if (!it.hasNext()) {
                sb.append(']');
                String sb4 = sb.toString();
                C87412m.m108593f(sb4, "sb.append(']').toString()");
                return sb4;
            }
            sb.append(',');
            sb.append(' ');
        }
    }

    /* renamed from: b */
    public final ConcurrentLinkedQueue<ProcessToken> mo111990b() {
        return (ConcurrentLinkedQueue) this.f235446f.getValue();
    }

    public IBinder onBind(Intent intent) {
        C118672d.m167351a("Matrix.ProcessSupervisor.Service", "onBind", new Object[0]);
        return this.f235448h;
    }

    public void onCreate() {
        super.onCreate();
        C118672d.m167353c("Matrix.ProcessSupervisor.Service", "onCreate", new Object[0]);
        f235440i = true;
        f235442n = this;
        ProcessSupervisor.f235421k.getClass();
        C80496l lVar = ProcessSupervisor.f235414d;
        if (lVar == null || true != lVar.f235498a) {
            C118672d.m167352b("Matrix.ProcessSupervisor.Service", "supervisor was disabled", new Object[0]);
            return;
        }
        DispatcherStateOwner.C80455a aVar = DispatcherStateOwner.Companion;
        C80474e eVar = new C80474e(this);
        aVar.getClass();
        for (Map.Entry entry : DispatcherStateOwner.dispatchOwners.entrySet()) {
            ((DispatcherStateOwner) entry.getValue()).observeForever(new C80476b(entry, eVar));
        }
        SubordinatePacemaker subordinatePacemaker = SubordinatePacemaker.f235434e;
        Context applicationContext = getApplicationContext();
        subordinatePacemaker.getClass();
        String str = C90779e.f260690b;
        if (str == null) {
            str = applicationContext.getPackageName();
            C90779e.f260690b = str;
        }
        SubordinatePacemaker.f235430a = str;
        Intent intent = new Intent("SUPERVISOR_INSTALLED");
        if (applicationContext != null) {
            applicationContext.sendBroadcast(intent, (String) ((C36570n) SubordinatePacemaker.f235431b).getValue());
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C118672d.m167352b("Matrix.ProcessSupervisor.Service", "SupervisorService destroyed!!!", new Object[0]);
        f235442n = null;
    }
}
