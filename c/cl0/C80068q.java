package cl0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.appbrand.widget.C84931f;
import com.tencent.p014mm.sdk.platformtools.Log;
import jk0.C87981f;
import org.json.JSONObject;
import sn0.C90251c;
import sn0.C90266f;

/* renamed from: cl0.q */
public class C80068q extends C87981f {
    private static final int CTRL_INDEX = 254;
    public static final String NAME = "updateTextView";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    /* renamed from: E */
    public boolean mo22381E(C82520h hVar, int i, View view, JSONObject jSONObject) {
        Log.m105919d("MicroMsg.JsApiUpdateTextView", "onUpdateView(viewId : %s, %s)", Integer.valueOf(i), jSONObject);
        if (!(view instanceof CoverViewContainer)) {
            Log.m105929w("MicroMsg.JsApiUpdateTextView", "the view(%s) is not a instance of CoverViewContainer", Integer.valueOf(i));
            return false;
        }
        C84931f fVar = (C84931f) ((CoverViewContainer) view).mo114736d(C84931f.class);
        if (fVar == null) {
            Log.m105929w("MicroMsg.JsApiUpdateTextView", "the target view(%s) is null", Integer.valueOf(i));
        }
        C90251c.m112986b(fVar, jSONObject.optJSONObject("label"));
        C90266f.m112997a(view, jSONObject.optJSONObject("style"));
        return true;
    }
}
