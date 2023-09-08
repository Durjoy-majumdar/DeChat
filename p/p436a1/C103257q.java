package p436a1;

import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import p1166z0.C112540f;
import p1166z0.C112545k;

/* renamed from: a1.q */
public abstract class C103257q {

    /* renamed from: a */
    public static final C103258a f304461a = new C103258a((C8480h) null);

    /* renamed from: a1.q$a */
    public static final class C103258a {
        public C103258a(C8480h hVar) {
        }

        /* renamed from: a */
        public static C103257q m136720a(C103258a aVar, List list, float f, float f2, int i, int i2, Object obj) {
            float f3 = (i2 & 2) != 0 ? 0.0f : f;
            float f4 = (i2 & 4) != 0 ? Float.POSITIVE_INFINITY : f2;
            int i3 = (i2 & 8) != 0 ? 0 : i;
            aVar.getClass();
            C87412m.m108594g(list, "colors");
            return new C103233f0(list, (List) null, C112540f.m153745a(0.0f, f3), C112540f.m153745a(0.0f, f4), i3, (C8480h) null);
        }
    }

    public C103257q() {
        int i = C112545k.f336975d;
    }

    /* renamed from: a */
    public abstract void mo143030a(long j, C103241i0 i0Var, float f);
}
