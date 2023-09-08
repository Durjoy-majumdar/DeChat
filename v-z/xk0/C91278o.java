package xk0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import jk0.C87979e;
import org.json.JSONObject;
import xk0.C91259a;

/* renamed from: xk0.o */
public final class C91278o extends C87979e<C83928t1> {
    public static final int CTRL_INDEX = 596;
    public static final String NAME = "removeWebGLCanvas";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "data");
        return jSONObject.getInt("canvasId");
    }

    /* renamed from: D */
    public boolean mo110323D(C82520h hVar, int i, View view, JSONObject jSONObject) {
        C83928t1 t1Var = (C83928t1) hVar;
        C87412m.m108594g(t1Var, "component");
        C87412m.m108594g(view, "view");
        Log.m105924i("JsApiRemoveHTMLCanvasElement", "remove HTMLCanvasElement for canvasId[" + i + ']');
        C91259a.C91261b bVar = C91259a.f261849c;
        String appId = t1Var.getAppId();
        C87412m.m108593f(appId, "component.appId");
        bVar.mo125282a(appId).f261852b.remove(Integer.valueOf(i));
        return true;
    }
}
