package com.tencent.p014mm.plugin.appbrand.jsapi.finder;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import ob0.C47350c;
import org.json.JSONObject;
import pe3.C89349b;
import te3.C49282eg1;
import te3.C50247ld1;
import te3.C50401mh0;
import te3.C64313dg1;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.f */
public class C55508f extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "modifyFinderAccountAvatar";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        Log.m105924i("MicroMsg.Finder.JsApiModifyFinderAccountAvatar", "JsApiModifyFinderAccountAvatar");
        if (jSONObject == null) {
            i2Var.mo109647a(i, mo115109j("fail:data is null or nil"));
            return;
        }
        String optString = jSONObject.optString("avatarPath", "");
        if (Util.isNullOrNil(optString)) {
            i2Var.mo109647a(i, mo115109j("fail:avatarPath is null or nil"));
            return;
        }
        String optString2 = jSONObject.optString("username", "");
        if (Util.isNullOrNil(optString2)) {
            i2Var.mo109647a(i, mo115109j("fail:username is null or nil"));
            return;
        }
        String i2 = i2Var.mo114341l0().getFileSystem().getAbsoluteFile(optString).mo119971i();
        C50247ld1 ld12 = new C50247ld1();
        ld12.f137314d = new C89349b(C86013q1.m106433O(i2, 0, -1));
        C50401mh0 mh02 = new C50401mh0();
        mh02.f138028d = 1;
        try {
            mh02.f138029e = C89349b.m111674a(ld12.toByteArray());
        } catch (Exception unused) {
        }
        C64313dg1 dg12 = new C64313dg1();
        dg12.f182703d = optString2;
        dg12.f182704e.add(mh02);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 3870;
        bVar.f127068c = "${FinderCgiConstants.CGI_PRE}/finderoplog";
        bVar.f127066a = dg12;
        bVar.f127067b = new C49282eg1();
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C55507e(this, i2Var, i));
    }
}
