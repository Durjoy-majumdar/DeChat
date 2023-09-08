package p631o1;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p560i2.C108319b;
import p560i2.C108321c;
import p631o1.C109827a0;
import p631o1.C109854n0;
import p658q1.j$$h;
import rx3.C13598b0;

/* renamed from: o1.r0 */
public final class C109868r0 extends j$$h {

    /* renamed from: b */
    public static final C109868r0 f328790b = new C109868r0();

    /* renamed from: o1.r0$a */
    public static final class C109869a extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public static final C109869a f328791d = new C109869a();

        public C109869a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C109854n0.C109855a) obj, "$this$layout");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: o1.r0$b */
    public static final class C109870b extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109854n0 f328792d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109870b(C109854n0 n0Var) {
            super(1);
            this.f328792d = n0Var;
        }

        public Object invoke(Object obj) {
            C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
            C87412m.m108594g(aVar, "$this$layout");
            C109854n0.C109855a.m149307g(aVar, this.f328792d, 0, 0, 0.0f, (C32226l) null, 12, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: o1.r0$c */
    public static final class C109871c extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ List<C109854n0> f328793d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109871c(List<? extends C109854n0> list) {
            super(1);
            this.f328793d = list;
        }

        public Object invoke(Object obj) {
            C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
            C87412m.m108594g(aVar, "$this$layout");
            List<C109854n0> list = this.f328793d;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C109854n0.C109855a.m149307g(aVar, list.get(i), 0, 0, 0.0f, (C32226l) null, 12, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    public C109868r0() {
        super("Undefined intrinsics block and it is required");
    }

    /* renamed from: d */
    public C109899z mo142887d(C109827a0 a0Var, List<? extends C109893x> list, long j) {
        C87412m.m108594g(a0Var, "$this$measure");
        C87412m.m108594g(list, "measurables");
        if (list.isEmpty()) {
            return C109827a0.C109828a.m149247b(a0Var, C108319b.m146699j(j), C108319b.m146698i(j), (Map) null, C109869a.f328791d, 4, (Object) null);
        }
        if (list.size() == 1) {
            C109854n0 K = ((C109893x) list.get(0)).mo161155K(j);
            return C109827a0.C109828a.m149247b(a0Var, C108321c.m146708e(j, K.f328779d), C108321c.m146707d(j, K.f328780e), (Map) null, new C109870b(K), 4, (Object) null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((C109893x) list.get(i)).mo161155K(j));
        }
        int size2 = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size2; i4++) {
            C109854n0 n0Var = (C109854n0) arrayList.get(i4);
            i2 = Math.max(n0Var.f328779d, i2);
            i3 = Math.max(n0Var.f328780e, i3);
        }
        return C109827a0.C109828a.m149247b(a0Var, C108321c.m146708e(j, i2), C108321c.m146707d(j, i3), (Map) null, new C109871c(arrayList), 4, (Object) null);
    }
}
