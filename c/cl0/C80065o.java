package cl0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import ht0.C87586a;
import jk0.C87981f;
import org.json.JSONObject;
import sn0.C90251c;
import sn0.C90266f;

/* renamed from: cl0.o */
public class C80065o extends C87981f {
    private static final int CTRL_INDEX = 254;
    public static final String NAME = "updateImageView";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    /* renamed from: E */
    public boolean mo22381E(C82520h hVar, int i, View view, JSONObject jSONObject) {
        Log.m105919d("MicroMsg.JsApiUpdateImageView", "onUpdateView(viewId : %s, %s)", Integer.valueOf(i), jSONObject);
        if (!(view instanceof CoverViewContainer)) {
            Log.m105929w("MicroMsg.JsApiUpdateImageView", "the view(%s) is not a instance of CoverViewContainer", Integer.valueOf(i));
            return false;
        }
        C87586a aVar = (C87586a) ((CoverViewContainer) view).mo114736d(C87586a.class);
        if (aVar == null) {
            Log.m105929w("MicroMsg.JsApiUpdateImageView", "the target view(%s) is null", Integer.valueOf(i));
            return false;
        }
        C90266f.m112997a(view, jSONObject.optJSONObject("style"));
        C90251c.m112985a(hVar, i, aVar, jSONObject, new C80047b(i, aVar.getKeyValueSet(), hVar));
        return true;
    }
}
