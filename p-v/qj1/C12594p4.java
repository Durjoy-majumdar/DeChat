package qj1;

import android.content.Context;
import android.view.View;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C72994y1;
import cp1.C7120d;
import er1.C58739j4;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: qj1.p4 */
public final class C12594p4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12669t4 f36120d;

    /* renamed from: qj1.p4$a */
    public static final class C12595a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12669t4 f36121d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12595a(C12669t4 t4Var) {
            super(0);
            this.f36121d = t4Var;
        }

        public Object invoke() {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_CHARGE_VISITOR_LICENSE_BOOLEAN_SYNC, Boolean.TRUE);
            C12669t4.m12163b1(this.f36121d);
            return C13598b0.f38549a;
        }
    }

    public C12594p4(C12669t4 t4Var) {
        this.f36120d = t4Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveChargePayLazyPlugin$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (C58739j4.f168176a.mo83683L()) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveChargePayLazyPlugin$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C12669t4 t4Var = this.f36120d;
        if (t4Var.f36280D == 3) {
            Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_LIVE_CHARGE_VISITOR_LICENSE_BOOLEAN_SYNC, Boolean.FALSE);
            C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) f).booleanValue()) {
                C12669t4.m12163b1(this.f36120d);
            } else {
                Context context = this.f36120d.f166287d.getContext();
                C87412m.m108593f(context, "root.context");
                C7120d dVar = new C7120d(context, false, ((C54991o) this.f36120d.mo87696x0(C54991o.class)).f154287Z0 == 2, ((C55001u) this.f36120d.mo87696x0(C55001u.class)).f154416j);
                C12669t4 t4Var2 = this.f36120d;
                String string = dVar.getContext().getResources().getString(C0966R.string.diy);
                C87412m.m108593f(string, "context.resources.getStr…ive_charge_license_desc1)");
                String string2 = dVar.getContext().getResources().getString(C0966R.string.diw);
                C87412m.m108593f(string2, "context.resources.getStr…_charge_license_content1)");
                dVar.mo8273b(true, string, string2, new C12595a(t4Var2));
            }
        } else {
            t4Var.mo12253g1(true, false);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveChargePayLazyPlugin$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
