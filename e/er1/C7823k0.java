package er1;

import gy3.C87412m;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;
import p170ic.C87689c;

/* renamed from: er1.k0 */
public final class C7823k0 {

    /* renamed from: a */
    public String f26355a;

    /* renamed from: b */
    public boolean f26356b;

    /* renamed from: c */
    public boolean f26357c;

    /* renamed from: d */
    public boolean f26358d;

    /* renamed from: e */
    public boolean f26359e;

    /* renamed from: f */
    public final LinkedList<C7806h0> f26360f = new LinkedList<>();

    public C7823k0(String str) {
        this.f26355a = str;
        String str2 = this.f26355a;
        if (!(str2 == null || str2.length() == 0)) {
            JSONObject jSONObject = new JSONObject(this.f26355a);
            if (jSONObject.has("listenEventList")) {
                JSONArray jSONArray = jSONObject.getJSONArray("listenEventList");
                C87412m.m108593f(jSONArray, "eventList");
                C87689c.m109089b(jSONArray, new C7809i0(this));
            }
            if (jSONObject.has("detail")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("detail");
                C87412m.m108593f(jSONArray2, "detailList");
                C87689c.m109089b(jSONArray2, new C7817j0(this));
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7823k0) && C87412m.m108589b(this.f26355a, ((C7823k0) obj).f26355a);
    }

    public int hashCode() {
        String str = this.f26355a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.f26355a;
        return str == null ? "null" : str;
    }
}
