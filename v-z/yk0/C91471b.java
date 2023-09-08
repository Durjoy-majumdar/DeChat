package yk0;

import android.view.Surface;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: yk0.b */
public final class C91471b implements C82531i.C82534c {

    /* renamed from: d */
    public final /* synthetic */ C91469a f262261d;

    public C91471b(C91469a aVar) {
        this.f262261d = aVar;
    }

    public void onDestroy() {
        C91469a aVar = this.f262261d;
        Surface surface = aVar.f262253o;
        if (surface != null) {
            try {
                MagicBrushView.C80321c cVar = aVar.f262252n;
                if (cVar != null) {
                    cVar.mo55505e(surface, false);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", e, "handle page.onDestroy", new Object[0]);
            }
            aVar.f262253o = null;
        }
        C83780d1 d1Var = this.f262261d.f262249h;
        if (d1Var != null) {
            d1Var.mo114867r(this);
        } else {
            C87412m.m108603p("componentView");
            throw null;
        }
    }
}
