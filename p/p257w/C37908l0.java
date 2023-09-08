package p257w;

import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;
import p257w.C37890a0;
import rx3.C13604l;
import sx3.C90363p0;

/* renamed from: w.l0 */
public final class C37908l0<T> implements C37948y<T> {

    /* renamed from: a */
    public final C37910b<T> f100323a;

    /* renamed from: w.l0$a */
    public static final class C37909a<T> {

        /* renamed from: a */
        public final T f100324a;

        /* renamed from: b */
        public C37950z f100325b;

        public C37909a(Object obj, C37950z zVar, int i, C8480h hVar) {
            if ((i & 2) != 0) {
                C37950z zVar2 = C37890a0.f100293a;
                zVar = C37890a0.C37891a.f100294a;
            }
            C87412m.m108594g(zVar, "easing");
            this.f100324a = obj;
            this.f100325b = zVar;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C37909a) {
                C37909a aVar = (C37909a) obj;
                return C87412m.m108589b(aVar.f100324a, this.f100324a) && C87412m.m108589b(aVar.f100325b, this.f100325b);
            }
        }

        public int hashCode() {
            T t = this.f100324a;
            return ((t != null ? t.hashCode() : 0) * 31) + this.f100325b.hashCode();
        }
    }

    /* renamed from: w.l0$b */
    public static final class C37910b<T> {

        /* renamed from: a */
        public int f100326a = 300;

        /* renamed from: b */
        public final Map<Integer, C37909a<T>> f100327b = new LinkedHashMap();

        /* renamed from: a */
        public final C37909a<T> mo61414a(T t, int i) {
            C37909a<T> aVar = new C37909a<>(t, (C37950z) null, 2, (C8480h) null);
            this.f100327b.put(Integer.valueOf(i), aVar);
            return aVar;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C37910b) {
                C37910b bVar = (C37910b) obj;
                bVar.getClass();
                return this.f100326a == bVar.f100326a && C87412m.m108589b(this.f100327b, bVar.f100327b);
            }
        }

        public int hashCode() {
            return (((this.f100326a * 31) + 0) * 31) + this.f100327b.hashCode();
        }
    }

    public C37908l0(C37910b<T> bVar) {
        C87412m.m108594g(bVar, "config");
        this.f100323a = bVar;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C37908l0) && C87412m.m108589b(this.f100323a, ((C37908l0) obj).f100323a);
    }

    /* renamed from: f */
    public <V extends C37919o> C37945w1<V> m41606a(C37906k1<T, V> k1Var) {
        C87412m.m108594g(k1Var, "converter");
        Map<Integer, C37909a<T>> map = this.f100323a.f100327b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C90363p0.m113142a(map.size()));
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            Object key = entry.getKey();
            C37909a aVar = (C37909a) entry.getValue();
            C32226l<T, V> a = k1Var.mo61399a();
            aVar.getClass();
            C87412m.m108594g(a, "convertToVector");
            linkedHashMap.put(key, new C13604l(a.invoke(aVar.f100324a), aVar.f100325b));
        }
        C37910b<T> bVar = this.f100323a;
        int i = bVar.f100326a;
        bVar.getClass();
        return new C37945w1<>(linkedHashMap, i, 0);
    }

    public int hashCode() {
        return this.f100323a.hashCode();
    }
}
