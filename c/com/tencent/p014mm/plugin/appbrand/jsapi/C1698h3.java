package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiGetWeAppNewTipsInfo;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.h3 */
public final class C1698h3<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f11397d;

    /* renamed from: e */
    public final /* synthetic */ int f11398e;

    /* renamed from: f */
    public final /* synthetic */ JsApiGetWeAppNewTipsInfo f11399f;

    public C1698h3(C81925i2 i2Var, int i, JsApiGetWeAppNewTipsInfo jsApiGetWeAppNewTipsInfo) {
        this.f11397d = i2Var;
        this.f11398e = i;
        this.f11399f = jsApiGetWeAppNewTipsInfo;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        JsApiGetWeAppNewTipsInfo.NewTipInfo newTipInfo = (JsApiGetWeAppNewTipsInfo.NewTipInfo) obj;
        if (newTipInfo == null) {
            C81925i2 i2Var = this.f11397d;
            int i = this.f11398e;
            JsApiGetWeAppNewTipsInfo jsApiGetWeAppNewTipsInfo = this.f11399f;
            jsApiGetWeAppNewTipsInfo.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 107, "fail:jsapi returns empty data");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errno", 107);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            i2Var.mo109647a(i, jsApiGetWeAppNewTipsInfo.mo115115p("fail:jsapi returns empty data", jSONObject));
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("showType", Integer.valueOf(newTipInfo.f10930d));
        hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, newTipInfo.f10931e);
        hashMap.put("iconUrl", newTipInfo.f10932f);
        C81925i2 i2Var2 = this.f11397d;
        int i2 = this.f11398e;
        JsApiGetWeAppNewTipsInfo jsApiGetWeAppNewTipsInfo2 = this.f11399f;
        jsApiGetWeAppNewTipsInfo2.getClass();
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
        }
        hashMap.put("errno", 0);
        i2Var2.mo109647a(i2, jsApiGetWeAppNewTipsInfo2.mo115114o("ok", hashMap));
    }
}
