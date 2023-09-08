package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Map;
import p225rc.g$$f;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.g4 */
public final class C1695g4 implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ C82554k f11388a;

    /* renamed from: b */
    public final /* synthetic */ int f11389b;

    /* renamed from: c */
    public final /* synthetic */ C1678f4 f11390c;

    public C1695g4(C82554k kVar, int i, C1678f4 f4Var) {
        this.f11388a = kVar;
        this.f11389b = i;
        this.f11390c = f4Var;
    }

    /* renamed from: b */
    public final boolean mo1596b(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        StringBuilder sb = new StringBuilder();
        sb.append("onResult, requestCode: ");
        sb.append(i3);
        sb.append(", resultCode: ");
        sb.append(i4);
        sb.append(", resultData exists: ");
        sb.append(intent2 != null);
        Log.m105924i("MicroMsg.AppBrand.JsApiOpenCTID", sb.toString());
        if (C1678f4.f11356g != i3) {
            return false;
        }
        if (-1 != i4) {
            C82554k kVar = this.f11388a;
            int i5 = this.f11389b;
            C1678f4 f4Var = this.f11390c;
            f4Var.getClass();
            Map f = C90364q0.m113147f(new C13604l("resultCode", "C0405001"), new C13604l("resultDesc", "数据处理异常"));
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            if (!(f instanceof HashMap)) {
                f = new HashMap(f);
            }
            f.put("errno", 0);
            kVar.mo109647a(i5, f4Var.mo115114o("ok", f));
            return true;
        } else if (intent2 == null) {
            C1678f4 f4Var2 = this.f11390c;
            C82554k kVar2 = this.f11388a;
            int i6 = this.f11389b;
            f4Var2.getClass();
            Map f2 = C90364q0.m113147f(new C13604l("resultCode", "C0412003"), new C13604l("resultDesc", "用户已取消"));
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            if (!(f2 instanceof HashMap)) {
                f2 = new HashMap(f2);
            }
            f2.put("errno", 0);
            kVar2.mo109647a(i6, f4Var2.mo115114o("ok", f2));
            return true;
        } else {
            Map f3 = C90364q0.m113147f(new C13604l("resultCode", intent2.getStringExtra("resultCode")), new C13604l("resultDesc", intent2.getStringExtra("resultDesc")), new C13604l("idCardAuthData", intent2.getStringExtra("idCardAuthData")), new C13604l("certPwdData", intent2.getStringExtra("certPwdData")));
            Log.m105924i("MicroMsg.AppBrand.JsApiOpenCTID", "onResult, returnData: " + f3);
            C82554k kVar3 = this.f11388a;
            int i7 = this.f11389b;
            C1678f4 f4Var3 = this.f11390c;
            f4Var3.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            if (!(f3 instanceof HashMap)) {
                f3 = new HashMap(f3);
            }
            f3.put("errno", 0);
            kVar3.mo109647a(i7, f4Var3.mo115114o("ok", f3));
            return true;
        }
    }
}
