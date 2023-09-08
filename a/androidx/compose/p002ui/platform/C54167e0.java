package androidx.compose.p002ui.platform;

import android.view.Choreographer;
import rx3.C13598b0;

/* renamed from: androidx.compose.ui.platform.e0 */
public final class C54167e0 implements Choreographer.FrameCallback, Runnable {

    /* renamed from: d */
    public final /* synthetic */ C54163d0 f152114d;

    public C54167e0(C54163d0 d0Var) {
        this.f152114d = d0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        r0 = r3.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r2 >= r0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r3.get(r2).doFrame(r6);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        r3.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doFrame(long r6) {
        /*
            r5 = this;
            androidx.compose.ui.platform.d0 r0 = r5.f152114d
            android.os.Handler r0 = r0.f152104f
            r0.removeCallbacks(r5)
            androidx.compose.ui.platform.d0 r0 = r5.f152114d
            androidx.compose.p002ui.platform.C54163d0.m60883i0(r0)
            androidx.compose.ui.platform.d0 r0 = r5.f152114d
            java.lang.Object r1 = r0.f152105g
            monitor-enter(r1)
            boolean r2 = r0.f152110o     // Catch:{ all -> 0x0039 }
            if (r2 != 0) goto L_0x0017
            monitor-exit(r1)
            goto L_0x0038
        L_0x0017:
            r2 = 0
            r0.f152110o = r2     // Catch:{ all -> 0x0039 }
            java.util.List<android.view.Choreographer$FrameCallback> r3 = r0.f152107i     // Catch:{ all -> 0x0039 }
            java.util.List<android.view.Choreographer$FrameCallback> r4 = r0.f152108j     // Catch:{ all -> 0x0039 }
            r0.f152107i = r4     // Catch:{ all -> 0x0039 }
            r0.f152108j = r3     // Catch:{ all -> 0x0039 }
            monitor-exit(r1)
            int r0 = r3.size()
        L_0x0027:
            if (r2 >= r0) goto L_0x0035
            java.lang.Object r1 = r3.get(r2)
            android.view.Choreographer$FrameCallback r1 = (android.view.Choreographer.FrameCallback) r1
            r1.doFrame(r6)
            int r2 = r2 + 1
            goto L_0x0027
        L_0x0035:
            r3.clear()
        L_0x0038:
            return
        L_0x0039:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.C54167e0.doFrame(long):void");
    }

    public void run() {
        C54163d0.m60883i0(this.f152114d);
        C54163d0 d0Var = this.f152114d;
        synchronized (d0Var.f152105g) {
            if (d0Var.f152107i.isEmpty()) {
                d0Var.f152103e.removeFrameCallback(this);
                d0Var.f152110o = false;
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
