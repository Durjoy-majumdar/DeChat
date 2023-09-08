package sx3;

import fy3.C32226l;
import gy3.C24564k0;
import gy3.C87412m;
import hy3.C33145a;
import hy3.C60232c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import my3.C34690i;
import my3.C61594j;

/* renamed from: sx3.a0 */
public class C64175a0 extends C77813z {
    /* renamed from: p */
    public static final <T> boolean m75508p(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C87412m.m108594g(collection, "<this>");
        C87412m.m108594g(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: q */
    public static final <T> boolean m75509q(Collection<? super T> collection, T[] tArr) {
        C87412m.m108594g(collection, "<this>");
        C87412m.m108594g(tArr, "elements");
        return collection.addAll(C110821n.m150958e(tArr));
    }

    /* renamed from: r */
    public static final <T> boolean m75510r(Iterable<? extends T> iterable, C32226l<? super T, Boolean> lVar, boolean z) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: s */
    public static final <T> boolean m75511s(Iterable<? extends T> iterable, C32226l<? super T, Boolean> lVar) {
        C87412m.m108594g(iterable, "<this>");
        C87412m.m108594g(lVar, "predicate");
        return m75510r(iterable, lVar, true);
    }

    /* renamed from: t */
    public static final <T> boolean m75512t(List<T> list, C32226l<? super T, Boolean> lVar) {
        C87412m.m108594g(list, "<this>");
        C87412m.m108594g(lVar, "predicate");
        if (list instanceof RandomAccess) {
            C36904l0 i = new C61594j(0, C64197v.m75536e(list)).iterator();
            int i2 = 0;
            while (((C34690i) i).f93287f) {
                int a = i.mo59695a();
                T t = list.get(a);
                if (!lVar.invoke(t).booleanValue()) {
                    if (i2 != a) {
                        list.set(i2, t);
                    }
                    i2++;
                }
            }
            if (i2 >= list.size()) {
                return false;
            }
            int e = C64197v.m75536e(list);
            if (i2 <= e) {
                while (true) {
                    list.remove(e);
                    if (e == i2) {
                        break;
                    }
                    e--;
                }
            }
            return true;
        } else if (!(list instanceof C33145a) || (list instanceof C60232c)) {
            return m75510r(list, lVar, true);
        } else {
            C24564k0.m30746j(list, "kotlin.collections.MutableIterable");
            throw null;
        }
    }

    /* renamed from: u */
    public static final <T> T m75513u(List<T> list) {
        C87412m.m108594g(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: v */
    public static final <T> T m75514v(List<T> list) {
        C87412m.m108594g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    /* renamed from: w */
    public static final <T> T m75515w(List<T> list) {
        C87412m.m108594g(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(C64197v.m75536e(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: x */
    public static final <T> T m75516x(List<T> list) {
        C87412m.m108594g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(C64197v.m75536e(list));
    }
}
