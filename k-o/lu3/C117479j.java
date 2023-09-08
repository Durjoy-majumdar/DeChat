package lu3;

import android.os.Looper;
import du3.C116630c;
import eu3.C86698f;
import hu3.C117116a;
import iu3.C117277g;
import iu3.C117279h;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import ju3.C117365a;
import ju3.C117366b;
import ku3.C117419d;
import zt3.C119146d;
import zt3.C119153f;

/* renamed from: lu3.j */
public class C117479j<V> extends FutureTask<V> implements RunnableScheduledFuture<V>, C88656g, Delayed, C34379c<V> {

    /* renamed from: u */
    public static final C117116a f351566u = new C117480a();

    /* renamed from: v */
    public static final AtomicLong f351567v = new AtomicLong();

    /* renamed from: w */
    public static final C117366b f351568w = C117279h.f351135a;

    /* renamed from: x */
    public static final long f351569x = Looper.getMainLooper().getThread().getId();

    /* renamed from: d */
    public boolean f351570d = true;

    /* renamed from: e */
    public long f351571e = 0;

    /* renamed from: f */
    public Thread f351572f;

    /* renamed from: g */
    public long f351573g = 0;

    /* renamed from: h */
    public C119153f f351574h = C119153f.CREATED;

    /* renamed from: i */
    public final long f351575i = f351567v.getAndIncrement();

    /* renamed from: j */
    public volatile long f351576j;

    /* renamed from: n */
    public final long f351577n;

    /* renamed from: o */
    public Object f351578o;

    /* renamed from: p */
    public String f351579p;

    /* renamed from: q */
    public C117277g f351580q;

    /* renamed from: r */
    public C117419d f351581r;

    /* renamed from: s */
    public final int f351582s;

    /* renamed from: t */
    public Throwable f351583t;

    /* renamed from: lu3.j$a */
    public static class C117480a implements C117116a {
        /* renamed from: a */
        public void mo180611a(C117479j jVar) {
            C116630c cVar = C86698f.f251708a;
            if (cVar != null) {
                cVar.mo180611a(jVar);
            }
        }

        /* renamed from: b */
        public void mo180612b(C117479j jVar) {
            C116630c cVar = C86698f.f251708a;
            if (cVar != null) {
                cVar.mo180612b(jVar);
            }
        }

        /* renamed from: d */
        public void mo180614d(C117479j jVar) {
            C116630c cVar = C86698f.f251708a;
            if (cVar != null) {
                cVar.mo180614d(jVar);
            }
        }

        /* renamed from: e */
        public void mo180615e(C117479j jVar) {
            C116630c cVar = C86698f.f251708a;
            if (cVar != null) {
                cVar.mo180615e(jVar);
            }
        }

        /* renamed from: f */
        public void mo180616f(C117479j jVar, long j, long j2) {
            C116630c cVar = C86698f.f251708a;
            if (cVar != null) {
                cVar.mo180616f(jVar, j, j2);
            }
        }

        /* renamed from: h */
        public void mo180618h(C117479j jVar) {
            C116630c cVar = C86698f.f251708a;
            if (cVar != null) {
                cVar.mo180618h(jVar);
            }
        }

        /* renamed from: i */
        public void mo180619i(C117479j jVar) {
            C116630c cVar = C86698f.f251708a;
            if (cVar != null) {
                cVar.mo180619i(jVar);
            }
        }
    }

    public C117479j(Runnable runnable, long j, boolean z) {
        super(runnable, (Object) null);
        this.f351578o = runnable;
        this.f351576j = j;
        this.f351577n = 0;
        this.f351579p = getKey();
        int hashCode = runnable.hashCode();
        this.f351582s = hashCode;
        this.f351570d = z;
        if (z) {
            ((C117480a) f351566u).mo180618h(this);
        }
        C119146d.f356849a.mo174283a(getKey(), hashCode, this.f351574h, j - System.nanoTime(), 0, "", z);
    }

