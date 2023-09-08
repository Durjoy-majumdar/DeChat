package h52;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentLinkedQueue;
import zt3.C119157j;

/* renamed from: h52.j */
public class C87448j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f253400d;

    /* renamed from: e */
    public final /* synthetic */ C87449k f253401e;

    public C87448j(C87449k kVar, String str) {
        this.f253401e = kVar;
        this.f253400d = str;
    }

    public void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Runnable runnable;
        synchronized (this.f253401e.f253407f) {
            concurrentLinkedQueue = (ConcurrentLinkedQueue) ((Hashtable) this.f253401e.f253407f).get(this.f253400d);
            Log.m105919d("MicroMsg.MagicBrushNetworkDownload", "lm: url %s queue size %d", this.f253400d, Integer.valueOf(concurrentLinkedQueue.size()));
            runnable = (Runnable) concurrentLinkedQueue.peek();
        }
        if (runnable != null) {
            runnable.run();
            concurrentLinkedQueue.poll();
            if (concurrentLinkedQueue.size() > 0) {
                Log.m105924i("MicroMsg.MagicBrushNetworkDownload", "lm: need execute more");
                C87449k kVar = this.f253401e;
                String str = this.f253400d;
                kVar.getClass();
                ((C119157j) C119157j.f356862d).mo183876g(new C87448j(kVar, str), "magicbrush_download_thread");
            }
        }
    }
}
