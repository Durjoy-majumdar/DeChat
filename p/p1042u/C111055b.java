package p1042u;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p1042u.C118556h;

/* renamed from: u.b */
public class C111055b<K, V> extends C111059i<K, V> implements Map<K, V> {

    /* renamed from: n */
    public C118556h<K, V> f332569n;

    public C111055b() {
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f332569n == null) {
            this.f332569n = new C111054a(this);
        }
        C118556h<K, V> hVar = this.f332569n;
        if (hVar.f354819a == null) {
            hVar.f354819a = new C118556h.C118558b();
        }
        return hVar.f354819a;
    }

    public Set<K> keySet() {
        if (this.f332569n == null) {
            this.f332569n = new C111054a(this);
        }
        C118556h<K, V> hVar = this.f332569n;
        if (hVar.f354820b == null) {
            hVar.f354820b = new C118556h.C118559c();
        }
        return hVar.f354820b;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo162776b(this.f332583f + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        if (this.f332569n == null) {
            this.f332569n = new C111054a(this);
        }
        C118556h<K, V> hVar = this.f332569n;
        if (hVar.f354821c == null) {
            hVar.f354821c = new C118556h.C118561e();
        }
        return hVar.f354821c;
    }

    public C111055b(int i) {
        super(i);
    }

    public C111055b(C111059i iVar) {
        if (iVar != null) {
            int i = iVar.f332583f;
            mo162776b(this.f332583f + i);
            if (this.f332583f != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    put(iVar.mo162789j(i2), iVar.mo162791l(i2));
                }
            } else if (i > 0) {
                System.arraycopy(iVar.f332581d, 0, this.f332581d, 0, i);
                System.arraycopy(iVar.f332582e, 0, this.f332582e, 0, i << 1);
                this.f332583f = i;
            }
        }
    }
}
