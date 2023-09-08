package em0;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105130c;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import jk0.C87978d;
import org.json.JSONObject;
import p576jp.C88007b;
import wq0.C91062d;

/* renamed from: em0.b */
public class C86536b extends C87978d {
    private static final int CTRL_INDEX = 623;
    public static final String NAME = "insertVoIPView";

    public C86536b() {
        C91062d.m114234a(NAME);
    }

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.optInt("viewId");
    }

    /* renamed from: E */
    public View mo22377E(C82520h hVar, JSONObject jSONObject) {
        Class cls = C88007b.class;
        Log.m105924i("MicroMsg.OpenVoice.JsApiCloudVoiceInsertView", "inflateView," + jSONObject.toString());
        Context context = hVar.getContext();
        if (context == null) {
            Log.m105929w("MicroMsg.OpenVoice.JsApiCloudVoiceInsertView", "inflate view failed, context is null, %s", mo114779e());
            return null;
        } else if (((C105181w) ((C88007b) C86312j.m106911c(cls)).mo59116Bp()).f312388t == 2) {
            Log.m105929w("MicroMsg.OpenVoice.JsApiCloudVoiceInsertView", "inflate view failed, newView failed, %s, audio room", mo114779e());
            return null;
        } else {
            C105130c b = ((C105181w) ((C88007b) C86312j.m106911c(cls)).mo59116Bp()).f312378h.mo149452b(context, jSONObject, false);
            if (b != null) {
                return new CoverViewContainer(context, (View) b);
            }
            Log.m105929w("MicroMsg.OpenVoice.JsApiCloudVoiceInsertView", "inflate view failed, newView failed, %s", mo114779e());
            return null;
        }
    }

    /* renamed from: H */
    public void mo22378H(C82520h hVar, int i, View view, JSONObject jSONObject) {
        C105130c cVar = (C105130c) ((CoverViewContainer) view).mo114736d(View.class);
        if (cVar == null) {
            Log.m105928w("MicroMsg.OpenVoice.JsApiCloudVoiceInsertView", "onInsertView failed, view is null, viewId:" + i);
            return;
        }
        Log.m105924i("MicroMsg.OpenVoice.JsApiCloudVoiceInsertView", "onInsertView, viewId:[" + i + "," + cVar.getViewId() + "],data:" + jSONObject.toString());
        cVar.mo149440v(jSONObject);
    }
}
