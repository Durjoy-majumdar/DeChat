package p964fd;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: fd.k */
public class C86834k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C86826e f252094d;

    public C86834k(C86826e eVar) {
        this.f252094d = eVar;
    }

    public void run() {
        C86826e eVar = this.f252094d;
        boolean z = true;
        Log.m105925i(eVar.mo121291y(), "*** handler(%s) handleWebViewForeground", eVar.mo122122p());
        eVar.f252011T = false;
        if (!eVar.f252015V) {
            AtomicBoolean atomicBoolean = eVar.f252017W;
            if (atomicBoolean == null || !atomicBoolean.get()) {
                z = false;
            }
            eVar.f252017W = null;
        } else {
            z = false;
        }
        String y = eVar.mo121291y();
        Log.m105918d(y, "handleWebViewForeground, isRuntimeInBackground: " + eVar.f252015V);
        if (!eVar.f252015V && eVar.mo121268C() && !eVar.f251994E) {
            Log.m105924i(eVar.mo121291y(), "handleWebViewForeground, requestFocus");
            eVar.f252018W0.requestFocus();
        }
        if (!eVar.mo121285s()) {
            Log.m105924i(eVar.mo121291y(), "handleWebViewForeground, resume playing");
            if (eVar.f252033h != null && eVar.f251990A && z) {
                Log.m105924i(eVar.mo121291y(), "handleWebViewForeground runnable, video playing when enter background");
                eVar.mo121270E(false, false);
            }
        }
    }
}
