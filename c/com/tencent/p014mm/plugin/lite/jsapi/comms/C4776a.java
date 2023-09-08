package com.tencent.p014mm.plugin.lite.jsapi.comms;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.model.gdpr.C1289a;
import com.tencent.p014mm.model.gdpr.C1290b;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.plugin.lite.p068ui.WxaLiteAppApiProxyUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import i22.C8846b;
import j20.C117292a;
import java.util.HashMap;
import k20.C9556a;
import org.json.JSONObject;
import p229rs.C13102b;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.a */
public class C4776a extends C4770c {

    /* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.a$a */
    public class C4777a implements C1290b {

        /* renamed from: a */
        public final /* synthetic */ String f19824a;

        /* renamed from: b */
        public final /* synthetic */ JSONObject f19825b;

        /* renamed from: c */
        public final /* synthetic */ boolean f19826c;

        public C4777a(String str, JSONObject jSONObject, boolean z) {
            this.f19824a = str;
            this.f19825b = jSONObject;
            this.f19826c = z;
        }

        /* renamed from: a */
        public void mo1216a(int i) {
            if (i == 0) {
                C4776a.this.mo5694q(this.f19824a, this.f19825b, this.f19826c);
                return;
            }
            Log.m105924i("LiteAppJsApiAddContact", "EU user failed");
            C4776a.this.f19815f.mo5689a("addContact:fail  EU user failed");
        }
    }

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Class cls = C13102b.class;
        Log.m105918d("LiteAppJsApiAddContact", "Invoke addContact");
        if (jSONObject == null) {
            this.f19815f.mo5689a("data is null");
        } else if (!((C13102b) C86312j.m106911c(cls)).cb0()) {
            mo5694q(str, jSONObject, z);
        } else {
            String optString = jSONObject.optString("username");
            if (!Util.isNullOrNil(optString)) {
                ((C13102b) C86312j.m106911c(cls)).mo12480mY(MMApplicationContext.getContext(), C1289a.BIZ, optString, new C4777a(str, jSONObject, z));
            } else {
                this.f19815f.mo5689a("username is null");
            }
        }
    }

    /* renamed from: e */
    public void mo5677e(int i) {
        if (i != -2) {
            if (i == -1) {
                this.f19815f.mo5689a("fail");
                return;
            } else if (i == 0) {
                this.f19815f.mo5689a("cancel");
                return;
            } else if (i != 1) {
                this.f19815f.mo5689a("fail");
                return;
            }
        }
        this.f19815f.mo5690b();
    }

    /* renamed from: q */
    public final void mo5694q(String str, JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString("webtype");
        String optString2 = jSONObject2.optString("username");
        String optString3 = jSONObject2.optString(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        String optString4 = jSONObject2.optString("scenenote");
        String optString5 = jSONObject2.optString("profileReportInfo");
        if (optString == null || optString.length() == 0 || optString2 == null || optString2.length() == 0) {
            Log.m105920e("LiteAppJsApiAddContact", "addContact fail, invalid arguments, webType = " + optString + ", username" + optString2);
            this.f19815f.mo5689a("addContact: fail");
            return;
        }
        int i = Util.getInt(optString, -1);
        if (i == -1) {
            Log.m105920e("LiteAppJsApiAddContact", "addContact fail, parseInt fail, str = " + optString);
            this.f19815f.mo5689a("addContact: fail");
            return;
        }
        Log.m105925i("LiteAppJsApiAddContact", "addContact scene = %s, sceneNote = %s", optString3, optString4);
        HashMap hashMap = new HashMap();
        hashMap.put("webtype", optString);
        hashMap.put("username", optString2);
        hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, optString3);
        hashMap.put("addscene", String.valueOf(i));
        hashMap.put("scenenote", optString4);
        hashMap.put("profileReportInfo", optString5);
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setClass(MMApplicationContext.getContext(), WxaLiteAppApiProxyUI.class);
        intent.putExtra("proxyui_action_code_key", 2);
        int i2 = C8846b.f28077e + 1;
        C8846b.f28077e = i2;
        C8846b.f28078f.put(Integer.valueOf(i2), this);
        intent.putExtra("callback_id", C8846b.f28077e);
        intent.putExtra("add_contact_params", hashMap);
        Context context = MMApplicationContext.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiAddContact", "addContact", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiAddContact", "addContact", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
