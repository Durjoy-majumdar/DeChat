package com.tencent.p014mm.memory;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MMTrimMemoryEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import java.lang.Comparable;
import java.lang.ref.WeakReference;
import java.util.NavigableMap;
import java.util.Vector;
import java.util.concurrent.ConcurrentSkipListMap;
import oa1.C117731d;

/* renamed from: com.tencent.mm.memory.BucketPool */
public abstract class BucketPool<T, S extends Comparable> {

    /* renamed from: a */
    public NavigableMap<S, C92705d<T, S>> f266804a = new ConcurrentSkipListMap();

    /* renamed from: b */
    public Vector<BucketPool<T, S>.a> f266805b = new Vector<>();

    /* renamed from: c */
    public long f266806c = 0;

    /* renamed from: com.tencent.mm.memory.BucketPool$MMTrimMemoryEventListener */
    public static class MMTrimMemoryEventListener extends IListener<MMTrimMemoryEvent> {

        /* renamed from: d */
        public final WeakReference<BucketPool> f266807d;

        public MMTrimMemoryEventListener(BucketPool bucketPool) {
            super(C40008f.f107254d);
            this.f266807d = new WeakReference<>(bucketPool);
            this.__eventId = 708811463;
        }

        public boolean callback(IEvent iEvent) {
            MMTrimMemoryEvent mMTrimMemoryEvent = (MMTrimMemoryEvent) iEvent;
            BucketPool bucketPool = this.f266807d.get();
            if (bucketPool == null) {
                Log.m105925i("MicroMsg.BucketPool", "received MMTrimMemoryEvent: BucketPool[%s] was gone", getClass().getName());
                dead();
            } else if (C117731d.m166007c().mo182445g("clicfg_matrix_trim_memory_bucketpool_v2", true, false)) {
                Log.m105921e("MicroMsg.BucketPool", "received MMTrimMemoryEvent: BucketPool[%s]", getClass().getName());
                NavigableMap<S, C92705d<T, S>> navigableMap = bucketPool.f266804a;
                if (navigableMap != null) {
                    Log.m105921e("MicroMsg.BucketPool", "received MMTrimMemoryEvent: clear [pools][%s]", Integer.valueOf(((ConcurrentSkipListMap) navigableMap).size()));
                    ((ConcurrentSkipListMap) bucketPool.f266804a).clear();
                }
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.memory.BucketPool$a */
    public abstract class C92701a {
        public C92701a(BucketPool bucketPool) {
        }

        /* renamed from: a */
        public abstract int mo126901a();

        /* renamed from: b */
        public abstract long mo126902b();

        /* renamed from: c */
        public abstract S mo126903c();
    }

    public BucketPool() {
        new MMTrimMemoryEventListener(this).alive();
    }

    /* renamed from: a */
    public void mo126890a(BucketPool<T, S>.a aVar) {
        this.f266805b.add(aVar);
        Log.m105925i("MicroMsg.BucketPool", "%s addPreload: %s", this, aVar);
        if (this.f266805b.size() > 0) {
            ThreadPool.post(new C92706e(this), "BucketPool_preload");
        }
    }

    /* renamed from: b */
    public abstract T mo126891b(S s);

    /* renamed from: c */
    public void mo126892c() {
        Log.m105925i("MicroMsg.BucketPool", "freeAll: %s", getClass().getName());
        ((ConcurrentSkipListMap) this.f266804a).clear();
        this.f266806c = 0;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public synchronized T mo126893d(S r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.NavigableMap<S, com.tencent.mm.memory.d<T, S>> r0 = r4.f266804a     // Catch:{ all -> 0x004a }
            java.util.concurrent.ConcurrentSkipListMap r0 = (java.util.concurrent.ConcurrentSkipListMap) r0     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x004a }
            com.tencent.mm.memory.d r0 = (com.tencent.p014mm.memory.C92705d) r0     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x003a
            java.util.Queue<T> r1 = r0.f266810a     // Catch:{ all -> 0x004a }
            java.util.concurrent.ConcurrentLinkedQueue r1 = (java.util.concurrent.ConcurrentLinkedQueue) r1     // Catch:{ all -> 0x004a }
            int r1 = r1.size()     // Catch:{ all -> 0x004a }
            if (r1 <= 0) goto L_0x003a
            java.util.Queue<T> r5 = r0.f266810a     // Catch:{ all -> 0x004a }
            java.util.concurrent.ConcurrentLinkedQueue r5 = (java.util.concurrent.ConcurrentLinkedQueue) r5     // Catch:{ all -> 0x004a }
            java.lang.Object r5 = r5.poll()     // Catch:{ all -> 0x004a }
            java.util.NavigableMap<S, com.tencent.mm.memory.d<T, S>> r1 = r4.f266804a     // Catch:{ all -> 0x004a }
            S r2 = r0.f266811b     // Catch:{ all -> 0x004a }
            java.lang.Comparable r2 = (java.lang.Comparable) r2     // Catch:{ all -> 0x004a }
            java.util.concurrent.ConcurrentSkipListMap r1 = (java.util.concurrent.ConcurrentSkipListMap) r1     // Catch:{ all -> 0x004a }
            r1.put(r2, r0)     // Catch:{ all -> 0x004a }
            long r0 = r4.mo126894e(r5)     // Catch:{ all -> 0x004a }
            monitor-enter(r4)     // Catch:{ all -> 0x004a }
            long r2 = r4.f266806c     // Catch:{ all -> 0x0037 }
            long r2 = r2 - r0
            r4.f266806c = r2     // Catch:{ all -> 0x0037 }
            monitor-exit(r4)     // Catch:{ all -> 0x004a }
            monitor-exit(r4)
            return r5
        L_0x0037:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004a }
            throw r5     // Catch:{ all -> 0x004a }
        L_0x003a:
            java.lang.String r0 = "MicroMsg.BucketPool"
            java.lang.String r1 = "BucketPool get cannot get %s size"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x004a }
            r3 = 0
            r2[r3] = r5     // Catch:{ all -> 0x004a }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r1, r2)     // Catch:{ all -> 0x004a }
            r5 = 0
            monitor-exit(r4)
            return r5
        L_0x004a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.memory.BucketPool.mo126893d(java.lang.Comparable):java.lang.Object");
    }

