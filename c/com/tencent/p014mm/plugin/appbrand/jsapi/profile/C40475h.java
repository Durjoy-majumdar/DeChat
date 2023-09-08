package com.tencent.p014mm.plugin.appbrand.jsapi.profile;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.protocal.protobuf.GetProfileInfoResponse;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ob0.C47350c;
import org.json.JSONObject;
import te3.C50640o62;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.h */
public final class C40475h extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 1191;
    public static final String NAME = "operateWxappCGI";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        JSONObject jSONObject2;
        if (fVar != null) {
            String str = null;
            JSONObject jSONObject3 = jSONObject != null ? jSONObject.getJSONObject("cgiInfo") : null;
            if (jSONObject3 != null) {
                int optInt = jSONObject3.optInt("uiCgi");
                if (optInt == 2921) {
                    Log.m105925i("MicroMsg.operateWxappCGI", "perform handleGetProfileInfo, cgiId: %d", Integer.valueOf(optInt));
                    String optString = (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("cgiInfo")) == null) ? null : jSONObject2.optString("uri");
                    JSONObject jSONObject4 = jSONObject != null ? jSONObject.getJSONObject("reqData") : null;
                    C50640o62 o622 = new C50640o62();
                    if (jSONObject4 != null) {
                        str = jSONObject4.optString("username");
                    }
                    o622.f138980d = str;
                    o622.f138981e = LocaleUtil.getApplicationLanguage();
                    C47350c.C47352b bVar = new C47350c.C47352b();
                    bVar.f127069d = 2921;
                    bVar.f127068c = optString;
                    bVar.f127067b = new GetProfileInfoResponse();
                    bVar.f127066a = o622;
                    ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C40474g(fVar, i, this));
                    return;
                }
                Log.m105925i("MicroMsg.operateWxappCGI", "No match cgi to perform, cgiId: %d", Integer.valueOf(optInt));
            }
        }
    }
}
