package fo0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.skia_canvas.SkiaCanvasApp;
import com.tencent.xweb.skia_canvas.SkiaCanvasView;
import ho0.C87568b;
import ho0.C87570d;
import ho0.C87571e;
import org.json.JSONObject;
import p830xc.C91165a;

/* renamed from: fo0.c */
public class C87015c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C82870p f252519d;

    /* renamed from: e */
    public final /* synthetic */ C91165a f252520e;

    /* renamed from: f */
    public final /* synthetic */ C82381f f252521f;

    /* renamed from: g */
    public final /* synthetic */ JSONObject f252522g;

    /* renamed from: h */
    public final /* synthetic */ int f252523h;

    /* renamed from: i */
    public final /* synthetic */ C87012a f252524i;

    public C87015c(C87012a aVar, C82870p pVar, C91165a aVar2, C82381f fVar, JSONObject jSONObject, int i) {
        this.f252524i = aVar;
        this.f252519d = pVar;
        this.f252520e = aVar2;
        this.f252521f = fVar;
        this.f252522g = jSONObject;
        this.f252523h = i;
    }

    public void run() {
        C82870p pVar = this.f252519d;
        if (pVar instanceof C87568b) {
            C87012a aVar = this.f252524i;
            C91165a aVar2 = this.f252520e;
            aVar.getClass();
            aVar2.mo62538a(new C87016d(aVar));
            C87012a aVar3 = this.f252524i;
            C82381f fVar = this.f252521f;
            JSONObject jSONObject = this.f252522g;
            C82870p pVar2 = this.f252519d;
            int i = this.f252523h;
            aVar3.getClass();
            boolean z = false;
            aVar3.f252494h = jSONObject.optInt("viewId", 0);
            SkiaCanvasApp a = C87027l.m108053a(fVar);
            a$$a a__a = new a$$a(aVar3, fVar, jSONObject, i, pVar2);
            if (a == null) {
                C87017e eVar = (C87017e) fVar.mo109668l(C87017e.class);
                if (eVar != null) {
                    z = eVar.mo121427kG(new a$$b(aVar3, fVar, a__a));
                }
                if (!z) {
                    Log.m105920e("MicroMsg.AppBrand.SameLayer.AppBrandCanvasPluginHandler", "app is null, fail return");
                    fVar.mo109647a(i, pVar2.mo115109j("fail skia canvas unavailable"));
                    return;
                }
                return;
            }
            a__a.run();
        } else if (pVar instanceof C87571e) {
            C87012a aVar4 = this.f252524i;
            C82381f fVar2 = this.f252521f;
            int i2 = this.f252523h;
            if (aVar4.f252495i == null) {
                Log.m105920e("MicroMsg.AppBrand.SameLayer.AppBrandCanvasPluginHandler", "update fail");
                fVar2.mo109647a(i2, pVar.mo115109j("fail:internal error"));
                return;
            }
            fVar2.mo109647a(i2, pVar.mo115109j("ok"));
        } else if (pVar instanceof C87570d) {
            C87012a aVar5 = this.f252524i;
            C82381f fVar3 = this.f252521f;
            int i3 = this.f252523h;
            if (aVar5.f252495i == null) {
                Log.m105920e("MicroMsg.AppBrand.SameLayer.AppBrandCanvasPluginHandler", "remove fail");
                fVar3.mo109647a(i3, pVar.mo115109j("fail:internal error"));
                return;
            }
            Log.m105924i("MicroMsg.AppBrand.SameLayer.AppBrandCanvasPluginHandler", "release");
            SkiaCanvasView skiaCanvasView = aVar5.f252495i;
            if (skiaCanvasView != null) {
                skiaCanvasView.recycle();
            }
            C87018f.m108051c(aVar5.f252494h);
            fVar3.mo109647a(i3, pVar.mo115109j("ok"));
        }
    }
}
