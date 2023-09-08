package di3;

import android.content.Context;
import android.os.Looper;
import bp3.C79757o;
import bp3.C79760s;
import com.tencent.p014mm.app.C80611s0;
import com.tencent.p014mm.app.C80622u0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.support.feature_service.ServiceDefException;
import com.tencent.p014mm.support.feature_service.ServiceNotFoundException;
import ei3.C86522b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: di3.e */
public abstract class C86301e implements C7335d {
    private static final String TAG = "MicroMsg.FeatureService";
    private volatile C86301e mActivateSource = null;
    private volatile Throwable mLastCallerStack = null;
    private volatile Throwable mLastException = null;
    private final ThreadLocal<C86305d> mNotifyingFlags = new C86302a(this);
    private volatile C86306e mStatus = C86306e.INACTIVE;
    /* access modifiers changed from: private */
    public final ReentrantLock mStatusLock = new ReentrantLock();
    /* access modifiers changed from: private */
    public volatile C86307f mTransitTask = null;

    /* renamed from: di3.e$a */
    public class C86302a extends ThreadLocal<C86305d> {
        public C86302a(C86301e eVar) {
        }

        public Object initialValue() {
            return new C86305d();
        }
    }

    /* renamed from: di3.e$b */
    public class C86303b implements Callable<Void> {

        /* renamed from: d */
        public final /* synthetic */ C31195h f250955d;

        /* renamed from: e */
        public final /* synthetic */ Class f250956e;

        /* renamed from: f */
        public final /* synthetic */ Throwable f250957f;

        /* renamed from: g */
        public final /* synthetic */ boolean f250958g;

        public C86303b(C31195h hVar, Class cls, Throwable th, boolean z) {
            this.f250955d = hVar;
            this.f250956e = cls;
            this.f250957f = th;
            this.f250958g = z;
        }

        public Object call() {
            try {
                C86301e eVar = (C86301e) this.f250955d.mo58019d(this.f250956e);
                eVar.setLastCallerStack(this.f250957f);
                C86312j.m106918j(C86301e.this, eVar, C86306e.INITIALIZED, false, this.f250958g, true);
                return null;
            } catch (ServiceNotFoundException e) {
                Log.printErrStackTrace(C86301e.TAG, e, "Depended service '%s' of '%s' was not registered on current process: '%s'.", this.f250956e.getName(), C86301e.this.getClass().getName(), C79757o.m96896a(MMApplicationContext.getContext()));
                return null;
            }
        }
    }

    /* renamed from: di3.e$c */
    public class C86304c implements Callable<Void> {
        public C86304c() {
        }

        /* JADX INFO: finally extract failed */
        public Object call() {
            try {
                C86307f access$1400 = C86301e.this.mTransitTask;
                C86301e.this.mStatusLock.unlock();
                access$1400.invoke();
                C86301e.this.mStatusLock.lock();
                return null;
            } catch (Throwable th) {
                C86301e.this.mStatusLock.lock();
                throw th;
            }
        }
    }

    /* renamed from: di3.e$d */
    public static final class C86305d {

        /* renamed from: a */
        public boolean f250961a = false;

        /* renamed from: b */
        public boolean f250962b = false;

        /* renamed from: c */
        public boolean f250963c = false;
    }

    /* renamed from: di3.e$e */
    public enum C86306e {
        ERROR,
        INACTIVE,
        ACTIVATED,
        INITIALIZED
    }

    /* renamed from: di3.e$f */
    public class C86307f extends RecursiveAction {

        /* renamed from: d */
        public final Context f250969d;

        /* renamed from: e */
        public final C31195h f250970e;

        /* renamed from: f */
        public final ForkJoinPool f250971f;

        /* renamed from: g */
        public final C86301e f250972g;

        /* renamed from: h */
        public final C86306e f250973h;

        /* renamed from: i */
        public final C86306e f250974i;

        /* renamed from: j */
        public final boolean f250975j;

        /* renamed from: n */
        public volatile C86309b f250976n = null;

        /* renamed from: o */
        public final Runnable f250977o = new C86308a();

        /* renamed from: di3.e$f$a */
        public class C86308a implements Runnable {
            public C86308a() {
            }

            public void run() {
                C86307f.this.invoke();
            }
        }

        /* renamed from: di3.e$f$b */
        public class C86309b extends RecursiveAction {
            public C86309b(C86302a aVar) {
            }

