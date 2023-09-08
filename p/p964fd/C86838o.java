package p964fd;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: fd.o */
public class C86838o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C86826e f252100d;

    public C86838o(C86826e eVar) {
        this.f252100d = eVar;
    }

    public void run() {
        boolean z;
        C86826e eVar = this.f252100d;
        eVar.f252015V = false;
        if (!eVar.f252011T) {
            AtomicBoolean atomicBoolean = eVar.f252017W;
            z = atomicBoolean != null && atomicBoolean.get();
            eVar.f252017W = null;
        } else {
            z = false;
        }
        String y = eVar.mo121291y();
        Log.m105924i(y, "onRuntimeEnterForeground, mWebViewInBackground: " + eVar.f252011T);
        if (!eVar.f252011T && eVar.mo121268C() && !eVar.f251994E) {
            Log.m105924i(eVar.mo121291y(), "onRuntimeEnterForeground, requestFocus");
            eVar.f252018W0.requestFocus();
        }
        if (!z) {
            return;
        }
        if (eVar.mo121285s()) {
            Log.m105924i("MicroMsg.SameLayer.VideoPluginHandler", "onRuntimeEnterForeground, cancel resume playing when relaunch");
            return;
        }
        Log.m105924i("MicroMsg.SameLayer.VideoPluginHandler", "onRuntimeEnterForeground, isPlayingWhenEnterBackground, try resume");
        eVar.mo121270E(false, true);
    }
}
