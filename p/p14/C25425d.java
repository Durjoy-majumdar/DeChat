package p14;

import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l14.C24951b;
import n14.C25217e;

/* renamed from: p14.d */
public final class C25425d<E> extends C25459v<E, List<? extends E>, ArrayList<E>> {

    /* renamed from: b */
    public final C25217e f72012b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25425d(C24951b<E> bVar) {
        super(bVar, (C8480h) null);
        C87412m.m108594g(bVar, "element");
        this.f72012b = new C25423c(bVar.mo51996a());
    }

    /* renamed from: a */
    public C25217e mo51996a() {
        return this.f72012b;
    }

    /* renamed from: f */
    public Object mo52649f() {
        return new ArrayList();
    }

    /* renamed from: g */
    public int mo52650g(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        C87412m.m108594g(arrayList, "$this$builderSize");
        return arrayList.size();
    }

    /* renamed from: h */
    public void mo52651h(Object obj, int i) {
        ArrayList arrayList = (ArrayList) obj;
        C87412m.m108594g(arrayList, "$this$checkCapacity");
        arrayList.ensureCapacity(i);
    }

    /* renamed from: i */
    public Iterator mo52652i(Object obj) {
        List list = (List) obj;
        C87412m.m108594g(list, "$this$collectionIterator");
        return list.iterator();
    }

    /* renamed from: j */
    public int mo52653j(Object obj) {
        List list = (List) obj;
        C87412m.m108594g(list, "$this$collectionSize");
        return list.size();
    }

    /* renamed from: m */
    public Object mo52656m(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        C87412m.m108594g(arrayList, "$this$toResult");
        return arrayList;
    }

    /* renamed from: n */
    public void mo52663n(Object obj, int i, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        C87412m.m108594g(arrayList, "$this$insert");
        arrayList.add(i, obj2);
    }
}
