package com.tencent.p014mm.mj_template.sns.compose.widget;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C60690y0;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.h0 */
public final class C55298h0 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C55341p0 f157505d;

    /* renamed from: e */
    public final /* synthetic */ C60690y0<String> f157506e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55298h0(C55341p0 p0Var, C60690y0<String> y0Var) {
        super(1);
        this.f157505d = p0Var;
        this.f157506e = y0Var;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        this.f157506e.setValue(str);
        if (((Boolean) ((C36570n) this.f157505d.f157605i).getValue()).booleanValue()) {
            C55341p0.m62893a(this.f157505d, this.f157506e.getValue(), 0, 2, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
