package cl0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import jk0.C87979e;
import org.json.JSONObject;

/* renamed from: cl0.m */
public class C80063m extends C87979e {
    private static final int CTRL_INDEX = 255;
    public static final String NAME = "removeTextView";

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
