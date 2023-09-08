package qk1;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Predicate;
import te3.C51059r51;

/* renamed from: qk1.o */
public final class C63244o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C63238n f179464d;

    /* renamed from: e */
    public final /* synthetic */ C51059r51 f179465e;

    /* renamed from: qk1.o$a */
    public static final class C63245a<T> implements Predicate {

        /* renamed from: a */
        public static final C63245a<T> f179466a = new C63245a<>();

        public boolean test(Object obj) {
            C51059r51 r512 = (C51059r51) obj;
            C87412m.m108594g(r512, LocaleUtil.ITALIAN);
            return r512.f140706e == -1000;
        }
    }

    public C63244o(C63238n nVar, C51059r51 r512) {
        this.f179464d = nVar;
        this.f179465e = r512;
    }

    public final void run() {
        LinkedList<C51059r51> linkedList = this.f179464d.f179453f;
        C87412m.m108591d(linkedList);
        Iterator<C51059r51> it = linkedList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().f140706e == -1000) {
                break;
            }
            i++;
        }
        LinkedList<C51059r51> linkedList2 = this.f179464d.f179453f;
        C87412m.m108591d(linkedList2);
        linkedList2.removeIf(C63245a.f179466a);
        if (i > 0) {
            LinkedList<C51059r51> linkedList3 = this.f179464d.f179453f;
            C87412m.m108591d(linkedList3);
            linkedList3.set(i, this.f179465e);
        } else {
            LinkedList<C51059r51> linkedList4 = this.f179464d.f179453f;
            C87412m.m108591d(linkedList4);
            linkedList4.add(0, this.f179465e);
        }
        this.f179464d.notifyDataSetChanged();
    }
}
