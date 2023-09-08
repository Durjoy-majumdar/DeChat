package com.tencent.p014mm.plugin.wallet_core.model;

import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.wallet_core.model.b */
public class C72193b {

    /* renamed from: a */
    public long f209714a;

    /* renamed from: b */
    public long f209715b;

    /* renamed from: c */
    public long f209716c;

    /* renamed from: d */
    public int f209717d;

    /* renamed from: e */
    public int f209718e;

    /* renamed from: f */
    public long f209719f;

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.b$a */
    public static class C72194a {

        /* renamed from: a */
        public String f209720a;

        /* renamed from: b */
        public String f209721b;

        /* renamed from: c */
        public String f209722c;

        /* renamed from: d */
        public String f209723d;

        /* renamed from: e */
        public String f209724e;

        /* renamed from: a */
        public void mo99479a(JSONObject jSONObject) {
            this.f209720a = jSONObject.optString("url");
            this.f209721b = jSONObject.optString("wording");
            this.f209722c = jSONObject.optString("icon");
            this.f209723d = jSONObject.optString("btn_text");
            jSONObject.optInt("type");
            this.f209724e = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            jSONObject.optString("small_title");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.b$b */
    public static class C72195b {

        /* renamed from: a */
        public String f209725a;

        /* renamed from: b */
        public String f209726b;

        /* renamed from: c */
        public String f209727c;

        /* renamed from: d */
        public String f209728d;

        /* renamed from: e */
        public String f209729e;

        /* renamed from: f */
        public int f209730f;

        /* renamed from: a */
        public void mo99480a(JSONObject jSONObject) {
            jSONObject.optString("tinyapp_name");
            this.f209725a = jSONObject.optString("tinyapp_logo");
            this.f209726b = jSONObject.optString("tinyapp_desc");
            this.f209727c = jSONObject.optString("tinyapp_username");
            this.f209728d = jSONObject.optString("tinyapp_path");
            this.f209729e = jSONObject.optString("activity_tinyapp_btn_text");
            this.f209730f = jSONObject.optInt("tinyapp_version", 0);
        }
    }

    /* renamed from: a */
    public void mo99478a(JSONObject jSONObject) {
        this.f209714a = jSONObject.optLong(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID);
        this.f209715b = jSONObject.optLong("activity_type", 0);
        this.f209716c = jSONObject.optLong("award_id");
        this.f209717d = jSONObject.optInt("send_record_id");
        this.f209718e = jSONObject.optInt("user_record_id");
        this.f209719f = jSONObject.optLong("activity_mch_id", 0);
    }
}
