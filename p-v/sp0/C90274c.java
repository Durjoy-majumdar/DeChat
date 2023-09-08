package sp0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: sp0.c */
public class C90274c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f259150d;

    /* renamed from: e */
    public final /* synthetic */ C90280d f259151e;

    public C90274c(C90280d dVar, String str) {
        this.f259151e = dVar;
        this.f259150d = str;
    }

    public void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Runnable runnable;
        synchronized (this.f259151e.f259172h) {
            concurrentLinkedQueue = (ConcurrentLinkedQueue) ((Hashtable) this.f259151e.f259172h).get(this.f259150d);
            Log.m105919d("MicroMsg.AppBrandNetworkDownload", "hy: url %s queue size %d", this.f259150d, Integer.valueOf(concurrentLinkedQueue.size()));
            runnable = (Runnable) concurrentLinkedQueue.peek();
        }
        if (runnable != null) {
            runnable.run();
            concurrentLinkedQueue.poll();
            if (concurrentLinkedQueue.size() > 0) {
                Log.m105924i("MicroMsg.AppBrandNetworkDownload", "hy: need execute more");
                C90280d dVar = this.f259151e;
                String str = this.f259150d;
                dVar.getClass();
                ThreadPool.post(new C90274c(dVar, str), "appbrand_download_thread");
            }
        }
    }
}
