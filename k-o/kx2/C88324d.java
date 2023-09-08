package kx2;

import android.view.View;
import com.tencent.p014mm.magicbrush.plugin.scl.view.MagicSclViewContainer;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.surface.magiclivecard.p950mb.C85486a;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import jx2.C88039c;
import jx2.C88040d;
import o70.C61948a;
import org.json.JSONException;
import org.json.JSONObject;
import org.libpag.PAGView;
import ox2.C89299a;

/* renamed from: kx2.d */
public abstract class C88324d extends C88321b {
    /* renamed from: t */
    public void mo122710t(JSONObject jSONObject, MagicSclViewContainer magicSclViewContainer, int i) {
        boolean z;
        int i2;
        C87412m.m108594g(jSONObject, "data");
        C87412m.m108594g(magicSclViewContainer, "rootView");
        Log.m105924i("MicroMsg.MBBaseUpdateCoverViewJsApi", "invokeImpl:data:" + jSONObject + ",viewId:" + i);
        if (magicSclViewContainer.getCustomViewContainer() == null) {
            Log.m105928w("MicroMsg.MBBaseUpdateCoverViewJsApi", "rootView.getCustomViewContainer() is null");
            mo122711s("coverView is null");
            return;
        }
        C61948a customViewContainer = magicSclViewContainer.getCustomViewContainer();
        C87412m.m108591d(customViewContainer);
        View p = customViewContainer.mo116438p(i);
        if (p == null) {
            Log.m105928w("MicroMsg.MBBaseUpdateCoverViewJsApi", "view for this viewId is null");
            mo122711s("fail:view for this viewId is null");
            return;
        }
        boolean z2 = false;
        try {
            C61948a customViewContainer2 = magicSclViewContainer.getCustomViewContainer();
            C87412m.m108591d(customViewContainer2);
            float[] r = mo122712r(jSONObject);
            try {
                i2 = jSONObject.getBoolean("hide") ? 4 : 0;
            } catch (JSONException unused) {
                i2 = -1;
            }
            Boolean bool = Boolean.FALSE;
            z = customViewContainer2.mo116446x(i, r, i2, bool, bool);
        } catch (JSONException unused2) {
            Log.m105920e("MicroMsg.MBBaseUpdateCoverViewJsApi", "updateView fail");
            z = false;
        }
        if (z) {
            C88039c cVar = (C88039c) this;
            Log.m105918d("MicroMsg.MBJsApiUpdatePagView", "onUpdateView,viewId:" + i);
            PAGView pAGView = (PAGView) ((CoverViewContainer) p).mo114736d(PAGView.class);
            if (pAGView == null) {
                Log.m105928w("MicroMsg.MBJsApiUpdatePagView", "onUpdateView(viewId : " + i + ") failed, targetView is null");
            } else {
                C85486a aVar = (C85486a) cVar.f251227a;
                if (aVar != null) {
                    aVar.mo118858C0();
                    C88040d.C88041a aVar2 = C88040d.f254660a;
                    C85486a aVar3 = (C85486a) cVar.f251227a;
                    C89299a C0 = aVar3 != null ? aVar3.mo118858C0() : null;
                    C87412m.m108591d(C0);
                    z2 = aVar2.mo122485a(C0, jSONObject, pAGView);
                }
            }
            if (z2) {
                mo122711s("");
            } else {
                mo122711s("onUpdateView error");
            }
            Log.m105924i("MicroMsg.MBBaseUpdateCoverViewJsApi", "update view viewId:" + i + ", result:" + z2);
            return;
        }
        mo122711s("updateView error");
    }
}
