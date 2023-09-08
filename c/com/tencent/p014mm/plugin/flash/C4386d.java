package com.tencent.p014mm.plugin.flash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import org.json.JSONObject;
import p206nj.C117627q;

/* renamed from: com.tencent.mm.plugin.flash.d */
public class C4386d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f19019d;

    /* renamed from: e */
    public final /* synthetic */ String f19020e;

    /* renamed from: f */
    public final /* synthetic */ FaceFlashProcessLayout f19021f;

    public C4386d(FaceFlashProcessLayout faceFlashProcessLayout, JSONObject jSONObject, String str) {
        this.f19021f = faceFlashProcessLayout;
        this.f19019d = jSONObject;
        this.f19020e = str;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/flash/FaceFlashProcessLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f19020e + "?customInfo=" + C117627q.m165909b(String.format("appid=%s;errcode=%d;identifyid=%s", new Object[]{this.f19019d.optString("key_app_id", ""), Integer.valueOf(this.f19019d.optInt("err_code", 0)), this.f19019d.optString("verify_result", "")}), "UTF-8"));
            C88144b.m109791i(this.f19021f.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        } catch (Exception e) {
            int i = FaceFlashProcessLayout.f18888q;
            Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e, "face start feedback webview exception", new Object[0]);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/flash/FaceFlashProcessLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
