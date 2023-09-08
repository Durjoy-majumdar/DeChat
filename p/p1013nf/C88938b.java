package p1013nf;

import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tav.coremedia.TimeUtil;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import p1002lf.C88491b;
import p1013nf.C88933a;
import p221qf.C89644g;
import p723vf.C118672d;
import p723vf.C90790m;
import p761yd.C91440a;

@Deprecated
/* renamed from: nf.b */
public class C88938b implements Runnable {

    /* renamed from: y */
    public static final C88938b f256497y = new C88938b();

    /* renamed from: d */
    public volatile boolean f256498d = false;

    /* renamed from: e */
    public long[] f256499e = new long[4];

    /* renamed from: f */
    public final HashSet<C89644g> f256500f = new HashSet<>();

    /* renamed from: g */
    public volatile long f256501g = 0;

    /* renamed from: h */
    public boolean f256502h = false;

    /* renamed from: i */
    public C88491b f256503i;

    /* renamed from: j */
    public Object f256504j;

    /* renamed from: n */
    public Object[] f256505n;

    /* renamed from: o */
    public Method f256506o;

    /* renamed from: p */
    public Method f256507p;

    /* renamed from: q */
    public Method f256508q;

    /* renamed from: r */
    public Choreographer f256509r;

    /* renamed from: s */
    public Object f256510s;

    /* renamed from: t */
    public long f256511t = 16666666;

    /* renamed from: u */
    public int[] f256512u = new int[3];

    /* renamed from: v */
    public boolean[] f256513v = new boolean[3];

    /* renamed from: w */
    public long[] f256514w = new long[3];

    /* renamed from: x */
    public boolean f256515x = false;

    /* renamed from: nf.b$a */
    public class C88939a extends C88933a.C88935b {
        public C88939a(boolean z, boolean z2) {
            super(z, z2);
        }

