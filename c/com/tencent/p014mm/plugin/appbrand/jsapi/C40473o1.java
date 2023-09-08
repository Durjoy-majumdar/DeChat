package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.o1 */
public class C40473o1 extends JsApiUploadWeRunData {
    public static final int CTRL_INDEX = 324;
    public static final String NAME = "addWeRunData";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105918d("MicroMsg.JsApiAddWeRunData", "JsApiAddWeRunData!");
        if (jSONObject == null) {
            fVar.mo109647a(i, mo115109j("fail:data is null"));
            Log.m105920e("MicroMsg.JsApiAddWeRunData", "data is null");
            return;
        }
        mo63201w(this, fVar, i, jSONObject.optInt(TPReportKeys.Common.COMMON_STEP), true);
    }
}
