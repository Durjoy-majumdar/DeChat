package p1013nf;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.util.Printer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import p221qf.C89642e;
import p723vf.C118672d;
import p723vf.C90778c;
import p723vf.C90790m;

/* renamed from: nf.a */
public class C88933a implements MessageQueue.IdleHandler {

    /* renamed from: p */
    public static final Map<Looper, C88933a> f256475p;

    /* renamed from: q */
    public static final C88933a f256476q;

    /* renamed from: r */
    public static boolean f256477r = false;

    /* renamed from: d */
    public final Queue<C88937d> f256478d = new ConcurrentLinkedQueue();

    /* renamed from: e */
    public final Queue<C88937d> f256479e = new ConcurrentLinkedQueue();

    /* renamed from: f */
    public String f256480f = "";

    /* renamed from: g */
    public long f256481g = 0;
    @Deprecated

    /* renamed from: h */
    public final HashSet<C88935b> f256482h = new HashSet<>();

    /* renamed from: i */
    public final Map<C89642e, C88934a> f256483i = new HashMap();

    /* renamed from: j */
    public C88936c f256484j;

    /* renamed from: n */
    public Looper f256485n;

    /* renamed from: o */
    public long f256486o = 0;

    /* renamed from: nf.a$a */
    public static final class C88934a {

        /* renamed from: a */
        public boolean f256487a = false;

        /* renamed from: b */
        public long f256488b;

        /* renamed from: c */
        public final C89642e f256489c;

        public C88934a(C89642e eVar) {
            this.f256489c = eVar;
        }
    }

    /* renamed from: nf.a$c */
    public class C88936c implements Printer {

        /* renamed from: a */
        public Printer f256491a;

        /* renamed from: b */
        public boolean f256492b = false;

        /* renamed from: c */
        public boolean f256493c = false;

        public C88936c(Printer printer) {
            this.f256491a = printer;
        }

