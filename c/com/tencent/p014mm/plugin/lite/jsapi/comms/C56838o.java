package com.tencent.p014mm.plugin.lite.jsapi.comms;

import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di0.C86300q;
import di3.C86312j;
import fy3.C32226l;
import ht1.C60200t1;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.C64287ci1;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.o */
public class C56838o extends C56836m {

    /* renamed from: g */
    public static HashMap<String, C64287ci1> f162870g = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.o$a */
    public class C56839a implements C86300q {
        public C56839a(C56838o oVar) {
        }

        /* renamed from: a */
        public void mo63853a() {
        }

        /* renamed from: b */
        public void mo63854b(String str) {
            C64287ci1 ci12 = C56838o.f162870g.get(str);
            if (ci12 != null) {
                ((C60200t1) C86312j.m106911c(C60200t1.class)).Va0(MMApplicationContext.getContext(), ci12, (C32226l<? super List<String>, C13598b0>) null);
            }
        }

        /* renamed from: c */
        public void mo63855c() {
        }

        /* renamed from: d */
        public /* synthetic */ void mo63856d() {
        }

        /* renamed from: e */
        public void mo63857e() {
        }

        /* renamed from: f */
        public void mo63858f(boolean z) {
        }
    }

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        super.mo5693a(str, jSONObject, z);
    }

    /* renamed from: q */
    public HalfScreenConfig.ShareActionConfig mo80260q(JSONObject jSONObject) {
        if (!jSONObject.has("shareProductItem")) {
            return HalfScreenConfig.ShareActionConfig.f157976f;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("shareProductItem");
        C64287ci1 ci12 = new C64287ci1();
        ci12.f182500i = optJSONObject.optString("appId");
        ci12.f182501j = optJSONObject.optString("pagePath");
        ci12.f182502n = optJSONObject.optString("productId");
        ci12.f182503o = optJSONObject.optString("coverUrl");
        ci12.f182504p = optJSONObject.optString("productTitle");
        ci12.f182505q = optJSONObject.optInt("marketPrice");
        ci12.f182506r = optJSONObject.optInt("sellingPrice");
        ci12.f182496e = optJSONObject.optString("finderUsername");
        ci12.f182507s = optJSONObject.optString("platformHeadImg");
        ci12.f182508t = optJSONObject.optString("platformName");
        ci12.f182512x = optJSONObject.optString("ecSource");
        String valueOf = String.valueOf(optJSONObject.hashCode());
        f162870g.put(valueOf, ci12);
        return new HalfScreenConfig.ShareActionConfig(true, valueOf);
    }

    /* renamed from: r */
    public C86300q mo80261r() {
        return new C56839a(this);
    }
}
