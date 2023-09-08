package com.tencent.p014mm.mj_template.sns.compose.widget;

import androidx.compose.p002ui.platform.C54195x1;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p152f0.C58866q0;
import p175j0.C60690y0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.g0 */
public final class C55297g0 extends C87413o implements C32226l<C58866q0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C55341p0 f157502d;

    /* renamed from: e */
    public final /* synthetic */ C54195x1 f157503e;

    /* renamed from: f */
    public final /* synthetic */ C60690y0<String> f157504f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55297g0(C55341p0 p0Var, C54195x1 x1Var, C60690y0<String> y0Var) {
        super(1);
        this.f157502d = p0Var;
        this.f157503e = x1Var;
        this.f157504f = y0Var;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((C58866q0) obj, "$this$KeyboardActions");
        C55341p0.m62893a(this.f157502d, this.f157504f.getValue(), 0, 2, (Object) null);
        C54195x1 x1Var = this.f157503e;
        if (x1Var != null) {
            x1Var.hide();
        }
        return C13598b0.f38549a;
    }
}
