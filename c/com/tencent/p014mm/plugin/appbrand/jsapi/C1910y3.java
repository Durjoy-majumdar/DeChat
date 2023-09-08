package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.y3 */
public class C1910y3 implements C1256g<Bundle> {

    /* renamed from: d */
    public final /* synthetic */ C81879g f11763d;

    /* renamed from: e */
    public final /* synthetic */ int f11764e;

    /* renamed from: f */
    public final /* synthetic */ C1575a4 f11765f;

    public C1910y3(C1575a4 a4Var, C81879g gVar, int i) {
        this.f11765f = a4Var;
        this.f11763d = gVar;
        this.f11764e = i;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (bundle != null) {
            String string = bundle.getString("errMsg", "");
            Log.m105925i("MicroMsg.JsApiOfflineUserBindQuery", "onCallback，result ：%s", string);
            this.f11763d.mo109647a(this.f11764e, this.f11765f.mo115109j(string));
            return;
        }
        Log.m105924i("MicroMsg.JsApiOfflineUserBindQuery", "onCallback，data == null");
        this.f11763d.mo109647a(this.f11764e, this.f11765f.mo115109j("fail"));
    }
}
