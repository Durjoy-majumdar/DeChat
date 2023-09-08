package h52;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentLinkedQueue;
import zt3.C119157j;

/* renamed from: h52.h */
public class C87445h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f253390d;

    /* renamed from: e */
    public final /* synthetic */ C87446i f253391e;

    public C87445h(C87446i iVar, String str) {
        this.f253391e = iVar;
        this.f253390d = str;
    }

    public void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        C87438c cVar;
        synchronized (this.f253391e.f253395d) {
            concurrentLinkedQueue = (ConcurrentLinkedQueue) ((Hashtable) this.f253391e.f253395d).get(this.f253390d);
            Log.m105919d("MicroMsg.MagicBrushNetworkCDNDownload", "lm: url %s queue size %d", this.f253390d, Integer.valueOf(concurrentLinkedQueue.size()));
            cVar = (C87438c) concurrentLinkedQueue.peek();
        }
        if (cVar != null) {
            cVar.execute(new Void[0]);
            concurrentLinkedQueue.poll();
            if (concurrentLinkedQueue.size() > 0) {
                Log.m105924i("MicroMsg.MagicBrushNetworkCDNDownload", "lm: need execute more");
                C87446i iVar = this.f253391e;
                String str = this.f253390d;
                iVar.getClass();
                ((C119157j) C119157j.f356862d).mo183876g(new C87445h(iVar, str), "magicbrush_cdndownload_thread");
            }
        }
    }
}
