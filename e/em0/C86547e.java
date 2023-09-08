package em0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105130c;
import com.tencent.p014mm.sdk.platformtools.Log;
import jk0.C87981f;
import org.json.JSONObject;
import wq0.C91062d;

/* renamed from: em0.e */
public class C86547e extends C87981f {
    private static final int CTRL_INDEX = 624;
    public static final String NAME = "updateVoIPView";

    public C86547e() {
        C91062d.m114234a(NAME);
    }

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.optInt("viewId");
    }

    /* renamed from: E */
    public boolean mo22381E(C82520h hVar, int i, View view, JSONObject jSONObject) {
        Log.m105924i("MicroMsg.OpenVoice.JsApiCloudVoiceUpdateView", "onUpdateView," + jSONObject.toString());
        if (!(view instanceof CoverViewContainer)) {
            Log.m105929w("MicroMsg.OpenVoice.JsApiCloudVoiceUpdateView", "the view(%s) is not a instance of CoverViewContainer", Integer.valueOf(i));
            return false;
        }
        View view2 = (View) ((CoverViewContainer) view).mo114736d(View.class);
        if (view2 == null || !(view2 instanceof C105130c)) {
            Log.m105929w("MicroMsg.OpenVoice.JsApiCloudVoiceUpdateView", "the camera view(%s) is null", Integer.valueOf(i));
            return false;
        }
        Log.m105924i("MicroMsg.OpenVoice.JsApiCloudVoiceUpdateView", "onUpdateView,viewId:[" + i + "," + jSONObject.optInt("viewId") + "],data:" + jSONObject.toString());
        ((C105130c) view2).mo149439r(jSONObject);
        return true;
    }
}
