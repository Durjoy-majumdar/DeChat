package hl1;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import il1.C60491p4;
import qj1.C12322e5;
import qj1.C62949r8;
import qj1.C63084w6;
import vk1.C65762c;

/* renamed from: hl1.l3 */
public final class C60013l3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bundle f171296d;

    /* renamed from: e */
    public final /* synthetic */ C59988k f171297e;

    /* renamed from: f */
    public final /* synthetic */ C12322e5 f171298f;

    public C60013l3(Bundle bundle, C59988k kVar, C12322e5 e5Var) {
        this.f171296d = bundle;
        this.f171297e = kVar;
        this.f171298f = e5Var;
    }

    public final void run() {
        C60491p4 p4Var;
        Bundle bundle = this.f171296d;
        boolean z = true;
        C12322e5 e5Var = null;
        if (bundle != null && bundle.getBoolean("PARAM_IS_ENTERING_COMMENT")) {
            C59988k kVar = this.f171297e;
            C62949r8 r8Var = kVar.f171149B;
            if (r8Var != null) {
                e5Var = r8Var.f178624D;
            }
            if (e5Var == null) {
                ViewGroup.LayoutParams layoutParams = this.f171298f.f166287d.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                kVar.f171177P1 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                String str = this.f171297e.f171222i;
                Log.m105924i(str, "lxltest2 22 originCommentBottomMargin:" + this.f171297e.f171177P1);
            }
            C59988k kVar2 = this.f171297e;
            C62949r8 r8Var2 = kVar2.f171149B;
            if (r8Var2 != null) {
                r8Var2.f178624D = kVar2.f171250x;
            }
            ViewGroup.LayoutParams layoutParams2 = this.f171298f.f166287d.getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
            layoutParams3.addRule(12);
            layoutParams3.removeRule(2);
            return;
        }
        C63084w6 w6Var = this.f171297e.f171230n1;
        if (w6Var != null) {
            Boolean valueOf = (w6Var == null || (p4Var = w6Var.f179023q) == null) ? null : Boolean.valueOf(p4Var.mo85446b());
            C87412m.m108592e(valueOf, "null cannot be cast to non-null type kotlin.Boolean");
            if (valueOf.booleanValue()) {
                C62949r8 r8Var3 = this.f171297e.f171149B;
                if (r8Var3 != null) {
                    r8Var3.f178624D = null;
                }
                ViewGroup.LayoutParams layoutParams4 = this.f171298f.f166287d.getLayoutParams();
                C87412m.m108592e(layoutParams4, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) layoutParams4;
                C65762c cVar = this.f171297e.f166848f;
                if (cVar == null || !cVar.isLandscape()) {
                    z = false;
                }
                if (z) {
                    layoutParams5.addRule(12);
                } else {
                    layoutParams5.removeRule(12);
                    layoutParams5.addRule(2, this.f171297e.f171253y);
                }
                ViewGroup.LayoutParams layoutParams6 = this.f171298f.f166287d.getLayoutParams();
                C87412m.m108592e(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin = this.f171297e.f171177P1;
                return;
            }
        }
        C62949r8 r8Var4 = this.f171297e.f171149B;
        if (r8Var4 != null) {
            r8Var4.f178624D = null;
        }
        ViewGroup.LayoutParams layoutParams7 = this.f171298f.f166287d.getLayoutParams();
        C87412m.m108592e(layoutParams7, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams8 = (RelativeLayout.LayoutParams) layoutParams7;
        C65762c cVar2 = this.f171297e.f166848f;
        if (cVar2 == null || !cVar2.isLandscape()) {
            z = false;
        }
        if (z) {
            layoutParams8.addRule(12);
        } else {
            layoutParams8.removeRule(12);
            layoutParams8.addRule(2, this.f171297e.f171253y);
        }
        ViewGroup.LayoutParams layoutParams9 = this.f171298f.f166287d.getLayoutParams();
        C87412m.m108592e(layoutParams9, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams9).bottomMargin = this.f171297e.f171177P1;
        this.f171298f.f166287d.requestLayout();
    }
}
