package e42;

import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: e42.h */
public final class C7596h extends JSONObject {
    public C7596h() {
    }

    /* renamed from: a */
    public final String mo8721a() {
        if (opt("errCode") == null) {
            return "{\"errMsg\":\"No error code found\", \"errCode\": -3}";
        }
        String jSONObject = toString();
        C87412m.m108593f(jSONObject, "super.toString()");
        return jSONObject;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7596h(String str) {
        super(str);
        C87412m.m108594g(str, "data");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7596h(Map<String, ? extends Object> map) {
        super(map);
        C87412m.m108594g(map, "map");
    }
}
