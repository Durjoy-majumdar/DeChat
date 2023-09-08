package com.tencent.p014mm.plugin.appbrand.jsapi.contact;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$g;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import if0.C46238a;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.C64468jf3;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.g */
public final class C55496g implements MMFragmentActivity$$g {

    /* renamed from: a */
    public final /* synthetic */ HashMap<String, Object> f158079a;

    /* renamed from: b */
    public final /* synthetic */ C81925i2 f158080b;

    /* renamed from: c */
    public final /* synthetic */ int f158081c;

    /* renamed from: d */
    public final /* synthetic */ C68614h f158082d;

    public C55496g(HashMap<String, Object> hashMap, C81925i2 i2Var, int i, C68614h hVar) {
        this.f158079a = hashMap;
        this.f158080b = i2Var;
        this.f158081c = i;
        this.f158082d = hVar;
    }

    /* renamed from: a */
    public final void mo5702a(int i, Intent intent) {
        byte[] byteArrayExtra;
        int i2 = -1;
        if (i == -1) {
            i2 = 0;
        }
        this.f158079a.put("errCode", Integer.valueOf(i2));
        this.f158079a.put("action", Integer.valueOf(i2));
        C64468jf3 jf32 = new C64468jf3();
        if (!(intent == null || (byteArrayExtra = intent.getByteArrayExtra("KSelectUserList")) == null)) {
            try {
                jf32.parseFrom(byteArrayExtra);
            } catch (Throwable unused) {
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            C46238a.f124644a.mo71655d(jSONObject, "datalist", jf32.f183793d, false);
        } catch (Exception unused2) {
        }
        Log.m105924i("MicroMsg.JsApiMultiChooseWeChatChatroom", "contactListJson: " + jSONObject);
        HashMap<String, Object> hashMap = this.f158079a;
        JSONArray optJSONArray = jSONObject.optJSONArray("datalist");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        hashMap.put("datalist", optJSONArray);
        if (i2 == 0) {
            this.f158080b.mo109647a(this.f158081c, this.f158082d.mo115112m("ok", this.f158079a));
        } else {
            this.f158080b.mo109647a(this.f158081c, this.f158082d.mo115112m("fail", this.f158079a));
        }
    }
}
