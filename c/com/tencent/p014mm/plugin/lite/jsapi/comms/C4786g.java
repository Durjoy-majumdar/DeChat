package com.tencent.p014mm.plugin.lite.jsapi.comms;

import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import kr0.C76633z0;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.g */
public class C4786g extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105918d("LiteAppJsApiEnterContact", "Invoke enterContact");
        if (jSONObject == null) {
            this.f19815f.mo5689a("fail: data is null");
            return;
        }
        String optString = jSONObject.optString("sessionFrom");
        if (optString.length() > 1024) {
            optString.substring(0, 1024);
            Log.m105924i("LiteAppJsApiEnterContact", "enterContact sessionFrom length is large than 1024!");
        }
        String optString2 = jSONObject.optString("appId");
        String optString3 = jSONObject.optString("userName");
        if (Util.isNullOrNil(optString2) || Util.isNullOrNil(optString3)) {
            this.f19815f.mo5689a("expected necessary param");
            return;
        }
        jSONObject.optString("businessId");
        jSONObject.optBoolean("showMessageCard", false);
        jSONObject.optString("sendMessageTitle");
        jSONObject.optString("sendMessagePath");
        jSONObject.optString("sendMessageImg");
        jSONObject.optString("headimgUrl");
        jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        jSONObject.optString("subTitle");
        ((C76633z0) C86312j.m106911c(C76633z0.class)).mo94232pz(MMApplicationContext.getContext(), optString3, (String) null, optString2, 2, (String) null, new g$$a(this));
    }
}
