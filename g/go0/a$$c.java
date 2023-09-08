package go0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.xweb.skia_canvas.SkiaCanvasView;

public class a$$c implements C82531i.C82535d {

    /* renamed from: d */
    public final /* synthetic */ C87278d f253005d;

    public a$$c(C87275a aVar, C87278d dVar) {
        this.f253005d = dVar;
    }

    /* renamed from: c */
    public void mo22090c() {
        SkiaCanvasView skiaCanvasView = this.f253005d.f253011f;
        if (skiaCanvasView != null) {
            skiaCanvasView.notifyVisibilityChanged(true);
        }
    }
}
