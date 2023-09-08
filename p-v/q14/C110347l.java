package q14;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hy3.C33145a;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import sx3.C110818d0;

/* renamed from: q14.l */
public final class C110347l extends C110346e implements Map<String, C110346e>, C33145a {

    /* renamed from: d */
    public final Map<String, C110346e> f330085d;

    /* renamed from: q14.l$a */
    public static final class C110348a extends C87413o implements C32226l<Map.Entry<? extends String, ? extends C110346e>, CharSequence> {

        /* renamed from: d */
        public static final C110348a f330086d = new C110348a();

        public C110348a() {
            super(1);
        }

        public Object invoke(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            C87412m.m108594g(entry, "<name for destructuring parameter 0>");
            return '\"' + ((String) entry.getKey()) + "\":" + ((C110346e) entry.getValue());
        }
    }

    public C110347l(Map<String, ? extends C110346e> map) {
        C87412m.m108594g(map, "content");
        this.f330085d = map;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        C87412m.m108594g(str, "key");
        return this.f330085d.containsKey(str);
    }

    public final boolean containsValue(Object obj) {
        if (!(obj instanceof C110346e)) {
            return false;
        }
        C110346e eVar = (C110346e) obj;
        C87412m.m108594g(eVar, "value");
        return this.f330085d.containsValue(eVar);
    }

    public final Set<Map.Entry<String, C110346e>> entrySet() {
        return this.f330085d.entrySet();
    }

    public boolean equals(Object obj) {
        return C87412m.m108589b(this.f330085d, obj);
    }

    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        C87412m.m108594g(str, "key");
        return this.f330085d.get(str);
    }

    public int hashCode() {
        return this.f330085d.hashCode();
    }

    public boolean isEmpty() {
        return this.f330085d.isEmpty();
    }

    public final Set<String> keySet() {
        return this.f330085d.keySet();
    }

    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends String, ? extends C110346e> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(BiFunction<? super String, ? super C110346e, ? extends C110346e> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f330085d.size();
    }

    public String toString() {
        return C110818d0.m150921S(this.f330085d.entrySet(), ",", "{", "}", 0, (CharSequence) null, C110348a.f330086d, 24, (Object) null);
    }

    public final Collection<C110346e> values() {
        return this.f330085d.values();
    }
}
