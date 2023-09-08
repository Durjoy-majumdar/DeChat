package sx3;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import my3.C61594j;

/* renamed from: sx3.v */
public class C64197v extends C26236u {
    /* renamed from: c */
    public static final <T> ArrayList<T> m75534c(T... tArr) {
        C87412m.m108594g(tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new C64189j(tArr, true));
    }

    /* renamed from: d */
    public static final C61594j m75535d(Collection<?> collection) {
        C87412m.m108594g(collection, "<this>");
        return new C61594j(0, collection.size() - 1);
    }

    /* renamed from: e */
    public static final <T> int m75536e(List<? extends T> list) {
        C87412m.m108594g(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: f */
    public static final <T> List<T> m75537f(T... tArr) {
        C87412m.m108594g(tArr, "elements");
        return tArr.length > 0 ? C110821n.m150958e(tArr) : C64186f0.f181907d;
    }

    /* renamed from: g */
    public static final <T> List<T> m75538g(T t) {
        return t != null ? C26236u.m33719b(t) : C64186f0.f181907d;
    }

    /* renamed from: h */
    public static final <T> List<T> m75539h(T... tArr) {
        C87412m.m108594g(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new C64189j(tArr, true));
    }

    /* renamed from: i */
    public static final <T> List<T> m75540i(List<? extends T> list) {
        C87412m.m108594g(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : C26236u.m33719b(list.get(0)) : C64186f0.f181907d;
    }

    /* renamed from: j */
    public static final void m75541j() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* renamed from: k */
    public static final void m75542k() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
