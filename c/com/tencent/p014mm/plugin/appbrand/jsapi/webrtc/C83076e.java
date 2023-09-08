package com.tencent.p014mm.plugin.appbrand.jsapi.webrtc;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.webrtc.C83081k;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import java.util.HashMap;
import org.json.JSONObject;
import p156gj.C87203t;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.e */
public final class C83076e extends C82016a0<C82381f> {
    public static final int CTRL_INDEX = 1205;
    public static final String NAME = "isSupportSR";

    /* renamed from: g */
    public static String f242832g = "";

    /* renamed from: h */
    public static String f242833h = "";

    /* renamed from: i */
    public static String f242834i = "";

    /* renamed from: j */
    public static String f242835j = "";

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        C83081k.C83082a aVar = C83081k.f242843u;
        f242832g = aVar.mo115332b();
        f242834i = aVar.mo115331a();
        if (C87203t.m108279o()) {
            f242833h = "5cbdf5691046122ffd776971f3f2c327";
        } else {
            f242833h = "10c74c8fd7af5879063796155fe5d264";
        }
        f242835j = "1c200d3e9055b847fc718206e9974ec5";
        if (!C86013q1.m106450k(f242832g)) {
            HashMap hashMap = new HashMap();
            hashMap.put("isSupport", Boolean.FALSE);
            hashMap.put("errCode", 1003);
            C13598b0 b0Var = C13598b0.f38549a;
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            hashMap.put("errno", 0);
            String o = mo115114o("ok", hashMap);
            C87412m.m108593f(o, "makeReturnJson(AppBrandE…Constants.SR_NOT_EXIST)})");
            return o;
        } else if (!C86013q1.m106456q(f242832g).equals(f242833h)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("isSupport", Boolean.FALSE);
            hashMap2.put("errCode", 1004);
            C13598b0 b0Var2 = C13598b0.f38549a;
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            hashMap2.put("errno", 0);
            String o2 = mo115114o("ok", hashMap2);
            C87412m.m108593f(o2, "makeReturnJson(AppBrandE…Constants.SO_MD5_ERROR)})");
            return o2;
        } else if (!C86013q1.m106450k(f242834i)) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("isSupport", Boolean.FALSE);
            hashMap3.put("errCode", 1005);
            C13598b0 b0Var3 = C13598b0.f38549a;
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            hashMap3.put("errno", 0);
            String o3 = mo115114o("ok", hashMap3);
            C87412m.m108593f(o3, "makeReturnJson(AppBrandE…stants.MODEL_NOT_EXIST)})");
            return o3;
        } else if (!C86013q1.m106456q(f242834i).equals(f242835j)) {
            HashMap hashMap4 = new HashMap();
            hashMap4.put("isSupport", Boolean.FALSE);
            hashMap4.put("errCode", 1006);
            C13598b0 b0Var4 = C13598b0.f38549a;
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            hashMap4.put("errno", 0);
            String o4 = mo115114o("ok", hashMap4);
            C87412m.m108593f(o4, "makeReturnJson(AppBrandE…stants.MODEL_MD5_ERROR)})");
            return o4;
        } else {
            HashMap hashMap5 = new HashMap();
            hashMap5.put("isSupport", Boolean.TRUE);
            hashMap5.put("errCode", 1007);
            C13598b0 b0Var5 = C13598b0.f38549a;
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            hashMap5.put("errno", 0);
            String o5 = mo115114o("ok", hashMap5);
            C87412m.m108593f(o5, "makeReturnJson(AppBrandE…ants.DEVICE_SUPPORT_SR)})");
            return o5;
        }
    }
}
