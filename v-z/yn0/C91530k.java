package yn0;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84543i2;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebSdk;
import di3.C86312j;
import gy3.C87412m;
import jk0.C87978d;
import org.json.JSONObject;
import s00.C90110f;

/* renamed from: yn0.k */
public final class C91530k extends C87978d<C83928t1> {
    @Deprecated
    public static final int CTRL_INDEX = -2;
    @Deprecated
    public static final String NAME = "insertHTMLVConsoleView";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "data");
        return jSONObject.optInt("htmlId");
    }

    /* renamed from: E */
    public View mo22377E(C82520h hVar, JSONObject jSONObject) {
        C83928t1 t1Var = (C83928t1) hVar;
        C87412m.m108594g(t1Var, "component");
        C87412m.m108594g(jSONObject, "data");
        if (!XWebSdk.hasWebViewCoreInited()) {
            ((C90110f) C86312j.m106911c(C90110f.class)).po0(WebView.sDefaultWebViewKind, (WebView.PreInitCallback) null);
        }
        Context context = t1Var.getContext();
        C91521g gVar = new C91521g(C84543i2.m104128b(context), t1Var.getRuntime());
        t1Var.f245029m1.add(gVar);
        View androidView = gVar.getAndroidView();
        C87412m.m108593f(androidView, "newVConsoleView(componen…\n            .androidView");
        return androidView;
    }
}
