package kx2;

import com.tencent.p014mm.magicbrush.plugin.scl.view.MagicSclViewContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import o70.C61948a;
import org.json.JSONObject;

/* renamed from: kx2.c */
public abstract class C88323c extends C88321b {
    /* renamed from: t */
    public void mo122710t(JSONObject jSONObject, MagicSclViewContainer magicSclViewContainer, int i) {
        C87412m.m108594g(jSONObject, "data");
        C87412m.m108594g(magicSclViewContainer, "rootView");
        Log.m105924i("MicroMsg.MBBaseRemoveCoverViewJsApi", "invokeImpl:data:" + jSONObject + ",viewId:" + i);
        if (magicSclViewContainer.getCustomViewContainer() == null) {
            Log.m105920e("MicroMsg.MBBaseRemoveCoverViewJsApi", "rootView.getCustomViewContainer() == null");
            mo122711s("fail:coverview is null");
            return;
        }
        C61948a customViewContainer = magicSclViewContainer.getCustomViewContainer();
        C87412m.m108591d(customViewContainer);
        if (customViewContainer.mo116439q(i) != null) {
            C61948a customViewContainer2 = magicSclViewContainer.getCustomViewContainer();
            C87412m.m108591d(customViewContainer2);
            if (customViewContainer2.mo116441s(i)) {
                mo122711s("");
                Log.m105924i("MicroMsg.MBBaseRemoveCoverViewJsApi", "remove view:viewId:" + i + ",result:" + true);
                return;
            }
            mo122711s("fail:removeView error");
            return;
        }
        Log.m105920e("MicroMsg.MBBaseRemoveCoverViewJsApi", "view for this viewId is null");
        mo122711s("fail:view for this viewId is null");
    }
}
