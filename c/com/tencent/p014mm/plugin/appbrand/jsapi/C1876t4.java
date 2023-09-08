package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import ke3.C88144b;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.t4 */
public class C1876t4 extends C82268c {
    public static final int CTRL_INDEX = 982;
    public static final String NAME = "openWCExDeviceList";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105924i("MicroMsg.JsApiOpenWCExDeviceList", "invoke JsApiOpenWCExDeviceList!");
        if (fVar == null) {
            Log.m105920e("MicroMsg.JsApiOpenWCExDeviceList", "fail:component is null");
        } else if (fVar.getContext() == null) {
            Log.m105920e("MicroMsg.JsApiOpenWCExDeviceList", "fail:context is null");
            fVar.mo109647a(i, mo115109j("fail"));
        } else {
            C88144b.m109791i(fVar.getContext(), "exdevice", ".ui.ExdeviceManageDeviceUI", new Intent(), (Bundle) null);
            fVar.mo109647a(i, mo115109j("ok"));
        }
    }
}
