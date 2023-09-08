package p191l2;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p631o1.C109827a0;
import p631o1.C109846j;
import p631o1.C109848k;
import p631o1.C109854n0;
import p631o1.C109893x;
import p631o1.C109895y;
import p631o1.C109899z;
import rx3.C13598b0;
import sx3.C64197v;

/* renamed from: l2.g */
public final class C109144g implements C109895y {

    /* renamed from: a */
    public static final C109144g f326802a = new C109144g();

    /* renamed from: l2.g$a */
    public static final class C109145a extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public static final C109145a f326803d = new C109145a();

        public C109145a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C109854n0.C109855a) obj, "$this$layout");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: l2.g$b */
    public static final class C109146b extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109854n0 f326804d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109146b(C109854n0 n0Var) {
            super(1);
            this.f326804d = n0Var;
        }

        public Object invoke(Object obj) {
            C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
            C87412m.m108594g(aVar, "$this$layout");
            C109854n0.C109855a.m149306f(aVar, this.f326804d, 0, 0, 0.0f, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: l2.g$c */
    public static final class C109147c extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ List<C109854n0> f326805d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109147c(List<? extends C109854n0> list) {
            super(1);
            this.f326805d = list;
        }

        public Object invoke(Object obj) {
            C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
            C87412m.m108594g(aVar, "$this$layout");
            int e = C64197v.m75536e(this.f326805d);
            if (e >= 0) {
                int i = 0;
                while (true) {
                    C109854n0.C109855a.m149306f(aVar, this.f326805d.get(i), 0, 0, 0.0f, 4, (Object) null);
                    if (i == e) {
                        break;
                    }
                    i++;
                }
            }
            return C13598b0.f38549a;
        }
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
        int i2;
        C87412m.m108594g(a0Var, "$this$Layout");
        C87412m.m108594g(list, "measurables");
        int size = list.size();
        if (size != 0) {
            int i3 = 0;
            if (size != 1) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList.add(((C109893x) list.get(i4)).mo161155K(j));
                }
                int e = C64197v.m75536e(arrayList);
                if (e >= 0) {
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        C109854n0 n0Var = (C109854n0) arrayList.get(i3);
                        i5 = Math.max(i5, n0Var.f328779d);
                        i6 = Math.max(i6, n0Var.f328780e);
                        if (i3 == e) {
                            break;
                        }
                        i3++;
                    }
                    i2 = i5;
                    i = i6;
                } else {
                    i2 = 0;
                    i = 0;
                }
                return C109827a0.C109828a.m149247b(a0Var, i2, i, (Map) null, new C109147c(arrayList), 4, (Object) null);
            }
            C109854n0 K = ((C109893x) list.get(0)).mo161155K(j);
            return C109827a0.C109828a.m149247b(a0Var, K.f328779d, K.f328780e, (Map) null, new C109146b(K), 4, (Object) null);
        }
        return C109827a0.C109828a.m149247b(a0Var, 0, 0, (Map) null, C109145a.f326803d, 4, (Object) null);
    }

    /* renamed from: e */
    public int mo142888e(C109848k kVar, List<? extends C109846j> list, int i) {
        return C109895y.C109896a.m149388d(this, kVar, list, i);
    }
}