            /* JADX INFO: finally extract failed */
            /* JADX WARNING: Removed duplicated region for block: B:25:0x00a2  */
            /* JADX WARNING: Removed duplicated region for block: B:27:0x00cc A[SYNTHETIC, Splitter:B:27:0x00cc] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void compute() {
                /*
                    r15 = this;
                    di3.e$e r0 = di3.C86301e.C86306e.ACTIVATED
                    di3.e$e r1 = di3.C86301e.C86306e.INITIALIZED
                    java.lang.String r2 = "[+] feature_service_transit_end: '%s'(%s => %s) of '%s' was invoked on thread: %s(%s)"
                    java.lang.String r3 = "MicroMsg.FeatureService"
                    r4 = 5
                    r5 = 4
                    r6 = 3
                    r7 = 6
                    r8 = 2
                    r9 = 0
                    r10 = 1
                    java.lang.String r11 = "[+] feature_service_transit_start: '%s'(%s => %s) of '%s' was invoked on thread: %s(%s)"
                    java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ all -> 0x00ff }
                    di3.e$f r13 = di3.C86301e.C86307f.this     // Catch:{ all -> 0x00ff }
                    r12[r9] = r13     // Catch:{ all -> 0x00ff }
                    di3.e$e r14 = r13.f250973h     // Catch:{ all -> 0x00ff }
                    r12[r10] = r14     // Catch:{ all -> 0x00ff }
                    di3.e$e r14 = r13.f250974i     // Catch:{ all -> 0x00ff }
                    r12[r8] = r14     // Catch:{ all -> 0x00ff }
                    di3.e r13 = di3.C86301e.this     // Catch:{ all -> 0x00ff }
                    r12[r6] = r13     // Catch:{ all -> 0x00ff }
                    java.lang.Thread r13 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00ff }
                    java.lang.String r13 = r13.getName()     // Catch:{ all -> 0x00ff }
                    r12[r5] = r13     // Catch:{ all -> 0x00ff }
                    int r13 = android.os.Process.myTid()     // Catch:{ all -> 0x00ff }
                    java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x00ff }
                    r12[r4] = r13     // Catch:{ all -> 0x00ff }
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r11, r12)     // Catch:{ all -> 0x00ff }
                    di3.e$f r11 = di3.C86301e.C86307f.this     // Catch:{ all -> 0x00ff }
                    di3.e$e r12 = r11.f250973h     // Catch:{ all -> 0x00ff }
                    di3.e$e r13 = r11.f250974i     // Catch:{ all -> 0x00ff }
                    if (r12 != r13) goto L_0x0066
                    java.lang.Object[] r0 = new java.lang.Object[r7]
                    r0[r9] = r11
                    r0[r10] = r12
                    r0[r8] = r13
                    di3.e r1 = di3.C86301e.this
                    r0[r6] = r1
                    java.lang.Thread r1 = java.lang.Thread.currentThread()
                    java.lang.String r1 = r1.getName()
                    r0[r5] = r1
                    int r1 = android.os.Process.myTid()
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    r0[r4] = r1
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r0)
                    return
                L_0x0066:
                    di3.e$e r14 = di3.C86301e.C86306e.INACTIVE     // Catch:{ all -> 0x00ff }
                    if (r12 != r14) goto L_0x007b
                    if (r13 != r0) goto L_0x0070
                    di3.C86301e.C86307f.m106908b(r11)     // Catch:{ all -> 0x00ff }
                    goto L_0x009f
                L_0x0070:
                    if (r13 != r1) goto L_0x0083
                    di3.C86301e.C86307f.m106908b(r11)     // Catch:{ all -> 0x00ff }
                    di3.e$f r0 = di3.C86301e.C86307f.this     // Catch:{ all -> 0x00ff }
                    di3.C86301e.C86307f.m106907a(r0)     // Catch:{ all -> 0x00ff }
                    goto L_0x009f
                L_0x007b:
                    if (r12 != r0) goto L_0x0085
                    if (r13 != r1) goto L_0x0083
                    di3.C86301e.C86307f.m106907a(r11)     // Catch:{ all -> 0x00ff }
                    goto L_0x009f
                L_0x0083:
                    r0 = 1
                    goto L_0x00a0
                L_0x0085:
                    if (r12 != r1) goto L_0x00e4
                    if (r13 != r0) goto L_0x0083
                    r11.getClass()     // Catch:{ all -> 0x00ff }
                    boolean r0 = di3.C86312j.m106915g()     // Catch:{ all -> 0x00ff }
                    if (r0 == 0) goto L_0x009a
                    di3.e r0 = di3.C86301e.this     // Catch:{ all -> 0x00ff }
                    android.content.Context r1 = r11.f250969d     // Catch:{ all -> 0x00ff }
                    r0.notifyOnAccountReleased(r1)     // Catch:{ all -> 0x00ff }
                    goto L_0x009f
                L_0x009a:
                    di3.e r0 = di3.C86301e.this     // Catch:{ all -> 0x00ff }
                    r0.clearTransitTask()     // Catch:{ all -> 0x00ff }
                L_0x009f:
                    r0 = 0
                L_0x00a0:
                    if (r0 != 0) goto L_0x00cc
                    java.lang.Object[] r0 = new java.lang.Object[r7]
                    di3.e$f r1 = di3.C86301e.C86307f.this
                    r0[r9] = r1
                    di3.e$e r7 = r1.f250973h
                    r0[r10] = r7
                    di3.e$e r7 = r1.f250974i
                    r0[r8] = r7
                    di3.e r1 = di3.C86301e.this
                    r0[r6] = r1
                    java.lang.Thread r1 = java.lang.Thread.currentThread()
                    java.lang.String r1 = r1.getName()
                    r0[r5] = r1
                    int r1 = android.os.Process.myTid()
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    r0[r4] = r1
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r0)
                    return
                L_0x00cc:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00ff }
                    java.lang.String r1 = "Found bad route: %s => %s"
                    java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch:{ all -> 0x00ff }
                    di3.e$f r12 = di3.C86301e.C86307f.this     // Catch:{ all -> 0x00ff }
                    di3.e$e r13 = r12.f250973h     // Catch:{ all -> 0x00ff }
                    r11[r9] = r13     // Catch:{ all -> 0x00ff }
                    di3.e$e r12 = r12.f250974i     // Catch:{ all -> 0x00ff }
                    r11[r10] = r12     // Catch:{ all -> 0x00ff }
                    java.lang.String r1 = java.lang.String.format(r1, r11)     // Catch:{ all -> 0x00ff }
                    r0.<init>(r1)     // Catch:{ all -> 0x00ff }
                    throw r0     // Catch:{ all -> 0x00ff }
                L_0x00e4:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00ff }
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ff }
                    r1.<init>()     // Catch:{ all -> 0x00ff }
                    java.lang.String r11 = "Illegal from-status: "
                    r1.append(r11)     // Catch:{ all -> 0x00ff }
                    di3.e$f r11 = di3.C86301e.C86307f.this     // Catch:{ all -> 0x00ff }
                    di3.e$e r11 = r11.f250973h     // Catch:{ all -> 0x00ff }
                    r1.append(r11)     // Catch:{ all -> 0x00ff }
                    java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ff }
                    r0.<init>(r1)     // Catch:{ all -> 0x00ff }
                    throw r0     // Catch:{ all -> 0x00ff }
                L_0x00ff:
                    r0 = move-exception
                    java.lang.Object[] r1 = new java.lang.Object[r7]
                    di3.e$f r7 = di3.C86301e.C86307f.this
                    r1[r9] = r7
                    di3.e$e r9 = r7.f250973h
                    r1[r10] = r9
                    di3.e$e r9 = r7.f250974i
                    r1[r8] = r9
                    di3.e r7 = di3.C86301e.this
                    r1[r6] = r7
                    java.lang.Thread r6 = java.lang.Thread.currentThread()
                    java.lang.String r6 = r6.getName()
                    r1[r5] = r6
                    int r5 = android.os.Process.myTid()
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                    r1[r4] = r5
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r1)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: di3.C86301e.C86307f.C86309b.compute():void");
            }
        }

        public C86307f(Context context, C31195h hVar, ForkJoinPool forkJoinPool, C86301e eVar, C86306e eVar2, C86306e eVar3, boolean z) {
            this.f250969d = context;
            this.f250970e = hVar;
            this.f250971f = forkJoinPool;
            this.f250972g = eVar;
            this.f250973h = eVar2;
            this.f250974i = eVar3;
            this.f250975j = z;
        }

        /* renamed from: a */
        public static void m106907a(C86307f fVar) {
            boolean z;
            fVar.getClass();
            if (C86312j.m106915g()) {
                boolean[] zArr = C86312j.f250992i;
                synchronized (zArr) {
                    z = zArr[0];
                }
                if (!z) {
                    C86301e.this.notifyOnAccountInitialized(fVar.f250969d);
                    return;
                }
            }
            C86301e.this.clearTransitTask();
        }

