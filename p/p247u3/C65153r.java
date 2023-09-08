package p247u3;

import gy3.C87412m;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import wx3.C15601d;

/* renamed from: u3.r */
public abstract class C65153r<Key, Value> {

    /* renamed from: a */
    public final CopyOnWriteArrayList<C65156c> f187567a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public final AtomicBoolean f187568b = new AtomicBoolean(false);

    /* renamed from: c */
    public final C65157d f187569c;

    /* renamed from: u3.r$a */
    public static final class C65154a<Value> {

        /* renamed from: a */
        public final List<Value> f187570a;

        /* renamed from: b */
        public final Object f187571b;

        /* renamed from: c */
        public final Object f187572c;

        /* renamed from: d */
        public final int f187573d;

        /* renamed from: e */
        public final int f187574e;

        public C65154a(List<? extends Value> list, Object obj, Object obj2, int i, int i2) {
            C87412m.m108594g(list, "data");
            this.f187570a = list;
            this.f187571b = obj;
            this.f187572c = obj2;
            this.f187573d = i;
            this.f187574e = i2;
            if (i < 0 && i != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("Position must be non-negative");
            } else if (list.isEmpty() && (i > 0 || i2 > 0)) {
                throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
            } else if (i2 < 0 && i2 != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C65154a)) {
                return false;
            }
            C65154a aVar = (C65154a) obj;
            return C87412m.m108589b(this.f187570a, aVar.f187570a) && C87412m.m108589b(this.f187571b, aVar.f187571b) && C87412m.m108589b(this.f187572c, aVar.f187572c) && this.f187573d == aVar.f187573d && this.f187574e == aVar.f187574e;
        }
    }

    /* renamed from: u3.r$b */
    public static abstract class C65155b<Key, Value> {
        /* renamed from: a */
        public abstract C65153r<Key, Value> mo79078a();
    }

    /* renamed from: u3.r$c */
    public interface C65156c {
        /* renamed from: b */
        void mo89246b();
    }

    /* renamed from: u3.r$d */
    public enum C65157d {
        POSITIONAL,
        PAGE_KEYED
    }

    /* renamed from: u3.r$e */
    public static final class C65158e<K> {

        /* renamed from: a */
        public final C65069i0 f187578a;

        /* renamed from: b */
        public final K f187579b;

        public C65158e(C65069i0 i0Var, K k, int i, boolean z, int i2) {
            C87412m.m108594g(i0Var, "type");
            this.f187578a = i0Var;
            this.f187579b = k;
            if (i0Var != C65069i0.REFRESH && k == null) {
                throw new IllegalArgumentException("Key must be non-null for prepend/append");
            }
        }
    }

    public C65153r(C65157d dVar) {
        C87412m.m108594g(dVar, "type");
        this.f187569c = dVar;
    }

    /* renamed from: a */
    public abstract Key mo89316a(Value value);

    /* renamed from: b */
    public abstract Object mo89317b(C65158e<Key> eVar, C15601d<? super C65154a<Value>> dVar);
}
