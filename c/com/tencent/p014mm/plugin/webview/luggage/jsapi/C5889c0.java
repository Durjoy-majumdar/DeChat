package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiGetInstallState;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import ji3.C9457a;
import js0.C9512b;
import org.json.JSONArray;
import org.json.JSONObject;
import p828wa.C53096b;
import p828wa.C53138x;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.c0 */
public class C5889c0 extends C43620m2<C53138x> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.c0$a */
    public class C5890a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C53096b.C53097a f22114d;

        public C5890a(C5889c0 c0Var, C53096b.C53097a aVar) {
            this.f22114d = aVar;
        }

        public void run() {
            C53096b.C53097a aVar = this.f22114d;
            JSONObject jSONObject = aVar.f148190b.f129368c;
            Context context = ((C53138x) aVar.f148189a).f148196d;
            JSONArray optJSONArray = jSONObject.optJSONArray("packageName");
            String str = "null";
            if (optJSONArray != null) {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                int i = 0;
                boolean z = false;
                while (i < optJSONArray.length()) {
                    try {
                        String optString = optJSONArray.optString(i);
                        PackageInfo a = C9512b.m9207a(context, optString);
                        int i2 = a == null ? 0 : a.versionCode;
                        String str2 = a == null ? str : a.versionName;
                        JSONArray jSONArray = optJSONArray;
                        StringBuilder sb = new StringBuilder();
                        String str3 = str;
                        sb.append("getInstallState, packageName = ");
                        sb.append(optString);
                        sb.append(", version = ");
                        sb.append(i2);
                        sb.append(", versionName = ");
                        sb.append(str2);
                        Log.m105924i("MicroMsg.JsApiGetInstallState", sb.toString());
                        if (!z && i2 > 0) {
                            z = true;
                        }
                        jSONObject2.put(optString, i2);
                        jSONObject3.put(optString, str2);
                        i++;
                        optJSONArray = jSONArray;
                        str = str3;
                    } catch (Exception unused) {
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("result", jSONObject2.toString());
                hashMap.put("versionName", jSONObject3.toString());
                if (z) {
                    this.f22114d.mo73777b("get_install_state:yes", hashMap);
                } else {
                    this.f22114d.mo73778c("get_install_state:no", (JSONObject) null);
                }
            } else {
                String str4 = str;
                String optString2 = jSONObject.optString("packageName");
                if (Util.isNullOrNil(optString2)) {
                    Log.m105924i("MicroMsg.JsApiGetInstallState", "packageName is null or nil");
                    this.f22114d.mo73778c("get_install_state:no_null_packageName", (JSONObject) null);
                    return;
                }
                PackageInfo a2 = C9512b.m9207a(context, optString2);
                int i3 = a2 == null ? 0 : a2.versionCode;
                String str5 = a2 == null ? str4 : a2.versionName;
                Log.m105924i("MicroMsg.JsApiGetInstallState", "doGetInstallState, packageName = " + optString2 + ", version = " + i3 + ", versionName = " + str5);
                if (a2 == null) {
                    this.f22114d.mo73778c("get_install_state:no", (JSONObject) null);
                    return;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("versionName", str5);
                C53096b.C53097a aVar2 = this.f22114d;
                aVar2.mo73777b("get_install_state:yes_" + i3, hashMap2);
            }
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return JsApiGetInstallState.NAME;
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53138x>.a aVar) {
        Log.m105924i("MicroMsg.JsApiGetInstallState", "invokeInOwn");
        C9457a.m9137a(new C5890a(this, aVar));
    }
}
