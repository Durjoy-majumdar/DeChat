package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.menu.C83699y;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.v */
public class C82993v extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 464;
    public static final String NAME = "updateShareMenuUpdatable";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        C83780d1 l0 = i2Var.mo114341l0();
        if (l0 != null) {
            C83699y J0 = l0.mo116155J0(3);
            if (J0 == null) {
                i2Var.mo109647a(i, mo115109j("fail:menu item do not exist"));
                return;
            }
            boolean optBoolean = jSONObject.optBoolean("updatable", false);
            String optString = jSONObject.optString("templateId", "");
            boolean optBoolean2 = jSONObject.optBoolean("isPrivateMessage", false);
            J0.f244320d.mo120962i("enable_share_with_updateable_msg", Boolean.valueOf(optBoolean));
            J0.f244320d.mo120962i("enable_share_with_updateable_msg_template_id", optString);
            J0.f244320d.mo120962i("enable_share_with_private_msg", Boolean.valueOf(optBoolean2));
            i2Var.mo109647a(i, mo115109j("ok"));
            Log.m105925i("MicroMsg.JsApiUpdateShareMenuUpdatable", "update share menu updatable(%s) isPrivateMessage(%s)", Boolean.valueOf(optBoolean), Boolean.valueOf(optBoolean2));
            return;
        }
        i2Var.mo109647a(i, mo115109j("fail"));
    }
}
