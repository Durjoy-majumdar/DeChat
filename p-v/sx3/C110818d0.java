package sx3;

import com.google.firebase.analytics.FirebaseAnalytics;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import ky3.C88334c;
import my3.C61594j;
import rx3.C13604l;
import wx3.C15601d;
import xx3.C66447b;
import y04.C15925h;
import y04.C66485i;
import z04.C66724o;

/* renamed from: sx3.d0 */
public class C110818d0 extends C13798c0 {

    /* renamed from: sx3.d0$a */
    public static final class C64182a implements C15925h<T> {

        /* renamed from: a */
        public final /* synthetic */ Iterable f181904a;

        public C64182a(Iterable iterable) {
            this.f181904a = iterable;
        }

        public Iterator<T> iterator() {
            return this.f181904a.iterator();
        }
    }

    /* renamed from: sx3.d0$b */
    public static final class C64183b extends C87413o implements C32226l<Integer, T> {

        /* renamed from: d */
        public final /* synthetic */ int f181905d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64183b(int i) {
            super(1);
            this.f181905d = i;
        }

        public Object invoke(Object obj) {
            ((Number) obj).intValue();
            throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.f181905d + '.');
        }
    }

    /* renamed from: sx3.d0$c */
    public static final class C110819c extends C87413o implements C32224a<Iterator<? extends T>> {

        /* renamed from: d */
        public final /* synthetic */ Iterable<T> f331545d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110819c(Iterable<? extends T> iterable) {
            super(0);
            this.f331545d = iterable;
        }

        public Object invoke() {
            return this.f331545d.iterator();
        }
    }

    /* renamed from: A */
    public static final <T> C15925h<T> m150897A(Iterable<? extends T> iterable) {
        C87412m.m108594g(iterable, "<this>");
        return new C64182a(iterable);
    }

    /* renamed from: A0 */
    public static final <T> List<T> m150898A0(Iterable<? extends T> iterable) {
        C87412m.m108594g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m150900B0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m150949u0(iterable, arrayList);
        return arrayList;
    }

    /* renamed from: B */
    public static final double m150899B(Iterable<Integer> iterable) {
        C87412m.m108594g(iterable, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Integer intValue : iterable) {
            d += (double) intValue.intValue();
            i++;
            if (i < 0) {
                C64197v.m75541j();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / ((double) i);
    }

    /* renamed from: B0 */
    public static final <T> List<T> m150900B0(Collection<? extends T> collection) {
        C87412m.m108594g(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: C */
    public static final <T> List<List<T>> m150901C(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        Iterator it;
        C87412m.m108594g(iterable, "<this>");
        C36902a1.m41087a(i, i);
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            arrayList = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
            int i2 = 0;
            while (true) {
                if (!(i2 >= 0 && i2 < size)) {
                    break;
                }
                int i3 = size - i2;
                if (i <= i3) {
                    i3 = i;
                }
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    arrayList2.add(list.get(i4 + i2));
                }
                arrayList.add(arrayList2);
                i2 += i;
            }
        } else {
            arrayList = new ArrayList();
            Iterator<? extends T> it4 = iterable.iterator();
            C87412m.m108594g(it4, "iterator");
            if (!it4.hasNext()) {
                it = C64184e0.f181906d;
            } else {
                C110827z0 z0Var = new C110827z0(i, i, it4, false, true, (C15601d<? super C110827z0>) null);
                C66485i iVar = new C66485i();
                iVar.f191267f = C66447b.m78391a(z0Var, iVar, iVar);
                it = iVar;
            }
            while (it.hasNext()) {
                arrayList.add((List) it.next());
            }
        }
        return arrayList;
    }

    /* renamed from: C0 */
    public static final <T> Set<T> m150902C0(Iterable<? extends T> iterable) {
        C87412m.m108594g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m150949u0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: D */
    public static final <T> boolean m150903D(Iterable<? extends T> iterable, T t) {
        int i;
        C87412m.m108594g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        if (!(iterable instanceof List)) {
            Iterator<? extends T> it = iterable.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (i2 < 0) {
                    C64197v.m75542k();
                    throw null;
                } else if (C87412m.m108589b(t, next)) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            i = ((List) iterable).indexOf(t);
        }
        return i >= 0;
    }

    /* renamed from: D0 */
    public static final <T> Set<T> m150904D0(Iterable<? extends T> iterable) {
        C87412m.m108594g(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return C64187h0.f181908d;
            }
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(C90363p0.m113142a(collection.size()));
                m150949u0(iterable, linkedHashSet);
                return linkedHashSet;
            }
            return C22415w0.m26092a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        m150949u0(iterable, linkedHashSet2);
        return C110826x0.m151016d(linkedHashSet2);
    }

    /* renamed from: E */
    public static final <T> List<T> m150905E(Iterable<? extends T> iterable) {
        C87412m.m108594g(iterable, "<this>");
        return m150953y0(m150902C0(iterable));
    }

    /* renamed from: E0 */
    public static final <T> Iterable<C64188i0<T>> m150906E0(Iterable<? extends T> iterable) {
        C87412m.m108594g(iterable, "<this>");
        return new C26234j0(new C110819c(iterable));
    }

    /* renamed from: F */
    public static final <T> List<T> m150907F(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        C87412m.m108594g(iterable, "<this>");
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return m150953y0(iterable);
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i;
                if (size <= 0) {
                    return C64186f0.f181907d;
                }
                if (size == 1) {
                    return C26236u.m33719b(m150922T(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i < size2) {
                            arrayList.add(((List) iterable).get(i));
                            i++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            for (Object next : iterable) {
                if (i2 >= i) {
                    arrayList.add(next);
                } else {
                    i2++;
                }
            }
            return C64197v.m75540i(arrayList);
        }
    }

    /* renamed from: F0 */
    public static final <T, R> List<C13604l<T, R>> m150908F0(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        C87412m.m108594g(iterable, "<this>");
        C87412m.m108594g(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it4 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C36907w.m41090l(iterable, 10), C36907w.m41090l(iterable2, 10)));
        while (it.hasNext() && it4.hasNext()) {
            arrayList.add(new C13604l(it.next(), it4.next()));
        }
        return arrayList;
    }

    /* renamed from: G */
    public static final <T> List<T> m150909G(List<? extends T> list, int i) {
        C87412m.m108594g(list, "<this>");
        int i2 = 0;
        if (i >= 0) {
            int size = list.size() - i;
            if (size >= 0) {
                i2 = size;
            }
            return m150947s0(list, i2);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    /* renamed from: H */
    public static final <T> T m150910H(Iterable<? extends T> iterable, int i) {
        C87412m.m108594g(iterable, "<this>");
        boolean z = iterable instanceof List;
        if (z) {
            return ((List) iterable).get(i);
        }
        C64183b bVar = new C64183b(i);
        if (z) {
            List list = (List) iterable;
            if (i >= 0 && i <= C64197v.m75536e(list)) {
                return list.get(i);
            }
            bVar.invoke(Integer.valueOf(i));
            throw null;
        } else if (i >= 0) {
            int i2 = 0;
            for (T next : iterable) {
                int i3 = i2 + 1;
                if (i == i2) {
                    return next;
                }
                i2 = i3;
            }
            bVar.invoke(Integer.valueOf(i));
            throw null;
        } else {
            bVar.invoke(Integer.valueOf(i));
            throw null;
        }
    }

    /* renamed from: I */
    public static final <T> List<T> m150911I(Iterable<? extends T> iterable, C32226l<? super T, Boolean> lVar) {
        C87412m.m108594g(iterable, "<this>");
        C87412m.m108594g(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (lVar.invoke(next).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: J */
    public static final <T> List<T> m150912J(Iterable<? extends T> iterable) {
        C87412m.m108594g(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: K */
    public static final <T> T m150913K(Iterable<? extends T> iterable) {
        C87412m.m108594g(iterable, "<this>");
        if (iterable instanceof List) {
            return m150914L((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: L */
    public static final <T> T m150914L(List<? extends T> list) {
        C87412m.m108594g(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: M */
    public static final <T> T m150915M(Iterable<? extends T> iterable) {
        C87412m.m108594g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    /* renamed from: N */
    public static final <T> T m150916N(List<? extends T> list) {
        C87412m.m108594g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: O */
    public static final <T> T m150917O(List<? extends T> list, int i) {
        C87412m.m108594g(list, "<this>");
        if (i < 0 || i > C64197v.m75536e(list)) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: P */
    public static final <T> int m150918P(List<? extends T> list, T t) {
        C87412m.m108594g(list, "<this>");
        return list.indexOf(t);
    }

    /* renamed from: Q */
    public static final <T, A extends Appendable> A m150919Q(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C32226l<? super T, ? extends CharSequence> lVar) {
        C87412m.m108594g(iterable, "<this>");
        C87412m.m108594g(a, "buffer");
        C87412m.m108594g(charSequence, "separator");
        C87412m.m108594g(charSequence2, "prefix");
        C87412m.m108594g(charSequence3, "postfix");
        C87412m.m108594g(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C66724o.m78727a(a, next, lVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: R */
    public static /* synthetic */ Appendable m150920R(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C32226l lVar, int i2, Object obj) {
        String str = (i2 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        m150919Q(iterable, appendable, str, charSequence6, charSequence5, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? "..." : charSequence4, (i2 & 64) != 0 ? null : lVar);
        return appendable;
    }

    /* renamed from: S */
    public static String m150921S(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C32226l lVar, int i2, Object obj) {
        String str = (i2 & 1) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i3 = (i2 & 8) != 0 ? -1 : i;
        String str2 = (i2 & 16) != 0 ? "..." : charSequence4;
        C32226l lVar2 = (i2 & 32) != 0 ? null : lVar;
        Iterable iterable2 = iterable;
        C87412m.m108594g(iterable, "<this>");
        C87412m.m108594g(str, "separator");
        C87412m.m108594g(charSequence6, "prefix");
        C87412m.m108594g(charSequence5, "postfix");
        C87412m.m108594g(str2, "truncated");
        StringBuilder sb = new StringBuilder();
        m150919Q(iterable, sb, str, charSequence6, charSequence5, i3, str2, lVar2);
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb4;
    }

    /* renamed from: T */
    public static final <T> T m150922T(Iterable<? extends T> iterable) {
        C87412m.m108594g(iterable, "<this>");
        if (iterable instanceof List) {
            return m150923U((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: U */
    public static final <T> T m150923U(List<? extends T> list) {
        C87412m.m108594g(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(C64197v.m75536e(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: V */
    public static final <T> T m150924V(Iterable<? extends T> iterable) {
        C87412m.m108594g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* renamed from: W */
    public static final <T> T m150925W(List<? extends T> list) {
        C87412m.m108594g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* renamed from: X */
    public static final <T, R> List<R> m150926X(Iterable<? extends T> iterable, C32226l<? super T, ? extends R> lVar) {
        C87412m.m108594g(iterable, "<this>");
        C87412m.m108594g(lVar, "transform");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(iterable, 10));
        for (Object invoke : iterable) {
            arrayList.add(lVar.invoke(invoke));
        }
        return arrayList;
    }

    /* renamed from: Y */
    public static final <T extends Comparable<? super T>> T m150927Y(Iterable<? extends T> iterable) {
        C87412m.m108594g(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
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

    /* renamed from: Z */
    public static final Float m150928Z(Iterable<Float> iterable) {
        C87412m.m108594g(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: a0 */
    public static final <T extends Comparable<? super T>> T m150929a0(Iterable<? extends T> iterable) {
        C87412m.m108594g(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (Comparable) it.next();
        while (it.hasNext()) {
            T t2 = (Comparable) it.next();
            if (t.compareTo(t2) > 0) {
                t = t2;
            }
        }
        return t;
    }

    /* renamed from: b0 */
    public static final <T> List<T> m150930b0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C87412m.m108594g(iterable, "<this>");
        C87412m.m108594g(iterable2, "elements");
        Collection<? extends T> a = C48499r.m53870a(iterable2, iterable);
        if (a.isEmpty()) {
            return m150953y0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (!a.contains(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: c0 */
    public static final <T> List<T> m150931c0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C87412m.m108594g(iterable, "<this>");
        C87412m.m108594g(iterable2, "elements");
        if (iterable instanceof Collection) {
            return m150933e0((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        C64175a0.m75508p(arrayList, iterable);
        C64175a0.m75508p(arrayList, iterable2);
        return arrayList;
    }

    /* renamed from: d0 */
    public static final <T> List<T> m150932d0(Iterable<? extends T> iterable, T t) {
        C87412m.m108594g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m150934f0((Collection) iterable, t);
        }
        ArrayList arrayList = new ArrayList();
        C64175a0.m75508p(arrayList, iterable);
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: e0 */
    public static final <T> List<T> m150933e0(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        C87412m.m108594g(collection, "<this>");
        C87412m.m108594g(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        C64175a0.m75508p(arrayList2, iterable);
        return arrayList2;
    }

    /* renamed from: f0 */
    public static final <T> List<T> m150934f0(Collection<? extends T> collection, T t) {
        C87412m.m108594g(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: g0 */
    public static final <T> T m150935g0(Collection<? extends T> collection, C88334c cVar) {
        C87412m.m108594g(collection, "<this>");
        C87412m.m108594g(cVar, "random");
        if (collection.isEmpty()) {
            return null;
        }
        return m150910H(collection, cVar.mo122718g(collection.size()));
    }

    /* renamed from: h0 */
    public static final <T> List<T> m150936h0(Iterable<? extends T> iterable) {
        C87412m.m108594g(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return m150953y0(iterable);
        }
        List<T> A0 = m150898A0(iterable);
        Collections.reverse(A0);
        return A0;
    }

    /* renamed from: i0 */
    public static final <T> T m150937i0(Iterable<? extends T> iterable) {
        C87412m.m108594g(iterable, "<this>");
        if (iterable instanceof List) {
            return m150938j0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: j0 */
    public static final <T> T m150938j0(List<? extends T> list) {
        C87412m.m108594g(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    /* renamed from: k0 */
    public static final <T> T m150939k0(Iterable<? extends T> iterable) {
        C87412m.m108594g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    /* renamed from: l0 */
    public static final <T> T m150940l0(List<? extends T> list) {
        C87412m.m108594g(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* renamed from: m0 */
    public static final <T> List<T> m150941m0(List<? extends T> list, C61594j jVar) {
        C87412m.m108594g(list, "<this>");
        C87412m.m108594g(jVar, "indices");
        return jVar.isEmpty() ? C64186f0.f181907d : m150953y0(list.subList(jVar.mo59687f0().intValue(), jVar.mo59688g0().intValue() + 1));
    }

    /* renamed from: n0 */
    public static final <T extends Comparable<? super T>> List<T> m150942n0(Iterable<? extends T> iterable) {
        C87412m.m108594g(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return m150953y0(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            Comparable[] comparableArr = (Comparable[]) array;
            if (comparableArr.length > 1) {
                Arrays.sort(comparableArr);
            }
            return C110821n.m150958e(comparableArr);
        }
        List<T> A0 = m150898A0(iterable);
        C77813z.m93908n(A0);
        return A0;
    }

    /* renamed from: o0 */
    public static final <T> List<T> m150943o0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        C87412m.m108594g(iterable, "<this>");
        C87412m.m108594g(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return m150953y0(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            C110821n.m150973t(array, comparator);
            return C110821n.m150958e(array);
        }
        List<T> A0 = m150898A0(iterable);
        C77813z.m93909o(A0, comparator);
        return A0;
    }

    /* renamed from: p0 */
    public static final float m150944p0(Iterable<Float> iterable) {
        C87412m.m108594g(iterable, "<this>");
        float f = 0.0f;
        for (Float floatValue : iterable) {
            f += floatValue.floatValue();
        }
        return f;
    }

    /* renamed from: q0 */
    public static final int m150945q0(Iterable<Integer> iterable) {
        C87412m.m108594g(iterable, "<this>");
        int i = 0;
        for (Integer intValue : iterable) {
            i += intValue.intValue();
        }
        return i;
    }

    /* renamed from: r0 */
    public static final long m150946r0(Iterable<Long> iterable) {
        C87412m.m108594g(iterable, "<this>");
        long j = 0;
        for (Long longValue : iterable) {
            j += longValue.longValue();
        }
        return j;
    }

    /* renamed from: s0 */
    public static final <T> List<T> m150947s0(Iterable<? extends T> iterable, int i) {
        C87412m.m108594g(iterable, "<this>");
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return C64186f0.f181907d;
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return m150953y0(iterable);
                }
                if (i == 1) {
                    return C26236u.m33719b(m150913K(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            for (Object add : iterable) {
                arrayList.add(add);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return C64197v.m75540i(arrayList);
        }
    }

    /* renamed from: t0 */
    public static final <T> List<T> m150948t0(List<? extends T> list, int i) {
        C87412m.m108594g(list, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return C64186f0.f181907d;
        } else {
            int size = list.size();
            if (i >= size) {
                return m150953y0(list);
            }
            if (i == 1) {
                return C26236u.m33719b(m150923U(list));
            }
            ArrayList arrayList = new ArrayList(i);
            if (list instanceof RandomAccess) {
                for (int i2 = size - i; i2 < size; i2++) {
                    arrayList.add(list.get(i2));
                }
            } else {
                ListIterator<? extends T> listIterator = list.listIterator(size - i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
    }

    /* renamed from: u0 */
    public static final <T, C extends Collection<? super T>> C m150949u0(Iterable<? extends T> iterable, C c) {
        C87412m.m108594g(iterable, "<this>");
        C87412m.m108594g(c, FirebaseAnalytics.C113379b.DESTINATION);
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: v0 */
    public static final float[] m150950v0(Collection<Float> collection) {
        C87412m.m108594g(collection, "<this>");
        float[] fArr = new float[collection.size()];
        int i = 0;
        for (Float floatValue : collection) {
            fArr[i] = floatValue.floatValue();
            i++;
        }
        return fArr;
    }

    /* renamed from: w0 */
    public static final <T> HashSet<T> m150951w0(Iterable<? extends T> iterable) {
        C87412m.m108594g(iterable, "<this>");
        HashSet<T> hashSet = new HashSet<>(C90363p0.m113142a(C36907w.m41090l(iterable, 12)));
        m150949u0(iterable, hashSet);
        HashSet hashSet2 = hashSet;
        return hashSet;
    }

    /* renamed from: x0 */
    public static final int[] m150952x0(Collection<Integer> collection) {
        C87412m.m108594g(collection, "<this>");
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Integer intValue : collection) {
            iArr[i] = intValue.intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: y0 */
    public static final <T> List<T> m150953y0(Iterable<? extends T> iterable) {
        C87412m.m108594g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C64197v.m75540i(m150898A0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C64186f0.f181907d;
        }
        if (size != 1) {
            return m150900B0(collection);
        }
        return C26236u.m33719b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: z0 */
    public static final long[] m150954z0(Collection<Long> collection) {
        C87412m.m108594g(collection, "<this>");
        long[] jArr = new long[collection.size()];
        int i = 0;
        for (Long longValue : collection) {
            jArr[i] = longValue.longValue();
            i++;
        }
        return jArr;
    }
}
