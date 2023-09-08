package bb3;

import cb3.C92393d;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import sx3.C64197v;
import xa3.C102587c;
import xa3.C102600p;

/* renamed from: bb3.e */
public final class C92225e {

    /* renamed from: a */
    public static final C92225e f263960a = new C92225e();

    /* renamed from: bb3.e$a */
    public static final class C28292a {

        /* renamed from: a */
        public final int f77882a;

        /* renamed from: b */
        public final int f77883b;

        public C28292a(int i, int i2) {
            this.f77882a = i;
            this.f77883b = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C28292a)) {
                return false;
            }
            C28292a aVar = (C28292a) obj;
            return this.f77882a == aVar.f77882a && this.f77883b == aVar.f77883b;
        }

        public int hashCode() {
            return (this.f77882a * 31) + this.f77883b;
        }

        public String toString() {
            return "InsertResult(pos=" + this.f77882a + ", subOffset=" + this.f77883b + ')';
        }
    }

    /* renamed from: a */
    public final boolean mo126219a(C92221d dVar, WXRTEditText wXRTEditText, String str, List<? extends C102587c> list) {
        int recyclerItemPosition;
        C87412m.m108594g(dVar, "dataManager");
        C87412m.m108594g(str, "inputText");
        C87412m.m108594g(list, "insertItems");
        if (wXRTEditText == null || (recyclerItemPosition = wXRTEditText.getRecyclerItemPosition()) >= dVar.mo126186F()) {
            return false;
        }
        C102587c k = dVar.mo126201k(recyclerItemPosition);
        C102600p pVar = null;
        C102600p pVar2 = k instanceof C102600p ? (C102600p) k : null;
        if (pVar2 == null) {
            return false;
        }
        int i = wXRTEditText.f283163R0;
        int h = pVar2.mo142218h();
        if (i > 0 && i < h) {
            pVar = new C102600p();
            Iterator<C102587c> it = pVar2.f302102s.iterator();
            C87412m.m108593f(it, "dataList.iterator()");
            int i2 = 0;
            while (it.hasNext()) {
                C102587c next = it.next();
                C87412m.m108593f(next, "iter.next()");
                C102587c cVar = next;
                if (i2 >= i) {
                    it.remove();
                    pVar.f302102s.addLast(cVar);
                }
                i2++;
            }
        }
        if (pVar == null) {
            return false;
        }
        pVar2.f302071b = false;
        pVar.f302071b = true;
        pVar.f302077h = true;
        if (C87412m.m108589b(str, "<br/>")) {
            dVar.mo126191a(recyclerItemPosition + 1, pVar, true);
        } else {
            int i3 = recyclerItemPosition + 1;
            dVar.mo126191a(i3, pVar, true);
            for (C102587c a : list) {
                dVar.mo126191a(i3, a, true);
                i3++;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo126220b(int i, List<C102587c> list) {
        C87412m.m108594g(list, "oriData");
        C102587c cVar = list.get(i);
        C102587c cVar2 = null;
        C102600p pVar = cVar instanceof C102600p ? (C102600p) cVar : null;
        if (pVar == null) {
            return false;
        }
        if (!(pVar.mo142218h() > 3)) {
            return false;
        }
        C102587c removeLast = pVar.f302102s.removeLast();
        C87412m.m108593f(removeLast, "dataList.removeLast()");
        C102587c cVar3 = removeLast;
        int i2 = i + 1;
        if (list.size() > i2) {
            cVar2 = list.get(i2);
        }
        if (!(cVar2 instanceof C102600p)) {
            C102600p pVar2 = new C102600p();
            pVar2.mo142216f(cVar3);
            list.add(i2, pVar2);
        } else {
            C102600p pVar3 = (C102600p) cVar2;
            pVar3.getClass();
            pVar3.f302102s.addFirst(cVar3);
            mo126220b(i2, list);
        }
        return true;
    }

    /* renamed from: c */
    public final List<C102587c> mo126221c(List<? extends C102587c> list) {
        C87412m.m108594g(list, "oriDataList");
        LinkedList linkedList = new LinkedList();
        if (!list.isEmpty()) {
            for (C102587c cVar : list) {
                if (cVar instanceof C102600p) {
                    for (C102587c add : ((C102600p) cVar).f302102s) {
                        linkedList.add(add);
                    }
                } else {
                    linkedList.add(cVar);
                }
            }
        }
        return linkedList;
    }

    /* renamed from: d */
    public final boolean mo126222d(int i, boolean z, List<C102587c> list, C92393d dVar, C92221d dVar2) {
        int i2;
        C87412m.m108594g(list, "oriData");
        C87412m.m108594g(dVar2, "noteDataManager");
        C102587c cVar = list.get(i);
        if (!(cVar instanceof C102600p) || dVar == null || (i2 = dVar.f264399a) != dVar.f264401c || i2 != i) {
            return false;
        }
        LinkedList linkedList = new LinkedList();
        int i3 = dVar.f264400b;
        int i4 = dVar.f264402d;
        C102600p pVar = (C102600p) cVar;
        Iterator<T> it = pVar.f302102s.iterator();
        int i5 = 0;
        while (true) {
            boolean z2 = true;
            if (it.hasNext()) {
                T next = it.next();
                int i6 = i5 + 1;
                if (i5 >= 0) {
                    C102587c cVar2 = (C102587c) next;
                    if (i3 > i5 || i5 >= i4) {
                        z2 = false;
                    }
                    if (!z2) {
                        linkedList.add(cVar2);
                    }
                    i5 = i6;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            } else {
                pVar.f302102s.clear();
                pVar.f302102s.addAll(linkedList);
                if (pVar.mo142218h() == 0) {
                    dVar2.mo126215y(i, false);
                }
                return true;
            }
        }
    }
}
