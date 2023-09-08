package com.tencent.p014mm.plugin.webview.luggage;

import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import p828wa.C53099d;
import p828wa.C53133t;

/* renamed from: com.tencent.mm.plugin.webview.luggage.j */
public class C43601j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C53133t f117851d;

    /* renamed from: e */
    public final /* synthetic */ String f117852e;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.j$a */
    public class C43602a extends C53099d {
        public C43602a() {
        }

        /* renamed from: a */
        public JSONObject mo14701a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", C43601j.this.f117852e);
                jSONObject.put("set_cookie", 1);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.LuggageGetA8KeyUtil", "onGetA8Key, e:" + e.getMessage());
            }
            return jSONObject;
        }

        /* renamed from: b */
        public String mo14702b() {
            return "onGetA8KeyUrl";
        }
    }

    public C43601j(C53133t tVar, String str) {
        this.f117851d = tVar;
        this.f117852e = str;
    }

    public void run() {
        this.f117851d.mo73815b(new C43602a());
    }
}
