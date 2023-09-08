package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.msgsubscription.JsApiRequestSubscribeMessage;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p141db.C86219d;
import p399xu.C23114b;
import rd0.C22222c;
import rx3.C13598b0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.l2 */
public final class C6510l2 extends C15053a implements MMActivity.C6739d {

    /* renamed from: d */
    public static final C6510l2 f23634d = new C6510l2();

    /* renamed from: e */
    public static final int f23635e = C86219d.CTRL_INDEX;

    /* renamed from: f */
    public static final String f23636f = JsApiRequestSubscribeMessage.NAME;

    /* renamed from: g */
    public static WeakReference<C13855j> f23637g;

    /* renamed from: h */
    public static C13851h1 f23638h;

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Log.m105924i("MicroMsg.JsApiRequestSubscribeMessage", "alvinluo requestSubscribeMessage");
        f23637g = new WeakReference<>(jVar);
        f23638h = h1Var;
        String str = (String) h1Var.f38983a.get("appId");
        String str2 = (String) h1Var.f38983a.get("extInfo");
        String str3 = (String) h1Var.f38983a.get("templateIdList");
        ArrayList arrayList = new ArrayList();
        if (str3 != null) {
            JSONArray jSONArray = new JSONArray(str3);
            int i = 0;
            int length = jSONArray.length();
            while (true) {
                if (i >= length) {
                    break;
                }
                Object obj = jSONArray.get(i);
                if (!(obj instanceof String)) {
                    f23634d.mo7503e(h1Var, 10004, ":fail templateId invalid", (Map<String, ? extends Object>) null);
                    break;
                }
                arrayList.add(obj);
                i++;
            }
        }
        if (arrayList.isEmpty()) {
            mo7503e(h1Var, 10001, ":fail templateIdList empty", (Map<String, ? extends Object>) null);
        } else {
            Context context = jVar.f38998a;
            if (context instanceof MMActivity) {
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((MMActivity) context).mmSetOnActivityResultCallback(this);
            }
            Bundle bundle = new Bundle();
            bundle.putString("key_extra_info", str2);
            bundle.putBoolean("key_need_result", true);
            bundle.putStringArrayList("key_template_id_list", arrayList);
            C22222c Uf = ((C23114b) C86312j.m106911c(C23114b.class)).mo36102Uf();
            if (Uf != null) {
                Context context2 = jVar.f38998a;
                if (str == null) {
                    str = "";
                }
                Uf.mo35375p(context2, 2, 213, str, bundle);
            }
        }
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23635e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23636f;
    }

    /* renamed from: e */
    public final void mo7503e(C13851h1 h1Var, int i, String str, Map<String, ? extends Object> map) {
        C13855j jVar;
        C13849g gVar;
        if (h1Var != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("err_code", Integer.valueOf(i));
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            boolean z = true;
            if (i == 0) {
                if (str.length() <= 0) {
                    z = false;
                }
                if (!z) {
                    str = "ok";
                }
            } else {
                if (str.length() <= 0) {
                    z = false;
                }
                if (!z) {
                    str = "unknown error";
                }
            }
            WeakReference<C13855j> weakReference = f23637g;
            if (!(weakReference == null || (jVar = weakReference.get()) == null || (gVar = jVar.f39001d) == null)) {
                String str2 = h1Var.f38990c;
                gVar.mo10774a(str2, h1Var.f38996i + XVFSFile.PATH_SEPARATOR_CHAR + str, linkedHashMap);
            }
            f23637g = null;
        }
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        StringBuilder sb = new StringBuilder();
        sb.append("alvinluo requestSubscribeMessage onActivityResult requestCode: ");
        sb.append(i);
        sb.append(", resultCode: ");
        sb.append(i2);
        sb.append(", data: ");
        sb.append(intent == null);
        Log.m105918d("MicroMsg.JsApiRequestSubscribeMessage", sb.toString());
        if (intent != null && i == 213) {
            ArrayList<SubscribeMsgTmpItem> parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_result_data");
            int intExtra = intent.getIntExtra("key_result_err_code", -1);
            String stringExtra = intent.getStringExtra("key_result_err_msg");
            if (stringExtra == null) {
                stringExtra = "unknown error";
            }
            String stringExtra2 = intent.getStringExtra("key_result_ext_data");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            Object[] objArr = new Object[4];
            objArr[0] = Integer.valueOf(intExtra);
            objArr[1] = stringExtra;
            objArr[2] = parcelableArrayListExtra != null ? Integer.valueOf(parcelableArrayListExtra.size()) : null;
            objArr[3] = stringExtra2;
            Log.m105925i("MicroMsg.JsApiRequestSubscribeMessage", "alvinluo requestSubscribeMessage onActivityResult errCode: %s, errMsg: %s, template size: %s, extData: %s", objArr);
            JSONObject jSONObject = new JSONObject();
            if (parcelableArrayListExtra != null) {
                for (SubscribeMsgTmpItem subscribeMsgTmpItem : parcelableArrayListExtra) {
                    String str = subscribeMsgTmpItem.f49021f;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", subscribeMsgTmpItem.f49029q);
                    C13598b0 b0Var = C13598b0.f38549a;
                    jSONObject.put(str, jSONObject2.toString());
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("templatesDetail", jSONObject.toString());
            hashMap.put("ext_info", stringExtra2);
            mo7503e(f23638h, intExtra, stringExtra, hashMap);
        }
    }
}
