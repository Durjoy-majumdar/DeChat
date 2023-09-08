package com.tencent.p014mm.mj_template.sns.compose.widget;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import p175j0.C108504h;
import p267x.C111885b;
import p435a0.C103141f;
import p435a0.C103166l0;
import p435a0.C103214y0;
import p436a1.C103266t0;
import p721v0.C111299g;
import p721v0.C65503j;
import rx3.C13598b0;
import ta0.C110954a;
import wa0.C111791f;
import ya0.C112430i;
import ya0.C112435k;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.c1 */
public final class C104656c1 extends C87413o implements C32228q<List<? extends C111791f>, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C112430i f310790d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104656c1(C112430i iVar) {
        super(3);
        this.f310790d = iVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        ((Number) obj3).intValue();
        C87412m.m108594g(list, "tabPositions");
        int i = C65503j.f188489K0;
        C65503j.C65504a aVar = C65503j.C65504a.f188490d;
        C112430i iVar = this.f310790d;
        C87412m.m108594g(iVar, "pagerState");
        float f = (float) 8;
        C65503j h = C103214y0.m136592h(C103166l0.m136521e(C103214y0.m136591g(C111299g.m151787b(aVar, (C32226l) null, new C112435k(iVar, list), 1, (Object) null), 0.0f, 1, (Object) null), ((float) 1.5d) * f, 0.0f, 2, (Object) null), ((float) 0.25d) * f);
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        C103141f.m136470a(C111885b.m152607c(h, C110954a.m151254b(C0966R.color.BW_100_Alpha_0_8, context), (C103266t0) null, 2, (Object) null), (C108504h) obj2, 0);
        return C13598b0.f38549a;
    }
}
