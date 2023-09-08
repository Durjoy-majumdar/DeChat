package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.ipc.C55465d;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.f */
public class C55480f extends C82297d {
    public static final int CTRL_INDEX = 968;
    public static final String NAME = "openChannelsLive";

    /* renamed from: B */
    public String mo77014B(String str, int i) {
        C87412m.m108594g(str, "originErrMsg");
        Log.m105924i("MicroMsg.AppBrand.JsApiOpenChannelsLive", "overrideErrMsg, errCode: " + i);
        if (-1000 == i || -1001 == i || -1002 == i || -1003 == i) {
            return str;
        }
        String format = String.format("fail:pre check fail, errCode=%d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        C87412m.m108593f(format, "format(this, *args)");
        Log.m105924i("MicroMsg.AppBrand.JsApiOpenChannelsLive", "overrideErrMsg, newErrMsg: " + format);
        return format;
    }

    /* renamed from: D */
    public boolean mo77015D(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "extInfoJsonObj");
        try {
            jSONObject.put("feedID", jSONObject.optString("feedId"));
            jSONObject.put("nonceID", jSONObject.optString("nonceId"));
            jSONObject.put("showRecommend", jSONObject.optBoolean("showRecommend", true));
            jSONObject.put("commentScene", 15);
            return true;
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrand.JsApiOpenChannelsLive", "preProcessExtInfo, fail since " + e);
            return false;
        }
    }

    /* renamed from: E */
    public Intent mo77016E(Context context) {
        C87412m.m108594g(context, "context");
        return C55465d.m63113a(context);
    }

    /* renamed from: y */
    public String mo77017y() {
        return "openFinderLive";
    }
}
