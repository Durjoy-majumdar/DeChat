package c13;

import c13.C79917p;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import java.util.concurrent.ConcurrentHashMap;

public final /* synthetic */ class m$$a implements Runnable {
    public final void run() {
        try {
            C79914m.f234121h = NetStatusUtil.isWifiFromCache(MMApplicationContext.getContext());
            C79914m.f234119f = 0;
            C79914m.f234125l = 0;
            if (C79914m.f234117d && C79914m.f234115b.f260466a) {
                C79914m.m97076a(0);
            }
            if (C79914m.f234117d && C79914m.f234115b.f260467b) {
                C79914m.m97076a(1);
            }
            C79917p.C79918a aVar = C79917p.C79918a.INSTANCE;
            ((ConcurrentHashMap) aVar.f234139d).clear();
            ((ConcurrentHashMap) aVar.f234140e).clear();
            C79914m.f234114a.mo112139e();
            boolean z = C79914m.f234121h;
            if (!z) {
                if (C79914m.f234119f >= 1048576) {
                    C79914m.f234120g = 0;
                    C79914m.m97077b();
                }
            }
            int i = C79914m.f234120g + 1;
            C79914m.f234120g = i;
            if (i >= 5) {
                Log.m105925i("MatrixTrafficCollector", "stop report traffic..., isWifiEnv=%s", Boolean.valueOf(z));
                C79914m.f234117d = false;
            }
            C79914m.m97077b();
        } catch (Throwable th) {
            Log.m105920e("MatrixTrafficCollector", "MatrixTraffic Collector dump traffic failed, t = " + th.getMessage());
        }
    }
}
