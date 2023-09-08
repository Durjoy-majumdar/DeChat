package com.unionpay;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.unionpay.utils.UPUtils;
import hx3.C87601b;
import ix3.C76375b;
import ix3.C76377f;
import org.json.JSONObject;

/* renamed from: com.unionpay.c */
public final class C75274c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f221402d;

    public C75274c(Context context) {
        this.f221402d = context;
    }

    public final void run() {
        try {
            C87601b bVar = new C87601b(C75273a.f221400f, C76375b.m91800b(this.f221402d));
            bVar.mo122060a();
            String str = bVar.f253698a;
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                String b = C76377f.m91807b(jSONObject, "sign");
                int a = C76375b.m91799a(C75273a.f221398d);
                String str2 = new String(Base64.decode(jSONObject.getString("configs"), 2));
                String str3 = "";
                String str4 = jSONObject.has("sePayConf") ? new String(Base64.decode(jSONObject.getString("sePayConf"), 2)) : str3;
                if (!TextUtils.isEmpty(str4)) {
                    str3 = str4;
                }
                String g = C76375b.m91805g(UPUtils.m90295b(str2 + str3 + C75273a.f221395a));
                String forConfig = UPUtils.forConfig(a, b);
                if (!TextUtils.isEmpty(forConfig) && forConfig.equals(g)) {
                    UPUtils.m90296c(this.f221402d, str, "configs");
                    UPUtils.m90296c(this.f221402d, C75273a.f221398d, "mode");
                    UPUtils.m90296c(this.f221402d, C75273a.f221395a, "or");
                }
            }
        } catch (Exception unused) {
        }
    }
}
