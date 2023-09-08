package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Context;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.m4 */
public class C82641m4 extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 247;
    public static final String NAME = "openDeliveryList";

    /* renamed from: g */
    public static final String f241802g = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + "/bizmall/expressentry");

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        String optString = jSONObject.optString(SearchIntents.EXTRA_QUERY);
        if (Util.isNullOrNil(optString)) {
            i2Var.mo109647a(i, mo115109j("fail"));
            return;
        }
        String str = f241802g + optString;
        C40469j0.C40470a aVar = new C40469j0.C40470a();
        aVar.f108758b = true;
        aVar.f108757a = true;
        aVar.f108759c = i2Var;
        Context context = i2Var.getContext();
        if (context != null) {
            ((C40469j0) i2Var.mo109668l(C40469j0.class)).mo56167JF(context, str, "", aVar);
            i2Var.mo109647a(i, mo115109j("ok"));
            return;
        }
        i2Var.mo109647a(i, mo115109j("fail"));
    }
}
