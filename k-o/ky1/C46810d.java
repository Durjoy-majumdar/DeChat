package ky1;

import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53099d;

/* renamed from: ky1.d */
public class C46810d extends C53099d {

    /* renamed from: a */
    public final /* synthetic */ String f125944a;

    public C46810d(C46803a aVar, String str) {
        this.f125944a = str;
    }

    /* renamed from: a */
    public JSONObject mo14701a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("state", this.f125944a);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    public String mo14702b() {
        return "onJsCoreLifeChange";
    }
}
