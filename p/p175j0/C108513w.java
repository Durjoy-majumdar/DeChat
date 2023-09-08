package p175j0;

import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import rx3.C13598b0;

/* renamed from: j0.w */
public final class C108513w {

    /* renamed from: j0.w$a */
    public static final class C108514a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108502g1<?>[] f324835d;

        /* renamed from: e */
        public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f324836e;

        /* renamed from: f */
        public final /* synthetic */ int f324837f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108514a(C108502g1<?>[] g1VarArr, C32227p<? super C108504h, ? super Integer, C13598b0> pVar, int i) {
            super(2);
            this.f324835d = g1VarArr;
            this.f324836e = pVar;
            this.f324837f = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C108502g1<?>[] g1VarArr = this.f324835d;
            C108513w.m147056a((C108502g1[]) Arrays.copyOf(g1VarArr, g1VarArr.length), this.f324836e, (C108504h) obj, this.f324837f | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m147056a(C108502g1<?>[] g1VarArr, C32227p<? super C108504h, ? super Integer, C13598b0> pVar, C108504h hVar, int i) {
        C87412m.m108594g(g1VarArr, "values");
        C87412m.m108594g(pVar, "content");
        C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> qVar = C24715p.f70494a;
        C108504h z = hVar.mo51623z(-1390796515);
        z.mo51547C(g1VarArr);
        pVar.invoke(z, Integer.valueOf((i >> 3) & 14));
        z.mo51562M();
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C108514a(g1VarArr, pVar, i));
        }
    }

    /* renamed from: b */
    public static C108499f1 m147057b(C108497e2 e2Var, C32224a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            e2Var = C108507n2.f324831a;
        }
        C87412m.m108594g(e2Var, "policy");
        C87412m.m108594g(aVar, "defaultFactory");
        return new C108498f0(e2Var, aVar);
    }

    /* renamed from: c */
    public static final <T> C108499f1<T> m147058c(C32224a<? extends T> aVar) {
        C87412m.m108594g(aVar, "defaultFactory");
        return new C108506l2(aVar);
    }
}
