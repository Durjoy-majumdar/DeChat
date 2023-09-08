package go0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.skia_canvas.SkiaCanvasView;
import fo0.C87018f;
import jk0.C87979e;
import org.json.JSONObject;

/* renamed from: go0.b */
public class C87276b extends C87979e {
    private static final int CTRL_INDEX = 673;
    public static final String NAME = "removeXWebCanvas";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.optInt("viewId");
    }

    /* renamed from: D */
    public boolean mo110323D(C82520h hVar, int i, View view, JSONObject jSONObject) {
        View view2 = (View) ((CoverViewContainer) view).mo114736d(View.class);
        if (view2 == null || !(view2 instanceof C87278d)) {
            Log.m105929w("Luggage.JsApiRemoveXWebCanvasTextureView", "the skia canvas view(%s) is null", Integer.valueOf(i));
            return false;
        }
        C87278d dVar = (C87278d) view2;
        SkiaCanvasView skiaCanvasView = dVar.f253011f;
        if (skiaCanvasView != null) {
            skiaCanvasView.recycle();
            C87018f.m108051c(dVar.f253010e);
        }
        return true;
    }
}
