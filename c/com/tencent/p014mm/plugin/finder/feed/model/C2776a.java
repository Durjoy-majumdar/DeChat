package com.tencent.p014mm.plugin.finder.feed.model;

import c30.C104289g;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import o40.C61926c;
import org.json.JSONArray;
import org.json.JSONObject;
import tf1.C13891a;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.a */
public final class C2776a extends C13891a {

    /* renamed from: d */
    public final long f13948d;

    /* renamed from: e */
    public String f13949e;

    /* renamed from: f */
    public String f13950f = "";

    /* renamed from: g */
    public String f13951g = "";

    /* renamed from: h */
    public long f13952h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2776a(long j, C104289g gVar) {
        super(j);
        C87412m.m108594g(gVar, "data");
        this.f13948d = j;
        this.f13949e = gVar.optString("url");
        C87412m.m108593f(gVar.optString("uxinfo"), "data.optString(Constants…r.AdInfoKeys.KEY_UX_INFO)");
        this.f13952h = gVar.optLong("aid");
        C87412m.m108593f(gVar.optString("ad_posid"), "data.optString(Constants…er.AdInfoKeys.KEY_POS_ID)");
        Log.m105924i("Finder.AdMutualCache", "id :" + j + " aid:" + this.f13952h);
        try {
            JSONArray jSONArray = new JSONArray(gVar.optString("crt_info"));
            if (jSONArray.length() > 0) {
                JSONObject jSONObject = jSONArray.getJSONObject(0);
                jSONObject.optString("image_url");
                JSONObject optJSONObject = jSONObject.optJSONObject("card_info");
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("description");
                    C87412m.m108593f(optString, "optString(KEY_DESCRIPTION)");
                    this.f13950f = optString;
                    String optString2 = optJSONObject.optString("caption");
                    C87412m.m108593f(optString2, "optString(KEY_CAPTION)");
                    this.f13951g = optString2;
                }
            }
        } catch (Exception unused) {
        }
    }

    public String toString() {
        return "id:" + C61926c.m72691p(this.f13948d) + " url:" + this.f13949e + " description:" + this.f13950f + " caption:" + this.f13951g + " isExposed:" + false;
    }
}
