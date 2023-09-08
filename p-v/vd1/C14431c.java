package vd1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import ht1.C8794p5;
import nj3.C76912y0;
import qo3.C89779i0;
import te3.C50542nh0;
import te3.C51954xc1;

/* renamed from: vd1.c */
public final class C14431c implements C8794p5<C51954xc1> {

    /* renamed from: d */
    public final /* synthetic */ C89779i0 f40037d;

    /* renamed from: e */
    public final /* synthetic */ C8794p5<C51954xc1> f40038e;

    /* renamed from: f */
    public final /* synthetic */ Context f40039f;

    /* renamed from: g */
    public final /* synthetic */ boolean f40040g;

    public C14431c(C89779i0 i0Var, C8794p5<C51954xc1> p5Var, Context context, boolean z) {
        this.f40037d = i0Var;
        this.f40038e = p5Var;
        this.f40039f = context;
        this.f40040g = z;
    }

    /* renamed from: c5 */
    public void mo705c5(Object obj, C50542nh0 nh02) {
        String str;
        C51954xc1 xc12 = (C51954xc1) obj;
        C87412m.m108594g(xc12, "req");
        C87412m.m108594g(nh02, "ret");
        C89779i0 i0Var = this.f40037d;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        C8794p5<C51954xc1> p5Var = this.f40038e;
        if (p5Var != null) {
            p5Var.mo705c5(xc12, nh02);
        }
        if (nh02.f138603e == 0) {
            str = this.f40039f.getResources().getString(this.f40040g ? C0966R.string.n1_ : C0966R.string.n1d);
        } else {
            str = this.f40039f.getResources().getString(this.f40040g ? C0966R.string.n19 : C0966R.string.n1c);
        }
        C87412m.m108593f(str, "if (ret.retCode == 0) {\n…  )\n                    }");
        C76912y0.m92773l(this.f40039f, str);
    }
}
