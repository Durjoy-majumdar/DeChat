package rj0;

import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.View;
import com.tencent.magicbrush.C80301a;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81552b3;
import com.tencent.p014mm.plugin.appbrand.jsapi.webrtc.C83069c;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kr0.C88267e;
import nj0.C88982v;
import nj0.C88984x;
import org.json.JSONObject;
import org.webrtc.IRenderer;
import p1044ub.C90630c;
import p1059wd.C90954a;
import p169ib.C87685a;
import p547hb.C87464c;
import p958eb.C86474e;
import rx3.C13598b0;
import uj0.C90675f;
import vj0.C111532e;

/* renamed from: rj0.c */
public final class C89973c extends C83069c {

    /* renamed from: g */
    public final SparseArray<C87685a> f258534g;

    /* renamed from: rj0.c$a */
    public static final class C89974a extends C87413o implements C32226l<MagicBrushView, C13598b0> {

        /* renamed from: d */
        public static final C89974a f258535d = new C89974a();

        public C89974a() {
            super(1);
        }

        public Object invoke(Object obj) {
            MagicBrushView magicBrushView = (MagicBrushView) obj;
            C87412m.m108594g(magicBrushView, LocaleUtil.ITALIAN);
            Log.m105924i("MicroMsg.WAGameJsApiInsertWebRTCRendererView", "InsertVideoPlayer, info: change viewType to TextureView");
            if (magicBrushView.getViewType() != MagicBrushView.C80327h.TextureView) {
                magicBrushView.setRendererView(new C111532e(magicBrushView.getContext()));
                magicBrushView.setOpaque(false);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rj0.c$b */
    public static final class C89975b implements C87685a {

        /* renamed from: a */
        public final /* synthetic */ IRenderer f258536a;

        public C89975b(IRenderer iRenderer) {
            this.f258536a = iRenderer;
        }

        /* renamed from: a */
        public void mo9700a(AppBrandRuntime appBrandRuntime, C32226l<? super Bitmap, C13598b0> lVar) {
            C87412m.m108594g(appBrandRuntime, "runtime");
            C87412m.m108594g(lVar, "callback");
            this.f258536a.requestCaptureOnce(new C89976c(lVar));
        }
    }

    /* renamed from: rj0.c$c */
    public static final class C89976c implements IRenderer.OnCaptureListener {

        /* renamed from: a */
        public final /* synthetic */ C32226l f258537a;

        public C89976c(C32226l lVar) {
            this.f258537a = lVar;
        }

        public final /* synthetic */ void onCapture(Bitmap bitmap) {
            this.f258537a.invoke(bitmap);
        }
    }

    public C89973c(SparseArray<C87685a> sparseArray) {
        C87412m.m108594g(sparseArray, "captureDelegateContainer");
        this.f258534g = sparseArray;
    }

    /* renamed from: J */
    public C83069c.C55534c mo115318J() {
        return C83069c.C55534c.Surface;
    }

    /* renamed from: K */
    public void mo115319K(C90630c cVar, int i) {
        C87412m.m108594g(cVar, "component");
        super.mo115319K(cVar, i);
        C87464c cVar2 = (C87464c) cVar.mo116150E0(C87464c.class);
        if (cVar2 != null) {
            Log.m105924i("MicroMsg.WAGameJsApiInsertWebRTCRendererView", "hy: manually notify first frame ready from webrtc view");
            cVar2.mo111273y();
        }
    }

    /* renamed from: L */
    public void mo22378H(C90630c cVar, int i, View view, JSONObject jSONObject) {
        super.mo22378H(cVar, i, view, jSONObject);
        C87412m.m108592e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.game.page.WAGamePageView");
        C90675f fVar = (C90675f) cVar;
        C88267e K1 = fVar.mo116160O0();
        C86474e eVar = K1 != null ? (C86474e) K1.mo125517G0(C86474e.class) : null;
        if (eVar == null) {
            Log.m105928w("JsApiInsertHTMLCanvasElement", "hy: mb extension not exists!");
            return;
        }
        C80301a U = eVar.mo120910U();
        if (U == null) {
            Log.m105921e("MicroMsg.WAGameJsApiInsertWebRTCRendererView", "InsertViewPlayer but, no magicbrush found, maybe functionalPage[%d]", Boolean.valueOf(C81552b3.m100042a(fVar.getRuntime())));
        } else if (C87412m.m108589b(Boolean.TRUE, mo115317A(jSONObject))) {
            U.f235096l.forEach(C89974a.f258535d);
            if (((Boolean) C88982v.f256574c.mo123353e()).booleanValue()) {
                Log.m105924i("MicroMsg.WAGameJsApiInsertWebRTCRendererView", "hy: use main thread choreographer");
                if (((Boolean) C88984x.f256576c.mo123353e()).booleanValue()) {
                    U.mo111580r(C90954a.C90956b.NativeLocker);
                } else {
                    U.mo111580r(C90954a.C90956b.ChoreographerInMainThread);
                }
            } else {
                Log.m105924i("MicroMsg.WAGameJsApiInsertWebRTCRendererView", "hy: use js thread choreographer");
                U.mo111580r(C90954a.C90956b.ChoreographerInJsThread);
            }
        }
    }

    /* renamed from: M */
    public void mo115321M(C90630c cVar, IRenderer iRenderer, int i) {
        C87464c cVar2;
        C87412m.m108594g(iRenderer, "renderView");
        if (cVar != null && (cVar2 = (C87464c) cVar.mo116150E0(C87464c.class)) != null) {
            C89975b bVar = new C89975b(iRenderer);
            this.f258534g.put(i, bVar);
            cVar2.mo111248X(bVar, true);
        }
    }
}