        /* renamed from: b */
        public static void m106908b(C86307f fVar) {
            C86301e.this.validateCircularDependency(fVar.f250972g);
            C86301e.this.setActivateSource(fVar.f250972g);
            C86301e.this.resolveDependencies(fVar.f250970e, fVar.f250971f, fVar.f250975j);
            C86301e.this.notifyOnCreate(fVar.f250969d);
        }

        public void compute() {
            boolean z = true;
            if (this.f250976n == null) {
                synchronized (this) {
                    if (this.f250976n == null) {
                        this.f250976n = new C86309b((C86302a) null);
                        z = false;
                    }
                }
            }
            if (z) {
                this.f250976n.join();
            } else {
                this.f250976n.invoke();
            }
        }
    }

    /* access modifiers changed from: private */
    public void clearTransitTask() {
        try {
            this.mStatusLock.lock();
            this.mTransitTask = null;
        } finally {
            this.mStatusLock.unlock();
        }
    }

    private C86306e getStatusLocked() {
        joinTransitTaskLocked();
        return this.mStatus;
    }

    private C86306e getStatusLockedNoWait() {
        return this.mStatus;
    }

    private boolean isReenteredLifeCycleMethodInTransiting(C86306e eVar) {
        C86306e eVar2 = C86306e.INITIALIZED;
        C86306e eVar3 = C86306e.ACTIVATED;
        C86305d dVar = this.mNotifyingFlags.get();
        if (dVar.f250961a && eVar == eVar3) {
            return true;
        }
        if (dVar.f250962b && (eVar == eVar3 || eVar == eVar2)) {
            return true;
        }
        if (dVar.f250963c) {
            return eVar == eVar3 || eVar == eVar2;
        }
        return false;
    }

