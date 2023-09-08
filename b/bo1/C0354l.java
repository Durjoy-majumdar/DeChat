package bo1;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.ConcurrentHashMap;
import rx3.C36570n;

/* renamed from: bo1.l */
public final class C0354l implements Runnable {

    /* renamed from: d */
    public static final C0354l f945d = new C0354l();

    public final void run() {
        Log.m105924i("FinderSearchRelPreLoader", "clear task");
        synchronized (C0345h.f930c) {
            Log.m105924i("FinderSearchRelBatchLoadObjectCache", "clear cache");
            ((ConcurrentHashMap) ((C36570n) C0345h.f931d).getValue()).clear();
        }
    }
}
