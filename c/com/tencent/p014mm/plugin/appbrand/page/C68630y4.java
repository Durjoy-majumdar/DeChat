package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.page.C83942u4;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;
import rx3.C13598b0;
import wc3.C15133e0;

/* renamed from: com.tencent.mm.plugin.appbrand.page.y4 */
public final class C68630y4 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C15133e0 f197147d;

    /* renamed from: e */
    public final /* synthetic */ Context f197148e;

    /* renamed from: f */
    public final /* synthetic */ C77407n f197149f;

    /* renamed from: g */
    public final /* synthetic */ C83845l0 f197150g;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.y4$a */
    public static final class C68631a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C83845l0 f197151d;

        /* renamed from: e */
        public final /* synthetic */ C77407n f197152e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68631a(C83845l0 l0Var, C77407n nVar) {
            super(1);
            this.f197151d = l0Var;
            this.f197152e = nVar;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                View view = this.f197151d.f244704g;
                if (view instanceof AppBrandMenuHeader) {
                    AppBrandMenuHeader appBrandMenuHeader = (AppBrandMenuHeader) view;
                    appBrandMenuHeader.f244380e.findViewById(C0966R.C0970id.f358735gs3).setPadding(appBrandMenuHeader.f244380e.getPaddingLeft(), appBrandMenuHeader.f244380e.getPaddingTop(), appBrandMenuHeader.f244380e.getPaddingRight(), 0);
                }
                C77407n nVar = this.f197152e;
                if (nVar.f225732J.size() > 0 && nVar.f225745T0 == null) {
                    nVar.mo107561f();
                    nVar.mo107557b(0);
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C68630y4(C15133e0 e0Var, Context context, C77407n nVar, C83845l0 l0Var) {
        this.f197147d = e0Var;
        this.f197148e = context;
        this.f197149f = nVar;
        this.f197150g = l0Var;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C15133e0 e0Var2 = this.f197147d;
        Context context = this.f197148e;
        C87412m.m108593f(e0Var, "menu");
        C77407n nVar = this.f197149f;
        int i = C83942u4.f245078b;
        e0Var2.Sd0(context, e0Var, nVar, C83942u4.C55543a.f158147a, 3, new C68631a(this.f197150g, nVar));
    }
}
