package zy3;

import gy3.C87412m;
import java.util.List;
import java.util.Set;

/* renamed from: zy3.y */
public final class C23598y implements C23597x {

    /* renamed from: a */
    public final List<C26729b0> f67735a;

    /* renamed from: b */
    public final Set<C26729b0> f67736b;

    /* renamed from: c */
    public final List<C26729b0> f67737c;

    /* renamed from: d */
    public final Set<C26729b0> f67738d;

    public C23598y(List<C26729b0> list, Set<C26729b0> set, List<C26729b0> list2, Set<C26729b0> set2) {
        C87412m.m108594g(list, "allDependencies");
        C87412m.m108594g(set, "modulesWhoseInternalsAreVisible");
        C87412m.m108594g(list2, "directExpectedByDependencies");
        C87412m.m108594g(set2, "allExpectedByDependencies");
        this.f67735a = list;
        this.f67736b = set;
        this.f67737c = list2;
        this.f67738d = set2;
    }

    /* renamed from: a */
    public List<C26729b0> mo37075a() {
        return this.f67737c;
    }

    /* renamed from: b */
    public List<C26729b0> mo37076b() {
        return this.f67735a;
    }

    /* renamed from: c */
    public Set<C26729b0> mo37077c() {
        return this.f67736b;
    }
}
