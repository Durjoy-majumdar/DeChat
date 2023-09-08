package com.tencent.p014mm.plugin.appbrand;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.os.Vibrator;
import bt0.C79813g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.h3 */
public final class C81900h3 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C81931i3 f240231d;

    /* renamed from: e */
    public final /* synthetic */ C83928t1 f240232e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81900h3(C81931i3 i3Var, C83928t1 t1Var) {
        super(0);
        this.f240231d = i3Var;
        this.f240232e = t1Var;
    }

    public Object invoke() {
        C81931i3 i3Var = this.f240231d;
        if (!i3Var.f240304g) {
            i3Var.f240304g = true;
            C79813g gVar = this.f240232e.f245025i1;
            C87412m.m108591d(gVar);
            int foregroundColor = gVar.getForegroundColor();
            int color = this.f240232e.getContext().getResources().getColor(C0966R.color.f2966ao);
            C79813g gVar2 = this.f240232e.f245025i1;
            C87412m.m108591d(gVar2);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(gVar2.getSecurityTipsTextView(), "textColor", new int[]{foregroundColor, color});
            ofInt.setDuration(100);
            ofInt.setEvaluator(new ArgbEvaluator());
            ofInt.addListener(new C81883g3(ofInt, this.f240232e, color, foregroundColor, this.f240231d));
            Object systemService = this.f240232e.getContext().getSystemService("vibrator");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            ((Vibrator) systemService).vibrate(20);
            ofInt.start();
        }
        return C13598b0.f38549a;
    }
}
