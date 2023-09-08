package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import org.json.JSONObject;
import p773yy.C79168k;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.d2 */
public final class C1669d2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f11342d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f11343e;

    /* renamed from: f */
    public final /* synthetic */ C1256g<Bundle> f11344f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1669d2(JSONObject jSONObject, Bundle bundle, C1256g<Bundle> gVar) {
        super(0);
        this.f11342d = jSONObject;
        this.f11343e = bundle;
        this.f11344f = gVar;
    }

    public Object invoke() {
        JSONObject vd02 = ((C79168k) C86312j.m106911c(C79168k.class)).vd0(this.f11342d);
        this.f11343e.putString("resJo", vd02.toString());
        Log.m105924i("MicroMsg.IPCCheckStrangerRequest", "invoke: resultData:" + vd02);
        this.f11344f.mo894a(this.f11343e);
        return C13598b0.f38549a;
    }
}
