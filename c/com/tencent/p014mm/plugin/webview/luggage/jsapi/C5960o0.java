package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import j83.C9286a;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53096b;
import wc3.C15141z;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.o0 */
public class C5960o0 extends C5954n2 {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.o0$a */
    public class C5961a implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ C43620m2.C5947b f22195d;

        public C5961a(C43620m2.C5947b bVar) {
            this.f22195d = bVar;
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            if (i == (C5960o0.this.hashCode() & 65535)) {
                Log.m105924i("MicroMsg.JsApiJumpToBizProfile", "request jumpToBizProfile, resultCode = " + i2);
                if (i2 == -1) {
                    this.f22195d.mo6945a((String) null, (JSONObject) null);
                } else if (i2 == 0) {
                    this.f22195d.mo6945a("cancel", (JSONObject) null);
                } else if (i2 == 2 || i2 == 3) {
                    this.f22195d.mo6945a("check_fail", (JSONObject) null);
                } else {
                    this.f22195d.mo6945a("fail", (JSONObject) null);
                    Log.m105920e("MicroMsg.JsApiJumpToBizProfile", "unknown resultCode");
                }
            }
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "jumpToBizProfile";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("tousername");
            String optString2 = jSONObject.optString("extmsg");
            Log.m105919d("MicroMsg.JsApiJumpToBizProfile", "doJumpToBizProfile %s, %s", optString, optString2);
            String optString3 = jSONObject.optString("currentUrl");
            Intent intent = new Intent();
            intent.putExtra("toUserName", optString);
            intent.putExtra("extInfo", optString2);
            intent.putExtra("fromURL", optString3);
            intent.putExtra(FirebaseAnalytics.C113379b.SOURCE, 2);
            C5961a aVar = new C5961a(bVar);
            C15141z zVar = C9286a.f29044a;
            int hashCode = hashCode() & 65535;
            MMActivity mMActivity = (MMActivity) context;
            ((C67654r1) zVar).getClass();
            if (mMActivity != null) {
                intent.setClassName(mMActivity, "com.tencent.mm.ui.CheckCanSubscribeBizUI");
                mMActivity.mmStartActivityForResult(aVar, intent, hashCode);
            }
        } catch (JSONException unused) {
            Log.m105920e("MicroMsg.JsApiJumpToBizProfile", "parase json fail");
            bVar.mo6945a("fail", (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b.C53097a aVar) {
    }
}
