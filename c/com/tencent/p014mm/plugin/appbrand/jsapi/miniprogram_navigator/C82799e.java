package com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiNavigateToDevMiniProgram;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import gy3.C87412m;
import org.json.JSONObject;
import p284zb.C91635f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.e */
public final class C82799e extends C82801g {
    public static final int CTRL_INDEX = 967;
    public static final String NAME = "launchDevMiniProgram";

    /* renamed from: t */
    public boolean mo1769t() {
        return false;
    }

    /* renamed from: w */
    public boolean mo115042w(C91635f fVar, JSONObject jSONObject, int i) {
        IPCVoid iPCVoid;
        C87412m.m108594g(fVar, "service");
        C87412m.m108594g(jSONObject, "data");
        String optString = jSONObject.optString("appId");
        C82793b a = C82793b.m101536a(jSONObject.optString("envVersion"), C82793b.RELEASE);
        String optString2 = jSONObject.optString("downloadURL");
        String optString3 = jSONObject.optString("checkSumMd5");
        String optString4 = jSONObject.optString("extoptions");
        if (C82793b.DEVELOP == a) {
            if (!(optString3 == null || optString3.length() == 0)) {
                JsApiNavigateToDevMiniProgram.DevPkgInfo devPkgInfo = new JsApiNavigateToDevMiniProgram.DevPkgInfo();
                devPkgInfo.f242142d = optString;
                devPkgInfo.f242143e = optString2;
                devPkgInfo.f242144f = optString3;
                devPkgInfo.f242145g = optString4;
                try {
                    iPCVoid = (IPCVoid) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, devPkgInfo, JsApiNavigateToDevMiniProgram.C82786a.class);
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.AppBrand.JsApiLaunchDevMiniProgram", "invoke IPCFlushDevPkg, parcel:" + devPkgInfo + ", exception:" + e);
                    iPCVoid = null;
                }
                if (!(iPCVoid != null)) {
                    fVar.mo109647a(i, "fail save packageInfo failed");
                    return false;
                }
            }
        }
        return true;
    }
}
