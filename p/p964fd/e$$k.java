package p964fd;

import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;

/* renamed from: fd.e$$k */
public class e$$k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Surface f252070d;

    /* renamed from: e */
    public final /* synthetic */ C86826e f252071e;

    public e$$k(C86826e eVar, Surface surface) {
        this.f252071e = eVar;
        this.f252070d = surface;
    }

    public void run() {
        C86826e eVar = this.f252071e;
        Surface surface = this.f252070d;
        Log.m105925i(eVar.mo121291y(), "*** handler(%s) handlePluginReady", eVar.mo122122p());
        eVar.f252051u = false;
        eVar.f252052v = false;
        eVar.f252053w = false;
        eVar.f252054x = false;
        eVar.f252031g = surface;
        if (eVar.f252033h != null) {
            Log.m105925i(eVar.mo121291y(), "handlePluginReady, setSurface:%s", surface);
            eVar.f252033h.setSurface(eVar.f252031g);
            eVar.mo121272G();
        }
        C86815a aVar = eVar.f252016V0;
        if (aVar != null) {
            aVar.mo121259b(surface);
        }
        synchronized (eVar.f252055x0) {
            if (!eVar.f252055x0.isEmpty()) {
                Log.m105925i(eVar.mo121291y(), "flushPendingTasks, size:%d", Integer.valueOf(eVar.f252055x0.size()));
                Iterator<Runnable> it = eVar.f252055x0.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
                eVar.f252055x0.clear();
            }
        }
    }
}
