package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import com.tencent.p014mm.plugin.appbrand.jsapi.finder.C55511i;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.m */
public class C55488m extends C82297d {
    private static final int CTRL_INDEX = 969;
    private static final String NAME = "openChannelsUserProfile";

    /* renamed from: D */
    public boolean mo77015D(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "extInfoJsonObj");
        try {
            jSONObject.put("commentScene", 15);
            return true;
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsUserProfile", "preProcessExtInfo, fail since " + e);
            return false;
        }
    }

    /* renamed from: y */
    public String mo77017y() {
        return C55511i.NAME;
    }
}
