package com.tencent.p014mm.plugin.lite.api;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p1005ma.C88718b;
import p193la.C10479a;
import p193la.C10480b;

/* renamed from: com.tencent.mm.plugin.lite.api.c */
public abstract class C4770c extends C10479a implements C80883e<Bundle, IPCCallbackData> {

    /* renamed from: e */
    public C10480b f19814e = null;

    /* renamed from: f */
    public C4771a f19815f = null;

    /* renamed from: com.tencent.mm.plugin.lite.api.c$a */
    public static class C4771a {

        /* renamed from: a */
        public C10480b f19816a;

        /* renamed from: b */
        public C1256g<IPCCallbackData> f19817b = null;

        /* renamed from: a */
        public void mo5689a(String str) {
            C10480b bVar = this.f19816a;
            if (bVar != null) {
                bVar.mo10783a(str, (JSONObject) null, false);
                return;
            }
            IPCCallbackData iPCCallbackData = new IPCCallbackData();
            iPCCallbackData.f19810d = false;
            iPCCallbackData.f19811e = false;
            iPCCallbackData.f19812f = str;
            this.f19817b.mo894a(iPCCallbackData);
        }

        /* renamed from: b */
        public void mo5690b() {
            mo5692d(new JSONObject(), false);
        }

        /* renamed from: c */
        public void mo5691c(Map<String, Object> map) {
            mo5692d(new JSONObject(map), false);
        }

        /* renamed from: d */
        public void mo5692d(JSONObject jSONObject, boolean z) {
            JSONObject jSONObject2 = jSONObject;
            C10480b bVar = this.f19816a;
            if (bVar == null) {
                IPCCallbackData iPCCallbackData = new IPCCallbackData();
                iPCCallbackData.f19810d = true;
                iPCCallbackData.f19811e = z;
                if (jSONObject2 != null) {
                    iPCCallbackData.f19813g = jSONObject.toString();
                }
                this.f19817b.mo894a(iPCCallbackData);
            } else if (bVar.f31717e >= 0) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("result", true);
                    jSONObject3.put("errMsg", "");
                    if (jSONObject2 != null) {
                        jSONObject3.put("data", jSONObject2);
                    } else {
                        jSONObject3.put("data", new JSONObject());
                    }
                } catch (JSONException e) {
                    C88718b.m110680b("WxaLiteApp.LiteAppJsApiCallback", e.toString(), new Object[0]);
                }
                LiteAppCenter.jsApiCallback(bVar.f31714b, bVar.f31715c, bVar.f31716d, bVar.f31717e, jSONObject3.toString(), z, bVar.f31718f);
            }
        }
    }

    /* renamed from: b */
    public void mo5674b(String str, JSONObject jSONObject, boolean z) {
        C4771a aVar = new C4771a();
        this.f19815f = aVar;
        aVar.f19816a = this.f19814e;
        mo5693a(str, jSONObject, z);
    }

    /* renamed from: c */
    public void mo5675c(C10480b bVar) {
        this.f19814e = bVar;
    }

    /* renamed from: d */
    public Context mo5676d() {
        LiteAppCenter.ILiteAppUICallback iLiteAppUICallback = LiteAppCenter.mUICallback.get(Integer.valueOf(this.f19814e.f31713a));
        if (iLiteAppUICallback != null) {
            if (iLiteAppUICallback instanceof Activity) {
                return (Context) iLiteAppUICallback;
            }
            if (iLiteAppUICallback instanceof Fragment) {
                return ((Fragment) iLiteAppUICallback).getActivity();
            }
        }
        return MMApplicationContext.getContext();
    }

    /* renamed from: e */
    public void mo5677e(int i) {
    }

    /* renamed from: f */
    public void mo5678f(int i, int i2, Intent intent) {
    }

    /* renamed from: g */
    public void mo5679g(int i, int i2, Intent intent) {
    }

    /* renamed from: h */
    public void mo5680h(int i, int i2, Intent intent) {
    }

    /* renamed from: i */
    public void mo5681i(int i, int i2, Intent intent) {
    }

    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        C4771a aVar = new C4771a();
        this.f19815f = aVar;
        aVar.f19817b = gVar;
        try {
            mo5693a(bundle.getString("appId"), new JSONObject(bundle.getString("data")), bundle.getBoolean("isFromView"));
        } catch (JSONException e) {
            Log.printErrStackTrace("LiteAppJsApi", e, "", new Object[0]);
        }
    }

    /* renamed from: j */
    public void mo5682j(int i, int i2, Intent intent) {
    }

    /* renamed from: k */
    public void mo5683k(boolean z) {
    }

    /* renamed from: l */
    public void mo5684l(boolean z) {
    }

    /* renamed from: m */
    public void mo5685m() {
    }

    /* renamed from: n */
    public void mo5686n(int i, int i2, Intent intent) {
    }

    /* renamed from: o */
    public void mo5687o(int i, int i2, Intent intent) {
    }

    /* renamed from: p */
    public void mo5688p(int i, int i2, Intent intent) {
    }
}
