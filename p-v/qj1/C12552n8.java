package qj1;

import ak1.C0076j0;
import ak1.C54116w;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import cj1.C54795n5;
import d60.C58124b;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import m53.C10757d;
import qo3.C47883u;
import rx3.C13598b0;

/* renamed from: qj1.n8 */
public final class C12552n8 implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ C12360e8 f36042a;

    /* renamed from: b */
    public final /* synthetic */ Context f36043b;

    /* renamed from: qj1.n8$a */
    public static final class C12553a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12360e8 f36044d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12553a(C12360e8 e8Var) {
            super(0);
            this.f36044d = e8Var;
        }

        public Object invoke() {
            C58124b.C7172a.m7372a(this.f36044d.f35606p, C58124b.C58125b.LIVE_EVENT_SHOW_GIFT_PANEL, (Bundle) null, 2, (Object) null);
            return C13598b0.f38549a;
        }
    }

    public C12552n8(C12360e8 e8Var, Context context) {
        this.f36042a = e8Var;
        this.f36043b = context;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        C10757d dVar;
        if (this.f36042a.f35606p.getLiveRole() == 0) {
            ((C54116w) C86312j.m106911c(C54116w.class)).nv0(C0076j0.SEND_GIFT_MONEY_NOT_ENOUGH_CLICK_EXCHARGE_UI, "", 0);
        }
        if (this.f36043b instanceof FragmentActivity) {
            C12360e8 e8Var = this.f36042a;
            C54795n5 D0 = e8Var.mo14476D0();
            if (D0 != null) {
                Context context = this.f36043b;
                C87412m.m108593f(context, "context");
                dVar = D0.mo75699C((FragmentActivity) context, 2, new C12553a(this.f36042a));
            } else {
                dVar = null;
            }
            e8Var.f35594G = dVar;
        }
    }
}
