package jc0;

import o90.C100308d;
import p823sg.C101611g;
import q90.C101062d;

/* renamed from: jc0.a */
public class C98931a<K, V> {

    /* renamed from: a */
    public C101611g<K, V> f290003a;

    public C98931a(int i) {
        this.f290003a = new C100308d(i);
    }

    /* renamed from: a */
    public final V mo138273a(K k, V v) {
        C101611g<K, V> gVar = this.f290003a;
        if (gVar != null) {
            return ((C101062d) gVar).put(k, v);
        }
        throw new NullPointerException("mData == null");
    }

    public final synchronized String toString() {
        C101611g<K, V> gVar;
        gVar = this.f290003a;
        if (gVar != null) {
        } else {
            throw new NullPointerException("mData == null");
        }
        return gVar.toString();
    }
}
