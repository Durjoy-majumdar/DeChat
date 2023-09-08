package fo0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.skia_canvas.SkiaCanvasView;
import ho0.C87569c;
import java.util.HashMap;

/* renamed from: fo0.b */
public class C87014b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C87012a f252518d;

    public C87014b(C87012a aVar) {
        this.f252518d = aVar;
    }

    public void run() {
        C87012a aVar = this.f252518d;
        SkiaCanvasView skiaCanvasView = aVar.f252495i;
        if (skiaCanvasView != null) {
            skiaCanvasView.swapSurface(aVar.f252497n);
            if (this.f252518d.f252493g == null) {
                Log.m105920e("MicroMsg.AppBrand.SameLayer.AppBrandCanvasPluginHandler", "mComponent is null, onXWebCanvasSurfaceChange return");
                return;
            }
            Log.m105925i("MicroMsg.AppBrand.SameLayer.AppBrandCanvasPluginHandler", "JsApiOnXWebCanvasSurfaceChange. dispatch ViewId:%d", Integer.valueOf(this.f252518d.f252494h));
            C82520h hVar = this.f252518d.f252493g;
            int i = this.f252518d.f252494h;
            C87569c cVar = C87569c.f253657i;
            synchronized (C87569c.class) {
                HashMap hashMap = new HashMap(1);
                hashMap.put("viewId", Integer.valueOf(i));
                C87569c cVar2 = C87569c.f253657i;
                cVar2.mo115165o(hashMap);
                hVar.mo109669n(cVar2, (int[]) null);
            }
            return;
        }
        Log.m105920e("MicroMsg.AppBrand.SameLayer.AppBrandCanvasPluginHandler", "mSurfaceTexture is null, return");
    }
}
