package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import m53.C10762h;
import te3.C50943qc2;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.z */
public final class C6586z implements C10762h<C50943qc2> {

    /* renamed from: a */
    public final /* synthetic */ C1256g<Bundle> f23828a;

    public C6586z(C1256g<Bundle> gVar) {
        this.f23828a = gVar;
    }

    /* renamed from: a */
    public void mo605a(int i, int i2, String str) {
        Log.m105924i("MicroMsg.JsApiGetWCCoinBalance", "[WeCoin] getWeCoinBalance onFailed,errorType:" + i + ",errorCode:" + i2 + ",msg:" + str);
        C1256g<Bundle> gVar = this.f23828a;
        if (gVar != null) {
            gVar.mo894a(null);
        }
    }

    public void onSuccess(Object obj) {
        C50943qc2 qc22 = (C50943qc2) obj;
        C87412m.m108594g(qc22, "data");
        Log.m105924i("MicroMsg.JsApiGetWCCoinBalance", "[WeCoin] getWeCoinBalance onSuccess,data:" + qc22.f140241d);
        Bundle bundle = new Bundle();
        bundle.putByteArray("responseKey", qc22.toByteArray());
        C1256g<Bundle> gVar = this.f23828a;
        if (gVar != null) {
            gVar.mo894a(bundle);
        }
    }
}
