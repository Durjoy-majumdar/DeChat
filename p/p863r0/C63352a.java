package p863r0;

import androidx.compose.p002ui.platform.C103691v;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.LiveData;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108504h;
import p175j0.C60647d0;
import p175j0.C60651e0;
import p175j0.C60655g0;
import p175j0.C60667k2;
import p175j0.C60690y0;

/* renamed from: r0.a */
public final class C63352a {

    /* renamed from: r0.a$a */
    public static final class C63353a extends C87413o implements C32226l<C60651e0, C60647d0> {

        /* renamed from: d */
        public final /* synthetic */ LiveData<T> f179718d;

        /* renamed from: e */
        public final /* synthetic */ C0125s f179719e;

        /* renamed from: f */
        public final /* synthetic */ C60690y0<R> f179720f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63353a(LiveData<T> liveData, C0125s sVar, C60690y0<R> y0Var) {
            super(1);
            this.f179718d = liveData;
            this.f179719e = sVar;
            this.f179720f = y0Var;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C60651e0) obj, "$this$DisposableEffect");
            a$a$$a a_a__a = new a$a$$a(this.f179720f);
            this.f179718d.observe(this.f179719e, a_a__a);
            return new C63354b(this.f179718d, a_a__a);
        }
    }

    /* renamed from: a */
    public static final <R, T extends R> C60667k2<R> m74693a(LiveData<T> liveData, R r, C108504h hVar, int i) {
        C87412m.m108594g(liveData, "<this>");
        hVar.mo51557H(411178300);
        C0125s sVar = (C0125s) hVar.mo51598m(C103691v.f306270d);
        hVar.mo51557H(-492369756);
        Object q = hVar.mo51606q();
        int i2 = C108504h.f324828a;
        if (q == C108504h.C60656a.f172772a) {
            q = C108500f2.m146996c(r, (C108497e2) null, 2, (Object) null);
            hVar.mo51553F(q);
        }
        hVar.mo51565P();
        C60690y0 y0Var = (C60690y0) q;
        C60655g0.m70931b(liveData, sVar, new C63353a(liveData, sVar, y0Var), hVar, 72);
        hVar.mo51565P();
        return y0Var;
    }
}
