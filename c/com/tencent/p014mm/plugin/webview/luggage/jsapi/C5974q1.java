package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.q1 */
public class C5974q1 implements C75018a.C75025e {

    /* renamed from: a */
    public final /* synthetic */ C43620m2.C5947b f22209a;

    public C5974q1(C5984s1 s1Var, C43620m2.C5947b bVar) {
        this.f22209a = bVar;
    }

    /* renamed from: a */
    public void mo6958a() {
    }

    public void onHide() {
        Log.m105918d("MicroMsg.JsApiSendAppMessage", "onHide");
        this.f22209a.mo6945a((String) null, (JSONObject) null);
    }

    public void onShow() {
    }
}
