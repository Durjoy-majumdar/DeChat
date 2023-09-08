package p964fd;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: fd.p */
public class C86839p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C86826e f252101d;

    public C86839p(C86826e eVar) {
        this.f252101d = eVar;
    }

    public void run() {
        C86826e eVar = this.f252101d;
        eVar.f252015V = true;
        if (eVar.f252017W == null) {
            boolean C = eVar.mo121268C();
            eVar.f252017W = new AtomicBoolean(C);
            Log.m105924i(eVar.mo121291y(), "onRuntimeEnterBackground, abandonFocus");
            eVar.f252018W0.mo115002L();
            Log.m105925i(eVar.mo121291y(), "onRuntimeEnterBackground, isPlayingWhenEnterBackground:%s", Boolean.valueOf(C));
            if (!eVar.f252034h1 || !eVar.mo121284r()) {
                eVar.mo121269D(false);
            } else {
                Log.m105924i(eVar.mo121291y(), "onRuntimeEnterBackground, background play audio is enabled");
            }
        }
    }
}
