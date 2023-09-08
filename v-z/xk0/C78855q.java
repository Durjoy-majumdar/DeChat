package xk0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import jk0.C87981f;
import org.json.JSONObject;

/* renamed from: xk0.q */
public final class C78855q extends C87981f<C83928t1> {
    public static final int CTRL_INDEX = 595;
    public static final String NAME = "updateWebGLCanvas";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "data");
        return jSONObject.getInt("canvasId");
    }

    /* renamed from: C */
    public boolean mo108859C() {
        return true;
    }

    /* renamed from: E */
    public boolean mo22381E(C82520h hVar, int i, View view, JSONObject jSONObject) {
        C83928t1 t1Var = (C83928t1) hVar;
        Log.m105924i("JsApiUpdateHTMLCanvasElement", "update HTMLCanvasElement for canvasId[" + i + ']');
        return true;
    }
}
