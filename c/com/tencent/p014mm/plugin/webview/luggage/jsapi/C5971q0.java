package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.os.Bundle;
import com.tencent.p014mm.autogen.events.Launch3RdAppEvent;
import com.tencent.p014mm.opensdk.constants.Build;
import com.tencent.p014mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.pluginsdk.model.app.C6647c;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.FileReaderHelper;
import di3.C86312j;
import j83.C9286a;
import org.json.JSONObject;
import p763ym.C79138l;
import p823sg.C90193h;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.q0 */
public class C5971q0 extends C5954n2<C43658n> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.q0$a */
    public class C5972a implements C44580q1 {

        /* renamed from: a */
        public final /* synthetic */ C43620m2.C5947b f22206a;

        public C5972a(C5971q0 q0Var, C43620m2.C5947b bVar) {
            this.f22206a = bVar;
        }

        /* renamed from: a */
        public void mo1579a(boolean z, boolean z2) {
            this.f22206a.mo6945a((String) null, (JSONObject) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.q0$b */
    public class C5973b implements C44580q1 {

        /* renamed from: a */
        public final /* synthetic */ String f22207a;

        /* renamed from: b */
        public final /* synthetic */ C43620m2.C5947b f22208b;

        public C5973b(C5971q0 q0Var, String str, C43620m2.C5947b bVar) {
            this.f22207a = str;
            this.f22208b = bVar;
        }

        /* renamed from: a */
        public void mo1579a(boolean z, boolean z2) {
            Log.m105924i("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp launchSuccess:" + z + " pkg:" + this.f22207a);
            if (z) {
                this.f22208b.mo6945a((String) null, (JSONObject) null);
            } else {
                this.f22208b.mo6945a("fail", (JSONObject) null);
            }
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "launch3rdApp";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Signature signature;
        String f;
        Log.m105924i("MicroMsg.JsApiLaunch3RdApp", "invokeInMM");
        JSONObject e = C6013c.m5893e(str);
        if (e == null) {
            bVar.mo6945a("invalid_data", (JSONObject) null);
            return;
        }
        int optInt = e.optInt("type");
        String optString = e.optString("appID");
        if (optInt == 0) {
            String optString2 = e.optString("extInfo");
            Log.m105925i("MicroMsg.JsApiLaunch3RdApp", "appid:[%s], extinfo:[%s]", optString, optString2);
            if (Util.isNullOrNil(optString)) {
                Log.m105920e("MicroMsg.JsApiLaunch3RdApp", "appid is null or nil");
                bVar.mo6945a("fail", (JSONObject) null);
            } else if (!C9286a.f29045b.mo93140D5(MMApplicationContext.getContext(), optString)) {
                Log.m105921e("MicroMsg.JsApiLaunch3RdApp", "app is not installed, appid:[%s]", optString);
                bVar.mo6945a("fail", (JSONObject) null);
            } else {
                WXAppExtendObject wXAppExtendObject = new WXAppExtendObject();
                wXAppExtendObject.extInfo = optString2;
                WXMediaMessage wXMediaMessage = new WXMediaMessage(wXAppExtendObject);
                wXMediaMessage.sdkVer = Build.SDK_INT;
                wXMediaMessage.messageExt = optString2;
                Launch3RdAppEvent launch3RdAppEvent = new Launch3RdAppEvent();
                Launch3RdAppEvent.C1089a aVar = launch3RdAppEvent.f9317d;
                aVar.f9319a = wXMediaMessage;
                aVar.f9320b = optString;
                aVar.f9322d = context;
                aVar.f9323e = new C5972a(this, bVar);
                launch3RdAppEvent.publish();
            }
        } else if (optInt == 1) {
            String optString3 = e.optString("signature");
            String optString4 = e.optString("packageName");
            String optString5 = e.optString("param");
            Log.m105925i("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp, signature:[%s], packageName:[%s], param:[%s]", optString3, optString4, optString5);
            if (Util.isNullOrNil(optString3) || Util.isNullOrNil(optString4)) {
                Log.m105920e("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp invalid_args");
                bVar.mo6945a("invalid_args", (JSONObject) null);
            } else if (!C72688j0.m85020f(context, optString4)) {
                Log.m105920e("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp not_install");
                if (Util.isAffectedByPackageVisibility(MMApplicationContext.getContext())) {
                    Log.m105928w("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp isAffectedByPackageVisibility");
                    mo6957f(context, optString4, e, optString5, bVar);
                    return;
                }
                bVar.mo6945a(FileReaderHelper.EXPLICIT_DOWNLOAD_SCENE_NOT_INSTALL, (JSONObject) null);
            } else {
                Signature[] a = C6647c.m6936a(context, optString4);
                if (a == null || (signature = a[0]) == null || (f = C90193h.m112878f(signature.toByteArray())) == null || !f.equalsIgnoreCase(optString3)) {
                    Log.m105920e("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp signature_mismatch");
                    bVar.mo6945a("signature_mismatch", (JSONObject) null);
                    return;
                }
                mo6957f(context, optString4, e, optString5, bVar);
            }
        } else {
            bVar.mo6945a("invalid_type", (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
    }

    /* renamed from: f */
    public final void mo6957f(Context context, String str, JSONObject jSONObject, String str2, C43620m2.C5947b bVar) {
        String optString = jSONObject.optString("currentUrl");
        String optString2 = jSONObject.optString("preVerifyAppId");
        try {
            Intent launchIntentForPackage = MMApplicationContext.getContext().getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage != null) {
                Log.m105924i("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp  intent != null, pkg:" + str);
                Bundle bundle = new Bundle();
                C72688j0.m85023i(bundle, str2);
                launchIntentForPackage.putExtras(bundle);
                launchIntentForPackage.addFlags(268435456);
                Bundle bundle2 = new Bundle();
                bundle2.putString("current_page_url", optString);
                bundle2.putString("current_page_appid", optString2);
                ((C79138l) C86312j.m106911c(C79138l.class)).Dm0(context, launchIntentForPackage, (String) null, new C5973b(this, str, bVar), bundle2);
                return;
            }
            Log.m105928w("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp  intent == null, pkg:" + str);
            bVar.mo6945a("fail", (JSONObject) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp getLaunchIntentForPackage, %s", e.getMessage());
        }
    }
}
