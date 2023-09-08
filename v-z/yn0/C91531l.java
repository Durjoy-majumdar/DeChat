package yn0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C40478h;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import gy3.C87412m;
import jk0.C87979e;
import org.json.JSONObject;

/* renamed from: yn0.l */
public final class C91531l extends C87979e<C83928t1> {
    @Deprecated
    public static final int CTRL_INDEX = -2;
    @Deprecated
    public static final String NAME = "removeHTMLVConsoleView";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "data");
        return jSONObject.optInt("htmlId");
    }

    /* renamed from: D */
    public boolean mo110323D(C82520h hVar, int i, View view, JSONObject jSONObject) {
        C83928t1 t1Var = (C83928t1) hVar;
        C40478h hVar2 = view instanceof C40478h ? (C40478h) view : null;
        if (hVar2 == null || t1Var == null) {
            return true;
        }
        t1Var.f245029m1.remove(hVar2);
        return true;
    }
}
