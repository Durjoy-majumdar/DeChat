package com.tencent.p014mm.plugin.webview.luggage;

import org.json.JSONObject;
import p828wa.C53099d;

/* renamed from: com.tencent.mm.plugin.webview.luggage.u */
public class C43677u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f118046d;

    /* renamed from: e */
    public final /* synthetic */ C43658n f118047e;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.u$a */
    public class C43678a extends C53099d {
        public C43678a() {
        }

        /* renamed from: a */
        public JSONObject mo14701a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("height", C43677u.this.f118046d);
            } catch (Exception unused) {
            }
            return jSONObject;
        }

        /* renamed from: b */
        public String mo14702b() {
            return "onGetKeyboardHeight";
        }
    }

    public C43677u(C43658n nVar, int i) {
        this.f118047e = nVar;
        this.f118046d = i;
    }

    public void run() {
        this.f118047e.f148259i.mo73815b(new C43678a());
    }
}
