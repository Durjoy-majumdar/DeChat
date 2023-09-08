package com.tencent.p014mm.plugin.appbrand.jsapi.finder;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ob0.C47350c;
import org.json.JSONObject;
import pe3.C89349b;
import te3.C49282eg1;
import te3.C50401mh0;
import te3.C64313dg1;
import te3.C64553md1;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.h */
public class C55510h extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "modifyFinderAccountNickname";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        Log.m105924i("MicroMsg.Finder.JsApiModifyFinderAccountNickname", "JsApiModifyFinderAccountNickname");
        if (jSONObject == null) {
            i2Var.mo109647a(i, mo115109j("fail:data is null or nil"));
            return;
        }
        String optString = jSONObject.optString("username", "");
        if (Util.isNullOrNil(optString)) {
            i2Var.mo109647a(i, mo115109j("fail:username is null or nil"));
            return;
        }
        String optString2 = jSONObject.optString("nickname", "");
        if (Util.isNullOrNil(optString2)) {
            i2Var.mo109647a(i, mo115109j("fail:nickname is null or nil"));
            return;
        }
        String optString3 = jSONObject.optString("signature", "");
        if (Util.isNullOrNil(optString3)) {
            i2Var.mo109647a(i, mo115109j("fail:signature is null or nil"));
            return;
        }
        C64553md1 md12 = new C64553md1();
        md12.f184295d = optString2;
        md12.f184296e = optString3;
        C50401mh0 mh02 = new C50401mh0();
        mh02.f138028d = 1;
        try {
            mh02.f138029e = C89349b.m111674a(md12.toByteArray());
        } catch (Exception unused) {
        }
        C64313dg1 dg12 = new C64313dg1();
        dg12.f182703d = optString;
        dg12.f182704e.add(mh02);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 3870;
        bVar.f127068c = "${FinderCgiConstants.CGI_PRE}/finderoplog";
        bVar.f127066a = dg12;
        bVar.f127067b = new C49282eg1();
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C55509g(this, i2Var, i));
    }
}
