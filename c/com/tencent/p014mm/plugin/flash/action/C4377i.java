package com.tencent.p014mm.plugin.flash.action;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.facedetectaction.p046ui.C2292b;
import com.tencent.p014mm.sdk.platformtools.Log;
import ke3.C88144b;
import org.json.JSONObject;
import p206nj.C117627q;

/* renamed from: com.tencent.mm.plugin.flash.action.i */
public class C4377i implements C2292b.C2293a {

    /* renamed from: a */
    public final /* synthetic */ JSONObject f19004a;

    /* renamed from: b */
    public final /* synthetic */ String f19005b;

    /* renamed from: c */
    public final /* synthetic */ FaceFlashActionProcessLayout f19006c;

    public C4377i(FaceFlashActionProcessLayout faceFlashActionProcessLayout, JSONObject jSONObject, String str) {
        this.f19006c = faceFlashActionProcessLayout;
        this.f19004a = jSONObject;
        this.f19005b = str;
    }

    /* renamed from: a */
    public void mo2185a(String str) {
        int i = FaceFlashActionProcessLayout.f18966t;
        Log.m105924i("MicroMsg.FaceFlashActionProcessLayout", "click feedback url ");
        try {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f19005b + "?customInfo=" + C117627q.m165909b(String.format("appid=%s;errcode=%d;identifyid=%s", new Object[]{this.f19004a.optString("key_app_id", ""), Integer.valueOf(this.f19004a.optInt("err_code", 0)), this.f19004a.optString("verify_result", "")}), "UTF-8"));
            C88144b.m109791i(this.f19006c.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        } catch (Exception e) {
            int i2 = FaceFlashActionProcessLayout.f18966t;
            Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e, "face start feedback webview exception", new Object[0]);
        }
    }
}
