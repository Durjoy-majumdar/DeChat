package com.tencent.p014mm.plugin.vlog.p117ui.fake;

import android.content.Context;
import com.tencent.p014mm.plugin.vlog.model.C96553q;
import fy3.C32224a;
import gy3.C87413o;
import p910lj.C76701a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.vlog.ui.fake.a */
public final class C30526a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ VLogFakePlayActivity f82242d;

    /* renamed from: e */
    public final /* synthetic */ C96553q f82243e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30526a(VLogFakePlayActivity vLogFakePlayActivity, C96553q qVar) {
        super(0);
        this.f82242d = vLogFakePlayActivity;
        this.f82243e = qVar;
    }

    public Object invoke() {
        VLogFakePlayActivity vLogFakePlayActivity = this.f82242d;
        C76701a.makeText((Context) vLogFakePlayActivity, (CharSequence) "export over " + this.f82243e, 0).show();
        return C13598b0.f38549a;
    }
}
