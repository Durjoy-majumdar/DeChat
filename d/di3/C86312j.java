package di3;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import bp3.C79760s;
import com.tencent.p014mm.app.C28674a;
import com.tencent.p014mm.app.C80622u0;
import com.tencent.p014mm.app.C80637z0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.support.feature_service.ServiceDefException;
import di3.C86301e;
import ei3.C31607a;
import f40.C86709a0;
import fi3.C32058a;
import fi3.C86868b;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import p261wl.C38166b;
import p261wl.C38174i;

/* renamed from: di3.j */
public final class C86312j {

    /* renamed from: a */
    public static Application f250984a;

    /* renamed from: b */
    public static C31195h f250985b;

    /* renamed from: c */
    public static ForkJoinPool f250986c = null;

    /* renamed from: d */
    public static final C32058a[] f250987d = {null};

    /* renamed from: e */
    public static final boolean[] f250988e = {false};

    /* renamed from: f */
    public static final Set<C86301e> f250989f = new LinkedHashSet(64);

    /* renamed from: g */
    public static boolean f250990g = false;

    /* renamed from: h */
    public static final boolean[] f250991h = {false};

    /* renamed from: i */
    public static final boolean[] f250992i = {false};

    /* renamed from: j */
    public static boolean f250993j = false;

    /* renamed from: k */
    public static volatile boolean f250994k = false;

    /* renamed from: l */
    public static final Handler f250995l = new Handler(Looper.getMainLooper());

    /* renamed from: m */
    public static final ThreadLocal<C86301e> f250996m = new ThreadLocal<>();

    /* renamed from: n */
    public static final Runnable f250997n = new C86313a();

    /* renamed from: o */
    public static final Runnable f250998o = new C86314b();

    /* renamed from: p */
    public static final Runnable f250999p = new C86315c();

    /* renamed from: q */
    public static final Application.ActivityLifecycleCallbacks f251000q = new C86316d();

    /* renamed from: r */
    public static final Map<Class<? extends C7335d>, Boolean> f251001r = new ConcurrentHashMap(64);

    /* renamed from: di3.j$f */
    public class C31196f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C38174i f83605d;

        public C31196f(C38174i iVar) {
            this.f83605d = iVar;
        }

