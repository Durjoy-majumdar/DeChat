package ky1;

import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53099d;

/* renamed from: ky1.f */
public class C46812f extends C53099d {

    /* renamed from: a */
    public final /* synthetic */ String f125948a;

    public C46812f(C46803a aVar, String str) {
        this.f125948a = str;
    }

    /* renamed from: a */
    public JSONObject mo14701a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("networkType", this.f125948a);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    public String mo14702b() {
        return "onNetWorkChange";
    }
}
