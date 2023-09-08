package com.tencent.p014mm.plugin.lite.jsapi.comms;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ke3.C88144b;
import org.json.JSONException;
import org.json.JSONObject;
import p156gj.C87200o;
import p156gj.C87203t;
import p206nj.C117627q;
import q22.C12037c;
import qe3.C89625d;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.y */
public class C4804y extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        if (!jSONObject.has("url")) {
            this.f19815f.mo5689a("url is required");
            return;
        }
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        Intent intent = new Intent();
        try {
            String string = jSONObject.getString("url");
            if (!string.startsWith("http")) {
                sb.append(HttpWrapperBase.PROTOCAL_HTTP);
            }
            sb.append(string);
            int i = jSONObject.has("customizeStatusBarColor") ? jSONObject.getInt("customizeStatusBarColor") : 0;
            String string2 = jSONObject.has("statusBarStyle") ? jSONObject.getString("statusBarStyle") : null;
            if (jSONObject.has("appendDeviceInfo")) {
                z2 = jSONObject.getBoolean("appendDeviceInfo");
            }
            intent.putExtra("nextAnimIn", C12037c.m11739a(jSONObject));
            intent.putExtra("currentAnimOut", C12037c.m11740b(jSONObject));
            if (z2) {
                if (sb.toString().contains("?")) {
                    sb.append("&");
                } else {
                    sb.append("?");
                }
                try {
                    sb.append("deviceName=");
                    sb.append(C117627q.m165909b(C89625d.f257838d, "UTF-8"));
                } catch (Exception unused) {
                }
                sb.append("&imei=");
                sb.append("");
                try {
                    sb.append("&deviceBrand=");
                    sb.append(C117627q.m165909b(Build.BRAND, "UTF-8"));
                } catch (Exception unused2) {
                }
                try {
                    sb.append("&deviceModel=");
                    sb.append(C117627q.m165909b(C87203t.m108275k(), "UTF-8"));
                } catch (Exception unused3) {
                }
                sb.append("&from=");
                sb.append("liteApp#" + str);
                sb.append("&version=");
                sb.append(C89625d.f257841g);
                try {
                    sb.append("&lang=");
                    sb.append(C117627q.m165909b(LocaleUtil.getApplicationLanguage(), "UTF-8"));
                } catch (Exception unused4) {
                }
                try {
                    sb.append("&ostype=");
                    sb.append(C117627q.m165909b(C87200o.f252872e, "UTF-8"));
                } catch (Exception unused5) {
                }
                sb.append("&timeZone=");
                sb.append(Util.getTimeZoneOffset());
            }
            intent.putExtra("rawUrl", sb.toString());
            intent.putExtra("convertActivityFromTranslucent", false);
            intent.putExtra("customize_status_bar_color", i);
            intent.putExtra("status_bar_style", string2);
            intent.putExtra("prePublishId", "liteApp#1#1");
            intent.putExtra("KPublisherId", "liteApp#1#1");
            intent.addFlags(268435456);
            C88144b.m109791i(mo5676d(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        } catch (JSONException e) {
            Log.printErrStackTrace("LiteAppJsApiStartWebview", e, "parse json", new Object[0]);
            this.f19815f.mo5689a("exception");
        }
    }
}
