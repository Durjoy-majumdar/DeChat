package x04;

import java.util.NoSuchElementException;

/* renamed from: x04.b */
public final class C26529b<K, V> {

    /* renamed from: c */
    public static final C26529b<Object, Object> f73816c = new C26529b<>(C26531d.f73825b, 0);

    /* renamed from: a */
    public final C26531d<C26527a<C38441e<K, V>>> f73817a;

    /* renamed from: b */
    public final int f73818b;

    public C26529b(C26531d<C26527a<C38441e<K, V>>> dVar, int i) {
        this.f73817a = dVar;
        this.f73818b = i;
    }

    /* renamed from: a */
    public C26529b<K, V> mo53484a(K k, V v) {
        C26527a<Object> aVar = (C26527a) this.f73817a.f73826a.mo53485a((long) k.hashCode());
        if (aVar == null) {
            aVar = C26527a.f73811g;
        }
        int i = aVar.f73814f;
        int i2 = 0;
        C26527a aVar2 = aVar;
        while (true) {
            if (aVar2 == null || aVar2.f73814f <= 0) {
                i2 = -1;
            } else if (((C38441e) aVar2.f73812d).f101397d.equals(k)) {
                break;
            } else {
                aVar2 = aVar2.f73813e;
                i2++;
            }
        }
        i2 = -1;
        if (i2 != -1) {
            if (i2 < 0 || i2 > aVar.f73814f) {
                throw new IndexOutOfBoundsException();
            }
            try {
                aVar = aVar.mo53478f(aVar.mo53479h(i2).f73812d);
            } catch (NoSuchElementException unused) {
                throw new IndexOutOfBoundsException("Index: " + i2);
            }
        }
        C38441e eVar = new C38441e(k, v);
        aVar.getClass();
        C26527a aVar3 = new C26527a(eVar, aVar);
        C26531d<C26527a<C38441e<K, V>>> dVar = this.f73817a;
        C26530c<V> b = dVar.f73826a.mo53486b((long) k.hashCode(), aVar3);
        if (b != dVar.f73826a) {
            dVar = new C26531d<>(b);
        }
        return new C26529b<>(dVar, (this.f73818b - i) + aVar3.f73814f);
    }
}
