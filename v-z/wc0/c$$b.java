package wc0;

import com.tencent.p014mm.recoveryv2.C85678f;
import com.tencent.p014mm.recoveryv2.C85695l;
import com.tencent.p014mm.sdk.platformtools.Log;

public final /* synthetic */ class c$$b implements Runnable {
    public final void run() {
        Log.m105924i("MicroMsg.recovery.PluginRecovery", "unregister recovery on time out");
        C85678f fVar = C85695l.m105842a().f249698b;
        if (fVar != null) {
            C85678f.C85680b bVar = (C85678f.C85680b) fVar;
            synchronized (bVar) {
                C85678f.C85682d dVar = bVar.f249673l;
                if (dVar != null) {
                    dVar.mo119275k();
                }
            }
        }
    }
}
