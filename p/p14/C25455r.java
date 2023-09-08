package p14;

import gy3.C8480h;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import l14.C24951b;
import n14.C25217e;

/* renamed from: p14.r */
public final class C25455r<K, V> extends C25465z<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {

    /* renamed from: c */
    public final C25217e f72064c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25455r(C24951b<K> bVar, C24951b<V> bVar2) {
        super(bVar, bVar2, (C8480h) null);
        C87412m.m108594g(bVar, "kSerializer");
        C87412m.m108594g(bVar2, "vSerializer");
        this.f72064c = new C25454q(bVar.mo51996a(), bVar2.mo51996a());
    }

    /* renamed from: a */
    public C25217e mo51996a() {
        return this.f72064c;
    }

    /* renamed from: f */
    public Object mo52649f() {
        return new LinkedHashMap();
    }

    /* renamed from: g */
    public int mo52650g(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        C87412m.m108594g(linkedHashMap, "$this$builderSize");
        return linkedHashMap.size();
    }

    /* renamed from: h */
    public void mo52651h(Object obj, int i) {
        C87412m.m108594g((LinkedHashMap) obj, "$this$checkCapacity");
    }

    /* renamed from: i */
    public Iterator mo52652i(Object obj) {
        Map map = (Map) obj;
        C87412m.m108594g(map, "$this$collectionIterator");
        return map.entrySet().iterator();
    }

    /* renamed from: j */
    public int mo52653j(Object obj) {
        Map map = (Map) obj;
        C87412m.m108594g(map, "$this$collectionSize");
        return map.size();
    }

    /* renamed from: m */
    public Object mo52656m(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        C87412m.m108594g(linkedHashMap, "$this$toResult");
        return linkedHashMap;
    }
}
