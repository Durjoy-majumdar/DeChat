package p1143q2;

import java.util.ArrayList;
import java.util.HashSet;
import p1042u.C111059i;
import p329d3.C106985e;
import p329d3.C86167d;

/* renamed from: q2.a */
public final class C110349a<T> {

    /* renamed from: a */
    public final C86167d<ArrayList<T>> f330087a = new C106985e(10);

    /* renamed from: b */
    public final C111059i<T, ArrayList<T>> f330088b = new C111059i<>();

    /* renamed from: c */
    public final ArrayList<T> f330089c = new ArrayList<>();

    /* renamed from: d */
    public final HashSet<T> f330090d = new HashSet<>();

    /* renamed from: a */
    public final void mo161842a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList orDefault = this.f330088b.getOrDefault(t, null);
                if (orDefault != null) {
                    int size = orDefault.size();
                    for (int i = 0; i < size; i++) {
                        mo161842a(orDefault.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }
}
