package p411n0;

import gy3.C87412m;
import hy3.C108274e;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: n0.c */
public final class C25076c<K, V> extends C34705b<K, V> implements C108274e.C108275a {

    /* renamed from: f */
    public final C25082i<K, V> f71497f;

    /* renamed from: g */
    public V f71498g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25076c(C25082i<K, V> iVar, K k, V v) {
        super(k, v);
        C87412m.m108594g(iVar, "parentIterator");
        this.f71497f = iVar;
        this.f71498g = v;
    }

    public V getValue() {
        return this.f71498g;
    }

    public V setValue(V v) {
        V v2 = this.f71498g;
        this.f71498g = v;
        C25082i<K, V> iVar = this.f71497f;
        K k = this.f93321d;
        C25080g<K, V, Map.Entry<K, V>> gVar = iVar.f71516d;
        if (gVar.f71511g.containsKey(k)) {
            boolean z = gVar.f71504f;
            if (!z) {
                gVar.f71511g.put(k, v);
            } else if (z) {
                C25095u<K, V, T> uVar = gVar.f71502d[gVar.f71503e];
                Object obj = uVar.f71529d[uVar.f71531f];
                gVar.f71511g.put(k, v);
                gVar.mo52171e(obj != null ? obj.hashCode() : 0, gVar.f71511g.f71507f, obj, 0);
            } else {
                throw new NoSuchElementException();
            }
            gVar.f71514j = gVar.f71511g.f71509h;
        }
        return v2;
    }
}
