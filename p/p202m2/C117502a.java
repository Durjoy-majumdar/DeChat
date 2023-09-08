package p202m2;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p1167z8.C112608f;

/* renamed from: m2.a */
public abstract class C117502a<V> implements C112608f<V> {

    /* renamed from: g */
    public static final boolean f351611g = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: h */
    public static final Logger f351612h = Logger.getLogger(C117502a.class.getName());

    /* renamed from: i */
    public static final C117504b f351613i;

    /* renamed from: j */
    public static final Object f351614j = new Object();

    /* renamed from: d */
    public volatile Object f351615d;

    /* renamed from: e */
    public volatile C117508e f351616e;

    /* renamed from: f */
    public volatile C117511i f351617f;

    /* renamed from: m2.a$g */
    public static final class C109471g<V> implements Runnable {
        public void run() {
            throw null;
        }
    }

    /* renamed from: m2.a$b */
    public static abstract class C117504b {
        public C117504b(C117503a aVar) {
        }

        /* renamed from: a */
        public abstract boolean mo182225a(C117502a<?> aVar, C117508e eVar, C117508e eVar2);

        /* renamed from: b */
        public abstract boolean mo182226b(C117502a<?> aVar, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo182227c(C117502a<?> aVar, C117511i iVar, C117511i iVar2);

        /* renamed from: d */
        public abstract void mo182228d(C117511i iVar, C117511i iVar2);

        /* renamed from: e */
        public abstract void mo182229e(C117511i iVar, Thread thread);
    }

    /* renamed from: m2.a$c */
    public static final class C117505c {

        /* renamed from: b */
        public static final C117505c f351618b;

        /* renamed from: c */
        public static final C117505c f351619c;

        /* renamed from: a */
        public final Throwable f351620a;

        static {
            if (C117502a.f351611g) {
                f351619c = null;
                f351618b = null;
                return;
            }
            f351619c = new C117505c(false, (Throwable) null);
            f351618b = new C117505c(true, (Throwable) null);
        }

        public C117505c(boolean z, Throwable th) {
            this.f351620a = th;
        }
    }

    /* renamed from: m2.a$d */
    public static final class C117506d {

        /* renamed from: a */
        public final Throwable f351621a;

        /* renamed from: m2.a$d$a */
        public class C117507a extends Throwable {
            public C117507a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new C117506d(new C117507a("Failure occurred while trying to finish a future."));
        }

        public C117506d(Throwable th) {
            boolean z = C117502a.f351611g;
            th.getClass();
            this.f351621a = th;
        }
    }

    /* renamed from: m2.a$e */
    public static final class C117508e {

        /* renamed from: d */
        public static final C117508e f351622d = new C117508e((Runnable) null, (Executor) null);

        /* renamed from: a */
        public final Runnable f351623a;

        /* renamed from: b */
        public final Executor f351624b;

        /* renamed from: c */
        public C117508e f351625c;

        public C117508e(Runnable runnable, Executor executor) {
            this.f351623a = runnable;
            this.f351624b = executor;
        }
    }

    /* renamed from: m2.a$f */
    public static final class C117509f extends C117504b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<C117511i, Thread> f351626a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<C117511i, C117511i> f351627b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<C117502a, C117511i> f351628c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<C117502a, C117508e> f351629d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<C117502a, Object> f351630e;

        public C117509f(AtomicReferenceFieldUpdater<C117511i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C117511i, C117511i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<C117502a, C117511i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<C117502a, C117508e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<C117502a, Object> atomicReferenceFieldUpdater5) {
            super((C117503a) null);
            this.f351626a = atomicReferenceFieldUpdater;
            this.f351627b = atomicReferenceFieldUpdater2;
            this.f351628c = atomicReferenceFieldUpdater3;
            this.f351629d = atomicReferenceFieldUpdater4;
            this.f351630e = atomicReferenceFieldUpdater5;
        }

        /* renamed from: a */
        public boolean mo182225a(C117502a<?> aVar, C117508e eVar, C117508e eVar2) {
            AtomicReferenceFieldUpdater<C117502a, C117508e> atomicReferenceFieldUpdater = this.f351629d;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, eVar, eVar2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != eVar) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        public boolean mo182226b(C117502a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.f351630e;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != obj) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: c */
        public boolean mo182227c(C117502a<?> aVar, C117511i iVar, C117511i iVar2) {
            AtomicReferenceFieldUpdater<C117502a, C117511i> atomicReferenceFieldUpdater = this.f351628c;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, iVar, iVar2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != iVar) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: d */
        public void mo182228d(C117511i iVar, C117511i iVar2) {
            this.f351627b.lazySet(iVar, iVar2);
        }

