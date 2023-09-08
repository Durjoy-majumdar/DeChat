package wg1;

import android.content.Context;
import cl1.C54991o;
import dj1.C45399x0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import ok1.C62042e;
import rx3.C13598b0;
import te3.C49392f81;

/* renamed from: wg1.v0 */
public final class C66091v0 implements C45399x0.C45400a {

    /* renamed from: a */
    public final /* synthetic */ C66085u0 f189986a;

    /* renamed from: b */
    public final /* synthetic */ String f189987b;

    /* renamed from: wg1.v0$a */
    public static final class C66092a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f189988d;

        /* renamed from: e */
        public final /* synthetic */ C66085u0 f189989e;

        /* renamed from: f */
        public final /* synthetic */ String f189990f;

        /* renamed from: g */
        public final /* synthetic */ C49392f81 f189991g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66092a(int i, C66085u0 u0Var, String str, C49392f81 f812) {
            super(0);
            this.f189988d = i;
            this.f189989e = u0Var;
            this.f189990f = str;
            this.f189991g = f812;
        }

        public Object invoke() {
            if (this.f189988d == -1001) {
                C62042e eVar = C62042e.f176370a;
                Context context = this.f189989e.f189975d;
                eVar.mo87041S1(context, "(DEBUG)搜索失败" + this.f189988d);
            }
            ((C54991o) this.f189989e.f189976e.mo71262a(C54991o.class)).f154232N2.mo75655l(this.f189990f, this.f189991g);
            this.f189989e.mo90113P();
            return C13598b0.f38549a;
        }
    }

    public C66091v0(C66085u0 u0Var, String str) {
        this.f189986a = u0Var;
        this.f189987b = str;
    }

    /* renamed from: a */
    public void mo70902a(int i, int i2, String str, C49392f81 f812) {
        C87412m.m108594g(f812, "resp");
        C61926c.m72668M(new C66092a(i2, this.f189986a, this.f189987b, f812));
    }
}
