package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import ke3.C88144b;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.w0 */
public class C5997w0 extends C43620m2 {
    /* renamed from: b */
    public String mo5382b() {
        return "openBizChat";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        try {
            String optString = new JSONObject(str).optString("username");
            if (Util.isNullOrNil(optString)) {
                bVar.mo6945a("param_err", (JSONObject) null);
                return;
            }
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(optString);
            if (z1Var == null || !z1Var.mo62916m3()) {
                bVar.mo6945a("not biz username", (JSONObject) null);
            } else if (!z1Var.mo62927s3()) {
                bVar.mo6945a("open_biz_chat", (JSONObject) null);
            } else {
                Intent intent = new Intent();
                intent.putExtra("Chat_User", optString);
                intent.putExtra("finish_direct", true);
                C88144b.m109801s(context, ".ui.chatting.ChattingUI", intent, (Bundle) null);
                bVar.mo6945a((String) null, (JSONObject) null);
            }
        } catch (JSONException unused) {
            Log.m105920e("MicroMsg.JsApiOpenBizChat", "parase json fail");
            bVar.mo6945a("fail", (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b.C53097a aVar) {
    }
}
