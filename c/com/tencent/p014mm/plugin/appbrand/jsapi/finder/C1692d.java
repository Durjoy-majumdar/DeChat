package com.tencent.p014mm.plugin.appbrand.jsapi.finder;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.protocal.protobuf.FinderUserPageResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ob0.C47350c;
import org.json.JSONObject;
import te3.C50856po1;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.d */
public class C1692d extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "fetchFinderProfileFeed";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        Log.m105924i("MicroMsg.Finder.JsApiFetchFinderProfileFeed", "JsApiFetchFinderProfileFeed");
        if (jSONObject == null) {
            i2Var.mo109647a(i, mo115109j("fail:data is null or nil"));
            return;
        }
        String optString = jSONObject.optString("username", "");
        if (Util.isNullOrNil(optString)) {
            i2Var.mo109647a(i, mo115109j("fail:username is null or nil"));
            return;
        }
        String optString2 = jSONObject.optString("maxId", "");
        if (Util.isNullOrNil(optString2)) {
            i2Var.mo109647a(i, mo115109j("fail:maxId is null or nil"));
            return;
        }
        C50856po1 po12 = new C50856po1();
        po12.f139868e = Long.valueOf(optString2).longValue();
        po12.f139867d = optString;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 3736;
        bVar.f127068c = "${FinderCgiConstants.CGI_PRE}/finderuserpage";
        bVar.f127066a = po12;
        bVar.f127067b = new FinderUserPageResponse();
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C1691c(this, i2Var, i));
    }
}
