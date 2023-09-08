package hl0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import kr0.C88267e;
import kz1.C88349l;
import org.json.JSONObject;
import zt3.C119157j;

/* renamed from: hl0.j */
public class C87552j extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 1077;
    public static final String NAME = "shareInvitationToLiveRoom";

    /* renamed from: g */
    public static volatile boolean f253641g = true;

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        Log.m105924i("JsApiShareInvitationToLiveRoom", "invoke jsapi");
        if (f253641g) {
            f253641g = false;
            ((C119157j) C119157j.f356862d).mo183878i(new j$$a(), 300);
            ((C88349l) C86312j.m106911c(C88349l.class)).P40(eVar.getContext(), eVar.getAppId(), eVar.getRuntime().mo113210l1().f239365g, jSONObject, new j$$b(this, eVar, i));
            return;
        }
        Log.m105924i("JsApiShareInvitationToLiveRoom", "enableInvoke is false");
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1, "cancel");
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("errno", 1);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
        }
        eVar.mo109647a(i, mo115115p("cancel", jSONObject2));
    }
}
