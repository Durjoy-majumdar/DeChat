package com.tencent.p014mm.plugin.lite.jsapi.comms;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.plugin.lite.p068ui.WxaLiteAppApiProxyUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import ht1.C60179k4;
import i22.C8846b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k20.C9556a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qy2.C12935w;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.j */
public class C4788j extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105918d("LiteAppJsApiGetMsgProofItems", "invoke getMsgProofItems");
        if (jSONObject == null) {
            this.f19815f.mo5689a("fail: data is null");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("chat_username", jSONObject.optString("chat_username"));
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setClass(MMApplicationContext.getContext(), WxaLiteAppApiProxyUI.class);
        intent.putExtra("proxyui_action_code_key", 10);
        intent.putExtra("get_msg_proof_items_params", hashMap);
        int i = C8846b.f28093u + 1;
        C8846b.f28093u = i;
        C8846b.f28094v.put(Integer.valueOf(i), this);
        intent.putExtra("callback_id", C8846b.f28093u);
        Context context = MMApplicationContext.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiGetMsgProofItems", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiGetMsgProofItems", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: i */
    public void mo5681i(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        Class cls = C60179k4.class;
        if (i2 != -1) {
            this.f19815f.mo5689a("select chat record : cancel");
        } else if (intent2 != null) {
            long[] longArrayExtra = intent2.getLongArrayExtra("k_outside_expose_proof_item_list");
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            if (longArrayExtra != null) {
                for (long b002 : longArrayExtra) {
                    arrayList.add(((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(b002));
                }
            }
            int size = arrayList.size();
            String[] strArr = new String[size];
            String[] strArr2 = new String[size];
            String[] strArr3 = new String[size];
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            String[] strArr4 = new String[size];
            int i3 = 0;
            while (i3 < size) {
                C72963f4 f4Var = (C72963f4) arrayList.get(i3);
                strArr[i3] = String.valueOf(f4Var.mo108774y2());
                if (intent2.getBooleanExtra("k_is_group_chat", z)) {
                    if (f4Var.mo100994f4()) {
                        strArr2[i3] = C75604z3.m90849u(f4Var.mo108775z2());
                    } else {
                        strArr2[i3] = C75604z3.m90849u(f4Var.getContent());
                    }
                    strArr3[i3] = C75604z3.m90847s(f4Var.getContent());
                } else {
                    if (f4Var.mo100994f4()) {
                        strArr2[i3] = f4Var.mo108775z2();
                    } else {
                        strArr2[i3] = f4Var.getContent();
                    }
                    if (C72996z1.m85825X4(f4Var.mo108768t())) {
                        strArr3[i3] = ((C60179k4) C86312j.m106911c(cls)).mo78770n(f4Var.mo108768t());
                    } else if (C72996z1.m85799F5(f4Var.mo108768t())) {
                        strArr3[i3] = ((C12935w) C86312j.m106911c(C12935w.class)).mo12485n(f4Var.mo108768t());
                    } else {
                        strArr3[i3] = f4Var.mo108768t();
                    }
                }
                if (f4Var.mo108769t2() == 1) {
                    if (C72996z1.m85825X4(f4Var.mo108768t())) {
                        strArr3[i3] = ((C60179k4) C86312j.m106911c(cls)).mo78768d3(f4Var.mo108768t());
                    } else {
                        strArr3[i3] = C75592q0.m90789s();
                    }
                }
                if (strArr2[i3] == null) {
                    strArr2[i3] = "";
                }
                if (strArr3[i3] == null) {
                    strArr3[i3] = "";
                }
                if (f4Var.mo101020w3()) {
                    iArr[i3] = 49;
                } else {
                    iArr[i3] = f4Var.getType();
                }
                String[] strArr5 = strArr;
                iArr2[i3] = (int) (f4Var.getCreateTime() / 1000);
                if (f4Var.mo100993e4() || f4Var.mo100979R3() || f4Var.mo100994f4()) {
                    Map<String, String> parseXml = XmlParser.parseXml(f4Var.f230724G, "msgsource", (String) null);
                    if (!(parseXml == null || parseXml.get(".msgsource.signature") == null)) {
                        strArr4[i3] = parseXml.get(".msgsource.signature");
                        if (parseXml.get(".msgsource.realcreatetime") != null) {
                            iArr2[i3] = Util.getInt(parseXml.get(".msgsource.realcreatetime"), (int) (f4Var.getCreateTime() / 1000));
                        }
                    }
                } else {
                    strArr4[i3] = "";
                }
                i3++;
                intent2 = intent;
                strArr = strArr5;
                z = false;
            }
            String[] strArr6 = strArr;
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (int i4 = 0; i4 < size; i4++) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("newMsgId", strArr6[i4]);
                    jSONObject2.put("content", strArr2[i4]);
                    jSONObject2.put("sender", strArr3[i4]);
                    jSONObject2.put("msgType", iArr[i4]);
                    jSONObject2.put("msgTime", iArr2[i4]);
                    jSONObject2.put("msgSignature", strArr4[i4]);
                    jSONArray.put(jSONObject2);
                } catch (JSONException e) {
                    Log.m105920e("LiteAppJsApiGetMsgProofItems", "GetMsgProofItems exception " + e.getMessage());
                }
            }
            try {
                jSONObject.put("result", jSONArray);
            } catch (JSONException e2) {
                Log.m105920e("LiteAppJsApiGetMsgProofItems", "GetMsgProofItems exception " + e2.getMessage());
            }
            this.f19815f.mo5692d(jSONObject, false);
        } else {
            this.f19815f.mo5689a("select chat record : fail");
        }
    }
}
