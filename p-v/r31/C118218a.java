package r31;

import java.util.HashMap;
import java.util.Map;
import u24.C90599h;

/* renamed from: r31.a */
public class C118218a {

    /* renamed from: a */
    public String f353362a;

    /* renamed from: b */
    public Map<String, Object> f353363b = new HashMap();

    /* renamed from: a */
    public void mo183011a(String str, Object obj) {
        if (!C90599h.m113511d(str) && obj != null) {
            ((HashMap) this.f353363b).put(str, obj);
        }
    }

    /* renamed from: b */
    public void mo183012b(Map<String, Object> map) {
        if (map != null && map.size() > 0) {
            ((HashMap) this.f353363b).putAll(map);
        }
    }
}
