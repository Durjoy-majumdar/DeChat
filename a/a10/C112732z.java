package a10;

import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: a10.z */
public class C112732z {

    /* renamed from: a */
    public String f337543a;

    /* renamed from: b */
    public String f337544b;

    /* renamed from: c */
    public String f337545c;

    /* renamed from: d */
    public HashMap<String, Object> f337546d;

    /* renamed from: e */
    public HashMap<String, Object> f337547e;

    /* renamed from: f */
    public boolean f337548f = false;

    public C112732z(String str, String str2, String str3, HashMap<String, Object> hashMap) {
        this.f337543a = str;
        this.f337544b = str2;
        this.f337545c = str3;
        this.f337546d = hashMap;
    }

    /* renamed from: a */
    public String mo164475a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("plugin", this.f337543a);
            jSONObject.put("entry", this.f337544b);
            jSONObject.put("route", this.f337545c);
            if (this.f337546d != null) {
                jSONObject.put("params", new JSONObject(this.f337546d));
            }
            if (this.f337547e != null) {
                jSONObject.put("initParams", new JSONObject(this.f337547e));
            }
            jSONObject.put("parentPageType", 0);
            jSONObject.put("isInitRoute", this.f337548f);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public String toString() {
        return mo164475a();
    }
}
