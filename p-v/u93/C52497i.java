package u93;

import gy3.C8480h;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: u93.i */
public final class C52497i {

    /* renamed from: a */
    public final String f146653a;

    /* renamed from: b */
    public long f146654b;

    /* renamed from: u93.i$a */
    public static final class C14140a {

        /* renamed from: a */
        public static final C14141a f39570a = new C14141a((C8480h) null);

        /* renamed from: u93.i$a$a */
        public static final class C14141a {
            public C14141a(C8480h hVar) {
            }

            /* renamed from: a */
            public final String mo13551a(String str, Map<String, ? extends Object> map) {
                C87412m.m108594g(str, "eventId");
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("__msg_type", "event");
                    jSONObject.put("__event_id", str);
                    if (map != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        for (Map.Entry next : map.entrySet()) {
                            try {
                                jSONObject2.put((String) next.getKey(), next.getValue());
                            } catch (Exception unused) {
                            }
                        }
                        jSONObject.put("__params", jSONObject2);
                    }
                } catch (Exception unused2) {
                }
                String jSONObject3 = jSONObject.toString();
                C87412m.m108593f(jSONObject3, "json.toString()");
                return jSONObject3;
            }
        }
    }

    public C52497i(String str) {
        C87412m.m108594g(str, "url");
        this.f146653a = str;
    }
}
