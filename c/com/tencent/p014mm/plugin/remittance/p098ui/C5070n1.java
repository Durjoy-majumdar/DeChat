package com.tencent.p014mm.plugin.remittance.p098ui;

import android.animation.ValueAnimator;
import android.view.View;
import com.tencent.p014mm.p136ui.C85865h1;
import com.tencent.p014mm.p136ui.C85875k4;
import gy3.C87412m;
import p206nj.C11171e;
import qo3.C101218e0;

/* renamed from: com.tencent.mm.plugin.remittance.ui.n1 */
public final class C5070n1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ RemittanceRemarkInputHalfPage f20424d;

    /* renamed from: e */
    public final /* synthetic */ C101218e0 f20425e;

    public C5070n1(RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage, C101218e0 e0Var) {
        this.f20424d = remittanceRemarkInputHalfPage;
        this.f20425e = e0Var;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (!C85865h1.m106133c(this.f20424d.f205113d) && !C85875k4.m106171a0() && !C85875k4.m106169Z() && C11171e.m11044a(30)) {
            View view = this.f20425e.f296384g;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            view.setPadding(0, 0, 0, ((Integer) animatedValue).intValue());
        }
    }
}
