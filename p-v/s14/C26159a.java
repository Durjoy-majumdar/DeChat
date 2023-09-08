package s14;

import ey3.C116796a;
import fy3.C32226l;
import gy3.C24560g0;
import gy3.C24564k0;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import l14.C24950a;
import l14.C24951b;
import l14.C24954f;
import ny3.C25235d;

/* renamed from: s14.a */
public final class C26159a extends C26160b {

    /* renamed from: a */
    public final Map<C25235d<?>, C24951b<?>> f73094a;

    /* renamed from: b */
    public final Map<C25235d<?>, Map<C25235d<?>, C24951b<?>>> f73095b;

    /* renamed from: c */
    public final Map<C25235d<?>, Map<String, C24951b<?>>> f73096c;

    /* renamed from: d */
    public final Map<C25235d<?>, C32226l<String, C24950a<?>>> f73097d;

    public C26159a(Map<C25235d<?>, ? extends C24951b<?>> map, Map<C25235d<?>, ? extends Map<C25235d<?>, ? extends C24951b<?>>> map2, Map<C25235d<?>, ? extends Map<String, ? extends C24951b<?>>> map3, Map<C25235d<?>, ? extends C32226l<? super String, ? extends C24950a<?>>> map4) {
        C87412m.m108594g(map, "class2Serializer");
        C87412m.m108594g(map2, "polyBase2Serializers");
        C87412m.m108594g(map3, "polyBase2NamedSerializers");
        C87412m.m108594g(map4, "polyBase2DefaultProvider");
        this.f73094a = map;
        this.f73095b = map2;
        this.f73096c = map3;
        this.f73097d = map4;
    }

    /* renamed from: a */
    public <T> C24950a<? extends T> mo53061a(C25235d<? super T> dVar, String str) {
        C87412m.m108594g(dVar, "baseClass");
        C87412m.m108594g(str, "serializedClassName");
        Map map = this.f73096c.get(dVar);
        C24951b bVar = map != null ? (C24951b) map.get(str) : null;
        if (!(bVar instanceof C24951b)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        C32226l<String, C24950a<?>> lVar = this.f73097d.get(dVar);
        if (!C24564k0.m30742f(lVar, 1)) {
            lVar = null;
        }
        C32226l lVar2 = lVar;
        C24950a<? extends T> aVar = lVar2 != null ? (C24950a) lVar2.invoke(str) : null;
        if (aVar != null) {
            return aVar;
        }
        if (!C87412m.m108589b(dVar, C24560g0.m30725a(Object.class))) {
            return null;
        }
        Map<C25235d<?>, C24951b<?>> map2 = C26162d.f73099a;
        C24951b bVar2 = (C24951b) ((LinkedHashMap) C26162d.f73100b).get(str);
        if (bVar2 != null) {
            return bVar2;
        }
        return null;
    }

    /* renamed from: b */
    public <T> C24954f<T> mo53062b(C25235d<? super T> dVar, T t) {
        C24951b bVar;
        C87412m.m108594g(dVar, "baseClass");
        C87412m.m108594g(t, "value");
        if (!C116796a.m164751c(dVar).isInstance(t)) {
            return null;
        }
        Map map = this.f73095b.get(dVar);
        C24951b bVar2 = map != null ? (C24951b) map.get(C24560g0.m30725a(t.getClass())) : null;
        if (!(bVar2 instanceof C24954f)) {
            bVar2 = null;
        }
        if (bVar2 != null) {
            return bVar2;
        }
        if (!C87412m.m108589b(dVar, C24560g0.m30725a(Object.class))) {
            return null;
        }
        Iterator<Map.Entry<C25235d<?>, C24951b<?>>> it = C26162d.f73099a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            Map.Entry next = it.next();
            C25235d dVar2 = (C25235d) next.getKey();
            bVar = (C24951b) next.getValue();
            C87412m.m108594g(dVar2, "kclass");
            if (C116796a.m164751c(dVar2).isInstance(t)) {
                break;
            }
        }
        if (!(bVar instanceof C24954f)) {
            return null;
        }
        return bVar;
    }
}
