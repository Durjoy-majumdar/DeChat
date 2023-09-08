package p1167z8;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p1170a9.C112761a;
import sun.misc.Unsafe;

/* renamed from: z8.a */
public abstract class C119065a<V> extends C112761a implements C112608f<V> {

    /* renamed from: g */
    public static final boolean f356598g = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: h */
    public static final Logger f356599h = Logger.getLogger(C119065a.class.getName());

    /* renamed from: i */
    public static final C119067b f356600i;

    /* renamed from: j */
    public static final Object f356601j = new Object();

    /* renamed from: d */
    public volatile Object f356602d;

    /* renamed from: e */
    public volatile C119071e f356603e;

    /* renamed from: f */
    public volatile C119078k f356604f;

    /* renamed from: z8.a$b */
    public static abstract class C119067b {
        public C119067b(C119066a aVar) {
        }

        /* renamed from: a */
        public abstract boolean mo183743a(C119065a<?> aVar, C119071e eVar, C119071e eVar2);

        /* renamed from: b */
        public abstract boolean mo183744b(C119065a<?> aVar, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo183745c(C119065a<?> aVar, C119078k kVar, C119078k kVar2);

        /* renamed from: d */
        public abstract void mo183746d(C119078k kVar, C119078k kVar2);

        /* renamed from: e */
        public abstract void mo183747e(C119078k kVar, Thread thread);
    }

    /* renamed from: z8.a$c */
    public static final class C119068c {

        /* renamed from: b */
        public static final C119068c f356605b;

        /* renamed from: c */
        public static final C119068c f356606c;

        /* renamed from: a */
        public final Throwable f356607a;

        static {
            if (C119065a.f356598g) {
                f356606c = null;
                f356605b = null;
                return;
            }
            f356606c = new C119068c(false, (Throwable) null);
            f356605b = new C119068c(true, (Throwable) null);
        }

        public C119068c(boolean z, Throwable th) {
            this.f356607a = th;
        }
    }

    /* renamed from: z8.a$d */
    public static final class C119069d {

        /* renamed from: a */
        public final Throwable f356608a;

        /* renamed from: z8.a$d$a */
        public static class C119070a extends Throwable {
            public C119070a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new C119069d(new C119070a("Failure occurred while trying to finish a future."));
        }

        public C119069d(Throwable th) {
            th.getClass();
            this.f356608a = th;
        }
    }

    /* renamed from: z8.a$e */
    public static final class C119071e {

        /* renamed from: d */
        public static final C119071e f356609d = new C119071e((Runnable) null, (Executor) null);

        /* renamed from: a */
        public final Runnable f356610a;

        /* renamed from: b */
        public final Executor f356611b;

        /* renamed from: c */
        public C119071e f356612c;

        public C119071e(Runnable runnable, Executor executor) {
            this.f356610a = runnable;
            this.f356611b = executor;
        }
    }

    /* renamed from: z8.a$f */
    public static final class C119072f extends C119067b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<C119078k, Thread> f356613a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<C119078k, C119078k> f356614b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<C119065a, C119078k> f356615c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<C119065a, C119071e> f356616d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<C119065a, Object> f356617e;

        public C119072f(AtomicReferenceFieldUpdater<C119078k, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C119078k, C119078k> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<C119065a, C119078k> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<C119065a, C119071e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<C119065a, Object> atomicReferenceFieldUpdater5) {
            super((C119066a) null);
            this.f356613a = atomicReferenceFieldUpdater;
            this.f356614b = atomicReferenceFieldUpdater2;
            this.f356615c = atomicReferenceFieldUpdater3;
            this.f356616d = atomicReferenceFieldUpdater4;
            this.f356617e = atomicReferenceFieldUpdater5;
        }

        /* renamed from: a */
        public boolean mo183743a(C119065a<?> aVar, C119071e eVar, C119071e eVar2) {
            AtomicReferenceFieldUpdater<C119065a, C119071e> atomicReferenceFieldUpdater = this.f356616d;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, eVar, eVar2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != eVar) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        public boolean mo183744b(C119065a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.f356617e;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != obj) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: c */
        public boolean mo183745c(C119065a<?> aVar, C119078k kVar, C119078k kVar2) {
            AtomicReferenceFieldUpdater<C119065a, C119078k> atomicReferenceFieldUpdater = this.f356615c;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, kVar, kVar2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != kVar) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: d */
        public void mo183746d(C119078k kVar, C119078k kVar2) {
            this.f356614b.lazySet(kVar, kVar2);
        }

