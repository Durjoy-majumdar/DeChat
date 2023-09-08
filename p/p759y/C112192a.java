package p759y;

import gy3.C87412m;
import java.util.List;
import p1166z0.C112539e;
import p190l1.C109106l;
import p190l1.C109111s;
import p560i2.C108322d;

/* renamed from: y.a */
public final class C112192a implements C112266n0 {

    /* renamed from: a */
    public static final C112192a f335895a = new C112192a();

    /* renamed from: a */
    public long mo163998a(C108322d dVar, C109106l lVar, long j) {
        C87412m.m108594g(dVar, "$this$calculateMouseWheelScroll");
        C87412m.m108594g(lVar, "event");
        List<C109111s> list = lVar.f326709a;
        int i = C112539e.f336958e;
        C112539e eVar = new C112539e(C112539e.f336955b);
        int i2 = 0;
        int size = list.size();
        while (i2 < size) {
            i2++;
            eVar = new C112539e(C112539e.m153742g(eVar.f336959a, list.get(i2).f326725i));
        }
        return C112539e.m153743h(eVar.f336959a, -dVar.mo143034T((float) 64));
    }
}
