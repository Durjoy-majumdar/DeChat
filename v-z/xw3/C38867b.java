package xw3;

import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;

/* renamed from: xw3.b */
public final class C38867b {

    /* renamed from: a */
    public static final C38868a f104768a = new C38868a((C8480h) null);

    /* renamed from: b */
    public static final HashMap<String, Long> f104769b = new HashMap<>();

    /* renamed from: xw3.b$a */
    public static final class C38868a {
        public C38868a(C8480h hVar) {
        }

        /* renamed from: a */
        public final long mo61814a(String str) {
            C87412m.m108594g(str, "key");
            HashMap<String, Long> hashMap = C38867b.f104769b;
            if (!hashMap.containsKey(str)) {
                return 0;
            }
            Long l = hashMap.get(str);
            C87412m.m108591d(l);
            long longValue = l.longValue();
            hashMap.remove(str);
            return System.currentTimeMillis() - longValue;
        }
    }

    static {
        new HashMap();
        new HashMap();
    }
}
