package p283z4;

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
import p1167z8.C112608f;

/* renamed from: z4.a */
public abstract class C119049a<V> implements C112608f<V> {

    /* renamed from: g */
    public static final boolean f356561g = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: h */
    public static final Logger f356562h = Logger.getLogger(C119049a.class.getName());

    /* renamed from: i */
    public static final C119051b f356563i;

    /* renamed from: j */
    public static final Object f356564j = new Object();

    /* renamed from: d */
    public volatile Object f356565d;

    /* renamed from: e */
    public volatile C119055e f356566e;

    /* renamed from: f */
    public volatile C119059i f356567f;

    /* renamed from: z4.a$b */
    public static abstract class C119051b {
        public C119051b(C119050a aVar) {
        }

        /* renamed from: a */
        public abstract boolean mo183725a(C119049a<?> aVar, C119055e eVar, C119055e eVar2);

        /* renamed from: b */
        public abstract boolean mo183726b(C119049a<?> aVar, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo183727c(C119049a<?> aVar, C119059i iVar, C119059i iVar2);

        /* renamed from: d */
        public abstract void mo183728d(C119059i iVar, C119059i iVar2);

        /* renamed from: e */
        public abstract void mo183729e(C119059i iVar, Thread thread);
    }

    /* renamed from: z4.a$c */
    public static final class C119052c {

        /* renamed from: c */
        public static final C119052c f356568c;

        /* renamed from: d */
        public static final C119052c f356569d;

        /* renamed from: a */
        public final boolean f356570a;

        /* renamed from: b */
        public final Throwable f356571b;

        static {
            if (C119049a.f356561g) {
                f356569d = null;
                f356568c = null;
                return;
            }
            f356569d = new C119052c(false, (Throwable) null);
            f356568c = new C119052c(true, (Throwable) null);
        }

        public C119052c(boolean z, Throwable th) {
            this.f356570a = z;
            this.f356571b = th;
        }
    }

    /* renamed from: z4.a$d */
    public static final class C119053d {

        /* renamed from: b */
        public static final C119053d f356572b = new C119053d(new C119054a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        public final Throwable f356573a;

        /* renamed from: z4.a$d$a */
        public class C119054a extends Throwable {
            public C119054a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public C119053d(Throwable th) {
            boolean z = C119049a.f356561g;
            th.getClass();
            this.f356573a = th;
        }
    }

    /* renamed from: z4.a$e */
    public static final class C119055e {

        /* renamed from: d */
        public static final C119055e f356574d = new C119055e((Runnable) null, (Executor) null);

        /* renamed from: a */
        public final Runnable f356575a;

        /* renamed from: b */
        public final Executor f356576b;

        /* renamed from: c */
        public C119055e f356577c;

        public C119055e(Runnable runnable, Executor executor) {
            this.f356575a = runnable;
            this.f356576b = executor;
        }
    }

    /* renamed from: z4.a$f */
    public static final class C119056f extends C119051b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<C119059i, Thread> f356578a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<C119059i, C119059i> f356579b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<C119049a, C119059i> f356580c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<C119049a, C119055e> f356581d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<C119049a, Object> f356582e;

        public C119056f(AtomicReferenceFieldUpdater<C119059i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C119059i, C119059i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<C119049a, C119059i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<C119049a, C119055e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<C119049a, Object> atomicReferenceFieldUpdater5) {
            super((C119050a) null);
            this.f356578a = atomicReferenceFieldUpdater;
            this.f356579b = atomicReferenceFieldUpdater2;
            this.f356580c = atomicReferenceFieldUpdater3;
            this.f356581d = atomicReferenceFieldUpdater4;
            this.f356582e = atomicReferenceFieldUpdater5;
        }

        /* renamed from: a */
        public boolean mo183725a(C119049a<?> aVar, C119055e eVar, C119055e eVar2) {
            AtomicReferenceFieldUpdater<C119049a, C119055e> atomicReferenceFieldUpdater = this.f356581d;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, eVar, eVar2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != eVar) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        public boolean mo183726b(C119049a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.f356582e;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != obj) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: c */
        public boolean mo183727c(C119049a<?> aVar, C119059i iVar, C119059i iVar2) {
            AtomicReferenceFieldUpdater<C119049a, C119059i> atomicReferenceFieldUpdater = this.f356580c;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, iVar, iVar2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != iVar) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: d */
        public void mo183728d(C119059i iVar, C119059i iVar2) {
            this.f356579b.lazySet(iVar, iVar2);
        }

        /* renamed from: e */
        public void mo183729e(C119059i iVar, Thread thread) {
            this.f356578a.lazySet(iVar, thread);
        }
    }

