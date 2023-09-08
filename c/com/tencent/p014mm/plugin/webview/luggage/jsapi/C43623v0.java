package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import ob0.C47350c;
import org.json.JSONObject;
import p828wa.C53096b;
import te3.C49713hj2;
import te3.C49717hk2;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.v0 */
public class C43623v0 implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C53096b.C53097a f117872a;

    /* renamed from: b */
    public final /* synthetic */ int f117873b;

    public C43623v0(C85510u0 u0Var, C53096b.C53097a aVar, int i) {
        this.f117872a = aVar;
        this.f117873b = i;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        C49713hj2 hj22;
        Log.m105925i("MicroMsg.JsApiLogin", "errType = %d, errCode = %d ,errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i != 0 || i2 != 0) {
            this.f117872a.mo73778c("fail", (JSONObject) null);
        } else if (this.f117873b == 2) {
            Log.m105918d("MicroMsg.JsApiLogin", "press reject button");
            this.f117872a.mo73778c("fail", (JSONObject) null);
        } else {
            C49717hk2 hk22 = (C49717hk2) cVar.f127056b.f127083a;
            if (hk22 == null || (hj22 = hk22.f134699d) == null) {
                this.f117872a.mo73778c("fail", (JSONObject) null);
                return;
            }
            int i3 = hj22.f134688d;
            String str2 = hj22.f134689e;
            Log.m105925i("MicroMsg.JsApiLogin", "jsErrcode = %d", Integer.valueOf(i3));
            if (i3 == 0) {
                String str3 = hk22.f134700e;
                new HashMap().put("code", str3);
                this.f117872a.mo73776a();
                Log.m105919d("MicroMsg.JsApiLogin", "resp data code [%s]", str3);
                return;
            }
            this.f117872a.mo73778c("fail", (JSONObject) null);
            Log.m105921e("MicroMsg.JsApiLogin", "errMsg = %s", str2);
        }
    }
}