        /* renamed from: e */
        public void mo182229e(C117511i iVar, Thread thread) {
            this.f351626a.lazySet(iVar, thread);
        }
    }

    /* renamed from: m2.a$h */
    public static final class C117510h extends C117504b {
        public C117510h() {
            super((C117503a) null);
        }

        /* renamed from: a */
        public boolean mo182225a(C117502a<?> aVar, C117508e eVar, C117508e eVar2) {
            synchronized (aVar) {
                if (aVar.f351616e != eVar) {
                    return false;
                }
                aVar.f351616e = eVar2;
                return true;
            }
        }

        /* renamed from: b */
        public boolean mo182226b(C117502a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f351615d != obj) {
                    return false;
                }
                aVar.f351615d = obj2;
                return true;
            }
        }

        /* renamed from: c */
        public boolean mo182227c(C117502a<?> aVar, C117511i iVar, C117511i iVar2) {
            synchronized (aVar) {
                if (aVar.f351617f != iVar) {
                    return false;
                }
                aVar.f351617f = iVar2;
                return true;
            }
        }

        /* renamed from: d */
        public void mo182228d(C117511i iVar, C117511i iVar2) {
            iVar.f351633b = iVar2;
        }

        /* renamed from: e */
        public void mo182229e(C117511i iVar, Thread thread) {
            iVar.f351632a = thread;
        }
    }

    /* renamed from: m2.a$i */
    public static final class C117511i {

        /* renamed from: c */
        public static final C117511i f351631c = new C117511i(false);

        /* renamed from: a */
        public volatile Thread f351632a;

        /* renamed from: b */
        public volatile C117511i f351633b;

        public C117511i(boolean z) {
        }

        public C117511i() {
            C117502a.f351613i.mo182229e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: m2.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: m2.a$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: m2.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: m2.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<m2.a$i> r0 = p202m2.C117502a.C117511i.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f351611g = r1
            java.lang.Class<m2.a> r1 = p202m2.C117502a.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f351612h = r1
            m2.a$f r1 = new m2.a$f     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<m2.a> r2 = p202m2.C117502a.class
            java.lang.String r5 = "f"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<m2.a> r0 = p202m2.C117502a.class
            java.lang.Class<m2.a$e> r2 = p202m2.C117502a.C117508e.class
            java.lang.String r6 = "e"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<m2.a> r0 = p202m2.C117502a.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "d"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            m2.a$h r1 = new m2.a$h
            r1.<init>()
        L_0x0054:
            f351613i = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f351612h
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f351614j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p202m2.C117502a.<clinit>():void");
    }

    /* renamed from: c */
    public static void m165738c(C117502a<?> aVar) {
        C117511i iVar;
        C117508e eVar;
        do {
            iVar = aVar.f351617f;
        } while (!f351613i.mo182227c(aVar, iVar, C117511i.f351631c));
        while (iVar != null) {
            Thread thread = iVar.f351632a;
            if (thread != null) {
                iVar.f351632a = null;
                LockSupport.unpark(thread);
            }
            iVar = iVar.f351633b;
        }
        do {
            eVar = aVar.f351616e;
        } while (!f351613i.mo182225a(aVar, eVar, C117508e.f351622d));
        C117508e eVar2 = null;
        while (eVar != null) {
            C117508e eVar3 = eVar.f351625c;
            eVar.f351625c = eVar2;
            eVar2 = eVar;
            eVar = eVar3;
        }
        while (eVar2 != null) {
            C117508e eVar4 = eVar2.f351625c;
            Runnable runnable = eVar2.f351623a;
            if (!(runnable instanceof C109471g)) {
                m165739d(runnable, eVar2.f351624b);
                eVar2 = eVar4;
            } else {
                ((C109471g) runnable).getClass();
                throw null;
            }
        }
    }

    /* renamed from: d */
    public static void m165739d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f351612h;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* renamed from: f */
    public static <V> V m165740f(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
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
        return v;
    }

    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        C117508e eVar = this.f351616e;
        if (eVar != C117508e.f351622d) {
            C117508e eVar2 = new C117508e(runnable, executor);
            do {
                eVar2.f351625c = eVar;
                if (!f351613i.mo182225a(this, eVar, eVar2)) {
                    eVar = this.f351616e;
                } else {
                    return;
                }
            } while (eVar != C117508e.f351622d);
        }
        m165739d(runnable, executor);
    }

    /* renamed from: b */
    public final void mo182215b(StringBuilder sb) {
        try {
            Object f = m165740f(this);
            sb.append("SUCCESS, result=[");
            sb.append(f == this ? "this future" : String.valueOf(f));
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public final boolean cancel(boolean z) {
        Object obj = this.f351615d;
        if (!(obj == null) && !(obj instanceof C109471g)) {
            return false;
        }
        C117505c cVar = f351611g ? new C117505c(z, new CancellationException("Future.cancel() was called.")) : z ? C117505c.f351618b : C117505c.f351619c;
        while (!f351613i.mo182226b(this, obj, cVar)) {
            obj = this.f351615d;
            if (!(obj instanceof C109471g)) {
            }
        }
        m165738c(this);
        if (!(obj instanceof C109471g)) {
            return true;
        }
        ((C109471g) obj).getClass();
        throw null;
        return false;
    }

    /* renamed from: e */
    public final V mo182217e(Object obj) {
        if (obj instanceof C117505c) {
            Throwable th = ((C117505c) obj).f351620a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof C117506d) {
            throw new ExecutionException(((C117506d) obj).f351621a);
        } else if (obj == f351614j) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: g */
    public String mo182218g() {
        Object obj = this.f351615d;
        if (obj instanceof C109471g) {
            StringBuilder sb = new StringBuilder();
            sb.append("setFuture=[");
            ((C109471g) obj).getClass();
            sb.append("null");
            sb.append("]");
            return sb.toString();
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    public final V get(long j, TimeUnit timeUnit) {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f351615d;
            if ((obj != null) && (!(obj instanceof C109471g))) {
                return mo182217e(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C117511i iVar = this.f351617f;
                if (iVar != C117511i.f351631c) {
                    C117511i iVar2 = new C117511i();
                    do {
                        C117504b bVar = f351613i;
                        bVar.mo182228d(iVar2, iVar);
                        if (bVar.mo182227c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f351615d;
                                    if ((obj2 != null) && (!(obj2 instanceof C109471g))) {
                                        return mo182217e(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    mo182221h(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            mo182221h(iVar2);
                        } else {
                            iVar = this.f351617f;
                        }
                    } while (iVar != C117511i.f351631c);
                }
                return mo182217e(this.f351615d);
            }
            while (nanos > 0) {
                Object obj3 = this.f351615d;
                if ((obj3 != null) && (!(obj3 instanceof C109471g))) {
                    return mo182217e(obj3);
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

    /* renamed from: h */
    public final void mo182221h(C117511i iVar) {
        iVar.f351632a = null;
        while (true) {
            C117511i iVar2 = this.f351617f;
            if (iVar2 != C117511i.f351631c) {
                C117511i iVar3 = null;
                while (iVar2 != null) {
                    C117511i iVar4 = iVar2.f351633b;
                    if (iVar2.f351632a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f351633b = iVar4;
                        if (iVar3.f351632a == null) {
                        }
                    } else if (!f351613i.mo182227c(this, iVar2, iVar4)) {
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    public final boolean isCancelled() {
        return this.f351615d instanceof C117505c;
    }

    public final boolean isDone() {
        Object obj = this.f351615d;
        return (!(obj instanceof C109471g)) & (obj != null);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f351615d instanceof C117505c) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            mo182215b(sb);
        } else {
            try {
                str = mo182218g();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                mo182215b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f351615d;
            if ((obj2 != null) && (!(obj2 instanceof C109471g))) {
                return mo182217e(obj2);
            }
            C117511i iVar = this.f351617f;
            if (iVar != C117511i.f351631c) {
                C117511i iVar2 = new C117511i();
                do {
                    C117504b bVar = f351613i;
                    bVar.mo182228d(iVar2, iVar);
                    if (bVar.mo182227c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f351615d;
                            } else {
                                mo182221h(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C109471g))));
                        return mo182217e(obj);
                    }
                    iVar = this.f351617f;
                } while (iVar != C117511i.f351631c);
            }
            return mo182217e(this.f351615d);
        }
        throw new InterruptedException();
    }
}
