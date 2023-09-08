package go0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.xweb.skia_canvas.SkiaCanvasView;
import fo0.C87018f;

public class a$$d implements C82531i.C82534c {

    /* renamed from: d */
    public final /* synthetic */ C87278d f253006d;

    public a$$d(C87275a aVar, C87278d dVar) {
        this.f253006d = dVar;
    }

    public void onDestroy() {
        C87278d dVar = this.f253006d;
        SkiaCanvasView skiaCanvasView = dVar.f253011f;
        if (skiaCanvasView != null) {
            skiaCanvasView.recycle();
            C87018f.m108051c(dVar.f253010e);
        }
    }
}
