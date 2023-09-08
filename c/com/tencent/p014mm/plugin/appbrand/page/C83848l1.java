package com.tencent.p014mm.plugin.appbrand.page;

import android.view.ViewGroup;
import bt0.C79808b;
import bt0.C79811f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.utils.C84725c;

/* renamed from: com.tencent.mm.plugin.appbrand.page.l1 */
public class C83848l1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83780d1 f244728d;

    public C83848l1(C83780d1 d1Var) {
        this.f244728d = d1Var;
    }

    public void run() {
        C83780d1 d1Var = this.f244728d;
        C79808b bVar = (C79808b) d1Var.f244576W.mo116271a(d1Var.getContext(), C79808b.class);
        d1Var.f244554F = bVar;
        bVar.getActionView().setId(d1Var.f244581x);
        d1Var.f244554F.setBackButtonClickListener(new C83852m1(d1Var));
        d1Var.f244554F.setCloseButtonClickListener(new C83856n1(d1Var));
        C79808b bVar2 = d1Var.f244554F;
        bVar2.f233883C.add(new C83862o1(d1Var));
        bVar2.mo109943l(C84725c.f247120e.isEnable(), bVar2.getMainTitle());
        d1Var.f244554F.setOptionButtonClickListener(new C83869p1(d1Var));
        C79811f fVar = (C79811f) d1Var.f244576W.mo116271a(d1Var.getContext(), C79811f.class);
        d1Var.f244553E = fVar;
        fVar.setId(C0966R.C0970id.f5865qt);
        d1Var.f244553E.setActuallyVisible(false);
        d1Var.f244553E.setDeferStatusBarHeightChange(false);
        d1Var.f244553E.addView(d1Var.f244554F, new ViewGroup.LayoutParams(-1, -2));
        d1Var.mo114864j(d1Var.f244553E);
        d1Var.mo114868y(d1Var.f244554F);
        d1Var.mo114864j(d1Var.f244554F);
        C83780d1 d1Var2 = this.f244728d;
        d1Var2.f244553E.mo109972S(d1Var2.getContext());
        C83780d1 d1Var3 = this.f244728d;
        d1Var3.f244552D.addView(d1Var3.f244553E, -1, new ViewGroup.LayoutParams(-1, -2));
        this.f244728d.mo116158M0().mo111272x(this.f244728d.f244554F);
        if (this.f244728d.f244554F.getParent() != this.f244728d.f244553E) {
            throw new IllegalAccessError("You should not modify actionbar's view hierarchy");
        }
    }
}
