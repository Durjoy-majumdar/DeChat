package t04;

import gy3.C87412m;
import hy3.C33145a;
import java.util.Iterator;
import ny3.C25235d;

/* renamed from: t04.a */
public abstract class C26250a<K, V> implements Iterable<V>, C33145a {

    /* renamed from: t04.a$a */
    public static abstract class C26251a<K, V, T extends V> {

        /* renamed from: a */
        public final C25235d<? extends K> f73186a;

        /* renamed from: b */
        public final int f73187b;

        public C26251a(C25235d<? extends K> dVar, int i) {
            C87412m.m108594g(dVar, "key");
            this.f73186a = dVar;
            this.f73187b = i;
        }
    }

    /* renamed from: f */
    public abstract C26253c<V> mo53149f();

    public final boolean isEmpty() {
        return mo53149f().mo53152f() == 0;
    }

    public final Iterator<V> iterator() {
        return mo53149f().iterator();
    }
}