        /* renamed from: a */
        public void mo123315a() {
            long j;
            HashSet<C89644g> hashSet;
            long j2;
            long j3;
            C88938b bVar = C88938b.this;
            long nanoTime = bVar.f256503i.f255604i ? System.nanoTime() : 0;
            char c = 2;
            char c2 = 3;
            if (bVar.f256503i.f255597b) {
                long j4 = bVar.f256501g;
                if (bVar.f256502h) {
                    bVar.mo123323d(2);
                    for (int i : bVar.f256512u) {
                        if (i != 2) {
                            bVar.f256514w[i] = -100;
                            if (bVar.f256503i.f255604i) {
                                throw new RuntimeException(String.format("UIThreadMonitor happens type[%s] != DO_QUEUE_END", new Object[]{Integer.valueOf(i)}));
                            }
                        }
                    }
                    bVar.f256512u = new int[3];
                    bVar.mo123320a(0, bVar, true);
                    try {
                        j3 = ((Long) C90790m.m113859c(bVar.f256510s, "mTimestampNanos", Long.valueOf(j4))).longValue();
                    } catch (Exception e) {
                        C118672d.m167352b("Matrix.UIThreadMonitor", e.toString(), new Object[0]);
                        j3 = j4;
                    }
                    j = j3;
                } else {
                    j = j4;
                }
                long nanoTime2 = System.nanoTime();
                HashSet<C89644g> hashSet2 = bVar.f256500f;
                synchronized (hashSet2) {
                    try {
                        Iterator<C89644g> it = bVar.f256500f.iterator();
                        while (it.hasNext()) {
                            C89644g next = it.next();
                            if (next.f257873a) {
                                String a = C91440a.INSTANCE.mo125374a();
                                boolean z = bVar.f256502h;
                                long[] jArr = bVar.f256514w;
                                j2 = j4;
                                hashSet = hashSet2;
                                next.mo123328c(a, j4, nanoTime2, z, j, jArr[0], jArr[1], jArr[2]);
                            } else {
                                j2 = j4;
                                hashSet = hashSet2;
                            }
                            j4 = j2;
                            hashSet2 = hashSet;
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            }
            C88491b bVar2 = bVar.f256503i;
            if (bVar2.f255598c || bVar2.f255604i) {
                bVar.f256499e[3] = SystemClock.currentThreadTimeMillis();
                bVar.f256499e[1] = System.nanoTime();
            }
            AppMethodBeat.m98136o(AppMethodBeat.METHOD_ID_DISPATCH);
            synchronized (bVar.f256500f) {
                Iterator<C89644g> it4 = bVar.f256500f.iterator();
                while (it4.hasNext()) {
                    C89644g next2 = it4.next();
                    if (next2.f257873a) {
                        long[] jArr2 = bVar.f256499e;
                        next2.mo115472b(jArr2[0], jArr2[c], jArr2[1], jArr2[c2], bVar.f256501g, bVar.f256502h);
                    }
                    c = 2;
                    c2 = 3;
                }
            }
            bVar.f256502h = false;
            if (bVar.f256503i.f255604i) {
                C118672d.m167351a("Matrix.UIThreadMonitor", "[dispatchEnd#run] inner cost:%sns", Long.valueOf(System.nanoTime() - nanoTime));
            }
        }

        /* renamed from: b */
        public void mo123316b() {
            C88938b bVar = C88938b.this;
            long[] jArr = bVar.f256499e;
            long nanoTime = System.nanoTime();
            jArr[0] = nanoTime;
            bVar.f256501g = nanoTime;
            bVar.f256499e[2] = SystemClock.currentThreadTimeMillis();
            C88491b bVar2 = bVar.f256503i;
            if (bVar2.f255598c || bVar2.f255599d) {
                AppMethodBeat.m98135i(AppMethodBeat.METHOD_ID_DISPATCH);
            }
            synchronized (bVar.f256500f) {
                Iterator<C89644g> it = bVar.f256500f.iterator();
                while (it.hasNext()) {
                    C89644g next = it.next();
                    if (!next.f257873a) {
                        long[] jArr2 = bVar.f256499e;
                        next.mo115471a(jArr2[0], jArr2[2], bVar.f256501g);
                    }
                }
            }
            if (bVar.f256503i.f255604i) {
                C118672d.m167351a("Matrix.UIThreadMonitor", "[dispatchBegin#run] inner cost:%sns", Long.valueOf(System.nanoTime() - bVar.f256501g));
            }
        }

        /* renamed from: c */
        public boolean mo123317c() {
            return C88938b.this.f256498d;
        }
    }

    /* renamed from: nf.b$b */
    public class C88940b extends C89644g {
        public C88940b(C88938b bVar) {
        }

        /* renamed from: c */
        public void mo123328c(String str, long j, long j2, boolean z, long j3, long j4, long j5, long j6) {
            C118672d.m167353c("Matrix.UIThreadMonitor", "focusedActivity[%s] frame cost:%sms isVsyncFrame=%s intendedFrameTimeNs=%s [%s|%s|%s]ns", str, Long.valueOf((j2 - j) / TimeUtil.SECOND_TO_US), Boolean.valueOf(z), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6));
        }
    }

    /* renamed from: nf.b$c */
    public class C88941c implements Runnable {
        public C88941c() {
        }

        public void run() {
            C88938b.this.mo123323d(0);
            C88938b.this.mo123322c(1);
        }
    }

    /* renamed from: nf.b$d */
    public class C88942d implements Runnable {
        public C88942d() {
        }

        public void run() {
            C88938b.this.mo123323d(1);
            C88938b.this.mo123322c(2);
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public final synchronized void mo123320a(int r11, java.lang.Runnable r12, boolean r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean[] r0 = r10.f256513v     // Catch:{ all -> 0x007c }
            boolean r0 = r0[r11]     // Catch:{ all -> 0x007c }
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0021
            java.lang.String r12 = "Matrix.UIThreadMonitor"
            java.lang.String r0 = "[addFrameCallback] this type %s callback has exist! isAddHeader:%s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x007c }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x007c }
            r1[r3] = r11     // Catch:{ all -> 0x007c }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x007c }
            r1[r2] = r11     // Catch:{ all -> 0x007c }
            p723vf.C118672d.m167356f(r12, r0, r1)     // Catch:{ all -> 0x007c }
            monitor-exit(r10)
            return
        L_0x0021:
            boolean r0 = r10.f256498d     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x0032
            if (r11 != 0) goto L_0x0032
            java.lang.String r11 = "Matrix.UIThreadMonitor"
            java.lang.String r12 = "[addFrameCallback] UIThreadMonitor is not alive!"
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ all -> 0x007c }
            p723vf.C118672d.m167356f(r11, r12, r13)     // Catch:{ all -> 0x007c }
            monitor-exit(r10)
            return
        L_0x0032:
            java.lang.Object r0 = r10.f256504j     // Catch:{ Exception -> 0x006e }
            monitor-enter(r0)     // Catch:{ Exception -> 0x006e }
            r4 = 0
            if (r11 == 0) goto L_0x0044
            if (r11 == r2) goto L_0x0041
            if (r11 == r1) goto L_0x003e
            r5 = r4
            goto L_0x0046
        L_0x003e:
            java.lang.reflect.Method r5 = r10.f256506o     // Catch:{ all -> 0x006b }
            goto L_0x0046
        L_0x0041:
            java.lang.reflect.Method r5 = r10.f256508q     // Catch:{ all -> 0x006b }
            goto L_0x0046
        L_0x0044:
            java.lang.reflect.Method r5 = r10.f256507p     // Catch:{ all -> 0x006b }
        L_0x0046:
            if (r5 == 0) goto L_0x0069
            java.lang.Object[] r6 = r10.f256505n     // Catch:{ all -> 0x006b }
            r6 = r6[r11]     // Catch:{ all -> 0x006b }
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x006b }
            if (r13 != 0) goto L_0x0056
            long r8 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x006b }
            goto L_0x0058
        L_0x0056:
            r8 = -1
        L_0x0058:
            java.lang.Long r13 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x006b }
            r7[r3] = r13     // Catch:{ all -> 0x006b }
            r7[r2] = r12     // Catch:{ all -> 0x006b }
            r7[r1] = r4     // Catch:{ all -> 0x006b }
            r5.invoke(r6, r7)     // Catch:{ all -> 0x006b }
            boolean[] r12 = r10.f256513v     // Catch:{ all -> 0x006b }
            r12[r11] = r2     // Catch:{ all -> 0x006b }
        L_0x0069:
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            goto L_0x007a
        L_0x006b:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            throw r11     // Catch:{ Exception -> 0x006e }
        L_0x006e:
            r11 = move-exception
            java.lang.String r12 = "Matrix.UIThreadMonitor"
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x007c }
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ all -> 0x007c }
            p723vf.C118672d.m167352b(r12, r11, r13)     // Catch:{ all -> 0x007c }
        L_0x007a:
            monitor-exit(r10)
            return
        L_0x007c:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p1013nf.C88938b.mo123320a(int, java.lang.Runnable, boolean):void");
    }

    /* renamed from: b */
    public void mo123321b(C89644g gVar) {
        if (!this.f256498d) {
            mo123325f();
        }
        synchronized (this.f256500f) {
            this.f256500f.add(gVar);
        }
    }

    /* renamed from: c */
    public final void mo123322c(int i) {
        this.f256512u[i] = 1;
        this.f256514w[i] = System.nanoTime();
    }

    /* renamed from: d */
    public final void mo123323d(int i) {
        this.f256512u[i] = 2;
        this.f256514w[i] = System.nanoTime() - this.f256514w[i];
        synchronized (this) {
            this.f256513v[i] = false;
        }
    }

    /* renamed from: e */
    public void mo123324e(C88491b bVar) {
        Class<Object> cls = Object.class;
        this.f256503i = bVar;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            C88939a aVar = new C88939a(bVar.f255608m, bVar.f255609n);
            C88933a aVar2 = C88933a.f256476q;
            synchronized (aVar2.f256482h) {
                aVar2.f256482h.add(aVar);
            }
            boolean z = true;
            this.f256515x = true;
            Choreographer instance = Choreographer.getInstance();
            this.f256509r = instance;
            this.f256511t = ((Long) C90790m.m113859c(instance, "mFrameIntervalNanos", 16666667L)).longValue();
            this.f256504j = C90790m.m113859c(this.f256509r, "mLock", new Object());
            Object[] objArr = (Object[]) C90790m.m113859c(this.f256509r, "mCallbackQueues", null);
            this.f256505n = objArr;
            if (objArr != null) {
                Object obj = objArr[0];
                Class cls2 = Long.TYPE;
                this.f256507p = C90790m.m113858b(obj, "addCallbackLocked", cls2, cls, cls);
                this.f256508q = C90790m.m113858b(this.f256505n[1], "addCallbackLocked", cls2, cls, cls);
                this.f256506o = C90790m.m113858b(this.f256505n[2], "addCallbackLocked", cls2, cls, cls);
            }
            this.f256510s = C90790m.m113859c(this.f256509r, "mDisplayEventReceiver", null);
            Object[] objArr2 = new Object[7];
            objArr2[0] = Boolean.valueOf(this.f256504j == null);
            objArr2[1] = Boolean.valueOf(this.f256505n == null);
            objArr2[2] = Boolean.valueOf(this.f256507p == null);
            objArr2[3] = Boolean.valueOf(this.f256506o == null);
            objArr2[4] = Boolean.valueOf(this.f256508q == null);
            if (this.f256510s != null) {
                z = false;
            }
            objArr2[5] = Boolean.valueOf(z);
            objArr2[6] = Long.valueOf(this.f256511t);
            C118672d.m167353c("Matrix.UIThreadMonitor", "[UIThreadMonitor] %s %s %s %s %s %s frameIntervalNanos:%s", objArr2);
            if (bVar.f255604i) {
                mo123321b(new C88940b(this));
                return;
            }
            return;
        }
        throw new AssertionError("must be init in main thread!");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: f */
    public synchronized void mo123325f() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f256515x     // Catch:{ all -> 0x0048 }
            r1 = 0
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "Matrix.UIThreadMonitor"
            java.lang.String r2 = "[onStart] is never init."
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0048 }
            p723vf.C118672d.m167352b(r0, r2, r1)     // Catch:{ all -> 0x0048 }
            monitor-exit(r6)
            return
        L_0x0011:
            boolean r0 = r6.f256498d     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0046
            r0 = 1
            r6.f256498d = r0     // Catch:{ all -> 0x0048 }
            monitor-enter(r6)     // Catch:{ all -> 0x0048 }
            java.lang.String r2 = "Matrix.UIThreadMonitor"
            java.lang.String r3 = "[onStart] callbackExist:%s %s"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0043 }
            boolean[] r5 = r6.f256513v     // Catch:{ all -> 0x0043 }
            java.lang.String r5 = java.util.Arrays.toString(r5)     // Catch:{ all -> 0x0043 }
            r4[r1] = r5     // Catch:{ all -> 0x0043 }
            java.lang.String r5 = p1035sf.C90183c.m112856d()     // Catch:{ all -> 0x0043 }
            r4[r0] = r5     // Catch:{ all -> 0x0043 }
            p723vf.C118672d.m167353c(r2, r3, r4)     // Catch:{ all -> 0x0043 }
            r2 = 3
            boolean[] r3 = new boolean[r2]     // Catch:{ all -> 0x0043 }
            r6.f256513v = r3     // Catch:{ all -> 0x0043 }
            monitor-exit(r6)     // Catch:{ all -> 0x0043 }
            int[] r3 = new int[r2]     // Catch:{ all -> 0x0048 }
            r6.f256512u = r3     // Catch:{ all -> 0x0048 }
            long[] r2 = new long[r2]     // Catch:{ all -> 0x0048 }
            r6.f256514w = r2     // Catch:{ all -> 0x0048 }
            r6.mo123320a(r1, r6, r0)     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0043:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0043 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r6)
            return
        L_0x0048:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1013nf.C88938b.mo123325f():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo123326g() {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f256515x     // Catch:{ all -> 0x0032 }
            r1 = 0
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "Matrix.UIThreadMonitor"
            java.lang.String r2 = "[onStart] is never init."
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0032 }
            p723vf.C118672d.m167352b(r0, r2, r1)     // Catch:{ all -> 0x0032 }
            monitor-exit(r5)
            return
        L_0x0011:
            boolean r0 = r5.f256498d     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0030
            r5.f256498d = r1     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = "Matrix.UIThreadMonitor"
            java.lang.String r2 = "[onStop] callbackExist:%s %s"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0032 }
            boolean[] r4 = r5.f256513v     // Catch:{ all -> 0x0032 }
            java.lang.String r4 = java.util.Arrays.toString(r4)     // Catch:{ all -> 0x0032 }
            r3[r1] = r4     // Catch:{ all -> 0x0032 }
            r1 = 1
            java.lang.String r4 = p1035sf.C90183c.m112856d()     // Catch:{ all -> 0x0032 }
            r3[r1] = r4     // Catch:{ all -> 0x0032 }
            p723vf.C118672d.m167353c(r0, r2, r3)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r5)
            return
        L_0x0032:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1013nf.C88938b.mo123326g():void");
    }

    public void run() {
        long nanoTime = System.nanoTime();
        try {
            this.f256502h = true;
            mo123322c(0);
            mo123320a(1, new C88941c(), true);
            mo123320a(2, new C88942d(), true);
        } finally {
            if (this.f256503i.f255604i) {
                C118672d.m167351a("Matrix.UIThreadMonitor", "[UIThreadMonitor#run] inner cost:%sns", Long.valueOf(System.nanoTime() - nanoTime));
            }
        }
    }
}
