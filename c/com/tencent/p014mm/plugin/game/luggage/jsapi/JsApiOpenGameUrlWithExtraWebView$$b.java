package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.plugin.game.luggage.jsapi.JsApiOpenGameUrlWithExtraWebView;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.JsApiOpenGameUrlWithExtraWebView$$b */
public final /* synthetic */ class JsApiOpenGameUrlWithExtraWebView$$b implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ JsApiOpenGameUrlWithExtraWebView f19214d;

    /* renamed from: e */
    public final /* synthetic */ C53096b.C53097a f19215e;

    /* renamed from: f */
    public final /* synthetic */ Uri f19216f;

    public /* synthetic */ JsApiOpenGameUrlWithExtraWebView$$b(JsApiOpenGameUrlWithExtraWebView jsApiOpenGameUrlWithExtraWebView, C53096b.C53097a aVar, Uri uri) {
        this.f19214d = jsApiOpenGameUrlWithExtraWebView;
        this.f19215e = aVar;
        this.f19216f = uri;
    }

    /* renamed from: a */
    public final void mo894a(Object obj) {
        JsApiOpenGameUrlWithExtraWebView jsApiOpenGameUrlWithExtraWebView = this.f19214d;
        C53096b.C53097a aVar = this.f19215e;
        Uri uri = this.f19216f;
        Bundle bundle = (Bundle) obj;
        if (bundle != null) {
            jsApiOpenGameUrlWithExtraWebView.getClass();
            String string = bundle.getString("appId");
            String string2 = bundle.getString("path");
            String query = uri.getQuery();
            Bundle bundle2 = new Bundle();
            bundle2.putString("appId", string);
            bundle2.putString("path", string2);
            bundle2.putString(SearchIntents.EXTRA_QUERY, query);
            JSONObject optJSONObject = aVar.f148190b.f129368c.optJSONObject("jumpInfo");
            JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject("halfScreen") : null;
            if (optJSONObject2 != null) {
                bundle2.putBoolean("isHalfScreen", true);
                bundle2.putBoolean("transparent", true);
                try {
                    bundle2.putDouble("heightPercent", optJSONObject2.getDouble("screenHeightPercent"));
                } catch (JSONException unused) {
                }
            }
            XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new JsApiOpenGameUrlWithExtraWebView.OpenLiteAppData(bundle2), JsApiOpenGameUrlWithExtraWebView$$f.class, new JsApiOpenGameUrlWithExtraWebView$$c(jsApiOpenGameUrlWithExtraWebView, aVar));
            return;
        }
        jsApiOpenGameUrlWithExtraWebView.mo5386f(aVar);
    }
}
