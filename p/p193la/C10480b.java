package p193la;

import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import org.json.JSONException;
import org.json.JSONObject;
import p1005ma.C88718b;

/* renamed from: la.b */
public class C10480b {

    /* renamed from: a */
    public int f31713a;

    /* renamed from: b */
    public String f31714b;

    /* renamed from: c */
    public long f31715c;

    /* renamed from: d */
    public long f31716d;

    /* renamed from: e */
    public long f31717e;

    /* renamed from: f */
    public boolean f31718f;

    public C10480b(int i, String str, long j, long j2, long j3, boolean z) {
        this.f31713a = i;
        this.f31714b = str;
        this.f31715c = j;
        this.f31716d = j2;
        this.f31717e = j3;
        this.f31718f = z;
    }

    /* renamed from: a */
    public void mo10783a(String str, JSONObject jSONObject, boolean z) {
        if (this.f31717e >= 0) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("result", false);
                if (jSONObject != null) {
                    jSONObject2.put("data", jSONObject);
                } else {
                    jSONObject2.put("data", new JSONObject());
                }
                if (str != null) {
                    jSONObject2.put("errMsg", str);
                } else {
                    jSONObject2.put("errMsg", "");
                }
            } catch (JSONException e) {
                C88718b.m110680b("WxaLiteApp.LiteAppJsApiCallback", e.toString(), new Object[0]);
            }
            LiteAppCenter.jsApiCallback(this.f31714b, this.f31715c, this.f31716d, this.f31717e, jSONObject2.toString(), z, this.f31718f);
        }
    }
}
