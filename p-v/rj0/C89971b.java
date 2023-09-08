package rj0;

import android.view.View;
import com.tencent.magicbrush.C80301a;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.plugin.appbrand.C81552b3;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi.C17988a;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kr0.C88267e;
import nj0.C88982v;
import nj0.C88984x;
import org.json.JSONException;
import org.json.JSONObject;
import p1059wd.C90954a;
import p958eb.C86474e;
import rx3.C13598b0;
import uj0.C90675f;
import vj0.C111532e;

/* renamed from: rj0.b */
public final class C89971b extends C17988a {
    @Deprecated
    public static final int CTRL_INDEX = 6;
    @Deprecated
    public static final String NAME = "insertVideoPlayer";

    /* renamed from: rj0.b$a */
    public static final class C89972a extends C87413o implements C32226l<MagicBrushView, C13598b0> {

        /* renamed from: d */
        public static final C89972a f258533d = new C89972a();

        public C89972a() {
            super(1);
        }

        public Object invoke(Object obj) {
            MagicBrushView magicBrushView = (MagicBrushView) obj;
            C87412m.m108594g(magicBrushView, LocaleUtil.ITALIAN);
            Log.m105924i("Luggage.WAGameJsApiInsertVideoPlayer", "InsertVideoPlayer, info: change viewType to TextureView");
            if (magicBrushView.getViewType() != MagicBrushView.C80327h.TextureView) {
                magicBrushView.setRendererView(new C111532e(magicBrushView.getContext()));
                magicBrushView.setOpaque(false);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: A */
    public Boolean mo115317A(JSONObject jSONObject) {
        Boolean bool = null;
        if (jSONObject != null) {
            try {
                bool = Boolean.valueOf(jSONObject.getBoolean("underGameView"));
            } catch (JSONException unused) {
            }
        }
        Log.m105924i("Luggage.WAGameJsApiInsertVideoPlayer", "getUnderView " + bool);
        return bool;
    }

    /* renamed from: H */
    public void mo22378H(C82520h hVar, int i, View view, JSONObject jSONObject) {
        C87412m.m108594g(hVar, "component");
        super.mo22378H(hVar, i, view, jSONObject);
        C90675f fVar = (C90675f) hVar;
        C88267e K1 = fVar.mo116160O0();
        C86474e eVar = K1 != null ? (C86474e) K1.mo125517G0(C86474e.class) : null;
        if (eVar == null) {
            Log.m105928w("JsApiInsertHTMLCanvasElement", "hy: webgl extension not exists!");
            return;
        }
        C80301a U = eVar.mo120910U();
        if (U == null) {
            Log.m105921e("Luggage.WAGameJsApiInsertVideoPlayer", "InsertViewPlayer but, no magicbrush found, maybe functionalPage[%d]", Boolean.valueOf(C81552b3.m100042a(fVar.getRuntime())));
        } else if (C87412m.m108589b(Boolean.TRUE, mo115317A(jSONObject))) {
            U.f235096l.forEach(C89972a.f258533d);
            if (((Boolean) C88982v.f256574c.mo123353e()).booleanValue()) {
                Log.m105924i("Luggage.WAGameJsApiInsertVideoPlayer", "hy: use main thread choreographer");
                if (((Boolean) C88984x.f256576c.mo123353e()).booleanValue()) {
                    U.mo111580r(C90954a.C90956b.NativeLocker);
                } else {
                    U.mo111580r(C90954a.C90956b.ChoreographerInMainThread);
                }
            } else {
                Log.m105924i("Luggage.WAGameJsApiInsertVideoPlayer", "hy: use js thread choreographer");
                U.mo111580r(C90954a.C90956b.ChoreographerInJsThread);
            }
        }
    }
}
