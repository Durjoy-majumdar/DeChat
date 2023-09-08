package eb0;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: eb0.k3 */
public final class C97627k3 {

    /* renamed from: a */
    public final String f286398a;

    /* renamed from: b */
    public final Object f286399b;

    public C97627k3(String str, Object obj) {
        this.f286398a = str;
        this.f286399b = obj;
    }

    /* renamed from: a */
    public <T> T mo136893a(String str) {
        Object obj = this.f286399b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }
}
