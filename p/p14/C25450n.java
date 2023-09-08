package p14;

import gy3.C8480h;
import gy3.C87412m;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import l14.C24951b;
import n14.C25217e;

/* renamed from: p14.n */
public final class C25450n<E> extends C25459v<E, Set<? extends E>, HashSet<E>> {

    /* renamed from: b */
    public final C25217e f72057b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25450n(C24951b<E> bVar) {
        super(bVar, (C8480h) null);
        C87412m.m108594g(bVar, "eSerializer");
        this.f72057b = new C25448m(bVar.mo51996a());
    }

    /* renamed from: a */
    public C25217e mo51996a() {
        return this.f72057b;
    }

    /* renamed from: f */
    public Object mo52649f() {
        return new HashSet();
    }

    /* renamed from: g */
    public int mo52650g(Object obj) {
        HashSet hashSet = (HashSet) obj;
        C87412m.m108594g(hashSet, "$this$builderSize");
        return hashSet.size();
    }

    /* renamed from: h */
    public void mo52651h(Object obj, int i) {
        C87412m.m108594g((HashSet) obj, "$this$checkCapacity");
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
        HashSet hashSet = (HashSet) obj;
        C87412m.m108594g(hashSet, "$this$toResult");
        return hashSet;
    }

    /* renamed from: n */
    public void mo52663n(Object obj, int i, Object obj2) {
        HashSet hashSet = (HashSet) obj;
        C87412m.m108594g(hashSet, "$this$insert");
        hashSet.add(obj2);
    }
}
