package com.unionpay;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.unionpay.l */
public final class C116524l implements C116515a0 {

    /* renamed from: a */
    public final /* synthetic */ UPPayWapActivity f349491a;

    public C116524l(UPPayWapActivity uPPayWapActivity) {
        this.f349491a = uPPayWapActivity;
    }

    /* renamed from: a */
    public final void mo180512a(String str, C116517b0 b0Var) {
        try {
            this.f349491a.f349478n = b0Var;
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("packageName");
            String string2 = jSONObject.getString("type");
            String optString = jSONObject.optString("openParams");
            String optString2 = jSONObject.optString("tn");
            if ("0".equals(string2)) {
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(optString2)) {
                    Intent intent = new Intent();
                    intent.setClassName(string, "com.unionpay.uppay.PayActivity");
                    intent.putExtra("paydata", optString2);
                    int i = UPPayWapActivity.f349470o;
                    intent.putExtra("ex_mode", this.f349491a.f349475h);
                    this.f349491a.startActivityForResult(intent, 1);
                } else if (b0Var != null) {
                    b0Var.mo180515a(UPPayWapActivity.m164324H7("1", "Parameter error", (String) null));
                }
            } else if ("2".equals(string2)) {
                if (!TextUtils.isEmpty(optString)) {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(Uri.parse(optString));
                    if (!TextUtils.isEmpty(string)) {
                        intent2.setPackage(string);
                    }
                    this.f349491a.startActivityForResult(intent2, 1);
                } else if (b0Var != null) {
                    b0Var.mo180515a(UPPayWapActivity.m164324H7("1", "Parameter error", (String) null));
                }
            } else if (b0Var != null) {
                b0Var.mo180515a(UPPayWapActivity.m164324H7("1", "Parameter error", (String) null));
            }
        } catch (Exception e) {
            if (b0Var != null) {
                b0Var.mo180515a(UPPayWapActivity.m164324H7("1", e.getMessage(), (String) null));
            }
        }
    }
}
