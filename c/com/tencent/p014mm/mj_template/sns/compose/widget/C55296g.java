package com.tencent.p014mm.mj_template.sns.compose.widget;

import fy3.C32224a;
import gy3.C87413o;
import p004b0.C103953l0;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.g */
public final class C55296g extends C87413o implements C32224a<Float> {

    /* renamed from: d */
    public final /* synthetic */ C103953l0 f157500d;

    /* renamed from: e */
    public final /* synthetic */ float f157501e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55296g(C103953l0 l0Var, float f) {
        super(0);
        this.f157500d = l0Var;
        this.f157501e = f;
    }

    public Object invoke() {
        int size = this.f157500d.mo145573g().mo55835f().size();
        boolean z = false;
        if (size >= 0 && size < 2) {
            z = true;
        }
        float f = 1.0f;
        float f2 = z ? 0.0f : 1.0f;
        if (f2 <= 1.0f) {
            f = f2;
        }
        return Float.valueOf(f * this.f157501e);
    }
}
