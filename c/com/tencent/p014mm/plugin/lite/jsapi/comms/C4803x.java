package com.tencent.p014mm.plugin.lite.jsapi.comms;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import ke3.C88144b;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.x */
public class C4803x extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        String optString = jSONObject.optString("url");
        String optString2 = jSONObject.optString("path");
        if (optString.isEmpty()) {
            this.f19815f.mo5689a("");
            return;
        }
        String optString3 = jSONObject.optString("thumbUrl");
        String optString4 = jSONObject.optString("srcId");
        Intent intent = new Intent();
        intent.putExtra("Ksnsupload_link", optString);
        intent.putExtra("Ksnsupload_contentattribute", 0);
        intent.putExtra("Ksnsupload_source", 1);
        intent.putExtra("Ksnsupload_type", 1);
        intent.putExtra("need_result", true);
        if (!(this instanceof C4780b0)) {
            intent.putExtra("ksnsis_liteapp", true);
            intent.putExtra("KsnsUpload_LiteAppId", str);
            intent.putExtra("KsnsUpload_LiteAppPath", optString2);
            intent.putExtra("KsnsUpload_LiteAppQuery", jSONObject.optString(SearchIntents.EXTRA_QUERY));
        }
        intent.putExtra("Ksnsupload_title", jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE));
        if (optString4 != null && optString4.length() > 0) {
            intent.putExtra("Ksnsupload_appid", optString4);
        }
        if (optString3.startsWith(HttpWrapperBase.PROTOCAL_HTTP) || optString3.startsWith(HttpWrapperBase.PROTOCAL_HTTPS)) {
            intent.putExtra("Ksnsupload_imgurl", optString3);
        }
        C88144b.m109791i(MMApplicationContext.getContext(), "sns", ".ui.SnsUploadUI", intent, (Bundle) null);
    }
}
