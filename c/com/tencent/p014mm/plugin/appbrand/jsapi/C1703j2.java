package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Intent;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import kr0.C88267e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p225rc.g$$e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.j2 */
public class C1703j2 implements g$$e {

    /* renamed from: a */
    public final /* synthetic */ C88267e f11407a;

    /* renamed from: b */
    public final /* synthetic */ int f11408b;

    /* renamed from: c */
    public final /* synthetic */ C1706k2 f11409c;

    public C1703j2(C1706k2 k2Var, C88267e eVar, int i) {
        this.f11409c = k2Var;
        this.f11407a = eVar;
        this.f11408b = i;
    }

    /* renamed from: a */
    public void mo1626a(int i, Intent intent) {
        char c = 65535;
        if (i == -1) {
            String stringExtra = intent.getStringExtra("k_select_group");
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(stringExtra)) {
                stringExtra.getClass();
                switch (stringExtra.hashCode()) {
                    case -1901805651:
                        if (stringExtra.equals("invisible")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -977423767:
                        if (stringExtra.equals("public")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -314497661:
                        if (stringExtra.equals("private")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 466743410:
                        if (stringExtra.equals("visible")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                    case 3:
                        String stringExtra2 = intent.getStringExtra("Klabel_name_list");
                        String stringExtra3 = intent.getStringExtra("Kother_user_name_list");
                        hashMap.put("group", stringExtra);
                        try {
                            if (!TextUtils.isEmpty(stringExtra2)) {
                                hashMap.put("labels", new JSONObject(stringExtra2));
                            }
                            if (!TextUtils.isEmpty(stringExtra3)) {
                                hashMap.put("userList", new JSONArray(stringExtra3));
                            }
                            this.f11407a.mo109647a(this.f11408b, this.f11409c.mo115112m("ok", hashMap));
                            return;
                        } catch (JSONException e) {
                            Log.printErrStackTrace("MicroMsg.JsApiChooseShareGroup", e, "", new Object[0]);
                            this.f11407a.mo109647a(this.f11408b, this.f11409c.mo115109j("cancel"));
                            return;
                        }
                    case 1:
                    case 2:
                        hashMap.put("group", stringExtra);
                        this.f11407a.mo109647a(this.f11408b, this.f11409c.mo115112m("ok", hashMap));
                        return;
                    default:
                        this.f11407a.mo109647a(this.f11408b, this.f11409c.mo115109j("cancel"));
                        return;
                }
            } else {
                this.f11407a.mo109647a(this.f11408b, this.f11409c.mo115109j("cancel"));
            }
        } else {
            this.f11407a.mo109647a(this.f11408b, this.f11409c.mo115109j("fail"));
        }
    }
}
