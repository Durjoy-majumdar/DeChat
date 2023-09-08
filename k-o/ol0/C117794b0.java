package ol0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.sdk.platformtools.Log;
import jk0.C87979e;
import org.json.JSONObject;
import pl0.C118116u;
import pl0.C118117v;
import pl0.C89367t;

/* renamed from: ol0.b0 */
public class C117794b0 extends C87979e {
    public static final int CTRL_INDEX = 3;
    public static final String NAME = "removeMap";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return C118116u.m166638c(jSONObject);
    }

    /* renamed from: D */
    public boolean mo110323D(C82520h hVar, int i, View view, JSONObject jSONObject) {
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiRemoveMap", "data is null");
            return false;
        }
        C89367t.m111696a(6);
        if (C118117v.m166642a(hVar.getAppId(), C118116u.m166637b(hVar, jSONObject))) {
            C89367t.m111696a(7);
            return true;
        }
        C89367t.m111696a(8);
        return true;
    }
}
