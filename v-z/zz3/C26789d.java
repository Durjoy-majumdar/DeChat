package zz3;

import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import n04.C25144j1;
import o04.C25318c;
import wy3.C22935h;
import wy3.C26434a;
import wy3.C26446d1;
import wy3.C26469k;

/* renamed from: zz3.d */
public final class C26789d implements C25318c.C25319a {

    /* renamed from: a */
    public final /* synthetic */ boolean f74517a;

    /* renamed from: b */
    public final /* synthetic */ C26434a f74518b;

    /* renamed from: c */
    public final /* synthetic */ C26434a f74519c;

    /* renamed from: zz3.d$a */
    public static final class C26790a extends C87413o implements C32227p<C26469k, C26469k, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C26434a f74520d;

        /* renamed from: e */
        public final /* synthetic */ C26434a f74521e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26790a(C26434a aVar, C26434a aVar2) {
            super(2);
            this.f74520d = aVar;
            this.f74521e = aVar2;
        }

        public Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(C87412m.m108589b((C26469k) obj, this.f74520d) && C87412m.m108589b((C26469k) obj2, this.f74521e));
        }
    }

    public C26789d(boolean z, C26434a aVar, C26434a aVar2) {
        this.f74517a = z;
        this.f74518b = aVar;
        this.f74519c = aVar2;
    }

    /* renamed from: a */
    public final boolean mo52405a(C25144j1 j1Var, C25144j1 j1Var2) {
        C87412m.m108594g(j1Var, "c1");
        C87412m.m108594g(j1Var2, "c2");
        if (C87412m.m108589b(j1Var, j1Var2)) {
            return true;
        }
        C22935h o = j1Var.mo37094o();
        C22935h o2 = j1Var2.mo37094o();
        if (!(o instanceof C26446d1) || !(o2 instanceof C26446d1)) {
            return false;
        }
        return C26791f.f74522a.mo53756b((C26446d1) o, (C26446d1) o2, this.f74517a, new C26790a(this.f74518b, this.f74519c));
    }
}
