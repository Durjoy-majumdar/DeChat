package sx3;

import gy3.C87412m;
import java.util.Collections;
import java.util.Map;
import rx3.C13604l;

/* renamed from: sx3.p0 */
public class C90363p0 extends C90362o0 {
    /* renamed from: a */
    public static final int m113142a(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static final <K, V> Map<K, V> m113143b(C13604l<? extends K, ? extends V> lVar) {
        C87412m.m108594g(lVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(lVar.f38555d, lVar.f38556e);
        C87412m.m108593f(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: c */
    public static final <K, V> Map<K, V> m113144c(Map<? extends K, ? extends V> map) {
        C87412m.m108594g(map, "<this>");
        Map.Entry next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        C87412m.m108593f(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
