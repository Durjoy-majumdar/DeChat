package p247u3;

import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import rx3.C13598b0;
import sx3.C64186f0;
import wx3.C15601d;

/* renamed from: u3.q1 */
public abstract class C65145q1<Key, Value> {

    /* renamed from: a */
    public final CopyOnWriteArrayList<C32224a<C13598b0>> f187554a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public final AtomicBoolean f187555b = new AtomicBoolean(false);

    /* renamed from: u3.q1$a */
    public static abstract class C65146a<Key> {

        /* renamed from: a */
        public final int f187556a;

        /* renamed from: b */
        public final boolean f187557b;

        /* renamed from: u3.q1$a$a */
        public static final class C65147a<Key> extends C65146a<Key> {

            /* renamed from: c */
            public final Key f187558c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65147a(Key key, int i, boolean z) {
                super(i, z, (C8480h) null);
                C87412m.m108594g(key, "key");
                this.f187558c = key;
            }

            /* renamed from: a */
            public Key mo89309a() {
                return this.f187558c;
            }
        }

        /* renamed from: u3.q1$a$b */
        public static final class C65148b<Key> extends C65146a<Key> {

            /* renamed from: c */
            public final Key f187559c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65148b(Key key, int i, boolean z) {
                super(i, z, (C8480h) null);
                C87412m.m108594g(key, "key");
                this.f187559c = key;
            }

            /* renamed from: a */
            public Key mo89309a() {
                return this.f187559c;
            }
        }

        /* renamed from: u3.q1$a$c */
        public static final class C65149c<Key> extends C65146a<Key> {

            /* renamed from: c */
            public final Key f187560c;

            public C65149c(Key key, int i, boolean z) {
                super(i, z, (C8480h) null);
                this.f187560c = key;
            }

            /* renamed from: a */
            public Key mo89309a() {
                return this.f187560c;
            }
        }

        public C65146a(int i, boolean z, C8480h hVar) {
            this.f187556a = i;
            this.f187557b = z;
        }

        /* renamed from: a */
        public abstract Key mo89309a();
    }

    /* renamed from: a */
    public boolean mo89232a() {
        return false;
    }

    /* renamed from: b */
    public abstract Key mo72455b(C65164r1<Key, Value> r1Var);

    /* renamed from: c */
    public final void mo89308c() {
        if (this.f187555b.compareAndSet(false, true)) {
            for (C32224a invoke : this.f187554a) {
                invoke.invoke();
            }
        }
    }

    /* renamed from: d */
    public abstract Object mo72456d(C65146a<Key> aVar, C15601d<? super C65150b<Key, Value>> dVar);

    /* renamed from: u3.q1$b */
    public static abstract class C65150b<Key, Value> {

        /* renamed from: u3.q1$b$a */
        public static final class C65151a<Key, Value> extends C65150b<Key, Value> {

            /* renamed from: a */
            public final Throwable f187561a;

            public C65151a(Throwable th) {
                C87412m.m108594g(th, "throwable");
                this.f187561a = th;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C65151a) && C87412m.m108589b(this.f187561a, ((C65151a) obj).f187561a);
                }
                return true;
            }

            public int hashCode() {
                Throwable th = this.f187561a;
                if (th != null) {
                    return th.hashCode();
                }
                return 0;
            }

            public String toString() {
                return "Error(throwable=" + this.f187561a + ")";
            }
        }

        /* renamed from: u3.q1$b$b */
        public static final class C65152b<Key, Value> extends C65150b<Key, Value> {

            /* renamed from: a */
            public final List<Value> f187562a;

            /* renamed from: b */
            public final Key f187563b;

            /* renamed from: c */
            public final Key f187564c;

            /* renamed from: d */
            public final int f187565d;

            /* renamed from: e */
            public final int f187566e;

            static {
                new C65152b(C64186f0.f181907d, (Object) null, (Object) null, 0, 0);
            }

            public C65152b(List<? extends Value> list, Key key, Key key2, int i, int i2) {
                C87412m.m108594g(list, "data");
                this.f187562a = list;
                this.f187563b = key;
                this.f187564c = key2;
                this.f187565d = i;
                this.f187566e = i2;
                boolean z = false;
                if (i == Integer.MIN_VALUE || i >= 0) {
                    if (!((i2 == Integer.MIN_VALUE || i2 >= 0) ? true : z)) {
                        throw new IllegalArgumentException("itemsAfter cannot be negative".toString());
                    }
                    return;
                }
                throw new IllegalArgumentException("itemsBefore cannot be negative".toString());
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C65152b)) {
                    return false;
                }
                C65152b bVar = (C65152b) obj;
                return C87412m.m108589b(this.f187562a, bVar.f187562a) && C87412m.m108589b(this.f187563b, bVar.f187563b) && C87412m.m108589b(this.f187564c, bVar.f187564c) && this.f187565d == bVar.f187565d && this.f187566e == bVar.f187566e;
            }

            public int hashCode() {
                List<Value> list = this.f187562a;
                int i = 0;
                int hashCode = (list != null ? list.hashCode() : 0) * 31;
                Key key = this.f187563b;
                int hashCode2 = (hashCode + (key != null ? key.hashCode() : 0)) * 31;
                Key key2 = this.f187564c;
                if (key2 != null) {
                    i = key2.hashCode();
                }
                return ((((hashCode2 + i) * 31) + this.f187565d) * 31) + this.f187566e;
            }

            public String toString() {
                return "Page(data=" + this.f187562a + ", prevKey=" + this.f187563b + ", nextKey=" + this.f187564c + ", itemsBefore=" + this.f187565d + ", itemsAfter=" + this.f187566e + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public C65152b(List<? extends Value> list, Key key, Key key2) {
                this(list, key, key2, Integer.MIN_VALUE, Integer.MIN_VALUE);
                C87412m.m108594g(list, "data");
            }
        }
    }
}
