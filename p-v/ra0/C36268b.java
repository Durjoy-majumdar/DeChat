package ra0;

import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;
import rh3.C36327a;

/* renamed from: ra0.b */
public final class C36268b extends C36327a {

    /* renamed from: a */
    public final LinkedList<C36267a> f96579a = new LinkedList<>();

    /* renamed from: a */
    public JSONObject mo33258a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (C36267a a : this.f96579a) {
            jSONArray.put(a.mo33258a());
        }
        jSONObject.put("list", jSONArray);
        return jSONObject;
    }
}
