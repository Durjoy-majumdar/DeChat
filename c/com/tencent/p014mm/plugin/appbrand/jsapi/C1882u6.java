package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import lp3.C88631d;
import org.json.JSONObject;
import te3.aq4;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.u6 */
public final class C1882u6<T> implements C88631d.C88632b {

    /* renamed from: a */
    public final /* synthetic */ String f11724a;

    /* renamed from: b */
    public final /* synthetic */ C81925i2 f11725b;

    /* renamed from: c */
    public final /* synthetic */ int f11726c;

    /* renamed from: d */
    public final /* synthetic */ C1885v6 f11727d;

    public C1882u6(String str, C81925i2 i2Var, int i, C1885v6 v6Var) {
        this.f11724a = str;
        this.f11725b = i2Var;
        this.f11726c = i;
        this.f11727d = v6Var;
    }

    /* renamed from: a */
    public void mo1772a(Object obj) {
        aq4 aq4 = (aq4) obj;
        if (aq4 == null) {
            Log.m105920e("Luggage.WXA.FULLSDK.JsApiVerifyPlugin", this.f11724a + " null response");
            this.f11725b.mo109647a(this.f11726c, this.f11727d.mo115109j("fail:internal error"));
        } else if (aq4.BaseResponse.f135955d != 0) {
            Log.m105921e("Luggage.WXA.FULLSDK.JsApiVerifyPlugin", this.f11724a + " cgi failed, errCode = %d, errMsg = %s", Integer.valueOf(aq4.BaseResponse.f135955d), aq4.BaseResponse.f135956e);
            C81925i2 i2Var = this.f11725b;
            int i = this.f11726c;
            C1885v6 v6Var = this.f11727d;
            i2Var.mo109647a(i, v6Var.mo115109j("fail cgi fail Ret=" + aq4.BaseResponse.f135955d));
        } else {
            HashMap hashMap = new HashMap();
            try {
                Log.m105924i("Luggage.WXA.FULLSDK.JsApiVerifyPlugin", this.f11724a + " cgi ok, dataSize[" + aq4.f130730d.length() + ']');
                hashMap.put("data", new JSONObject(aq4.f130730d));
                this.f11725b.mo109647a(this.f11726c, this.f11727d.mo115112m("ok", hashMap));
            } catch (Exception e) {
                Log.m105920e("Luggage.WXA.FULLSDK.JsApiVerifyPlugin", this.f11724a + " cgi ok but get exception[" + e + ']');
                C81925i2 i2Var2 = this.f11725b;
                int i2 = this.f11726c;
                C1885v6 v6Var2 = this.f11727d;
                i2Var2.mo109647a(i2, v6Var2.mo115109j("fail:internal error " + e));
            }
        }
    }
}
