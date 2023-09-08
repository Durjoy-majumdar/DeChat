package mf1;

import android.app.Dialog;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.service.C3602m1;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8794p5;
import nj3.C76879j;
import nj3.C76912y0;
import o40.C61926c;
import rx3.C13598b0;
import te3.C49688hd1;
import te3.C50542nh0;

/* renamed from: mf1.k1 */
public final class C10834k1 {

    /* renamed from: a */
    public final C8794p5<C49688hd1> f32353a = new C10835a(this);

    /* renamed from: b */
    public C32227p<? super C49688hd1, ? super C50542nh0, C13598b0> f32354b;

    /* renamed from: c */
    public Dialog f32355c;

    /* renamed from: d */
    public boolean f32356d;

    /* renamed from: mf1.k1$a */
    public static final class C10835a implements C8794p5<C49688hd1> {

        /* renamed from: d */
        public final /* synthetic */ C10834k1 f32357d;

        public C10835a(C10834k1 k1Var) {
            this.f32357d = k1Var;
        }

        /* renamed from: c5 */
        public void mo705c5(Object obj, C50542nh0 nh02) {
            String str;
            C32227p<? super C49688hd1, ? super C50542nh0, C13598b0> pVar;
            C49688hd1 hd12 = (C49688hd1) obj;
            C87412m.m108594g(hd12, "req");
            C87412m.m108594g(nh02, "ret");
            C10834k1 k1Var = this.f32357d;
            k1Var.f32356d = false;
            Dialog dialog = k1Var.f32355c;
            if (dialog != null) {
                dialog.dismiss();
            }
            int i = nh02.f138603e;
            this.f32357d.getClass();
            if (i == -4051) {
                str = MMApplicationContext.getContext().getString(C0966R.string.eq_);
                C87412m.m108593f(str, "getContext().getString(R…icky_feed_failed_reason1)");
            } else {
                this.f32357d.getClass();
                if (i != -4053 || (str = nh02.f138604f) == null) {
                    str = "";
                }
            }
            if (!Util.isNullOrNil(str)) {
                C76912y0.m92766e(MMApplicationContext.getContext(), str, C10830j1.f32344a);
            }
            if (nh02.f138603e == 0 && (pVar = this.f32357d.f32354b) != null) {
                pVar.invoke(hd12, nh02);
            }
        }
    }

    /* renamed from: mf1.k1$b */
    public static final class C10836b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C10834k1 f32358d;

        /* renamed from: e */
        public final /* synthetic */ Context f32359e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10836b(C10834k1 k1Var, Context context) {
            super(0);
            this.f32358d = k1Var;
            this.f32359e = context;
        }

        public Object invoke() {
            C13598b0 b0Var;
            C10834k1 k1Var = this.f32358d;
            if (k1Var.f32356d) {
                Dialog dialog = k1Var.f32355c;
                if (dialog != null) {
                    dialog.show();
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    C10834k1 k1Var2 = this.f32358d;
                    Context context = this.f32359e;
                    k1Var2.f32355c = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), context.getString(C0966R.string.a4d), true, false, C10840l1.f32376d);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final void mo11054a(Context context, long j, boolean z, String str, C32227p<? super C49688hd1, ? super C50542nh0, C13598b0> pVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "nonceId");
        C87412m.m108594g(pVar, "succCallback");
        this.f32354b = pVar;
        this.f32356d = true;
        C61926c.m72666K(500, new C10836b(this, context));
        C8794p5<C49688hd1> p5Var = this.f32353a;
        ((C3602m1) C86312j.m106911c(C3602m1.class)).mo3966jP(j, z ^ true ? 1 : 0, str, p5Var);
    }
}
