package com.tencent.p014mm.plugin.appbrand.jsapi.profile;

import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Result;
import kotlin.ResultKt;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.d */
public final class C82891d extends C82892e {
    private static final int CTRL_INDEX = 1203;
    private static final String NAME = "openWeComUserProfile";

    /* renamed from: w */
    public AppBrandProxyUIProcessTask.ProcessRequest mo115149w(C82381f fVar, JSONObject jSONObject, int i) {
        Object obj;
        C87412m.m108594g(fVar, "env");
        C87412m.m108594g(jSONObject, "data");
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m168114constructorimpl(jSONObject.getString("dataUrl"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m168120isFailureimpl(obj)) {
            obj = null;
        }
        String str = (String) obj;
        if (str != null) {
            return new UrlJumpToProfileRequest(str);
        }
        Log.m105920e("MicroMsg.AppBrand.OpenWeComUserProfile", "invoke, dataUrl is null");
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("errno", 101);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
        }
        fVar.mo109647a(i, mo115115p("fail:jsapi invalid request data", jSONObject2));
        return null;
    }
}
