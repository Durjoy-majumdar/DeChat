package w60;

import o90.C100308d;
import p823sg.C101611g;
import q90.C101062d;

/* renamed from: w60.f */
public class C102354f<K, V> {

    /* renamed from: a */
    public C101611g<K, V> f301454a;

    public C102354f(int i) {
        this.f301454a = new C100308d(i);
    }

    /* renamed from: a */
    public final V mo141921a(K k, V v) {
        C101611g<K, V> gVar = this.f301454a;
        if (gVar != null) {
            return ((C101062d) gVar).put(k, v);
        }
        throw new NullPointerException("mData == null");
    }

    public final synchronized String toString() {
        C101611g<K, V> gVar;
        gVar = this.f301454a;
        if (gVar != null) {
        } else {
            throw new NullPointerException("mData == null");
        }
        return gVar.toString();
    }
}
