package b10;

import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;

/* renamed from: b10.b */
public final class C0241b {

    /* renamed from: a */
    public boolean f776a;

    /* renamed from: b */
    public Map<Object, Object> f777b;

    public C0241b() {
        this(false, (Map) null, 3, (C8480h) null);
    }

    public C0241b(boolean z, Map<Object, Object> map, int i, C8480h hVar) {
        z = (i & 1) != 0 ? true : z;
        map = (i & 2) != 0 ? new HashMap<>() : map;
        C87412m.m108594g(map, "resultData");
        this.f776a = z;
        this.f777b = map;
    }
}
