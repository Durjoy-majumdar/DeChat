package org.libpag;

import android.os.Handler;
import android.os.Looper;

class SynchronizeHandler extends Handler {

    public static final class BlockingRunnable implements Runnable {
        private boolean isTimeout = false;
        private boolean mDone;
        private final TimeoutRunnable mTask;

        public BlockingRunnable(TimeoutRunnable timeoutRunnable) {
            this.mTask = timeoutRunnable;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x002b */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x002b A[LOOP:1: B:18:0x002b->B:32:0x002b, LOOP_START, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean postAndWait(android.os.Handler r7, long r8) {
            /*
                r6 = this;
                boolean r7 = r7.post(r6)
                r0 = 0
                if (r7 != 0) goto L_0x0008
                return r0
            L_0x0008:
                monitor-enter(r6)
                r7 = 1
                r1 = 0
                int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r3 <= 0) goto L_0x002b
                long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0035 }
                long r3 = r3 + r8
            L_0x0015:
                boolean r8 = r6.mDone     // Catch:{ all -> 0x0035 }
                if (r8 != 0) goto L_0x0033
                long r8 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0035 }
                long r8 = r3 - r8
                int r5 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r5 > 0) goto L_0x0027
                r6.isTimeout = r7     // Catch:{ all -> 0x0035 }
                monitor-exit(r6)     // Catch:{ all -> 0x0035 }
                return r0
            L_0x0027:
                r6.wait(r8)     // Catch:{ InterruptedException -> 0x0015 }
                goto L_0x0015
            L_0x002b:
                boolean r8 = r6.mDone     // Catch:{ all -> 0x0035 }
                if (r8 != 0) goto L_0x0033
                r6.wait()     // Catch:{ InterruptedException -> 0x002b }
                goto L_0x002b
            L_0x0033:
                monitor-exit(r6)     // Catch:{ all -> 0x0035 }
                return r7
            L_0x0035:
                r7 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x0035 }
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: org.libpag.SynchronizeHandler.BlockingRunnable.postAndWait(android.os.Handler, long):boolean");
        }

        public void run() {
            try {
                this.mTask.run();
                synchronized (this) {
                    this.mDone = true;
                    notifyAll();
                    this.mTask.afterRun(this.isTimeout);
                }
            } catch (Throwable th) {
                synchronized (this) {
                    this.mDone = true;
                    notifyAll();
                    this.mTask.afterRun(this.isTimeout);
                    throw th;
                }
            }
        }
    }

    public interface TimeoutRunnable extends Runnable {
        void afterRun(boolean z);
    }

    public SynchronizeHandler(Looper looper) {
        super(looper);
    }

    public final boolean runSync(TimeoutRunnable timeoutRunnable, long j) {
        if (timeoutRunnable == null) {
            throw new IllegalArgumentException("runnable must not be null");
        } else if (j < 0) {
            throw new IllegalArgumentException("timeout must be non-negative");
        } else if (Looper.myLooper() != getLooper()) {
            return new BlockingRunnable(timeoutRunnable).postAndWait(this, j);
        } else {
            timeoutRunnable.run();
            return true;
        }
    }
}
