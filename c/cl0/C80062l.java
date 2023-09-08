package cl0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import jk0.C87979e;
import org.json.JSONObject;

/* renamed from: cl0.l */
public class C80062l extends C87979e {
    private static final int CTRL_INDEX = 448;
    public static final String NAME = "removeScrollView";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    /* renamed from: D */
    public boolean mo110323D(C82520h hVar, int i, View view, JSONObject jSONObject) {
        hVar.mo109649c(jSONObject.optBoolean("independent", false)).mo86861b(i);
        return true;
    }
}
