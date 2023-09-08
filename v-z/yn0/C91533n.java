package yn0;

import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import gy3.C87412m;
import jk0.C87981f;
import org.json.JSONObject;

/* renamed from: yn0.n */
public final class C91533n extends C87981f<C83928t1> {
    @Deprecated
    public static final int CTRL_INDEX = -2;
    @Deprecated
    public static final String NAME = "updateHTMLVConsoleView";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "data");
        return jSONObject.optInt("htmlId");
    }
}