        /* renamed from: e */
        public void mo183747e(C119078k kVar, Thread thread) {
            this.f356613a.lazySet(kVar, thread);
        }
    }

    /* renamed from: z8.a$g */
    public static final class C119073g<V> implements Runnable {
        public void run() {
            throw null;
        }
    }

    /* renamed from: z8.a$h */
    public static final class C119074h extends C119067b {
        public C119074h(C119066a aVar) {
            super((C119066a) null);
        }

        /* renamed from: a */
        public boolean mo183743a(C119065a<?> aVar, C119071e eVar, C119071e eVar2) {
            synchronized (aVar) {
                if (aVar.f356603e != eVar) {
                    return false;
                }
                aVar.f356603e = eVar2;
                return true;
            }
        }

        /* renamed from: b */
        public boolean mo183744b(C119065a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f356602d != obj) {
                    return false;
                }
                aVar.f356602d = obj2;
                return true;
            }
        }

        /* renamed from: c */
        public boolean mo183745c(C119065a<?> aVar, C119078k kVar, C119078k kVar2) {
            synchronized (aVar) {
                if (aVar.f356604f != kVar) {
                    return false;
                }
                aVar.f356604f = kVar2;
                return true;
            }
        }

        /* renamed from: d */
        public void mo183746d(C119078k kVar, C119078k kVar2) {
            kVar.f356626b = kVar2;
        }

        /* renamed from: e */
        public void mo183747e(C119078k kVar, Thread thread) {
            kVar.f356625a = thread;
        }
    }

    /* renamed from: z8.a$i */
    public static abstract class C119075i<V> extends C119065a<V> {
        public final void addListener(Runnable runnable, Executor executor) {
            C119065a.super.addListener(runnable, executor);
        }

        public final boolean cancel(boolean z) {
            return C119065a.super.cancel(z);
        }

        public final V get() {
            return C119065a.super.get();
        }

        public final boolean isCancelled() {
            return this.f356602d instanceof C119068c;
        }

        public final boolean isDone() {
            return C119065a.super.isDone();
        }

        public final V get(long j, TimeUnit timeUnit) {
            return C119065a.super.get(j, timeUnit);
        }
    }

    /* renamed from: z8.a$j */
    public static final class C119076j extends C119067b {

        /* renamed from: a */
        public static final Unsafe f356618a;

        /* renamed from: b */
        public static final long f356619b;

        /* renamed from: c */
        public static final long f356620c;

        /* renamed from: d */
        public static final long f356621d;

        /* renamed from: e */
        public static final long f356622e;

        /* renamed from: f */
        public static final long f356623f;

        /* renamed from: z8.a$j$a */
        public static class C119077a implements PrivilegedExceptionAction<Unsafe> {
            /* renamed from: a */
            public Unsafe run() {
                Class<Unsafe> cls = Unsafe.class;
                for (Field field : cls.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get((Object) null);
                    if (cls.isInstance(obj)) {
                        return cls.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
            r1 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new p1167z8.C119065a.C119076j.C119077a());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        static {
            /*
                java.lang.Class<z8.a$k> r0 = p1167z8.C119065a.C119078k.class
                sun.misc.Unsafe r1 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0007 }
                goto L_0x0012
            L_0x0007:
                z8.a$j$a r1 = new z8.a$j$a     // Catch:{ PrivilegedActionException -> 0x005d }
                r1.<init>()     // Catch:{ PrivilegedActionException -> 0x005d }
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch:{ PrivilegedActionException -> 0x005d }
                sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch:{ PrivilegedActionException -> 0x005d }
            L_0x0012:
                java.lang.Class<z8.a> r2 = p1167z8.C119065a.class
                java.lang.String r3 = "f"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                f356620c = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "e"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                f356619b = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "d"
                java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                f356621d = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "a"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                f356622e = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "b"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
                f356623f = r2     // Catch:{ Exception -> 0x0053 }
                f356618a = r1     // Catch:{ Exception -> 0x0053 }
                return
            L_0x0053:
                r0 = move-exception
                p832y8.C53504d.m60045a(r0)
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x005d:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.Throwable r0 = r0.getCause()
                java.lang.String r2 = "Could not initialize intrinsics"
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p1167z8.C119065a.C119076j.<clinit>():void");
        }

        public C119076j(C119066a aVar) {
            super((C119066a) null);
        }

        /* renamed from: a */
        public boolean mo183743a(C119065a<?> aVar, C119071e eVar, C119071e eVar2) {
            return C119079b.m167872a(f356618a, aVar, f356619b, eVar, eVar2);
        }

        /* renamed from: b */
        public boolean mo183744b(C119065a<?> aVar, Object obj, Object obj2) {
            return C119079b.m167872a(f356618a, aVar, f356621d, obj, obj2);
        }

        /* renamed from: c */
        public boolean mo183745c(C119065a<?> aVar, C119078k kVar, C119078k kVar2) {
            return C119079b.m167872a(f356618a, aVar, f356620c, kVar, kVar2);
        }

        /* renamed from: d */
        public void mo183746d(C119078k kVar, C119078k kVar2) {
            f356618a.putObject(kVar, f356623f, kVar2);
        }

        /* renamed from: e */
        public void mo183747e(C119078k kVar, Thread thread) {
            f356618a.putObject(kVar, f356622e, thread);
        }
    }

    /* renamed from: z8.a$k */
    public static final class C119078k {

        /* renamed from: c */
        public static final C119078k f356624c = new C119078k(false);

        /* renamed from: a */
        public volatile Thread f356625a;

        /* renamed from: b */
        public volatile C119078k f356626b;

        public C119078k() {
            C119065a.f356600i.mo183747e(this, Thread.currentThread());
        }

        public C119078k(boolean z) {
        }
    }

    static {
        C119067b bVar;
        Class<C119078k> cls = C119078k.class;
        Throwable th = null;
        try {
            bVar = new C119076j((C119066a) null);
            th = null;
        } catch (Throwable th4) {
            bVar = new C119074h((C119066a) null);
            th = th4;
        }
        f356600i = bVar;
        Class<LockSupport> cls2 = LockSupport.class;
        if (th != null) {
            Logger logger = f356599h;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th);
        }
    }

    /* renamed from: b */
    private void m167845b(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    /* renamed from: c */
    public static void m167846c(C119065a<?> aVar) {
        C119078k kVar;
        C119071e eVar;
        do {
            kVar = aVar.f356604f;
        } while (!f356600i.mo183745c(aVar, kVar, C119078k.f356624c));
        while (kVar != null) {
            Thread thread = kVar.f356625a;
            if (thread != null) {
                kVar.f356625a = null;
                LockSupport.unpark(thread);
            }
            kVar = kVar.f356626b;
        }
        do {
            eVar = aVar.f356603e;
        } while (!f356600i.mo183743a(aVar, eVar, C119071e.f356609d));
        C119071e eVar2 = null;
        while (eVar != null) {
            C119071e eVar3 = eVar.f356612c;
            eVar.f356612c = eVar2;
            eVar2 = eVar;
            eVar = eVar3;
        }
        while (eVar2 != null) {
            C119071e eVar4 = eVar2.f356612c;
            Runnable runnable = eVar2.f356610a;
            if (!(runnable instanceof C119073g)) {
                m167847d(runnable, eVar2.f356611b);
                eVar2 = eVar4;
            } else {
                ((C119073g) runnable).getClass();
                throw null;
            }
        }
    }

    /* renamed from: d */
    public static void m167847d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f356599h;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* renamed from: e */
    private V m167848e(Object obj) {
        if (obj instanceof C119068c) {
            Throwable th = ((C119068c) obj).f356607a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof C119069d) {
            throw new ExecutionException(((C119069d) obj).f356608a);
        } else if (obj == f356601j) {
            return null;
        } else {
            return obj;
        }
    }

    public void addListener(Runnable runnable, Executor executor) {
        C119071e eVar;
        if (runnable == null) {
            throw new NullPointerException("Runnable was null.");
        } else if (executor == null) {
            throw new NullPointerException("Executor was null.");
        } else if (isDone() || (eVar = this.f356603e) == C119071e.f356609d) {
            m167847d(runnable, executor);
        } else {
            C119071e eVar2 = new C119071e(runnable, executor);
            do {
                eVar2.f356612c = eVar;
                if (!f356600i.mo183743a(this, eVar, eVar2)) {
                    eVar = this.f356603e;
                } else {
                    return;
                }
            } while (eVar != C119071e.f356609d);
            m167847d(runnable, executor);
        }
    }

    public boolean cancel(boolean z) {
        Object obj = this.f356602d;
        if (!(obj == null) && !(obj instanceof C119073g)) {
            return false;
        }
        C119068c cVar = f356598g ? new C119068c(z, new CancellationException("Future.cancel() was called.")) : z ? C119068c.f356605b : C119068c.f356606c;
        while (!f356600i.mo183744b(this, obj, cVar)) {
            obj = this.f356602d;
            if (!(obj instanceof C119073g)) {
            }
        }
        m167846c(this);
        if (!(obj instanceof C119073g)) {
            return true;
        }
        ((C119073g) obj).getClass();
        throw null;
        return false;
    }

    /* renamed from: f */
    public String mo183736f() {
        Object obj = this.f356602d;
        if (obj instanceof C119073g) {
            StringBuilder sb = new StringBuilder();
            sb.append("setFuture=[");
            ((C119073g) obj).getClass();
            sb.append("null");
            sb.append("]");
            return sb.toString();
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* renamed from: g */
    public final void mo183737g(C119078k kVar) {
        kVar.f356625a = null;
        while (true) {
            C119078k kVar2 = this.f356604f;
            if (kVar2 != C119078k.f356624c) {
                C119078k kVar3 = null;
                while (kVar2 != null) {
                    C119078k kVar4 = kVar2.f356626b;
                    if (kVar2.f356625a != null) {
                        kVar3 = kVar2;
                    } else if (kVar3 != null) {
                        kVar3.f356626b = kVar4;
                        if (kVar3.f356625a == null) {
                        }
                    } else if (!f356600i.mo183745c(this, kVar2, kVar4)) {
                    }
                    kVar2 = kVar4;
                }
                return;
            }
            return;
        }
    }

    public V get(long j, TimeUnit timeUnit) {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f356602d;
            if ((obj != null) && (!(obj instanceof C119073g))) {
                return m167848e(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C119078k kVar = this.f356604f;
                if (kVar != C119078k.f356624c) {
                    C119078k kVar2 = new C119078k();
                    do {
                        C119067b bVar = f356600i;
                        bVar.mo183746d(kVar2, kVar);
                        if (bVar.mo183745c(this, kVar, kVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f356602d;
                                    if ((obj2 != null) && (!(obj2 instanceof C119073g))) {
                                        return m167848e(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    mo183737g(kVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            mo183737g(kVar2);
                        } else {
                            kVar = this.f356604f;
                        }
                    } while (kVar != C119078k.f356624c);
                }
                return m167848e(this.f356602d);
            }
            while (nanos > 0) {
                Object obj3 = this.f356602d;
                if ((obj3 != null) && (!(obj3 instanceof C119073g))) {
                    return m167848e(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z = i == 0 || nanos2 > 1000;
                if (i > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    public boolean isCancelled() {
        return this.f356602d instanceof C119068c;
    }

    public boolean isDone() {
        Object obj = this.f356602d;
        return (!(obj instanceof C119073g)) & (obj != null);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m167845b(sb);
        } else {
            try {
                str = mo183736f();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m167845b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f356602d;
            if ((obj2 != null) && (!(obj2 instanceof C119073g))) {
                return m167848e(obj2);
            }
            C119078k kVar = this.f356604f;
            if (kVar != C119078k.f356624c) {
                C119078k kVar2 = new C119078k();
                do {
                    C119067b bVar = f356600i;
                    bVar.mo183746d(kVar2, kVar);
                    if (bVar.mo183745c(this, kVar, kVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f356602d;
                            } else {
                                mo183737g(kVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C119073g))));
                        return m167848e(obj);
                    }
                    kVar = this.f356604f;
                } while (kVar != C119078k.f356624c);
            }
            return m167848e(this.f356602d);
        }
        throw new InterruptedException();
    }
}
