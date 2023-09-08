package com.tencent.p014mm.memory;

/* renamed from: com.tencent.mm.memory.a */
public abstract class C92702a<T> extends BucketPool<T, Integer> {
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: l */
    public synchronized T mo126904l(java.lang.Integer r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.NavigableMap<S, com.tencent.mm.memory.d<T, S>> r0 = r4.f266804a     // Catch:{ all -> 0x006f }
            r1 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x006f }
            java.util.concurrent.ConcurrentSkipListMap r0 = (java.util.concurrent.ConcurrentSkipListMap) r0     // Catch:{ all -> 0x006f }
            r2 = 1
            java.util.NavigableMap r5 = r0.subMap(r5, r2, r1, r2)     // Catch:{ all -> 0x006f }
            r0 = 0
            if (r5 == 0) goto L_0x006d
            boolean r1 = r5.isEmpty()     // Catch:{ all -> 0x006f }
            if (r1 != 0) goto L_0x006d
            java.util.Set r1 = r5.keySet()     // Catch:{ all -> 0x006f }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x006f }
        L_0x0022:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x006f }
            if (r2 == 0) goto L_0x005a
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x006f }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x006f }
            int r2 = r2.intValue()     // Catch:{ all -> 0x006f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x006f }
            java.lang.Object r2 = r5.get(r2)     // Catch:{ all -> 0x006f }
            com.tencent.mm.memory.d r2 = (com.tencent.p014mm.memory.C92705d) r2     // Catch:{ all -> 0x006f }
            java.util.Queue<T> r3 = r2.f266810a     // Catch:{ all -> 0x006f }
            java.util.concurrent.ConcurrentLinkedQueue r3 = (java.util.concurrent.ConcurrentLinkedQueue) r3     // Catch:{ all -> 0x006f }
            int r3 = r3.size()     // Catch:{ all -> 0x006f }
            if (r3 <= 0) goto L_0x0022
            java.util.Queue<T> r5 = r2.f266810a     // Catch:{ all -> 0x006f }
            java.util.concurrent.ConcurrentLinkedQueue r5 = (java.util.concurrent.ConcurrentLinkedQueue) r5     // Catch:{ all -> 0x006f }
            java.lang.Object r5 = r5.poll()     // Catch:{ all -> 0x006f }
            java.util.NavigableMap<S, com.tencent.mm.memory.d<T, S>> r1 = r4.f266804a     // Catch:{ all -> 0x006f }
            S r3 = r2.f266811b     // Catch:{ all -> 0x006f }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x006f }
            java.util.concurrent.ConcurrentSkipListMap r1 = (java.util.concurrent.ConcurrentSkipListMap) r1     // Catch:{ all -> 0x006f }
            r1.put(r3, r2)     // Catch:{ all -> 0x006f }
            goto L_0x005b
        L_0x005a:
            r5 = r0
        L_0x005b:
            if (r5 == 0) goto L_0x006d
            long r0 = r4.mo126894e(r5)     // Catch:{ all -> 0x006f }
            monitor-enter(r4)     // Catch:{ all -> 0x006f }
            long r2 = r4.f266806c     // Catch:{ all -> 0x006a }
            long r2 = r2 - r0
            r4.f266806c = r2     // Catch:{ all -> 0x006a }
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            monitor-exit(r4)
            return r5
        L_0x006a:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            throw r5     // Catch:{ all -> 0x006f }
        L_0x006d:
            monitor-exit(r4)
            return r0
        L_0x006f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.memory.C92702a.mo126904l(java.lang.Integer):java.lang.Object");
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
    /* renamed from: m */
    public synchronized T mo126905m(java.lang.Integer r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.NavigableMap<S, com.tencent.mm.memory.d<T, S>> r0 = r5.f266804a     // Catch:{ all -> 0x0060 }
            java.util.concurrent.ConcurrentSkipListMap r0 = (java.util.concurrent.ConcurrentSkipListMap) r0     // Catch:{ all -> 0x0060 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0060 }
            com.tencent.mm.memory.d r0 = (com.tencent.p014mm.memory.C92705d) r0     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x003a
            java.util.Queue<T> r1 = r0.f266810a     // Catch:{ all -> 0x0060 }
            java.util.concurrent.ConcurrentLinkedQueue r1 = (java.util.concurrent.ConcurrentLinkedQueue) r1     // Catch:{ all -> 0x0060 }
            int r1 = r1.size()     // Catch:{ all -> 0x0060 }
            if (r1 <= 0) goto L_0x003a
            java.util.Queue<T> r6 = r0.f266810a     // Catch:{ all -> 0x0060 }
            java.util.concurrent.ConcurrentLinkedQueue r6 = (java.util.concurrent.ConcurrentLinkedQueue) r6     // Catch:{ all -> 0x0060 }
            java.lang.Object r6 = r6.poll()     // Catch:{ all -> 0x0060 }
            java.util.NavigableMap<S, com.tencent.mm.memory.d<T, S>> r1 = r5.f266804a     // Catch:{ all -> 0x0060 }
            S r2 = r0.f266811b     // Catch:{ all -> 0x0060 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0060 }
            java.util.concurrent.ConcurrentSkipListMap r1 = (java.util.concurrent.ConcurrentSkipListMap) r1     // Catch:{ all -> 0x0060 }
            r1.put(r2, r0)     // Catch:{ all -> 0x0060 }
            long r0 = r5.mo126894e(r6)     // Catch:{ all -> 0x0060 }
            monitor-enter(r5)     // Catch:{ all -> 0x0060 }
            long r2 = r5.f266806c     // Catch:{ all -> 0x0037 }
            long r2 = r2 - r0
            r5.f266806c = r2     // Catch:{ all -> 0x0037 }
            monitor-exit(r5)     // Catch:{ all -> 0x0060 }
            monitor-exit(r5)
            return r6
        L_0x0037:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0060 }
            throw r6     // Catch:{ all -> 0x0060 }
        L_0x003a:
            java.lang.String r1 = "MicroMsg.BiggerThanPool"
            java.lang.String r2 = "BiggerThanPool getExactSize cannot get %s size count %d"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0060 }
            r4 = 0
            r3[r4] = r6     // Catch:{ all -> 0x0060 }
            r6 = 1
            r4 = -1
            if (r0 != 0) goto L_0x0049
            goto L_0x0054
        L_0x0049:
            java.util.Queue<T> r0 = r0.f266810a     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x004e
            goto L_0x0054
        L_0x004e:
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0     // Catch:{ all -> 0x0060 }
            int r4 = r0.size()     // Catch:{ all -> 0x0060 }
        L_0x0054:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0060 }
            r3[r6] = r0     // Catch:{ all -> 0x0060 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r2, r3)     // Catch:{ all -> 0x0060 }
            r6 = 0
            monitor-exit(r5)
            return r6
        L_0x0060:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.memory.C92702a.mo126905m(java.lang.Integer):java.lang.Object");
    }
}
