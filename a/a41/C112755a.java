package a41;

import java.util.HashMap;
import java.util.Map;
import u24.C90599h;

/* renamed from: a41.a */
public class C112755a {

    /* renamed from: a */
    public String f337630a;

    /* renamed from: b */
    public Map<String, Object> f337631b = new HashMap();

    /* renamed from: a */
    public void mo164511a(Map<String, Object> map) {
        Object obj;
        if (map != null && map.size() > 0) {
            for (String next : map.keySet()) {
                if (!C90599h.m113511d(next) && (obj = map.get(next)) != null) {
                    ((HashMap) this.f337631b).put(next, obj);
                }
            }
        }
    }
}
