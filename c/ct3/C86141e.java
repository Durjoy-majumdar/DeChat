package ct3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ct3.e */
public class C86141e implements ServiceConnection {

    /* renamed from: d */
    public final /* synthetic */ AtomicReference f250669d;

    /* renamed from: e */
    public final /* synthetic */ AtomicReference f250670e;

    /* renamed from: f */
    public final /* synthetic */ Object f250671f;

    public C86141e(C86142f fVar, AtomicReference atomicReference, AtomicReference atomicReference2, Object obj) {
        this.f250669d = atomicReference;
        this.f250670e = atomicReference2;
        this.f250671f = obj;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onServiceConnected(android.content.ComponentName r1, android.os.IBinder r2) {
        /*
            r0 = this;
            java.util.concurrent.atomic.AtomicReference r1 = r0.f250669d
            r1.set(r2)
            java.util.concurrent.atomic.AtomicReference r1 = r0.f250670e
            r1.set(r0)
            java.lang.Object r1 = r0.f250671f
            monitor-enter(r1)
            java.lang.Object r2 = r0.f250671f     // Catch:{ all -> 0x0012 }
            r2.notifyAll()     // Catch:{ all -> 0x0012 }
        L_0x0012:
            monitor-exit(r1)     // Catch:{ all -> 0x0014 }
            return
        L_0x0014:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0014 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ct3.C86141e.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