    /* renamed from: a */
    public Thread mo59576a() {
        return this.f351572f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        r6.f351583t = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo182179b(android.os.Looper r7) {
        /*
            r6 = this;
            zt3.h$b r0 = zt3.C119140a.f356821h
            boolean r1 = r0.mo122414c()
            if (r1 == 0) goto L_0x006f
            long r1 = f351569x
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            long r3 = r3.getId()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x006f
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 == 0) goto L_0x006f
            if (r7 != 0) goto L_0x006f
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r1 = r6.getKey()
            r0.mo122415d(r7, r1)
            boolean r7 = r0.mo122412a()
            if (r7 == 0) goto L_0x004d
            java.lang.Class<android.os.Looper> r7 = android.os.Looper.class
            java.lang.String r0 = "sThreadLocal"
            ou3.a r1 = new ou3.a     // Catch:{ Exception -> 0x0049 }
            r1.<init>(r7, r0)     // Catch:{ Exception -> 0x0049 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x0049 }
            r7 = 0
            java.lang.Object r7 = r1.mo123639a(r7)     // Catch:{ all -> 0x0046 }
            monitor-exit(r1)     // Catch:{ Exception -> 0x0049 }
            java.lang.ThreadLocal r7 = (java.lang.ThreadLocal) r7     // Catch:{ Exception -> 0x0049 }
            r0 = 0
            r7.set(r0)     // Catch:{ Exception -> 0x0049 }
            goto L_0x006f
        L_0x0046:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x0049 }
            throw r7     // Catch:{ Exception -> 0x0049 }
        L_0x0049:
            r7 = move-exception
            r6.f351583t = r7
            goto L_0x006f
        L_0x004d:
            boolean r7 = r0.mo122413b()
            if (r7 == 0) goto L_0x006f
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "this task has prepared looper, is not "
            r0.append(r1)
            java.lang.String r1 = r6.getKey()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            r6.f351583t = r7
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lu3.C117479j.mo182179b(android.os.Looper):void");
    }

    /* renamed from: c */
    public C117277g mo182180c() {
        C117277g.C117278a aVar;
        if (this.f351580q == null) {
            C117366b bVar = f351568w;
            String str = this.f351579p;
            ((C117365a) bVar).getClass();
            HashMap<String, C117277g.C117278a> hashMap = C117365a.f351357a;
            synchronized (hashMap) {
                aVar = hashMap.get(str);
                if (aVar == null) {
                    aVar = new C117277g.C117278a(str, new AtomicInteger());
                    hashMap.put(str, aVar);
                }
            }
            this.f351580q = new C117277g(aVar);
        }
        return this.f351580q;
    }

    public boolean cancel(boolean z) {
        if (!super.cancel(z)) {
            return false;
        }
        this.f351574h = C119153f.CANCEL;
        if (this.f351570d) {
            ((C117480a) f351566u).mo180615e(this);
        }
        C119146d.f356849a.mo174283a(getKey(), this.f351582s, this.f351574h, 0, 0, "", this.f351570d);
        C117419d dVar = this.f351581r;
        if (dVar == null) {
            return true;
        }
        dVar.mo182103a(this);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(java.lang.Object r11) {
        /*
            r10 = this;
            java.util.concurrent.Delayed r11 = (java.util.concurrent.Delayed) r11
            r0 = 0
            r1 = -1
            r2 = 1
            if (r11 != r10) goto L_0x0008
            goto L_0x003a
        L_0x0008:
            boolean r3 = r11 instanceof lu3.C117479j
            r4 = 0
            if (r3 == 0) goto L_0x0026
            lu3.j r11 = (lu3.C117479j) r11
            long r6 = r10.f351576j
            long r8 = r11.f351576j
            long r6 = r6 - r8
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x001a
            goto L_0x0035
        L_0x001a:
            if (r0 <= 0) goto L_0x001d
            goto L_0x0039
        L_0x001d:
            long r3 = r10.f351575i
            long r5 = r11.f351575i
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 >= 0) goto L_0x0039
            goto L_0x0035
        L_0x0026:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r6 = r10.getDelay(r3)
            long r8 = r11.getDelay(r3)
            long r6 = r6 - r8
            int r11 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r11 >= 0) goto L_0x0037
        L_0x0035:
            r0 = -1
            goto L_0x003a
        L_0x0037:
            if (r11 <= 0) goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lu3.C117479j.compareTo(java.lang.Object):int");
    }

    public void done() {
        super.done();
        this.f351578o = null;
    }

    public void finalize() {
        super.finalize();
        C119153f fVar = this.f351574h;
        if (fVar == C119153f.CREATED || fVar == C119153f.WAITING) {
            cancel(false);
        }
    }

    public long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.f351576j - System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public String getKey() {
        String str = this.f351579p;
        if (str != null) {
            return str;
        }
        Object obj = this.f351578o;
        return obj instanceof C88655f ? ((C88655f) obj).getKey() : obj.getClass().getName();
    }

    public boolean isPeriodic() {
        return this.f351577n != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01bd A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r21 = this;
            r7 = r21
            zt3.f r1 = zt3.C119153f.COMPLETE
            zt3.f r2 = zt3.C119153f.ERROR
            boolean r0 = r21.isCancelled()
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            ju3.b r0 = f351568w
            iu3.g r3 = r21.mo182180c()
            boolean r3 = r0.mo181963a(r3)
            r4 = 0
            r6 = 0
            r8 = 1
            if (r3 != 0) goto L_0x009c
            iu3.g r1 = r21.mo182180c()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.mo181964d(r1, r2)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x0033
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 + r0
            r7.f351576j = r2
            r6 = 1
        L_0x0033:
            if (r6 == 0) goto L_0x0071
            zt3.f r0 = zt3.C119153f.WAITING
            r7.f351574h = r0
            ku3.d r0 = r7.f351581r
            ku3.a r0 = (ku3.C117409a) r0
            r0.mo182101c(r7)
            boolean r0 = r7.f351570d
            if (r0 == 0) goto L_0x004b
            hu3.a r0 = f351566u
            lu3.j$a r0 = (lu3.C117479j.C117480a) r0
            r0.mo180611a(r7)
        L_0x004b:
            zt3.d$f r8 = zt3.C119146d.f356849a
            java.lang.String r9 = r21.getKey()
            int r10 = r7.f351582s
            iu3.g r0 = r21.mo182180c()
            iu3.g$a r0 = r0.f351131b
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f351134c
            int r11 = r0.get()
            long r0 = r7.f351576j
            long r2 = java.lang.System.nanoTime()
            long r12 = r0 - r2
            ku3.d r0 = r7.f351581r
            java.lang.String r14 = r0.getName()
            r8.mo174285c(r9, r10, r11, r12, r14)
            goto L_0x009b
        L_0x0071:
            zt3.f r0 = zt3.C119153f.THROW
            r7.f351574h = r0
            boolean r0 = r7.f351570d
            if (r0 == 0) goto L_0x0080
            hu3.a r0 = f351566u
            lu3.j$a r0 = (lu3.C117479j.C117480a) r0
            r0.mo180612b(r7)
        L_0x0080:
            zt3.d$f r8 = zt3.C119146d.f356849a
            java.lang.String r9 = r21.getKey()
            int r10 = r7.f351582s
            zt3.f r11 = r7.f351574h
            r12 = 0
            r14 = 0
            ku3.d r0 = r7.f351581r
            java.lang.String r16 = r0.getName()
            boolean r0 = r7.f351570d
            r17 = r0
            r8.mo174283a(r9, r10, r11, r12, r14, r16, r17)
        L_0x009b:
            return
        L_0x009c:
            long r9 = android.os.SystemClock.uptimeMillis()
            r7.f351571e = r9
            long r9 = android.os.SystemClock.currentThreadTimeMillis()
            r7.f351573g = r9
            zt3.f r0 = zt3.C119153f.RUNNING
            r7.f351574h = r0
            zt3.d$f r9 = zt3.C119146d.f356849a
            java.lang.String r10 = r21.getKey()
            int r11 = r7.f351582s
            zt3.f r12 = r7.f351574h
            long r13 = r7.f351571e
            long r4 = r7.f351573g
            ku3.d r0 = r7.f351581r
            java.lang.String r17 = r0.getName()
            boolean r0 = r7.f351570d
            r15 = r4
            r18 = r0
            r9.mo174283a(r10, r11, r12, r13, r15, r17, r18)
            boolean r0 = r7.f351570d
            if (r0 == 0) goto L_0x00d3
            hu3.a r0 = f351566u
            lu3.j$a r0 = (lu3.C117479j.C117480a) r0
            r0.mo180619i(r7)
        L_0x00d3:
            android.os.Looper r9 = android.os.Looper.myLooper()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r7.f351572f = r0
            r3 = 6
            boolean r0 = r21.isPeriodic()     // Catch:{ all -> 0x01be }
            ku3.d r4 = r7.f351581r     // Catch:{ all -> 0x01be }
            ku3.a r4 = (ku3.C117409a) r4     // Catch:{ all -> 0x01be }
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.f351449d     // Catch:{ all -> 0x01be }
            boolean r4 = r4.get()     // Catch:{ all -> 0x01be }
            r4 = r4 ^ r8
            if (r4 != 0) goto L_0x00f3
            r7.cancel(r6)     // Catch:{ all -> 0x01be }
            goto L_0x0122
        L_0x00f3:
            if (r0 != 0) goto L_0x00f9
            super.run()     // Catch:{ all -> 0x01be }
            goto L_0x0122
        L_0x00f9:
            boolean r0 = super.runAndReset()     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x0122
            long r4 = r7.f351577n     // Catch:{ all -> 0x01be }
            r10 = 0
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x010d
            long r10 = r7.f351576j     // Catch:{ all -> 0x01be }
            long r10 = r10 + r4
            r7.f351576j = r10     // Catch:{ all -> 0x01be }
            goto L_0x0120
        L_0x010d:
            long r4 = -r4
            long r10 = java.lang.System.nanoTime()     // Catch:{ all -> 0x01be }
            r12 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x011c
            goto L_0x011d
        L_0x011c:
            r4 = r12
        L_0x011d:
            long r10 = r10 + r4
            r7.f351576j = r10     // Catch:{ all -> 0x01be }
        L_0x0120:
            r0 = 1
            goto L_0x0123
        L_0x0122:
            r0 = 0
        L_0x0123:
            long r4 = android.os.SystemClock.uptimeMillis()
            long r10 = r7.f351571e
            long r4 = r4 - r10
            r7.f351571e = r4
            long r4 = android.os.SystemClock.currentThreadTimeMillis()
            long r10 = r7.f351573g
            long r4 = r4 - r10
            r7.f351573g = r4
            zt3.f r4 = r7.f351574h
            if (r4 == r2) goto L_0x013b
            r7.f351574h = r1
        L_0x013b:
            hu3.a r10 = f351566u
            zt3.f r1 = r7.f351574h
            int r1 = r1.ordinal()
            if (r1 == r8) goto L_0x0177
            if (r1 == r3) goto L_0x0148
            goto L_0x018e
        L_0x0148:
            boolean r1 = r7.f351570d
            if (r1 == 0) goto L_0x0158
            long r3 = r7.f351573g
            long r5 = r7.f351571e
            r1 = r10
            lu3.j$a r1 = (lu3.C117479j.C117480a) r1
            r2 = r21
            r1.mo180616f(r2, r3, r5)
        L_0x0158:
            zt3.d$f r11 = zt3.C119146d.f356849a
            java.lang.String r12 = r21.getKey()
            int r13 = r7.f351582s
            zt3.f r14 = r7.f351574h
            long r1 = r7.f351571e
            long r3 = r7.f351573g
            ku3.d r5 = r7.f351581r
            java.lang.String r19 = r5.getName()
            boolean r5 = r7.f351570d
            r15 = r1
            r17 = r3
            r20 = r5
            r11.mo174283a(r12, r13, r14, r15, r17, r19, r20)
            goto L_0x018e
        L_0x0177:
            boolean r1 = r7.f351570d
            if (r1 == 0) goto L_0x0181
            r1 = r10
            lu3.j$a r1 = (lu3.C117479j.C117480a) r1
            r1.mo180614d(r7)
        L_0x0181:
            zt3.d$f r1 = zt3.C119146d.f356849a
            java.lang.String r2 = r21.getKey()
            int r3 = r7.f351582s
            java.lang.Throwable r4 = r7.f351583t
            r1.mo174284b(r2, r3, r4)
        L_0x018e:
            if (r0 == 0) goto L_0x01a0
            boolean r0 = r7.f351570d
            if (r0 == 0) goto L_0x0199
            lu3.j$a r10 = (lu3.C117479j.C117480a) r10
            r10.mo180618h(r7)
        L_0x0199:
            ku3.d r0 = r7.f351581r
            ku3.a r0 = (ku3.C117409a) r0
            r0.mo182101c(r7)
        L_0x01a0:
            r7.mo182179b(r9)
            java.lang.Throwable r0 = r7.f351583t
            if (r0 == 0) goto L_0x01bd
            boolean r1 = r0 instanceof java.lang.RuntimeException
            if (r1 != 0) goto L_0x01ba
            boolean r1 = r0 instanceof java.lang.Error
            if (r1 == 0) goto L_0x01b2
            java.lang.Error r0 = (java.lang.Error) r0
            throw r0
        L_0x01b2:
            java.lang.Error r0 = new java.lang.Error
            java.lang.Throwable r1 = r7.f351583t
            r0.<init>(r1)
            throw r0
        L_0x01ba:
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L_0x01bd:
            return
        L_0x01be:
            r0 = move-exception
            long r4 = android.os.SystemClock.uptimeMillis()
            long r10 = r7.f351571e
            long r4 = r4 - r10
            r7.f351571e = r4
            long r4 = android.os.SystemClock.currentThreadTimeMillis()
            long r10 = r7.f351573g
            long r4 = r4 - r10
            r7.f351573g = r4
            zt3.f r4 = r7.f351574h
            if (r4 == r2) goto L_0x01d7
            r7.f351574h = r1
        L_0x01d7:
            hu3.a r1 = f351566u
            zt3.f r2 = r7.f351574h
            int r2 = r2.ordinal()
            if (r2 == r8) goto L_0x0210
            if (r2 != r3) goto L_0x0226
            boolean r2 = r7.f351570d
            if (r2 == 0) goto L_0x01f2
            long r3 = r7.f351573g
            long r5 = r7.f351571e
            lu3.j$a r1 = (lu3.C117479j.C117480a) r1
            r2 = r21
            r1.mo180616f(r2, r3, r5)
        L_0x01f2:
            zt3.d$f r10 = zt3.C119146d.f356849a
            java.lang.String r11 = r21.getKey()
            int r12 = r7.f351582s
            zt3.f r13 = r7.f351574h
            long r14 = r7.f351571e
            long r1 = r7.f351573g
            ku3.d r3 = r7.f351581r
            java.lang.String r18 = r3.getName()
            boolean r3 = r7.f351570d
            r16 = r1
            r19 = r3
            r10.mo174283a(r11, r12, r13, r14, r16, r18, r19)
            goto L_0x0226
        L_0x0210:
            boolean r2 = r7.f351570d
            if (r2 == 0) goto L_0x0219
            lu3.j$a r1 = (lu3.C117479j.C117480a) r1
            r1.mo180614d(r7)
        L_0x0219:
            zt3.d$f r1 = zt3.C119146d.f356849a
            java.lang.String r2 = r21.getKey()
            int r3 = r7.f351582s
            java.lang.Throwable r4 = r7.f351583t
            r1.mo174284b(r2, r3, r4)
        L_0x0226:
            r7.mo182179b(r9)
            java.lang.Throwable r1 = r7.f351583t
            if (r1 == 0) goto L_0x0243
            boolean r0 = r1 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L_0x0240
            boolean r0 = r1 instanceof java.lang.Error
            if (r0 == 0) goto L_0x0238
            java.lang.Error r1 = (java.lang.Error) r1
            throw r1
        L_0x0238:
            java.lang.Error r0 = new java.lang.Error
            java.lang.Throwable r1 = r7.f351583t
            r0.<init>(r1)
            throw r0
        L_0x0240:
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1
            throw r1
        L_0x0243:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lu3.C117479j.run():void");
    }

    public void setException(Throwable th) {
        super.setException(th);
        this.f351574h = C119153f.ERROR;
        this.f351583t = th;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117479j(Runnable runnable, long j, long j2, boolean z) {
        super(runnable, (Object) null);
        long j3 = j;
        boolean z2 = z;
        this.f351578o = runnable;
        this.f351576j = j3;
        this.f351577n = j2;
        this.f351579p = getKey();
        int hashCode = runnable.hashCode();
        this.f351582s = hashCode;
        this.f351570d = z2;
        if (z2) {
            ((C117480a) f351566u).mo180618h(this);
        }
        C119146d.f356849a.mo174283a(getKey(), hashCode, this.f351574h, j3 - System.nanoTime(), 0, "", z);
    }

    public C117479j(Callable<V> callable, long j, boolean z) {
        super(callable);
        this.f351578o = callable;
        this.f351576j = j;
        this.f351577n = 0;
        this.f351579p = getKey();
        int hashCode = callable.hashCode();
        this.f351582s = hashCode;
        this.f351570d = z;
        if (z) {
            ((C117480a) f351566u).mo180618h(this);
        }
        C119146d.f356849a.mo174283a(getKey(), hashCode, this.f351574h, j - System.nanoTime(), 0, "", z);
    }
}
