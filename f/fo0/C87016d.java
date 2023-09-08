package fo0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.skia_canvas.SkiaCanvasView;
import p830xc.C91165a;

/* renamed from: fo0.d */
public class C87016d implements C91165a.C53318a {

    /* renamed from: a */
    public final /* synthetic */ C87012a f252525a;

    public C87016d(C87012a aVar) {
        this.f252525a = aVar;
    }

    /* renamed from: a */
    public void mo18009a(int i) {
        SkiaCanvasView skiaCanvasView = this.f252525a.f252495i;
        if (skiaCanvasView != null) {
            skiaCanvasView.notifyVisibilityChanged(false);
        }
    }

    /* renamed from: c */
    public void mo18010c() {
        SkiaCanvasView skiaCanvasView = this.f252525a.f252495i;
        if (skiaCanvasView != null) {
            skiaCanvasView.notifyVisibilityChanged(true);
        }
    }

    public void onDestroy() {
        C87012a aVar = this.f252525a;
        aVar.getClass();
        Log.m105924i("MicroMsg.AppBrand.SameLayer.AppBrandCanvasPluginHandler", "release");
        SkiaCanvasView skiaCanvasView = aVar.f252495i;
        if (skiaCanvasView != null) {
            skiaCanvasView.recycle();
        }
        C87018f.m108051c(aVar.f252494h);
    }
}
