package com.tencent.tav.decoder;

import com.tencent.tav.decoder.logger.Logger;

public abstract class ReActionThread extends Thread {
    private static final String TAG = "ReActionThread";
    private boolean hasAction = false;
    private boolean release = false;

    public ReActionThread(String str) {
        super(str);
    }

    public void action() {
        this.hasAction = true;
        synchronized (this) {
            notifyAll();
        }
        Logger.m144648v(TAG, "action: " + this + " " + hashCode());
    }

    public abstract void doAction();

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
    public synchronized void release() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.release     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x001b
            r0 = 1
            r2.release = r0     // Catch:{ all -> 0x001d }
            monitor-enter(r2)     // Catch:{ all -> 0x001d }
            r2.notifyAll()     // Catch:{ all -> 0x0018 }
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x001b }
            r0 = 20
            r2.wait(r0)     // Catch:{ all -> 0x0015 }
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            goto L_0x001b
        L_0x0015:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            throw r0     // Catch:{ InterruptedException -> 0x001b }
        L_0x0018:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            throw r0     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r2)
            return
        L_0x001d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.ReActionThread.release():void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0037 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r3 = this;
            java.lang.String r0 = "ReActionThread"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "run start: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " "
            r1.append(r2)
            int r2 = r3.hashCode()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.tav.decoder.logger.Logger.m144641d(r0, r1)
        L_0x0022:
            boolean r0 = r3.release
            if (r0 != 0) goto L_0x004e
        L_0x0026:
            boolean r0 = r3.hasAction
            if (r0 != 0) goto L_0x003b
            boolean r0 = r3.release
            if (r0 != 0) goto L_0x003b
            monitor-enter(r3)
            r0 = 10
            r3.wait(r0)     // Catch:{ InterruptedException -> 0x0037 }
            goto L_0x0037
        L_0x0035:
            r0 = move-exception
            goto L_0x0039
        L_0x0037:
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            goto L_0x0026
        L_0x0039:
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            throw r0
        L_0x003b:
            r0 = 0
            r3.hasAction = r0
            boolean r0 = r3.release
            if (r0 != 0) goto L_0x0045
            r3.doAction()
        L_0x0045:
            monitor-enter(r3)
            r3.notifyAll()     // Catch:{ all -> 0x004b }
            monitor-exit(r3)     // Catch:{ all -> 0x004b }
            goto L_0x0022
        L_0x004b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004b }
            throw r0
        L_0x004e:
            java.lang.String r0 = "ReActionThread"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "run finish: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " "
            r1.append(r2)
            int r2 = r3.hashCode()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.tav.decoder.logger.Logger.m144641d(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.ReActionThread.run():void");
    }
}
