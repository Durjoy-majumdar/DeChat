package com.eclipsesource.mmv8;

public class V8Locker {
    private boolean released = false;
    private C80135V8 runtime;
    private Thread thread = null;

    public V8Locker(C80135V8 v8) {
        this.runtime = v8;
        acquire();
    }

    public synchronized void acquire() {
        Thread thread2 = this.thread;
        if (thread2 != null) {
            if (thread2 != Thread.currentThread()) {
                throw new Error("Invalid V8 thread access: current thread is " + Thread.currentThread() + " while the locker has thread " + this.thread);
            }
        }
        if (this.thread != Thread.currentThread()) {
            C80135V8 v8 = this.runtime;
            v8.acquireLock(v8.getV8RuntimePtr());
            this.thread = Thread.currentThread();
            this.released = false;
        }
    }

    public void checkThread() {
        if (this.released && this.thread == null) {
            throw new Error("Invalid V8 thread access: the locker has been released!");
        } else if (this.thread != Thread.currentThread()) {
            throw new Error("Invalid V8 thread access: current thread is " + Thread.currentThread() + " while the locker has thread " + this.thread);
        }
    }

    public Thread getThread() {
        return this.thread;
    }

    public boolean hasLock() {
        return this.thread == Thread.currentThread();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void release() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.released     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0009
            java.lang.Thread r0 = r3.thread     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0011
        L_0x0009:
            com.eclipsesource.mmv8.V8 r0 = r3.runtime     // Catch:{ all -> 0x0027 }
            boolean r0 = r0.isReleased()     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0013
        L_0x0011:
            monitor-exit(r3)
            return
        L_0x0013:
            r3.checkThread()     // Catch:{ all -> 0x0027 }
            com.eclipsesource.mmv8.V8 r0 = r3.runtime     // Catch:{ all -> 0x0027 }
            long r1 = r0.getV8RuntimePtr()     // Catch:{ all -> 0x0027 }
            r0.releaseLock(r1)     // Catch:{ all -> 0x0027 }
            r0 = 0
            r3.thread = r0     // Catch:{ all -> 0x0027 }
            r0 = 1
            r3.released = r0     // Catch:{ all -> 0x0027 }
            monitor-exit(r3)
            return
        L_0x0027:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eclipsesource.mmv8.V8Locker.release():void");
    }

    public synchronized boolean tryAcquire() {
        Thread thread2 = this.thread;
        if (thread2 != null && thread2 != Thread.currentThread()) {
            return false;
        }
        if (this.thread == Thread.currentThread()) {
            return true;
        }
        C80135V8 v8 = this.runtime;
        v8.acquireLock(v8.getV8RuntimePtr());
        this.thread = Thread.currentThread();
        this.released = false;
        return true;
    }
}