    /* renamed from: z4.a$g */
    public static final class C119057g<V> implements Runnable {

        /* renamed from: d */
        public final C119049a<V> f356583d;

        /* renamed from: e */
        public final C112608f<? extends V> f356584e;

        public C119057g(C119049a<V> aVar, C112608f<? extends V> fVar) {
            this.f356583d = aVar;
            this.f356584e = fVar;
        }

        public void run() {
            if (this.f356583d.f356565d == this) {
                if (C119049a.f356563i.mo183726b(this.f356583d, this, C119049a.m167813f(this.f356584e))) {
                    C119049a.m167811c(this.f356583d);
                }
            }
        }
    }

    /* renamed from: z4.a$h */
    public static final class C119058h extends C119051b {
        public C119058h() {
            super((C119050a) null);
        }

        /* renamed from: a */
        public boolean mo183725a(C119049a<?> aVar, C119055e eVar, C119055e eVar2) {
            synchronized (aVar) {
                if (aVar.f356566e != eVar) {
                    return false;
                }
                aVar.f356566e = eVar2;
                return true;
            }
        }

        /* renamed from: b */
        public boolean mo183726b(C119049a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f356565d != obj) {
                    return false;
                }
                aVar.f356565d = obj2;
                return true;
            }
        }

        /* renamed from: c */
        public boolean mo183727c(C119049a<?> aVar, C119059i iVar, C119059i iVar2) {
            synchronized (aVar) {
                if (aVar.f356567f != iVar) {
                    return false;
                }
                aVar.f356567f = iVar2;
                return true;
            }
        }

        /* renamed from: d */
        public void mo183728d(C119059i iVar, C119059i iVar2) {
            iVar.f356587b = iVar2;
        }

        /* renamed from: e */
        public void mo183729e(C119059i iVar, Thread thread) {
            iVar.f356586a = thread;
        }
    }

    /* renamed from: z4.a$i */
    public static final class C119059i {

        /* renamed from: c */
        public static final C119059i f356585c = new C119059i(false);

        /* renamed from: a */
        public volatile Thread f356586a;

        /* renamed from: b */
        public volatile C119059i f356587b;

        public C119059i(boolean z) {
        }

        public C119059i() {
            C119049a.f356563i.mo183729e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: z4.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: z4.a$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: z4.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: z4.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<z4.a$i> r0 = p283z4.C119049a.C119059i.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f356561g = r1
            java.lang.Class<z4.a> r1 = p283z4.C119049a.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f356562h = r1
            z4.a$f r1 = new z4.a$f     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<z4.a> r2 = p283z4.C119049a.class
            java.lang.String r5 = "f"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<z4.a> r0 = p283z4.C119049a.class
            java.lang.Class<z4.a$e> r2 = p283z4.C119049a.C119055e.class
            java.lang.String r6 = "e"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<z4.a> r0 = p283z4.C119049a.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "d"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            z4.a$h r1 = new z4.a$h
            r1.<init>()
        L_0x0054:
            f356563i = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f356562h
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f356564j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p283z4.C119049a.<clinit>():void");
    }

