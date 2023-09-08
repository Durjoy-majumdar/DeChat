package sx3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hy3.C33145a;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p411n0.C25077d;
import p411n0.C25087n;
import p411n0.C25089p;
import p411n0.C25091r;

/* renamed from: sx3.d */
public abstract class C26231d<K, V> implements Map<K, V>, C33145a {

    /* renamed from: sx3.d$a */
    public static final class C13799a extends C87413o implements C32226l<Map.Entry<? extends K, ? extends V>, CharSequence> {

        /* renamed from: d */
        public final /* synthetic */ C26231d<K, V> f38929d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13799a(C26231d<K, ? extends V> dVar) {
            super(1);
            this.f38929d = dVar;
        }

        public Object invoke(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            C87412m.m108594g(entry, LocaleUtil.ITALIAN);
            C26231d<K, V> dVar = this.f38929d;
            dVar.getClass();
            StringBuilder sb = new StringBuilder();
            Object key = entry.getKey();
            String str = "(this Map)";
            sb.append(key == dVar ? str : String.valueOf(key));
            sb.append('=');
            Object value = entry.getValue();
            if (value != dVar) {
                str = String.valueOf(value);
            }
            sb.append(str);
            return sb.toString();
        }
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsValue(Object obj) {
        Set<Map.Entry> entrySet = entrySet();
        if (entrySet.isEmpty()) {
            return false;
        }
        for (Map.Entry value : entrySet) {
            if (C87412m.m108589b(value.getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return new C25087n((C25077d) this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof java.util.Map
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            r1 = r6
            n0.d r1 = (p411n0.C25077d) r1
            int r3 = r1.f71501e
            java.util.Map r7 = (java.util.Map) r7
            int r4 = r7.size()
            if (r3 == r4) goto L_0x0018
            return r2
        L_0x0018:
            java.util.Set r7 = r7.entrySet()
            boolean r3 = r7 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0027
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L_0x0027
            goto L_0x005b
        L_0x0027:
            java.util.Iterator r7 = r7.iterator()
        L_0x002b:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x005b
            java.lang.Object r3 = r7.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r3 != 0) goto L_0x003b
        L_0x0039:
            r3 = 0
            goto L_0x0058
        L_0x003b:
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            java.lang.Object r5 = r1.get(r4)
            boolean r3 = gy3.C87412m.m108589b(r3, r5)
            if (r3 != 0) goto L_0x004e
            goto L_0x0039
        L_0x004e:
            if (r5 != 0) goto L_0x0057
            boolean r3 = r1.containsKey(r4)
            if (r3 != 0) goto L_0x0057
            goto L_0x0039
        L_0x0057:
            r3 = 1
        L_0x0058:
            if (r3 != 0) goto L_0x002b
            r0 = 0
        L_0x005b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sx3.C26231d.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return ((C25077d) this).f71501e == 0;
    }

    public final Set<K> keySet() {
        return new C25089p((C25077d) this);
    }

    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return ((C25077d) this).f71501e;
    }

    public String toString() {
        return C110818d0.m150921S(entrySet(), ", ", "{", "}", 0, (CharSequence) null, new C13799a(this), 24, (Object) null);
    }

    public final Collection<V> values() {
        return new C25091r((C25077d) this);
    }
}
