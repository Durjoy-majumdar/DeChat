package xk1;

import android.widget.ProgressBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76912y0;
import o40.C61926c;
import ok1.C62042e;
import qg1.C12217a0;
import rx3.C13598b0;
import te3.C50231l91;

/* renamed from: xk1.y2 */
public final class C15795y2 implements C12217a0.C12218a {

    /* renamed from: a */
    public final /* synthetic */ C15771r2 f42559a;

    /* renamed from: b */
    public final /* synthetic */ int f42560b;

    /* renamed from: xk1.y2$a */
    public static final class C15796a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C15771r2 f42561d;

        /* renamed from: e */
        public final /* synthetic */ String f42562e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15796a(C15771r2 r2Var, String str) {
            super(0);
            this.f42561d = r2Var;
            this.f42562e = str;
        }

        public Object invoke() {
            ProgressBar progressBar = this.f42561d.f42512i;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.e_o);
            C87412m.m108593f(string, "getContext().resources.g…_visitor_role_chang_fail)");
            String str = this.f42562e;
            if (!(str == null || str.length() == 0)) {
                string = this.f42562e;
            }
            C76912y0.m92766e(this.f42561d.getContext(), string, C15793x2.f42555a);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xk1.y2$b */
    public static final class C15797b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C15771r2 f42563d;

        /* renamed from: e */
        public final /* synthetic */ int f42564e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15797b(C15771r2 r2Var, int i) {
            super(0);
            this.f42563d = r2Var;
            this.f42564e = i;
        }

        public Object invoke() {
            ProgressBar progressBar = this.f42563d.f42512i;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            C15771r2 r2Var = this.f42563d;
            r2Var.f42520t = this.f42564e;
            r2Var.mo14487d3();
            C15771r2 r2Var2 = this.f42563d;
            int i = r2Var2.f42517q;
            if (i == 1 || i == 2) {
                long j = i == 2 ? 2000 : 0;
                C76912y0.m92768g(r2Var2.getActivity(), this.f42563d.getActivity().getString(C0966R.string.d4g));
                C61926c.m72666K(j, new C15802z2(this.f42563d));
            } else {
                C62042e.f176370a.mo87019K1(r2Var2.f42519s, r2Var2.f42520t, r2Var2.f42521u);
            }
            return C13598b0.f38549a;
        }
    }

    public C15795y2(C15771r2 r2Var, int i) {
        this.f42559a = r2Var;
        this.f42560b = i;
    }

    /* renamed from: a */
    public void mo11951a(int i, int i2, String str) {
        C61926c.m72668M(new C15796a(this.f42559a, str));
    }

    /* renamed from: b */
    public void mo11952b(C50231l91 l912) {
        C87412m.m108594g(l912, "resp");
        C61926c.m72668M(new C15797b(this.f42559a, this.f42560b));
    }
}
