package com.tencent.p014mm.plugin.appbrand.jsapi.picker;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.i */
public final class C17928i extends C17918a {
    public static final int CTRL_INDEX = 84;
    public static final String NAME = "showDatePickerView";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82520h hVar = (C82520h) fVar;
        String optString = jSONObject.optString("mode");
        if (FFmpegMetadataRetriever.METADATA_KEY_DATE.equals(optString)) {
            new C17919b().mo22195g(this, hVar, jSONObject, i, this.f49423g);
        } else if ("time".equals(optString)) {
            new C17956s().mo22195g(this, hVar, jSONObject, i, this.f49423g);
        } else {
            hVar.mo109647a(i, mo115109j("fail:invalid data"));
        }
    }
}
