package com.tencent.p014mm.mj_template.sns.compose.widget;

import fy3.C32228q;
import gy3.C87413o;
import p175j0.C108504h;
import p435a0.C103166l0;
import p721v0.C65503j;
import rx3.C13598b0;
import va0.C111497b;
import va0.C111503f;
import va0.C14422e;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.x0 */
public final class C55362x0 extends C87413o implements C32228q<Boolean, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C55304k f157657d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55362x0(C55304k kVar) {
        super(3);
        this.f157657d = kVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C108504h hVar = (C108504h) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 14) == 0) {
            intValue |= hVar.mo51586g(booleanValue) ? 4 : 2;
        }
        if ((intValue & 91) == 18 && hVar.mo51575a()) {
            hVar.mo51581d();
        } else if (booleanValue) {
            hVar.mo51557H(1400243877);
            int i = C65503j.f188489K0;
            C111497b.m152004a(C103166l0.m136523g(C65503j.C65504a.f188490d, 0.0f, ((float) 3) * ((float) 8), 0.0f, 0.0f, 13, (Object) null), C111503f.Small, (C14422e) null, hVar, 54, 4);
            hVar.mo51565P();
        } else {
            hVar.mo51557H(1400243992);
            C104682u0.m140312d(this.f157657d, hVar, 8);
            hVar.mo51565P();
        }
        return C13598b0.f38549a;
    }
}