    /* renamed from: c */
    public static void m167811c(C119049a<?> aVar) {
        C119049a<V> aVar2;
        C119055e eVar;
        C119055e eVar2;
        C119055e eVar3 = null;
        C119049a<?> aVar3 = aVar;
        while (true) {
            C119059i iVar = aVar3.f356567f;
            if (f356563i.mo183727c(aVar3, iVar, C119059i.f356585c)) {
                while (iVar != null) {
                    Thread thread = iVar.f356586a;
                    if (thread != null) {
                        iVar.f356586a = null;
                        LockSupport.unpark(thread);
                    }
                    iVar = iVar.f356587b;
                }
                do {
                    eVar = aVar3.f356566e;
                } while (!f356563i.mo183725a(aVar3, eVar, C119055e.f356574d));
                while (true) {
                    eVar2 = eVar3;
                    eVar3 = eVar;
                    if (eVar3 == null) {
                        break;
                    }
                    eVar = eVar3.f356577c;
                    eVar3.f356577c = eVar2;
                }
                while (eVar2 != null) {
                    eVar3 = eVar2.f356577c;
                    Runnable runnable = eVar2.f356575a;
                    if (runnable instanceof C119057g) {
                        C119057g gVar = (C119057g) runnable;
                        C119049a<V> aVar4 = gVar.f356583d;
                        if (aVar4.f356565d == gVar) {
                            if (f356563i.mo183726b(aVar4, gVar, m167813f(gVar.f356584e))) {
                                aVar2 = aVar4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m167812d(runnable, eVar2.f356576b);
                    }
                    eVar2 = eVar3;
                }
                return;
            }
            aVar2 = aVar3;
            aVar3 = aVar2;
        }
    }

    /* renamed from: d */
    public static void m167812d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f356562h;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m167813f(p1167z8.C112608f<?> r5) {
        /*
            boolean r0 = r5 instanceof p283z4.C119049a
            r1 = 0
            if (r0 == 0) goto L_0x0023
            z4.a r5 = (p283z4.C119049a) r5
            java.lang.Object r5 = r5.f356565d
            boolean r0 = r5 instanceof p283z4.C119049a.C119052c
            if (r0 == 0) goto L_0x0022
            r0 = r5
            z4.a$c r0 = (p283z4.C119049a.C119052c) r0
            boolean r2 = r0.f356570a
            if (r2 == 0) goto L_0x0022
            java.lang.Throwable r5 = r0.f356571b
            if (r5 == 0) goto L_0x0020
            z4.a$c r5 = new z4.a$c
            java.lang.Throwable r0 = r0.f356571b
            r5.<init>(r1, r0)
            goto L_0x0022
        L_0x0020:
            z4.a$c r5 = p283z4.C119049a.C119052c.f356569d
        L_0x0022:
            return r5
        L_0x0023:
            boolean r0 = r5.isCancelled()
            boolean r2 = f356561g
            r3 = 1
            r2 = r2 ^ r3
            r2 = r2 & r0
            if (r2 == 0) goto L_0x0031
            z4.a$c r5 = p283z4.C119049a.C119052c.f356569d
            return r5
        L_0x0031:
            r2 = 0
        L_0x0032:
            java.lang.Object r3 = r5.get()     // Catch:{ InterruptedException -> 0x008a, all -> 0x004b }
            if (r2 == 0) goto L_0x003f
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ ExecutionException -> 0x0048, CancellationException -> 0x0046, all -> 0x0044 }
            r2.interrupt()     // Catch:{ ExecutionException -> 0x0048, CancellationException -> 0x0046, all -> 0x0044 }
        L_0x003f:
            if (r3 != 0) goto L_0x004a
            java.lang.Object r3 = f356564j     // Catch:{ ExecutionException -> 0x0048, CancellationException -> 0x0046, all -> 0x0044 }
            goto L_0x004a
        L_0x0044:
            r5 = move-exception
            goto L_0x0056
        L_0x0046:
            r2 = move-exception
            goto L_0x005c
        L_0x0048:
            r5 = move-exception
            goto L_0x0080
        L_0x004a:
            return r3
        L_0x004b:
            r3 = move-exception
            if (r2 == 0) goto L_0x0055
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ ExecutionException -> 0x0048, CancellationException -> 0x0046, all -> 0x0044 }
            r2.interrupt()     // Catch:{ ExecutionException -> 0x0048, CancellationException -> 0x0046, all -> 0x0044 }
        L_0x0055:
            throw r3     // Catch:{ ExecutionException -> 0x0048, CancellationException -> 0x0046, all -> 0x0044 }
        L_0x0056:
            z4.a$d r0 = new z4.a$d
            r0.<init>(r5)
            return r0
        L_0x005c:
            if (r0 != 0) goto L_0x007a
            z4.a$d r0 = new z4.a$d
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "get() threw CancellationException, despite reporting isCancelled() == false: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r1.<init>(r5, r2)
            r0.<init>(r1)
            return r0
        L_0x007a:
            z4.a$c r5 = new z4.a$c
            r5.<init>(r1, r2)
            return r5
        L_0x0080:
            z4.a$d r0 = new z4.a$d
            java.lang.Throwable r5 = r5.getCause()
            r0.<init>(r5)
            return r0
        L_0x008a:
            r2 = 1
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: p283z4.C119049a.m167813f(z8.f):java.lang.Object");
    }

    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        C119055e eVar = this.f356566e;
        if (eVar != C119055e.f356574d) {
            C119055e eVar2 = new C119055e(runnable, executor);
            do {
                eVar2.f356577c = eVar;
                if (!f356563i.mo183725a(this, eVar, eVar2)) {
                    eVar = this.f356566e;
                } else {
                    return;
                }
            } while (eVar != C119055e.f356574d);
        }
        m167812d(runnable, executor);
    }

    /* renamed from: b */
    public final void mo183715b(StringBuilder sb) {
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

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, z8.f<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f356565d
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof p283z4.C119049a.C119057g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x005c
            boolean r3 = f356561g
            if (r3 == 0) goto L_0x001f
            z4.a$c r3 = new z4.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            z4.a$c r3 = p283z4.C119049a.C119052c.f356568c
            goto L_0x0026
        L_0x0024:
            z4.a$c r3 = p283z4.C119049a.C119052c.f356569d
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            z4.a$b r6 = f356563i
            boolean r6 = r6.mo183726b(r4, r0, r3)
            if (r6 == 0) goto L_0x0054
            m167811c(r4)
            boolean r4 = r0 instanceof p283z4.C119049a.C119057g
            if (r4 == 0) goto L_0x005d
            z4.a$g r0 = (p283z4.C119049a.C119057g) r0
            z8.f<? extends V> r0 = r0.f356584e
            boolean r4 = r0 instanceof p283z4.C119049a
            if (r4 == 0) goto L_0x0050
            r4 = r0
            z4.a r4 = (p283z4.C119049a) r4
            java.lang.Object r0 = r4.f356565d
            if (r0 != 0) goto L_0x0048
            r5 = 1
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            boolean r6 = r0 instanceof p283z4.C119049a.C119057g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x005d
            r5 = 1
            goto L_0x0028
        L_0x0050:
            r0.cancel(r8)
            goto L_0x005d
        L_0x0054:
            java.lang.Object r0 = r4.f356565d
            boolean r6 = r0 instanceof p283z4.C119049a.C119057g
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x005d
        L_0x005c:
            r1 = 0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p283z4.C119049a.cancel(boolean):boolean");
    }

    /* renamed from: e */
    public final V mo183717e(Object obj) {
        if (obj instanceof C119052c) {
            Throwable th = ((C119052c) obj).f356571b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof C119053d) {
            throw new ExecutionException(((C119053d) obj).f356573a);
        } else if (obj == f356564j) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: g */
    public String mo183718g() {
        Object obj = this.f356565d;
        if (obj instanceof C119057g) {
            StringBuilder sb = new StringBuilder();
            sb.append("setFuture=[");
            C112608f<? extends V> fVar = ((C119057g) obj).f356584e;
            sb.append(fVar == this ? "this future" : String.valueOf(fVar));
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
            Object obj = this.f356565d;
            if ((obj != null) && (!(obj instanceof C119057g))) {
                return mo183717e(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C119059i iVar = this.f356567f;
                if (iVar != C119059i.f356585c) {
                    C119059i iVar2 = new C119059i();
                    do {
                        C119051b bVar = f356563i;
                        bVar.mo183728d(iVar2, iVar);
                        if (bVar.mo183727c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f356565d;
                                    if ((obj2 != null) && (!(obj2 instanceof C119057g))) {
                                        return mo183717e(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    mo183721h(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            mo183721h(iVar2);
                        } else {
                            iVar = this.f356567f;
                        }
                    } while (iVar != C119059i.f356585c);
                }
                return mo183717e(this.f356565d);
            }
            while (nanos > 0) {
                Object obj3 = this.f356565d;
                if ((obj3 != null) && (!(obj3 instanceof C119057g))) {
                    return mo183717e(obj3);
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
    public final void mo183721h(C119059i iVar) {
        iVar.f356586a = null;
        while (true) {
            C119059i iVar2 = this.f356567f;
            if (iVar2 != C119059i.f356585c) {
                C119059i iVar3 = null;
                while (iVar2 != null) {
                    C119059i iVar4 = iVar2.f356587b;
                    if (iVar2.f356586a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f356587b = iVar4;
                        if (iVar3.f356586a == null) {
                        }
                    } else if (!f356563i.mo183727c(this, iVar2, iVar4)) {
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    public final boolean isCancelled() {
        return this.f356565d instanceof C119052c;
    }

    public final boolean isDone() {
        Object obj = this.f356565d;
        return (!(obj instanceof C119057g)) & (obj != null);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f356565d instanceof C119052c) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            mo183715b(sb);
        } else {
            try {
                str = mo183718g();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                mo183715b(sb);
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
            Object obj2 = this.f356565d;
            if ((obj2 != null) && (!(obj2 instanceof C119057g))) {
                return mo183717e(obj2);
            }
            C119059i iVar = this.f356567f;
            if (iVar != C119059i.f356585c) {
                C119059i iVar2 = new C119059i();
                do {
                    C119051b bVar = f356563i;
                    bVar.mo183728d(iVar2, iVar);
                    if (bVar.mo183727c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f356565d;
                            } else {
                                mo183721h(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C119057g))));
                        return mo183717e(obj);
                    }
                    iVar = this.f356567f;
                } while (iVar != C119059i.f356585c);
            }
            return mo183717e(this.f356565d);
        }
        throw new InterruptedException();
    }
}
