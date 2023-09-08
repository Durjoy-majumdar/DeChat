package fo0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.skia_canvas.resource_loader.SkiaCanvasResourceLoader;
import zi0.C91755a;
import zi0.C91759b;

/* renamed from: fo0.i */
public class C87023i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91759b f252537d;

    /* renamed from: e */
    public final /* synthetic */ C91755a f252538e;

    /* renamed from: f */
    public final /* synthetic */ C81925i2 f252539f;

    public C87023i(C91759b bVar, C91755a aVar, C81925i2 i2Var) {
        this.f252537d = bVar;
        this.f252538e = aVar;
        this.f252539f = i2Var;
    }

    public void run() {
        Log.m105924i("Luggage.XWebCanvasLogic", "init resource loader");
        SkiaCanvasResourceLoader.setDelegate(new C87019g(this.f252537d, this.f252538e, this.f252539f));
    }
}
