package com.tencent.p014mm.plugin.webview.luggage;

import org.json.JSONObject;
import p828wa.C53099d;

/* renamed from: com.tencent.mm.plugin.webview.luggage.v */
public class C43681v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C43658n f118051d;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.v$a */
    public class C43682a extends C53099d {
        public C43682a(C43681v vVar) {
        }

        /* renamed from: a */
        public JSONObject mo14701a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("height", 0);
            } catch (Exception unused) {
            }
            return jSONObject;
        }

        /* renamed from: b */
        public String mo14702b() {
            return "onGetKeyboardHeight";
        }
    }

    public C43681v(C43658n nVar) {
        this.f118051d = nVar;
    }

    public void run() {
        this.f118051d.f148259i.mo73815b(new C43682a(this));
    }
}
