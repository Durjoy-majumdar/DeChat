package p822sa;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: sa.a */
public abstract class C48304a {

    /* renamed from: a */
    public C48305b f129355a;

    /* renamed from: b */
    public JSONObject f129356b;

    public String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("type", this.f129355a.name());
        hashMap.put("data", this.f129356b);
        return new JSONObject(hashMap).toString();
    }
}
