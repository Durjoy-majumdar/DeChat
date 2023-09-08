package mb3;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RunnableFuture;
import zt3.C119143b;

/* renamed from: mb3.h */
public class C46987h extends C119143b {
    public C46987h(String str, int i, int i2, BlockingQueue<Runnable> blockingQueue) {
        super(str, i, i2, blockingQueue);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = (mb3.C46984e) r3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo72173b(java.lang.Runnable r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            boolean r4 = r3 instanceof mb3.C46984e
            java.lang.String r0 = "MicroMsg.Wepkg.WePkgThreadPoolExecutor"
            if (r4 == 0) goto L_0x002c
            mb3.e r3 = (mb3.C46984e) r3
            mb3.c r4 = r3.f126327d
            if (r4 == 0) goto L_0x002c
            mb3.f r4 = r4.f126312d
            if (r4 == 0) goto L_0x002c
            mb3.d r4 = mb3.C46983d.m52299a()
            mb3.c r3 = r3.f126327d
            mb3.f r3 = r3.f126312d
            java.lang.String r3 = r3.f126328a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, mb3.c> r1 = r4.f126326a
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto L_0x0027
            java.util.concurrent.ConcurrentHashMap<java.lang.String, mb3.c> r4 = r4.f126326a
            r4.remove(r3)
        L_0x0027:
            java.lang.String r3 = "remove download task"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
        L_0x002c:
            java.lang.String r3 = "afterExecute"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mb3.C46987h.mo72173b(java.lang.Runnable, java.lang.Throwable):void");
    }

    /* renamed from: c */
    public void mo72174c(Thread thread, Runnable runnable) {
        Log.m105924i("MicroMsg.Wepkg.WePkgThreadPoolExecutor", "beforeExecute");
    }

    /* renamed from: k */
    public void mo72175k() {
        ConcurrentHashMap<String, C46982c> concurrentHashMap = C46983d.m52299a().f126326a;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        super.mo72175k();
    }

    public <V> RunnableFuture<V> newTaskFor(Runnable runnable, V v) {
        return runnable instanceof C46982c ? new C46984e(runnable, v, (C46982c) runnable) : super.newTaskFor(runnable, v);
    }
}