        public void println(String str) {
            Printer printer = this.f256491a;
            if (printer != null) {
                printer.println(str);
                if (this.f256491a == this) {
                    throw new RuntimeException("Matrix.LooperMonitor origin == this");
                }
            }
            if (!this.f256492b) {
                boolean z = str.charAt(0) == '>' || str.charAt(0) == '<';
                this.f256493c = z;
                this.f256492b = true;
                if (!z) {
                    C118672d.m167352b("Matrix.LooperMonitor", "[println] Printer is inValid! x:%s", str);
                }
            }
            if (this.f256493c) {
                C88933a aVar = C88933a.this;
                if (str.charAt(0) == '>') {
                    synchronized (aVar.f256482h) {
                        Iterator<C88935b> it = aVar.f256482h.iterator();
                        while (it.hasNext()) {
                            C88935b next = it.next();
                            if (next.mo123317c() && !next.f256490a) {
                                next.f256490a = true;
                                next.mo123316b();
                            }
                        }
                    }
                    synchronized (aVar.f256483i) {
                        for (C88934a aVar2 : ((HashMap) aVar.f256483i).values()) {
                            if (aVar2.f256489c.isValid() && !aVar2.f256487a) {
                                aVar2.f256487a = true;
                                aVar2.f256488b = System.nanoTime();
                                aVar2.f256489c.mo112114b(str);
                            }
                        }
                    }
                    return;
                }
                synchronized (aVar.f256482h) {
                    Iterator<C88935b> it4 = aVar.f256482h.iterator();
                    while (it4.hasNext()) {
                        C88935b next2 = it4.next();
                        if (next2.mo123317c() && next2.f256490a) {
                            next2.f256490a = false;
                            next2.mo123315a();
                        }
                    }
                }
                synchronized (aVar.f256483i) {
                    for (C88934a aVar3 : ((HashMap) aVar.f256483i).values()) {
                        if (aVar3.f256489c.isValid() && aVar3.f256487a) {
                            aVar3.f256487a = false;
                            aVar3.f256489c.mo112115e(str, aVar3.f256488b, System.nanoTime());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: nf.a$d */
    public static class C88937d {

        /* renamed from: a */
        public String f256495a;

        /* renamed from: b */
        public long f256496b;

        public C88937d(String str, long j) {
            this.f256495a = str;
            this.f256496b = j;
        }

        public String toString() {
            return "{" + this.f256495a + " -> " + this.f256496b + '}';
        }
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f256475p = concurrentHashMap;
        Looper mainLooper = Looper.getMainLooper();
        C88933a aVar = (C88933a) concurrentHashMap.get(mainLooper);
        if (aVar == null) {
            aVar = new C88933a(mainLooper);
            concurrentHashMap.put(mainLooper, aVar);
        }
        f256476q = aVar;
        new Handler(C90778c.m113845c("historyMsgHandlerThread", 5).getLooper());
    }

    public C88933a(Looper looper) {
        Objects.requireNonNull(looper);
        this.f256485n = looper;
        mo123313c();
        synchronized (this) {
            if (Build.VERSION.SDK_INT >= 23) {
                looper.getQueue().addIdleHandler(this);
            } else {
                try {
                    ((MessageQueue) C90790m.m113857a(looper.getClass(), "mQueue", looper)).addIdleHandler(this);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: d */
    public static void m111028d(C89642e eVar) {
        C88933a aVar = f256476q;
        synchronized (aVar.f256483i) {
            ((HashMap) aVar.f256483i).remove(eVar);
        }
    }

    /* renamed from: a */
    public void mo123311a() {
        this.f256479e.clear();
        this.f256481g = 0;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public synchronized void mo123312b() {
        /*
            r5 = this;
            monitor-enter(r5)
            nf.a$c r0 = r5.f256484j     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0070
            java.util.HashSet<nf.a$b> r0 = r5.f256482h     // Catch:{ all -> 0x0072 }
            monitor-enter(r0)     // Catch:{ all -> 0x0072 }
            java.util.HashSet<nf.a$b> r1 = r5.f256482h     // Catch:{ all -> 0x006d }
            r1.clear()     // Catch:{ all -> 0x006d }
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            java.util.Map<qf.e, nf.a$a> r0 = r5.f256483i     // Catch:{ all -> 0x0072 }
            monitor-enter(r0)     // Catch:{ all -> 0x0072 }
            java.util.Map<qf.e, nf.a$a> r1 = r5.f256483i     // Catch:{ all -> 0x006a }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x006a }
            r1.clear()     // Catch:{ all -> 0x006a }
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "Matrix.LooperMonitor"
            java.lang.String r1 = "[onRelease] %s, origin printer:%s"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0072 }
            r3 = 0
            android.os.Looper r4 = r5.f256485n     // Catch:{ all -> 0x0072 }
            java.lang.Thread r4 = r4.getThread()     // Catch:{ all -> 0x0072 }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x0072 }
            r2[r3] = r4     // Catch:{ all -> 0x0072 }
            r3 = 1
            nf.a$c r4 = r5.f256484j     // Catch:{ all -> 0x0072 }
            android.util.Printer r4 = r4.f256491a     // Catch:{ all -> 0x0072 }
            r2[r3] = r4     // Catch:{ all -> 0x0072 }
            p723vf.C118672d.m167355e(r0, r1, r2)     // Catch:{ all -> 0x0072 }
            android.os.Looper r0 = r5.f256485n     // Catch:{ all -> 0x0072 }
            monitor-enter(r5)     // Catch:{ all -> 0x0072 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0067 }
            r2 = 23
            if (r1 < r2) goto L_0x0048
            android.os.MessageQueue r0 = r0.getQueue()     // Catch:{ all -> 0x0067 }
            r0.removeIdleHandler(r5)     // Catch:{ all -> 0x0067 }
            goto L_0x0057
        L_0x0048:
            java.lang.Class r1 = r0.getClass()     // Catch:{ Exception -> 0x0057 }
            java.lang.String r2 = "mQueue"
            java.lang.Object r0 = p723vf.C90790m.m113857a(r1, r2, r0)     // Catch:{ Exception -> 0x0057 }
            android.os.MessageQueue r0 = (android.os.MessageQueue) r0     // Catch:{ Exception -> 0x0057 }
            r0.removeIdleHandler(r5)     // Catch:{ Exception -> 0x0057 }
        L_0x0057:
            monitor-exit(r5)     // Catch:{ all -> 0x0072 }
            android.os.Looper r0 = r5.f256485n     // Catch:{ all -> 0x0072 }
            nf.a$c r1 = r5.f256484j     // Catch:{ all -> 0x0072 }
            android.util.Printer r1 = r1.f256491a     // Catch:{ all -> 0x0072 }
            r0.setMessageLogging(r1)     // Catch:{ all -> 0x0072 }
            r0 = 0
            r5.f256485n = r0     // Catch:{ all -> 0x0072 }
            r5.f256484j = r0     // Catch:{ all -> 0x0072 }
            goto L_0x0070
        L_0x0067:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0072 }
            throw r0     // Catch:{ all -> 0x0072 }
        L_0x006a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            throw r1     // Catch:{ all -> 0x0072 }
        L_0x006d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            throw r1     // Catch:{ all -> 0x0072 }
        L_0x0070:
            monitor-exit(r5)
            return
        L_0x0072:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1013nf.C88933a.mo123312b():void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0076 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a7  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo123313c() {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 0
            r1 = 1
            r2 = 0
            boolean r3 = f256477r     // Catch:{ Exception -> 0x0076 }
            if (r3 != 0) goto L_0x0078
            android.os.Looper r3 = r8.f256485n     // Catch:{ Exception -> 0x0076 }
            java.lang.Class r3 = r3.getClass()     // Catch:{ Exception -> 0x0076 }
            java.lang.String r4 = "mLogging"
            android.os.Looper r5 = r8.f256485n     // Catch:{ Exception -> 0x0076 }
            java.lang.Object r3 = p723vf.C90790m.m113857a(r3, r4, r5)     // Catch:{ Exception -> 0x0076 }
            android.util.Printer r3 = (android.util.Printer) r3     // Catch:{ Exception -> 0x0076 }
            nf.a$c r2 = r8.f256484j     // Catch:{ Exception -> 0x0072 }
            if (r3 != r2) goto L_0x0020
            if (r2 == 0) goto L_0x0020
            monitor-exit(r8)
            return
        L_0x0020:
            if (r3 == 0) goto L_0x0070
            if (r2 == 0) goto L_0x0070
            java.lang.Class r2 = r3.getClass()     // Catch:{ Exception -> 0x0072 }
            java.lang.String r2 = r2.getName()     // Catch:{ Exception -> 0x0072 }
            nf.a$c r4 = r8.f256484j     // Catch:{ Exception -> 0x0072 }
            java.lang.Class r4 = r4.getClass()     // Catch:{ Exception -> 0x0072 }
            java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x0072 }
            boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x0072 }
            if (r2 == 0) goto L_0x0070
            java.lang.String r2 = "Matrix.LooperMonitor"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0072 }
            r4.<init>()     // Catch:{ Exception -> 0x0072 }
            java.lang.String r5 = "LooperPrinter might be loaded by different classloader, my = "
            r4.append(r5)     // Catch:{ Exception -> 0x0072 }
            nf.a$c r5 = r8.f256484j     // Catch:{ Exception -> 0x0072 }
            java.lang.Class r5 = r5.getClass()     // Catch:{ Exception -> 0x0072 }
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ Exception -> 0x0072 }
            r4.append(r5)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r5 = ", other = "
            r4.append(r5)     // Catch:{ Exception -> 0x0072 }
            java.lang.Class r5 = r3.getClass()     // Catch:{ Exception -> 0x0072 }
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ Exception -> 0x0072 }
            r4.append(r5)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0072 }
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0072 }
            p723vf.C118672d.m167356f(r2, r4, r5)     // Catch:{ Exception -> 0x0072 }
            monitor-exit(r8)
            return
        L_0x0070:
            r2 = r3
            goto L_0x0078
        L_0x0072:
            r2 = r3
            goto L_0x0076
        L_0x0074:
            r0 = move-exception
            goto L_0x00c1
        L_0x0076:
            f256477r = r1     // Catch:{ all -> 0x0074 }
        L_0x0078:
            nf.a$c r3 = r8.f256484j     // Catch:{ all -> 0x0074 }
            r4 = 2
            if (r3 == 0) goto L_0x0099
            java.lang.String r3 = "Matrix.LooperMonitor"
            java.lang.String r5 = "maybe thread:%s printer[%s] was replace other[%s]!"
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0074 }
            android.os.Looper r7 = r8.f256485n     // Catch:{ all -> 0x0074 }
            java.lang.Thread r7 = r7.getThread()     // Catch:{ all -> 0x0074 }
            java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x0074 }
            r6[r0] = r7     // Catch:{ all -> 0x0074 }
            nf.a$c r7 = r8.f256484j     // Catch:{ all -> 0x0074 }
            r6[r1] = r7     // Catch:{ all -> 0x0074 }
            r6[r4] = r2     // Catch:{ all -> 0x0074 }
            p723vf.C118672d.m167356f(r3, r5, r6)     // Catch:{ all -> 0x0074 }
        L_0x0099:
            android.os.Looper r3 = r8.f256485n     // Catch:{ all -> 0x0074 }
            nf.a$c r5 = new nf.a$c     // Catch:{ all -> 0x0074 }
            r5.<init>(r2)     // Catch:{ all -> 0x0074 }
            r8.f256484j = r5     // Catch:{ all -> 0x0074 }
            r3.setMessageLogging(r5)     // Catch:{ all -> 0x0074 }
            if (r2 == 0) goto L_0x00bf
            java.lang.String r3 = "Matrix.LooperMonitor"
            java.lang.String r5 = "reset printer, originPrinter[%s] in %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0074 }
            r4[r0] = r2     // Catch:{ all -> 0x0074 }
            android.os.Looper r0 = r8.f256485n     // Catch:{ all -> 0x0074 }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x0074 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0074 }
            r4[r1] = r0     // Catch:{ all -> 0x0074 }
            p723vf.C118672d.m167353c(r3, r5, r4)     // Catch:{ all -> 0x0074 }
        L_0x00bf:
            monitor-exit(r8)
            return
        L_0x00c1:
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1013nf.C88933a.mo123313c():void");
    }

    public boolean queueIdle() {
        if (SystemClock.uptimeMillis() - this.f256486o < 60000) {
            return true;
        }
        mo123313c();
        this.f256486o = SystemClock.uptimeMillis();
        return true;
    }

    @Deprecated
    /* renamed from: nf.a$b */
    public static abstract class C88935b {

        /* renamed from: a */
        public boolean f256490a = false;

        public C88935b(boolean z, boolean z2) {
        }

        /* renamed from: a */
        public void mo123315a() {
        }

        /* renamed from: b */
        public void mo123316b() {
        }

        /* renamed from: c */
        public boolean mo123317c() {
            return false;
        }

        public C88935b() {
        }
    }
}
