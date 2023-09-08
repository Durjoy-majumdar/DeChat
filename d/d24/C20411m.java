package d24;

import d24.C20428x;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;

/* renamed from: d24.m */
public final class C20411m {

    /* renamed from: a */
    public int f57249a = 64;

    /* renamed from: b */
    public int f57250b = 5;

    /* renamed from: c */
    public ExecutorService f57251c;

    /* renamed from: d */
    public final Deque<C20428x.C20430b> f57252d = new ArrayDeque();

    /* renamed from: e */
    public final Deque<C20428x.C20430b> f57253e = new ArrayDeque();

    /* renamed from: f */
    public final Deque<C20428x> f57254f = new ArrayDeque();

    /* renamed from: a */
    public void mo31922a(C20428x.C20430b bVar) {
        Deque<C20428x.C20430b> deque = this.f57253e;
        synchronized (this) {
            if (!((ArrayDeque) deque).remove(bVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        mo31923b();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public final boolean mo31923b() {
        /*
            r15 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r15)
            java.util.Deque<d24.x$b> r1 = r15.f57252d     // Catch:{ all -> 0x00fa }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x00fa }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00fa }
        L_0x000e:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00fa }
            r3 = 0
            if (r2 == 0) goto L_0x006d
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00fa }
            d24.x$b r2 = (d24.C20428x.C20430b) r2     // Catch:{ all -> 0x00fa }
            java.util.Deque<d24.x$b> r4 = r15.f57253e     // Catch:{ all -> 0x00fa }
            java.util.ArrayDeque r4 = (java.util.ArrayDeque) r4     // Catch:{ all -> 0x00fa }
            int r4 = r4.size()     // Catch:{ all -> 0x00fa }
            int r5 = r15.f57249a     // Catch:{ all -> 0x00fa }
            if (r4 < r5) goto L_0x0028
            goto L_0x006d
        L_0x0028:
            java.util.Deque<d24.x$b> r4 = r15.f57253e     // Catch:{ all -> 0x00fa }
            java.util.ArrayDeque r4 = (java.util.ArrayDeque) r4     // Catch:{ all -> 0x00fa }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00fa }
        L_0x0030:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00fa }
            if (r5 == 0) goto L_0x005a
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00fa }
            d24.x$b r5 = (d24.C20428x.C20430b) r5     // Catch:{ all -> 0x00fa }
            d24.x r5 = d24.C20428x.this     // Catch:{ all -> 0x00fa }
            boolean r6 = r5.f57335i     // Catch:{ all -> 0x00fa }
            if (r6 == 0) goto L_0x0043
            goto L_0x0030
        L_0x0043:
            d24.y r5 = r5.f57334h     // Catch:{ all -> 0x00fa }
            d24.s r5 = r5.f57340a     // Catch:{ all -> 0x00fa }
            java.lang.String r5 = r5.f57268d     // Catch:{ all -> 0x00fa }
            d24.x r6 = d24.C20428x.this     // Catch:{ all -> 0x00fa }
            d24.y r6 = r6.f57334h     // Catch:{ all -> 0x00fa }
            d24.s r6 = r6.f57340a     // Catch:{ all -> 0x00fa }
            java.lang.String r6 = r6.f57268d     // Catch:{ all -> 0x00fa }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x00fa }
            if (r5 == 0) goto L_0x0030
            int r3 = r3 + 1
            goto L_0x0030
        L_0x005a:
            int r4 = r15.f57250b     // Catch:{ all -> 0x00fa }
            if (r3 < r4) goto L_0x005f
            goto L_0x000e
        L_0x005f:
            r1.remove()     // Catch:{ all -> 0x00fa }
            r0.add(r2)     // Catch:{ all -> 0x00fa }
            java.util.Deque<d24.x$b> r3 = r15.f57253e     // Catch:{ all -> 0x00fa }
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch:{ all -> 0x00fa }
            r3.add(r2)     // Catch:{ all -> 0x00fa }
            goto L_0x000e
        L_0x006d:
            monitor-enter(r15)     // Catch:{ all -> 0x00fa }
            java.util.Deque<d24.x$b> r1 = r15.f57253e     // Catch:{ all -> 0x00f7 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x00f7 }
            int r1 = r1.size()     // Catch:{ all -> 0x00f7 }
            java.util.Deque<d24.x> r2 = r15.f57254f     // Catch:{ all -> 0x00f7 }
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2     // Catch:{ all -> 0x00f7 }
            int r2 = r2.size()     // Catch:{ all -> 0x00f7 }
            int r1 = r1 + r2
            monitor-exit(r15)     // Catch:{ all -> 0x00fa }
            if (r1 <= 0) goto L_0x0084
            r1 = 1
            goto L_0x0085
        L_0x0084:
            r1 = 0
        L_0x0085:
            monitor-exit(r15)     // Catch:{ all -> 0x00fa }
            int r2 = r0.size()
            r4 = 0
        L_0x008b:
            if (r4 >= r2) goto L_0x00f6
            java.lang.Object r5 = r0.get(r4)
            d24.x$b r5 = (d24.C20428x.C20430b) r5
            monitor-enter(r15)
            java.util.concurrent.ExecutorService r6 = r15.f57251c     // Catch:{ all -> 0x00f3 }
            if (r6 != 0) goto L_0x00b6
            java.util.concurrent.ThreadPoolExecutor r6 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x00f3 }
            r8 = 0
            r9 = 2147483647(0x7fffffff, float:NaN)
            r10 = 60
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00f3 }
            java.util.concurrent.SynchronousQueue r13 = new java.util.concurrent.SynchronousQueue     // Catch:{ all -> 0x00f3 }
            r13.<init>()     // Catch:{ all -> 0x00f3 }
            java.lang.String r7 = "OkHttp Dispatcher"
            byte[] r14 = e24.C20509c.f57729a     // Catch:{ all -> 0x00f3 }
            e24.d r14 = new e24.d     // Catch:{ all -> 0x00f3 }
            r14.<init>(r7, r3)     // Catch:{ all -> 0x00f3 }
            r7 = r6
            r7.<init>(r8, r9, r10, r12, r13, r14)     // Catch:{ all -> 0x00f3 }
            r15.f57251c = r6     // Catch:{ all -> 0x00f3 }
        L_0x00b6:
            java.util.concurrent.ExecutorService r6 = r15.f57251c     // Catch:{ all -> 0x00f3 }
            monitor-exit(r15)
            r5.getClass()
            java.util.concurrent.ThreadPoolExecutor r6 = (java.util.concurrent.ThreadPoolExecutor) r6     // Catch:{ RejectedExecutionException -> 0x00c4 }
            r6.execute(r5)     // Catch:{ RejectedExecutionException -> 0x00c4 }
            goto L_0x00e6
        L_0x00c2:
            r0 = move-exception
            goto L_0x00e9
        L_0x00c4:
            r6 = move-exception
            java.io.InterruptedIOException r7 = new java.io.InterruptedIOException     // Catch:{ all -> 0x00c2 }
            java.lang.String r8 = "executor rejected"
            r7.<init>(r8)     // Catch:{ all -> 0x00c2 }
            r7.initCause(r6)     // Catch:{ all -> 0x00c2 }
            d24.x r6 = d24.C20428x.this     // Catch:{ all -> 0x00c2 }
            d24.o r6 = r6.f57333g     // Catch:{ all -> 0x00c2 }
            r6.getClass()     // Catch:{ all -> 0x00c2 }
            d24.f r6 = r5.f57338e     // Catch:{ all -> 0x00c2 }
            d24.x r8 = d24.C20428x.this     // Catch:{ all -> 0x00c2 }
            r6.mo31908a(r8, r7)     // Catch:{ all -> 0x00c2 }
            d24.x r6 = d24.C20428x.this
            d24.v r6 = r6.f57330d
            d24.m r6 = r6.f57288d
            r6.mo31922a(r5)
        L_0x00e6:
            int r4 = r4 + 1
            goto L_0x008b
        L_0x00e9:
            d24.x r1 = d24.C20428x.this
            d24.v r1 = r1.f57330d
            d24.m r1 = r1.f57288d
            r1.mo31922a(r5)
            throw r0
        L_0x00f3:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L_0x00f6:
            return r1
        L_0x00f7:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00fa }
            throw r0     // Catch:{ all -> 0x00fa }
        L_0x00fa:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00fa }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d24.C20411m.mo31923b():boolean");
    }
}
