package com.tencent.p014mm.wallet_core.model;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.wallet_core.model.h */
public class C75118h {

    /* renamed from: a */
    public String f221048a = "";

    /* renamed from: b */
    public String f221049b = "";

    public C75118h(String str) {
        if (!Util.isNullOrNil(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f221048a = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                jSONObject.optString("body1");
                jSONObject.optString("body2");
                this.f221049b = jSONObject.optString("button");
            } catch (Exception e) {
                Log.m105921e("MicroMsg.CrtRtnWoding", "crtwoding error %s", e.getMessage());
            }
        }
    }

    public C75118h() {
    }
}
