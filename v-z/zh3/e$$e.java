package zh3;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Set;

public class e$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C119118e f356758d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f356759e;

    public e$$e(C119118e eVar, Runnable runnable) {
        this.f356758d = eVar;
        this.f356759e = runnable;
    }

    public void run() {
        synchronized (C119118e.class) {
            Set<String> set = C119118e.f356726f;
            if (!set.contains(this.f356758d.mo183817j())) {
                set.add(this.f356758d.mo183817j());
                Log.m105924i("MicroMsg.MMDataBase", "executeTaskSilently");
                this.f356759e.run();
            }
        }
    }
}