    private void joinTransitTaskLocked() {
        try {
            C79760s.m96908a("joinTransitTaskLocked: " + this);
            while (this.mTransitTask != null && this.mLastException == null) {
                Log.m105925i(TAG, "[+] '%s' was joined by '%s'", this, this.mTransitTask.f250972g);
                C86307f fVar = this.mTransitTask;
                this.mStatusLock.unlock();
                fVar.getClass();
                C86312j.m106914f(new C86310f(fVar));
                this.mStatusLock.lock();
            }
            if (this.mLastException != null) {
                uncheckedThrow(this.mLastException);
            }
            C79760s.m96909b();
        } catch (Throwable th) {
            C79760s.m96909b();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public void notifyOnAccountInitialized(Context context) {
        C86305d dVar = this.mNotifyingFlags.get();
        try {
            C79760s.m96908a("FS: notifyOnAccountInitialized: " + this);
            dVar.f250962b = true;
            onAccountInitialized(context);
            setStatus(C86306e.INITIALIZED, (Throwable) null);
        } catch (Throwable th) {
            dVar.f250962b = false;
            C79760s.m96909b();
            throw th;
        }
        dVar.f250962b = false;
        C79760s.m96909b();
    }

    /* access modifiers changed from: private */
    public void notifyOnAccountReleased(Context context) {
        C86305d dVar = this.mNotifyingFlags.get();
        try {
            C79760s.m96908a("FS: notifyOnAccountReleased: " + this);
            dVar.f250963c = true;
            onAccountReleased(context);
            setStatus(C86306e.ACTIVATED, (Throwable) null);
        } catch (Throwable th) {
            dVar.f250963c = false;
            C79760s.m96909b();
            throw th;
        }
        dVar.f250963c = false;
        C79760s.m96909b();
    }

    /* access modifiers changed from: private */
    public void notifyOnCreate(Context context) {
        C86305d dVar = this.mNotifyingFlags.get();
        try {
            C79760s.m96908a("FS: notifyOnCreate: " + this);
            dVar.f250961a = true;
            onCreate(context);
            setStatus(C86306e.ACTIVATED, (Throwable) null);
        } catch (Throwable th) {
            dVar.f250961a = false;
            C79760s.m96909b();
            throw th;
        }
        dVar.f250961a = false;
        C79760s.m96909b();
    }

    /* access modifiers changed from: private */
    public void resolveDependencies(C31195h hVar, ForkJoinPool forkJoinPool, boolean z) {
        C86522b bVar = (C86522b) getClass().getAnnotation(C86522b.class);
        if (bVar != null) {
            Class[] dependencies = bVar.dependencies();
            HashSet hashSet = new HashSet(dependencies.length);
            if (dependencies.length > 0) {
                for (Class cls : dependencies) {
                    if (!hashSet.contains(cls)) {
                        if (getClass().isAssignableFrom(cls)) {
                            Log.m105929w(TAG, "[!] '%s' depends on itself.", getClass().getName());
                        } else {
                            hashSet.add(cls);
                        }
                    }
                }
            }
            Log.m105925i(TAG, "[+] resolve dependencies '%s' of '%s'.", hashSet, this);
            if (!hashSet.isEmpty()) {
                ArrayList arrayList = new ArrayList(hashSet.size());
                Throwable th = new Throwable(getLastCallerStack());
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    arrayList.add(forkJoinPool.submit(new C86303b(hVar, (Class) it.next(), th, z)));
                }
                C86312j.m106921m(arrayList, false);
                return;
            }
            return;
        }
        throw new NullPointerException("Fail to get RegisterFeatureService annotation from class '" + getClass().getName() + "'");
    }

    private void rethrowWithCallerStack(Throwable th) {
        Throwable lastCallerStack = getLastCallerStack();
        if (lastCallerStack == null) {
            uncheckedThrow(th);
            return;
        }
        Throwable th4 = th;
        while (th4.getCause() != null) {
            th4 = th4.getCause();
        }
        StackTraceElement[] stackTrace = th4.getStackTrace();
        StackTraceElement[] stackTrace2 = lastCallerStack.getStackTrace();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[(stackTrace.length + stackTrace2.length + 1)];
        System.arraycopy(stackTrace, 0, stackTraceElementArr, 0, stackTrace.length);
        stackTraceElementArr[stackTrace.length] = new StackTraceElement("at Stacktraces.below.is.where.the.transit.task.being.submitted", "________________________________", "SeperatorLine", 0);
        System.arraycopy(stackTrace2, 0, stackTraceElementArr, stackTrace.length + 1, stackTrace2.length);
        th4.setStackTrace(stackTraceElementArr);
        uncheckedThrow(th);
    }

    private void setStatus(C86306e eVar, Throwable th) {
        try {
            this.mStatusLock.lock();
            setStatusLocked(eVar, th);
        } finally {
            this.mStatusLock.unlock();
        }
    }

    private void setStatusLocked(C86306e eVar, Throwable th) {
        this.mStatus = eVar;
        this.mLastException = th;
        if (th == null) {
            this.mTransitTask = null;
        }
    }

    private static <T extends Throwable> void uncheckedThrow(Throwable th) {
        throw th;
    }

    /* access modifiers changed from: private */
    public void validateCircularDependency(C86301e eVar) {
        C86301e eVar2 = eVar;
        while (eVar2 != null) {
            if (eVar2 != this) {
                eVar2 = eVar2.getActivateSource();
            } else {
                throw new ServiceDefException(String.format("circular dependency found between '%s' and '%s'", new Object[]{eVar, this}));
            }
        }
    }

    public final C86301e getActivateSource() {
        try {
            this.mStatusLock.lock();
            return this.mActivateSource;
        } finally {
            this.mStatusLock.unlock();
        }
    }

    public final Throwable getLastCallerStack() {
        try {
            this.mStatusLock.lock();
            return this.mLastCallerStack;
        } finally {
            this.mStatusLock.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (getStatusLockedNoWait() == r4) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        if (r3.mTransitTask.f250974i == r4) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isTransitingToOrArrivedAt(di3.C86301e.C86306e r4) {
        /*
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.mStatusLock     // Catch:{ all -> 0x0020 }
            r0.lock()     // Catch:{ all -> 0x0020 }
            di3.e$f r0 = r3.mTransitTask     // Catch:{ all -> 0x0020 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0019
            di3.e$f r0 = r3.mTransitTask     // Catch:{ all -> 0x0020 }
            di3.e$e r0 = r0.f250974i     // Catch:{ all -> 0x0020 }
            if (r0 != r4) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            java.util.concurrent.locks.ReentrantLock r4 = r3.mStatusLock
            r4.unlock()
            return r1
        L_0x0019:
            di3.e$e r0 = r3.getStatusLockedNoWait()     // Catch:{ all -> 0x0020 }
            if (r0 != r4) goto L_0x0012
            goto L_0x0013
        L_0x0020:
            r4 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r3.mStatusLock
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: di3.C86301e.isTransitingToOrArrivedAt(di3.e$e):boolean");
    }

    public void onAccountInitialized(Context context) {
    }

    public void onAccountReleased(Context context) {
    }

    public void onCreate(Context context) {
    }

    public final void requireAccountInitialized() {
        C86306e eVar = C86306e.INITIALIZED;
        if (C86312j.m106915g()) {
            try {
                this.mStatusLock.lock();
                if (this.mTransitTask != null || getStatusLockedNoWait() != eVar) {
                    this.mStatusLock.unlock();
                    C86305d dVar = this.mNotifyingFlags.get();
                    if (dVar.f250961a) {
                        throw new ServiceDefException(getClass().getName() + ": require account status is not allowed in onCreate method.");
                    } else if (dVar.f250962b) {
                        Log.m105925i(TAG, "%s: require account initialized in 'onAccountInitialized' method.", this);
                    } else if (dVar.f250963c) {
                        Log.m105929w(TAG, "%s: require account initialized in 'onAccountReleased' method.", this);
                    } else {
                        C86312j.m106918j(this, this, eVar, true, true, false);
                    }
                }
            } finally {
                this.mStatusLock.unlock();
            }
        } else {
            C80622u0 a = C80622u0.m98265a(MMApplicationContext.getContext());
            if (a != C80622u0.MM) {
                C80611s0.m98248f(TAG, "%s: require account status in process '%s' but not main process.", getClass().getName(), a.f235886d);
                return;
            }
            throw new ServiceDefException(this + ": require account status before account status was prepared or after logout.");
        }
    }

    public final void setActivateSource(C86301e eVar) {
        try {
            this.mStatusLock.lock();
            this.mActivateSource = eVar;
        } finally {
            this.mStatusLock.unlock();
        }
    }

    public final void setLastCallerStack(Throwable th) {
        try {
            this.mStatusLock.lock();
            if (this.mTransitTask == null) {
                this.mLastCallerStack = th;
            }
        } finally {
            this.mStatusLock.unlock();
        }
    }

    public final boolean transitLifecycleStatusOnDemand(Context context, C31195h hVar, ForkJoinPool forkJoinPool, C86301e eVar, C86306e eVar2, C86306e eVar3, boolean z, boolean z2, boolean z3) {
        C86306e eVar4 = eVar2;
        C86306e eVar5 = eVar3;
        if (!isReenteredLifeCycleMethodInTransiting(eVar5)) {
            C86301e eVar6 = eVar;
            try {
                this.mStatusLock.lock();
                C86306e statusLockedNoWait = getStatusLockedNoWait();
                if (((eVar2.ordinal() > eVar3.ordinal() || statusLockedNoWait.ordinal() < eVar3.ordinal()) && (eVar2.ordinal() < eVar3.ordinal() || statusLockedNoWait.ordinal() > eVar3.ordinal())) || eVar4 == C86306e.INITIALIZED) {
                    if (this.mTransitTask == null || z2) {
                        C86306e statusLocked = getStatusLocked();
                        if (statusLocked == C86306e.ERROR) {
                            throw new ServiceDefException("re-init error occurred feature service.", this.mLastException);
                        } else if (statusLocked == eVar4 && statusLocked != eVar5) {
                            this.mTransitTask = new C86307f(context, hVar, forkJoinPool, eVar, eVar2, eVar3, z);
                            Log.m105925i(TAG, "[+] Create transit task '%s' for transiting(%s => %s) of '%s', wait:%s, on_thread:%s(%s)", this.mTransitTask, eVar4, eVar5, this, Boolean.valueOf(z2), Thread.currentThread().getName(), Long.valueOf(Thread.currentThread().getId()));
                            if (!z2) {
                                forkJoinPool.execute(this.mTransitTask.f250977o);
                            } else if (Looper.myLooper() != null) {
                                C86307f fVar = this.mTransitTask;
                                this.mStatusLock.unlock();
                                fVar.invoke();
                                this.mStatusLock.lock();
                            } else {
                                C86312j.m106914f(new C86304c());
                            }
                            this.mStatusLock.unlock();
                            return true;
                        }
                    }
                }
                this.mStatusLock.unlock();
                return false;
            } catch (Throwable th) {
                this.mStatusLock.unlock();
                throw th;
            }
        } else if (!z3) {
            return false;
        } else {
            throw new ServiceDefException("Reentered lifecycle method of '" + this + "' when resolve '" + eVar + "'");
        }
    }
}
