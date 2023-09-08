package gl1;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import gy3.C87412m;
import qj1.C12322e5;
import qj1.C62949r8;

/* renamed from: gl1.i2 */
public final class C59555i2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bundle f170192d;

    /* renamed from: e */
    public final /* synthetic */ C59559k f170193e;

    /* renamed from: f */
    public final /* synthetic */ C12322e5 f170194f;

    public C59555i2(Bundle bundle, C59559k kVar, C12322e5 e5Var) {
        this.f170192d = bundle;
        this.f170193e = kVar;
        this.f170194f = e5Var;
    }

    public final void run() {
        Bundle bundle = this.f170192d;
        boolean z = true;
        if (bundle == null || !bundle.getBoolean("PARAM_IS_ENTERING_COMMENT")) {
            z = false;
        }
        C12322e5 e5Var = null;
        if (z) {
            C59559k kVar = this.f170193e;
            C62949r8 r8Var = kVar.f170203E;
            if (r8Var != null) {
                e5Var = r8Var.f178624D;
            }
            if (e5Var == null) {
                ViewGroup.LayoutParams layoutParams = this.f170194f.f166287d.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                kVar.f170227W0 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }
            C59559k kVar2 = this.f170193e;
            C62949r8 r8Var2 = kVar2.f170203E;
            if (r8Var2 != null) {
                r8Var2.f178624D = kVar2.f170252u;
            }
            ViewGroup.LayoutParams layoutParams2 = this.f170194f.f166287d.getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
            layoutParams3.addRule(12);
            layoutParams3.removeRule(2);
            return;
        }
        C62949r8 r8Var3 = this.f170193e.f170203E;
        if (r8Var3 != null) {
            r8Var3.f178624D = null;
        }
        ViewGroup.LayoutParams layoutParams4 = this.f170194f.f166287d.getLayoutParams();
        C87412m.m108592e(layoutParams4, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) layoutParams4;
        layoutParams5.removeRule(12);
        layoutParams5.addRule(2, this.f170193e.f170241h1);
        ViewGroup.LayoutParams layoutParams6 = this.f170194f.f166287d.getLayoutParams();
        C87412m.m108592e(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin = this.f170193e.f170227W0;
        this.f170194f.f166287d.requestLayout();
    }
}
