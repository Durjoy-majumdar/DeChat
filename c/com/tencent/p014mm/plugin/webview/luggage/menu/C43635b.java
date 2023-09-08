package com.tencent.p014mm.plugin.webview.luggage.menu;

import com.tencent.p014mm.plugin.webview.luggage.menu.C43638d;
import org.json.JSONObject;
import p828wa.C53099d;

/* renamed from: com.tencent.mm.plugin.webview.luggage.menu.b */
public class C43635b extends C53099d {

    /* renamed from: a */
    public final /* synthetic */ boolean f117894a;

    public C43635b(C43638d.C43639a aVar, boolean z) {
        this.f117894a = z;
    }

    /* renamed from: a */
    public JSONObject mo14701a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", this.f117894a);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    public String mo14702b() {
        return "onAddShortcutStatus";
    }
}
