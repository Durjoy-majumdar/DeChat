package xk0;

import android.content.Context;
import android.view.View;
import com.tencent.magicbrush.C80301a;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import jk0.C87978d;
import jk0.C87987k;
import kr0.C88267e;
import org.json.JSONObject;
import p958eb.C86475f;
import xk0.C91259a;

/* renamed from: xk0.i */
public final class C91271i extends C87978d<C83928t1> {
    public static final int CTRL_INDEX = 594;
    public static final String NAME = "insertWebGLCanvas";

    /* renamed from: g */
    public final HashMap<Integer, C91272a> f261867g = new HashMap<>();

    /* renamed from: h */
    public boolean f261868h;

    /* renamed from: xk0.i$a */
    public final class C91272a {

        /* renamed from: a */
        public final int f261869a;

        /* renamed from: b */
        public boolean f261870b;

        /* renamed from: c */
        public C87987k f261871c;

        public C91272a(int i) {
            this.f261869a = i;
        }

        /* renamed from: a */
        public final void mo125284a() {
            if (this.f261870b) {
                C87987k kVar = this.f261871c;
                C87412m.m108591d(kVar);
                kVar.mo122438a(C91271i.this.mo115109j("ok"));
                C91271i.this.f261867g.remove(Integer.valueOf(this.f261869a));
                Log.m105924i("JsApiInsertHTMLCanvasElement", "callback ok for canvasId [" + this.f261869a + ']');
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "data");
        return jSONObject.getInt("canvasId");
    }

    /* renamed from: C */
    public boolean mo121671C() {
        return this.f261868h;
    }

    /* renamed from: D */
    public boolean mo121672D() {
        return this.f261868h;
    }

    /* renamed from: F */
    public View mo110320F(C82520h hVar, JSONObject jSONObject, int i) {
        C83928t1 t1Var = (C83928t1) hVar;
        C87412m.m108594g(t1Var, "component");
        C87412m.m108594g(jSONObject, "data");
        Log.m105924i("JsApiInsertHTMLCanvasElement", "inflateView of HTMLCanvasElement for canvasId [" + i + "] [" + jSONObject + ']');
        C88267e K1 = t1Var.mo116160O0();
        C86475f fVar = K1 != null ? (C86475f) K1.mo125517G0(C86475f.class) : null;
        if (fVar == null) {
            Log.m105928w("JsApiInsertHTMLCanvasElement", "hy: webgl extension not exists!");
            return null;
        }
        C80301a U = fVar.mo120910U();
        if (U == null) {
            return null;
        }
        this.f261868h = jSONObject.optBoolean("scrollSupportedTouchEvent", false);
        C91272a aVar = new C91272a(i);
        this.f261867g.put(Integer.valueOf(i), aVar);
        Context context = t1Var.getContext();
        C87412m.m108593f(context, "component.context");
        MagicBrushView magicBrushView = new MagicBrushView(context, MagicBrushView.C80327h.TextureView);
        magicBrushView.setMagicBrush(U);
        magicBrushView.getPreparedListeners().mo125229a(new C91273j(aVar));
        if (jSONObject.optBoolean("transparentBackground", false)) {
            magicBrushView.setOpaque(false);
        }
        C91259a.C91261b bVar = C91259a.f261849c;
        String appId = t1Var.getAppId();
        C87412m.m108593f(appId, "component.appId");
        bVar.mo125282a(appId).mo125278a(i, magicBrushView);
        if (this.f261868h) {
            magicBrushView.setEnableTouchEvent(false);
        }
        t1Var.mo114868y(new C91274k(t1Var, i, U));
        if (t1Var.f244563P) {
            String appId2 = t1Var.getAppId();
            C87412m.m108593f(appId2, "component.appId");
            C91259a a = bVar.mo125282a(appId2);
            a.mo125280c(i);
            if (a.mo125281d() == 1) {
                U.mo111506d();
            }
        }
        t1Var.mo114864j(new C91275l(t1Var, i, U));
        return new CoverViewContainer(t1Var.getContext(), (View) magicBrushView);
    }

    /* renamed from: I */
    public void mo114665I(C82520h hVar, int i, View view, JSONObject jSONObject, C87987k kVar) {
        C87412m.m108594g((C83928t1) hVar, "component");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(jSONObject, "data");
        C87412m.m108594g(kVar, "callback");
        C91272a aVar = this.f261867g.get(Integer.valueOf(i));
        C87412m.m108591d(aVar);
        C91272a aVar2 = aVar;
        aVar2.f261871c = kVar;
        if (aVar2.f261870b) {
            aVar2.mo125284a();
        }
    }
}
