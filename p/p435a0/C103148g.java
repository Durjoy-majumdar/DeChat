package p435a0;

import fy3.C32226l;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import java.util.Map;
import p560i2.C108319b;
import p560i2.C108321c;
import p631o1.C109827a0;
import p631o1.C109846j;
import p631o1.C109848k;
import p631o1.C109854n0;
import p631o1.C109893x;
import p631o1.C109895y;
import p631o1.C109899z;
import p721v0.C111294a;
import rx3.C13598b0;

/* renamed from: a0.g */
public final class C103148g implements C109895y {

    /* renamed from: a */
    public final /* synthetic */ boolean f304290a;

    /* renamed from: b */
    public final /* synthetic */ C111294a f304291b;

    /* renamed from: a0.g$a */
    public static final class C103149a extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public static final C103149a f304292d = new C103149a();

        public C103149a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C109854n0.C109855a) obj, "$this$layout");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a0.g$b */
    public static final class C103150b extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109854n0 f304293d;

        /* renamed from: e */
        public final /* synthetic */ C109893x f304294e;

        /* renamed from: f */
        public final /* synthetic */ C109827a0 f304295f;

        /* renamed from: g */
        public final /* synthetic */ int f304296g;

        /* renamed from: h */
        public final /* synthetic */ int f304297h;

        /* renamed from: i */
        public final /* synthetic */ C111294a f304298i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103150b(C109854n0 n0Var, C109893x xVar, C109827a0 a0Var, int i, int i2, C111294a aVar) {
            super(1);
            this.f304293d = n0Var;
            this.f304294e = xVar;
            this.f304295f = a0Var;
            this.f304296g = i;
            this.f304297h = i2;
            this.f304298i = aVar;
        }

        public Object invoke(Object obj) {
            C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
            C87412m.m108594g(aVar, "$this$layout");
            C103141f.m136471b(aVar, this.f304293d, this.f304294e, this.f304295f.getLayoutDirection(), this.f304296g, this.f304297h, this.f304298i);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a0.g$c */
    public static final class C103151c extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109854n0[] f304299d;

        /* renamed from: e */
        public final /* synthetic */ List<C109893x> f304300e;

        /* renamed from: f */
        public final /* synthetic */ C109827a0 f304301f;

        /* renamed from: g */
        public final /* synthetic */ C8478d0 f304302g;

        /* renamed from: h */
        public final /* synthetic */ C8478d0 f304303h;

        /* renamed from: i */
        public final /* synthetic */ C111294a f304304i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103151c(C109854n0[] n0VarArr, List<? extends C109893x> list, C109827a0 a0Var, C8478d0 d0Var, C8478d0 d0Var2, C111294a aVar) {
            super(1);
            this.f304299d = n0VarArr;
            this.f304300e = list;
            this.f304301f = a0Var;
            this.f304302g = d0Var;
            this.f304303h = d0Var2;
            this.f304304i = aVar;
        }

        public Object invoke(Object obj) {
            C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
            C87412m.m108594g(aVar, "$this$layout");
            C109854n0[] n0VarArr = this.f304299d;
            List<C109893x> list = this.f304300e;
            C109827a0 a0Var = this.f304301f;
            C8478d0 d0Var = this.f304302g;
            C8478d0 d0Var2 = this.f304303h;
            C111294a aVar2 = this.f304304i;
            int length = n0VarArr.length;
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                C109854n0 n0Var = n0VarArr[i2];
                int i3 = i + 1;
                if (n0Var != null) {
                    C103141f.m136471b(aVar, n0Var, list.get(i), a0Var.getLayoutDirection(), d0Var.f27483d, d0Var2.f27483d, aVar2);
                    i2++;
                    i = i3;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C103148g(boolean z, C111294a aVar) {
        this.f304290a = z;
        this.f304291b = aVar;
    }

    /* renamed from: a */
    public int mo142884a(C109848k kVar, List<? extends C109846j> list, int i) {
        return C109895y.C109896a.m149387c(this, kVar, list, i);
    }

    /* renamed from: b */
    public int mo142885b(C109848k kVar, List<? extends C109846j> list, int i) {
        return C109895y.C109896a.m149386b(this, kVar, list, i);
    }

    /* renamed from: c */
    public int mo142886c(C109848k kVar, List<? extends C109846j> list, int i) {
        return C109895y.C109896a.m149385a(this, kVar, list, i);
    }

    /* renamed from: d */
    public final C109899z mo142887d(C109827a0 a0Var, List<? extends C109893x> list, long j) {
        int i;
        C109854n0 n0Var;
        int i2;
        List<? extends C109893x> list2 = list;
        C87412m.m108594g(a0Var, "$this$MeasurePolicy");
        C87412m.m108594g(list2, "measurables");
        if (list.isEmpty()) {
            return C109827a0.C109828a.m149247b(a0Var, C108319b.m146699j(j), C108319b.m146698i(j), (Map) null, C103149a.f304292d, 4, (Object) null);
        }
        long a = this.f304290a ? j : C108319b.m146690a(j, 0, 0, 0, 0, 10, (Object) null);
        boolean z = false;
        if (list.size() == 1) {
            C109893x xVar = (C109893x) list2.get(0);
            Object c = xVar.mo161159c();
            C103138e eVar = c instanceof C103138e ? (C103138e) c : null;
            if (eVar != null) {
                z = eVar.f304271f;
            }
            if (!z) {
                C109854n0 K = xVar.mo161155K(a);
                int max = Math.max(C108319b.m146699j(j), K.f328779d);
                i = Math.max(C108319b.m146698i(j), K.f328780e);
                n0Var = K;
                i2 = max;
            } else {
                i2 = C108319b.m146699j(j);
                int i3 = C108319b.m146698i(j);
                n0Var = xVar.mo161155K(C108319b.f324339b.mo158785c(C108319b.m146699j(j), C108319b.m146698i(j)));
                i = i3;
            }
            return C109827a0.C109828a.m149247b(a0Var, i2, i, (Map) null, new C103150b(n0Var, xVar, a0Var, i2, i, this.f304291b), 4, (Object) null);
        }
        C109854n0[] n0VarArr = new C109854n0[list.size()];
        C8478d0 d0Var = new C8478d0();
        d0Var.f27483d = C108319b.m146699j(j);
        C8478d0 d0Var2 = new C8478d0();
        d0Var2.f27483d = C108319b.m146698i(j);
        int size = list.size();
        boolean z2 = false;
        for (int i4 = 0; i4 < size; i4++) {
            C109893x xVar2 = (C109893x) list2.get(i4);
            Object c2 = xVar2.mo161159c();
            C103138e eVar2 = c2 instanceof C103138e ? (C103138e) c2 : null;
            if (!(eVar2 != null ? eVar2.f304271f : false)) {
                C109854n0 K2 = xVar2.mo161155K(a);
                n0VarArr[i4] = K2;
                d0Var.f27483d = Math.max(d0Var.f27483d, K2.f328779d);
                d0Var2.f27483d = Math.max(d0Var2.f27483d, K2.f328780e);
            } else {
                z2 = true;
            }
        }
        if (z2) {
            int i5 = d0Var.f27483d;
            int i6 = i5 != Integer.MAX_VALUE ? i5 : 0;
            int i7 = d0Var2.f27483d;
            long a2 = C108321c.m146704a(i6, i5, i7 != Integer.MAX_VALUE ? i7 : 0, i7);
            int size2 = list.size();
            for (int i8 = 0; i8 < size2; i8++) {
                C109893x xVar3 = (C109893x) list2.get(i8);
                Object c3 = xVar3.mo161159c();
                C103138e eVar3 = c3 instanceof C103138e ? (C103138e) c3 : null;
                if (eVar3 != null ? eVar3.f304271f : false) {
                    n0VarArr[i8] = xVar3.mo161155K(a2);
                }
            }
        }
        return C109827a0.C109828a.m149247b(a0Var, d0Var.f27483d, d0Var2.f27483d, (Map) null, new C103151c(n0VarArr, list, a0Var, d0Var, d0Var2, this.f304291b), 4, (Object) null);
    }

    /* renamed from: e */
    public int mo142888e(C109848k kVar, List<? extends C109846j> list, int i) {
        return C109895y.C109896a.m149388d(this, kVar, list, i);
    }
}
