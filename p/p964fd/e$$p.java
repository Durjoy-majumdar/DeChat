package p964fd;

import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: fd.e$$p */
public class e$$p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C86826e f252077d;

    public e$$p(C86826e eVar) {
        this.f252077d = eVar;
    }

    public void run() {
        C86826e eVar = this.f252077d;
        Log.m105925i(eVar.mo121291y(), "*** handler(%s) handlePluginDestroy", eVar.mo122122p());
        eVar.mo121281P();
        C86815a aVar = eVar.f252016V0;
        if (aVar != null) {
            aVar.mo121261d();
        }
        Surface surface = eVar.f252031g;
        if (surface != null) {
            surface.release();
            eVar.f252031g = null;
        }
    }
}
