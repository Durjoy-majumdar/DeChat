package com.tencent.p014mm.sdk.platformtools;

/* renamed from: com.tencent.mm.sdk.platformtools.MMConditionVariable */
public class MMConditionVariable {
    private volatile boolean mCondition;

    public MMConditionVariable() {
        this.mCondition = false;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0001 */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0001 A[LOOP:0: B:1:0x0001->B:12:0x0001, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void block() {
        /*
            r1 = this;
            monitor-enter(r1)
        L_0x0001:
            boolean r0 = r1.mCondition     // Catch:{ all -> 0x000b }
            if (r0 != 0) goto L_0x0009
            r1.wait()     // Catch:{ InterruptedException -> 0x0001 }
            goto L_0x0001
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            return
        L_0x000b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.MMConditionVariable.block():void");
    }

    public void close() {
        synchronized (this) {
            this.mCondition = false;
        }
    }

    public boolean isOpen() {
        return this.mCondition;
    }

    public void open() {
        synchronized (this) {
            boolean z = this.mCondition;
            this.mCondition = true;
            if (!z) {
                notifyAll();
            }
        }
    }

    public String toString() {
        return "MMConditionVariable[" + hashCode() + "," + isOpen() + "]";
    }

    public MMConditionVariable(boolean z) {
        this.mCondition = z;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|11|12|13|5) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean block(long r4) {
        /*
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0025
            monitor-enter(r3)
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0022 }
            long r4 = r4 + r0
        L_0x000c:
            boolean r2 = r3.mCondition     // Catch:{ all -> 0x0022 }
            if (r2 != 0) goto L_0x001e
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x001e
            long r0 = r4 - r0
            r3.wait(r0)     // Catch:{ InterruptedException -> 0x0019 }
        L_0x0019:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0022 }
            goto L_0x000c
        L_0x001e:
            boolean r4 = r3.mCondition     // Catch:{ all -> 0x0022 }
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            return r4
        L_0x0022:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            throw r4
        L_0x0025:
            r3.block()
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.MMConditionVariable.block(long):boolean");
    }
}
