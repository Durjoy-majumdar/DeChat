package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Result;
import kotlin.ResultKt;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.h4 */
public final class C1699h4 extends C87413o implements C32226l<String, String> {

    /* renamed from: d */
    public final /* synthetic */ C1678f4 f11400d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f11401e;

    /* renamed from: f */
    public final /* synthetic */ C82554k f11402f;

    /* renamed from: g */
    public final /* synthetic */ int f11403g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1699h4(C1678f4 f4Var, JSONObject jSONObject, C82554k kVar, int i) {
        super(1);
        this.f11400d = f4Var;
        this.f11401e = jSONObject;
        this.f11402f = kVar;
        this.f11403g = i;
    }

    public Object invoke(Object obj) {
        Object obj2;
        String str = (String) obj;
        C87412m.m108594g(str, "paramsKey");
        JSONObject jSONObject = this.f11401e;
        try {
            Result.Companion companion = Result.Companion;
            obj2 = Result.m168114constructorimpl(jSONObject.getString(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m168120isFailureimpl(obj2)) {
            obj2 = null;
        }
        String str2 = (String) obj2;
        if (str2 != null) {
            return str2;
        }
        C1678f4 f4Var = this.f11400d;
        C82554k kVar = this.f11402f;
        int i = this.f11403g;
        f4Var.getClass();
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("errno", 101);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
        }
        kVar.mo109647a(i, f4Var.mo115115p("fail:jsapi invalid request data", jSONObject2));
        return null;
    }
}
