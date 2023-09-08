package com.tencent.p014mm.plugin.game.luggage;

import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import p828wa.C53099d;
import p828wa.C53133t;

/* renamed from: com.tencent.mm.plugin.game.luggage.n */
public class C41930n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C53133t f112946d;

    /* renamed from: e */
    public final /* synthetic */ String f112947e;

    /* renamed from: com.tencent.mm.plugin.game.luggage.n$a */
    public class C41931a extends C53099d {
        public C41931a() {
        }

        /* renamed from: a */
        public JSONObject mo14701a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", C41930n.this.f112947e);
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

    public C41930n(C53133t tVar, String str) {
        this.f112946d = tVar;
        this.f112947e = str;
    }

    public void run() {
        this.f112946d.mo73815b(new C41931a());
    }
}
