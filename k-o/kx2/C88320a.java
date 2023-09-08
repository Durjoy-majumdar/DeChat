package kx2;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.magicbrush.plugin.scl.view.MagicSclViewContainer;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.surface.magiclivecard.p950mb.C85486a;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import jx2.C88037a;
import jx2.C88040d;
import o70.C61948a;
import org.json.JSONException;
import org.json.JSONObject;
import org.libpag.PAGView;
import ox2.C89299a;

/* renamed from: kx2.a */
public abstract class C88320a extends C88321b {
    /* renamed from: t */
    public void mo122710t(JSONObject jSONObject, MagicSclViewContainer magicSclViewContainer, int i) {
        boolean z;
        int i2;
        C87412m.m108594g(jSONObject, "data");
        C87412m.m108594g(magicSclViewContainer, "rootView");
        Log.m105924i("MicroMsg.MBBaseInsertCoverViewJsApi", "invokeImpl:data:" + jSONObject + ",viewId:" + i);
        if (magicSclViewContainer.getCustomViewContainer() == null) {
            Log.m105928w("MicroMsg.MBBaseInsertCoverViewJsApi", "rootView.getCustomViewContainer() is null");
            mo122711s("fail:cover view is null");
            return;
        }
        C61948a customViewContainer = magicSclViewContainer.getCustomViewContainer();
        C87412m.m108591d(customViewContainer);
        boolean z2 = false;
        if (customViewContainer.mo116439q(i) != null) {
            Log.m105928w("MicroMsg.MBBaseInsertCoverViewJsApi", "already exist:" + i);
            mo122711s("view already exist");
            return;
        }
        Context context = magicSclViewContainer.getContext();
        C87412m.m108593f(context, "rootView.context");
        CoverViewContainer coverViewContainer = new CoverViewContainer(context, (View) new PAGView(context));
        int optInt = jSONObject.optInt("parentId", 0);
        try {
            C61948a customViewContainer2 = magicSclViewContainer.getCustomViewContainer();
            C87412m.m108591d(customViewContainer2);
            float[] r = mo122712r(jSONObject);
            try {
                i2 = jSONObject.getBoolean("hide") ? 4 : 0;
            } catch (JSONException unused) {
                i2 = -1;
            }
            z = customViewContainer2.mo116410e(coverViewContainer, i, optInt, r, i2, false);
        } catch (JSONException unused2) {
            Log.m105920e("MicroMsg.MBBaseInsertCoverViewJsApi", "addView fail");
            z = false;
        }
        if (z) {
            C88037a aVar = (C88037a) this;
            Log.m105918d("MicroMsg.MBJsApiInsertPagView", "onInsertView:viewId:" + i);
            PAGView pAGView = (PAGView) coverViewContainer.mo114736d(PAGView.class);
            if (pAGView == null) {
                Log.m105928w("MicroMsg.MBJsApiInsertPagView", "onInsertView(viewId : " + i + ") failed, targetView is null");
            } else {
                C85486a aVar2 = (C85486a) aVar.f251227a;
                if (aVar2 != null) {
                    aVar2.mo118858C0();
                    C88040d.C88041a aVar3 = C88040d.f254660a;
                    C85486a aVar4 = (C85486a) aVar.f251227a;
                    C89299a C0 = aVar4 != null ? aVar4.mo118858C0() : null;
                    C87412m.m108591d(C0);
                    z2 = aVar3.mo122485a(C0, jSONObject, pAGView);
                }
            }
            if (z2) {
                mo122711s("");
            } else {
                mo122711s("fail:onInsertView error");
            }
            Log.m105924i("MicroMsg.MBBaseInsertCoverViewJsApi", "insert view parentId:" + optInt + ", viewId:" + i + ", result:" + z2);
            return;
        }
        mo122711s("fail:insertView error");
    }
}
