package com.tencent.p014mm.plugin.appbrand.jsapi.contact;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.config.WxaProfileAttributes;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import rx3.C13598b0;
import wi0.C90986j0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.s */
public final class C82350s implements C1256g<WxaProfileAttributes> {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f241359d;

    /* renamed from: e */
    public final /* synthetic */ int f241360e;

    /* renamed from: f */
    public final /* synthetic */ JsApiUpdateAppContact f241361f;

    public C82350s(C81925i2 i2Var, int i, JsApiUpdateAppContact jsApiUpdateAppContact) {
        this.f241359d = i2Var;
        this.f241360e = i;
        this.f241361f = jsApiUpdateAppContact;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        WxaProfileAttributes wxaProfileAttributes = (WxaProfileAttributes) obj;
        C81925i2 i2Var = this.f241359d;
        int i = this.f241360e;
        JsApiUpdateAppContact jsApiUpdateAppContact = this.f241361f;
        HashMap hashMap = new HashMap();
        hashMap.put(LiteAppCenter.FRAMEWORK_TYPE_BASE, wxaProfileAttributes != null ? new C90986j0(wxaProfileAttributes, this.f241359d) : null);
        C13598b0 b0Var = C13598b0.f38549a;
        jsApiUpdateAppContact.getClass();
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
        }
        hashMap.put("errno", 0);
        i2Var.mo109647a(i, jsApiUpdateAppContact.mo115114o("ok", hashMap));
    }
}
