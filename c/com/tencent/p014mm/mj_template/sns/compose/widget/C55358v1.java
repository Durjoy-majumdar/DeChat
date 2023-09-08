package com.tencent.p014mm.mj_template.sns.compose.widget;

import fy3.C32226l;
import gy3.C87413o;
import java.util.List;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.v1 */
public final class C55358v1 extends C87413o implements C32226l<Integer, Object> {

    /* renamed from: d */
    public final /* synthetic */ List<C55319n1> f157654d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55358v1(List<? extends C55319n1> list) {
        super(1);
        this.f157654d = list;
    }

    public Object invoke(Object obj) {
        return this.f157654d.get(((Number) obj).intValue()).f157555a;
    }
}
