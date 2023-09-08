package y04;

import com.google.firebase.analytics.FirebaseAnalytics;
import fy3.C32226l;
import gy3.C24565l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import sx3.C110818d0;
import sx3.C64197v;

/* renamed from: y04.s */
public class C112354s extends C112352p {

    /* renamed from: y04.s$a */
    public /* synthetic */ class C91367a extends C24565l implements C32226l<C15925h<? extends R>, Iterator<? extends R>> {

        /* renamed from: d */
        public static final C91367a f262050d = new C91367a();

        public C91367a() {
            super(1, C15925h.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        public Object invoke(Object obj) {
            C15925h hVar = (C15925h) obj;
            C87412m.m108594g(hVar, "p0");
            return hVar.iterator();
        }
    }

    /* renamed from: f */
    public static final <T> int m153283f(C15925h<? extends T> hVar) {
        C87412m.m108594g(hVar, "<this>");
        Iterator<? extends T> it = hVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                C64197v.m75541j();
                throw null;
            }
        }
        return i;
    }

    /* renamed from: g */
    public static final <T> T m153284g(C15925h<? extends T> hVar, int i, C32226l<? super Integer, ? extends T> lVar) {
        C87412m.m108594g(hVar, "<this>");
        C87412m.m108594g(lVar, "defaultValue");
        if (i < 0) {
            return lVar.invoke(Integer.valueOf(i));
        }
        int i2 = 0;
        for (T next : hVar) {
            int i3 = i2 + 1;
            if (i == i2) {
                return next;
            }
            i2 = i3;
        }
        return lVar.invoke(Integer.valueOf(i));
    }

    /* renamed from: h */
    public static final <T> C15925h<T> m153285h(C15925h<? extends T> hVar, C32226l<? super T, Boolean> lVar) {
        C87412m.m108594g(hVar, "<this>");
        C87412m.m108594g(lVar, "predicate");
        return new C26620e(hVar, true, lVar);
    }

    /* renamed from: i */
    public static final <T> C15925h<T> m153286i(C15925h<? extends T> hVar, C32226l<? super T, Boolean> lVar) {
        C87412m.m108594g(hVar, "<this>");
        C87412m.m108594g(lVar, "predicate");
        return new C26620e(hVar, false, lVar);
    }

    /* renamed from: j */
    public static final <T> T m153287j(C15925h<? extends T> hVar) {
        C87412m.m108594g(hVar, "<this>");
        Iterator<? extends T> it = hVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    /* renamed from: k */
    public static final <T> T m153288k(C15925h<? extends T> hVar) {
        C87412m.m108594g(hVar, "<this>");
        Iterator<? extends T> it = hVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    /* renamed from: l */
    public static final <T, R> C15925h<R> m153289l(C15925h<? extends T> hVar, C32226l<? super T, ? extends C15925h<? extends R>> lVar) {
        C87412m.m108594g(hVar, "<this>");
        C87412m.m108594g(lVar, "transform");
        return new C91365f(hVar, lVar, C91367a.f262050d);
    }

    /* renamed from: m */
    public static final <T, R> C15925h<R> m153290m(C15925h<? extends T> hVar, C32226l<? super T, ? extends R> lVar) {
        C87412m.m108594g(hVar, "<this>");
        C87412m.m108594g(lVar, "transform");
        return new C66488v(hVar, lVar);
    }

    /* renamed from: n */
    public static final <T, R> C15925h<R> m153291n(C15925h<? extends T> hVar, C32226l<? super T, ? extends R> lVar) {
        C87412m.m108594g(hVar, "<this>");
        C87412m.m108594g(lVar, "transform");
        return m153286i(new C66488v(hVar, lVar), C15926r.f42793d);
    }

    /* renamed from: o */
    public static final <T extends Comparable<? super T>> T m153292o(C15925h<? extends T> hVar) {
        C87412m.m108594g(hVar, "<this>");
        Iterator<? extends T> it = hVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (Comparable) it.next();
        while (it.hasNext()) {
            T t2 = (Comparable) it.next();
            if (t.compareTo(t2) < 0) {
                t = t2;
            }
        }
        return t;
    }

    /* renamed from: p */
    public static final <T> C15925h<T> m153293p(C15925h<? extends T> hVar, Iterable<? extends T> iterable) {
        C87412m.m108594g(hVar, "<this>");
        C87412m.m108594g(iterable, "elements");
        return C112349m.m153280c(C112349m.m153282e(hVar, C110818d0.m150897A(iterable)));
    }

    /* renamed from: q */
    public static final <T> C15925h<T> m153294q(C15925h<? extends T> hVar, T t) {
        C87412m.m108594g(hVar, "<this>");
        return C112349m.m153280c(C112349m.m153282e(hVar, C112349m.m153282e(t)));
    }

    /* renamed from: r */
    public static final <T, C extends Collection<? super T>> C m153295r(C15925h<? extends T> hVar, C c) {
        C87412m.m108594g(hVar, "<this>");
        C87412m.m108594g(c, FirebaseAnalytics.C113379b.DESTINATION);
        for (Object add : hVar) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: s */
    public static final <T> List<T> m153296s(C15925h<? extends T> hVar) {
        C87412m.m108594g(hVar, "<this>");
        return C64197v.m75540i(m153297t(hVar));
    }

    /* renamed from: t */
    public static final <T> List<T> m153297t(C15925h<? extends T> hVar) {
        C87412m.m108594g(hVar, "<this>");
        ArrayList arrayList = new ArrayList();
        m153295r(hVar, arrayList);
        return arrayList;
    }
}
