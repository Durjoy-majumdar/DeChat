package fo0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.skia_canvas.SkiaCanvasApp;

/* renamed from: fo0.k */
public class C87026k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f252545d;

    public C87026k(C81925i2 i2Var) {
        this.f252545d = i2Var;
    }

    public void run() {
        int hashCode = this.f252545d.hashCode();
        SkiaCanvasApp skiaCanvasApp = C87027l.f252547b.get(hashCode);
        C87027l.f252547b.remove(hashCode);
        Log.m105925i("Luggage.XWebCanvasLogic", "id:%s onJSContextDestroying %s", Integer.valueOf(hashCode), skiaCanvasApp);
        skiaCanvasApp.onJSContextDestroying();
    }
}
