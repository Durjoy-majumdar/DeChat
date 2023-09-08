package p40;

import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: p40.a */
public final class C62192a<T> extends C47427b<T> {
    public C62192a(List list, C8480h hVar) {
        super(list);
    }

    /* renamed from: a */
    public final List<T> mo87250a() {
        ArrayList arrayList;
        List<E> list = this.f127225a;
        C87412m.m108593f(list, "list");
        synchronized (list) {
            arrayList = new ArrayList();
            arrayList.addAll(this.f127225a);
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List<T> mo87251b(C32226l<? super T, Boolean> lVar) {
        ArrayList arrayList;
        C87412m.m108594g(lVar, "predicate");
        List<E> list = this.f127225a;
        C87412m.m108593f(list, "list");
        synchronized (list) {
            arrayList = new ArrayList();
            for (T next : list) {
                if (lVar.invoke(next).booleanValue()) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final int mo87252c() {
        return this.f127225a.size();
    }

    /* renamed from: d */
    public final int mo87253d(C32226l<? super T, Boolean> lVar) {
        int i;
        C87412m.m108594g(lVar, "predicate");
        List<E> list = this.f127225a;
        C87412m.m108593f(list, "list");
        synchronized (list) {
            i = 0;
            Iterator<E> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (lVar.invoke(it.next()).booleanValue()) {
                    break;
                } else {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: e */
    public final boolean mo87254e() {
        return this.f127225a.isEmpty();
    }
}
