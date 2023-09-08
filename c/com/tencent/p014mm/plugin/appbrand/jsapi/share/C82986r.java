package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import kr0.C88267e;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.r */
public class C82986r extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 779;
    public static final String NAME = "showShareTimelineMenu";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        Log.m105924i("MicroMsg.JsApiShowShareTimelineMenu", "invoke showShareTimelineMenu");
        if (eVar == null) {
            eVar.mo109647a(i, mo115109j("fail"));
        } else if (eVar.mo114341l0() == null) {
            eVar.mo109647a(i, mo115109j("fail"));
        } else if (eVar.mo114341l0().mo116155J0(4) == null) {
            eVar.mo109647a(i, mo115109j("fail"));
        } else {
            eVar.mo114341l0().mo116155J0(4).f244319c = false;
            eVar.mo109647a(i, mo115109j("ok"));
        }
    }
}
