package p14;

import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hy3.C33145a;
import java.util.List;
import java.util.Map;
import l14.C24951b;
import n14.C25203a;
import n14.C25217e;
import n14.C25222h;
import n14.C25226j;
import rx3.C13598b0;

/* renamed from: p14.x */
public final class C25461x<K, V> extends C25453p<K, V, Map.Entry<? extends K, ? extends V>> {

    /* renamed from: c */
    public final C25217e f72071c;

    /* renamed from: p14.x$b */
    public static final class C25462b extends C87413o implements C32226l<C25203a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C24951b f72072d;

        /* renamed from: e */
        public final /* synthetic */ C24951b f72073e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25462b(C24951b bVar, C24951b bVar2) {
            super(1);
            this.f72072d = bVar;
            this.f72073e = bVar2;
        }

        public Object invoke(Object obj) {
            C25203a aVar = (C25203a) obj;
            C87412m.m108594g(aVar, "$receiver");
            C25203a.m32146a(aVar, "key", this.f72072d.mo51996a(), (List) null, false, 12, (Object) null);
            C25203a.m32146a(aVar, "value", this.f72073e.mo51996a(), (List) null, false, 12, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: p14.x$a */
    public static final class C25463a<K, V> implements Map.Entry<K, V>, C33145a {

        /* renamed from: d */
        public final K f72074d;

        /* renamed from: e */
        public final V f72075e;

        public C25463a(K k, V v) {
            this.f72074d = k;
            this.f72075e = v;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25463a)) {
                return false;
            }
            C25463a aVar = (C25463a) obj;
            return C87412m.m108589b(this.f72074d, aVar.f72074d) && C87412m.m108589b(this.f72075e, aVar.f72075e);
        }

        public K getKey() {
            return this.f72074d;
        }

        public V getValue() {
            return this.f72075e;
        }

        public int hashCode() {
            K k = this.f72074d;
            int i = 0;
            int hashCode = (k != null ? k.hashCode() : 0) * 31;
            V v = this.f72075e;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode + i;
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + this.f72074d + ", value=" + this.f72075e + ")";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25461x(C24951b<K> bVar, C24951b<V> bVar2) {
        super(bVar, bVar2, (C8480h) null);
        C87412m.m108594g(bVar, "keySerializer");
        C87412m.m108594g(bVar2, "valueSerializer");
        this.f72071c = C25222h.m32168a("kotlin.collections.Map.Entry", C25226j.C25229c.f71698a, new C25217e[0], new C25462b(bVar, bVar2));
    }

    /* renamed from: a */
    public C25217e mo51996a() {
        return this.f72071c;
    }
}
