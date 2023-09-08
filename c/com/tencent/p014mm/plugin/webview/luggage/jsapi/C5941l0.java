package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.plugin.webview.modeltools.C6085v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.l0 */
public class C5941l0 extends C5954n2<C43658n> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.l0$a */
    public class C5942a implements C6085v.C6087b {

        /* renamed from: a */
        public final /* synthetic */ C53096b.C53097a f22175a;

        /* renamed from: b */
        public final /* synthetic */ JSONObject f22176b;

        public C5942a(C53096b.C53097a aVar, JSONObject jSONObject) {
            this.f22175a = aVar;
            this.f22176b = jSONObject;
        }

        /* renamed from: a */
        public void mo6943a() {
            C5941l0 l0Var = C5941l0.this;
            C53096b.C53097a aVar = this.f22175a;
            JSONObject jSONObject = this.f22176b;
            l0Var.getClass();
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCString(jSONObject.toString()), C5943b.class, new C5946m0(l0Var, aVar, jSONObject));
        }

        /* renamed from: b */
        public void mo6944b() {
            C5941l0 l0Var = C5941l0.this;
            C53096b.C53097a aVar = this.f22175a;
            JSONObject jSONObject = this.f22176b;
            l0Var.getClass();
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCString(jSONObject.toString()), C5943b.class, new C5946m0(l0Var, aVar, jSONObject));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.l0$b */
    public static class C5943b implements C80883e<IPCString, Bundle> {
        private C5943b() {
        }

        public void invoke(Object obj, C1256g gVar) {
            JSONObject e = C6013c.m5893e(((IPCString) obj).f10315d);
            Bundle bundle = new Bundle();
            if (e == null) {
                gVar.mo894a(bundle);
            }
            String optString = e.optString("current");
            JSONArray optJSONArray = e.optJSONArray("urls");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray == null || optJSONArray.length() == 0) {
                Log.m105920e("MicroMsg.JsApiImagePreview", "fail, urls is null");
                gVar.mo894a(bundle);
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString2 = optJSONArray.optString(i);
                if (Util.isNullOrNil(optString2) || optString2.equalsIgnoreCase("null")) {
                    Log.m105921e("MicroMsg.JsApiImagePreview", "null url, i = %d", Integer.valueOf(i));
                } else {
                    if (Util.nullAsNil(optString2).startsWith("weixin://resourceid/")) {
                        WebViewJSSDKFileItem b = C6080m.Ax0().mo7010b(optString2);
                        if (b != null) {
                            optString2 = b.f283024g;
                        }
                    }
                    arrayList.add(optString2);
                }
            }
            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            if (Util.isNullOrNil(optString)) {
                optString = strArr[0];
            } else if (optString.startsWith("weixin://resourceid/")) {
                WebViewJSSDKFileItem b2 = C6080m.Ax0().mo7010b(optString);
                optString = b2 != null ? b2.f283024g : "";
            }
            bundle.putString("nowUrl", optString);
            bundle.putStringArray("urlList", strArr);
            gVar.mo894a(bundle);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "imagePreview";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
        JSONObject jSONObject = aVar.f148190b.f129368c;
        if (jSONObject == null) {
            aVar.mo73778c("invalid_params", (JSONObject) null);
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("urls");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            Log.m105920e("MicroMsg.JsApiImagePreview", "fail, urls is null");
            aVar.mo73778c("invalid_url", (JSONObject) null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("current", jSONObject.optString("thumbUrl"));
        C6085v.m5953d(hashMap, ((C43658n) aVar.f148189a).f117947q, new C5942a(aVar, jSONObject));
    }
}
