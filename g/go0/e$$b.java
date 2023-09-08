package go0;

import android.view.Surface;
import com.tencent.xweb.skia_canvas.SkiaCanvasApp;
import com.tencent.xweb.skia_canvas.SkiaCanvasView;
import fo0.C87018f;
import go0.C87278d;

public final /* synthetic */ class e$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C87281e f253019d;

    public /* synthetic */ e$$b(C87281e eVar) {
        this.f253019d = eVar;
    }

    public final void run() {
        C87281e eVar = this.f253019d;
        C87278d dVar = eVar.f253017e;
        if (dVar.f253011f == null) {
            SkiaCanvasApp skiaCanvasApp = dVar.f253012g;
            Surface surface = new Surface(eVar.f253016d);
            C87278d dVar2 = eVar.f253017e;
            dVar.f253011f = new SkiaCanvasView(skiaCanvasApp, surface, dVar2.f253009d, (long) dVar2.f253010e);
            C87278d.C87280b bVar = eVar.f253017e.f253014i;
            if (bVar != null) {
                a$$e a__e = (a$$e) bVar;
                a__e.f253007a.mo122438a(a__e.f253008b.mo115109j("ok"));
            }
            C87278d dVar3 = eVar.f253017e;
            C87018f.m108050b(dVar3.f253010e, dVar3.f253011f);
        }
    }
}
