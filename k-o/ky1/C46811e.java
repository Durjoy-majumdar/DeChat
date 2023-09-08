package ky1;

import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53099d;

/* renamed from: ky1.e */
public class C46811e extends C53099d {

    /* renamed from: a */
    public final /* synthetic */ String f125945a;

    /* renamed from: b */
    public final /* synthetic */ String f125946b;

    /* renamed from: c */
    public final /* synthetic */ String f125947c;

    public C46811e(C46803a aVar, String str, String str2, String str3) {
        this.f125945a = str;
        this.f125946b = str2;
        this.f125947c = str3;
    }

    /* renamed from: a */
    public JSONObject mo14701a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("state", this.f125945a);
            String str = this.f125946b;
            if (str != null) {
                jSONObject.put("url", str);
            }
            jSONObject.put("pageId", this.f125947c);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public String mo14702b() {
        return "onPageLifeChange";
    }
}
