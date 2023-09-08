package p14;

import gy3.C8480h;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import l14.C24951b;
import n14.C25217e;

/* renamed from: p14.t */
public final class C25457t<E> extends C25459v<E, Set<? extends E>, LinkedHashSet<E>> {

    /* renamed from: b */
    public final C25217e f72065b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25457t(C24951b<E> bVar) {
        super(bVar, (C8480h) null);
        C87412m.m108594g(bVar, "eSerializer");
        this.f72065b = new C25456s(bVar.mo51996a());
    }

    /* renamed from: a */
    public C25217e mo51996a() {
        return this.f72065b;
    }

    /* renamed from: f */
    public Object mo52649f() {
        return new LinkedHashSet();
    }

    /* renamed from: g */
    public int mo52650g(Object obj) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        C87412m.m108594g(linkedHashSet, "$this$builderSize");
        return linkedHashSet.size();
    }

    /* renamed from: h */
    public void mo52651h(Object obj, int i) {
        C87412m.m108594g((LinkedHashSet) obj, "$this$checkCapacity");
    }

    /* renamed from: i */
    public Iterator mo52652i(Object obj) {
        Set set = (Set) obj;
        C87412m.m108594g(set, "$this$collectionIterator");
        return set.iterator();
    }

    /* renamed from: j */
    public int mo52653j(Object obj) {
        Set set = (Set) obj;
        C87412m.m108594g(set, "$this$collectionSize");
        return set.size();
    }

    /* renamed from: m */
    public Object mo52656m(Object obj) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        C87412m.m108594g(linkedHashSet, "$this$toResult");
        return linkedHashSet;
    }

    /* renamed from: n */
    public void mo52663n(Object obj, int i, Object obj2) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        C87412m.m108594g(linkedHashSet, "$this$insert");
        linkedHashSet.add(obj2);
    }
}