        public void run() {
            try {
                C31194g gVar = (C31194g) this.f83605d.get();
                C79760s.m96908a("preCreate: " + gVar.getClass().getName());
                gVar.mo58017LR();
            } finally {
                C79760s.m96909b();
            }
        }
    }

    /* renamed from: di3.j$i */
    public enum C75410i {
        INSTANCE;
        

        /* renamed from: d */
        public final byte[] f221692d;

        /* renamed from: e */
        public final List<Handler> f221693e;

        /* renamed from: f */
        public int f221694f;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.os.Handler} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.os.Looper mo105769a() {
            /*
                r4 = this;
                byte[] r0 = r4.f221692d
                monitor-enter(r0)
                java.util.List<android.os.Handler> r1 = r4.f221693e     // Catch:{ all -> 0x0069 }
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0069 }
                int r1 = r1.size()     // Catch:{ all -> 0x0069 }
                r2 = 2
                if (r1 >= r2) goto L_0x0043
                android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch:{ all -> 0x0069 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0069 }
                r2.<init>()     // Catch:{ all -> 0x0069 }
                java.lang.String r3 = "wc_lp_srvinit_"
                r2.append(r3)     // Catch:{ all -> 0x0069 }
                java.util.List<android.os.Handler> r3 = r4.f221693e     // Catch:{ all -> 0x0069 }
                java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x0069 }
                int r3 = r3.size()     // Catch:{ all -> 0x0069 }
                r2.append(r3)     // Catch:{ all -> 0x0069 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0069 }
                r3 = -8
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0069 }
                r1.start()     // Catch:{ all -> 0x0069 }
                android.os.Looper r1 = r1.getLooper()     // Catch:{ all -> 0x0069 }
                android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x0069 }
                r2.<init>(r1)     // Catch:{ all -> 0x0069 }
                java.util.List<android.os.Handler> r1 = r4.f221693e     // Catch:{ all -> 0x0069 }
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0069 }
                r1.add(r2)     // Catch:{ all -> 0x0069 }
                monitor-exit(r0)     // Catch:{ all -> 0x0069 }
                goto L_0x0064
            L_0x0043:
                int r1 = r4.f221694f     // Catch:{ all -> 0x0069 }
                java.util.List<android.os.Handler> r2 = r4.f221693e     // Catch:{ all -> 0x0069 }
                java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x0069 }
                int r2 = r2.size()     // Catch:{ all -> 0x0069 }
                if (r1 < r2) goto L_0x0052
                r1 = 0
                r4.f221694f = r1     // Catch:{ all -> 0x0069 }
            L_0x0052:
                java.util.List<android.os.Handler> r1 = r4.f221693e     // Catch:{ all -> 0x0069 }
                int r2 = r4.f221694f     // Catch:{ all -> 0x0069 }
                int r3 = r2 + 1
                r4.f221694f = r3     // Catch:{ all -> 0x0069 }
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0069 }
                java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0069 }
                r2 = r1
                android.os.Handler r2 = (android.os.Handler) r2     // Catch:{ all -> 0x0069 }
                monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            L_0x0064:
                android.os.Looper r0 = r2.getLooper()
                return r0
            L_0x0069:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0069 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: di3.C86312j.C75410i.mo105769a():android.os.Looper");
        }
    }

    /* renamed from: di3.j$a */
    public class C86313a implements Runnable {
        public void run() {
            C86312j.f250994k = C86312j.f250993j;
        }
    }

    /* renamed from: di3.j$b */
    public class C86314b implements Runnable {
        public void run() {
            Log.m105924i("MicroMsg.ServiceManager", "[+] Notify task for delayed ASYNC preload FeatureServices triggered.");
            if (C86312j.m106915g()) {
                try {
                    C79760s.m96908a("preloadServicesWithAsyncModeOnDemand");
                    Handler handler = C86312j.f250995l;
                    handler.removeCallbacks(C86312j.f250999p);
                    Log.m105924i("MicroMsg.ServiceManager", "[+] Notify ASYNC preload FeatureServices was actually executed.");
                    C86312j.m106913e(true, false);
                    handler.removeCallbacks(C86312j.f250998o);
                    C79760s.m96909b();
                } catch (Throwable th) {
                    C86312j.f250995l.removeCallbacks(C86312j.f250998o);
                    C79760s.m96909b();
                    throw th;
                }
            }
        }
    }

    /* renamed from: di3.j$c */
    public class C86315c implements Runnable {
        public void run() {
            Log.m105928w("MicroMsg.ServiceManager", "[!] Watchdog task for delayed ASYNC preload FeatureServices triggered.");
            if (C86312j.m106915g()) {
                Log.m105928w("MicroMsg.ServiceManager", "[!] Watchdog task for delayed ASYNC preload FeatureServices actually post notify task.");
                Handler handler = C86312j.f250995l;
                Runnable runnable = C86312j.f250998o;
                handler.removeCallbacks(runnable);
                handler.postAtFrontOfQueue(runnable);
                C86312j.f250984a.unregisterActivityLifecycleCallbacks(C86312j.f251000q);
                handler.removeCallbacks(C86312j.f250999p);
            }
        }
    }

    /* renamed from: di3.j$d */
    public class C86316d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: di3.j$d$a */
        public class C86317a implements ViewTreeObserver.OnGlobalLayoutListener {

            /* renamed from: d */
            public final /* synthetic */ View f251002d;

            public C86317a(C86316d dVar, View view) {
                this.f251002d = view;
            }

            public void onGlobalLayout() {
                Log.m105924i("MicroMsg.ServiceManager", "[+] onGlobalLayout called.");
                this.f251002d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (C86312j.m106915g()) {
                    Handler handler = C86312j.f250995l;
                    handler.removeCallbacks(C86312j.f250999p);
                    Runnable runnable = C86312j.f250998o;
                    handler.removeCallbacks(runnable);
                    handler.postAtFrontOfQueue(runnable);
                    C86312j.f250984a.unregisterActivityLifecycleCallbacks(C86312j.f251000q);
                }
            }
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C86312j.f250993j = true;
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
            if (C80622u0.m98265a(C86312j.f250984a) == C80622u0.MM) {
                if (!C86868b.m107886a(activity)) {
                    Log.m105929w("MicroMsg.ServiceManager", "catch first screen '%s' but not the first business ui, skip notify this time.", activity);
                } else if (!C86312j.m106915g()) {
                    Log.m105929w("MicroMsg.ServiceManager", "not login, don't regard this ui '%s' as first screen, skip notify this time.", activity);
                } else {
                    View view = null;
                    Window window = activity.getWindow();
                    if (window == null) {
                        Log.m105921e("MicroMsg.ServiceManager", "fail to get window of '%s', notify account init now.", activity);
                    } else {
                        view = window.getDecorView();
                        if (view == null) {
                            Log.m105921e("MicroMsg.ServiceManager", "fail to get decor view of '%s', notify account init now.", activity);
                        }
                    }
                    if (view == null) {
                        C86312j.f250995l.postAtFrontOfQueue(C86312j.f250998o);
                    } else if (view.getViewTreeObserver() != null) {
                        view.getViewTreeObserver().addOnGlobalLayoutListener(new C86317a(this, view));
                    } else {
                        Log.m105921e("MicroMsg.ServiceManager", "fail to get view tree observer of '%s', notify account init now.", activity);
                        C86312j.f250995l.postAtFrontOfQueue(C86312j.f250998o);
                    }
                }
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: di3.j$e */
    public class C86318e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C38174i f251003d;

        /* renamed from: e */
        public final /* synthetic */ Throwable f251004e;

        /* renamed from: f */
        public final /* synthetic */ C86301e.C86306e f251005f;

        /* renamed from: g */
        public final /* synthetic */ boolean f251006g;

        public C86318e(C38174i iVar, Throwable th, C86301e.C86306e eVar, boolean z) {
            this.f251003d = iVar;
            this.f251004e = th;
            this.f251005f = eVar;
            this.f251006g = z;
        }

        public void run() {
            C86301e eVar = (C86301e) this.f251003d.get();
            if (eVar != null) {
                eVar.setLastCallerStack(this.f251004e);
                C86312j.m106918j((C86301e) null, eVar, this.f251005f, true, this.f251006g, false);
                return;
            }
            throw new ServiceDefException(String.format(Locale.ENGLISH, "fail to get instance from '%s'", new Object[]{this.f251003d}));
        }
    }

    /* renamed from: di3.j$g */
    public class C86319g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C86301e f251007d;

        /* renamed from: e */
        public final /* synthetic */ Throwable f251008e;

        public C86319g(C86301e eVar, Throwable th) {
            this.f251007d = eVar;
            this.f251008e = th;
        }

        public void run() {
            this.f251007d.setLastCallerStack(this.f251008e);
            C86312j.m106918j((C86301e) null, this.f251007d, C86301e.C86306e.INITIALIZED, true, true, false);
        }
    }

    /* renamed from: di3.j$h */
    public class C86320h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f251009d;

        public C86320h(boolean z) {
            this.f251009d = z;
        }

        public void run() {
            C86312j.m106919k(this.f251009d);
        }
    }

    /* renamed from: di3.j$j */
    public enum C86321j implements ForkJoinPool.ForkJoinWorkerThreadFactory {
        INSTANCE;
        

        /* renamed from: d */
        public final Field f251012d;

        /* renamed from: e */
        public final AtomicInteger f251013e;

        /* renamed from: f */
        public final AtomicInteger f251014f;

        /* renamed from: di3.j$j$a */
        public class C86322a extends ForkJoinWorkerThread {

            /* renamed from: d */
            public final /* synthetic */ ForkJoinPool f251015d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C86322a(ForkJoinPool forkJoinPool, ForkJoinPool forkJoinPool2) {
                super(forkJoinPool);
                this.f251015d = forkJoinPool2;
            }

            public void onStart() {
                super.onStart();
                if (C86321j.this.f251012d != null) {
                    Looper a = C75410i.INSTANCE.mo105769a();
                    try {
                        ThreadLocal threadLocal = (ThreadLocal) C86321j.this.f251012d.get((Object) null);
                        if (threadLocal == null) {
                            threadLocal = new ThreadLocal();
                            C86321j.this.f251012d.set((Object) null, threadLocal);
                        }
                        threadLocal.set(a);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.ServiceManager", th, "Fail to set Looper to init thread.", new Object[0]);
                    }
                }
                Log.m105925i("MicroMsg.ServiceManager", "[+] FJPThread, tid: %s, name: %s, java_tid: %s, priority: %s, alive_thread_count: %s", Integer.valueOf(Process.myTid()), getName(), Long.valueOf(getId()), Integer.valueOf(getPriority()), Integer.valueOf(this.f251015d.getActiveThreadCount()));
            }
        }

        public ForkJoinWorkerThread newThread(ForkJoinPool forkJoinPool) {
            int andIncrement = this.f251013e.getAndIncrement();
            C86322a aVar = new C86322a(forkJoinPool, forkJoinPool);
            aVar.setName("wc_srvinit_" + andIncrement);
            aVar.setPriority(this.f251014f.get());
            return aVar;
        }
    }

    static {
        Runtime.getRuntime().availableProcessors();
    }

    /* renamed from: a */
    public static void m106909a(Collection<C38174i<C86301e>> collection, C86301e.C86306e eVar, boolean z, boolean z2) {
        Log.m105925i("MicroMsg.ServiceManager", "[+] preload feature service: '%s', dest_status: %s, wait: %s, callAccountInitNowIfPossible: %s", collection, eVar, Boolean.valueOf(z), Boolean.valueOf(z2));
        Throwable th = new Throwable();
        ArrayList arrayList = new ArrayList(collection.size());
        for (C38174i<C86301e> eVar2 : collection) {
            C86318e eVar3 = new C86318e(eVar2, th, eVar, z2);
            if (z) {
                arrayList.add(f250986c.submit(eVar3));
            } else {
                f250986c.execute(eVar3);
            }
        }
        if (z) {
            m106921m(arrayList, true);
        }
    }

    /* renamed from: b */
    public static void m106910b(String str) {
        boolean[] zArr = f250988e;
        if (!zArr[0]) {
            synchronized (zArr) {
                if (!zArr[0]) {
                    throw new IllegalStateException("please call initialize(...) first before " + str);
                }
            }
        }
    }

    /* renamed from: c */
    public static <T extends C7335d> T m106911c(Class<T> cls) {
        m106910b("calling getService(...)");
        return (C7335d) m106914f(new C86323k(cls, false));
    }

    /* renamed from: d */
    public static void m106912d(Application application, C31195h hVar, C32058a aVar) {
        boolean[] zArr = f250988e;
        synchronized (zArr) {
            if (!zArr[0]) {
                f250984a = application;
                Objects.requireNonNull(hVar);
                f250985b = hVar;
                f250986c = new ForkJoinPool(12, C86321j.INSTANCE, (Thread.UncaughtExceptionHandler) null, false);
                C32058a[] aVarArr = f250987d;
                synchronized (aVarArr) {
                    aVarArr[0] = aVar;
                }
                if (C80622u0.m98265a(f250984a) == C80622u0.MM) {
                    application.registerActivityLifecycleCallbacks(f251000q);
                    f250995l.post(f250997n);
                }
                zArr[0] = true;
            } else {
                Log.m105928w("MicroMsg.ServiceManager", "Already initialized.");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105928w("MicroMsg.ServiceManager", "[-] account release was notified, skip notifying account init for rest services.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r8 = new di3.C86312j.C86320h(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00bf, code lost:
        if (r9 == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c1, code lost:
        r0.add(f250986c.submit(r8));
        m106921m(r0, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ce, code lost:
        f250986c.execute(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d3, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.ServiceManager", "[+] initializeAccountForActivatedServices actually executed.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00da, code lost:
        bp3.C79760s.m96909b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00dd, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m106913e(boolean r8, boolean r9) {
        /*
            java.lang.String r0 = "calling initializeAccountForActivatedServices()"
            m106910b(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e3 }
            r0.<init>()     // Catch:{ all -> 0x00e3 }
            java.lang.String r1 = "initializeAccountForActivatedServices("
            r0.append(r1)     // Catch:{ all -> 0x00e3 }
            r0.append(r8)     // Catch:{ all -> 0x00e3 }
            java.lang.String r1 = ","
            r0.append(r1)     // Catch:{ all -> 0x00e3 }
            r0.append(r9)     // Catch:{ all -> 0x00e3 }
            java.lang.String r1 = ")"
            r0.append(r1)     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00e3 }
            bp3.C79760s.m96908a(r0)     // Catch:{ all -> 0x00e3 }
            boolean[] r0 = f250992i     // Catch:{ all -> 0x00e3 }
            monitor-enter(r0)     // Catch:{ all -> 0x00e3 }
            r1 = 0
            r0[r1] = r1     // Catch:{ all -> 0x00e0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e0 }
            if (r8 != 0) goto L_0x0051
            boolean r8 = f250994k     // Catch:{ all -> 0x00e3 }
            if (r8 == 0) goto L_0x0051
            java.lang.String r8 = "MicroMsg.ServiceManager"
            java.lang.String r9 = "[+] startup with ui this time, delay preloadAsyncServicesAndInitAccountForActivatedServices to stage after first screen."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)     // Catch:{ all -> 0x00e3 }
            android.os.Handler r8 = f250995l     // Catch:{ all -> 0x00e3 }
            java.lang.Runnable r9 = f250999p     // Catch:{ all -> 0x00e3 }
            r8.removeCallbacks(r9)     // Catch:{ all -> 0x00e3 }
            r0 = 5000(0x1388, double:2.4703E-320)
            r8.postDelayed(r9, r0)     // Catch:{ all -> 0x00e3 }
            java.lang.String r8 = "MicroMsg.ServiceManager"
            java.lang.String r9 = "[+] ASYNC preload onAccountInitialized() watchdog task posted."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)     // Catch:{ all -> 0x00e3 }
            bp3.C79760s.m96909b()
            return
        L_0x0051:
            boolean r8 = f250990g     // Catch:{ all -> 0x00e3 }
            if (r8 == 0) goto L_0x0059
            bp3.C79760s.m96909b()
            return
        L_0x0059:
            java.lang.Throwable r8 = new java.lang.Throwable     // Catch:{ all -> 0x00e3 }
            r8.<init>()     // Catch:{ all -> 0x00e3 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00e3 }
            r2 = 128(0x80, float:1.794E-43)
            r0.<init>(r2)     // Catch:{ all -> 0x00e3 }
            java.util.Set<di3.e> r2 = f250989f     // Catch:{ all -> 0x00e3 }
            monitor-enter(r2)     // Catch:{ all -> 0x00e3 }
            boolean r3 = f250990g     // Catch:{ all -> 0x00b7 }
            if (r3 == 0) goto L_0x0071
            monitor-exit(r2)     // Catch:{ all -> 0x00b7 }
            bp3.C79760s.m96909b()
            return
        L_0x0071:
            r3 = 1
            f250990g = r3     // Catch:{ all -> 0x00b7 }
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x00b7 }
        L_0x0078:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00b7 }
            if (r5 == 0) goto L_0x00b9
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00b7 }
            di3.e r5 = (di3.C86301e) r5     // Catch:{ all -> 0x00b7 }
            boolean[] r6 = f250992i     // Catch:{ all -> 0x00b7 }
            monitor-enter(r6)     // Catch:{ all -> 0x00b7 }
            boolean r7 = r6[r1]     // Catch:{ all -> 0x00b4 }
            monitor-exit(r6)     // Catch:{ all -> 0x00b4 }
            if (r7 == 0) goto L_0x0094
            java.lang.String r8 = "MicroMsg.ServiceManager"
            java.lang.String r1 = "[-] account release was notified, skip notifying account init for rest services."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r1)     // Catch:{ all -> 0x00b7 }
            goto L_0x00b9
        L_0x0094:
            di3.e$e r6 = di3.C86301e.C86306e.INITIALIZED     // Catch:{ all -> 0x00b7 }
            boolean r6 = r5.isTransitingToOrArrivedAt(r6)     // Catch:{ all -> 0x00b7 }
            if (r6 == 0) goto L_0x009d
            goto L_0x0078
        L_0x009d:
            di3.j$g r6 = new di3.j$g     // Catch:{ all -> 0x00b7 }
            r6.<init>(r5, r8)     // Catch:{ all -> 0x00b7 }
            if (r9 == 0) goto L_0x00ae
            java.util.concurrent.ForkJoinPool r5 = f250986c     // Catch:{ all -> 0x00b7 }
            java.util.concurrent.ForkJoinTask r5 = r5.submit(r6)     // Catch:{ all -> 0x00b7 }
            r0.add(r5)     // Catch:{ all -> 0x00b7 }
            goto L_0x0078
        L_0x00ae:
            java.util.concurrent.ForkJoinPool r5 = f250986c     // Catch:{ all -> 0x00b7 }
            r5.execute(r6)     // Catch:{ all -> 0x00b7 }
            goto L_0x0078
        L_0x00b4:
            r8 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00b4 }
            throw r8     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r8 = move-exception
            goto L_0x00de
        L_0x00b9:
            monitor-exit(r2)     // Catch:{ all -> 0x00b7 }
            di3.j$h r8 = new di3.j$h     // Catch:{ all -> 0x00e3 }
            r8.<init>(r9)     // Catch:{ all -> 0x00e3 }
            if (r9 == 0) goto L_0x00ce
            java.util.concurrent.ForkJoinPool r9 = f250986c     // Catch:{ all -> 0x00e3 }
            java.util.concurrent.ForkJoinTask r8 = r9.submit(r8)     // Catch:{ all -> 0x00e3 }
            r0.add(r8)     // Catch:{ all -> 0x00e3 }
            m106921m(r0, r3)     // Catch:{ all -> 0x00e3 }
            goto L_0x00d3
        L_0x00ce:
            java.util.concurrent.ForkJoinPool r9 = f250986c     // Catch:{ all -> 0x00e3 }
            r9.execute(r8)     // Catch:{ all -> 0x00e3 }
        L_0x00d3:
            java.lang.String r8 = "MicroMsg.ServiceManager"
            java.lang.String r9 = "[+] initializeAccountForActivatedServices actually executed."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)     // Catch:{ all -> 0x00e3 }
            bp3.C79760s.m96909b()
            return
        L_0x00de:
            monitor-exit(r2)     // Catch:{ all -> 0x00b7 }
            throw r8     // Catch:{ all -> 0x00e3 }
        L_0x00e0:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e0 }
            throw r8     // Catch:{ all -> 0x00e3 }
        L_0x00e3:
            r8 = move-exception
            bp3.C79760s.m96909b()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: di3.C86312j.m106913e(boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x005a, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x005b, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0054  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T m106914f(java.util.concurrent.Callable<T> r6) {
        /*
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r6 = r6.call()     // Catch:{ all -> 0x000b }
            return r6
        L_0x000b:
            r6 = move-exception
            throw r6
        L_0x000d:
            di3.j$j r0 = di3.C86312j.C86321j.INSTANCE
            java.lang.reflect.Field r0 = r0.f251012d
            java.lang.String r1 = "MicroMsg.ServiceManager"
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "[-] Fail to get Looper TLS field at last, invoke action without looper."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            java.lang.Object r6 = r6.call()     // Catch:{ all -> 0x001f }
            return r6
        L_0x001f:
            r6 = move-exception
            throw r6
        L_0x0021:
            r2 = 0
            java.lang.Object r3 = r0.get(r2)     // Catch:{ all -> 0x0043 }
            java.lang.ThreadLocal r3 = (java.lang.ThreadLocal) r3     // Catch:{ all -> 0x0043 }
            if (r3 != 0) goto L_0x0036
            java.lang.ThreadLocal r4 = new java.lang.ThreadLocal     // Catch:{ all -> 0x0040 }
            r4.<init>()     // Catch:{ all -> 0x0040 }
            r0.set(r2, r4)     // Catch:{ all -> 0x0034 }
            r3 = r4
            goto L_0x0036
        L_0x0034:
            r0 = move-exception
            goto L_0x0045
        L_0x0036:
            di3.j$i r0 = di3.C86312j.C75410i.INSTANCE     // Catch:{ all -> 0x0040 }
            android.os.Looper r0 = r0.mo105769a()     // Catch:{ all -> 0x0040 }
            r3.set(r0)     // Catch:{ all -> 0x0040 }
            goto L_0x004e
        L_0x0040:
            r0 = move-exception
            r4 = r3
            goto L_0x0045
        L_0x0043:
            r0 = move-exception
            r4 = r2
        L_0x0045:
            java.lang.String r3 = "[-] Fail to inject companion Looper."
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x005d }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r3, r5)     // Catch:{ all -> 0x005d }
            r3 = r2
        L_0x004e:
            java.lang.Object r6 = r6.call()     // Catch:{ all -> 0x0058 }
            if (r3 == 0) goto L_0x0057
            r3.set(r2)
        L_0x0057:
            return r6
        L_0x0058:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x005a }
        L_0x005a:
            r6 = move-exception
            r4 = r3
            goto L_0x005e
        L_0x005d:
            r6 = move-exception
        L_0x005e:
            if (r4 == 0) goto L_0x0063
            r4.set(r2)
        L_0x0063:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: di3.C86312j.m106914f(java.util.concurrent.Callable):java.lang.Object");
    }

    /* renamed from: g */
    public static boolean m106915g() {
        boolean a;
        m106910b("isAccountInitialized");
        C32058a[] aVarArr = f250987d;
        synchronized (aVarArr) {
            ((C28674a) aVarArr[0]).getClass();
            a = C86709a0.m107522a();
        }
        return a;
    }

    /* renamed from: h */
    public static boolean m106916h(Class<? extends C7335d> cls) {
        Boolean bool = (Boolean) ((ConcurrentHashMap) f251001r).get(cls);
        if (bool == null) {
            boolean z = false;
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(cls);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (true) {
                if (!bVar.hasNext()) {
                    break;
                }
                if (C38166b.m41758e(f250984a, (C38174i) bVar.next())) {
                    z = true;
                    break;
                }
            }
            ((ConcurrentHashMap) f251001r).put(cls, Boolean.valueOf(z));
            bool = Boolean.valueOf(z);
        }
        return bool.booleanValue();
    }

    /* renamed from: i */
    public static void m106917i() {
        m106910b("calling notifyPreCreateForLegacyComponentServices()");
        C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C31194g.class);
        ArrayList arrayList = new ArrayList();
        C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
        while (bVar.hasNext()) {
            arrayList.add(f250986c.submit(new C31196f((C38174i) bVar.next())));
        }
        m106921m(arrayList, true);
    }

    /* renamed from: j */
    public static void m106918j(C86301e eVar, C86301e eVar2, C86301e.C86306e eVar3, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        C86301e.C86306e eVar4;
        boolean z7;
        Application application = f250984a;
        C31195h hVar = f250985b;
        ForkJoinPool forkJoinPool = f250986c;
        C86301e.C86306e eVar5 = C86301e.C86306e.INACTIVE;
        C86301e.C86306e eVar6 = C86301e.C86306e.ACTIVATED;
        if (eVar2.transitLifecycleStatusOnDemand(application, hVar, forkJoinPool, eVar, eVar5, eVar6, z2, true, z3)) {
            Set<C86301e> set = f250989f;
            synchronized (set) {
                set.add(eVar2);
            }
        } else {
            C86301e eVar7 = eVar2;
        }
        boolean[] zArr = f250992i;
        synchronized (zArr) {
            z4 = zArr[0];
        }
        if (z4) {
            z5 = false;
        } else if (z2) {
            z5 = m106915g();
        } else {
            synchronized (f250989f) {
                z7 = f250990g;
            }
            z5 = z7;
        }
        if (z5) {
            eVar2.transitLifecycleStatusOnDemand(f250984a, f250985b, f250986c, eVar, eVar6, eVar3, z2, z, z3);
            return;
        }
        synchronized (zArr) {
            z6 = zArr[0];
        }
        if (z6 && eVar3 != (eVar4 = C86301e.C86306e.INITIALIZED)) {
            eVar2.transitLifecycleStatusOnDemand(f250984a, f250985b, f250986c, eVar, eVar4, eVar3, z2, z, z3);
        }
    }

    /* renamed from: k */
    public static void m106919k(boolean z) {
        m106910b("calling preloadServicesWithAsyncMode()");
        boolean[] zArr = f250991h;
        if (!zArr[0]) {
            synchronized (zArr) {
                if (!zArr[0]) {
                    zArr[0] = true;
                    m106909a(f250985b.mo58018c(C31607a.ASYNC), C86301e.C86306e.INITIALIZED, z, false);
                }
            }
        }
    }

    /* renamed from: l */
    public static void m106920l() {
        m106910b("calling preloadServicesWithOnSplashMode()");
        C86321j jVar = C86321j.INSTANCE;
        jVar.f251014f.set(8);
        C80637z0 z0Var = C80637z0.INSTANCE;
        z0Var.mo112374e(C80637z0.C80646h.UNTIL_PRELOAD_ON_SPLASH_BEGIN);
        m106909a(f250985b.mo58018c(C31607a.ON_SPLASH), C86301e.C86306e.INITIALIZED, true, false);
        z0Var.mo112374e(C80637z0.C80646h.UNTIL_PRELOAD_ON_SPLASH_END);
        jVar.f251014f.set(6);
    }

    /* renamed from: m */
    public static void m106921m(Collection<Future<?>> collection, boolean z) {
        if (z) {
            for (Future future : collection) {
                try {
                    future.get();
                } catch (Throwable th) {
                    th = th;
                    Throwable cause = th.getCause();
                    while ((cause instanceof ExecutionException) && cause.getCause() != null) {
                        cause = cause.getCause();
                    }
                    if (cause != null) {
                        th = cause;
                    }
                    throw th;
                }
            }
            return;
        }
        for (Future next : collection) {
            while (true) {
                try {
                    next.get();
                    break;
                } catch (Throwable th4) {
                    if (!(th4 instanceof InterruptedException)) {
                        throw th4;
                    }
                }
            }
            throw th4;
        }
    }
}
