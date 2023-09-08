package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import fy3.C32226l;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import jj2.C98944a;
import p004b0.C103941f;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108504h;
import p175j0.C60690y0;
import p246u1.C111072h;
import p267x.C111940o;
import p435a0.C103166l0;
import p451b2.C104014i;
import p451b2.C104020o;
import p451b2.C104022q;
import p543h0.C107944f0;
import p544h2.C108014f;
import p544h2.C32659e;
import p721v0.C65503j;
import p735w1.C111703v;
import p735w1.C111705z;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.e */
public final class C106058e extends C87413o implements C32229r<C103941f, Integer, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ RepairerBackupDemoUI f315721d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106058e(RepairerBackupDemoUI repairerBackupDemoUI) {
        super(4);
        this.f315721d = repairerBackupDemoUI;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj2).intValue();
        C108504h hVar = (C108504h) obj3;
        int intValue2 = ((Number) obj4).intValue();
        C87412m.m108594g((C103941f) obj, "$this$items");
        if ((intValue2 & 112) == 0) {
            intValue2 |= hVar.mo51592j(intValue) ? 32 : 16;
        }
        if ((intValue2 & 721) != 144 || !hVar.mo51575a()) {
            ArrayList<C98944a> arrayList = this.f315721d.f315716f;
            C87412m.m108591d(arrayList);
            C98944a aVar = arrayList.get(intValue);
            C87412m.m108593f(aVar, "convList!!.get(it)");
            C98944a aVar2 = aVar;
            hVar.mo51557H(-492369756);
            Object q = hVar.mo51606q();
            int i = C108504h.f324828a;
            Object obj5 = C108504h.C60656a.f172772a;
            if (q == obj5) {
                q = C108500f2.m146996c(0, (C108497e2) null, 2, (Object) null);
                hVar.mo51553F(q);
            }
            hVar.mo51565P();
            C60690y0 y0Var = (C60690y0) q;
            hVar.mo51557H(-492369756);
            Object q2 = hVar.mo51606q();
            if (q2 == obj5) {
                q2 = C108500f2.m146996c(0L, (C108497e2) null, 2, (Object) null);
                hVar.mo51553F(q2);
            }
            hVar.mo51565P();
            C60690y0 y0Var2 = (C60690y0) q2;
            int i2 = C65503j.f188489K0;
            C107944f0.m146242c("name:" + aVar2.f290040a + " count:" + aVar2.f290043d + ", msgCount:" + ((Number) y0Var.getValue()).intValue() + ", constTime:" + ((Number) y0Var2.getValue()).longValue(), C111940o.m152651d(C103166l0.m136519c(C65503j.C65504a.f188490d, (float) 16), false, (String) null, (C111072h) null, new C94454d(this.f315721d, aVar2, y0Var2, y0Var), 7, (Object) null), 0, 0, (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, (C32659e) null, 0, 0, false, 0, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, hVar, 0, 0, 65532);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
