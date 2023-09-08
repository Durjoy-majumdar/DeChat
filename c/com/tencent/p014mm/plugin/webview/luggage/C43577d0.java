package com.tencent.p014mm.plugin.webview.luggage;

import android.view.accessibility.AccessibilityManager;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53099d;

/* renamed from: com.tencent.mm.plugin.webview.luggage.d0 */
public class C43577d0 implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C43658n f117814a;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.d0$a */
    public class C43578a extends C53099d {

        /* renamed from: a */
        public final /* synthetic */ boolean f117815a;

        public C43578a(C43577d0 d0Var, boolean z) {
            this.f117815a = z;
        }

        /* renamed from: a */
        public JSONObject mo14701a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("isAccessibilityMode", this.f117815a);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        /* renamed from: b */
        public String mo14702b() {
            return "onAccessibilityStateChange";
        }
    }

    public C43577d0(C43658n nVar) {
        this.f117814a = nVar;
    }

    public void onAccessibilityStateChanged(boolean z) {
        this.f117814a.f148259i.mo73815b(new C43578a(this, z));
    }
}
