package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import a93.C0026g;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.c2 */
public class C5892c2 implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f22115d;

    /* renamed from: e */
    public final /* synthetic */ Context f22116e;

    /* renamed from: f */
    public final /* synthetic */ String f22117f;

    /* renamed from: g */
    public final /* synthetic */ C43620m2.C5947b f22118g;

    public C5892c2(C5883b2 b2Var, JSONObject jSONObject, Context context, String str, C43620m2.C5947b bVar) {
        this.f22115d = jSONObject;
        this.f22116e = context;
        this.f22117f = str;
        this.f22118g = bVar;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        boolean z = true;
        if (i == 1) {
            String optString = this.f22115d.optString("appid");
            if (i2 != -1) {
                z = false;
            } else {
                String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
                if (stringExtra == null || stringExtra.length() == 0) {
                    Log.m105920e("MicroMsg.JsApiShareCustomContent", "mmOnActivityResult fail, toUser is null");
                    return;
                } else if (Util.isNullOrNil(stringExtra)) {
                    Log.m105920e("MicroMsg.JsApiShareCustomContent", "toUser is null");
                    return;
                } else {
                    C0026g.m15a(this.f22116e, optString, stringExtra, this.f22115d, intent.getStringExtra("custom_send_text"));
                }
            }
            C40314g.m43484c(MMApplicationContext.getContext(), 20, 2001, 2, z ? 48 : 56, 0, this.f22117f);
            this.f22118g.mo6945a((String) null, (JSONObject) null);
        }
    }
}
