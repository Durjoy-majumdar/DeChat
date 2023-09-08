package c04;

import gy3.C87412m;

/* renamed from: c04.a */
public abstract class C0409a implements Comparable<C0409a> {
    /* renamed from: a */
    public abstract C0410b mo455a();

    /* renamed from: b */
    public abstract boolean mo456b();

    public int compareTo(Object obj) {
        C0409a aVar = (C0409a) obj;
        C87412m.m108594g(aVar, "other");
        int compareTo = mo455a().compareTo(aVar.mo455a());
        if (compareTo != 0 || mo456b() || !aVar.mo456b()) {
            return compareTo;
        }
        return 1;
    }
}
