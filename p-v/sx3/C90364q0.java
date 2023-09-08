package sx3;

import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import rx3.C13604l;

/* renamed from: sx3.q0 */
public class C90364q0 extends C90363p0 {
    /* renamed from: d */
    public static final <K, V> V m113145d(Map<K, ? extends V> map, K k) {
        C87412m.m108594g(map, "<this>");
        if (map instanceof C90361n0) {
            return ((C90361n0) map).mo124578h(k);
        }
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        throw new NoSuchElementException("Key " + k + " is missing in the map.");
    }

    /* renamed from: e */
    public static final <K, V> HashMap<K, V> m113146e(C13604l<? extends K, ? extends V>... lVarArr) {
        C87412m.m108594g(lVarArr, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(C90363p0.m113142a(lVarArr.length));
        m113151j(hashMap, lVarArr);
        return hashMap;
    }

    /* renamed from: f */
    public static final <K, V> Map<K, V> m113147f(C13604l<? extends K, ? extends V>... lVarArr) {
        C87412m.m108594g(lVarArr, "pairs");
        if (lVarArr.length <= 0) {
            return C36903g0.f97931d;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C90363p0.m113142a(lVarArr.length));
        m113151j(linkedHashMap, lVarArr);
        return linkedHashMap;
    }

    /* renamed from: g */
    public static final <K, V> Map<K, V> m113148g(C13604l<? extends K, ? extends V>... lVarArr) {
        C87412m.m108594g(lVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C90363p0.m113142a(lVarArr.length));
        m113151j(linkedHashMap, lVarArr);
        return linkedHashMap;
    }

    /* renamed from: h */
    public static final <K, V> Map<K, V> m113149h(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        C87412m.m108594g(map, "<this>");
        C87412m.m108594g(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* renamed from: i */
    public static final <K, V> void m113150i(Map<? super K, ? super V> map, Iterable<? extends C13604l<? extends K, ? extends V>> iterable) {
        C87412m.m108594g(map, "<this>");
        C87412m.m108594g(iterable, "pairs");
        for (C13604l lVar : iterable) {
            map.put(lVar.f38555d, lVar.f38556e);
        }
    }

    /* renamed from: j */
    public static final <K, V> void m113151j(Map<? super K, ? super V> map, C13604l<? extends K, ? extends V>[] lVarArr) {
        C87412m.m108594g(map, "<this>");
        C87412m.m108594g(lVarArr, "pairs");
        for (C13604l<? extends K, ? extends V> lVar : lVarArr) {
            map.put(lVar.f38555d, lVar.f38556e);
        }
    }

    /* renamed from: k */
    public static final <K, V> Map<K, V> m113152k(Iterable<? extends C13604l<? extends K, ? extends V>> iterable) {
        C87412m.m108594g(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return C36903g0.f97931d;
            }
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(C90363p0.m113142a(collection.size()));
                m113153l(iterable, linkedHashMap);
                return linkedHashMap;
            }
            return C90363p0.m113143b((C13604l) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        m113153l(iterable, linkedHashMap2);
        int size2 = linkedHashMap2.size();
        return size2 != 0 ? size2 != 1 ? linkedHashMap2 : C90363p0.m113144c(linkedHashMap2) : C36903g0.f97931d;
    }

    /* renamed from: l */
    public static final <K, V, M extends Map<? super K, ? super V>> M m113153l(Iterable<? extends C13604l<? extends K, ? extends V>> iterable, M m) {
        C87412m.m108594g(iterable, "<this>");
        C87412m.m108594g(m, FirebaseAnalytics.C113379b.DESTINATION);
        m113150i(m, iterable);
        return m;
    }

    /* renamed from: m */
    public static final <K, V> Map<K, V> m113154m(Map<? extends K, ? extends V> map) {
        C87412m.m108594g(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? m113155n(map) : C90363p0.m113144c(map) : C36903g0.f97931d;
    }

    /* renamed from: n */
    public static final <K, V> Map<K, V> m113155n(Map<? extends K, ? extends V> map) {
        C87412m.m108594g(map, "<this>");
        return new LinkedHashMap(map);
    }
}