    /* renamed from: e */
    public abstract long mo126894e(T t);

    /* renamed from: f */
    public abstract S mo126895f(T t);

    /* renamed from: g */
    public abstract long mo126896g();

    /* renamed from: h */
    public abstract long mo126897h();

    /* renamed from: i */
    public abstract S mo126898i(S s);

    /* renamed from: j */
    public abstract C92705d<T, S> mo126899j(S s);

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
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
    /* renamed from: k */
    public synchronized void mo126900k(T r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            if (r11 != 0) goto L_0x0005
            monitor-exit(r10)
            return
        L_0x0005:
            java.lang.Comparable r0 = r10.mo126895f(r11)     // Catch:{ all -> 0x0079 }
            long r1 = r10.mo126894e(r11)     // Catch:{ all -> 0x0079 }
            long r3 = r10.mo126896g()     // Catch:{ all -> 0x0079 }
            r5 = 0
            r6 = 1
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0029
            java.lang.String r11 = "MicroMsg.BucketPool"
            java.lang.String r0 = "release, reach maximum element size: %s, ignore this"
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x0079 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0079 }
            r3[r5] = r1     // Catch:{ all -> 0x0079 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r0, r3)     // Catch:{ all -> 0x0079 }
            monitor-exit(r10)
            return
        L_0x0029:
            long r3 = r10.f266806c     // Catch:{ all -> 0x0079 }
            long r3 = r3 + r1
            long r7 = r10.mo126897h()     // Catch:{ all -> 0x0079 }
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x004f
            java.lang.String r11 = "MicroMsg.BucketPool"
            java.lang.String r0 = "release, reach maximum size, just ignore %s %s"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0079 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0079 }
            r3[r5] = r1     // Catch:{ all -> 0x0079 }
            long r1 = r10.f266806c     // Catch:{ all -> 0x0079 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0079 }
            r3[r6] = r1     // Catch:{ all -> 0x0079 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r0, r3)     // Catch:{ all -> 0x0079 }
            monitor-exit(r10)
            return
        L_0x004f:
            java.util.NavigableMap<S, com.tencent.mm.memory.d<T, S>> r3 = r10.f266804a     // Catch:{ all -> 0x0079 }
            java.util.concurrent.ConcurrentSkipListMap r3 = (java.util.concurrent.ConcurrentSkipListMap) r3     // Catch:{ all -> 0x0079 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x0079 }
            com.tencent.mm.memory.d r3 = (com.tencent.p014mm.memory.C92705d) r3     // Catch:{ all -> 0x0079 }
            if (r3 != 0) goto L_0x005f
            com.tencent.mm.memory.d r3 = r10.mo126899j(r0)     // Catch:{ all -> 0x0079 }
        L_0x005f:
            java.util.Queue<T> r4 = r3.f266810a     // Catch:{ all -> 0x0079 }
            java.util.concurrent.ConcurrentLinkedQueue r4 = (java.util.concurrent.ConcurrentLinkedQueue) r4     // Catch:{ all -> 0x0079 }
            r4.add(r11)     // Catch:{ all -> 0x0079 }
            java.util.NavigableMap<S, com.tencent.mm.memory.d<T, S>> r11 = r10.f266804a     // Catch:{ all -> 0x0079 }
            java.util.concurrent.ConcurrentSkipListMap r11 = (java.util.concurrent.ConcurrentSkipListMap) r11     // Catch:{ all -> 0x0079 }
            r11.put(r0, r3)     // Catch:{ all -> 0x0079 }
            monitor-enter(r10)     // Catch:{ all -> 0x0079 }
            long r3 = r10.f266806c     // Catch:{ all -> 0x0076 }
            long r3 = r3 + r1
            r10.f266806c = r3     // Catch:{ all -> 0x0076 }
            monitor-exit(r10)     // Catch:{ all -> 0x0079 }
            monitor-exit(r10)
            return
        L_0x0076:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0079 }
            throw r11     // Catch:{ all -> 0x0079 }
        L_0x0079:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.memory.BucketPool.mo126900k(java.lang.Object):void");
    }
}
