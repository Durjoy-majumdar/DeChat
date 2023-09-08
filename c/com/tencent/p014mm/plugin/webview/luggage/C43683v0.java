package com.tencent.p014mm.plugin.webview.luggage;

import a93.C0019d;
import java.util.HashSet;
import org.json.JSONObject;
import p828wa.C53099d;

/* renamed from: com.tencent.mm.plugin.webview.luggage.v0 */
public class C43683v0 implements C0019d.C0020a {

    /* renamed from: a */
    public final /* synthetic */ C43687x0 f118052a;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.v0$a */
    public class C43684a extends C53099d {

        /* renamed from: a */
        public final /* synthetic */ JSONObject f118053a;

        public C43684a(C43683v0 v0Var, JSONObject jSONObject) {
            this.f118053a = jSONObject;
        }

        /* renamed from: a */
        public JSONObject mo14701a() {
            return this.f118053a;
        }

        /* renamed from: b */
        public String mo14702b() {
            return "menu:share:appmessage";
        }
    }

    public C43683v0(C43687x0 x0Var) {
        this.f118052a = x0Var;
    }

    /* renamed from: a */
    public void mo22a(String str, JSONObject jSONObject) {
        ((HashSet) this.f118052a.f118056a.f117924N.f118066e).add("sendAppMessage");
        this.f118052a.f118056a.f148259i.mo73815b(new C43684a(this, jSONObject));
    }
}
