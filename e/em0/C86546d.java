package em0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105130c;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import jk0.C87979e;
import org.json.JSONObject;
import p576jp.C88007b;
import wq0.C91062d;

/* renamed from: em0.d */
public class C86546d extends C87979e {
    private static final int CTRL_INDEX = 625;
    public static final String NAME = "removeVoIPView";

    public C86546d() {
        C91062d.m114234a(NAME);
    }

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.optInt("viewId", 0);
    }

    /* renamed from: D */
    public boolean mo110323D(C82520h hVar, int i, View view, JSONObject jSONObject) {
        Log.m105924i("MicroMsg.OpenVoice.JsApiCloudVoiceRemoveView", "onRemoveView," + jSONObject.toString());
        if (!(view instanceof CoverViewContainer)) {
            Log.m105929w("MicroMsg.OpenVoice.JsApiCloudVoiceRemoveView", "the view(%s) is not a instance of CoverViewContainer", Integer.valueOf(i));
            return false;
        }
        View view2 = (View) ((CoverViewContainer) view).mo114736d(View.class);
        if (view2 == null || !(view2 instanceof C105130c)) {
            Log.m105929w("MicroMsg.OpenVoice.JsApiCloudVoiceRemoveView", "the view(%s) is null", Integer.valueOf(i));
            return false;
        }
        ((C105181w) ((C88007b) C86312j.m106911c(C88007b.class)).mo59116Bp()).f312378h.mo149451a((C105130c) view2);
        return true;
    }
}
