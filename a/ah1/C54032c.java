package ah1;

import cl1.C0702z0;
import cl1.C54991o;
import fj1.C45795b;
import gy3.C87412m;
import java.util.LinkedList;
import te3.C64674r41;
import yg1.C66640h;

/* renamed from: ah1.c */
public final class C54032c extends C66640h {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54032c(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: d */
    public void mo74693d(LinkedList<C64674r41> linkedList) {
        Class cls = C0702z0.class;
        C87412m.m108594g(linkedList, "msgList");
        ((C0702z0) this.f191616a.mo71262a(cls)).f1674h.clear();
        ((C0702z0) this.f191616a.mo71262a(cls)).f1674h.addAll(linkedList);
    }

    /* renamed from: e */
    public boolean mo74695e(C64674r41 r412) {
        C87412m.m108594g(r412, "appMsg");
        return !((C54991o) this.f191616a.mo71262a(C54991o.class)).f154216J2.contains(r412.f185133p);
    }

    /* renamed from: f */
    public int[] mo74694f() {
        return new int[]{10017};
    }
}
